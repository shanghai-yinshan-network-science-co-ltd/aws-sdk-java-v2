/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package software.amazon.awssdk.core;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;
import software.amazon.awssdk.core.interceptor.ExecutionAttribute;
import software.amazon.awssdk.core.interceptor.ExecutionAttributes;
import software.amazon.awssdk.core.signer.Signer;
import software.amazon.awssdk.http.SdkHttpFullRequest;
import software.amazon.awssdk.metrics.MetricPublisher;
import software.amazon.awssdk.utils.ImmutableMap;

public class RequestOverrideConfigurationTest {
    private static final String HEADER = "header";
    private static final String QUERY_PARAM = "queryparam";

    @Test
    public void equalsHashcode() {
        EqualsVerifier.forClass(RequestOverrideConfiguration.class)
                      .usingGetClass()
                      .verify();
    }

    @Test
    public void toBuilder_minimal() {
        RequestOverrideConfiguration configuration = SdkRequestOverrideConfiguration.builder()
                                                                                    .build();

        assertThat(configuration.toBuilder().build()).usingRecursiveComparison().isEqualTo(configuration);
    }

    @Test
    public void toBuilder_maximal() {
        ExecutionAttribute testAttribute = new ExecutionAttribute("TestAttribute");
        String expectedValue = "Value1";

        RequestOverrideConfiguration configuration = SdkRequestOverrideConfiguration.builder()
                .putHeader(HEADER, "foo")
                .putRawQueryParameter(QUERY_PARAM, "foo")
                .addApiName(a -> a.name("test1").version("1"))
                .apiCallTimeout(Duration.ofSeconds(1))
                .apiCallAttemptTimeout(Duration.ofSeconds(1))
                .signer(new NoOpSigner())
                .executionAttributes(ExecutionAttributes.builder().put(testAttribute, expectedValue).build())
                .addMetricPublisher(mock(MetricPublisher.class))
                .build();

        assertThat(configuration.toBuilder().build()).usingRecursiveComparison().isEqualTo(configuration);
    }

    @Test
    public void addingSameItemTwice_shouldOverride() {
        RequestOverrideConfiguration configuration = SdkRequestOverrideConfiguration.builder()
                .putHeader(HEADER, "foo")
                .putHeader(HEADER, "bar")
                .putRawQueryParameter(QUERY_PARAM, "foo")
                .putRawQueryParameter(QUERY_PARAM, "bar")
                .addApiName(a -> a.name("test1").version("1"))
                .addApiName(a -> a.name("test2").version("2"))
                .build();

        assertThat(configuration.headers().get(HEADER)).containsExactly("bar");
        assertThat(configuration.rawQueryParameters().get(QUERY_PARAM)).containsExactly("bar");
        assertThat(configuration.apiNames().size()).isEqualTo(2);
    }

    @Test
    public void settingCollection_shouldOverrideAddItem() {
        ImmutableMap<String, List<String>> map =
                ImmutableMap.of(HEADER, Arrays.asList("hello", "world"));
        ImmutableMap<String, List<String>> queryMap =
                ImmutableMap.of(QUERY_PARAM, Arrays.asList("hello", "world"));
        RequestOverrideConfiguration configuration = SdkRequestOverrideConfiguration.builder()
                .putHeader(HEADER, "blah")
                .headers(map)
                .putRawQueryParameter(QUERY_PARAM, "blah")
                .rawQueryParameters(queryMap)
                .build();

        assertThat(configuration.headers().get(HEADER)).containsExactly("hello", "world");
        assertThat(configuration.rawQueryParameters().get(QUERY_PARAM)).containsExactly("hello", "world");
    }

    @Test
    public void addSameItemAfterSetCollection_shouldOverride() {
        ImmutableMap<String, List<String>> map =
                ImmutableMap.of(HEADER, Arrays.asList("hello", "world"));
        RequestOverrideConfiguration configuration = SdkRequestOverrideConfiguration.builder()
                .headers(map)
                .putHeader(HEADER, "blah")
                .build();

        assertThat(configuration.headers().get(HEADER)).containsExactly("blah");
    }


    @Test
    public void shouldGuaranteeImmutability() {
        List<String> headerValues = new ArrayList<>();
        headerValues.add("bar");
        Map<String, List<String>> headers = new HashMap<>();
        headers.put("foo", headerValues);

        SdkRequestOverrideConfiguration.Builder configurationBuilder =
                SdkRequestOverrideConfiguration.builder().headers(headers);

        headerValues.add("test");
        headers.put("new header", Collections.singletonList("new value"));

        assertThat(configurationBuilder.headers().size()).isEqualTo(1);
        assertThat(configurationBuilder.headers().get("foo")).containsExactly("bar");
    }

    @Test
    public void metricPublishers_createsCopy() {
        List<MetricPublisher> publishers = new ArrayList<>();
        publishers.add(mock(MetricPublisher.class));
        List<MetricPublisher> toModify = new ArrayList<>(publishers);

        SdkRequestOverrideConfiguration overrideConfig = SdkRequestOverrideConfiguration.builder()
                .metricPublishers(toModify)
                .build();

        toModify.clear();

        assertThat(overrideConfig.metricPublishers()).isEqualTo(publishers);
    }

    @Test
    public void addMetricPublisher_maintainsAllAdded() {
        List<MetricPublisher> publishers = new ArrayList<>();
        publishers.add(mock(MetricPublisher.class));
        publishers.add(mock(MetricPublisher.class));
        publishers.add(mock(MetricPublisher.class));

        SdkRequestOverrideConfiguration.Builder builder = SdkRequestOverrideConfiguration.builder();

        publishers.forEach(builder::addMetricPublisher);

        SdkRequestOverrideConfiguration overrideConfig = builder.build();

        assertThat(overrideConfig.metricPublishers()).isEqualTo(publishers);
    }

    @Test
    public void metricPublishers_overwritesPreviouslyAdded() {
        MetricPublisher firstAdded = mock(MetricPublisher.class);

        List<MetricPublisher> publishers = new ArrayList<>();

        publishers.add(mock(MetricPublisher.class));
        publishers.add(mock(MetricPublisher.class));

        SdkRequestOverrideConfiguration.Builder builder = SdkRequestOverrideConfiguration.builder();

        builder.addMetricPublisher(firstAdded);

        builder.metricPublishers(publishers);

        SdkRequestOverrideConfiguration overrideConfig = builder.build();

        assertThat(overrideConfig.metricPublishers()).isEqualTo(publishers);
    }

    @Test
    public void addMetricPublisher_listPreviouslyAdded_appendedToList() {
        List<MetricPublisher> publishers = new ArrayList<>();

        publishers.add(mock(MetricPublisher.class));
        publishers.add(mock(MetricPublisher.class));

        MetricPublisher thirdAdded = mock(MetricPublisher.class);

        SdkRequestOverrideConfiguration.Builder builder = SdkRequestOverrideConfiguration.builder();

        builder.metricPublishers(publishers);
        builder.addMetricPublisher(thirdAdded);

        SdkRequestOverrideConfiguration overrideConfig = builder.build();

        assertThat(overrideConfig.metricPublishers()).containsExactly(publishers.get(0), publishers.get(1), thirdAdded);
    }

    @Test
    public void executionAttributes_createsCopy() {
        ExecutionAttributes executionAttributes = new ExecutionAttributes();

        ExecutionAttribute testAttribute = new ExecutionAttribute("TestAttribute");
        String expectedValue = "Value1";
        executionAttributes.putAttribute(testAttribute, expectedValue);

        SdkRequestOverrideConfiguration overrideConfig = SdkRequestOverrideConfiguration.builder()
                .executionAttributes(executionAttributes)
                .build();

        executionAttributes.putAttribute(testAttribute, "Value2");

        assertThat(overrideConfig.executionAttributes().getAttribute(testAttribute)).isEqualTo(expectedValue);
    }

    @Test
    public void executionAttributes_isImmutable() {
        ExecutionAttributes executionAttributes = new ExecutionAttributes();
        ExecutionAttribute testAttribute = new ExecutionAttribute("TestAttribute");
        String expectedValue = "Value1";
        executionAttributes.putAttribute(testAttribute, expectedValue);

        SdkRequestOverrideConfiguration overrideConfig = SdkRequestOverrideConfiguration.builder()
                .executionAttributes(executionAttributes)
                .build();
        try {
            overrideConfig.executionAttributes().putAttribute(testAttribute, 2);
            fail("Expected unsupported operation exception");
        } catch(Exception ex) {
            assertThat(ex instanceof UnsupportedOperationException).isTrue();
        }

        try {
            overrideConfig.executionAttributes().putAttributeIfAbsent(testAttribute, 2);
            fail("Expected unsupported operation exception");
        } catch(Exception ex) {
            assertThat(ex instanceof UnsupportedOperationException).isTrue();
        }
    }

    @Test
    public void executionAttributes_maintainsAllAdded() {
        Map<ExecutionAttribute, Object> executionAttributeObjectMap = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            executionAttributeObjectMap.put(new ExecutionAttribute<>("Attribute" + i), mock(Object.class));
        }

        SdkRequestOverrideConfiguration.Builder builder = SdkRequestOverrideConfiguration.builder();

        for (Map.Entry<ExecutionAttribute, Object> attributeObjectEntry : executionAttributeObjectMap.entrySet()) {
            builder.putExecutionAttribute(attributeObjectEntry.getKey(), attributeObjectEntry.getValue());
        }

        SdkRequestOverrideConfiguration overrideConfig = builder.build();
        assertThat(overrideConfig.executionAttributes().getAttributes()).isEqualTo(executionAttributeObjectMap);
    }

    @Test
    public void executionAttributes_overwritesPreviouslyAdded() {
        ExecutionAttributes executionAttributes = new ExecutionAttributes();
        for (int i = 0; i < 5; i++) {
            executionAttributes.putAttribute(new ExecutionAttribute<>("Attribute" + i), mock(Object.class));
        }

        SdkRequestOverrideConfiguration.Builder builder = SdkRequestOverrideConfiguration.builder();

        builder.putExecutionAttribute(new ExecutionAttribute("AddedAttribute"), mock(Object.class));
        builder.executionAttributes(executionAttributes);
        SdkRequestOverrideConfiguration overrideConfig = builder.build();
        assertThat(overrideConfig.executionAttributes().getAttributes()).isEqualTo(executionAttributes.getAttributes());
    }

    @Test
    public void executionAttributes_listPreviouslyAdded_appendedToList() {
        ExecutionAttributes executionAttributes = new ExecutionAttributes();
        for (int i = 0; i < 5; i++) {
            executionAttributes.putAttribute(new ExecutionAttribute<>("Attribute" + i), mock(Object.class));
        }

        SdkRequestOverrideConfiguration.Builder builder = SdkRequestOverrideConfiguration.builder();

        builder.executionAttributes(executionAttributes);
        ExecutionAttribute addedAttribute = new ExecutionAttribute("AddedAttribute");
        Object addedValue = mock(Object.class);

        builder.putExecutionAttribute(addedAttribute, addedValue);

        SdkRequestOverrideConfiguration overrideConfig = builder.build();
        assertThat(overrideConfig.executionAttributes().getAttribute(addedAttribute)).isEqualTo(addedValue);
    }

    @Test
    public void testConfigurationEquals() {
        ExecutionAttributes executionAttributes = new ExecutionAttributes();
        for (int i = 0; i < 5; i++) {
            executionAttributes.putAttribute(new ExecutionAttribute<>("Attribute" + i), mock(Object.class));
        }

        SdkRequestOverrideConfiguration request1Override  = SdkRequestOverrideConfiguration.builder()
                .apiCallTimeout(Duration.ofMinutes(1))
                .executionAttributes(executionAttributes)
                .build();

        SdkRequestOverrideConfiguration request2Override  = SdkRequestOverrideConfiguration.builder()
                .apiCallTimeout(Duration.ofMinutes(1))
                .executionAttributes(executionAttributes)
                .build();

        assertThat(request1Override).isEqualTo(request1Override);
        assertThat(request1Override).isEqualTo(request2Override);
        assertThat(request1Override).isNotEqualTo(null);
    }

    private static class NoOpSigner implements Signer {

        @Override
        public SdkHttpFullRequest sign(SdkHttpFullRequest request, ExecutionAttributes executionAttributes) {
            return null;
        }
    }
}