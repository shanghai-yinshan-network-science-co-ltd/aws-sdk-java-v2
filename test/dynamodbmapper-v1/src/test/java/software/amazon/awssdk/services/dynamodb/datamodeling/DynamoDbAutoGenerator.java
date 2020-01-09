/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package software.amazon.awssdk.services.dynamodb.datamodeling;

import software.amazon.awssdk.annotations.SdkInternalApi;

/**
 * Generator interface for auto-generating attribute values.
 *
 * <p>Auto-generation may be controlled by {@link DynamoDbAutoGenerateStrategy},

 * <p>{@link DynamoDbAutoGenerateStrategy#CREATE}, instructs to generate when
 * creating the item. The mapper, determines an item is new, or overwriting,
 * if it's current value is {@code null}. There is a limitiation when performing
 * partial updates using either,
 * {@link DynamoDbMapperConfig.SaveBehavior#UPDATE_SKIP_NULL_ATTRIBUTES}, or
 * {@link DynamoDbMapperConfig.SaveBehavior#APPEND_SET}. A new value will only
 * be generated if the mapper is also generating the key.</p>
 *
 * <p>{@link DynamoDbAutoGenerateStrategy#ALWAYS}, instructs to always generate
 * a new value, applied on any save or batch write operation.</li>
 *
 * <p>May be used in combination with {@link DynamoDbAutoGenerated}.</p>
 *
 * @param <T> The object's field/property value type.
 *
 * @see DynamoDbAutoGenerated
 */
public interface DynamoDbAutoGenerator<T extends Object> {

    /**
     * Gets the auto-generate strategy.
     */
    DynamoDbAutoGenerateStrategy getGenerateStrategy();

    /**
     * Generates a new value given the current value (or null) if applicable.
     */
    T generate(T currentValue);

    /**
     * A generator which holds the {@link DynamoDbAutoGenerateStrategy}.
     */
    @SdkInternalApi
    abstract class AbstractGenerator<T> implements DynamoDbAutoGenerator<T> {
        private final DynamoDbAutoGenerateStrategy strategy;

        protected AbstractGenerator(DynamoDbAutoGenerateStrategy strategy) {
            this.strategy = strategy;
        }

        @Override
        public DynamoDbAutoGenerateStrategy getGenerateStrategy() {
            return this.strategy;
        }
    }

}
