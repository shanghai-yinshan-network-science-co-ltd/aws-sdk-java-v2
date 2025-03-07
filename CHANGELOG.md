# __2.17.100__ __2021-12-13__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Make `ProcessCredentialsProvider` closeable, so that the internal credentials cache (which may be async and need to be closed) can be closed.

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for Secrets Manager

## __Netty NIO HTTP Client__
  - ### Features
    - Add "ConcurrencyAcquireDuration" metric for netty-nio-client

# __2.17.99__ __2021-12-09__
## __AWS Network Firewall__
  - ### Features
    - This release adds support for managed rule groups.

## __AWS Route53 Recovery Control Config__
  - ### Features
    - This release adds tagging supports to Route53 Recovery Control Configuration. New APIs: TagResource, UntagResource and ListTagsForResource. Updates: add optional field `tags` to support tagging while calling CreateCluster, CreateControlPanel and CreateSafetyRule.

## __AWS Savings Plans__
  - ### Features
    - Adds the ability to specify Savings Plans hourly commitments using five digits after the decimal point.

## __AWS Server Migration Service__
  - ### Features
    - This release adds SMS discontinuation information to the API and CLI references.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds waiters support for internet gateways.

## __Amazon Lex Model Building V2__
  - ### Features
    - Added support for grammar slot type in Amazon Lex. You can author your own grammar in the XML format per the SRGS specification to collect information in a conversation.

## __Amazon Route 53 Domains__
  - ### Features
    - Amazon Route 53 domain registration APIs now support filtering and sorting in the ListDomains API, deleting a domain by using the DeleteDomain API and getting domain pricing information by using the ListPrices API.

# __2.17.98__ __2021-12-08__
## __AWS Comprehend Medical__
  - ### Features
    - This release adds a new set of APIs (synchronous and batch) to support the SNOMED-CT ontology.

## __AWS Health APIs and Notifications__
  - ### Features
    - Documentation updates for AWS Health

## __AWS IoT__
  - ### Features
    - This release allows customer to enable caching of custom authorizer on HTTP protocol for clients that use persistent or Keep-Alive connection in order to reduce the number of Lambda invocations.

## __AWS Outposts__
  - ### Features
    - This release adds the UpdateOutpost API.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Support__
  - ### Features
    - Documentation updates for AWS Support.

## __Amazon CloudWatch Logs__
  - ### Features
    - This release adds AWS Organizations support as condition key in destination policy for cross account Subscriptions in CloudWatch Logs.

## __Amazon Lookout for Vision__
  - ### Features
    - This release adds new APIs for packaging an Amazon Lookout for Vision model as an AWS IoT Greengrass component.

## __Amazon SageMaker Service__
  - ### Features
    - This release added a new Ambarella device(amba_cv2) compilation support for Sagemaker Neo.

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Ensure initial channel used for protocol detection is released before re-acquiring

# __2.17.97__ __2021-12-06__
## __AWS AppSync__
  - ### Features
    - AWS AppSync now supports custom domain names, allowing you to associate a domain name that you own with an AppSync API in your account.

## __Amazon Location Service__
  - ### Features
    - This release adds support for Accuracy position filtering, position metadata and autocomplete for addresses and points of interest based on partial or misspelled free-form text.

## __Amazon Route 53__
  - ### Features
    - Add PriorRequestNotComplete exception to UpdateHostedZoneComment API

## __Amazon S3__
  - ### Bugfixes
    - Fixed an issue that resulted in a NullPointerException when an invalid or global region was used on an S3 client. Fixes [#2885](https://github.com/aws/aws-sdk-java-v2/issues/2885).

## __URL Connection Http Client__
  - ### Features
    - Lower memory consumption for HTTP requests by enabling fixed-length streaming mode.
        - Contributed by: [@rtyley](https://github.com/rtyley)

## __Contributors__
Special thanks to the following contributors to this release: 

[@rtyley](https://github.com/rtyley)
# __2.17.96__ __2021-12-03__
## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix to set TokenBucket capacity correctly when requested amount greater than capacity

## __Amazon Rekognition__
  - ### Features
    - This release added new KnownGender types for Celebrity Recognition.

# __2.17.95__ __2021-12-02__
## __AWS Amplify UI Builder__
  - ### Features
    - This release introduces the actions and data types for the new Amplify UI Builder API. The Amplify UI Builder API provides a programmatic interface for creating and configuring user interface (UI) component libraries and themes for use in Amplify applications.

## __AWS Network Manager__
  - ### Features
    - This release adds API support for AWS Cloud WAN.

## __AWS Resource Access Manager__
  - ### Features
    - This release adds the ability to use the new ResourceRegionScope parameter on List operations that return lists of resources or resource types. This new parameter filters the results by letting you differentiate between global or regional resource types.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Complete the future returned by SdkPublisher.subscribe or filter exceptionally if the subscriber or predicate throws an exception.

# __2.17.94__ __2021-12-01__
## __AWS Direct Connect__
  - ### Features
    - Adds SiteLink support to private and transit virtual interfaces. SiteLink is a new Direct Connect feature that allows routing between Direct Connect points of presence.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Shield__
  - ### Features
    - This release adds API support for Automatic Application Layer DDoS Mitigation for AWS Shield Advanced. Customers can now enable automatic DDoS mitigation in count or block mode for layer 7 protected resources.

## __AWSKendraFrontendService__
  - ### Features
    - Experience Builder allows customers to build search applications without writing code. Analytics Dashboard provides quality and usability metrics for Kendra indexes. Custom Document Enrichment allows customers to build a custom ingestion pipeline to pre-process documents and generate metadata.

## __Amazon DevOps Guru__
  - ### Features
    - DevOps Guru now provides detailed, database-specific analyses of performance issues and recommends corrective actions for Amazon Aurora database instances with Performance Insights turned on. You can also use AWS tags to choose which resources to analyze and define your applications.

## __Amazon DynamoDB__
  - ### Features
    - Add support for Table Classes and introduce the Standard Infrequent Access table class.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for Amazon VPC IP Address Manager (IPAM), which enables you to plan, track, and monitor IP addresses for your workloads. This release also adds support for VPC Network Access Analyzer, which enables you to analyze network access to resources in your Virtual Private Clouds.

## __Amazon Lex Model Building V2__
  - ### Features
    - This release introduces a new feature, Automated Chatbot Designer, that helps customers automatically create a bot design from existing conversation transcripts. The feature uses machine learning to discover most common intents and the information needed to fulfill them.

## __Amazon SageMaker Runtime__
  - ### Features
    - Adding new exception types for InvokeEndpoint

## __Amazon SageMaker Service__
  - ### Features
    - This release enables - 1/ Inference endpoint configuration recommendations and ability to run custom load tests to meet performance needs. 2/ Deploy serverless inference endpoints. 3/ Query, filter and retrieve end-to-end ML lineage graph, and incorporate model quality/bias detection in ML workflow.

# __2.17.93__ __2021-11-30__
## __AWS Backup Gateway__
  - ### Features
    - Initial release of AWS Backup gateway which enables you to centralize and automate protection of on-premises VMware and VMware Cloud on AWS workloads using AWS Backup.

## __AWS Glue__
  - ### Features
    - Support for DataLake transactions

## __AWS IoT__
  - ### Features
    - Added the ability to enable/disable IoT Fleet Indexing for Device Defender and Named Shadow information, and search them through IoT Fleet Indexing APIs.

## __AWS IoT TwinMaker__
  - ### Features
    - AWS IoT TwinMaker makes it faster and easier to create, visualize and monitor digital twins of real-world systems like buildings, factories and industrial equipment to optimize operations. Learn more: https://docs.aws.amazon.com/iot-twinmaker/latest/apireference/Welcome.html (New Service) (Preview)

## __AWS Lake Formation__
  - ### Features
    - This release adds support for row and cell-based access control in Lake Formation. It also adds support for Lake Formation Governed Tables, which support ACID transactions and automatic storage optimizations.

## __AWS Outposts__
  - ### Features
    - This release adds the SupportedHardwareType parameter to CreateOutpost.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Storage Gateway__
  - ### Features
    - Added gateway type VTL_SNOW. Added new SNOWBALL HostEnvironment for gateways running on a Snowball device. Added new field HostEnvironmentId to serve as an identifier for the HostEnvironment on which the gateway is running.

## __Access Analyzer__
  - ### Features
    - AWS IAM Access Analyzer now supports policy validation for resource policies attached to S3 buckets and access points. You can run additional policy checks by specifying the S3 resource type you want to attach to your resource policy.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for Is4gen and Im4gn instances. This release also adds a new subnet attribute, enableLniAtDeviceIndex, to support local network interfaces, which are logical networking components that connect an EC2 instance to your on-premises network.

## __Amazon FSx__
  - ### Features
    - This release adds support for the FSx for OpenZFS file system type, FSx for Lustre file systems with the Persistent_2 deployment type, and FSx for Lustre file systems with Amazon S3 data repository associations and automatic export policies.

## __Amazon Import/Export Snowball__
  - ### Features
    - Tapeball is to integrate tape gateway onto snowball, it enables customer to transfer local data on the tape to snowball,and then ingest the data into tape gateway on the cloud.

## __Amazon Kinesis__
  - ### Features
    - Amazon Kinesis Data Streams now supports on demand streams.

## __Amazon Simple Storage Service__
  - ### Features
    - Introduce Amazon S3 Glacier Instant Retrieval storage class and a new setting in S3 Object Ownership to disable ACLs for bucket and the objects in it.

## __Amazon WorkSpaces Web__
  - ### Features
    - This is the initial SDK release for Amazon WorkSpaces Web. Amazon WorkSpaces Web is a low-cost, fully managed WorkSpace built to deliver secure web-based workloads and software-as-a-service (SaaS) application access to users within existing web browsers.

## __Managed Streaming for Kafka__
  - ### Features
    - This release adds three new V2 APIs. CreateClusterV2 for creating both provisioned and serverless clusters. DescribeClusterV2 for getting information about provisioned and serverless clusters and ListClustersV2 for listing all clusters (both provisioned and serverless) in your account.

## __Redshift Data API Service__
  - ### Features
    - Data API now supports serverless queries.

# __2.17.92__ __2021-11-29__
## __AWS Compute Optimizer__
  - ### Features
    - Adds support for the enhanced infrastructure metrics paid feature. Also adds support for two new sets of resource efficiency metrics, including savings opportunity metrics and performance improvement opportunity metrics.

## __AWS Data Exchange__
  - ### Features
    - This release enables providers and subscribers to use Data Set, Job, and Asset operations to work with API assets from Amazon API Gateway. In addition, this release enables subscribers to use the SendApiAsset operation to invoke a provider's Amazon API Gateway API that they are entitled to.

## __AWS IoT SiteWise__
  - ### Features
    - AWS IoT SiteWise now supports retention configuration for the hot tier storage.

## __AWS Well-Architected Tool__
  - ### Features
    - This update provides support for Well-Architected API users to use custom lens features.

## __Amazon CloudWatch Evidently__
  - ### Features
    - Introducing Amazon CloudWatch Evidently. This is the first public release of Amazon CloudWatch Evidently.

## __Amazon EC2 Container Registry__
  - ### Features
    - This release adds supports for pull through cache rules and enhanced scanning.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for G5g and M6a instances. This release also adds support for Amazon EBS Snapshots Archive, a feature that enables you to archive your EBS snapshots; and Recycle Bin, a feature that enables you to protect your EBS snapshots against accidental deletion.

## __Amazon Recycle Bin__
  - ### Features
    - This release adds support for Recycle Bin.

## __Amazon Simple Storage Service__
  - ### Features
    - Amazon S3 Event Notifications adds Amazon EventBridge as a destination and supports additional event types. The PutBucketNotificationConfiguration API can now skip validation of Amazon SQS, Amazon SNS and AWS Lambda destinations.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Added two new attributes to DescribeInstanceInformation called SourceId and SourceType along with new string filters SourceIds and SourceTypes to filter instance records.

## __CloudWatch RUM__
  - ### Features
    - This is the first public release of CloudWatch RUM

## __Inspector2__
  - ### Features
    - This release adds support for the new Amazon Inspector API. The new Amazon Inspector can automatically discover and scan Amazon EC2 instances and Amazon ECR container images for software vulnerabilities and unintended network exposure, and report centralized findings across multiple AWS accounts.

# __2.17.91__ __2021-11-28__
## __AWS Migration Hub Refactor Spaces__
  - ### Features
    - This is the initial SDK release for AWS Migration Hub Refactor Spaces

## __Amazon Personalize__
  - ### Features
    - This release adds API support for Recommenders and BatchSegmentJobs.

## __Amazon Personalize Runtime__
  - ### Features
    - This release adds inference support for Recommenders.

## __Amazon Textract__
  - ### Features
    - This release adds support for synchronously analyzing identity documents through a new API: AnalyzeID

# __2.17.90__ __2021-11-26__
## __AWS IoT Core Device Advisor__
  - ### Features
    - Documentation update for Device Advisor GetEndpoint API

## __AWS Outposts__
  - ### Features
    - This release adds new APIs for working with Outpost sites and orders.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for EC2.

## __Amazon Pinpoint__
  - ### Features
    - Added a One-Time Password (OTP) management feature. You can use the Amazon Pinpoint API to generate OTP codes and send them to your users as SMS messages. Your apps can then call the API to verify the OTP codes that your users input

## __Application Migration Service__
  - ### Features
    - Application Migration Service now supports an additional replication method that does not require agent installation on each source server. This option is available for source servers running on VMware vCenter versions 6.7 and 7.0.

## __Auto Scaling__
  - ### Features
    - Documentation updates for Amazon EC2 Auto Scaling.

# __2.17.89__ __2021-11-24__
## __AWS IoT SiteWise__
  - ### Features
    - AWS IoT SiteWise now accepts data streams that aren't associated with any asset properties. You can organize data by updating data stream associations.

## __AWS Lambda__
  - ### Features
    - Remove Lambda function url apis

## __AWS Proton__
  - ### Features
    - This release adds APIs for getting the outputs and provisioned stacks for Environments, Pipelines, and ServiceInstances. You can now add tags to EnvironmentAccountConnections. It also adds APIs for working with PR-based provisioning. Also, it adds APIs for syncing templates with a git repository.

## __Amazon Connect Customer Profiles__
  - ### Features
    - This release introduces a new auto-merging feature for profile matching. The auto-merging configurations can be set via CreateDomain API or UpdateDomain API. You can use GetIdentityResolutionJob API and ListIdentityResolutionJobs API to fetch job status.

## __Amazon ElastiCache__
  - ### Features
    - Doc only update for ElastiCache

## __Amazon Timestream Query__
  - ### Features
    - Releasing Amazon Timestream Scheduled Queries. It makes real-time analytics more performant and cost-effective for customers by calculating and storing frequently accessed aggregates, and other computations, typically used in operational dashboards, business reports, and other analytics applications

## __Amazon Timestream Write__
  - ### Features
    - This release adds support for multi-measure records and magnetic store writes. Multi-measure records allow customers to store multiple measures in a single table row. Magnetic store writes enable customers to write late arrival data (data with timestamp in the past) directly into the magnetic store.

## __Amazon Translate__
  - ### Features
    - This release enables customers to use translation settings to mask profane words and phrases in their translation output.

## __Auto Scaling__
  - ### Features
    - Customers can now configure predictive scaling policies to proactively scale EC2 Auto Scaling groups based on any CloudWatch metrics that more accurately represent the load on the group than the four predefined metrics. They can also use math expressions to further customize the metrics.

## __EC2 Image Builder__
  - ### Features
    - This release adds support for sharing AMIs with Organizations within an EC2 Image Builder Distribution Configuration.

# __2.17.88__ __2021-11-23__
## __AWS Backup__
  - ### Features
    - This release adds new opt-in settings for advanced features for DynamoDB backups

## __AWS IoT__
  - ### Features
    - This release introduces a new feature, Managed Job Template, for AWS IoT Jobs Service. Customers can now use service provided managed job templates to easily create jobs for supported standard job actions.

## __AWS IoT Core Device Advisor__
  - ### Features
    - This release introduces a new feature for Device Advisor: ability to execute multiple test suites in parallel for given customer account. You can use GetEndpoint API to get the device-level test endpoint and call StartSuiteRun with "parallelRun=true" to run suites in parallel.

## __AWS IoT Wireless__
  - ### Features
    - Two new APIs, GetNetworkAnalyzerConfiguration and UpdateNetworkAnalyzerConfiguration, are added for the newly released Network Analyzer feature which enables customers to view real-time frame information and logs from LoRaWAN devices and gateways.

## __AWS Lambda__
  - ### Features
    - Release Lambda event source filtering for SQS, Kinesis Streams, and DynamoDB Streams.

## __AWS Security Token Service__
  - ### Features
    - Documentation updates for AWS Security Token Service.

## __Amazon DynamoDB__
  - ### Features
    - DynamoDB PartiQL now supports ReturnConsumedCapacity, which returns capacity units consumed by PartiQL APIs if the request specified returnConsumedCapacity parameter. PartiQL APIs include ExecuteStatement, BatchExecuteStatement, and ExecuteTransaction.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation update for ARM support on Amazon ECS.

## __Amazon ElastiCache__
  - ### Features
    - Adding support for r6gd instances for Redis with data tiering. In a cluster with data tiering enabled, when available memory capacity is exhausted, the least recently used data is automatically tiered to solid state drives for cost-effective capacity scaling with minimal performance impact.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds a new parameter ipv6Native to the allow creation of IPv6-only subnets using the CreateSubnet operation, and the operation ModifySubnetAttribute includes new parameters to modify subnet attributes to use resource-based naming and enable DNS resolutions for Private DNS name.

## __Amazon Macie 2__
  - ### Features
    - Documentation updates for Amazon Macie

## __Amazon OpenSearch Service__
  - ### Features
    - This release adds an optional parameter dry-run for the UpdateDomainConfig API to perform basic validation checks, and detect the deployment type that will be required for the configuration change, without actually applying the change.

## __Amazon Redshift__
  - ### Features
    - This release adds support for reserved node exchange with restore/resize

## __Amazon Relational Database Service__
  - ### Features
    - Adds support for Multi-AZ DB clusters for RDS for MySQL and RDS for PostgreSQL.

## __Amazon Simple Queue Service__
  - ### Features
    - Amazon SQS adds a new queue attribute, SqsManagedSseEnabled, which enables server-side queue encryption using SQS owned encryption keys.

## __Amazon Simple Storage Service__
  - ### Features
    - Introduce two new Filters to S3 Lifecycle configurations - ObjectSizeGreaterThan and ObjectSizeLessThan. Introduce a new way to trigger actions on noncurrent versions by providing the number of newer noncurrent versions along with noncurrent days.

## __Amazon WorkSpaces__
  - ### Features
    - Documentation updates for Amazon WorkSpaces

## __Elastic Load Balancing__
  - ### Features
    - This release allows you to create internal Application and Network Load Balancers in dualstack mode. This release also adds an attribute to block internet gateway (IGW) access to the load balancer, preventing unintended access to your internal load balancers through an internet gateway.

## __FinSpace Public API__
  - ### Features
    - Update documentation for createChangeset API.

# __2.17.87__ __2021-11-22__
## __AWS CloudFormation__
  - ### Features
    - This release include SDK changes for the feature launch of Stack Import to Service Managed StackSet.

## __AWS Database Migration Service__
  - ### Features
    - Added new S3 endpoint settings to allow to convert the current UTC time into a specified time zone when a date partition folder is created. Using with 'DatePartitionedEnabled'.

## __AWS S3 Control__
  - ### Features
    - Added Amazon CloudWatch publishing option for S3 Storage Lens metrics.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Adds all fields in RequestOverrideConfiguration when a builder is created from an instance

## __Amazon Chime SDK Meetings__
  - ### Features
    - Added new APIs for enabling Echo Reduction with Voice Focus.

## __Amazon Connect Service__
  - ### Features
    - This release adds support for UpdateContactFlowMetadata, DeleteContactFlow and module APIs. For details, see the Release Notes in the Amazon Connect Administrator Guide.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adding missing exceptions to RegisterCluster operation

## __Amazon Elasticsearch Service__
  - ### Features
    - This release adds an optional parameter dry-run for the UpdateElasticsearchDomainConfig API to perform basic validation checks, and detect the deployment type that will be required for the configuration change, without actually applying the change.

## __Amazon QuickSight__
  - ### Features
    - Add support for Exasol data source, 1 click enterprise embedding and email customization.

## __Amazon Relational Database Service__
  - ### Features
    - Adds local backup support to Amazon RDS on AWS Outposts.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Adds new parameter to CreateActivation API . This parameter is for "internal use only".

## __Amazon Transcribe Streaming Service__
  - ### Features
    - This release adds language identification support for streaming transcription.

## __Braket__
  - ### Features
    - This release adds support for Amazon Braket Hybrid Jobs.

## __FinSpace Public API__
  - ### Features
    - Add new APIs for managing Datasets, Changesets, and Dataviews.

# __2.17.86__ __2021-11-19__
## __AWS Batch__
  - ### Features
    - Documentation updates for AWS Batch.

## __AWS CloudFormation__
  - ### Features
    - The StackSets ManagedExecution feature will allow concurrency for non-conflicting StackSet operations and queuing the StackSet operations that conflict at a given time for later execution.

## __AWS Elemental MediaLive__
  - ### Features
    - This release adds support for specifying a SCTE-35 PID on input. MediaLive now supports SCTE-35 PID selection on inputs containing one or more active SCTE-35 PIDs.

## __AWS Lambda__
  - ### Features
    - Add support for Lambda Function URLs. Customers can use Function URLs to create built-in HTTPS endpoints on their functions.

## __Amazon AppStream__
  - ### Features
    - Includes APIs for managing resources for Elastic fleets: applications, app blocks, and application-fleet associations.

## __Amazon CloudWatch Application Insights__
  - ### Features
    - Application Insights now supports monitoring for HANA

## __Amazon Lex Runtime V2__
  - ### Features
    - Now supports styled slots in Lex V2 runtime. Customers can provide inputs like "a as in apple b for beta" which will be resolved to "ab" as slot value.

## __Amazon Redshift__
  - ### Features
    - Added support of default IAM role for CreateCluster, RestoreFromClusterSnapshot and ModifyClusterIamRoles APIs

## __DynamoDB Enhanced Client__
  - ### Features
    - Adds operation type labels to each operation and propagates to the extension write context

# __2.17.85__ __2021-11-18__
## __AWS Audit Manager__
  - ### Features
    - This release introduces a new feature for Audit Manager: Dashboard views. You can now view insights data for your active assessments, and quickly identify non-compliant evidence that needs to be remediated.

## __AWS Glue DataBrew__
  - ### Features
    - This SDK release adds the following new features: 1) PII detection in profile jobs, 2) Data quality rules, enabling validation of data quality in profile jobs, 3) SQL query-based datasets for Amazon Redshift and Snowflake data sources, and 4) Connecting DataBrew datasets with Amazon AppFlow flows.

## __AWS Lambda__
  - ### Features
    - Added support for CLIENT_CERTIFICATE_TLS_AUTH and SERVER_ROOT_CA_CERTIFICATE as SourceAccessType for MSK and Kafka event source mappings.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon AppConfig__
  - ### Features
    - Add Type to support feature flag configuration profiles

## __Amazon Chime__
  - ### Features
    - Adds new Transcribe API parameters to StartMeetingTranscription, including support for content identification and redaction (PII & PHI), partial results stabilization, and custom language models.

## __Amazon Chime SDK Meetings__
  - ### Features
    - Adds new Transcribe API parameters to StartMeetingTranscription, including support for content identification and redaction (PII & PHI), partial results stabilization, and custom language models.

## __Amazon CloudWatch__
  - ### Features
    - CloudWatch Anomaly Detection now supports anomaly detectors that use metric math as input.

## __Amazon Forecast Service__
  - ### Features
    - NEW CreateExplanability API that helps you understand how attributes such as price, promotion, etc. contributes to your forecasted values; NEW CreateAutoPredictor API that trains up to 40% more accurate forecasting model, saves up to 50% of retraining time, and provides model level explainability.

## __Amazon Interactive Video Service__
  - ### Features
    - Add APIs for retrieving stream session information and support for filtering live streams by health. For more information, see https://docs.aws.amazon.com/ivs/latest/userguide/stream-health.html

## __Amazon Lex Model Building V2__
  - ### Features
    - Added support for Polly Neural TTS (NTTS) voices. Customers can choose between 'standard' and 'neural' for Polly Engine configuration per locale when creating or updating an Amazon Lex bot.

## __Managed Streaming for Kafka__
  - ### Features
    - Amazon MSK has added a new API that allows you to update the connectivity settings for an existing cluster to enable public accessibility.

## __Redshift Data API Service__
  - ### Features
    - Rolling back Data API serverless features until dependencies are live.

# __2.17.84__ __2021-11-17__
## __AWS AppConfig Data__
  - ### Features
    - AWS AppConfig Data is a new service that allows you to retrieve configuration deployed by AWS AppConfig. See the AppConfig user guide for more details on getting started. https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon API Gateway__
  - ### Features
    - Documentation updates for Amazon API Gateway.

## __Amazon DevOps Guru__
  - ### Features
    - Add paginator for DescribeResourceCollectionHealth

## __Amazon Simple Notification Service__
  - ### Features
    - Amazon SNS introduces the PublishBatch API, which enables customers to publish up to 10 messages per API request. The new API is valid for Standard and FIFO topics.

## __AmplifyBackend__
  - ### Features
    - New APIs to support the Amplify Storage category. Add and manage file storage in your Amplify app backend.

## __Elastic Disaster Recovery Service__
  - ### Features
    - Introducing AWS Elastic Disaster Recovery (AWS DRS), a new service that minimizes downtime and data loss with fast, reliable recovery of on-premises and cloud-based applications using affordable storage, minimal compute, and point-in-time recovery.

## __Redshift Data API Service__
  - ### Features
    - Data API now supports serverless requests.

# __2.17.83__ __2021-11-16__
## __AWS CloudTrail__
  - ### Features
    - CloudTrail Insights now supports ApiErrorRateInsight, which enables customers to identify unusual activity in their AWS account based on API error codes and their rate.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Location Service__
  - ### Features
    - This release adds the support for Relevance, Distance, Time Zone, Language and Interpolated Address for Geocoding and Reverse Geocoding.

## __DynamoDB Enhanced Client__
  - ### Features
    - Implement `DescribeTable` operation in `DynamoDbTable` and `DynamoDbAsyncTable`

# __2.17.82__ __2021-11-15__
## __AWS Database Migration Service__
  - ### Features
    - Add Settings in JSON format for the source GCP MySQL endpoint

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.
    - Use System Property Proxy Settings for Netty and AWS Common Runtime (CRT) HTTP Clients. See [#2321](https://github.com/aws/aws-sdk-java-v2/issues/2321), [#1793](https://github.com/aws/aws-sdk-java-v2/issues/1793)
        - Contributed by: [@erin889](https://github.com/erin889)

  - ### Bugfixes
    - Update the REST-JSON marshalling logic to conform to the standard expected behavior WRT to the `Content-Type` of the request.

## __AWS Transfer Family__
  - ### Features
    - AWS Transfer Family now supports integrating a custom identity provider using AWS Lambda

## __AWS WAFV2__
  - ### Features
    - Your options for logging web ACL traffic now include Amazon CloudWatch Logs log groups and Amazon S3 buckets.

## __Amazon AppStream__
  - ### Features
    - This release includes support for images of AmazonLinux2 platform type.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds a new VPC Subnet attribute "EnableDns64." When enabled on IPv6 Subnets, the Amazon-Provided DNS Resolver returns synthetic IPv6 addresses for IPv4-only destinations.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adding Tags support to Cluster Registrations.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Adds support for Session Reason and Max Session Duration for Systems Manager Session Manager.

## __Migration Hub Strategy Recommendations__
  - ### Features
    - AWS SDK for Migration Hub Strategy Recommendations. It includes APIs to start the portfolio assessment, import portfolio data for assessment, and to retrieve recommendations. For more information, see the AWS Migration Hub documentation at https://docs.aws.amazon.com/migrationhub/index.html

## __Contributors__
Special thanks to the following contributors to this release: 

[@erin889](https://github.com/erin889)
# __2.17.81__ __2021-11-12__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added automatic modes for GOP configuration and added the ability to ingest screen recordings generated by Safari on MacOS 12 Monterey.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Connect Service__
  - ### Features
    - This release adds APIs for creating and managing scheduled tasks. Additionally, adds APIs to describe and update a contact and list associated references.

## __Amazon DevOps Guru__
  - ### Features
    - Add support for cross account APIs.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - C6i instances are powered by a third-generation Intel Xeon Scalable processor (Ice Lake) delivering all-core turbo frequency of 3.5 GHz. G5 instances feature up to 8 NVIDIA A10G Tensor Core GPUs and second generation AMD EPYC processors.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This Patch Manager release supports creating Patch Baselines for RaspberryPi OS (formerly Raspbian)

# __2.17.80__ __2021-11-11__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon DynamoDB__
  - ### Features
    - Updated Help section for "dynamodb update-contributor-insights" API

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release provides an additional route target for the VPC route table.

## __Amazon Translate__
  - ### Features
    - This release enables customers to import Multi-Directional Custom Terminology and use Multi-Directional Custom Terminology in both real-time translation and asynchronous batch translation.

# __2.17.79__ __2021-11-10__
## __AWS Backup__
  - ### Features
    - AWS Backup SDK provides new options when scheduling backups: select supported services and resources that are assigned to a particular tag, linked to a combination of tags, or can be identified by a partial tag value, and exclude resources from their assignments.

## __AWS Resilience Hub__
  - ### Features
    - Initial release of AWS Resilience Hub, a managed service that enables you to define, validate, and track the resilience of your applications on AWS

## __AWS SDK for Java__
  - ### Features
    - Added a new `dualstackEnabled` property to every client builder, which can be used to make calls be invoked against AWS endpoints which return IPv6 records. This can also be enabled via the `AWS_USE_DUALSTACK_ENDPOINT` environment variable, `aws.useDualstackEndpoint` system property, or the `use_dualstack_endpoint` profile file property.

## __AWS SDK for Java v2__
  - ### Features
    - Added a new `fipsEnabled` property to every client builder, which can be used to make calls be invoked against AWS endpoints which are FIPS compliant. This can also be enabled via the `AWS_USE_FIPS_ENDPOINT` environment variable, `aws.useFipsEndpoint` system property, or the `use_fips_endpoint` profile file property.

## __Amazon EC2 Container Service__
  - ### Features
    - This release adds support for container instance health.

## __Amazon S3__
  - ### Deprecations
    - Deprecated `S3Configuration.Builder`'s `dualstackEnabled` in favor of the new service-standard `S3ClientBuilder.dualstackEnabled`.

## __Amazon S3 Control__
  - ### Deprecations
    - Deprecated `S3ControlConfiguration.Builder`'s `dualstackEnabled` in favor of the new service-standard `S3ControlClientBuilder.dualstackEnabled`.
    - Deprecated `S3ControlConfiguration.Builder`'s `fipsModeEnabled` in favor of the new service-standard `S3ControlClientBuilder.fipsEnabled`.

## __Apache HTTP Client__
  - ### Features
    - Add DNS resolver override support for Apache HTTP Client

# __2.17.78__ __2021-11-09__
## __AWS Batch__
  - ### Features
    - Adds support for scheduling policy APIs.

## __AWS Health APIs and Notifications__
  - ### Features
    - Documentation updates for AWS Health.

## __AWS IoT Greengrass V2__
  - ### Features
    - This release adds support for Greengrass core devices running Windows. You can now specify name of a Windows user to run a component.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

# __2.17.77__ __2021-11-08__
## __AWS WAFV2__
  - ### Features
    - You can now configure rules to run a CAPTCHA check against web requests and, as needed, send a CAPTCHA challenge to the client.

## __Amazon Chime SDK Meetings__
  - ### Features
    - Updated format validation for ids and regions.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds internal validation on the GatewayAssociationState field

## __Amazon S3__
  - ### Features
    - [Breaking Changes] Refactor S3TransferManager (PREVIEW) to support non-file-based transfers. This release refactors the S3TransferManager interface hierarchy and client API to differentiate between file-based and non-file-based transfers, allowing arbitrary object transfers. As a result, some S3TransferManager method signatures have changed in a backwards-incompatible way. Most notably, `Upload upload(UploadRequest)` becomes `FileUpload uploadFile(UploadFileRequest)`, and likewise for download variants. Please see https://github.com/aws/aws-sdk-java-v2/pull/2817 for a full list of changes.

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker CreateEndpoint and UpdateEndpoint APIs now support additional deployment configuration to manage traffic shifting options and automatic rollback monitoring. DescribeEndpoint now shows new in-progress deployment details with stage status.

# __2.17.76__ __2021-11-05__
## __AWS Resource Groups Tagging API__
  - ### Features
    - Documentation updates and improvements.

## __AWS SDK for Java v2__
  - ### Features
    - Added the profile key `duration_seconds` to class `ProfileProperty`
        - Contributed by: [@abrooksv](https://github.com/abrooksv)

## __Amazon Elastic Compute Cloud__
  - ### Features
    - DescribeInstances now returns customer-owned IP addresses for instances running on an AWS Outpost.

## __Amazon Translate__
  - ### Features
    - This release enable customers to use their own KMS keys to encrypt output files when they submit a batch transform job.

## __Contributors__
Special thanks to the following contributors to this release: 

[@abrooksv](https://github.com/abrooksv)
# __2.17.75__ __2021-11-04__
## __AWS IoT Wireless__
  - ### Features
    - Adding APIs for the FUOTA (firmware update over the air) and multicast for LoRaWAN devices and APIs to support event notification opt-in feature for Sidewalk related events. A few existing APIs need to be modified for this new feature.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Chime SDK Meetings__
  - ### Features
    - The Amazon Chime SDK Meetings APIs allow software developers to create meetings and attendees for interactive audio, video, screen and content sharing in custom meeting applications which use the Amazon Chime SDK.

## __Amazon Connect Service__
  - ### Features
    - This release adds CRUD operation support for Security profile resource in Amazon Connect

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds a new instance replacement strategy for EC2 Fleet, Spot Fleet. Now you can select an action to perform when your instance gets a rebalance notification. EC2 Fleet, Spot Fleet can launch a replacement then terminate the instance that received notification after a termination delay

## __Amazon SageMaker Service__
  - ### Features
    - ListDevices and DescribeDevice now show Edge Manager agent version.

# __2.17.74__ __2021-11-03__
## __AWS DataSync__
  - ### Features
    - AWS DataSync now supports Hadoop Distributed File System (HDFS) Locations

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Connect Participant Service__
  - ### Features
    - This release adds a new boolean attribute - Connect Participant - to the CreateParticipantConnection API, which can be used to mark the participant as connected.

## __Amazon Macie 2__
  - ### Features
    - This release adds support for specifying the severity of findings that a custom data identifier produces, based on the number of occurrences of text that matches the detection criteria.

## __FinSpace User Environment Management service__
  - ### Features
    - Adds superuser and data-bundle parameters to CreateEnvironment API

# __2.17.73__ __2021-11-02__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon CloudFront__
  - ### Features
    - CloudFront now supports response headers policies to add HTTP headers to the responses that CloudFront sends to viewers. You can use these policies to add CORS headers, control browser caching, and more, without modifying your origin or writing any code.

## __Amazon Connect Service__
  - ### Features
    - Amazon Connect Chat now supports real-time message streaming.

## __AmazonNimbleStudio__
  - ### Features
    - Amazon Nimble Studio adds support for users to stop and start streaming sessions.

## __Netty NIO HTTP Client__
  - ### Features
    - Allow users to configure tlsNegotiationTimeout on NettyNioAsyncHttpClient

# __2.17.72__ __2021-11-01__
## __AWS Network Manager__
  - ### Features
    - This release adds API support to aggregate resources, routes, and telemetry data across a Global Network.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Lightsail__
  - ### Features
    - This release adds support to enable access logging for buckets in the Lightsail object storage service.

## __Amazon Neptune__
  - ### Features
    - Adds support for major version upgrades to ModifyDbCluster API

## __Amazon Rekognition__
  - ### Features
    - This Amazon Rekognition Custom Labels release introduces the management of datasets with projects

# __2.17.71__ __2021-10-29__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon CloudWatch Application Insights__
  - ### Features
    - Added Monitoring support for SQL Server Failover Cluster Instance. Additionally, added a new API to allow one-click monitoring of containers resources.

## __Amazon Connect Service__
  - ### Features
    - Amazon Connect Chat now supports real-time message streaming.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Support added for AMI sharing with organizations and organizational units in ModifyImageAttribute API

## __Amazon Rekognition__
  - ### Features
    - This release added new attributes to Rekognition Video GetCelebrityRecognition API operations.

## __Amazon Transcribe Service__
  - ### Features
    - Transcribe and Transcribe Call Analytics now support automatic language identification along with custom vocabulary, vocabulary filter, custom language model and PII redaction.

## __S3TransferManager__
  - ### Bugfixes
    - Fix potentially flaky S3TransferManagerListenerTests

# __2.17.70__ __2021-10-28__
## __AWS Systems Manager Incident Manager__
  - ### Features
    - Updating documentation, adding new field to ConflictException to indicate earliest retry timestamp for some operations, increase maximum length of nextToken fields

## __Amazon Connect Participant Service__
  - ### Features
    - This release adds a new boolean attribute - Connect Participant - to the CreateParticipantConnection API, which can be used to mark the participant as connected.

## __Amazon EC2 Container Service__
  - ### Features
    - Amazon ECS now supports running Fargate tasks on Windows Operating Systems Families which includes Windows Server 2019 Core and Windows Server 2019 Full.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added new read-only DenyAllIGWTraffic network interface attribute. Added support for DL1 24xlarge instances powered by Habana Gaudi Accelerators for deep learning model training workloads

## __Amazon GameLift__
  - ### Features
    - Added support for Arm-based AWS Graviton2 instances, such as M6g, C6g, and R6g.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds support for RStudio on SageMaker.

# __2.17.69__ __2021-10-27__
## __AWS DynamoDB Enhanced Client__
  - ### Features
    - Added support for @DynamoDBAutoGeneratedTimestamp that can be used for auto updated the last updated timestamp for a record.

## __AWS SDK for Java v2__
  - ### Features
    - Provide an error message if a AsyncRequestBody.fromFile source file changes length or update time while the SDK is reading from the file.
    - Updated service endpoint metadata.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds: attribute-based instance type selection for EC2 Fleet, Spot Fleet, a feature that lets customers express instance requirements as attributes like vCPU, memory, and storage; and Spot placement score, a feature that helps customers identify an optimal location to run Spot workloads.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - EKS managed node groups now support BOTTLEROCKET_x86_64 and BOTTLEROCKET_ARM_64 AMI types.

## __Amazon SageMaker Service__
  - ### Features
    - This release allows customers to describe one or more versioned model packages through BatchDescribeModelPackage, update project via UpdateProject, modify and read customer metadata properties using Create, Update and Describe ModelPackage and enables cross account registration of model packages.

## __Amazon Textract__
  - ### Features
    - This release adds support for asynchronously analyzing invoice and receipt documents through two new APIs: StartExpenseAnalysis and GetExpenseAnalysis

## __Auto Scaling__
  - ### Features
    - This release adds support for attribute-based instance type selection, a new EC2 Auto Scaling feature that lets customers express their instance requirements as a set of attributes, such as vCPU, memory, and storage.

# __2.17.68__ __2021-10-26__
## __Amazon Chime SDK Identity__
  - ### Features
    - The Amazon Chime SDK now supports push notifications through Amazon Pinpoint

## __Amazon Chime SDK Messaging__
  - ### Features
    - The Amazon Chime SDK now supports push notifications through Amazon Pinpoint

## __Amazon EMR Containers__
  - ### Features
    - This feature enables auto-generation of certificate to secure the managed-endpoint and removes the need for customer provided certificate-arn during managed-endpoint setup.

## __Amazon S3__
  - ### Bugfixes
    - Raise an exception instead of hanging when a put-object content-length exceeds the data written by the async request body.
    - Truncate the async request body when the content-length is shorter than the request body, instead of raising a "Data read has a different checksum" exception.

# __2.17.67__ __2021-10-25__
## __AWS Audit Manager__
  - ### Features
    - This release introduces a new feature for Audit Manager: Custom framework sharing. You can now share your custom frameworks with another AWS account, or replicate them into another AWS Region under your own account.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support to create a VPN Connection that is not attached to a Gateway at the time of creation. Use this to create VPNs associated with Core Networks, or modify your VPN and attach a gateway using the modify API after creation.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for Amazon RDS Custom, which is a new RDS management type that gives you full access to your database and operating system. For more information, see https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-custom.html

## __Amazon Route 53 Resolver__
  - ### Features
    - New API for ResolverConfig, which allows autodefined rules for reverse DNS resolution to be disabled for a VPC

# __2.17.66__ __2021-10-22__
## __AWS Audit Manager__
  - ### Features
    - This release introduces character restrictions for ControlSet names. We updated regex patterns for the following attributes: ControlSet, CreateAssessmentFrameworkControlSet, and UpdateAssessmentFrameworkControlSet.

## __Amazon Chime__
  - ### Features
    - Chime VoiceConnector and VoiceConnectorGroup APIs will now return an ARN.

## __Amazon QuickSight__
  - ### Features
    - Added QSearchBar option for GenerateEmbedUrlForRegisteredUser ExperienceConfiguration to support Q search bar embedding

## __S3TransferManager__
  - ### Features
    - Add support for S3TransferManager TransferListeners

# __2.17.65__ __2021-10-21__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Update the REST-JSON marshalling logic to conform to the standard expected behavior WRT to the `Content-Type` of the request.

## __Amazon Connect Service__
  - ### Features
    - Released Amazon Connect hours of operation API for general availability (GA). This API also supports AWS CloudFormation. For more information, see Amazon Connect Resource Type Reference in the AWS CloudFormation User Guide.

# __2.17.64__ __2021-10-20__
## __AWS Direct Connect__
  - ### Features
    - This release adds 4 new APIS, which needs to be public able

## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for specifying caption time delta in milliseconds and the ability to apply color range legalization to source content other than AVC video.

## __AWS Elemental MediaPackage__
  - ### Features
    - When enabled, MediaPackage passes through digital video broadcasting (DVB) subtitles into the output.

## __AWS Elemental MediaPackage VOD__
  - ### Features
    - MediaPackage passes through digital video broadcasting (DVB) subtitles into the output.

## __AWS Panorama__
  - ### Features
    - General availability for AWS Panorama. AWS SDK for Panorama includes APIs to manage your devices and nodes, and deploy computer vision applications to the edge. For more information, see the AWS Panorama documentation at http://docs.aws.amazon.com/panorama

## __AWS SDK for Java v2__
  - ### Features
    - Add missing @Override annotations

## __AWS SecurityHub__
  - ### Features
    - Added support for cross-Region finding aggregation, which replicates findings from linked Regions to a single aggregation Region. Added operations to view, enable, update, and delete the finding aggregation.

## __Amazon Appflow__
  - ### Features
    - Feature to add support for JSON-L format for S3 as a source.

## __Amazon Transcribe Streaming Service__
  - ### Features
    - This release adds custom language support for streaming transcription.

# __2.17.63__ __2021-10-19__
## __AWS Data Exchange__
  - ### Features
    - This release adds support for our public preview of AWS Data Exchange for Amazon Redshift. This enables data providers to list products including AWS Data Exchange datashares for Amazon Redshift, giving subscribers read-only access to provider data in Amazon Redshift.

## __Amazon Chime SDK Messaging__
  - ### Features
    - The Amazon Chime SDK now allows developers to execute business logic on in-flight messages before they are delivered to members of a messaging channel with channel flows.

# __2.17.62__ __2021-10-18__
## __AWS SDK for Java v2__
  - ### Bugfixes
    - Allow AwsErrorDetails to be serialized using Java serialization

## __Amazon Interactive Video Service__
  - ### Features
    - Bug fix: remove unsupported maxResults and nextToken pagination parameters from ListTagsForResource

## __Amazon QuickSight__
  - ### Features
    - AWS QuickSight Service Features - Add IP Restriction UI and public APIs support.

# __2.17.61__ __2021-10-15__
## __AWS Glue__
  - ### Features
    - Enable S3 event base crawler API.

## __Amazon Elastic File System__
  - ### Features
    - EFS adds documentation for a new exception for short identifiers to be thrown after its migration to long resource identifiers.

# __2.17.60__ __2021-10-14__
## __AWS RoboMaker__
  - ### Features
    - Adding support to GPU simulation jobs as well as non-ROS simulation jobs.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Fixes a bug in XML error unmarshalling where error responses with empty body won't populate the requestId field. Affects Amazon S3 API calls such as Head object

## __Amazon SageMaker Service__
  - ### Features
    - This release updates the provisioning artifact ID to an optional parameter in CreateProject API. The provisioning artifact ID defaults to the latest provisioning artifact ID of the product if you don't provide one.

## __Auto Scaling__
  - ### Features
    - Amazon EC2 Auto Scaling now supports filtering describe Auto Scaling groups API using tags

## __Elastic Load Balancing__
  - ### Features
    - Adds new option to filter by availability on each type of load balancer when describing ssl policies.

# __2.17.59__ __2021-10-13__
## __AWS Config__
  - ### Features
    - Adding Config support for AWS::OpenSearch::Domain

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Storage Gateway__
  - ### Features
    - Adding support for Audit Logs on NFS shares and Force Closing Files on SMB shares.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for additional VPC Flow Logs delivery options to S3, such as Apache Parquet formatted files, Hourly partitions and Hive-compatible S3 prefixes

## __Amazon Kinesis Analytics__
  - ### Features
    - Support for Apache Flink 1.13 in Kinesis Data Analytics. Changed the required status of some Update properties to better fit the corresponding Create properties.

## __Amazon WorkMail__
  - ### Features
    - This release adds APIs for adding, removing and retrieving details of mail domains

# __2.17.58__ __2021-10-12__
## __AWS MediaTailor__
  - ### Features
    - MediaTailor now supports ad prefetching.

## __AWS SDK for Java v2__
  - ### Features
    - Reduce base delay of STANDARD retry mode to 100ms for non-throttling responses. This reduces tail latency in the event of transient failures.
    - Updated service endpoint metadata.

## __Amazon CloudSearch__
  - ### Features
    - Adds an additional validation exception for Amazon CloudSearch configuration APIs for better error handling.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation only update to address tickets.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - EncryptionSupport for InstanceStorageInfo added to DescribeInstanceTypes API

# __2.17.57__ __2021-10-11__
## __AWS Elemental MediaLive__
  - ### Features
    - This release adds support for Transport Stream files as an input type to MediaLive encoders.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation update for Amazon EC2.

## __Amazon Fraud Detector__
  - ### Features
    - New model type: Transaction Fraud Insights, which is optimized for online transaction fraud. Stored Events, which allows customers to send and store data directly within Amazon Fraud Detector. Batch Import, which allows customers to upload a CSV file of historic event data for processing and storage

## __Elastic Load Balancing__
  - ### Features
    - Enable support for ALB IPv6 Target Groups (IP Address Type)

# __2.17.56__ __2021-10-08__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert has added the ability to set account policies which control access restrictions for HTTP, HTTPS, and S3 content sources.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for Secrets Manager

## __AWS SecurityHub__
  - ### Features
    - Added new resource details objects to ASFF, including resources for WAF rate-based rules, EC2 VPC endpoints, ECR repositories, EKS clusters, X-Ray encryption, and OpenSearch domains. Added additional details for CloudFront distributions, CodeBuild projects, ELB V2 load balancers, and S3 buckets.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release removes a requirement for filters on SearchLocalGatewayRoutes operations.

## __Amazon Lex Model Building V2__
  - ### Features
    - Added configuration support for an Amazon Lex bot to provide fulfillment progress updates to users while their requests are being processed. See documentation for more details: https://docs.aws.amazon.com/lexv2/latest/dg/streaming-progress.html

## __Amazon Lex Runtime V2__
  - ### Features
    - Added configuration support for an Amazon Lex bot to provide fulfillment progress updates to users while their requests are being processed. See documentation for more details: https://docs.aws.amazon.com/lexv2/latest/dg/streaming-progress.html

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - When executing a request, it's possible for multiple threads to interact and modify the channel pipeline without synchronizing which can cause issues. This commit fixes this issue by ensuring that code that modifies the pipeline all run within the context of the channel's event loop.

# __2.17.55__ __2021-10-07__
## __AWS Backup__
  - ### Features
    - Launch of AWS Backup Vault Lock, which protects your backups from malicious and accidental actions, works with existing backup policies, and helps you meet compliance requirements.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports indexing and querying documents in different languages.

## __Amazon Chime__
  - ### Features
    - This release enables customers to configure Chime MediaCapturePipeline via API.

## __Amazon Kinesis Firehose__
  - ### Features
    - Allow support for Amazon Opensearch Service(successor to Amazon Elasticsearch Service) as a Kinesis Data Firehose delivery destination.

## __Amazon Managed Grafana__
  - ### Features
    - Initial release of the SDK for Amazon Managed Grafana API.

## __Schemas__
  - ### Features
    - Removing unused request/response objects.

# __2.17.54__ __2021-10-06__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports integration with AWS SSO

## __Amazon FSx__
  - ### Features
    - This release adds support for Lustre 2.12 to FSx for Lustre.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds a new TrainingInputMode FastFile for SageMaker Training APIs.

## __AmplifyBackend__
  - ### Features
    - Adding a new field 'AmplifyFeatureFlags' to the response of the GetBackend operation. It will return a stringified version of the cli.json file for the given Amplify project.

## __DynamoDB Enhanced Client__
  - ### Features
    - This commit introduces DynamoDbTable#updateItemWithResponse() that allows customers to specify additional parameters on the request such as ReturnConsumedCapacity to get additional information the service response.

# __2.17.53__ __2021-10-05__
## __AWS Backup__
  - ### Features
    - AWS Backup Audit Manager framework report.

## __AWS Glue__
  - ### Features
    - This release adds tag as an input of CreateConnection

## __Amazon DynamoDB__
  - ### Features
    - Allow parallel scan via DynamoDBEnhanced client and modify ScanEnhancedRequest to support totalSegments and segment parameters.
      The corresponding github issue is https://github.com/aws/aws-sdk-java-v2/issues/1851
        - Contributed by: [@asanthan-amazon](https://github.com/asanthan-amazon)

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Released Capacity Reservation Fleet, a feature of Amazon EC2 Capacity Reservations, which provides a way to manage reserved capacity across instance types. For more information: https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/cr-fleets.html

## __Amazon Location Service__
  - ### Features
    - Add support for PositionFiltering.

## __Amazon WorkMail__
  - ### Features
    - This release allows customers to change their inbound DMARC settings in Amazon WorkMail.

## __Application Auto Scaling__
  - ### Features
    - With this release, Application Auto Scaling adds support for Amazon Neptune. Customers can now automatically add or remove Read Replicas of their Neptune clusters to keep the average CPU Utilization at the target value specified by the customers.

## __Contributors__
Special thanks to the following contributors to this release: 

[@asanthan-amazon](https://github.com/asanthan-amazon)
# __2.17.52__ __2021-10-04__
## __AWS CodeBuild__
  - ### Features
    - CodeBuild now allows you to select how batch build statuses are sent to the source provider for a project.

## __AWS Key Management Service__
  - ### Features
    - Added SDK examples for ConnectCustomKeyStore, CreateCustomKeyStore, CreateKey, DeleteCustomKeyStore, DescribeCustomKeyStores, DisconnectCustomKeyStore, GenerateDataKeyPair, GenerateDataKeyPairWithoutPlaintext, GetPublicKey, ReplicateKey, Sign, UpdateCustomKeyStore and Verify APIs

## __Amazon Elastic File System__
  - ### Features
    - EFS adds a new exception for short identifiers to be thrown after its migration to long resource identifiers.

# __2.17.51__ __2021-10-01__
## __AWS App Runner__
  - ### Features
    - This release contains several minor bug fixes.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - When "AutoApprovable" is true for a Change Template, then specifying --auto-approve (boolean) in Start-Change-Request-Execution will create a change request that bypasses approver review. (except for change calendar restrictions)

## __Synthetics__
  - ### Features
    - CloudWatch Synthetics now enables customers to choose a customer managed AWS KMS key or an Amazon S3-managed key instead of an AWS managed key (default) for the encryption of artifacts that the canary stores in Amazon S3. CloudWatch Synthetics also supports artifact S3 location updation now.

# __2.17.50__ __2021-09-30__
## __AWS Account__
  - ### Features
    - This release of the Account Management API enables customers to manage the alternate contacts for their AWS accounts. For more information, see https://docs.aws.amazon.com/accounts/latest/reference/accounts-welcome.html

## __AWS Cloud Control API__
  - ### Features
    - Initial release of the SDK for AWS Cloud Control API

## __AWS Data Exchange__
  - ### Features
    - This release enables subscribers to set up automatic exports of newly published revisions using the new EventAction API.

## __AWS Network Firewall__
  - ### Features
    - This release adds support for strict ordering for stateful rule groups. Using strict ordering, stateful rules are evaluated in the exact order in which you provide them.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Macie 2__
  - ### Features
    - Amazon S3 bucket metadata now indicates whether an error or a bucket's permissions settings prevented Amazon Macie from retrieving data about the bucket or the bucket's objects.

## __Amazon WorkMail__
  - ### Features
    - This release adds support for mobile device access overrides management in Amazon WorkMail.

## __Amazon WorkSpaces__
  - ### Features
    - Added CreateUpdatedWorkspaceImage API to update WorkSpace images with latest software and drivers. Updated DescribeWorkspaceImages API to display if there are updates available for WorkSpace images.

# __2.17.49__ __2021-09-29__
## __AWS Lambda__
  - ### Features
    - Adds support for Lambda functions powered by AWS Graviton2 processors. Customers can now select the CPU architecture for their functions.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Prometheus Service__
  - ### Features
    - This release adds alert manager and rule group namespace APIs

## __Amazon Simple Email Service__
  - ### Features
    - This release includes the ability to use 2048 bits RSA key pairs for DKIM in SES, either with Easy DKIM or Bring Your Own DKIM.

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Update `netty-tcnative-boringssl-static` to `2.0.43.Final` to fix issues loading the native libraries on some platforms.

# __2.17.48__ __2021-09-28__
## __AWS SDK for Java v2__
  - ### Bugfixes
    - Bug fix to handle DocumentType for Explicit payload members.

## __AWS Transfer Family__
  - ### Features
    - Added changes for managed workflows feature APIs.

## __EC2 Image Builder__
  - ### Features
    - Fix description for AmiDistributionConfiguration Name property, which actually refers to the output AMI name. Also updated for consistent terminology to use "base" image, and another update to fix description text.

# __2.17.47__ __2021-09-27__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon AppIntegrations Service__
  - ### Features
    - The Amazon AppIntegrations service enables you to configure and reuse connections to external applications.

## __Amazon Connect Service__
  - ### Features
    - This release updates a set of APIs: CreateIntegrationAssociation, ListIntegrationAssociations, CreateUseCase, and StartOutboundVoiceContact. You can use it to create integrations with Amazon Pinpoint for the Amazon Connect Campaigns use case, Amazon Connect Voice ID, and Amazon Connect Wisdom.

## __Amazon Connect Wisdom Service__
  - ### Features
    - Released Amazon Connect Wisdom, a feature of Amazon Connect, which provides real-time recommendations and search functionality in general availability (GA). For more information, see https://docs.aws.amazon.com/wisdom/latest/APIReference/Welcome.html.

## __Amazon Pinpoint__
  - ### Features
    - Added support for journey with contact center activity

## __Amazon Voice ID__
  - ### Features
    - Released the Amazon Voice ID SDK, for usage with the Amazon Connect Voice ID feature released for Amazon Connect.

## __Elastic Load Balancing__
  - ### Features
    - Adds new ALB-type target group to facilitate forwarding traffic from NLB to ALB

# __2.17.46__ __2021-09-24__
## __AWS License Manager__
  - ### Features
    - AWS License Manager now allows customers to get the LicenseArn in the Checkout API Response.

## __AWS SDK for Java v2__
  - ### Features
    - Remove SDK usage of global execution.interceptors files. This reduces the need for customers to use a special transformer for execution.interceptors files when they are creating an uber-jar of all SDK modules. Customers should still consider using such an appender, in case other libraries rely on execution.interceptors files.
    - Updated service endpoint metadata.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - DescribeInstances now returns Platform Details, Usage Operation, and Usage Operation Update Time.

## __DynamoDB Enhanced Client__
  - ### Features
    - Annotated immutable class introspector now ignores 'toBuilder' method allowing easier integration with libraries that auto-generate this method on immutable data classes.
        - Contributed by: [@bmaizels](https://github.com/bmaizels)

## __Contributors__
Special thanks to the following contributors to this release: 

[@bmaizels](https://github.com/bmaizels)
# __2.17.45__ __2021-09-23__
## __AWS AppSync__
  - ### Features
    - Documented the new OpenSearchServiceDataSourceConfig data type. Added deprecation notes to the ElasticsearchDataSourceConfig data type.

## __AWS Elemental MediaConvert__
  - ### Features
    - This release adds style and positioning support for caption or subtitle burn-in from rich text sources such as TTML. This release also introduces configurable image-based trick play track generation.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Added cutoff behavior support for preventing new task invocations from starting when the maintenance window cutoff time is reached.

# __2.17.44__ __2021-09-22__
## __AWS Elemental MediaPackage VOD__
  - ### Features
    - MediaPackage VOD will now return the current processing statuses of an asset's endpoints. The status can be QUEUED, PROCESSING, PLAYABLE, or FAILED.

## __AWS Identity and Access Management__
  - ### Features
    - Added changes to OIDC API about not using port numbers in the URL.

## __AWS License Manager__
  - ### Features
    - AWS License Manager now allows customers to change their Windows Server or SQL license types from Bring-Your-Own-License (BYOL) to License Included or vice-versa (using the customer's media).

## __AWS MediaTailor__
  - ### Features
    - This release adds support to configure logs for playback configuration.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS WAFV2__
  - ### Features
    - Added the regex match rule statement, for matching web requests against a single regular expression.

## __Amazon Lex Model Building V2__
  - ### Features
    - This release adds support for utterances statistics for bots built using Lex V2 console and APIs. For details, see: https://docs.aws.amazon.com/lexv2/latest/dg/monitoring-utterances.html

## __EC2 Image Builder__
  - ### Features
    - This feature adds support for specifying GP3 volume throughput and configuring instance metadata options for instances launched by EC2 Image Builder.

# __2.17.43__ __2021-09-21__
## __AWS IoT__
  - ### Features
    - This release adds support for verifying, viewing and filtering AWS IoT Device Defender detect violations with four verification states.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Update Sigv4a signer to include the port in the Host header, when the port does not match the standard port for the protocol. This allows requests to endpoints with non-standard ports to succeed.

## __Amazon Comprehend__
  - ### Features
    - Amazon Comprehend now supports versioning of custom models, improved training with ONE_DOC_PER_FILE text documents for custom entity recognition, ability to provide specific test sets during training, and live migration to new model endpoints.

## __Amazon EC2 Container Registry__
  - ### Features
    - This release adds additional support for repository replication

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This update adds support for downloading configuration templates using new APIs (GetVpnConnectionDeviceTypes and GetVpnConnectionDeviceSampleConfiguration) and Internet Key Exchange version 2 (IKEv2) parameters for many popular CGW devices.

## __DynamoDB Enhanced Client__
  - ### Features
    - This commit introduces DynamoDbTable#deleteItemWithResponse() that allows customers to specify additional parameters on the request such as ReturnConsumedCapacity to get additional information the service response.

## __Managed Streaming for Kafka__
  - ### Features
    - Added StateInfo to ClusterInfo

## __S3 Transfer Manager__
  - ### Bugfixes
    - Fix the NPE thrown when calling `S3TransferManager.create()`

# __2.17.42__ __2021-09-17__
## __AWS Database Migration Service__
  - ### Features
    - Optional flag force-planned-failover added to reboot-replication-instance API call. This flag can be used to test a planned failover scenario used during some maintenance operations.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Elasticsearch Service__
  - ### Features
    - This release adds an optional parameter in the ListDomainNames API to filter domains based on the engine type (OpenSearch/Elasticsearch).

## __Amazon OpenSearch Service__
  - ### Features
    - This release adds an optional parameter in the ListDomainNames API to filter domains based on the engine type (OpenSearch/Elasticsearch).

# __2.17.41__ __2021-09-16__
## __AWS RoboMaker__
  - ### Features
    - Adding support to create container based Robot and Simulation applications by introducing an environment field

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Macie 2__
  - ### Features
    - This release adds support for specifying which managed data identifiers are used by a classification job, and retrieving a list of managed data identifiers that are available.

## __Amazon Pinpoint__
  - ### Features
    - This SDK release adds a new feature for Pinpoint campaigns, in-app messaging.

## __Amazon SageMaker Service__
  - ### Features
    - Add API for users to retry a failed pipeline execution or resume a stopped one.

## __Amazon Simple Storage Service__
  - ### Features
    - Add support for access point arn filtering in S3 CW Request Metrics

## __Amazon Transcribe Service__
  - ### Features
    - This release adds support for subtitling with Amazon Transcribe batch jobs.

## __DynamoDB Enhanced Client__
  - ### Features
    - This commit introduces DynamoDbTable#putItemWithResponse() that allows customers to specify additional parameters on the request such as ReturnValues to get additional information the service response.

## __Managed Streaming for Kafka Connect__
  - ### Features
    - This is the initial SDK release for Amazon Managed Streaming for Apache Kafka Connect (MSK Connect).

# __2.17.40__ __2021-09-14__
## __AWS SDK for Java v2__
  - ### Features
    - Upgrade Netty to 4.1.68

## __AWS WAFV2__
  - ### Features
    - This release adds support for including rate based rules in a rule group.

## __Amazon Chime__
  - ### Features
    - Adds support for SipHeaders parameter for CreateSipMediaApplicationCall.

## __Amazon Comprehend__
  - ### Features
    - Amazon Comprehend now allows you to train and run PDF and Word documents for custom entity recognition. With PDF and Word formats, you can extract information from documents containing headers, lists and tables.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for vt1 3xlarge, 6xlarge and 24xlarge instances powered by Xilinx Alveo U30 Media Accelerators for video transcoding workloads

## __Amazon SageMaker Service__
  - ### Features
    - This release adds support for "Project Search"

## __Amazon Transcribe Streaming Service__
  - ### Features
    - Amazon Transcribe now supports PII Identification and Redaction for streaming transcription.

# __2.17.39__ __2021-09-13__
## __AWS IoT__
  - ### Features
    - AWS IoT Rules Engine adds OpenSearch action. The OpenSearch rule action lets you stream data from IoT sensors and applications to Amazon OpenSearch Service which is a successor to Amazon Elasticsearch Service.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds support for T3 instances on Amazon EC2 Dedicated Hosts.

## __S3 Transfer Manager__
  - ### Features
    - Now users can pass `File` to `DownloadRequest` and `UploadRequest` in `S3TransferManager`.

# __2.17.38__ __2021-09-10__
## __AWS CloudFormation__
  - ### Features
    - Doc only update for CloudFormation that fixes several customer-reported issues.

## __AWS SDK for Java v2__
  - ### Features
    - Add support for authenticated corporate proxies
        - Contributed by: [@guillepb10](https://github.com/guillepb10)
    - Updated service endpoint metadata.

## __Amazon EC2 Container Registry__
  - ### Features
    - This release updates terminology around KMS keys.

## __Amazon QuickSight__
  - ### Features
    - Add new data source type for Amazon OpenSearch (successor to Amazon ElasticSearch).

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for providing a custom timeout value for finding a scaling point during autoscaling in Aurora Serverless v1.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds support for "Lifecycle Configurations" to SageMaker Studio

## __Amazon Transcribe Service__
  - ### Features
    - This release adds an API option for startTranscriptionJob and startMedicalTranscriptionJob that allows the user to specify encryption context key value pairs for batch jobs.

## __DynamoDB Enhanced Client__
  - ### Bugfixes
    - Fix `PutItemEnhancedRequest` and `DeleteItemEnhancedRequest` to include `ConditionExpression` in their `equals()` and `hashCode()` calculations.
    - Fixes for `UpdateItemEnhancedRequest`:
       - Include `ConditionExpression` in `toBuilder()`
       - Include `ConditionExpression` in `equals()` and `hashCode()` calculations

## __S3 Transfer Manager__
  - ### Bugfixes
    - Remove extra question mark when query parameters are provided in transfer manager

## __Contributors__
Special thanks to the following contributors to this release: 

[@guillepb10](https://github.com/guillepb10)
# __2.17.37__ __2021-09-09__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon CodeGuru Reviewer__
  - ### Features
    - The Amazon CodeGuru Reviewer API now includes the RuleMetadata data object and a Severity attribute on a RecommendationSummary object. A RuleMetadata object contains information about a rule that generates a recommendation. Severity indicates how severe the issue associated with a recommendation is.

## __Amazon EMR__
  - ### Features
    - This release enables customers to login to EMR Studio using AWS Identity and Access Management (IAM) identities or identities in their Identity Provider (IdP) via IAM.

## __Amazon Lookout for Equipment__
  - ### Features
    - Added OffCondition parameter to CreateModel API

# __2.17.36__ __2021-09-08__
## __AWS Resource Access Manager__
  - ### Features
    - A minor text-only update that fixes several customer issues.

## __AWS SDK for Java v2__
  - ### Features
    - Improve performance of generated enum methods

## __Amazon OpenSearch Service__
  - ### Features
    - Updated Configuration APIs for Amazon OpenSearch Service (successor to Amazon Elasticsearch Service)

## __Managed Streaming for Kafka__
  - ### Features
    - Amazon MSK has added a new API that allows you to update the encrypting and authentication settings for an existing cluster.

# __2.17.35__ __2021-09-07__
## __AWS Elemental MediaPackage__
  - ### Features
    - SPEKE v2 support for live CMAF packaging type. SPEKE v2 is an upgrade to the existing SPEKE API to support multiple encryption keys, it supports live DASH currently.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Systems Manager Incident Manager Contacts__
  - ### Features
    - Added SDK examples for SSM-Contacts.

## __AWS X-Ray__
  - ### Features
    - Updated references to AWS KMS keys and customer managed keys to reflect current terminology.

## __Amazon ElastiCache__
  - ### Features
    - Doc only update for ElastiCache

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adding RegisterCluster and DeregisterCluster operations, to support connecting external clusters to EKS.

## __Amazon Forecast Service__
  - ### Features
    - Predictor creation now supports selecting an accuracy metric to optimize in AutoML and hyperparameter optimization. This release adds additional accuracy metrics for predictors - AverageWeightedQuantileLoss, MAPE and MASE.

## __Amazon Prometheus Service__
  - ### Features
    - This release adds tagging support for Amazon Managed Service for Prometheus workspace.

## __DynamoDB Enhanced Client__
  - ### Features
    - Allow customers to specify `ReturnValuesOnConditionCheckFailure` for `TransactWriteItems`. Addresses [#2283](https://github.com/aws/aws-sdk-java-v2/issues/2283).

# __2.17.34__ __2021-09-03__
## __AWS Outposts__
  - ### Features
    - This release adds a new API CreateOrder.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Chime SDK Identity__
  - ### Features
    - Documentation updates for Chime

## __Amazon Chime SDK Messaging__
  - ### Features
    - Documentation updates for Chime

## __Amazon CodeGuru Reviewer__
  - ### Features
    - Added support for CodeInconsistencies detectors

## __Amazon Fraud Detector__
  - ### Features
    - Enhanced GetEventPrediction API response to include risk scores from imported SageMaker models

## __Amazon S3__
  - ### Features
    - Adds multi-region support for S3 access points as well as Sigv4 Asymmetric signing

# __2.17.33__ __2021-09-02__
## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - Private Certificate Authority Service now allows customers to enable an online certificate status protocol (OCSP) responder service on their private certificate authorities. Customers can also optionally configure a custom CNAME for their OCSP responder.

## __AWS S3 Control__
  - ### Features
    - S3 Multi-Region Access Points provide a single global endpoint to access a data set that spans multiple S3 buckets in different AWS Regions.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS SecurityHub__
  - ### Features
    - New ASFF Resources: AwsAutoScalingLaunchConfiguration, AwsEc2VpnConnection, AwsEcrContainerImage. Added KeyRotationStatus to AwsKmsKey. Added AccessControlList, BucketLoggingConfiguration,BucketNotificationConfiguration and BucketNotificationConfiguration to AwsS3Bucket.

## __AWS Transfer Family__
  - ### Features
    - AWS Transfer Family introduces Managed Workflows for creating, executing, monitoring, and standardizing post file transfer processing

## __Access Analyzer__
  - ### Features
    - Updates service API, documentation, and paginators to support multi-region access points from Amazon S3.

## __Amazon Elastic Block Store__
  - ### Features
    - Documentation updates for Amazon EBS direct APIs.

## __Amazon Elastic File System__
  - ### Features
    - Adds support for EFS Intelligent-Tiering, which uses EFS Lifecycle Management to monitor file access patterns and is designed to automatically transition files to and from your corresponding Infrequent Access (IA) storage classes.

## __Amazon FSx__
  - ### Features
    - Announcing Amazon FSx for NetApp ONTAP, a new service that provides fully managed shared storage in the AWS Cloud with the data access and management capabilities of ONTAP.

## __Amazon Lex Model Building Service__
  - ### Features
    - Lex now supports Korean (ko-KR) locale.

## __Amazon QuickSight__
  - ### Features
    - This release adds support for referencing parent datasets as sources in a child dataset.

## __Schemas__
  - ### Features
    - This update include the support for Schema Discoverer to discover the events sent to the bus from another account. The feature will be enabled by default when discoverer is created or updated but can also be opt-in or opt-out by specifying the value for crossAccount.

# __2.17.32__ __2021-09-01__
## __AWS CloudTrail__
  - ### Features
    - Documentation updates for CloudTrail

## __AWS Config__
  - ### Features
    - Documentation updates for config

## __AWS MediaTailor__
  - ### Features
    - This release adds support for wall clock programs in LINEAR channels.

## __AWS SDK for Java v2__
  - ### Features
    - Added new convenience methods to SdkPublisher: doAfterOnError, doAfterOnComplete, and doAfterCancel.
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Fixed an issue where event streams might fail with ClassCastException or NoSuchElementExceptions

## __AWS Service Catalog App Registry__
  - ### Features
    - Introduction of GetAssociatedResource API and GetApplication response extension for Resource Groups support.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added LaunchTemplate support for the IMDS IPv6 endpoint

# __2.17.31__ __2021-08-31__
## __AWS Compute Optimizer__
  - ### Features
    - Documentation updates for Compute Optimizer

## __AWS IoT__
  - ### Features
    - Added Create/Update/Delete/Describe/List APIs for a new IoT resource named FleetMetric. Added a new Fleet Indexing query API named GetBucketsAggregation. Added a new field named DisconnectedReason in Fleet Indexing query response. Updated their related documentations.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon MemoryDB__
  - ### Features
    - Documentation updates for MemoryDB

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds new South African English voice - Ayanda. Ayanda is available as Neural voice only.

## __Amazon Simple Queue Service__
  - ### Features
    - Amazon SQS adds a new queue attribute, RedriveAllowPolicy, which includes the dead-letter queue redrive permission parameters. It defines which source queues can specify dead-letter queues as a JSON object.

# __2.17.30__ __2021-08-30__
## __AWS CloudFormation__
  - ### Features
    - AWS CloudFormation allows you to iteratively develop your applications when failures are encountered without rolling back successfully provisioned resources. By specifying stack failure options, you can troubleshoot resources in a CREATE_FAILED or UPDATE_FAILED status.

## __AWS CodeBuild__
  - ### Features
    - Documentation updates for CodeBuild

## __AWS Key Management Service__
  - ### Features
    - This release has changes to KMS nomenclature to remove the word master from both the "Customer master key" and "CMK" abbreviation and replace those naming conventions with "KMS key".

## __Amazon Kinesis Firehose__
  - ### Features
    - This release adds the Dynamic Partitioning feature to Kinesis Data Firehose service for S3 destinations.

# __2.17.29__ __2021-08-27__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon EMR__
  - ### Features
    - Amazon EMR now supports auto-terminating idle EMR clusters. You can specify the idle timeout value when enabling auto-termination for both running and new clusters and Amazon EMR automatically terminates the cluster when idle timeout kicks in.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds the BootMode flag to the ImportImage API and showing the detected BootMode of an ImportImage task.

## __Amazon Simple Storage Service__
  - ### Features
    - Documentation updates for Amazon S3.

# __2.17.28__ __2021-08-26__
## __AWS Compute Optimizer__
  - ### Features
    - Adds support for 1) the AWS Graviton (AWS_ARM64) recommendation preference for Amazon EC2 instance and Auto Scaling group recommendations, and 2) the ability to get the enrollment statuses for all member accounts of an organization.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Support added for resizing VPC prefix lists

## __Amazon Rekognition__
  - ### Features
    - This release added new attributes to Rekognition RecognizeCelebities and GetCelebrityInfo API operations.

## __Amazon Transcribe Service__
  - ### Features
    - This release adds support for batch transcription in six new languages - Afrikaans, Danish, Mandarin Chinese (Taiwan), New Zealand English, South African English, and Thai.

# __2.17.27__ __2021-08-25__
## __AWS DataSync__
  - ### Features
    - Added include filters to CreateTask and UpdateTask, and added exclude filters to StartTaskExecution, giving customers more granular control over how DataSync transfers files, folders, and objects.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon CloudWatch Events__
  - ### Features
    - AWS CWEvents adds an enum of EXTERNAL for EcsParameters LaunchType for PutTargets API

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Support added for IMDS IPv6 endpoint

## __Amazon EventBridge__
  - ### Features
    - AWS EventBridge adds an enum of EXTERNAL for EcsParameters LaunchType for PutTargets API

## __Firewall Management Service__
  - ### Features
    - AWS Firewall Manager now supports triggering resource cleanup workflow when account or resource goes out of policy scope for AWS WAF, Security group, AWS Network Firewall, and Amazon Route 53 Resolver DNS Firewall policies.

# __2.17.26__ __2021-08-24__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added MBAFF encoding support for AVC video and the ability to pass encryption context from the job settings to S3.

## __AWS IoT Data Plane__
  - ### Features
    - Updated Publish with support for new Retain flag and added two new API operations: GetRetainedMessage, ListRetainedMessages.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix `NullPointerException` in `RetryPolicy.hashCode()`.

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds new New Zealand English voice - Aria. Aria is available as Neural voice only.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Updated Parameter Store property for logging improvements.

## __Amazon Transcribe Service__
  - ### Features
    - This release adds support for feature tagging with Amazon Transcribe batch jobs.

# __2.17.25__ __2021-08-23__
## __AWS Backup__
  - ### Features
    - AWS Backup - Features: Evaluate your backup activity and generate audit reports.

## __AWS Database Migration Service__
  - ### Features
    - Amazon AWS DMS service now support Redis target endpoint migration. Now S3 endpoint setting is capable to setup features which are used to be configurable only in extract connection attributes.

## __AWS Glue__
  - ### Features
    - Add support for Custom Blueprints

## __AWS IoT SiteWise__
  - ### Features
    - Documentation updates for AWS IoT SiteWise

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon API Gateway__
  - ### Features
    - Adding some of the pending releases (1) Adding WAF Filter to GatewayResponseType enum (2) Ensuring consistent error model for all operations (3) Add missing BRE to GetVpcLink operation

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Added AMI deprecation support for Amazon Data Lifecycle Manager EBS-backed AMI policies.

## __Amazon Fraud Detector__
  - ### Features
    - Updated an element of the DescribeModelVersion API response (LogitMetrics -> logOddsMetrics) for clarity. Added new exceptions to several APIs to protect against unlikely scenarios.

# __2.17.24__ __2021-08-20__
## __AWS RoboMaker__
  - ### Features
    - Documentation updates for RoboMaker

## __Amazon Comprehend__
  - ### Features
    - Add tagging support for Comprehend async inference job.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - encryptionInTransitSupported added to DescribeInstanceTypes API

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adds support for EKS add-ons "preserve" flag, which allows customers to maintain software on their EKS clusters after removing it from EKS add-ons management.

# __2.17.23__ __2021-08-19__
## __AWS SDK for Java v2__
  - ### Features
    - Implement ADAPTIVE retry mode. ADAPTIVE mode builds on STANDARD retry mode and adds rate limiting of requests when the client is throttled.

      Adaptive retry mode dynamically limits the rate of AWS requests to maximize success rate. This may be at the expense of request latency. Adaptive retry mode is not recommended when predictable latency is important.

      Warning: Adaptive retry mode assumes that the client is working against a single resource (e.g. one DynamoDB Table or one S3 Bucket). If you use a single client for multiple resources, throttling or outages associated with one resource will result in increased latency and failures when accessing all other resources via the same client. When using adaptive retry mode, we recommend using a single client per resource.
    - Updated service endpoint metadata.

## __Amazon Appflow__
  - ### Features
    - This release adds support for SAPOData connector and extends Veeva connector for document extraction.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - The ImportImage API now supports the ability to create AMIs with AWS-managed licenses for Microsoft SQL Server for both Windows and Linux.

## __Amazon MemoryDB__
  - ### Features
    - AWS MemoryDB SDK now supports all APIs for newly launched MemoryDB service.

## __Application Auto Scaling__
  - ### Features
    - This release extends Application Auto Scaling support for replication group of Amazon ElastiCache Redis clusters. Auto Scaling monitors and automatically expands node group count and number of replicas per node group when a critical usage threshold is met or according to customer-defined schedule.

# __2.17.22__ __2021-08-18__
## __AWS CodeBuild__
  - ### Features
    - CodeBuild now allows you to make the build results for your build projects available to the public without requiring access to an AWS account.

## __Amazon Route 53__
  - ### Features
    - Documentation updates for route53

## __Amazon Route 53 Resolver__
  - ### Features
    - Documentation updates for Route 53 Resolver

## __Amazon SageMaker Runtime__
  - ### Features
    - Amazon SageMaker Runtime now supports InvokeEndpointAsync to asynchronously invoke endpoints that were created with the AsyncInferenceConfig object in the EndpointConfig. Asynchronous invocations support larger payload sizes in Amazon S3 and longer processing times.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker now supports Asynchronous Inference endpoints. Adds PlatformIdentifier field that allows Notebook Instance creation with different platform selections. Increases the maximum number of containers in multi-container endpoints to 15. Adds more instance types to InstanceType field.

# __2.17.21__ __2021-08-17__
## __AWS Cloud9__
  - ### Features
    - Added DryRun parameter to CreateEnvironmentEC2 API. Added ManagedCredentialsActions parameter to UpdateEnvironment API

## __AWS Cost Explorer Service__
  - ### Features
    - This release is a new feature for Cost Categories: Split charge rules. Split charge rules enable you to allocate shared costs between your cost category values.

## __Amazon CloudDirectory__
  - ### Features
    - Documentation updates for clouddirectory

## __Amazon CloudWatch Logs__
  - ### Features
    - Documentation-only update for CloudWatch Logs

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for EC2 ED25519 key pairs for authentication

# __2.17.20__ __2021-08-16__
## __AWS CodeBuild__
  - ### Features
    - CodeBuild now allows you to select how batch build statuses are sent to the source provider for a project.

## __AWS Config__
  - ### Features
    - Update ResourceType enum with values for Backup Plan, Selection, Vault, RecoveryPoint; ECS Cluster, Service, TaskDefinition; EFS AccessPoint, FileSystem; EKS Cluster; ECR Repository resources

## __AWS Directory Service__
  - ### Features
    - This release adds support for describing client authentication settings.

## __AWS IoT SiteWise__
  - ### Features
    - AWS IoT SiteWise added query window for the interpolation interval. AWS IoT SiteWise computes each interpolated value by using data points from the timestamp of each interval minus the window to the timestamp of each interval plus the window.

## __AWS License Manager__
  - ### Features
    - AWS License Manager now allows end users to call CheckoutLicense API using new CheckoutType PERPETUAL. Perpetual checkouts allow sellers to check out a quantity of entitlements to be drawn down for consumption.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Simple Storage Service__
  - ### Features
    - Documentation updates for Amazon S3

## __Netty NIO HTTP Client__
  - ### Features
    - Upgrade Netty version to 4.1.66.Final

# __2.17.19__ __2021-08-13__
## __Amazon Connect Customer Profiles__
  - ### Features
    - This release introduces Standard Profile Objects, namely Asset and Case which contain values populated by data from third party systems and belong to a specific profile. This release adds an optional parameter, ObjectFilter to the ListProfileObjects API in order to search for these Standard Objects.

## __Amazon EMR__
  - ### Features
    - Amazon EMR customers can now specify custom AMIs at the instance level in their clusters. This allows using custom AMIs in clusters that have instances with different instruction set architectures, e.g. m5.xlarge (x86) and m6g.xlarge (ARM).

## __Amazon ElastiCache__
  - ### Features
    - This release adds ReplicationGroupCreateTime field to ReplicationGroup which indicates the UTC time when ElastiCache ReplicationGroup is created

## __Amazon QuickSight__
  - ### Features
    - Documentation updates for QuickSight.

## __URL Connection Http Client__
  - ### Bugfixes
    - Fixed connection pooling for HTTPS endpoints. Previously, each request would create a new connection.

# __2.17.18__ __2021-08-12__
## __AWS Glue DataBrew__
  - ### Features
    - This SDK release adds support for the output of a recipe job results to Tableau Hyper format.

## __AWS Lambda__
  - ### Features
    - Lambda Python 3.9 runtime launch

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Fixed an issue where request-level overrides (e.g. credentials) were not applied to endpoint discovery calls.

## __Amazon API Gateway__
  - ### Features
    - Adding support for ACM imported or private CA certificates for mTLS enabled domain names

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Autopilot adds new metrics for all candidate models generated by Autopilot experiments.

## __AmazonApiGatewayV2__
  - ### Features
    - Adding support for ACM imported or private CA certificates for mTLS enabled domain names

# __2.17.17__ __2021-08-11__
## __AWS CodeBuild__
  - ### Features
    - CodeBuild now allows you to make the build results for your build projects available to the public without requiring access to an AWS account.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Use "full jitter" & updated base delay for STANDARD retry mode defaults

  - ### Documentations
    - Create a shared, project-level IntelliJ inspection profile
    - Move IntelliJ code style & copyright configuration to project-level settings

## __AWS Snow Device Management__
  - ### Features
    - AWS Snow Family customers can remotely monitor and operate their connected AWS Snowcone devices.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation updates for ECS.

## __Amazon Elastic Block Store__
  - ### Features
    - Documentation updates for Amazon EBS direct APIs.

## __Amazon Route 53__
  - ### Features
    - Documentation updates for route53

## __AmazonNimbleStudio__
  - ### Features
    - Add new attribute 'ownedBy' in Streaming Session APIs. 'ownedBy' represents the AWS SSO Identity Store User ID of the owner of the Streaming Session resource.

# __2.17.16__ __2021-08-10__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Fix issue in `FileAsyncRequestBody` where the underlying file channel would only be closed when enough requests are sent to read *past* the end of the file; if just enough requests are sent to read to the end of the file, the file is not closed, leaving an open file descriptor around longer than it needs to be.

## __Amazon Chime__
  - ### Features
    - Add support for "auto" in Region field of StartMeetingTranscription API request.

## __Amazon S3 Transfer Manager [Preview]__
  - ### Features
    - This release includes the preview release of the Amazon S3 Transfer Manager. Visit our [Developer Guide](https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/transfer-manager.html) for more information.

# __2.17.15__ __2021-08-09__
## __AWS WAFV2__
  - ### Features
    - This release adds APIs to support versioning feature of AWS WAF Managed rule groups

## __Amazon Rekognition__
  - ### Features
    - This release adds support for four new types of segments (opening credits, content segments, slates, and studio logos), improved accuracy for credits and shot detection and new filters to control black frame detection.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Documentation updates for AWS Systems Manager.

# __2.17.14__ __2021-08-06__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Athena__
  - ### Features
    - Documentation updates for Athena.

## __Amazon Chime SDK Identity__
  - ### Features
    - The Amazon Chime SDK Identity APIs allow software developers to create and manage unique instances of their messaging applications.

## __Amazon Chime SDK Messaging__
  - ### Features
    - The Amazon Chime SDK Messaging APIs allow software developers to send and receive messages in custom messaging applications.

## __Amazon Connect Service__
  - ### Features
    - This release adds support for agent status and hours of operation. For details, see the Release Notes in the Amazon Connect Administrator Guide.

## __Amazon Lightsail__
  - ### Features
    - This release adds support to track when a bucket access key was last used.

## __Amazon S3__
  - ### Bugfixes
    - Fixed an issue where checksum validation only considered the first 4 bytes of the 16 byte checksum, creating the potential for corrupted downloads to go undetected.

## __Synthetics__
  - ### Features
    - Documentation updates for Visual Monitoring feature and other doc ticket fixes.

# __2.17.13__ __2021-08-05__
## __Amazon Lex Model Building V2__
  - ### Features
    - Customers can now toggle the active field on prompts and responses.

## __Auto Scaling__
  - ### Features
    - EC2 Auto Scaling adds configuration checks and Launch Template validation to Instance Refresh.

# __2.17.12__ __2021-08-04__
## __AWS SDK for Java v2__
  - ### Features
    - Add customization.config support for setting default RetryMode
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Fixed an issue where a bean-based marshallers for request and response models would fail for fluent setters that happened to start with "set", like "settings".

## __AWS Systems Manager Incident Manager__
  - ### Features
    - Documentation updates for Incident Manager.

## __Amazon EventBridge__
  - ### Features
    - Documentation updates to add EC2 Image Builder as a target on PutTargets.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds AutomaticRestartTime to the DescribeDBInstances and DescribeDBClusters operations. AutomaticRestartTime indicates the time when a stopped DB instance or DB cluster is restarted automatically.

## __Amazon Transcribe Service__
  - ### Features
    - This release adds support for call analytics (batch) within Amazon Transcribe.

## __EC2 Image Builder__
  - ### Features
    - Updated list actions to include a list of valid filters that can be used in the request.

# __2.17.11__ __2021-08-03__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added control over the passthrough of XDS captions metadata to outputs.

## __AWS Glue__
  - ### Features
    - Add ConcurrentModificationException to create-table, delete-table, create-database, update-database, delete-database

## __AWS IoT SiteWise__
  - ### Features
    - My AWS Service (placeholder) - This release introduces custom Intervals and offset for tumbling window in metric for AWS IoT SiteWise.

## __AWS Proton__
  - ### Features
    - Docs only add idempotent create apis

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Add IntelliJ .ipr files to gitignore

## __Amazon Redshift__
  - ### Features
    - API support for Redshift Data Sharing feature.

# __2.17.10__ __2021-08-02__
## __AWS IoT Greengrass V2__
  - ### Features
    - This release adds support for component system resource limits and idempotent Create operations. You can now specify the maximum amount of CPU and memory resources that each component can use.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Don't attempt to use empty session tokens

## __AWS Savings Plans__
  - ### Bugfixes
    - Setting default content type to 'application/json' since the service does not accept 'x-amz-json-<version>'

## __AWS Systems Manager Incident Manager Contacts__
  - ### Features
    - Added new attribute in AcceptCode API. AcceptCodeValidation takes in two values - ENFORCE, IGNORE. ENFORCE forces validation of accept code and IGNORE ignores it which is also the default behavior; Corrected TagKeyList length from 200 to 50

# __2.17.9__ __2021-07-30__
## __AWS AppSync__
  - ### Features
    - AWS AppSync now supports a new authorization mode allowing you to define your own authorization logic using an AWS Lambda function.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Secrets Manager__
  - ### Features
    - Add support for KmsKeyIds in the ListSecretVersionIds API response

## __Amazon SageMaker Service__
  - ### Features
    - API changes with respect to Lambda steps in model building pipelines. Adds several waiters to async Sagemaker Image APIs. Add more instance types to AppInstanceType field

## __Elastic Load Balancing__
  - ### Features
    - Client Port Preservation ALB Attribute Launch

# __2.17.8__ __2021-07-29__
## __AWS IoT__
  - ### Features
    - Increase maximum credential duration of role alias to 12 hours.

## __AWS IoT SiteWise__
  - ### Features
    - Added support for AWS IoT SiteWise Edge. You can now create an AWS IoT SiteWise gateway that runs on AWS IoT Greengrass V2. With the gateway, you can collect local server and equipment data, process the data, and export the selected data from the edge to the AWS Cloud.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Correctly handle multi-value headers in Aws4Signer

## __AWS Savings Plans__
  - ### Features
    - Documentation update for valid Savings Plans offering ID pattern

## __Amazon Chime__
  - ### Features
    - Adds support for live transcription of meetings with Amazon Transcribe and Amazon Transcribe Medical. The new APIs, StartMeetingTranscription and StopMeetingTranscription, control the generation of user-attributed transcriptions sent to meeting clients via Amazon Chime SDK data messages.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for G4ad xlarge and 2xlarge instances powered by AMD Radeon Pro V520 GPUs and AMD 2nd Generation EPYC processors

# __2.17.7__ __2021-07-28__
## __AWS CloudFormation__
  - ### Features
    - SDK update to support Importing existing Stacks to new/existing Self Managed StackSet - Stack Import feature.

## __AWS Single Sign-On Admin__
  - ### Features
    - Documentation updates for arn:aws:trebuchet:::service:v1:03a2216d-1cda-4696-9ece-1387cb6f6952

# __2.17.6__ __2021-07-27__
## __AWS Batch__
  - ### Features
    - Add support for ListJob filters

## __AWS IoT Analytics__
  - ### Features
    - IoT Analytics now supports creating a dataset resource with IoT SiteWise MultiLayerStorage data stores, enabling customers to query industrial data within the service. This release includes adding JOIN functionality for customers to query multiple data sources in a dataset.

## __AWS IoT Wireless__
  - ### Features
    - Add SidewalkManufacturingSn as an identifier to allow Customer to query WirelessDevice, in the response, AmazonId is added in the case that Sidewalk device is return.

## __AWS Route53 Recovery Control Config__
  - ### Features
    - Amazon Route 53 Application Recovery Controller's routing control - Routing Control Configuration APIs help you create and delete clusters, control panels, routing controls and safety rules. State changes (On/Off) of routing controls are not part of configuration APIs.

## __AWS Route53 Recovery Readiness__
  - ### Features
    - Amazon Route 53 Application Recovery Controller's readiness check capability continually monitors resource quotas, capacity, and network routing policies to ensure that the recovery environment is scaled and configured to take over when needed.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Shield__
  - ### Features
    - Change name of DDoS Response Team (DRT) to Shield Response Team (SRT)

## __Amazon Lex Model Building V2__
  - ### Features
    - Add waiters that automatically poll for resource status for asynchronous operations, such as building a bot

## __Amazon QuickSight__
  - ### Features
    - Add support to use row-level security with tags when embedding dashboards for users not provisioned in QuickSight

## __Amazon Route 53__
  - ### Features
    - This release adds support for the RECOVERY_CONTROL health check type to be used in conjunction with Route53 Application Recovery Controller.

## __Redshift Data API Service__
  - ### Features
    - Added structures to support new Data API operation BatchExecuteStatement, used to execute multiple SQL statements within a single transaction.

## __Route53 Recovery Cluster__
  - ### Features
    - Amazon Route 53 Application Recovery Controller's routing control - Routing Control Data Plane APIs help you update the state (On/Off) of the routing controls to reroute traffic across application replicas in a 100% available manner.

# __2.17.5__ __2021-07-26__
## __AWS Proton__
  - ### Features
    - Documentation-only update links

## __AWS S3 Control__
  - ### Features
    - S3 Access Point aliases can be used anywhere you use S3 bucket names to access data in S3

## __AWS SDK for Java v2__
  - ### Features
    - Annotate and document members that are modeled as deprecated

## __AWS SSO Identity Store__
  - ### Features
    - Documentation updates for SSO API Ref.

## __Amazon CloudWatch__
  - ### Features
    - SDK update to support creation of Cross-Account Metric Alarms and update API documentation.

## __Amazon S3__
  - ### Documentations
    - Deprecate S3 CopySource parameter for CopyObject & UploadPartCopy

## __Amazon Textract__
  - ### Features
    - Adds support for AnalyzeExpense, a new API to extract relevant data such as contact information, items purchased, and vendor name, from almost any invoice or receipt without the need for any templates or configuration.

## __Synthetics__
  - ### Features
    - CloudWatch Synthetics now supports visual testing in its canaries.

# __2.17.4__ __2021-07-23__
## __AWS SecurityHub__
  - ### Features
    - Added product name, company name, and Region fields for security findings. Added details objects for RDS event subscriptions and AWS ECS services. Added fields to the details for AWS Elasticsearch domains.

## __Amazon S3 on Outposts__
  - ### Features
    - Add on-premise access type support for endpoints

## __EC2 Image Builder__
  - ### Features
    - Update to documentation to reapply missing change to SSM uninstall switch default value and improve description.

# __2.17.3__ __2021-07-22__
## __AWS Elemental MediaLive__
  - ### Features
    - MediaLive now supports passing through style data on WebVTT caption outputs.

## __AWS Glue DataBrew__
  - ### Features
    - This SDK release adds two new features: 1) Output to Native JDBC destinations and 2) Adding configurations to profile jobs

## __AWS S3 Control__
  - ### Features
    - Documentation updates for Amazon S3-control

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release allows customers to assign prefixes to their elastic network interface and to reserve IP blocks in their subnet CIDRs. These reserved blocks can be used to assign prefixes to elastic network interfaces or be excluded from auto-assignment.

## __Amazon QLDB__
  - ### Features
    - Amazon QLDB now supports ledgers encrypted with customer managed KMS keys. Changes in CreateLedger, UpdateLedger and DescribeLedger APIs to support the changes.

## __Amazon S3__
  - ### Features
    - Add support for more user-friendly CopyObject source parameters

## __Elastic Load Balancing__
  - ### Features
    - Adds support for enabling TLS protocol version and cipher suite headers to be sent to backend targets for Application Load Balancers.

# __2.17.2__ __2021-07-21__
## __AWS CodeBuild__
  - ### Features
    - AWS CodeBuild now allows you to set the access permissions for build artifacts, project artifacts, and log files that are uploaded to an Amazon S3 bucket that is owned by another account.

## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for AWS Identity and Access Management (IAM).

## __AWS Lambda__
  - ### Features
    - New ResourceConflictException error code for PutFunctionEventInvokeConfig, UpdateFunctionEventInvokeConfig, and DeleteFunctionEventInvokeConfig operations.

## __AWS Proton__
  - ### Features
    - Documentation updates for AWS Proton

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now provides a data source connector for Amazon WorkDocs. For more information, see https://docs.aws.amazon.com/kendra/latest/dg/data-source-workdocs.html

## __Amazon Elastic MapReduce__
  - ### Features
    - EMR now supports new DescribeReleaseLabel and ListReleaseLabel APIs. They can provide Amazon EMR release label details. You can programmatically list available releases and applications for a specific Amazon EMR release label.

## __Amazon Personalize__
  - ### Features
    - My AWS Service (placeholder) - Making minProvisionedTPS an optional parameter when creating a campaign. If not provided, it defaults to 1.

## __Amazon Relational Database Service__
  - ### Features
    - Adds the OriginalSnapshotCreateTime field to the DBSnapshot response object. This field timestamps the underlying data of a snapshot and doesn't change when the snapshot is copied.

## __Elastic Load Balancing__
  - ### Features
    - Adds support for enabling TLS protocol version and cipher suite headers to be sent to backend targets for Application Load Balancers.

# __2.17.1__ __2021-07-20__
## __AWS Compute Optimizer__
  - ### Features
    - Documentation updates for Compute Optimizer

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added idempotency to the CreateVolume API using the ClientToken request parameter

# __2.17.0__ __2021-07-19__
## __AWS Direct Connect__
  - ### Features
    - Documentation updates for directconnect

## __AWS Health APIs and Notifications__
  - ### Features
    - In the Health API, the maximum number of entities for the EventFilter and EntityFilter data types has changed from 100 to 99. This change is related to an internal optimization of the AWS Health service.

## __AWS RoboMaker__
  - ### Features
    - This release allows customers to create a new version of WorldTemplates with support for Doors.

## __AWS SDK for Java v2__
  - ### Features
    - Moved Jackson from an external SDK dependency to an internal dependency: https://aws.amazon.com/blogs/developer/the-aws-sdk-for-java-2-17-removes-its-external-dependency-on-jackson/

## __Amazon EMR Containers__
  - ### Features
    - Updated DescribeManagedEndpoint and ListManagedEndpoints to return failureReason and stateDetails in API response.

## __Amazon Location Service__
  - ### Features
    - Add five new API operations: UpdateGeofenceCollection, UpdateMap, UpdatePlaceIndex, UpdateRouteCalculator, UpdateTracker.

## __EC2 Image Builder__
  - ### Features
    - Documentation updates for reversal of default value for additional instance configuration SSM switch, plus improved descriptions for semantic versioning.

# __2.16.104__ __2021-07-16__
## __AWS Audit Manager__
  - ### Features
    - This release relaxes the S3 URL character restrictions in AWS Audit Manager. Regex patterns have been updated for the following attributes: s3RelativePath, destination, and s3ResourcePath. 'AWS' terms have also been replaced with entities to align with China Rebrand documentation efforts.

## __AWS SDK for Java v2__
  - ### Features
    - This changes implements support for the `AWS_EC2_METADATA_SERVICE_ENDPOINT_MODE` environment variable and
      `ec2_metadata_service_endpoint` profile file property.

      When no endpoint override is set using `AWS_EC2_METADATA_SERVICE_ENDPOINT`, this configuration controls which of the default
      IMDS endpoints the client will use.  Valid values are `IPv4` or `IPv6`
    - Updated service endpoint metadata.

## __Amazon AppIntegrations Service__
  - ### Features
    - Documentation update for AppIntegrations Service

## __Amazon Chime__
  - ### Features
    - This SDK release adds Account Status as one of the attributes in Account API response

# __2.16.103__ __2021-07-15__
## __AWS IoT SiteWise__
  - ### Features
    - Update the default endpoint for the APIs used to manage asset models, assets, gateways, tags, and account configurations. If you have firewalls with strict egress rules, configure the rules to grant you access to api.iotsitewise.[region].amazonaws.com or api.iotsitewise.[cn-region].amazonaws.com.cn.

## __AWS SDK for Java v2__
  - ### Features
    - Add support for marshalling lists of strings in HTTP headers

## __Amazon Cognito Identity Provider__
  - ### Features
    - Documentation updates for cognito-idp

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation updates for support of awsvpc mode on Windows.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This feature enables customers to specify weekly recurring time window(s) for scheduled events that reboot, stop or terminate EC2 instances.

## __Amazon Lex Model Building Service__
  - ### Features
    - Lex now supports the en-IN locale

# __2.16.102__ __2021-07-14__
## __AWS Certificate Manager__
  - ### Features
    - Added support for RSA 3072 SSL certificate import

## __AWS Database Migration Service__
  - ### Features
    - Release of feature needed for ECA-Endpoint settings. This allows customer to delete a field in endpoint settings by using --exact-settings flag in modify-endpoint api. This also displays default values for certain required fields of endpoint settings in describe-endpoint-settings api.

## __AWS Glue__
  - ### Features
    - Add support for Event Driven Workflows

## __AWS SDK for Java v2__
  - ### Documentations
    - Update pull request template to place motivation before description
        - Contributed by: [@Bennett-Lynch](https://github.com/Bennett-Lynch)

## __AWS Well-Architected Tool__
  - ### Features
    - This update provides support for Well-Architected API users to mark answer choices as not applicable.

## __Amazon HealthLake__
  - ### Features
    - General availability for Amazon HealthLake. StartFHIRImportJob and StartFHIRExportJob APIs now require AWS KMS parameter. For more information, see the Amazon HealthLake Documentation https://docs.aws.amazon.com/healthlake/index.html.

## __Amazon Lightsail__
  - ### Features
    - This release adds support for the Amazon Lightsail object storage service, which allows you to create buckets and store objects.

## __Contributors__
Special thanks to the following contributors to this release: 

[@Bennett-Lynch](https://github.com/Bennett-Lynch)
# __2.16.101__ __2021-07-13__
## __AWS Direct Connect__
  - ### Features
    - This release adds a new filed named awsLogicalDeviceId that it displays the AWS Direct Connect endpoint which terminates a physical connection's BGP Sessions.

## __AWS Price List Service__
  - ### Features
    - Documentation updates for api.pricing

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon DevOps Guru__
  - ### Features
    - Add paginator for GetCostEstimation

## __Amazon Lex Model Building Service__
  - ### Features
    - Customers can now migrate bots built with Lex V1 APIs to V2 APIs. This release adds APIs to initiate and manage the migration of a bot.

## __Amazon Redshift__
  - ### Features
    - Release new APIs to support new Redshift feature - Authentication Profile

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Changes to OpsCenter APIs to support a new feature, operational insights.

## __AmplifyBackend__
  - ### Features
    - Added Sign in with Apple OAuth provider.

# __2.16.100__ __2021-07-12__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports Principal Store

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Documentation updates for Wesley to support the parallel node upgrade feature.

# __2.16.99__ __2021-07-09__
## __AWS Elemental MediaConvert__
  - ### Features
    - MediaConvert now supports color, style and position information passthrough from 608 and Teletext to SRT and WebVTT subtitles. MediaConvert now also supports Automatic QVBR quality levels for QVBR RateControlMode.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.
    - Use EnumMap where possible.
        - Contributed by: [@Bennett-Lynch](https://github.com/Bennett-Lynch)

## __Amazon Fraud Detector__
  - ### Features
    - This release adds support for ML Explainability to display model variable importance value in Amazon Fraud Detector.

## __Amazon SageMaker Service__
  - ### Features
    - Releasing new APIs related to Tuning steps in model building pipelines.

## __Contributors__
Special thanks to the following contributors to this release: 

[@Bennett-Lynch](https://github.com/Bennett-Lynch)
# __2.16.98__ __2021-07-08__
## __AWS MediaTailor__
  - ### Features
    - Add ListAlerts for Channel, Program, Source Location, and VOD Source to return alerts for resources.

## __AWS Outposts__
  - ### Features
    - Added property filters for listOutposts

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Systems Manager Incident Manager Contacts__
  - ### Features
    - Updated description for CreateContactChannel contactId.

## __Amazon DevOps Guru__
  - ### Features
    - Add AnomalyReportedTimeRange field to include open and close time of anomalies.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Added waiters for EKS FargateProfiles.

## __Firewall Management Service__
  - ### Features
    - AWS Firewall Manager now supports route table monitoring, and provides remediation action recommendations to security administrators for AWS Network Firewall policies with misconfigured routes.

# __2.16.97__ __2021-07-07__
## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for AWS Identity and Access Management (IAM).

## __AWS IoT SiteWise__
  - ### Features
    - This release add storage configuration APIs for AWS IoT SiteWise.

## __AWS Security Token Service__
  - ### Features
    - Documentation updates for AWS Security Token Service.

## __AWS Storage Gateway__
  - ### Features
    - Adding support for oplocks for SMB file shares, S3 Access Point and S3 Private Link for all file shares and IP address support for file system associations

## __Amazon Chime__
  - ### Features
    - Releasing new APIs for AWS Chime MediaCapturePipeline

## __Amazon CloudFront__
  - ### Features
    - Amazon CloudFront now provides two new APIs, ListConflictingAliases and AssociateAlias, that help locate and move Alternate Domain Names (CNAMEs) if you encounter the CNAMEAlreadyExists error code.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds resource ids and tagging support for VPC security group rules.

## __AmazonMQ__
  - ### Features
    - adds support for modifying the maintenance window for brokers.

# __2.16.96__ __2021-07-06__
## __AWS Lambda__
  - ### Features
    - Added support for AmazonMQRabbitMQ as an event source. Added support for VIRTUAL_HOST as SourceAccessType for streams event source mappings.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adding new error code UnsupportedAddonModification for Addons in EKS

## __Amazon Macie 2__
  - ### Features
    - Sensitive data findings in Amazon Macie now include enhanced location data for JSON and JSON Lines files

## __Amazon Simple Notification Service__
  - ### Features
    - Documentation updates for Amazon SNS.

## __Application Migration Service__
  - ### Features
    - Bug fix: Remove not supported EBS encryption type "NONE"

## __EC2 Image Builder__
  - ### Features
    - Adds support for specifying parameters to customize components for recipes. Expands configuration of the Amazon EC2 instances that are used for building and testing images, including the ability to specify commands to run on launch, and more control over installation and removal of the SSM agent.

# __2.16.95__ __2021-07-02__
## __AWS SDK for Java v2__
  - ### Bugfixes
    - [UrlConnectionHttpClient] Wrap erroneous NPE from HttpURLConnection as IOException
        - Contributed by: [@Bennett-Lynch](https://github.com/Bennett-Lynch)

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release removes network-insights-boundary

## __Elastic Load Balancing__
  - ### Features
    - Documentation updates for elasticloadbalancingv2

## __Contributors__
Special thanks to the following contributors to this release: 

[@Bennett-Lynch](https://github.com/Bennett-Lynch)
# __2.16.94__ __2021-07-01__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adding a new reserved field to support future infrastructure improvements for Amazon EC2 Fleet.

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker model registry now supports up to 5 containers and associated environment variables.

## __Amazon Simple Queue Service__
  - ### Features
    - Documentation updates for Amazon SQS.

# __2.16.93__ __2021-06-30__
## __AWS Cloud Map__
  - ### Features
    - AWS Cloud Map now allows configuring the TTL of the SOA record for a hosted zone to control the negative caching for new services.

## __AWS Elemental MediaPackage VOD__
  - ### Features
    - Add support for Widevine DRM on CMAF packaging configurations. Both Widevine and FairPlay DRMs can now be used simultaneously, with CBCS encryption.

## __AWS Glue DataBrew__
  - ### Features
    - Adds support for the output of job results to the AWS Glue Data Catalog.

## __AWS Systems Manager Incident Manager Contacts__
  - ### Features
    - Fixes the tag key length range to 128 chars, tag value length to 256 chars; Adds support for UTF-8 chars for contact and channel names, Allows users to unset name in UpdateContact API; Adds throttling exception to StopEngagement API, validation exception to APIs UntagResource, ListTagsForResource

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra Enterprise Edition now offered in smaller more granular units to enable customers with smaller workloads. Virtual Storage Capacity units now offer scaling in increments of 100,000 documents (up to 30GB) per unit and Virtual Query Units offer scaling increments of 8,000 queries per day.

## __Auto Scaling__
  - ### Features
    - Amazon EC2 Auto Scaling infrastructure improvements and optimizations.

# __2.16.92__ __2021-06-28__
## __AWS Elemental MediaConvert__
  - ### Features
    - MediaConvert adds support for HDR10+, ProRes 4444, and XAVC outputs, ADM/DAMF support for Dolby Atmos ingest, and alternative audio and WebVTT caption ingest via HLS inputs. MediaConvert also now supports creating trickplay outputs for Roku devices for HLS, CMAF, and DASH output groups.

## __AWS Glue__
  - ### Features
    - Add JSON Support for Glue Schema Registry

## __Amazon Redshift__
  - ### Features
    - Added InvalidClusterStateFault to the DisableLogging API, thrown when calling the API on a non available cluster.

## __Amazon SageMaker Service__
  - ### Features
    - Sagemaker Neo now supports running compilation jobs using customer's Amazon VPC

# __2.16.91__ __2021-06-25__
## __AWS Proton__
  - ### Features
    - Added waiters for template registration, service operations, and environment deployments.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Import/Export Snowball__
  - ### Features
    - AWS Snow Family customers can remotely monitor and operate their connected AWS Snowcone devices. AWS Snowball Edge Storage Optimized customers can now import and export their data using NFS.

## __AmplifyBackend__
  - ### Features
    - Imports an existing backend authentication resource.

# __2.16.90__ __2021-06-24__
## __AWS Cloud9__
  - ### Features
    - Minor update to AWS Cloud9 documentation to allow correct parsing of outputted text

## __AWS CodeBuild__
  - ### Features
    - BucketOwnerAccess is currently not supported

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS SecurityHub__
  - ### Features
    - Added new resource details for ECS clusters and ECS task definitions. Added additional information for S3 buckets, Elasticsearch domains, and API Gateway V2 stages.

## __AWS Transfer Family__
  - ### Features
    - Customers can successfully use legacy clients with Transfer Family endpoints enabled for FTPS and FTP behind routers, firewalls, and load balancers by providing a Custom IP address used for data channel communication.

## __AWS WAFV2__
  - ### Features
    - Added support for 15 new text transformation.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports SharePoint 2013 and SharePoint 2016 when using a SharePoint data source.

## __Amazon Chime__
  - ### Features
    - Adds EventIngestionUrl field to MediaPlacement

## __Amazon Connect Service__
  - ### Features
    - Released Amazon Connect quick connects management API for general availability (GA). For more information, see https://docs.aws.amazon.com/connect/latest/APIReference/Welcome.html

## __Amazon DynamoDB Accelerator (DAX)__
  - ### Features
    - Add support for encryption in transit to DAX clusters.

# __2.16.89__ __2021-06-23__
## __AWS Cloud9__
  - ### Features
    - Updated documentation for CreateEnvironmentEC2 to explain that because Amazon Linux AMI has ended standard support as of December 31, 2020, we recommend you choose Amazon Linux 2--which includes long term support through 2023--for new AWS Cloud9 environments.

## __AWS License Manager__
  - ### Features
    - AWS License Manager now allows license administrators and end users to communicate to each other by setting custom status reasons when updating the status on a granted license.

## __AWS MediaTailor__
  - ### Features
    - Update GetChannelSchedule to return information on ad breaks.

## __Amazon CloudFront__
  - ### Features
    - Amazon CloudFront adds support for a new security policy, TLSv1.2_2021.

## __Amazon CloudSearch__
  - ### Features
    - This release replaces previous generation CloudSearch instances with equivalent new instances that provide better stability at the same price.

## __Amazon CloudWatch Events__
  - ### Features
    - Added the following parameters to ECS targets: CapacityProviderStrategy, EnableECSManagedTags, EnableExecuteCommand, PlacementConstraints, PlacementStrategy, PropagateTags, ReferenceId, and Tags

## __Amazon CodeGuru Reviewer__
  - ### Features
    - Adds support for S3 based full repository analysis and changed lines scan.

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - DocumentDB documentation-only edits

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for provisioning your own IP (BYOIP) range in multiple regions. This feature is in limited Preview for this release. Contact your account manager if you are interested in this feature.

## __Amazon EventBridge__
  - ### Features
    - Added the following parameters to ECS targets: CapacityProviderStrategy, EnableECSManagedTags, EnableExecuteCommand, PlacementConstraints, PlacementStrategy, PropagateTags, ReferenceId, and Tags

## __Amazon QuickSight__
  - ### Features
    - Releasing new APIs for AWS QuickSight Folders

# __2.16.88__ __2021-06-21__
## __AWS CloudFormation__
  - ### Features
    - CloudFormation registry service now supports 3rd party public type sharing

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

# __2.16.87__ __2021-06-17__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports the indexing of web documents for search through the web crawler.

## __Amazon Chime__
  - ### Features
    - This release adds a new API UpdateSipMediaApplicationCall, to update an in-progress call for SipMediaApplication.

## __Amazon Relational Database Service__
  - ### Features
    - This release enables Database Activity Streams for RDS Oracle

## __Amazon SageMaker Service__
  - ### Features
    - Enable ml.g4dn instance types for SageMaker Batch Transform and SageMaker Processing

# __2.16.86__ __2021-06-16__
## __AWS Key Management Service__
  - ### Features
    - Adds support for multi-Region keys

## __AWS MediaTailor__
  - ### Features
    - Adds AWS Secrets Manager Access Token Authentication for Source Locations

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for VLAN-tagged network traffic over an Elastic Network Interface (ENI). This feature is in limited Preview for this release. Contact your account manager if you are interested in this feature.

## __Amazon Relational Database Service__
  - ### Features
    - This release enables fast cloning in Aurora Serverless. You can now clone between Aurora Serverless clusters and Aurora Provisioned clusters.

# __2.16.85__ __2021-06-15__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Connect Service__
  - ### Features
    - This release adds new sets of APIs: AssociateBot, DisassociateBot, and ListBots. You can use it to programmatically add an Amazon Lex bot or Amazon Lex V2 bot on the specified Amazon Connect instance

## __Amazon Elastic Compute Cloud__
  - ### Features
    - EC2 M5n, M5dn, R5n, R5dn metal instances with 100 Gbps network performance and Elastic Fabric Adapter (EFA) for ultra low latency

## __Amazon Lex Model Building V2__
  - ### Features
    - This release adds support for Multi Valued slots in Amazon Lex V2 APIs for model building

## __Amazon Lex Runtime V2__
  - ### Features
    - This release adds support for Multi Valued slots in Amazon Lex V2 APIs for runtime

## __Redshift Data API Service__
  - ### Features
    - Redshift Data API service now supports SQL parameterization.

# __2.16.84__ __2021-06-14__
## __AWS IoT Analytics__
  - ### Features
    - Adds support for data store partitions.

## __AWS IoT Greengrass V2__
  - ### Features
    - We have verified the APIs being released here and are ready to release

## __Amazon Lookout for Metrics__
  - ### Features
    - Added "LEARNING" status for anomaly detector and updated description for "Offset" parameter in MetricSet APIs.

# __2.16.83__ __2021-06-11__
## __AWS Elemental MediaLive__
  - ### Features
    - AWS MediaLive now supports OCR-based conversion of DVB-Sub and SCTE-27 image-based source captions to WebVTT, and supports ingest of ad avail decorations in HLS input manifests.

## __AWS MediaConnect__
  - ### Features
    - When you enable source failover, you can now designate one of two sources as the primary source. You can choose between two failover modes to prevent any disruption to the video stream. Merge combines the sources into a single stream. Failover allows switching between a primary and a backup stream.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 adds new AMI property to flag outdated AMIs

# __2.16.82__ __2021-06-10__
## __AWS App Mesh__
  - ### Features
    - AppMesh now supports additional routing capabilities in match and rewrites for Gateway Routes and Routes. Additionally, App Mesh also supports specifying DNS Response Types in Virtual Nodes.

## __AWS Resource Access Manager__
  - ### Features
    - AWS Resource Access Manager (RAM) is releasing new field isResourceTypeDefault in ListPermissions and GetPermission response, and adding permissionArn parameter to GetResourceShare request to filter by permission attached

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix for PR [#2510](https://github.com/aws/aws-sdk-java-v2/issues/2510) by adding Support for customization of contentType for Header ContentType for services like aws WellArchitected service.

## __Amazon Appflow__
  - ### Features
    - Adding MAP_ALL task type support.

## __Amazon Chime__
  - ### Features
    - This SDK release adds support for UpdateAccount API to allow users to update their default license on Chime account.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Amazon Cognito now supports targeted sign out through refresh token revocation

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds a new optional parameter connectivityType (public, private) for the CreateNatGateway API. Private NatGateway does not require customers to attach an InternetGateway to the VPC and can be used for communication with other VPCs and on-premise networks.

## __Amazon Managed Blockchain__
  - ### Features
    - This release supports KMS customer-managed Customer Master Keys (CMKs) on member-specific Hyperledger Fabric resources.

## __Amazon Redshift__
  - ### Features
    - Added InvalidClusterStateFault to the ModifyAquaConfiguration API, thrown when calling the API on a non available cluster.

## __Amazon SageMaker Feature Store Runtime__
  - ### Features
    - Release BatchGetRecord API for AWS SageMaker Feature Store Runtime.

## __Amazon SageMaker Service__
  - ### Features
    - Using SageMaker Edge Manager with AWS IoT Greengrass v2 simplifies accessing, maintaining, and deploying models to your devices. You can now create deployable IoT Greengrass components during edge packaging jobs. You can choose to create a device fleet with or without creating an AWS IoT role alias.

# __2.16.81__ __2021-06-09__
## __AWS Proton__
  - ### Features
    - This is the initial SDK release for AWS Proton

## __AWS Transfer Family__
  - ### Features
    - Documentation updates for the AWS Transfer Family service.

## __AWSKendraFrontendService__
  - ### Features
    - AWS Kendra now supports checking document status.

## __Amazon Personalize Events__
  - ### Features
    - Support for unstructured text inputs in the items dataset to to automatically extract key information from product/content description as an input when creating solution versions.

# __2.16.80__ __2021-06-08__
## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix for NullPointerException while Marshalling List/Map of TimeStamps

## __AWS Service Catalog__
  - ### Features
    - increase max pagesize for List/Search apis

## __Amazon Cognito Identity Provider__
  - ### Features
    - Documentation updates for cognito-idp

## __Amazon FSx__
  - ### Features
    - This release adds support for auditing end-user access to files, folders, and file shares using Windows event logs, enabling customers to meet their security and compliance needs.

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API introduces stricter validation of S3 object criteria for classification jobs.

# __2.16.79__ __2021-06-07__
## __AWS Glue__
  - ### Features
    - Add SampleSize variable to S3Target to enable s3-sampling feature through API.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Added updateConfig option that allows customers to control upgrade velocity in Managed Node Group.

## __Amazon Personalize__
  - ### Features
    - Update regex validation in kmsKeyArn and s3 path API parameters for AWS Personalize APIs

## __Amazon SageMaker Service__
  - ### Features
    - AWS SageMaker - Releasing new APIs related to Callback steps in model building pipelines. Adds experiment integration to model building pipelines.

# __2.16.78__ __2021-06-04__
## __AWS CloudTrail__
  - ### Features
    - AWS CloudTrail supports data events on new service resources, including Amazon DynamoDB tables and S3 Object Lambda access points.

## __AWS Elemental MediaLive__
  - ### Features
    - Add support for automatically setting the H.264 adaptive quantization and GOP B-frame fields.

## __AWS Performance Insights__
  - ### Features
    - The new GetDimensionKeyDetails action retrieves the attributes of the specified dimension group for a DB instance or data source.

## __Amazon QLDB__
  - ### Features
    - Documentation updates for Amazon QLDB

## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for RDS: fixing an outdated link to the RDS documentation in DBInstance$DBInstanceStatus

## __Auto Scaling__
  - ### Features
    - Documentation updates for Amazon EC2 Auto Scaling

# __2.16.77__ __2021-06-03__
## __AWS S3 Control__
  - ### Features
    - Amazon S3 Batch Operations now supports S3 Bucket Keys.

## __Amazon Forecast Service__
  - ### Features
    - Added optional field AutoMLOverrideStrategy to CreatePredictor API that allows users to customize AutoML strategy. If provided in CreatePredictor request, this field is visible in DescribePredictor and GetAccuracyMetrics responses.

## __Amazon Route 53 Resolver__
  - ### Features
    - Documentation updates for Route 53 Resolver

## __Amazon Simple Storage Service__
  - ### Features
    - S3 Inventory now supports Bucket Key Status

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Documentation updates for ssm to fix customer reported issue

# __2.16.76__ __2021-06-02__
## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for AWS Identity and Access Management (IAM).

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - This SDK release adds support for DocDB global clusters.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation updates for Amazon ECS.

## __Amazon Lightsail__
  - ### Features
    - Documentation updates for Lightsail

## __Auto Scaling__
  - ### Features
    - You can now launch EC2 instances with GP3 volumes when using Auto Scaling groups with Launch Configurations

## __Braket__
  - ### Features
    - Introduction of a RETIRED status for devices.

# __2.16.75__ __2021-06-01__
## __AWS Cloud Map__
  - ### Features
    - Bugfixes - The DiscoverInstances API operation now provides an option to return all instances for health-checked services when there are no healthy instances available.

## __AWS IoT Wireless__
  - ### Features
    - Added six new public customer logging APIs to allow customers to set/get/reset log levels at resource type and resource id level. The log level set from the APIs will be used to filter log messages that can be emitted to CloudWatch in customer accounts.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added idempotency to CreateNetworkInterface using the ClientToken parameter.

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds new Canadian French voice - Gabrielle. Gabrielle is available as Neural voice only.

## __Amazon Simple Notification Service__
  - ### Features
    - This release adds SMS sandbox in Amazon SNS and the ability to view all configured origination numbers. The SMS sandbox provides a safe environment for sending SMS messages, without risking your reputation as an SMS sender.

# __2.16.74__ __2021-05-28__
## __AWS DataSync__
  - ### Features
    - Added SecurityDescriptorCopyFlags option that allows for control of which components of SMB security descriptors are copied from source to destination objects.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Fixed the issue where the SDK failed to parse timestamps with offsets. See [#2477](https://github.com/aws/aws-sdk-java-v2/issues/2477)

## __Amazon Location Service__
  - ### Features
    - Adds support for calculation of routes, resource tagging and customer provided KMS keys.

## __Amazon Lookout for Metrics__
  - ### Features
    - Allowing dot(.) character in table name for RDS and Redshift as source connector.

# __2.16.73__ __2021-05-27__
## __AWS Device Farm__
  - ### Features
    - Introduces support for using our desktop testing service with applications hosted within your Virtual Private Cloud (VPC).

## __AWS IoT Events__
  - ### Features
    - Releasing new APIs for AWS IoT Events Alarms

## __AWS IoT Events Data__
  - ### Features
    - Releasing new APIs for AWS IoT Events Alarms

## __AWS IoT SiteWise__
  - ### Features
    - IoT SiteWise Monitor Portal API updates to add alarms feature configuration.

## __AWS Resource Groups__
  - ### Features
    - Documentation updates for Resource Groups.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now suggests popular queries in order to help guide query typing and help overall accuracy.

## __Amazon FSx__
  - ### Features
    - This release adds LZ4 data compression support to FSx for Lustre to reduce storage consumption of both file system storage and file system backups.

## __Amazon Lightsail__
  - ### Features
    - Documentation updates for Lightsail

## __Amazon Simple Queue Service__
  - ### Features
    - Documentation updates for Amazon SQS for General Availability of high throughput for FIFO queues.

# __2.16.72__ __2021-05-26__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release removes resource ids and tagging support for VPC security group rules.

# __2.16.71__ __2021-05-26__
## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - This release enables customers to store CRLs in S3 buckets with Block Public Access enabled. The release adds the S3ObjectAcl parameter to the CreateCertificateAuthority and UpdateCertificateAuthority APIs to allow customers to choose whether their CRL will be publicly available.

## __AWS Outposts__
  - ### Features
    - Add ConflictException to DeleteOutpost, CreateOutpost

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon CloudFront__
  - ### Features
    - Documentation fix for CloudFront

## __Amazon EC2 Container Service__
  - ### Features
    - The release adds support for registering External instances to your Amazon ECS clusters.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds resource ids and tagging support for VPC security group rules.

## __Amazon QLDB__
  - ### Features
    - Support STANDARD permissions mode in CreateLedger and DescribeLedger. Add UpdateLedgerPermissionsMode to update permissions mode on existing ledgers.

## __AmazonMWAA__
  - ### Features
    - Adds scheduler count selection for Environments using Airflow version 2.0.2 or later.

# __2.16.70__ __2021-05-25__
## __AWS IoT__
  - ### Features
    - This release includes support for a new feature: Job templates for AWS IoT Device Management Jobs. The release includes job templates as a new resource and APIs for managing job templates.

## __AWS Transfer Family__
  - ### Features
    - AWS Transfer Family customers can now use AWS Managed Active Directory or AD Connector to authenticate their end users, enabling seamless migration of file transfer workflows that rely on AD authentication, without changing end users' credentials or needing a custom authorizer.

## __Amazon WorkSpaces__
  - ### Features
    - Adds support for Linux device types in WorkspaceAccessProperties

# __2.16.69__ __2021-05-24__
## __AWS Compute Optimizer__
  - ### Features
    - Adds support for 1) additional instance types, 2) additional instance metrics, 3) finding reasons for instance recommendations, and 4) platform differences between a current instance and a recommended instance type.

## __AWS Cost Explorer Service__
  - ### Features
    - Introduced FindingReasonCodes, PlatformDifferences, DiskResourceUtilization and NetworkResourceUtilization to GetRightsizingRecommendation action

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon CloudWatch Logs__
  - ### Features
    - This release provides dimensions and unit support for metric filters.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for creating and managing EC2 On-Demand Capacity Reservations on Outposts.

## __Amazon QuickSight__
  - ### Features
    - Add new parameters on RegisterUser and UpdateUser APIs to assign or update external ID associated to QuickSight users federated through web identity.

# __2.16.68__ __2021-05-21__
## __AWS OpsWorks CM__
  - ### Features
    - New PUPPET_API_CRL attribute returned by DescribeServers API; new EngineVersion of 2019 available for Puppet Enterprise servers.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Elastic File System__
  - ### Features
    - EFS now supports account preferences. Utilizing the new capability, users can customize some aspects of their experience using EFS APIs and the EFS Console. The first preference clients are able to set is whether to start using longer File System and Mount Target IDs before EFS migrates to such IDs.

## __Amazon Forecast Service__
  - ### Features
    - Updated attribute statistics in DescribeDatasetImportJob response to support Long values

## __Amazon Simple Storage Service__
  - ### Features
    - Documentation updates for Amazon S3

# __2.16.67__ __2021-05-20__
## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for AWS Identity and Access Management (IAM).

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Lex Model Building V2__
  - ### Features
    - Customers can now use resource-based policies to control access to their Lex V2 bots. This release adds APIs to attach and manage permissions for a bot or a bot alias. For details, see: https://docs.aws.amazon.com/lexv2/latest/dg/security_iam_service-with-iam.html

## __Amazon Personalize__
  - ### Features
    - Added new API to stop a solution version creation that is pending or in progress for Amazon Personalize

## __Amazon QuickSight__
  - ### Features
    - Add ARN based Row Level Security support to CreateDataSet/UpdateDataSet APIs.

# __2.16.66__ __2021-05-19__
## __AWS Identity and Access Management__
  - ### Features
    - Add pagination to ListUserTags operation

## __AWS S3__
  - ### Bugfixes
    - Do not allow cross-region requests for S3 client with Fips Region.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Update the EKS AddonActive waiter.

## __Amazon Kinesis Analytics__
  - ### Features
    - Kinesis Data Analytics now allows rapid iteration on Apache Flink stream processing through the Kinesis Data Analytics Studio feature.

## __Amazon Lightsail__
  - ### Features
    - Documentation updates for Amazon Lightsail.

## __Amazon Rekognition__
  - ### Features
    - Amazon Rekognition Custom Labels adds support for customer managed encryption, using AWS Key Management Service, of image files copied into the service and files written back to the customer.

## __Auto Scaling__
  - ### Features
    - With this release, customers can easily use Predictive Scaling as a policy directly through Amazon EC2 Auto Scaling configurations to proactively scale their applications ahead of predicted demand.

# __2.16.65__ __2021-05-18__
## __AWS App Runner__
  - ### Features
    - AWS App Runner is a service that provides a fast, simple, and cost-effective way to deploy from source code or a container image directly to a scalable and secure web application in the AWS Cloud.

## __AWS Compute Optimizer__
  - ### Features
    - This release enables compute optimizer to support exporting recommendations to Amazon S3 for EBS volumes and Lambda Functions.

## __AWS IoT SiteWise__
  - ### Features
    - Documentation updates for AWS IoT SiteWise.

## __AWS License Manager__
  - ### Features
    - AWS License Manager now supports periodic report generation.

## __AWS Support__
  - ### Features
    - Documentation updates for support

## __Amazon Lex Model Building V2__
  - ### Features
    - This release adds support for exporting and importing Lex V2 bots and bot locales. It also adds validations to enforce minimum number of tags on Lex V2 resources. For details, see https://docs.aws.amazon.com/lexv2/latest/dg/importing-exporting.html

## __Amazon Personalize__
  - ### Features
    - Amazon Personalize now supports the ability to optimize a solution for a custom objective in addition to maximizing relevance.

# __2.16.64__ __2021-05-17__
## __AWS Application Cost Profiler__
  - ### Features
    - APIs for AWS Application Cost Profiler.

## __AWS IoT Core Device Advisor__
  - ### Features
    - AWS IoT Core Device Advisor is fully managed test capability for IoT devices. Device manufacturers can use Device Advisor to test their IoT devices for reliable and secure connectivity with AWS IoT.

## __AWS MediaConnect__
  - ### Features
    - MediaConnect now supports JPEG XS for AWS Cloud Digital Interface (AWS CDI) uncompressed workflows, allowing you to establish a bridge between your on-premises live video network and the AWS Cloud.

## __Amazon Augmented AI Runtime__
  - ### Features
    - Documentation updates for Amazon A2I Runtime model

## __Amazon ElastiCache__
  - ### Features
    - Documentation updates for elasticache

## __Amazon Neptune__
  - ### Features
    - Neptune support for CopyTagsToSnapshots

# __2.16.63__ __2021-05-14__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS SecurityHub__
  - ### Features
    - Updated descriptions to add notes on array lengths.

## __Amazon CloudWatch Events__
  - ### Features
    - Update InputTransformer variable limit from 10 to 100 variables.

## __Amazon Detective__
  - ### Features
    - Updated descriptions of array parameters to add the restrictions on the array and value lengths.

## __Amazon Elasticsearch Service__
  - ### Features
    - Adds support for cold storage.

## __Amazon EventBridge__
  - ### Features
    - Update InputTransformer variable limit from 10 to 100 variables.

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API adds support for defining run-time, S3 bucket criteria for classification jobs. It also adds resources for querying data about AWS resources that Macie monitors.

## __Amazon Transcribe Service__
  - ### Features
    - Transcribe Medical now supports identification of PHI entities within transcripts

## __EC2 Image Builder__
  - ### Features
    - Text-only updates for bundled documentation feedback tickets - spring 2021.

# __2.16.62__ __2021-05-12__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - High Memory virtual instances are powered by Intel Sky Lake CPUs and offer up to 12TB of memory.

## __Netty NIO Async HTTP Client__
  - ### Features
    - Add `tcpKeepAlive` configuration.

# __2.16.61__ __2021-05-11__
## __AWS S3 Control__
  - ### Features
    - Documentation updates for Amazon S3-control

## __AWS Systems Manager Incident Manager__
  - ### Features
    - AWS Systems Manager Incident Manager enables faster resolution of critical application availability and performance issues, management of contacts and post-incident analysis

## __AWS Systems Manager Incident Manager Contacts__
  - ### Features
    - AWS Systems Manager Incident Manager enables faster resolution of critical application availability and performance issues, management of contacts and post incident analysis

## __Amazon Transcribe Streaming Service__
  - ### Features
    - Amazon Transcribe supports partial results stabilization for streaming transcription.

# __2.16.60__ __2021-05-10__
## __AWS Config__
  - ### Features
    - Adds paginator to multiple APIs: By default, the paginator allows user to iterate over the results and allows the CLI to return up to 1000 results.

## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for Kantar SNAP File Audio Watermarking with a Kantar Watermarking account, and Display Definition Segment(DDS) segment data controls for DVB-Sub caption outputs.

## __AWS IoT Wireless__
  - ### Features
    - Add three new optional fields to support filtering and configurable sub-band in WirelessGateway APIs. The filtering is for all the RF region supported. The sub-band configuration is only applicable to LoRa gateways of US915 or AU915 RF region.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon DynamoDB__
  - ### Features
    - Support delete-table operation in DDBEnhanced.

## __Amazon EC2 Container Service__
  - ### Features
    - This release contains updates for Amazon ECS.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - This release updates create-nodegroup and update-nodegroup-config APIs for adding/updating taints on managed nodegroups.

## __Amazon Kinesis Analytics__
  - ### Features
    - Amazon Kinesis Analytics now supports ListApplicationVersions and DescribeApplicationVersion API for Apache Flink applications

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release adds new APIs to associate, disassociate and list related items in SSM OpsCenter; and this release adds DisplayName as a version-level attribute for SSM Documents and introduces two new document types: ProblemAnalysis, ProblemAnalysisTemplate.

## __CodeArtifact__
  - ### Features
    - Documentation updates for CodeArtifact

# __2.16.59__ __2021-05-07__
## __AWS Lake Formation__
  - ### Features
    - This release adds Tag Based Access Control to AWS Lake Formation service

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fixed an issue where an async waiter failed to match exception when the exception was wrapped with CompletionException. See [#2460](https://github.com/aws/aws-sdk-java-v2/issues/2460)

## __Amazon Connect Service__
  - ### Features
    - Adds tagging support for Connect APIs CreateIntegrationAssociation and CreateUseCase.

## __Amazon Lookout for Metrics__
  - ### Features
    - Enforcing UUID style for parameters that are already in UUID format today. Documentation specifying eventual consistency of lookoutmetrics resources.

# __2.16.58__ __2021-05-06__
## __AWS Cloud Map__
  - ### Features
    - Bugfix: Improved input validation for RegisterInstance action, InstanceId field

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Import/Export Snowball__
  - ### Features
    - AWS Snow Family adds APIs for ordering and managing Snow jobs with long term pricing

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - SSM feature release - ChangeCalendar integration with StateManager.

## __Managed Streaming for Kafka__
  - ### Features
    - IAM Access Control for Amazon MSK enables you to create clusters that use IAM to authenticate clients and to allow or deny Apache Kafka actions for those clients.

# __2.16.57__ __2021-05-05__
## __AWS Audit Manager__
  - ### Features
    - This release updates the CreateAssessmentFrameworkControlSet and UpdateAssessmentFrameworkControlSet API data types. For both of these data types, the control set name is now a required attribute.

## __Amazon Kinesis Analytics__
  - ### Features
    - Amazon Kinesis Analytics now supports RollbackApplication for Apache Flink applications to revert the application to the previous running version

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Autopilot now provides the ability to automatically deploy the best model to an endpoint

## __AmazonNimbleStudio__
  - ### Features
    - Documentation Updates for Amazon Nimble Studio.

# __2.16.56__ __2021-05-04__
## __FinSpace Public API__
  - ### Features
    - Documentation updates for FinSpaceData API.

## __FinSpace User Environment Management service__
  - ### Features
    - Documentation updates for FinSpace API.

# __2.16.55__ __2021-05-04__
## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - This release adds the KeyStorageSecurityStandard parameter to the CreateCertificateAuthority API to allow customers to mandate a security standard to which the CA key will be stored within.

## __AWS Health APIs and Notifications__
  - ### Features
    - Documentation updates for health

## __Amazon Chime__
  - ### Features
    - This release adds the ability to search for and order international phone numbers for Amazon Chime SIP media applications.

## __Amazon DevOps Guru__
  - ### Features
    - Added GetCostEstimation and StartCostEstimation to get the monthly resource usage cost and added ability to view resource health by AWS service name and to search insights be AWS service name.

## __Amazon SageMaker Service__
  - ### Features
    - Enable retrying Training and Tuning Jobs that fail with InternalServerError by setting RetryStrategy.

# __2.16.54__ __2021-05-03__
## __FinSpace Public API__
  - ### Features
    - This is the initial SDK release for the data APIs for Amazon FinSpace. Amazon FinSpace is a data management and analytics application for the financial services industry (FSI).

## __FinSpace User Environment Management service__
  - ### Features
    - This is the initial SDK release for the management APIs for Amazon FinSpace. Amazon FinSpace is a data management and analytics service for the financial services industry (FSI).

# __2.16.53__ __2021-05-03__
## __AWS SecurityHub__
  - ### Features
    - Updated ASFF to add the following new resource details objects: AwsEc2NetworkAcl, AwsEc2Subnet, and AwsElasticBeanstalkEnvironment.

## __Amazon Chime__
  - ### Features
    - Added new BatchCreateChannelMembership API to support multiple membership creation for channels

## __Amazon Mechanical Turk__
  - ### Features
    - Documentation updates for Amazon Mechanical Turk, GetAccountBalanceOperation operation

## __FinSpace Public API__
  - ### Features
    - This is the initial SDK release for the data APIs for Amazon FinSpace. Amazon FinSpace is a data management and analytics application for the financial services industry (FSI).

## __FinSpace User Environment Management service__
  - ### Features
    - This is the initial SDK release for the management APIs for Amazon FinSpace. Amazon FinSpace is a data management and analytics service for the financial services industry (FSI).

# __2.16.52__ __2021-04-30__
## __AWS Marketplace Catalog Service__
  - ### Features
    - Allows user defined names for Changes in a ChangeSet. Users can use ChangeNames to reference properties in another Change within a ChangeSet. This feature allows users to make changes to an entity when the entity identifier is not yet available while constructing the StartChangeSet request.

## __AWS RoboMaker__
  - ### Features
    - Adds ROS2 Foxy as a supported Robot Software Suite Version and Gazebo 11 as a supported Simulation Software Suite Version

## __Amazon CloudFront__
  - ### Features
    - CloudFront now supports CloudFront Functions, a native feature of CloudFront that enables you to write lightweight functions in JavaScript for high-scale, latency-sensitive CDN customizations.

## __Amazon Connect Customer Profiles__
  - ### Features
    - This release introduces GetMatches and MergeProfiles APIs to fetch and merge duplicate profiles

## __Amazon Forecast Service__
  - ### Features
    - Added new DeleteResourceTree operation that helps in deleting all the child resources of a given resource including the given resource.

## __Amazon Personalize__
  - ### Features
    - Update URL for dataset export job documentation.

# __2.16.51__ __2021-04-29__
## __AWS Organizations__
  - ### Features
    - Minor text updates for AWS Organizations API Reference

## __Amazon Chime__
  - ### Features
    - Increase AppInstanceUserId length to 64 characters

## __Amazon EC2 Container Service__
  - ### Features
    - Add support for EphemeralStorage on TaskDefinition and TaskOverride

## __Amazon Macie 2__
  - ### Features
    - The Amazon Macie API now provides S3 bucket metadata that indicates whether a bucket policy requires server-side encryption of objects when objects are uploaded to the bucket.

# __2.16.50__ __2021-04-28__
## __AWS CloudFormation__
  - ### Features
    - Add CallAs parameter to GetTemplateSummary to enable use with StackSets delegated administrator integration

## __AWS Elemental MediaPackage VOD__
  - ### Features
    - MediaPackage now offers the option to place your Sequence Parameter Set (SPS), Picture Parameter Set (PPS), and Video Parameter Set (VPS) encoder metadata in every video segment instead of in the init fragment for DASH and CMAF endpoints.

## __AWS IoT SiteWise__
  - ### Features
    - AWS IoT SiteWise interpolation API will get interpolated values for an asset property per specified time interval during a period of time.

## __Amazon Connect Service__
  - ### Features
    - Updated max number of tags that can be attached from 200 to 50. MaxContacts is now an optional parameter for the UpdateQueueMaxContact API.

## __AmazonNimbleStudio__
  - ### Features
    - Amazon Nimble Studio is a virtual studio service that empowers visual effects, animation, and interactive content teams to create content securely within a scalable, private cloud service.

# __2.16.49__ __2021-04-27__
## __AWS Audit Manager__
  - ### Features
    - This release restricts using backslashes in control, assessment, and framework names. The controlSetName field of the UpdateAssessmentFrameworkControlSet API now allows strings without backslashes.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

# __2.16.48__ __2021-04-26__
## __AWS Elemental MediaConvert__
  - ### Features
    - Documentation updates for mediaconvert

## __AWS Glue__
  - ### Features
    - Adding Kafka Client Auth Related Parameters

## __AWS IoT Wireless__
  - ### Features
    - Add a new optional field MessageType to support Sidewalk devices in SendDataToWirelessDevice API

## __Amazon CodeGuru Reviewer__
  - ### Features
    - Include KMS Key Details in Repository Association APIs to enable usage of customer managed KMS Keys.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adding support for Red Hat Enterprise Linux with HA for Reserved Instances.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - This release updates existing Amazon EKS input validation so customers will see an InvalidParameterException instead of a ParamValidationError when they enter 0 for minSize and/or desiredSize. It also adds LaunchTemplate information to update responses and a new "CUSTOM" value for AMIType.

## __Amazon Kinesis Analytics__
  - ### Features
    - Amazon Kinesis Data Analytics now supports custom application maintenance configuration using UpdateApplicationMaintenanceConfiguration API for Apache Flink applications. Customers will have visibility when their application is under maintenance status using 'MAINTENANCE' application status.

## __Amazon Personalize__
  - ### Features
    - Added support for exporting data imported into an Amazon Personalize dataset to a specified data source (Amazon S3 bucket).

# __2.16.47__ __2021-04-23__
## __AWS Elemental MediaPackage__
  - ### Features
    - Add support for Widevine DRM on CMAF origin endpoints. Both Widevine and FairPlay DRMs can now be used simultaneously, with CBCS encryption.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Simple Notification Service__
  - ### Features
    - Amazon SNS adds two new attributes, TemplateId and EntityId, for using sender IDs to send SMS messages to destinations in India.

# __2.16.46__ __2021-04-22__
## __AWS SDK for Java v2__
  - ### Features
    - This feature adds client and request overrides of execution attributes prior to request invocation.
        - Contributed by: [@ndejaco2](https://github.com/ndejaco2)

## __AWS SecurityHub__
  - ### Features
    - Replaced the term "master" with "administrator". Added new actions to replace AcceptInvitation, GetMasterAccount, and DisassociateFromMasterAccount. In Member, replaced MasterId with AdministratorId.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Documentation updates for cognito-idp

## __Amazon DynamoDB__
  - ### Bugfixes
    - Fixed bean-based marshalling for model builder types containing complex collections.

## __Amazon ElastiCache__
  - ### Features
    - This release introduces log delivery of Redis slow log from Amazon ElastiCache.

## __Amazon Forecast Service__
  - ### Features
    - This release adds EstimatedTimeRemaining minutes field to the DescribeDatasetImportJob, DescribePredictor, DescribeForecast API response which denotes the time remaining to complete the job IN_PROGRESS.

## __Contributors__
Special thanks to the following contributors to this release: 

[@ndejaco2](https://github.com/ndejaco2)
# __2.16.45__ __2021-04-21__
## __AWS CloudFormation__
  - ### Features
    - Added support for creating and updating stack sets with self-managed permissions from templates that reference macros.

## __AWS Ground Station__
  - ### Features
    - Support new S3 Recording Config allowing customers to write downlink data directly to S3.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now enables users to override index-level boosting configurations for each query.

## __Amazon Detective__
  - ### Features
    - Added parameters to track the data volume in bytes for a member account. Deprecated the existing parameters that tracked the volume as a percentage of the allowed volume for a behavior graph. Changes reflected in MemberDetails object.

## __Amazon Redshift__
  - ### Features
    - Add operations: AddPartner, DescribePartners, DeletePartner, and UpdatePartnerStatus to support tracking integration status with data partners.

## __DynamoDB Enhanced Client__
  - ### Features
    - Added method to BatchGetItem results to retrieve unprocessed keys for a given table.

# __2.16.44__ __2021-04-19__
## __AWS Cost Explorer Service__
  - ### Features
    - Adding support for Sagemaker savings plans in GetSavingsPlansPurchaseRecommendation API

## __AWS SDK for Java v2__
  - ### Features
    - Added support for short type in Code generator.
        - Contributed by: [@duy310](https://github.com/duy310)
    - Updated service endpoint metadata.

## __AWS Savings Plans__
  - ### Features
    - Added support for Amazon SageMaker in Machine Learning Savings Plans

## __Contributors__
Special thanks to the following contributors to this release: 

[@duy310](https://github.com/duy310)
# __2.16.43__ __2021-04-15__
## __AWS Database Migration Service__
  - ### Features
    - AWS DMS added support of TLS for Kafka endpoint. Added Describe endpoint setting API for DMS endpoints.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Security Token Service__
  - ### Features
    - STS now supports assume role with Web Identity using JWT token length upto 20000 characters

## __Amazon DynamoDB__
  - ### Bugfixes
    - Fixed an issue where structure builders containing List<Map<String, Shape>> could not be marshalled using bean-based serializers.

# __2.16.42__ __2021-04-14__
## __AWS CodeStar connections__
  - ### Features
    - This release adds tagging support for CodeStar Connections Host resources

## __AWS Config__
  - ### Features
    - Add exception for DeleteRemediationConfiguration and DescribeRemediationExecutionStatus

## __AWS MediaConnect__
  - ### Features
    - For flows that use Listener protocols, you can now easily locate an output's outbound IP address for a private internet. Additionally, MediaConnect now supports the Waiters feature that makes it easier to poll for the status of a flow until it reaches its desired state.

## __AWS SDK for Java v2__
  - ### Features
    - Add a new Optional getter for the content length of RequestBody, also add a new fromContentProvider method allowing contentLength to be null.

## __Amazon Route 53__
  - ### Features
    - Documentation updates for route53

# __2.16.41__ __2021-04-13__
## __AWS Comprehend Medical__
  - ### Features
    - The InferICD10CM API now returns TIME_EXPRESSION entities that refer to medical conditions.

## __AWS Security Token Service__
  - ### Features
    - This release adds the SourceIdentity parameter that can be set when assuming a role.

## __Amazon Lightsail__
  - ### Features
    - Documentation updates for Amazon Lightsail.

## __Amazon Redshift__
  - ### Features
    - Added support to enable AQUA in Amazon Redshift clusters.

## __Amazon Relational Database Service__
  - ### Features
    - Clarify that enabling or disabling automated backups causes a brief downtime, not an outage.

## __DynamoDB Enhanced Client__
  - ### Features
    - Added `DynamoDbIgnoreNulls` attribute level annotation that specifies attributes with null values should be ignored. See [#2303](https://github.com/aws/aws-sdk-java-v2/issues/2303)

# __2.16.40__ __2021-04-12__
## __AWS CodeBuild__
  - ### Features
    - AWS CodeBuild now allows you to set the access permissions for build artifacts, project artifacts, and log files that are uploaded to an Amazon S3 bucket that is owned by another account.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon FSx__
  - ### Features
    - Support for cross-region and cross-account backup copies

# __2.16.39__ __2021-04-09__
## __AWS Shield__
  - ### Features
    - CreateProtection now throws InvalidParameterException instead of InternalErrorException when system tags (tag with keys prefixed with "aws:") are passed in.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Add paginator support to DescribeStoreImageTasks and update documentation.

## __Amazon Redshift__
  - ### Features
    - Add support for case sensitive table level restore

## __DynamoDB Enhanced Client__
  - ### Features
    - Added a new method annotation `DynamoDbPreserveEmptyObject` that specifies a class as empty class if all fields are null when mapping a DynamoDb record to a Java bean. See [#2280](https://github.com/aws/aws-sdk-java-v2/issues/2280).

  - ### Bugfixes
    - Fixes a bug in issue [#2310](https://github.com/aws/aws-sdk-java-v2/issues/2310) where nested attributes aren't sanitized properly for projection expressions.

# __2.16.38__ __2021-04-08__
## __AWS Resource Access Manager__
  - ### Features
    - Documentation updates for AWS RAM resource sharing

## __AWS RoboMaker__
  - ### Features
    - This release allows RoboMaker customers to specify custom tools to run with their simulation job

## __AWS SDK for Java v2__
  - ### Features
    - Add a configuration option to enable `TCP_KEEPALIVE` on the ApacheHttpClient.
        - Contributed by: [@ajs139](https://github.com/ajs139)
    - Updated service endpoint metadata.

## __Amazon AppStream__
  - ### Features
    - This release provides support for image updates

## __Amazon Connect Customer Profiles__
  - ### Features
    - Documentation updates for Put-Integration API

## __Amazon Kinesis Video Streams Archived Media__
  - ### Features
    - Documentation updates for archived.kinesisvideo

## __Amazon Lookout for Equipment__
  - ### Features
    - This release introduces support for Amazon Lookout for Equipment.

## __Auto Scaling__
  - ### Features
    - Amazon EC2 Auto Scaling announces Warm Pools that help applications to scale out faster by pre-initializing EC2 instances and save money by requiring fewer continuously running instances

## __Contributors__
Special thanks to the following contributors to this release: 

[@ajs139](https://github.com/ajs139)
# __2.16.37__ __2021-04-07__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Fix leak of bytebuf on HTTP GoAway

## __AWS Storage Gateway__
  - ### Features
    - File Gateway APIs now support FSx for Windows as a cloud storage.

## __Access Analyzer__
  - ### Features
    - IAM Access Analyzer now analyzes your CloudTrail events to identify actions and services that have been used by an IAM entity (user or role) and generates an IAM policy that is based on that activity.

## __Amazon ElastiCache__
  - ### Features
    - This release adds tagging support for all AWS ElastiCache resources except Global Replication Groups.

## __Amazon Interactive Video Service__
  - ### Features
    - This release adds support for the Auto-Record to S3 feature. Amazon IVS now enables you to save your live video to Amazon S3.

## __Application Migration Service__
  - ### Features
    - Add new service - Application Migration Service.

# __2.16.36__ __2021-04-06__
## __AWS Cloud9__
  - ### Features
    - Documentation updates for Cloud9

## __AWS Elemental MediaLive__
  - ### Features
    - MediaLive VPC outputs update to include Availability Zones, Security groups, Elastic Network Interfaces, and Subnet Ids in channel response

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for storing EBS-backed AMIs in S3 and restoring them from S3 to enable cross-partition copying of AMIs

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Supports removing a label or labels from a parameter, enables ScheduledEndTime and ChangeDetails for StartChangeRequestExecution API, supports critical/security/other noncompliant count for patch API.

## __Netty NIO HTTP Client__
  - ### Features
    - Update Netty dependency to `4.1.61.Final`.

# __2.16.35__ __2021-04-05__
## __AWS Audit Manager__
  - ### Features
    - AWS Audit Manager has updated the GetAssessment API operation to include a new response field called userRole. The userRole field indicates the role information and IAM ARN of the API caller.

## __AWS Elemental MediaLive__
  - ### Features
    - MediaLive now support HTML5 Motion Graphics overlay

## __AWS SDK for Java v2__
  - ### Features
    - This feature adds client and request overrides of execution attributes prior to request invocation.
        - Contributed by: [@ndejaco2](https://github.com/ndejaco2)

  - ### Bugfixes
    - Expose the metadata key on SDK client interfaces for use with `ServiceMetadataProvider`

## __Amazon Appflow__
  - ### Features
    - Added destination properties for Zendesk.

## __Contributors__
Special thanks to the following contributors to this release: 

[@ndejaco2](https://github.com/ndejaco2)
# __2.16.34__ __2021-04-02__
## __AWS Elemental MediaPackage__
  - ### Features
    - SPEKE v2 is an upgrade to the existing SPEKE API to support multiple encryption keys, based on an encryption contract selected by the customer.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Removal of `--report-unsupported-elements-at-runtime` option from SDK core's `native-image.properties` as the option is not meant to be used in production.
        - Contributed by: [@zakkak](https://github.com/zakkak)

## __EC2 Image Builder__
  - ### Features
    - This release adds support for Block Device Mappings for container image builds, and adds distribution configuration support for EC2 launch templates in AMI builds.

## __Contributors__
Special thanks to the following contributors to this release: 

[@zakkak](https://github.com/zakkak)
# __2.16.33__ __2021-04-01__
## __AWS Elemental MediaConvert__
  - ### Features
    - MediaConvert now supports HLS ingest, sidecar WebVTT ingest, Teletext color & style passthrough to TTML subtitles, TTML to WebVTT subtitle conversion with style, & DRC profiles in AC3 audio.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS WAFV2__
  - ### Features
    - Added support for ScopeDownStatement for ManagedRuleGroups, Labels, LabelMatchStatement, and LoggingFilter. For more information on these features, see the AWS WAF Developer Guide.

## __AWSKendraFrontendService__
  - ### Features
    - AWS Kendra's ServiceNow data source now supports OAuth 2.0 authentication and knowledge article filtering via a ServiceNow query.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - VPC Flow Logs Service adds a new API, GetFlowLogsIntegrationTemplate, which generates CloudFormation templates for Athena. For more info, see https://docs.aws.amazon.com/console/vpc/flow-logs/athena

## __Amazon Lex Model Building Service__
  - ### Features
    - Lex now supports the ja-JP locale

## __Amazon Lex Runtime Service__
  - ### Features
    - Amazon Lex now supports base64-encoded message and input transcript fields.

## __Amazon Lightsail__
  - ### Features
    - - This release adds support for state detail for Amazon Lightsail container services.

## __Amazon Route 53 Resolver__
  - ### Features
    - Route 53 Resolver DNS Firewall is a firewall service that allows you to filter and regulate outbound DNS traffic for your VPCs.

## __Firewall Management Service__
  - ### Features
    - Added Firewall Manager policy support for AWS Route 53 Resolver DNS Firewall.

# __2.16.32__ __2021-03-31__
## __AWS Batch__
  - ### Features
    - AWS Batch adds support for Amazon EFS File System

## __AWS Cloud9__
  - ### Features
    - Add ImageId input parameter to CreateEnvironmentEC2 endpoint. New parameter enables creation of environments with different AMIs.

## __AWS CloudFormation__
  - ### Features
    - 1. Added a new parameter "RegionConcurrencyType" in OperationPreferences. 2. Changed the name of "AccountUrl" to "AccountsUrl" in "DeploymentTargets" parameter.

## __AWS Data Pipeline__
  - ### Features
    - Minor documentation updates and link updates.

## __AWS Direct Connect__
  - ### Features
    - This release adds MACsec support to AWS Direct Connect

## __AWS IoT__
  - ### Features
    - Added ability to prefix search on attribute value for ListThings API.

## __AWS IoT Wireless__
  - ### Features
    - Add Sidewalk support to APIs: GetWirelessDevice, ListWirelessDevices, GetWirelessDeviceStatistics. Add Gateway connection status in GetWirelessGatewayStatistics API.

## __AWS Price List Service__
  - ### Features
    - Minor documentation and link updates.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon CloudHSM__
  - ### Features
    - Minor documentation and link updates.

## __Amazon Cognito Sync__
  - ### Features
    - Minor documentation updates and link updates.

## __Amazon Comprehend__
  - ### Features
    - Support for customer managed KMS encryption of Comprehend custom models

## __Amazon Detective__
  - ### Features
    - Added the ability to assign tag values to Detective behavior graphs. Tag values can be used for attribute-based access control, and for cost allocation for billing.

## __Amazon Machine Learning__
  - ### Features
    - Minor documentation updates and link updates.

## __Amazon Redshift__
  - ### Features
    - Enable customers to share access to their Redshift clusters from other VPCs (including VPCs from other accounts).

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe now supports creating custom language models in the following languages: British English (en-GB), Australian English (en-AU), Indian Hindi (hi-IN), and US Spanish (es-US).

## __Amazon WorkMail__
  - ### Features
    - This release adds support for mobile device access rules management in Amazon WorkMail.

# __2.16.31__ __2021-03-30__
## __AWS Config__
  - ### Features
    - Adding new APIs to support ConformancePack Compliance CI in Aggregators

## __AWS EC2 Instance Connect__
  - ### Features
    - Adding support to push SSH keys to the EC2 serial console in order to allow an SSH connection to your Amazon EC2 instance's serial port.

## __AWS Glue DataBrew__
  - ### Features
    - This SDK release adds two new dataset features: 1) support for specifying a database connection as a dataset input 2) support for dynamic datasets that accept configurable parameters in S3 path.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon CloudWatch__
  - ### Features
    - SDK update for new Metric Streams feature

## __Amazon Elastic Compute Cloud__
  - ### Features
    - ReplaceRootVolume feature enables customers to replace the EBS root volume of a running instance to a previously known state. Add support to grant account-level access to the EC2 serial console

## __Amazon Fraud Detector__
  - ### Features
    - This release adds support for Batch Predictions in Amazon Fraud Detector.

## __Amazon Pinpoint__
  - ### Features
    - Added support for journey pause/resume, journey updatable import segment and journey quiet time wait.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Autopilot now supports 1) feature importance reports for AutoML jobs and 2) PartialFailures for AutoML jobs

# __2.16.30__ __2021-03-29__
## __AWS Glue__
  - ### Features
    - Allow Dots in Registry and Schema Names for CreateRegistry, CreateSchema; Fixed issue when duplicate keys are present and not returned as part of QuerySchemaVersionMetadata.

## __AWS Identity and Access Management__
  - ### Features
    - AWS Identity and Access Management GetAccessKeyLastUsed API will throw a custom error if customer public key is not found for access keys.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS WAFV2__
  - ### Features
    - Added custom request handling and custom response support in rule actions and default action; Added the option to inspect the web request body as parsed and filtered JSON.

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - This release adds support for Event Subscriptions to DocumentDB.

## __Amazon Location Service__
  - ### Features
    - Amazon Location added support for specifying pricing plan information on resources in alignment with our cost model.

# __2.16.29__ __2021-03-26__
## __AWS IoT Wireless__
  - ### Features
    - Support tag-on-create for WirelessDevice.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon CloudWatch Events__
  - ### Features
    - Add support for SageMaker Model Builder Pipelines Targets to EventBridge

## __Amazon Connect Customer Profiles__
  - ### Features
    - This release adds an optional parameter named FlowDefinition in PutIntegrationRequest.

## __Amazon EventBridge__
  - ### Features
    - Add support for SageMaker Model Builder Pipelines Targets to EventBridge

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe now supports tagging words that match your vocabulary filter for batch transcription.

# __2.16.28__ __2021-03-25__
## __Amazon Lookout for Metrics__
  - ### Features
    - Allowing uppercase alphabets for RDS and Redshift database names.

# __2.16.27__ __2021-03-25__
## __AWS Elemental MediaLive__
  - ### Features
    - EML now supports handling HDR10 and HLG 2020 color space from a Link input.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Removing Freemarker version 2.3.24 since this package is not used in the code.

## __Alexa For Business__
  - ### Features
    - Added support for enabling and disabling data retention in the CreateProfile and UpdateProfile APIs and retrieving the state of data retention for a profile in the GetProfile API.

## __Amazon Lookout for Metrics__
  - ### Features
    - Amazon Lookout for Metrics is now generally available. You can use Lookout for Metrics to monitor your data for anomalies. For more information, see the Amazon Lookout for Metrics Developer Guide.

## __Amazon Rekognition__
  - ### Features
    - "This release introduces AWS tagging support for Amazon Rekognition collections, stream processors, and Custom Label models."

## __Amazon SageMaker Service__
  - ### Features
    - This feature allows customer to specify the environment variables in their CreateTrainingJob requests.

## __Amazon Simple Queue Service__
  - ### Features
    - Documentation updates for Amazon SQS

# __2.16.26__ __2021-03-24__
## __AWS Greengrass__
  - ### Features
    - Updated the parameters to make name required for CreateGroup API.

## __AWS S3 Control__
  - ### Features
    - Documentation updates for s3-control

## __Amazon Elastic Compute Cloud__
  - ### Features
    - maximumEfaInterfaces added to DescribeInstanceTypes API

## __Amazon Route 53__
  - ### Features
    - Documentation updates for route53

## __Amazon Simple Storage Service__
  - ### Features
    - Documentation updates for Amazon S3

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release allows SSM Explorer customers to enable OpsData sources across their organization when creating a resource data sync.

# __2.16.25__ __2021-03-23__
## __AWS Cost Explorer Service__
  - ### Features
    - You can now create cost categories with inherited value rules and specify default values for any uncategorized costs.

## __AWS Fault Injection Simulator__
  - ### Features
    - Updated maximum allowed size of action parameter from 64 to 1024

## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for IAM operations and descriptions.

## __Amazon GameLift__
  - ### Features
    - GameLift adds support for using event notifications to monitor game session placements. Specify an SNS topic or use CloudWatch Events to track activity for a game session queue.

## __Amazon Redshift__
  - ### Features
    - Removed APIs to control AQUA on clusters.

# __2.16.24__ __2021-03-22__
## __AWS SDK for Java v2__
  - ### Bugfixes
    - Use HTTPs for AWS API Documentation links in javadocs
        - Contributed by: [@Carey-AWS](https://github.com/Carey-AWS)

  - ### Documentations
    - Implements web metrics tracking and standard AWS footer for javadocs, and adds a link to submit feedback about the javadocs
        - Contributed by: [@Carey-AWS](https://github.com/Carey-AWS)

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for UEFI boot on selected AMD- and Intel-based EC2 instances.

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API adds support for publishing sensitive data findings to AWS Security Hub and specifying which categories of findings to publish to Security Hub.

## __Amazon Redshift__
  - ### Features
    - Added support to enable AQUA in Amazon Redshift clusters.

## __CodeArtifact__
  - ### Features
    - Documentation updates for CodeArtifact

## __Contributors__
Special thanks to the following contributors to this release: 

[@Carey-AWS](https://github.com/Carey-AWS)
# __2.16.23__ __2021-03-19__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - X2gd instances are the next generation of memory-optimized instances powered by AWS-designed, Arm-based AWS Graviton2 processors.

## __Amazon SageMaker Service__
  - ### Features
    - Adding authentication support for pulling images stored in private Docker registries to build containers for real-time inference.

# __2.16.22__ __2021-03-18__
## __AWS S3 Control__
  - ### Features
    - S3 Object Lambda is a new S3 feature that enables users to apply their own custom code to process the output of a standard S3 GET request by automatically invoking a Lambda function with a GET request

## __AWS SDK for Java v2__
  - ### Features
    - Upgrade Netty version to 4.1.60

## __AWS SecurityHub__
  - ### Features
    - New object for separate provider and customer values. New objects track S3 Public Access Block configuration and identify sensitive data. BatchImportFinding requests are limited to 100 findings.

## __Amazon Redshift__
  - ### Features
    - Add new fields for additional information about VPC endpoint for clusters with reallocation enabled, and a new field for total storage capacity for all clusters.

## __Amazon Simple Storage Service__
  - ### Features
    - S3 Object Lambda is a new S3 feature that enables users to apply their own custom code to process the output of a standard S3 GET request by automatically invoking a Lambda function with a GET request

## __Auto Scaling__
  - ### Features
    - Amazon EC2 Auto Scaling Instance Refresh now supports phased deployments.

# __2.16.21__ __2021-03-17__
## __AWS Batch__
  - ### Features
    - Making serviceRole an optional parameter when creating a compute environment. If serviceRole is not provided then Service Linked Role will be created (or reused if it already exists).

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon SageMaker Service__
  - ### Features
    - Support new target device ml_eia2 in SageMaker CreateCompilationJob API

# __2.16.20__ __2021-03-16__
## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for AWS Identity and Access Management (IAM).

## __AWS Lambda__
  - ### Features
    - Allow empty list for function response types

## __AWS MediaConnect__
  - ### Features
    - This release adds support for the SRT-listener protocol on sources and outputs.

## __AWS MediaTailor__
  - ### Features
    - MediaTailor channel assembly is a new manifest-only service that allows you to assemble linear streams using your existing VOD content.

## __Access Analyzer__
  - ### Features
    - This release adds support for the ValidatePolicy API. IAM Access Analyzer is adding over 100 policy checks and actionable recommendations that help you validate your policies during authoring.

## __Amazon DynamoDB__
  - ### Features
    - Change STANDARD mode retry count which was 2 for DynamoDB to match LEGACY retry count which is 8.

## __Amazon GameLift__
  - ### Features
    - GameLift expands to six new AWS Regions, adds support for multi-location fleets to streamline management of hosting resources, and lets you customize more of the game session placement process.

## __AmazonMWAA__
  - ### Features
    - This release adds UPDATE_FAILED and UNAVAILABLE MWAA environment states.

# __2.16.19__ __2021-03-15__
## __AWS CodeDeploy__
  - ### Features
    - AWS CodeDeploy can now detect instances running an outdated revision of your application and automatically update them with the latest revision.

## __AWS Fault Injection Simulator__
  - ### Features
    - Initial release of AWS Fault Injection Simulator, a managed service that enables you to perform fault injection experiments on your AWS workloads

## __Amazon EC2 Container Service__
  - ### Features
    - This is for ecs exec feature release which includes two new APIs - execute-command and update-cluster and an AWS CLI customization for execute-command API

## __Amazon Elastic MapReduce__
  - ### Features
    - Amazon EMR customers can now specify Resource Group to target Capacity Reservations in their EMR clusters with instance fleets using allocation strategy.

## __Amazon Transcribe Streaming Service__
  - ### Features
    - AWS Transcribe now supports real-time transcription for Chinese (zh-CN) and confidence scores in the transcription output.

# __2.16.18__ __2021-03-12__
## __AWS Cost and Usage Report Service__
  - ### Features
    - - Added optional billingViewArn field for OSG.

## __AWS MediaTailor__
  - ### Features
    - MediaTailor channel assembly is a new manifest-only service that allows you to assemble linear streams using your existing VOD content.

## __Amazon WorkSpaces__
  - ### Features
    - Adds API support for WorkSpaces bundle management operations.

# __2.16.17__ __2021-03-11__
## __AWS Elemental MediaLive__
  - ### Features
    - MediaLive supports the ability to apply a canned ACL to output sent to an AWS S3 bucket; supports ability to specify position for EBU-TT and TTML output captions converted from Teletext source.

## __AWS Network Firewall__
  - ### Features
    - Correct the documentation about how you can provide rule group rules

## __AWS WAFV2__
  - ### Features
    - Correct the documentation about JSON body parsing behavior and IP set update behavior

## __Amazon Comprehend__
  - ### Features
    - ContainsPiiEntities API analyzes the input text for the presence of personally identifiable information(PII) and returns the labels of identified PII entity types such as name, address etc.

## __Amazon S3__
  - ### Bugfixes
    - Fixed an issue where presigned URLs for access point objects could bypass encoding, causing an IllegalArgumentException.

# __2.16.16__ __2021-03-10__
## __AWS Backup__
  - ### Features
    - Added support for enabling continuous backups.

## __AWS SDK for Java v2__
  - ### Features
    - Include the retry mode STANDARD or LEGACY in the user agents list.

## __Access Analyzer__
  - ### Features
    - This release adds support to preview IAM Access Analyzer findings for a resource before deploying resource permission changes.

## __Amazon Simple Storage Service__
  - ### Features
    - Adding ID element to the CORSRule schema

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Systems Manager support for tagging OpsMetadata.

# __2.16.15__ __2021-03-09__
## __AWS IoT Wireless__
  - ### Features
    - Add max value to Seq in SendDataToWirelessDevice API"

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon CodeGuru Profiler__
  - ### Features
    - Update documentation to include Python. Add ConflictException for DeleteProfilingGroup. Add FrameMetricValue.

## __Amazon Elastic File System__
  - ### Features
    - AWS EFS is introducing one-zone file systems.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for Amazon RDS Proxy endpoints.

## __Auto Scaling__
  - ### Features
    - EC2 Auto Scaling now supports setting a local time zone for cron expressions in scheduled actions, removing the need to adjust for Daylight Saving Time (DST)

# __2.16.14__ __2021-03-08__
## __AWS Lambda__
  - ### Features
    - Documentation updates for Lambda. Constraint updates to AddLayerVersionPermission's Action and OrganizationId parameters, and AddPermission's Principal and SourceAccount parameters.

## __AWS S3 Control__
  - ### Features
    - Documentation updates for Amazon S3

## __Amazon Elastic MapReduce__
  - ### Features
    - Amazon EMR customers can now specify how EC2 On-Demand Capacity Reservations are used in their EMR clusters with instance fleets using allocation strategy.

## __Amazon Kinesis Video Streams Archived Media__
  - ### Features
    - Increase the maximum HLS and MPEG-DASH manifest size from 1,000 to 5,000 fragments.

## __Amazon Simple Storage Service__
  - ### Features
    - Amazon S3 Documentation updates

## __Auto Scaling__
  - ### Features
    - Documentation updates for autoscaling for capacity-optimized-prioritized SpotAllocationStrategy

# __2.16.13__ __2021-03-05__
## __AWS CodePipeline__
  - ### Features
    - Updated the parameters to make actionType required for UpdateActionType

## __AWS Elemental MediaLive__
  - ### Features
    - Medialive now supports the ability to transfer AWS Elemental Link devices to another region.

## __AWS License Manager__
  - ### Features
    - License Manager Automated Discovery now supports Exclusion Filters.

## __AWS Network Firewall__
  - ### Features
    - Added a new UpdateToken output field to the PerObjectStatus as part of firewall sync state. This is added to track which version of the object the firewall is in sync or pending synchronization.

## __AWS Shield__
  - ### Features
    - Add support for tagging of Shield protection and protection group resources.

## __Amazon Appflow__
  - ### Features
    - Documentation updates for arn:aws:trebuchet:::service:v1:decb008d-e0d8-44a4-b93c-092f0355d523

## __Amazon Athena__
  - ### Features
    - Adds APIs to create, list, update, and delete prepared SQL statements that have optional placeholder parameters. A prepared statement can use different values for these parameters each time it is run.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Expands EC2/Spot Fleet capacity-optimized allocation strategy to allow users to prioritize instance pools. Fleet attempts to fulfill priorities on a best-effort basis but optimizes for capacity first.

# __2.16.12__ __2021-03-04__
## __AWS Cloud Map__
  - ### Features
    - Supports creating API-only services under DNS namespace. Add namespace syntax validation.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon CloudWatch Events__
  - ### Features
    - Introducing support for EventBridge Api Destinations - any HTTP APIs as Targets, with managed authorization via EventBridge Connections.

## __Amazon EventBridge__
  - ### Features
    - Introducing support for EventBridge Api Destinations - any HTTP APIs as Targets, with managed authorization via EventBridge Connections.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds the ResolvedOutputS3Uri to the DescribeFeatureGroup API to indicate the S3 prefix where offline data is stored in a feature group

## __AmazonMWAA__
  - ### Features
    - This release introduces a new MinWorker parameter to the CreateEnvironment and UpdateEnvironment APIs. MinWorker allows the users to set a minimum worker count for worker auto-scaling operations.

# __2.16.11__ __2021-03-03__
## __AWS Certificate Manager__
  - ### Features
    - Adds 2 new APIs to add and retrieve account configuration in AWS Certificate Manager.

## __AWS CodeBuild__
  - ### Features
    - AWS CodeBuild now supports Session Manager debugging for batch builds.

## __AWS Secrets Manager__
  - ### Features
    - Added support for multi-Region secrets APIs ReplicateSecretToRegions, RemoveRegionsFromReplication, and StopReplicationToReplica

## __AWS Well-Architected Tool__
  - ### Features
    - This release supports tagging on AWS Well-Architected workloads.

## __Amazon CloudWatch Events__
  - ### Features
    - Adds TraceHeader to PutEventsRequestEntry to support AWS X-Ray trace-ids on events generated using the PutEvents operation.

## __Amazon Elasticsearch Service__
  - ### Features
    - AWS ElasticSearch Feature : Support for adding tags in elastic search domain during domain creation

## __Amazon Forecast Service__
  - ### Features
    - Added new StopResource operation that stops Amazon Forecast resource jobs that are in progress.

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API includes miscellaneous updates and improvements to the documentation.

# __2.16.10__ __2021-03-02__
## __AWS Compute Optimizer__
  - ### Features
    - Documentation updates for Compute Optimizer

## __AWS DataSync__
  - ### Features
    - Additional API Support to update NFS/SMB/ObjectStorage locations

## __AWS Direct Connect__
  - ### Features
    - Doc only update for AWS Direct Connect that fixes several customer-reported issues

## __AWS IoT Wireless__
  - ### Features
    - Add ARN & Tags for PartnerAccount related APIs and WirelessGatewayTaskDefinition related APIs

## __Amazon EventBridge__
  - ### Features
    - Adds TraceHeader to PutEventsRequestEntry to support AWS X-Ray trace-ids on events generated using the PutEvents operation.

## __Amazon Managed Blockchain__
  - ### Features
    - Updates for Ethereum general availability release.

# __2.16.9__ __2021-03-01__
## __AWS CodePipeline__
  - ### Features
    - Added a new field to the ListPipelines API to allow maximum search results of 1000

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Alexa For Business__
  - ### Features
    - Added support for optional tags in CreateAddressBook, CreateConferenceProvider, CreateContact, CreateGatewayGroup, CreateNetworkProfile and RegisterAVSDevice APIs.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adding new error code AdmissionRequestDenied for Addons in EKS

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Add Support for Patch Manger Baseline Override parameter.

# __2.16.8__ __2021-02-26__
## __AWS Single Sign-On Admin__
  - ### Features
    - Relax constraint on List* API pagination tokens to include underscore character

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Amazon EKS now supports adding KMS envelope encryption to existing clusters to enhance security for secrets

## __Amazon Elastic MapReduce__
  - ### Features
    - Added UpdateStudio API that allows updating a few attributes of an EMR Studio.

## __Amazon Simple Storage Service__
  - ### Features
    - Add RequestPayer to GetObjectTagging and PutObjectTagging.

# __2.16.7__ __2021-02-25__
## __AWS Glue DataBrew__
  - ### Features
    - This SDK release adds two new dataset features: 1) support for specifying the file format for a dataset, and 2) support for specifying whether the first row of a CSV or Excel file contains a header.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix for module-path tests failure reported in [#2240](https://github.com/aws/aws-sdk-java-v2/issues/2240)

## __AWS Transfer Family__
  - ### Features
    - Corrected the upper limit for TestIdentityProvider input lengths to 1024 characters

## __Amazon Detective__
  - ### Features
    - Changed "master account" to "administrator account." A new AdministratorId field replaces the deprecated MasterId field. Added an option to disable email notifications for member account invitations.

## __Amazon Lightsail__
  - ### Features
    - Documentation updates for Lightsail

## __EC2 Image Builder__
  - ### Features
    - This release introduces a new API (ListImagePackages) for listing packages installed on an image, and adds support for GP3 volume types, and for specifying a time zone in an image pipeline schedule.

# __2.16.6__ __2021-02-24__
## __AWS Compute Optimizer__
  - ### Features
    - Documentation updates for Compute Optimizer

## __AWS Elemental MediaPackage VOD__
  - ### Features
    - AWS Elemental MediaPackage provides access logs that capture detailed information about requests sent to a customer's MediaPackage VOD packaging group.

## __Amazon Appflow__
  - ### Features
    - # Adding 'Amazon Honeycode' , 'Amazon Lookout for Metrics' and 'Amazon Connect Customer Profiles' as Destinations.

## __Amazon Elastic Container Registry Public__
  - ### Features
    - This release adds support for AWS tags on Amazon ECR Public repositories.

## __Amazon Elasticsearch Service__
  - ### Features
    - Amazon Elasticsearch Service now supports Auto-Tune, which monitors performance metrics and automatically optimizes domains

# __2.16.5__ __2021-02-23__
## __AWS Glue__
  - ### Features
    - Updating the page size for Glue catalog getter APIs.

## __AWS IoT Events__
  - ### Features
    - This release adds an Analyze feature to AWS IoT Events that lets customers analyze their detector models for runtime issues.

## __AWS S3 Control__
  - ### Features
    - Documentation updates for s3-control

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Connect Service__
  - ### Features
    - Documentation updates for AWS Connect (MediaConcurrency Limit).

## __Amazon Pinpoint__
  - ### Features
    - Enables AWS Pinpoint customers to use Entity Id and Template Id when sending SMS message. These parameters can be obtained from the regulatory body of the country where you are trying to send the SMS.

## __Amazon QuickSight__
  - ### Features
    - Documentation updates for QuickSight Row Level Security

## __Auto Scaling__
  - ### Features
    - Adds a new optional IncludeDeletedGroups parameter to the DescribeScalingActivities API.

## __Redshift Data API Service__
  - ### Features
    - This release adds an additional parameter 'ConnectedDatabase' into ListSchemasRequest, ListTablesRequest and DescribeTableRequest to support the metadata sharing across databases.

# __2.16.4__ __2021-02-22__
## __AWS S3__
  - ### Bugfixes
    - Fix the bug that getUrl in S3Utilities ignores the overriding endpoint in the client.

## __Amazon SageMaker Runtime__
  - ### Features
    - SageMaker Runtime now supports a new TargetContainerHostname header to invoke a model in a specific container if the endpoint hosts multiple containers and is configured to use direct invocation.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker now supports core dump for SageMaker Endpoints and direct invocation of a single container in a SageMaker Endpoint that hosts multiple containers.

# __2.16.3__ __2021-02-19__
## __AWS RDS__
  - ### Features
    - Add the ability to generate IAM auth tokens for RDS using `RdsUtilities`
        - Contributed by: [@abrooksv](https://github.com/abrooksv)

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Relational Database Service__
  - ### Features
    - Added awsBackupRecoveryPointArn in ModifyDBInstanceRequest and in the response of ModifyDBInstance.

## __Contributors__
Special thanks to the following contributors to this release: 

[@abrooksv](https://github.com/abrooksv)
# __2.16.2__ __2021-02-18__
## __AWS CloudFormation__
  - ### Features
    - Adding the 'callAs' parameter to all CloudFormation StackSets APIs except getTemplateSummary to support creating and managing service-managed StackSets with AWS Organizations Delegated Administrators

## __AWS CodeBuild__
  - ### Features
    - AWS CodeBuild now allows you to specify a separate bucket owner as part of the S3 destination in a report group.

## __AWS Health APIs and Notifications__
  - ### Features
    - Documentation updates for health

## __Amazon SageMaker Service__
  - ### Features
    - This release adds expires-in-seconds parameter to the CreatePresignedDomainUrl API for support of a configurable TTL.

# __2.16.1__ __2021-02-17__
## __AWS Config__
  - ### Features
    - Added INSUFFICIENT_DATA in ConformancePackComplianceType.

## __AWS SDK for Java v2__
  - ### Features
    - Add GraalVM Native Image configurations for SDK classes
    - Created a new archetype, `archetype-app-quickstart`, which allows you to create a simple application with SDK dependencies

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release includes a new filter for describe-vpc-endpoint-services.

## __Amazon Lookout for Vision__
  - ### Features
    - This release for Amazon Lookout for Vision includes documentation updates and a correction to the Status field returned in the response from StartModel and StopModel.

# __2.16.0__ __2021-02-16__
## __AWS CodeBuild__
  - ### Features
    - This release provides per-project limits for the number of concurrent builds

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Upgrade Jackson dependencies to `2.12.1`.

## __Amazon DevOps Guru__
  - ### Features
    - Amazon DevOps Guru is GA ready. This API update added a describeFeedback Api allows users to view submitted insight feedback. The release date is 02/16/2021

# __2.15.82__ __2021-02-15__
## __AWS Config__
  - ### Features
    - Added option to provide KMS key to AWS Config DeliveryChannel

## __AWS Elemental MediaLive__
  - ### Features
    - AWS MediaLive now supports Automatic-Input-Failover for CDI Inputs.

## __AWS MediaTailor__
  - ### Features
    - MediaTailor now supports specifying aliases for dynamic variables. This allows use cases such as binding multiple origin domains to a single MediaTailor playback configuration.

## __Amazon Kinesis Video Streams Archived Media__
  - ### Features
    - The ListFragments and GetMediaForFragmentList APIs now support StreamName or StreamARN as input parameters.

## __Amazon Lightsail__
  - ### Features
    - Documentation updates for Lightsail

## __Amazon Pinpoint__
  - ### Features
    - Lets customers use origination number when specifying SMS message configuration for Campaigns and Journeys.

## __Amazon WorkMail Message Flow__
  - ### Features
    - This release allows customers to update email messages as they flow in and out of Amazon WorkMail

## __Redshift Data API Service__
  - ### Features
    - This release enables fine grant access control in ListStatements, GetStatementResult, CancelStatement and DescribeStatement.

# __2.15.81__ __2021-02-12__
## __AWS AppSync__
  - ### Features
    - Approve release for appsync local on pipeline resolver

## __AWS CodePipeline__
  - ### Features
    - The release provides new GetActionType and UpdateActionType APIs for viewing and editing action types in CodePipeline.

## __AWS Identity and Access Management__
  - ### Features
    - AWS Identity and Access Management now supports tagging for the following resources: customer managed policies, identity providers, instance profiles, server certificates, and virtual MFA devices.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS WAFV2__
  - ### Features
    - Added the option to inspect the web request body as parsed and filtered JSON (new FieldToMatch type JsonBody), in addition to the existing option to inspect the web request body as plain text.

## __Amazon Detective__
  - ### Features
    - The API definition now indicates that the format for timestamps is an ISO 8601 date-time string

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Amazon EKS now supports OpenId Connect (OIDC) compatible identity providers as a user authentication option

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API replaces the term master account with the term administrator account, including deprecating APIs that use the previous term and adding APIs that use the new term.

## __Amazon Personalize Events__
  - ### Features
    - Increased maximum char size of PutUsers and PutItems properties.

## __Amazon Relational Database Service__
  - ### Features
    - EngineMode in the response of DescribeDBClusterSnapshots. SupportedEngineModes, SupportsParallelQuery and SupportsGlobalDatabases in ValidUpgradeTarget of DBEngineVersions in DescribeDBEngineVersions.

## __Elastic Load Balancing__
  - ### Features
    - Adds a target group attribute for application-based stickiness for Application Load Balancers and an update to the client IP preservation attribute for Network Load Balancers.

# __2.15.80__ __2021-02-11__
## __AWS Glue DataBrew__
  - ### Features
    - This release adds support for profile job sampling, which determines the number of rows on which the profile job will be executed.

## __Amazon Relational Database Service__
  - ### Features
    - Adding support for RDS Aurora Global Database Failover

# __2.15.79__ __2021-02-09__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for WMA audio only ingest, SMPTE-TT text and image caption ingest, and MPEG-2 video in MXF OP1a outputs.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon GameLift__
  - ### Features
    - GameLift FleetIQ users can now use AMD instance families in supported Regions. In addition, FlexMatch matchmaking notification now supports SNS FIFO topics.

## __Amazon QLDB Session__
  - ### Features
    - This release adds CapacityExceededException to the AWS QLDBSession API.

## __Amazon QuickSight__
  - ### Features
    - QuickSight now supports Python's paginators for Exploration APIs.

## __Amazon SageMaker Service__
  - ### Features
    - Add a new optional FrameworkVersion field to Sagemaker Neo CreateCompilationJob API

# __2.15.78__ __2021-02-08__
## __AWS CloudTrail__
  - ### Features
    - ConflictException is now thrown when certain operations are called on resources before CloudTrail has time to load the resources. Two new exceptions have been added to the PutInsightSelectors API.

## __AWS Data Exchange__
  - ### Features
    - This release introduces the new ExportRevision job type, which allows for the export of an entire revision.

## __AWS Global Accelerator__
  - ### Features
    - Global Accelerator now supports bringing your own IP addresses for custom routing accelerators

## __AWS IoT SiteWise__
  - ### Features
    - Recall CreatePresignedPortalUrl API

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon ElastiCache__
  - ### Features
    - Documentation updates for elasticache

## __Amazon Interactive Video Service__
  - ### Features
    - Fixed an issue where StreamStartTime could not be unmarshalled from response. Changed DeleteChannel and DeleteStreamKey response codes to 204.

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API adds support for specifying a time range in queries for usage data.

## __Elastic Load Balancing__
  - ### Features
    - Adds a target group attribute for application-based stickiness for Application Load Balancers.

# __2.15.77__ __2021-02-05__
## __AWS Organizations__
  - ### Features
    - Added support for a few additional exception codes for some AWS Organizations APIs.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Macie__
  - ### Features
    - Documentation updates for Amazon Macie Classic. We replaced the term "master account" with the term "administrator account." An administrator account is used to centrally manage multiple accounts.

## __Elastic Load Balancing__
  - ### Features
    - Adds a target group attribute for client IP preservation for Network Load Balancers.

# __2.15.76__ __2021-02-04__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Appflow__
  - ### Features
    - Adding schedule offset as an input for scheduled flows in CreateFlow API. Also, adding data pull start time and data pull end time for DescribeFlowExecutionRecords API response.

## __Amazon Athena__
  - ### Features
    - Adds the Athena ListEngineVersions action and the EngineVersion data type. ListEngineVersions returns the available Athena engine versions, including Auto, as a list of EngineVersion objects.

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Provide support for EBS Local Snapshots on AWS Outpost in Data Lifecycle Manager (DLM).

## __Amazon EMR Containers__
  - ### Features
    - This release is to correct the timestamp format to ISO8601 for the date parameters in the describe and list API response objects of Job Run and Virtual Clusters.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - AWS Outposts now supports EBS local snapshots on Outposts that allows customers to store snapshots of EBS volumes and AMIs locally on S3 on Outposts.

## __Amazon QuickSight__
  - ### Features
    - API release for field folders feature.

# __2.15.75__ __2021-02-03__
## __AWS Audit Manager__
  - ### Features
    - This release adds AccessDeniedException to GetServicesInScope API.

## __AWS CodeBuild__
  - ### Features
    - Documentation updates for codebuild

## __AWS Compute Optimizer__
  - ### Features
    - Documentation updates for Compute Optimizer

## __AWS Cost Explorer Service__
  - ### Features
    - Clarify valid values for the filter parameter for certain APIs.

## __AWS Glue DataBrew__
  - ### Features
    - This release adds the DescribeJobRun API to allow customers retrieve details of a given job run

## __AWS IoT SiteWise__
  - ### Features
    - Update AccessPolicy API input to support IAM role for IAM mode. Iam role is added as part of accessPolicyIdentity.

## __AWS Lambda__
  - ### Features
    - Support for creating Lambda Functions using 'nodejs14.x'

## __AWS SecurityHub__
  - ### Features
    - Added a ProductArn parameter to DescribeProducts. ProductArn is used to identify the integration to return details for.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - EC2 Public IP now supports API for setting PTR records on Elastic IP address.

## __Amazon S3__
  - ### Features
    - Amazon S3 now supports AWS PrivateLink, providing direct access to S3 via a private endpoint within your virtual private network.

## __Amazon WorkMail__
  - ### Features
    - Increased maximum length of ipRanges values for Access Control Rules from 10 to 1024.

# __2.15.74__ __2021-02-02__
## __AWS App Mesh__
  - ### Features
    - App Mesh now supports mutual TLS with two-way peer authentication. You can specify client certificates, server-side TLS validation, and matching of Subject Alternative Names.

## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports Image Media Playlists on HLS outputs, version 0.4 (trick-mode).

## __AWS IoT Wireless__
  - ### Features
    - Add enum value MqttTopic for Destination ExpressionType, add LoRaWANNetworkServerCertificateId for GetWirelessGatewayCertificate API

## __AWS Organizations__
  - ### Features
    - Documentation updates for AWS Organizations.

## __AWS RDS DataService__
  - ### Features
    - With the Data API, you can now use UUID and JSON data types as input to your database. Also with the Data API, you can now have a LONG type value returned from your database as a STRING value.

## __AWS S3 Control__
  - ### Features
    - Amazon S3 Batch Operations now supports Delete Object Tagging

## __Amazon Location Service__
  - ### Features
    - Doc only update for Amazon Location Maps that fixes a customer related issue regarding MapConfiguration

## __Amazon Lookout for Vision__
  - ### Features
    - This release includes the General Availability (GA) SDK for Amazon Lookout for Vision. New for GA is tagging support for Amazon Lookout for Vision models.

## __Amazon Route 53__
  - ### Features
    - Documentation updates for Route 53

## __Application Auto Scaling__
  - ### Features
    - With this release, scheduled actions of Application Auto Scaling can be created in the local time zone and automatically adjusted according to daylight saving changes.

# __2.15.73__ __2021-01-29__
## __AWS Elemental MediaLive__
  - ### Features
    - "AWS Elemental MediaLive now supports output to a private VPC. When this property is specified, the output will egress from a user specified VPC."

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Connect Service__
  - ### Features
    - Added API to manage queues or get hours of operation for a queue programmatically, which can be used to create new/update queues, or take actions when skills are outside of their hours of operation.

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API adds support for using object prefixes to refine the scope of a classification job.

## __Amazon Transcribe Streaming Service__
  - ### Features
    - Amazon Transcribe Streaming Medical now supports Protected Health Information (PHI) identification which enables you to identify PHI entities based on HIPAA Privacy Rule.

# __2.15.72__ __2021-01-28__
## __AWS Glue DataBrew__
  - ### Features
    - This SDK release adds support for specifying a custom delimiter for input CSV datasets and for CSV job outputs.

## __AWS IoT__
  - ### Features
    - Documentation updates for IoT DeleteOTAUpdate API

## __AWS RoboMaker__
  - ### Features
    - This release allows Robomaker customers to specify configuration for uploading logs and artifacts generated by their simulation jobs.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Well-Architected Tool__
  - ### Features
    - Documentation updates for AWS Well-Architected Tool

## __Amazon CloudWatch__
  - ### Features
    - Update to SDK to support label time zones in CloudWatch GetMetricData

## __Amazon Managed Blockchain__
  - ### Features
    - This release supports tagging on Amazon Managed Blockchain resources.

# __2.15.71__ __2021-01-27__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Access Analyzer__
  - ### Features
    - This release adds Secrets Manager secrets as a supported resource in IAM Access Analyzer to help you identify secrets that can be accessed from outside your account or AWS organization.

## __Amazon Connect Customer Profiles__
  - ### Features
    - This release makes Uri a required parameter in GetIntegrationRequest and DeleteIntegrationRequest.

## __Amazon ElastiCache__
  - ### Features
    - Add support to pass ParameterGroup name as part updating Engine Version of Global Datastore.

## __Amazon Elasticsearch Service__
  - ### Features
    - Amazon Elasticsearch Service adds support for node-to-node encryption and encryption at rest for existing domains running Elasticsearch version 6.7 and above

## __Amazon Lightsail__
  - ### Features
    - Documentation updates for Lightsail

## __Amazon Simple Email Service__
  - ### Features
    - This release includes the ability to assign a configuration set to an email identity (a domain or email address), which allows the settings from the configuration set to be applied to the identity.

# __2.15.70__ __2021-01-26__
## __AWS Backup__
  - ### Features
    - Documentation updates for AWS Backup

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - Cross-Region Copying Pre-Signer for CopyDBClusterSnapshot and CreateDBCluster API of DocDB.

## __Amazon Neptune__
  - ### Features
    - Cross-Region Copying Pre-Signer for CopyDBClusterSnapshot and CreateDBCluster API of Neptune.

## __DynamoDB Enhanced Client__
  - ### Bugfixes
    - Converts string to NULL attribute if it's null. See [#2243](https://github.com/aws/aws-sdk-java-v2/issues/2243)

# __2.15.69__ __2021-01-22__
## __AWS IoT Greengrass V2__
  - ### Features
    - Documentation updates that improve clarity and fix broken links.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Introducing startDate field for CapacityReservation object for the date and time which the reservation started and adding reserved parameter for ModifyCapacityReservation.

## __Amazon Lex Model Building V2__
  - ### Features
    - This release adds support for Amazon Lex V2 APIs for model building.

## __Amazon Lex Runtime V2__
  - ### Features
    - This release adds support for Amazon Lex V2 APIs for runtime, including Streaming APIs for conversation management.

## __Amazon Redshift__
  - ### Features
    - Update VPC endpoint field names.

## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for Amazon RDS

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Documentation updates for the ListDocumentFilters API action.

# __2.15.68__ __2021-01-21__
## __AWS Resource Groups Tagging API__
  - ### Features
    - This release adds a new parameter ResourceARNList to Resource Groups Tagging api GetResources api to allow customers retrieve tag data for specific resources.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Add support for content-type in AsyncRequestBody.

## __AWS SecurityHub__
  - ### Features
    - This release of ASFF adds a new Action object and a new resource details object - AwsSsmPatchCompliance. It also adds several new attributes for the AwsEc2NetworkInterface resource type.

## __Managed Streaming for Kafka__
  - ### Features
    - Amazon MSK has added a new API that allows you to update all the brokers in the cluster to the specified type.

# __2.15.67__ __2021-01-19__
## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - ACM Private CA is launching additional certificate templates and API parameters. This allows customers to create custom certificates for their identity and secure communication use cases.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Chime__
  - ### Features
    - Add support for specifying ChimeBearer header as part of the request for Amazon Chime SDK messaging APIs. Documentation updates.

## __Amazon EC2 Container Service__
  - ### Features
    - This release adds support to include task definition metadata information such as registeredAt, deregisteredAt, registeredBy as part of DescribeTaskDefinition API.

# __2.15.66__ __2021-01-15__
## __Amazon Simple Notification Service__
  - ### Features
    - Documentation updates for Amazon SNS.

# __2.15.65__ __2021-01-14__
## __AWS S3 Control__
  - ### Features
    - Amazon S3 Batch Operations now supports restoring objects from the S3 Intelligent-Tiering Archive Access and Deep Archive Access tiers.

## __Amazon Cognito Identity__
  - ### Features
    - Add Attributes For Access Control support for Amazon Cognito Identity Pools to facilitate access to AWS resources based on attributes from social and corporate identity providers

## __Amazon Pinpoint__
  - ### Features
    - Customers can create segments using 5 new filters. Filters can check for the presence of a substring in attributes and can perform time-based comparisons formatted as ISO_INSTANT datetimes.

## __Amazon SageMaker Service__
  - ### Features
    - This feature allows customers to enable/disable model caching on Multi-Model endpoints.

# __2.15.64__ __2021-01-13__
## __AWS SDK for Java v2__
  - ### Bugfixes
    - Reverting synchronization of eventsToDeliver Object in onComplete() [PR#1971](https://github.com/aws/aws-sdk-java-v2/pull/1971) since it was causing latency.

## __Amazon Fraud Detector__
  - ### Features
    - Added support for cancelling a model version that is TRAINING_IN_PROGRESS.

## __Amazon Personalize__
  - ### Features
    - Miscellaneous updates and improvements to the documentation

# __2.15.63__ __2021-01-12__
## __AWS Audit Manager__
  - ### Features
    - This release introduces tag support for assessment frameworks. You can now add, remove, and get tags from existing frameworks, and specify the tags to apply when creating a custom framework.

## __AWS Commont Runtime HTTP Client__
  - ### Features
    - Upgrade `aws-crt` to version `0.9.3`

## __Amazon AppStream__
  - ### Features
    - Adds support for the Smart Card Redirection feature

## __Amazon ElastiCache__
  - ### Features
    - Documentation updates for elasticache

## __Amazon Lightsail__
  - ### Features
    - This release adds IPv6 support for Amazon Lightsail instances, container services, CDN distributions, and load balancers.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - AWS Systems Manager adds pagination support for DescribeDocumentPermission API

# __2.15.62__ __2021-01-11__
## __AWS Key Management Service__
  - ### Features
    - Adds support for filtering grants by grant ID and grantee principal in ListGrants requests to AWS KMS.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Relational Database Service__
  - ### Features
    - This releases adds support for Major Version Upgrades on Aurora MySQL Global Clusters. Customers will be able to upgrade their whole Aurora MySQL Global Cluster to a new major engine version.

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Correctly select the cipher suites based on the HTTP protocol. See [#2159](https://github.com/aws/aws-sdk-java-v2/issues/2159)
    - Use `SystemPropretyTlsKeyManagersProvider` if no `KeyManger` is provided.

# __2.15.61__ __2021-01-07__
## __AWS CodePipeline__
  - ### Features
    - Adding cancelled status and summary for executions aborted by pipeline updates.

## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for I-Frame-only HLS manifest generation in CMAF outputs.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon DevOps Guru__
  - ### Features
    - Add resourceHours field in GetAccountHealth API to show total number of resource hours AWS Dev Ops Guru has done work for in the last hour.

# __2.15.60__ __2021-01-06__
## __AWS Auto Scaling Plans__
  - ### Features
    - Documentation updates for AWS Auto Scaling

## __AWS Transfer Family__
  - ### Features
    - This release adds support for Amazon EFS, so customers can transfer files over SFTP, FTPS and FTP in and out of Amazon S3 as well as Amazon EFS.

## __Auto Scaling__
  - ### Features
    - This update increases the number of instance types that can be added to the overrides within an mixed instances group configuration.

# __2.15.59__ __2021-01-05__
## __AWS Cost Explorer Service__
  - ### Features
    - - ### Features - Add new GetCostcategories API - Support filter for GetDimensions, GetTags and GetCostcategories api - Support sortBy metrics for GetDimensions, GetTags and GetCostcategories api

## __Amazon S3__
  - ### Features
    - `S3Utilities#getUrl` now supports versionId. See [#2224](https://github.com/aws/aws-sdk-java-v2/issues/2224)

## __Application Auto Scaling__
  - ### Features
    - Documentation updates for Application Auto Scaling

# __2.15.58__ __2021-01-04__
## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix for [#1684](https://github.com/aws/aws-sdk-java-v2/issues/1684) Some of the Retry attempts which failed due to the API TimeOuts did not successfully retried but ended up with AbortedException.

## __Amazon CloudSearch__
  - ### Features
    - This release adds support for new Amazon CloudSearch instances.

## __Amazon HealthLake__
  - ### Features
    - Amazon HealthLake now supports exporting data from FHIR Data Stores in Preview.

# __2.15.57__ __2020-12-31__
## __AWS Service Catalog__
  - ### Features
    - Enhanced Service Catalog DescribeProvisioningParameters API to return new parameter constraints, i.e., MinLength, MaxLength, MinValue, MaxValue, ConstraintDescription and AllowedPattern

# __2.15.56__ __2020-12-30__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon ElastiCache__
  - ### Features
    - Documentation updates for elasticache

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API includes miscellaneous updates and improvements to the documentation.

# __2.15.55__ __2020-12-29__
## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - This release adds a new parameter "CsrExtensions" in the "CertificateAuthorityConfiguration" data structure, which allows customers to add the addition of KU and SIA into the CA CSR.

## __AmazonApiGatewayV2__
  - ### Features
    - Amazon API Gateway now supports data mapping for HTTP APIs which allows customers to modify HTTP Request before sending it to their integration and HTTP Response before sending it to the invoker.

# __2.15.54__ __2020-12-28__
## __Amazon CloudFront__
  - ### Features
    - Amazon CloudFront has deprecated the CreateStreamingDistribution and CreateStreamingDistributionWithTags APIs as part of discontinuing support for Real-Time Messaging Protocol (RTMP) distributions.

# __2.15.53__ __2020-12-23__
## __AWS Compute Optimizer__
  - ### Features
    - This release enables AWS Compute Optimizer to analyze and generate optimization recommendations for lambda functions.

## __AWS Database Migration Service__
  - ### Features
    - AWS DMS launches support for AWS Secrets Manager to manage Oracle ASM Database credentials

## __AWS Resource Groups__
  - ### Features
    - Add operation `PutGroupConfiguration`. Support dedicated hosts and add `Pending` in operations `Un/GroupResources`. Add `Resources` in `ListGroupResources` and deprecate `ResourceIdentifiers`.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

# __2.15.52__ __2020-12-22__
## __AWS Cost Explorer Service__
  - ### Features
    - This release adds additional metadata that may be applicable to the Rightsizing Recommendations.

## __AWS Glue__
  - ### Features
    - AWS Glue Find Matches machine learning transforms now support column importance scores.

## __AWS IoT Wireless__
  - ### Features
    - Adding the ability to use Fingerprint in GetPartnerAccount and ListPartnerAccounts API responses to protect sensitive customer account information.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Connect Service__
  - ### Features
    - This release adds support for quick connects. For details, see the Release Notes in the Amazon Connect Administrator Guide.

## __Amazon ElastiCache__
  - ### Features
    - Documentation updates for elasticache

## __Amazon Relational Database Service__
  - ### Features
    - Adds customer-owned IP address (CoIP) support to Amazon RDS on AWS Outposts.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - SSM Maintenance Window support for registering/updating maintenance window tasks without targets.

# __2.15.51__ __2020-12-21__
## __AWS Batch__
  - ### Features
    - Documentation updates for batch

## __AWS Config__
  - ### Features
    - AWS Config adds support to save advanced queries. New API operations - GetStoredQuery, PutStoredQuery, ListStoredQueries, DeleteStoredQuery

## __AWS Database Migration Service__
  - ### Features
    - AWS DMS launches support for AWS Secrets Manager to manage source and target database credentials.

## __AWS Glue__
  - ### Features
    - Add 4 connection properties: SECRET_ID, CONNECTOR_URL, CONNECTOR_TYPE, CONNECTOR_CLASS_NAME. Add two connection types: MARKETPLACE, CUSTOM

## __AWS Outposts__
  - ### Features
    - In this release, AWS Outposts adds support for three new APIs: TagResource, UntagResource, and ListTagsForResource. Customers can now manage tags for their resources through the SDK.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS SecurityHub__
  - ### Features
    - Finding providers can now use BatchImportFindings to update Confidence, Criticality, RelatedFindings, Severity, and Types.

## __AWS Service Catalog App Registry__
  - ### Features
    - New API `SyncResouce` to update AppRegistry system tags.

## __Amazon API Gateway__
  - ### Features
    - Documentation updates for Amazon API Gateway.

## __Amazon Connect Participant Service__
  - ### Features
    - This release adds three new APIs: StartAttachmentUpload, CompleteAttachmentUpload, and GetAttachment. For Amazon Connect Chat, you can use these APIs to share files in chat conversations.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds Tag On Create feature support for the AllocateAddress API.

## __Amazon Managed Blockchain__
  - ### Features
    - Added support for provisioning and managing public Ethereum nodes on main and test networks supporting secure access using Sigv4 and standard open-source Ethereum APIs.

## __Amazon QLDB Session__
  - ### Features
    - Adds "TimingInformation" to all SendCommand API results and "IOUsage" to ExecuteStatementResult, FetchPageResult and CommitTransactionResult.

## __Amazon Simple Storage Service__
  - ### Features
    - Format GetObject's Expires header to be an http-date instead of iso8601

## __Service Quotas__
  - ### Features
    - Added the ability to tag applied quotas.

# __2.15.50__ __2020-12-18__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Upgrading jackson.databind.version to 2.10.5.1

## __Amazon Elastic Compute Cloud__
  - ### Features
    - EBS io2 volumes now supports Multi-Attach

## __Amazon Personalize Runtime__
  - ### Features
    - Updated FilterValues regex pattern to align with Filter Expression.

## __Amazon Relational Database Service__
  - ### Features
    - Adds IAM DB authentication information to the PendingModifiedValues output of the DescribeDBInstances API. Adds ClusterPendingModifiedValues information to the output of the DescribeDBClusters API.

# __2.15.49__ __2020-12-17__
## __AWS Config__
  - ### Features
    - Adding PutExternalEvaluation API which grants permission to deliver evaluation result to AWS Config

## __AWS Key Management Service__
  - ### Features
    - Added CreationDate and LastUpdatedDate timestamps to ListAliases API response

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

  - ### Bugfixes
    - This change fixes a bug in the code generation related to eventstreams that prevents multiple events to share the same shape.

## __AWS Service Catalog__
  - ### Features
    - Support TagOptions sharing with Service Catalog portfolio sharing.

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Provide Cross-account copy event based policy support in DataLifecycleManager (DLM)

## __Amazon Elastic Compute Cloud__
  - ### Features
    - C6gn instances are powered by AWS Graviton2 processors and offer 100 Gbps networking bandwidth. These instances deliver up to 40% better price-performance benefit versus comparable x86-based instances

## __Amazon Route 53__
  - ### Features
    - This release adds support for DNSSEC signing in Amazon Route 53.

## __Amazon Route 53 Resolver__
  - ### Features
    - Route 53 Resolver adds support for enabling resolver DNSSEC validation in virtual private cloud (VPC).

## __Amazon Simple Queue Service__
  - ### Features
    - Amazon SQS adds queue attributes to enable high throughput FIFO.

## __EC2 Image Builder__
  - ### Features
    - This release adds support for building and distributing container images within EC2 Image Builder.

# __2.15.48__ __2020-12-16__
## __AWS Cost Explorer Service__
  - ### Features
    - This release updates the "MonitorArnList" from a list of String to be a list of Arn for both CreateAnomalySubscription and UpdateAnomalySubscription APIs

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Well-Architected Tool__
  - ### Features
    - This is the first release of AWS Well-Architected Tool API support, use to review your workload and compare against the latest AWS architectural best practices.

## __Amazon Location Service__
  - ### Features
    - Initial release of Amazon Location Service. A new geospatial service providing capabilities to render maps, geocode/reverse geocode, track device locations, and detect geofence entry/exit events.

## __Amazon Prometheus Service__
  - ### Features
    - Documentation updates for Amazon Managed Service for Prometheus

## __Amazon QuickSight__
  - ### Features
    - QuickSight now supports connecting to federated data sources of Athena

# __2.15.47__ __2020-12-15__
## __AWS IoT__
  - ### Features
    - AWS IoT Rules Engine adds Kafka Action that allows sending data to Apache Kafka clusters inside a VPC. AWS IoT Device Defender adds custom metrics and machine-learning based anomaly detection.

## __AWS IoT Analytics__
  - ### Features
    - FileFormatConfiguration enables data store to save data in JSON or Parquet format. S3Paths enables you to specify the S3 objects that save your channel messages when you reprocess the pipeline.

## __AWS IoT Core Device Advisor__
  - ### Features
    - AWS IoT Core Device Advisor is fully managed test capability for IoT devices. Device manufacturers can use Device Advisor to test their IoT devices for reliable and secure connectivity with AWS IoT.

## __AWS IoT Fleet Hub__
  - ### Features
    - AWS IoT Fleet Hub, a new feature of AWS IoT Device Management that provides a web application for monitoring and managing device fleets connected to AWS IoT at scale.

## __AWS IoT Greengrass V2__
  - ### Features
    - AWS IoT Greengrass V2 is a new major version of AWS IoT Greengrass. This release adds several updates such as modular components, continuous deployments, and improved ease of use.

## __AWS IoT Wireless__
  - ### Features
    - AWS IoT for LoRaWAN enables customers to setup a private LoRaWAN network by connecting their LoRaWAN devices and gateways to the AWS cloud without managing a LoRaWAN Network Server.

## __AWS Lambda__
  - ### Features
    - Added support for Apache Kafka as a event source. Added support for TumblingWindowInSeconds for streams event source mappings. Added support for FunctionResponseTypes for streams event source mappings

## __Amazon Prometheus Service__
  - ### Features
    - (New Service) Amazon Managed Service for Prometheus is a fully managed Prometheus-compatible monitoring service that makes it easy to monitor containerized applications securely and at scale.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Adding support for Change Manager API content

# __2.15.46__ __2020-12-14__
## __AWS Global Accelerator__
  - ### Features
    - This release adds support for custom routing accelerators

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Treat zero-byte responses from async HTTP clients as not having a payload, regardless of the response content-length. This fixes an issue that could cause HEAD responses (e.g. s3's headObject responses) with a content-length specified from being treated as having a payload. This fixes issues like [#1216](https://github.com/aws/aws-sdk-java-v2/issues/1216) where the SDK attempts to read data from the response based on the content-length, not based on whether there was actually a payload.

## __Amazon DevOps Guru__
  - ### Features
    - Documentation updates for DevOps Guru.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Add c5n.metal to ec2 instance types list

# __2.15.45__ __2020-12-11__
## __AWS CloudTrail__
  - ### Features
    - CloudTrailInvalidClientTokenIdException is now thrown when a call results in the InvalidClientTokenId error code. The Name parameter of the AdvancedEventSelector data type is now optional.

## __AWS IoT SiteWise__
  - ### Features
    - Added the ListAssetRelationships operation and support for composite asset models, which represent structured sets of properties within asset models.

## __AWS Performance Insights__
  - ### Features
    - You can group DB load according to the dimension groups for database, application, and session type. Amazon RDS also supports the dimensions db.name, db.application.name, and db.session_type.name.

## __Amazon CloudWatch__
  - ### Features
    - Documentation updates for monitoring

## __Amazon GuardDuty__
  - ### Features
    - Documentation updates for GuardDuty

## __Auto Scaling__
  - ### Features
    - Documentation updates and corrections for Amazon EC2 Auto Scaling API Reference and SDKs.

# __2.15.44__ __2020-12-10__
## __AWS Network Manager__
  - ### Features
    - This release adds API support for Transit Gateway Connect integration into AWS Network Manager.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports adding synonyms to an index through the new Thesaurus resource.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - TGW connect simplifies connectivity of SD-WAN appliances; IGMP support for TGW multicast; VPC Reachability Analyzer for VPC resources connectivity analysis.

# __2.15.43__ __2020-12-09__
## __AWS Global Accelerator__
  - ### Features
    - This release adds support for custom routing accelerators

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for G4ad instances powered by AMD Radeon Pro V520 GPUs and AMD 2nd Generation EPYC processors

## __Amazon Redshift__
  - ### Features
    - Add support for availability zone relocation feature.

# __2.15.42__ __2020-12-08__
## __AWS Audit Manager__
  - ### Features
    - AWS Audit Manager helps you continuously audit your AWS usage to simplify how you manage risk and compliance. This update releases the first version of the AWS Audit Manager APIs and SDK.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - The SDK will now retry on `TransactionInProgressException` error code.

## __AWSKendraFrontendService__
  - ### Features
    - 1. Amazon Kendra connector for Google Drive repositories 2. Amazon Kendra's relevance ranking models are regularly tuned for each customer by capturing end-user search patterns and feedback.

## __Amazon EC2 Container Registry__
  - ### Features
    - This release adds support for configuring cross-region and cross-account replication of your Amazon ECR images.

## __Amazon EMR Containers__
  - ### Features
    - This release adds support for Amazon EMR on EKS, a simple way to run Spark on Kubernetes.

## __Amazon Forecast Service__
  - ### Features
    - This release adds support for the Amazon Forecast Weather Index which can increase forecasting accuracy by automatically including weather forecasts in demand forecasts.

## __Amazon HealthLake__
  - ### Features
    - This release introduces Amazon HealthLake (preview), a HIPAA-eligible service that enables healthcare and life sciences customers to store, transform, query, and analyze health data in the AWS Cloud.

## __Amazon QuickSight__
  - ### Features
    - Added new parameters for join optimization.

## __Amazon SageMaker Runtime__
  - ### Features
    - This feature allows customers to invoke their endpoint with an inference ID. If used and data capture for the endpoint is enabled, this ID will be captured along with request data.

## __Amazon SageMaker Service__
  - ### Features
    - This feature helps you monitor model performance characteristics such as accuracy, identify undesired bias in your ML models, and explain model decisions better with explainability drift detection.

## __Amazon Sagemaker Edge Manager__
  - ### Features
    - Amazon SageMaker Edge Manager makes it easy to optimize, secure, monitor, and maintain machine learning (ML) models across fleets of edge devices such as smart cameras, smart speakers, and robots.

# __2.15.41__ __2020-12-07__
## __AWS Common Runtime HTTP Client__
  - ### Features
    - Bump up `aws-crt` version to `0.9.0`

## __AWS Database Migration Service__
  - ### Features
    - Added PreserveTransaction setting to preserve order of CDC for S3 as target. Added CsvNoSupValue setting to replace empty value for columns not included in the supplemental log for S3 as target.

## __AWS SDK for Java v2__
  - ### Features
    - Added amz-sdk-request and removed amz-sdk-retry header. The new header matches the behavior of the other SDKs.
    - Updated service endpoint metadata.

## __AWS Service Catalog App Registry__
  - ### Features
    - AWS Service Catalog AppRegistry now supports adding, removing, and listing tags on resources after they are created.

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Fixed the issue where certain handshake errors manifested as acquire connection timeout error when using TLS1.3 and proxy.

# __2.15.40__ __2020-12-04__
## __AWS Directory Service__
  - ### Features
    - Documentation updates for ds - updated descriptions

## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports black video and audio silence as new conditions to trigger automatic input failover.

## __AWS Lambda__
  - ### Features
    - Added the additional enum InvalidImage to StateReasonCode and LastUpdateStatusReasonCode fields.

## __AWS License Manager__
  - ### Features
    - Automated Discovery now has support for custom tags, and detects software uninstalls.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Avoid costly metrics collection when metric collector is NoOpMetricCollector.
        - Contributed by: [@croudet](https://github.com/croudet)

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release introduces tag-on-create capability for the CreateImage API. A user can now specify tags that will be applied to the new resources (image, snapshots or both), during creation time.

## __Amazon Relational Database Service__
  - ### Features
    - Adds support for Amazon RDS Cross-Region Automated Backups, the ability to setup automatic replication of snapshots and transaction logs from a primary AWS Region to a secondary AWS Region.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - AWS Systems Manager Patch Manager MAC OS Support and OpsMetadata Store APIs to store operational metadata for an Application.

## __Amazon WorkSpaces__
  - ### Features
    - Update the import-workspace-image API to have "BYOL_REGULAR_WSP" as a valid input string for ingestion-process.

## __Managed Streaming for Kafka__
  - ### Features
    - Adding HEALING to ClusterState.

## __Contributors__
Special thanks to the following contributors to this release: 

[@croudet](https://github.com/croudet)
# __2.15.39__ __2020-12-03__
## __AWS Batch__
  - ### Features
    - This release adds support for customer to run Batch Jobs on ECS Fargate, the serverless compute engine built for containers on AWS. Customer can also propagate Job and Job Definition Tags to ECS Task.

## __AWS Compute Optimizer__
  - ### Features
    - This release enables AWS Compute Optimizer to analyze and generate optimization recommendations for EBS volumes that are attached to instances.

## __AWS License Manager__
  - ### Features
    - AWS License Manager enables managed entitlements for AWS customers and Software Vendors (ISV). You can track and distribute license entitlements from AWS Marketplace and supported ISVs.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AmplifyBackend__
  - ### Features
    - Regular documentation updates.

# __2.15.38__ __2020-12-01__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Connect Customer Profiles__
  - ### Features
    - This is the first release of Amazon Connect Customer Profiles, a unified customer profile for your Amazon Connect contact center.

# __2.15.37__ __2020-12-01__
## __AWS Directory Service__
  - ### Features
    - Adding client authentication feature for AWS AD Connector

## __AWS Lambda__
  - ### Features
    - This release includes support for a new feature: Container images support in AWS Lambda. This adds APIs for deploying functions as container images. AWS Lambda now supports memory up to 10240MB.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon AppIntegrations Service__
  - ### Features
    - The Amazon AppIntegrations service (in preview release) enables you to configure and reuse connections to external applications.

## __Amazon Connect Contact Lens__
  - ### Features
    - Contact Lens for Amazon Connect analyzes conversations, both real-time and post-call. The ListRealtimeContactAnalysisSegments API returns a list of analysis segments for a real-time analysis session.

## __Amazon Connect Service__
  - ### Features
    - This release adds an Amazon Connect API that provides the ability to create tasks, and a set of APIs (in preview) to configure AppIntegrations associations with Amazon Connect instances.

## __Amazon DevOps Guru__
  - ### Features
    - (New Service) Amazon DevOps Guru is available in public preview. It's a fully managed service that uses machine learning to analyze your operational solutions to help you find and troubleshoot issues.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for: EBS gp3 volumes; and D3/D3en/R5b/M5zn instances powered by Intel Cascade Lake CPUs

## __Amazon Elastic Container Registry Public__
  - ### Features
    - Supports Amazon Elastic Container Registry (Amazon ECR) Public, a fully managed registry that makes it easy for a developer to publicly share container software worldwide for anyone to download.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Amazon EKS now allows you to define and manage the lifecycle for Kubernetes add-ons for your clusters. This release adds support for the AWS VPC CNI (vpc-cni).

## __Amazon Honeycode__
  - ### Features
    - Introducing APIs to read and write directly from Honeycode tables. Use APIs to pull table and column metadata, then use the read and write APIs to programmatically read and write from the tables.

## __Amazon Lookout for Vision__
  - ### Features
    - This release introduces support for Amazon Lookout for Vision.

## __Amazon SageMaker Feature Store Runtime__
  - ### Features
    - This release adds support for Amazon SageMaker Feature Store, which makes it easy for customers to create, version, share, and manage curated data for machine learning (ML) development.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Pipelines for ML workflows. Amazon SageMaker Feature Store, a fully managed repository for ML features.

## __Amazon Simple Storage Service__
  - ### Features
    - S3 adds support for multiple-destination replication, option to sync replica modifications; S3 Bucket Keys to reduce cost of S3 SSE with AWS KMS

## __AmplifyBackend__
  - ### Features
    - (New Service) The Amplify Admin UI offers an accessible way to develop app backends and manage app content. We recommend that you use the Amplify Admin UI to manage the backend of your Amplify app.

# __2.15.36__ __2020-11-30__
## __AWS SDK for Java v2__
  - ### Features
    - Add LICENSE.txt and NOTICE.txt to META-INF directory of generated JARs
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Fixed a resource leak that could occur when closing the default credentials provider (or a client using the default credentials provider), when `closeable` credentials like STS or SSO were in use. Fixes [#2149](https://github.com/aws/aws-sdk-java-v2/issues/2149).

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release introduces Amazon EC2 Mac1 instances, a new Amazon EC2 instance family built on Apple Mac mini computers, powered by AWS Nitro System, and support running macOS workloads on Amazon EC2

# __2.15.35__ __2020-11-24__
## __AWS Batch__
  - ### Features
    - Add Ec2Configuration in ComputeEnvironment.ComputeResources. Use in CreateComputeEnvironment API to enable AmazonLinux2 support.

## __AWS CloudFormation__
  - ### Features
    - Adds support for the new Modules feature for CloudFormation. A module encapsulates one or more resources and their respective configurations for reuse across your organization.

## __AWS CloudTrail__
  - ### Features
    - CloudTrail now includes advanced event selectors, which give you finer-grained control over the events that are logged to your trail.

## __AWS CodeBuild__
  - ### Features
    - Adding GetReportGroupTrend API for Test Reports.

## __AWS Elastic Beanstalk__
  - ### Features
    - Updates the Integer constraint of DescribeEnvironmentManagedActionHistory's MaxItems parameter to [1, 100].

## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for Vorbis and Opus audio in OGG/OGA containers.

## __AWS IoT SiteWise__
  - ### Features
    - This release adds support for customer managed customer master key (CMK) based encryption in IoT SiteWise.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Step Functions__
  - ### Features
    - This release of the AWS Step Functions SDK introduces support for Synchronous Express Workflows

## __Amazon Appflow__
  - ### Features
    - Upsolver as a destination connector and documentation update.

## __Amazon Cognito Identity Provider__
  - ### Features
    - This release adds ability to configure Cognito User Pools with third party sms and email providers for sending notifications to users.

## __Amazon Comprehend__
  - ### Features
    - Support Comprehend events detection APIs

## __Amazon FSx__
  - ### Features
    - This release adds the capability to increase storage capacity of Amazon FSx for Lustre file systems, providing the flexibility to meet evolving storage needs over time.

## __Amazon GameLift__
  - ### Features
    - GameLift FlexMatch is now available as a standalone matchmaking solution. FlexMatch now provides customizable matchmaking for games hosted peer-to-peer, on-premises, or on cloud compute primitives.

## __Amazon Lex Model Building Service__
  - ### Features
    - Lex now supports es-419, de-DE locales

## __Amazon QuickSight__
  - ### Features
    - Support for embedding without user registration. New enum EmbeddingIdentityType. A potential breaking change. Affects code that refers IdentityType enum type directly instead of literal string value.

## __Amazon Timestream Write__
  - ### Features
    - Adds support of upserts for idempotent updates to Timestream.

## __Amazon Transcribe Streaming Service__
  - ### Features
    - Amazon Transcribe Medical streaming added medical specialties and HTTP/2 support. Amazon Transcribe streaming supports additional languages. Both support OGG/OPUS and FLAC codecs for streaming.

## __AmazonMWAA__
  - ### Features
    - (New Service) Amazon MWAA is a managed service for Apache Airflow that makes it easy for data engineers and data scientists to execute data processing workflows in the cloud.

# __2.15.34__ __2020-11-23__
## __AWS CodeStar connections__
  - ### Features
    - Added support for the UpdateHost API.

## __AWS Glue__
  - ### Features
    - Feature1 - Glue crawler adds data lineage configuration option. Feature2 - AWS Glue Data Catalog adds APIs for PartitionIndex creation and deletion as part of Enhancement Partition Management feature.

## __AWS IoT__
  - ### Features
    - This release enables users to identify different file types in the over-the-air update (OTA) functionality using fileType parameter for CreateOTAUpdate API

## __AWS Lambda__
  - ### Features
    - This release includes support for new feature: Code Signing for AWS Lambda. This adds new resources and APIs to configure Lambda functions to accept and verify signed code artifacts at deployment.

## __AWS License Manager__
  - ### Features
    - AWS License Manager now provides the ability for license administrators to be able to associate license configurations to AMIs shared with their AWS account

## __AWS Outposts__
  - ### Features
    - Support specifying tags during the creation of the Outpost resource. Tags are now returned in the response body of Outpost APIs.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS SecurityHub__
  - ### Features
    - Updated the account management API to support the integration with AWS Organizations. Added new methods to allow users to view and manage the delegated administrator account for Security Hub.

## __AWS Signer__
  - ### Features
    - AWS Signer is launching code-signing for AWS Lambda. Now customers can cryptographically sign Lambda code to ensure trust, integrity, and functionality.

## __AWS Single Sign-On Admin__
  - ### Features
    - AWS Single Sign-On now enables attribute-based access control for workforce identities to simplify permissions in AWS

## __Amazon CloudWatch Application Insights__
  - ### Features
    - Add Detected Workload to ApplicationComponent which shows the workloads that installed in the component

## __Amazon DynamoDB__
  - ### Features
    - With this release, you can capture data changes in any Amazon DynamoDB table as an Amazon Kinesis data stream. You also can use PartiQL (SQL-compatible language) to manipulate data in DynamoDB tables.

## __Amazon EC2 Container Service__
  - ### Features
    - This release adds support for updating capacity providers, specifying custom instance warmup periods for capacity providers, and using deployment circuit breaker for your ECS Services.

## __Amazon ElastiCache__
  - ### Features
    - Documentation updates for elasticache

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for Multiple Private DNS names to DescribeVpcEndpointServices response.

## __Amazon Elastic MapReduce__
  - ### Features
    - Add API support for EMR Studio, a new notebook-first IDE for data scientists and data engineers with single sign-on, Jupyter notebooks, automated infrastructure provisioning, and job diagnosis.

## __Amazon Forecast Service__
  - ### Features
    - Releasing the set of PredictorBacktestExportJob APIs which allow customers to export backtest values and item-level metrics data from Predictor training.

## __Amazon Timestream Query__
  - ### Features
    - Amazon Timestream now supports "QueryStatus" in Query API which has information about cumulative bytes scanned, metered, as well as progress percentage for the query.

## __Amazon Translate__
  - ### Features
    - This update adds new operations to create and manage parallel data in Amazon Translate. Parallel data is a resource that you can use to run Active Custom Translation jobs.

## __Auto Scaling__
  - ### Features
    - Documentation updates and corrections for Amazon EC2 Auto Scaling API Reference and SDKs.

## __CodeArtifact__
  - ### Features
    - Add support for the NuGet package format.

## __Managed Streaming for Kafka__
  - ### Features
    - Adding MAINTENANCE and REBOOTING_BROKER to Cluster states.

# __2.15.33__ __2020-11-20__
## __AWS App Mesh__
  - ### Features
    - This release makes tag value a required attribute of the tag's key-value pair.

## __AWS CloudHSM V2__
  - ### Features
    - Added managed backup retention, a feature that enables customers to retain backups for a configurable period after which CloudHSM service will automatically delete them.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Service Catalog App Registry__
  - ### Features
    - AWS Service Catalog AppRegistry Documentation update

## __AWS Single Sign-on__
  - ### Features
    - Added support for retrieving SSO credentials: https://docs.aws.amazon.com/cli/latest/userguide/cli-configure-sso.html.

## __Amazon Chime__
  - ### Features
    - The Amazon Chime SDK for messaging provides the building blocks needed to build chat and other real-time collaboration features.

## __Amazon CodeGuru Reviewer__
  - ### Features
    - This release supports tagging repository association resources in Amazon CodeGuru Reviewer.

## __Amazon Cognito Identity__
  - ### Features
    - Added SDK pagination support for ListIdentityPools

## __Amazon Connect Service__
  - ### Features
    - This release adds a set of Amazon Connect APIs to programmatically control instance creation, modification, description and deletion.

## __Amazon Macie 2__
  - ### Features
    - The Amazon Macie API now provides S3 bucket metadata that indicates whether any one-time or recurring classification jobs are configured to analyze data in a bucket.

## __Amazon Simple Storage Service__
  - ### Features
    - Add new documentation regarding automatically generated Content-MD5 headers when using the SDK or CLI.

## __Managed Streaming for Kafka__
  - ### Features
    - This release adds support for PER TOPIC PER PARTITION monitoring on AWS MSK clusters.

# __2.15.32__ __2020-11-19__
## __AWS Cost Explorer Service__
  - ### Features
    - Additional metadata that may be applicable to the recommendation.

## __AWS Directory Service__
  - ### Features
    - Adding multi-region replication feature for AWS Managed Microsoft AD

## __AWS Elemental MediaLive__
  - ### Features
    - The AWS Elemental MediaLive APIs and SDKs now support the ability to see the software update status on Link devices

## __AWS Glue__
  - ### Features
    - Adding support for Glue Schema Registry. The AWS Glue Schema Registry is a new feature that allows you to centrally discover, control, and evolve data stream schemas.

## __AWS Lambda__
  - ### Features
    - Added the starting position and starting position timestamp to ESM Configuration. Now customers will be able to view these fields for their ESM.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon CloudWatch Events__
  - ### Features
    - EventBridge now supports Resource-based policy authorization on event buses. This enables cross-account PutEvents API calls, creating cross-account rules, and simplifies permission management.

## __Amazon EventBridge__
  - ### Features
    - EventBridge now supports Resource-based policy authorization on event buses. This enables cross-account PutEvents API calls, creating cross-account rules, and simplifies permission management.

## __Amazon Kinesis Analytics__
  - ### Features
    - Amazon Kinesis Data Analytics now supports building and running streaming applications using Apache Flink 1.11 and provides a way to access the Apache Flink dashboard for supported Flink versions.

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex supports managing input and output contexts as well as default values for slots.

## __Amazon Lex Runtime Service__
  - ### Features
    - Amazon Lex now supports the ability to view and manage active contexts associated with a user session.

## __Amazon Redshift__
  - ### Features
    - Amazon Redshift support for returning ClusterNamespaceArn in describeClusters

## __Auto Scaling__
  - ### Features
    - You can now create Auto Scaling groups with multiple launch templates using a mixed instances policy, making it easy to deploy an AMI with an architecture that is different from the rest of the group.

# __2.15.31__ __2020-11-18__
## __AWS Backup__
  - ### Features
    - AWS Backup now supports cross-account backup, enabling AWS customers to securely copy their backups across their AWS accounts within their AWS organizations.

## __AWS CloudFormation__
  - ### Features
    - This release adds ChangeSets support for Nested Stacks. ChangeSets offer a preview of how proposed changes to a stack might impact existing resources or create new ones.

## __AWS CodeBuild__
  - ### Features
    - AWS CodeBuild - Adding Status field for Report Group

## __AWS Outposts__
  - ### Features
    - Mark the Name parameter in CreateOutpost as required.

## __AWS S3 Control__
  - ### Features
    - AWS S3 Storage Lens provides visibility into your storage usage and activity trends at the organization or account level, with aggregations by Region, storage class, bucket, and prefix.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon ElastiCache__
  - ### Features
    - Adding Memcached 1.6 to parameter family

## __Amazon Elastic Compute Cloud__
  - ### Features
    - EC2 Fleet adds support of DeleteFleets API for instant type fleets. Now you can delete an instant type fleet and terminate all associated instances with a single API call.

# __2.15.30__ __2020-11-17__
## __AWS Network Firewall__
  - ### Features
    - (New Service) AWS Network Firewall is a managed network layer firewall service that makes it easy to secure your virtual private cloud (VPC) networks and block malicious traffic.

## __Amazon Chime__
  - ### Features
    - This release adds CRUD APIs for Amazon Chime SipMediaApplications and SipRules. It also adds the API for creating outbound PSTN calls for Amazon Chime meetings.

## __Amazon Connect Service__
  - ### Features
    - This release adds support for user hierarchy group and user hierarchy structure. For details, see the Release Notes in the Amazon Connect Administrator Guide.

## __Amazon Macie 2__
  - ### Features
    - The Amazon Macie API now has a lastRunErrorStatus property to indicate if account- or bucket-level errors occurred during the run of a one-time classification job or the latest run of a recurring job.

## __Amazon Relational Database Service__
  - ### Features
    - Support copy-db-snapshot in the one region on cross clusters and local cluster for RDSonVmware. Add target-custom-availability-zone parameter to specify where a snapshot should be copied.

## __Firewall Management Service__
  - ### Features
    - Added Firewall Manager policy support for AWS Network Firewall resources.

# __2.15.29__ __2020-11-16__
## __AWS CodePipeline__
  - ### Features
    - We show details about inbound executions and id of action executions in GetPipelineState API. We also add ConflictException to StartPipelineExecution, RetryStageExecution, StopPipelineExecution APIs.

## __AWS Database Migration Service__
  - ### Features
    - Adding MoveReplicationTask feature to move replication tasks between instances

## __AWS IoT Secure Tunneling__
  - ### Features
    - Support using multiple data streams per tunnel using the Secure Tunneling multiplexing feature.

## __AWS IoT SiteWise__
  - ### Features
    - This release supports Unicode characters for string operations in formulae computes in SiteWise. For more information, search for SiteWise in Amazon What's new or refer the SiteWise documentation.

## __AWS Service Catalog__
  - ### Features
    - Support import of CloudFormation stacks into Service Catalog provisioned products.

## __Amazon QuickSight__
  - ### Features
    - Adding new parameters for dashboard persistence

## __Amazon SageMaker Service__
  - ### Features
    - This feature enables customers to encrypt their Amazon SageMaker Studio storage volumes with customer master keys (CMKs) managed by them in AWS Key Management Service (KMS).

## __Amazon Simple Notification Service__
  - ### Features
    - Documentation updates for Amazon SNS.

## __Synthetics__
  - ### Features
    - AWS Synthetics now supports Environment Variables to assign runtime parameters in the canary scripts.

# __2.15.28__ __2020-11-13__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Shield__
  - ### Features
    - This release adds APIs for two new features: 1) Allow customers to bundle resources into protection groups and treat as a single unit. 2) Provide per-account event summaries to all AWS customers.

## __Amazon Textract__
  - ### Features
    - AWS Textract now allows customers to specify their own KMS key to be used for asynchronous jobs output results, AWS Textract now also recognizes handwritten text from English documents.

## __Elastic Load Balancing__
  - ### Features
    - Adds dualstack support for Network Load Balancers (TCP/TLS only), an attribute for WAF fail open for Application Load Balancers, and an attribute for connection draining for Network Load Balancers.

# __2.15.27__ __2020-11-12__
## __AWS IoT__
  - ### Features
    - This release adds a batchMode parameter to the IotEvents, IotAnalytics, and Firehose actions which allows customers to send an array of messages to the corresponding services

## __AWS RoboMaker__
  - ### Features
    - This release introduces Robomaker Worldforge TagsOnCreate which allows customers to tag worlds as they are being generated by providing the tags while configuring a world generation job.

## __AWS Service Catalog App Registry__
  - ### Features
    - AWS Service Catalog AppRegistry provides a repository of your applications, their resources, and the application metadata that you use within your enterprise.

## __Amazon Lex Model Building Service__
  - ### Features
    - Lex now supports es-ES, it-IT, fr-FR and fr-CA locales

## __Amazon Lightsail__
  - ### Features
    - This release adds support for Amazon Lightsail container services. You can now create a Lightsail container service, and deploy Docker images to it.

## __Amazon Personalize Runtime__
  - ### Features
    - Adds support to use dynamic filters with Personalize.

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds new Australian English female voice - Olivia. Olivia is available as Neural voice only.

# __2.15.26__ __2020-11-11__
## __AWS Amplify__
  - ### Features
    - Whereas previously custom headers were set via the app's buildspec, custom headers can now be set directly on the Amplify app for both ci/cd and manual deploy apps.

## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for Automated ABR encoding and improved the reliability of embedded captions in accelerated outputs.

## __AWS Glue DataBrew__
  - ### Features
    - This is the initial SDK release for AWS Glue DataBrew. DataBrew is a visual data preparation tool that enables users to clean and normalize data without writing any code.

## __AWS Service Catalog__
  - ### Features
    - Adding support to remove a Provisioned Product launch role via UpdateProvisionedProductProperties

## __Amazon Forecast Service__
  - ### Features
    - Providing support of custom quantiles in CreatePredictor API.

## __Amazon QuickSight__
  - ### Features
    - QuickSight now supports Column-level security and connecting to Oracle data source.

## __Netty NIO HTTP Client__
  - ### Features
    - Upgrade Netty libraries to `4.1.53.Final`, and `netty-tcnative-boringssl-static` to `2.0.34.Final`.

  - ### Bugfixes
    - Fix a bug where the Netty HTTP client can leak memory when a response stream is cancelled prematurely but the upstream publisher continues to invoke onNext for some time before stopping. Fixes [#2051](https://github.com/aws/aws-sdk-java-v2/issues/2051).

# __2.15.25__ __2020-11-10__
## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix default client error to have spaces between words.
        - Contributed by: [@frosforever](https://github.com/frosforever)
    - Replaced class loading from Thread.currentThread().getContextClassLoader() to ClassLoaderHelper in ProfileCredentialsUtils and WebIdentityCredentialsUtils, since it was causing Class not found error.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for Gateway Load Balancer VPC endpoints and VPC endpoint services

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Add SessionId as a filter for DescribeSessions API

## __Auto Scaling__
  - ### Features
    - Documentation updates and corrections for Amazon EC2 Auto Scaling API Reference and SDKs.

## __Elastic Load Balancing__
  - ### Features
    - Added support for Gateway Load Balancers, which make it easy to deploy, scale, and run third-party virtual networking appliances.

## __Contributors__
Special thanks to the following contributors to this release: 

[@frosforever](https://github.com/frosforever)
# __2.15.24__ __2020-11-09__
## __AWS DataSync__
  - ### Features
    - DataSync now enables customers to adjust the network bandwidth used by a running AWS DataSync task.

## __AWS IoT Analytics__
  - ### Features
    - AWS IoT Analytics now supports Late Data Notifications for datasets, dataset content creation using previous version IDs, and includes the LastMessageArrivalTime attribute for channels and datastores.

## __AWS Storage Gateway__
  - ### Features
    - Added bandwidth rate limit schedule for Tape and Volume Gateways

## __Amazon DynamoDB__
  - ### Features
    - This release adds supports for exporting Amazon DynamoDB table data to Amazon S3 to perform analytics at any scale.

## __Amazon EC2 Container Service__
  - ### Features
    - This release provides native support for specifying Amazon FSx for Windows File Server file systems as volumes in your Amazon ECS task definitions.

## __Amazon Elasticsearch Service__
  - ### Features
    - Adding support for package versioning in Amazon Elasticsearch Service

## __Amazon FSx__
  - ### Features
    - This release adds support for creating DNS aliases for Amazon FSx for Windows File Server, and using AWS Backup to automate scheduled, policy-driven backup plans for Amazon FSx file systems.

## __Amazon Macie 2__
  - ### Features
    - Sensitive data findings in Amazon Macie now include enhanced location data for Apache Avro object containers and Apache Parquet files.

## __Amazon Simple Storage Service__
  - ### Features
    - S3 Intelligent-Tiering adds support for Archive and Deep Archive Access tiers; S3 Replication adds replication metrics and failure notifications, brings feature parity for delete marker replication

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - add a new filter to allow customer to filter automation executions by using resource-group which used for execute automation

# __2.15.23__ __2020-11-06__
## __AWS Elemental MediaLive__
  - ### Features
    - Support for SCTE35 ad markers in OnCuePoint style in RTMP outputs.

## __AWS IoT SiteWise__
  - ### Features
    - Remove the CreatePresignedPortalUrl API

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Amazon Data Lifecycle Manager now supports the creation and retention of EBS-backed Amazon Machine Images

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Network card support with four new attributes: NetworkCardIndex, NetworkPerformance, DefaultNetworkCardIndex, and MaximumNetworkInterfaces, added to the DescribeInstanceTypes API.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Documentation updates for Systems Manager

# __2.15.22__ __2020-11-05__
## __AWS App Mesh__
  - ### Features
    - This release adds circuit breaking capabilities to your mesh with connection pooling and outlier detection support.

## __AWS Lambda__
  - ### Features
    - Support Amazon MQ as an Event Source.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports providing user context in your query requests, Tokens can be JSON or JWT format. This release also introduces support for Confluence cloud datasources.

## __Amazon CloudWatch Events__
  - ### Features
    - With this release, customers can now reprocess past events by storing the events published on event bus in an encrypted archive.

## __Amazon DynamoDB__
  - ### Features
    - This release adds a new ReplicaStatus INACCESSIBLE_ENCRYPTION_CREDENTIALS for the Table description, indicating when a key used to encrypt a regional replica table is not accessible.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for EC2.

## __Amazon Elasticsearch Service__
  - ### Features
    - Amazon Elasticsearch Service now provides the ability to define a custom endpoint for your domain and link an SSL certificate from ACM, making it easier to refer to Kibana and the domain endpoint.

## __Amazon EventBridge__
  - ### Features
    - With this release, customers can now reprocess past events by storing the events published on event bus in an encrypted archive.

## __Amazon Fraud Detector__
  - ### Features
    - Added support for deleting resources like Variables, ExternalModels, Outcomes, Models, ModelVersions, Labels, EventTypes and EntityTypes. Updated DeleteEvent operation to catch missing exceptions.

## __Amazon Relational Database Service__
  - ### Features
    - Supports a new parameter to set the max allocated storage in gigabytes for the CreateDBInstanceReadReplica API.

# __2.15.21__ __2020-11-04__
## __AWS IoT__
  - ### Features
    - Updated API documentation and added paginator for AWS Iot Registry ListThingPrincipals API.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Service Catalog__
  - ### Features
    - Service Catalog API ListPortfolioAccess can now support a maximum PageSize of 100.

## __AWS X-Ray__
  - ### Features
    - Releasing new APIs GetInsightSummaries, GetInsightEvents, GetInsight, GetInsightImpactGraph and updating GetTimeSeriesServiceStatistics API for AWS X-Ray Insights feature

## __AWSMarketplace Metering__
  - ### Features
    - Adding Vendor Tagging Support in MeterUsage and BatchMeterUsage API.

## __Amazon CloudWatch__
  - ### Features
    - Documentation updates for monitoring

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added support for Client Connect Handler for AWS Client VPN. Fleet supports launching replacement instances in response to Capacity Rebalance recommendation.

## __Amazon Elasticsearch Service__
  - ### Features
    - Amazon Elasticsearch Service now supports native SAML authentication that seamlessly integrates with the customers' existing SAML 2.0 Identity Provider (IdP).

## __Amazon Transcribe Streaming Service__
  - ### Features
    - With this release, Amazon Transcribe now supports real-time transcription from audio sources in Italian (it-IT) and German(de-DE).

## __AmazonMQ__
  - ### Features
    - Amazon MQ introduces support for RabbitMQ, a popular message-broker with native support for AMQP 0.9.1. You can now create fully-managed RabbitMQ brokers in the cloud.

## __Auto Scaling__
  - ### Features
    - Capacity Rebalance helps you manage and maintain workload availability during Spot interruptions by proactively augmenting your Auto Scaling group with a new instance before interrupting an old one.

# __2.15.20__ __2020-11-02__
## __AWS DynamoDB Enhanced Client__
  - ### Bugfixes
    - Publisher streams returned by async resources in the DynamoDB Enhanced Client now correctly handle mapping errors when they are encountered in the stream by calling onError on the subscriber and then implicitly cancelling the subscription. Previously the stream would just permanently hang and never complete.

## __AWS SDK for Java v2__
  - ### Features
    - Added code generation validation that customer-visible identifiers are idiomatic (do not contain underscores). Services with underscores in their models can use rename customizations to fix these issues, or apply the 'underscoresInNameBehavior = ALLOW' customization.
    - Upgrade `org.apache.httpcomponents:httpclient` version to `4.5.13`

  - ### Bugfixes
    - Fixing race condition in EventStreamAsyncResponseTransformer.  Field eventsToDeliver is a LinkedList, i.e., not thread-safe.  Accesses to field eventsToDeliver are protected by synchronization on itself, but not in 1 location.
    - The mapped publisher returned by SdkPublisher.map will now handle exceptions thrown by the mapping function by calling onError on its subscriber and then cancelling the subscription rather than throwing it back to the publishing process when it attempts to publish data.

## __AWS SSO OIDC__
  - ### Deprecations
    - Renamed/deprecated 'error_description' fields in exceptions in favor of 'errorDescription'.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for the following features: 1. P4d instances based on NVIDIA A100 GPUs. 2. NetworkCardIndex attribute to support multiple network cards.

# __2.15.19__ __2020-10-30__
## __AWS Database Migration Service__
  - ### Features
    - Adding DocDbSettings to support DocumentDB as a source.

## __AWS Elemental MediaLive__
  - ### Features
    - Support for HLS discontinuity tags in the child manifests. Support for incomplete segment behavior in the media output. Support for automatic input failover condition settings.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fixing FilteringSubscriber and LimitingSubscriber to complete when subscribing criteria is completed.

## __Amazon ElastiCache__
  - ### Features
    - Documentation updates for AWS ElastiCache

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API adds an eqExactMatch operator for filtering findings. With this operator you can increase the precision of your finding filters and suppression rules.

## __Amazon Simple Notification Service__
  - ### Features
    - Documentation updates for Amazon SNS

## __Braket__
  - ### Features
    - This release supports tagging for Amazon Braket quantum-task resources. It also supports tag-based access control for quantum-task APIs.

## __EC2 Image Builder__
  - ### Features
    - This feature increases the number of accounts that can be added to the Launch permissions within an Image Builder Distribution configuration.

# __2.15.18__ __2020-10-29__
## __AWS Marketplace Commerce Analytics__
  - ### Features
    - Documentation updates for marketplacecommerceanalytics to specify four data sets which are deprecated.

## __AWS Storage Gateway__
  - ### Features
    - Adding support for access based enumeration on SMB file shares, file share visibility on SMB file shares, and file upload notifications for all file shares

## __Amazon API Gateway__
  - ### Features
    - Support disabling the default execute-api endpoint for REST APIs.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Support for Appliance mode on Transit Gateway that simplifies deployment of stateful network appliances. Added support for AWS Client VPN Self-Service Portal.

## __Amazon Simple Email Service__
  - ### Features
    - This release enables customers to manage their own contact lists and end-user subscription preferences.

## __CodeArtifact__
  - ### Features
    - Add support for tagging of CodeArtifact domain and repository resources.

## __Elastic Load Balancing__
  - ### Features
    - Application Load Balancer (ALB) now supports the gRPC protocol-version. With this release, customers can use ALB to route and load balance gRPC traffic between gRPC enabled clients and microservices.

# __2.15.17__ __2020-10-28__
## __AWS IoT__
  - ### Features
    - This release adds support for GG-Managed Job Namespace

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Fixed an issue where marshalling of a modeled object was not honoring the has* method on a list/map.
    - Fixed an issue where the toString/equals/hashCode on a modeled object were not honoring the has* methods for lists and maps.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - AWS Nitro Enclaves general availability. Added support to RunInstances for creating enclave-enabled EC2 instances. New APIs to associate an ACM certificate with an IAM role, for enclave consumption.

## __Amazon WorkMail__
  - ### Features
    - Documentation update for Amazon WorkMail

# __2.15.16__ __2020-10-27__
## __AWS Glue__
  - ### Features
    - AWS Glue machine learning transforms now support encryption-at-rest for labels and trained models.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

# __2.15.15__ __2020-10-26__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports indexing data from Confluence Server.

## __Amazon Neptune__
  - ### Features
    - This feature enables custom endpoints for Amazon Neptune clusters. Custom endpoints simplify connection management when clusters contain instances with different capacities and configuration settings.

## __Amazon SageMaker Service__
  - ### Features
    - This release enables customers to bring custom images for use with SageMaker Studio notebooks.

# __2.15.14__ __2020-10-23__
## __AWS MediaTailor__
  - ### Features
    - MediaTailor now supports ad marker passthrough for HLS. Use AdMarkerPassthrough to pass EXT-X-CUE-IN, EXT-X-CUE-OUT, and EXT-X-SPLICEPOINT-SCTE35 from origin manifests into personalized manifests.

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API includes miscellaneous updates and improvements to the documentation.

## __Amazon QuickSight__
  - ### Features
    - Support description on columns.

# __2.15.13__ __2020-10-22__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Service Catalog__
  - ### Features
    - Documentation updates for servicecatalog

## __Access Analyzer__
  - ### Features
    - API Documentation updates for IAM Access Analyzer.

## __Amazon Appflow__
  - ### Features
    - Salesforce connector creation with customer provided client id and client secret, incremental pull configuration, salesforce upsert write operations and execution ID when on-demand flows are executed.

## __Amazon Simple Notification Service__
  - ### Features
    - SNS now supports a new class of topics: FIFO (First-In-First-Out). FIFO topics provide strictly-ordered, deduplicated, filterable, encryptable, many-to-many messaging at scale.

# __2.15.12__ __2020-10-21__
## __AWS Global Accelerator__
  - ### Features
    - This release adds support for specifying port overrides on AWS Global Accelerator endpoint groups.

## __AWS Glue__
  - ### Features
    - AWS Glue crawlers now support incremental crawls for the Amazon Simple Storage Service (Amazon S3) data source.

## __AWS Organizations__
  - ### Features
    - AWS Organizations renamed the 'master account' to 'management account'.

## __AWSKendraFrontendService__
  - ### Features
    - This release adds custom data sources: a new data source type that gives you full control of the documents added, modified or deleted during a data source sync while providing run history metrics.

## __Amazon CloudFront__
  - ### Features
    - CloudFront adds support for managing the public keys for signed URLs and signed cookies directly in CloudFront (it no longer requires the AWS root account).

## __Amazon Elastic Compute Cloud__
  - ### Features
    - instance-storage-info nvmeSupport added to DescribeInstanceTypes API

# __2.15.11__ __2020-10-20__
## __AWS AppSync__
  - ### Features
    - Documentation updates to AppSync to correct several typos.

## __AWS Batch__
  - ### Features
    - Adding evaluateOnExit to job retry strategies.

## __AWS Elastic Beanstalk__
  - ### Features
    - EnvironmentStatus enum update to include Aborting, LinkingFrom and LinkingTo

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Fixed an issue where requestBody and asyncRequestBody were not visible in ExecutionInterceptor.afterMarshalling.

## __Amazon DynamoDB Enhanced Client__
  - ### Bugfixes
    - Fix for handling special characters in attribute names with WRITE_IF_NOT_EXISTS update behavior

## __Amazon S3__
  - ### Features
    - Moved the logic for calculating the Content-MD5 checksums from s3 to sdk-core. As always, make sure to use a version of 'sdk-core' greater than or equal to your version of 's3'. If you use an old version of 'sdk-core' and a new version of 's3', you will receive errors that Content-MD5 is required.

  - ### Bugfixes
    - Fixed an issue where metrics were not being collected for Amazon S3 (or other XML services)

# __2.15.10__ __2020-10-19__
## __AWS Backup__
  - ### Features
    - Documentation updates for Cryo

## __AWS Service Catalog__
  - ### Features
    - An Admin can now update the launch role associated with a Provisioned Product. Admins and End Users can now view the launch role associated with a Provisioned Product.

## __Amazon CloudFront__
  - ### Features
    - Amazon CloudFront adds support for Origin Shield.

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - Documentation updates for docdb

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This Patch Manager release now supports Common Vulnerabilities and Exposure (CVE) Ids for missing packages via the DescribeInstancePatches API.

## __HTTP Client SPI__
  - ### Features
    - Calling the SdkHttpFullRequest uri() builder method, query parameters of the provided URI will be kept.
      This can be useful in case you want to provide an already fully formed URI like a callback URI.

# __2.15.9__ __2020-10-16__
## __AWS Elemental MediaLive__
  - ### Features
    - The AWS Elemental MediaLive APIs and SDKs now support the ability to transfer the ownership of MediaLive Link devices across AWS accounts.

## __AWS Organizations__
  - ### Features
    - Documentation updates for AWS Organizations.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

# __2.15.8__ __2020-10-15__
## __AWS Budgets__
  - ### Features
    - This release introduces AWS Budgets Actions, allowing you to define an explicit response(or set of responses) to take when your budget exceeds it's action threshold.

## __AWS Cost Explorer Service__
  - ### Features
    - This release improves email validation for subscriptions on the SDK endpoints.

## __AWS Database Migration Service__
  - ### Features
    - When creating Endpoints, Replication Instances, and Replication Tasks, the feature provides you the option to specify friendly name to the resources.

## __AWS Glue__
  - ### Features
    - API Documentation updates for Glue Get-Plan API

## __AWS Ground Station__
  - ### Features
    - Adds error message attribute to DescribeContact DataflowDetails

## __AWS IoT__
  - ### Features
    - Add new variable, lastStatusChangeDate, to DescribeDomainConfiguration API

## __AWS Lambda Maven Archetype__
  - ### Bugfixes
    - Fixed an issue where archetype generation failed with latest maven-archetype-plugin. See [#1981](https://github.com/aws/aws-sdk-java-v2/issues/1981)

## __AWS SDK for Java v2__
  - ### Features
    - Add support for plus (+) character in profile names
    - Updated service endpoint metadata.

## __AWS Transfer Family__
  - ### Features
    - Add support to associate VPC Security Groups at server creation.

## __AWS X-Ray__
  - ### Features
    - Enhancing CreateGroup, UpdateGroup, GetGroup and GetGroups APIs to support configuring X-Ray Insights Notifications. Adding TraceLimit information into X-Ray BatchGetTraces API response.

## __Access Analyzer__
  - ### Features
    - This release adds support for the ApplyArchiveRule api in IAM Access Analyzer. The ApplyArchiveRule api allows users to apply an archive rule retroactively to existing findings in an analyzer.

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API adds support for pausing and resuming classification jobs. Also, sensitive data findings now include location data for up to 15 occurrences of sensitive data.

## __Amazon Rekognition__
  - ### Features
    - This SDK Release introduces new API (DetectProtectiveEquipment) for Amazon Rekognition. This release also adds ServiceQuotaExceeded exception to Amazon Rekognition IndexFaces API.

## __Amazon Relational Database Service__
  - ### Features
    - Return tags for all resources in the output of DescribeDBInstances, DescribeDBSnapshots, DescribeDBClusters, and DescribeDBClusterSnapshots API operations.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This Patch Manager release now supports searching for available packages from Amazon Linux and Amazon Linux 2 via the DescribeAvailablePatches API.

## __Amazon WorkMail__
  - ### Features
    - Add CreateOrganization and DeleteOrganization API operations.

## __Amazon WorkSpaces__
  - ### Features
    - Documentation updates for WorkSpaces

# __2.15.7__ __2020-10-09__
## __AWS Amplify__
  - ### Features
    - Performance mode optimizes for faster hosting performance by keeping content cached at the edge for a longer interval - enabling can make code changes can take up to 10 minutes to roll out.

## __AWS Elemental MediaLive__
  - ### Features
    - WAV audio output. Extracting ancillary captions in MP4 file inputs. Priority on channels feeding a multiplex (higher priority channels will tend to have higher video quality).

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Service Catalog__
  - ### Features
    - This new API takes either a ProvisonedProductId or a ProvisionedProductName, along with a list of 1 or more output keys and responds with the (key,value) pairs of those outputs.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - This release introduces a new Amazon EKS error code: "ClusterUnreachable"

## __Amazon Import/Export Snowball__
  - ### Features
    - We added new APIs to allow customers to better manage their device shipping. You can check if your shipping label expired, generate a new label, and tell us that you received or shipped your job.

# __2.15.6__ __2020-10-08__
## __AWS Cost Explorer Service__
  - ### Features
    - You can now create hierarchical cost categories by choosing "Cost Category" as a dimension. You can also track the status of your cost category updates to your cost and usage information.

## __Amazon CloudWatch Events__
  - ### Features
    - Amazon EventBridge (formerly called CloudWatch Events) adds support for target Dead-letter Queues and custom retry policies.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - AWS EC2 RevokeSecurityGroupIngress and RevokeSecurityGroupEgress APIs will return IpPermissions which do not match with any existing IpPermissions for security groups in default VPC and EC2-Classic.

## __Amazon EventBridge__
  - ### Features
    - Amazon EventBridge adds support for target Dead Letter Queues (DLQs) and custom retry policies.

## __Amazon Rekognition__
  - ### Features
    - This release provides location information for the manifest validation files.

## __Amazon Relational Database Service__
  - ### Features
    - Supports a new parameter to set the max allocated storage in gigabytes for restore database instance from S3 and restore database instance to a point in time APIs.

## __Amazon SageMaker Service__
  - ### Features
    - This release enables Sagemaker customers to convert Tensorflow and PyTorch models to CoreML (ML Model) format.

## __Amazon Simple Notification Service__
  - ### Features
    - Documentation updates for SNS.

# __2.15.5__ __2020-10-07__
## __AWS Compute Optimizer__
  - ### Features
    - This release enables AWS Compute Optimizer to analyze EC2 instance-level EBS read and write operations, and throughput when generating recommendations for your EC2 instances and Auto Scaling groups.

## __AWS Cost Explorer Service__
  - ### Features
    - Enables Rightsizing Recommendations to analyze and present EC2 instance-level EBS metrics when generating recommendations. Returns AccessDeniedException if the account is not opted into Rightsizing

## __AWS Elemental MediaPackage__
  - ### Features
    - AWS Elemental MediaPackage provides access logs that capture detailed information about requests sent to a customer's MediaPackage channel.

## __Amazon ElastiCache__
  - ### Features
    - This release introduces User and UserGroup to allow customers to have access control list of the Redis resources for AWS ElastiCache. This release also adds support for Outposts for AWS ElastiCache.

# __2.15.4__ __2020-10-06__
## __AWS Database Migration Service__
  - ### Features
    - Added new S3 endpoint settings to allow partitioning CDC data by date for S3 as target. Exposed some Extra Connection Attributes as endpoint settings for relational databases as target.

## __AWS Marketplace Catalog Service__
  - ### Features
    - AWS Marketplace Catalog now supports FailureCode for change workflows to help differentiate client errors and server faults.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release supports returning additional information about local gateway virtual interfaces, and virtual interface groups.

## __Amazon Kinesis Analytics__
  - ### Features
    - Amazon Kinesis Analytics now supports StopApplication with 'force' option

# __2.15.3__ __2020-10-05__
## __AWS DynamoDB Enhanced Client__
  - ### Features
    - Added support for attribute level custom update behaviors such as 'write if not exists'.

## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for AVC-I and VC3 encoding in the MXF OP1a container, Nielsen non-linear watermarking, and InSync FrameFormer frame rate conversion.

## __AWS Glue__
  - ### Features
    - AWS Glue crawlers now support Amazon DocumentDB (with MongoDB compatibility) and MongoDB collections. You can choose to crawl the entire data set or only a small sample to reduce crawl time.

## __Amazon DynamoDB__
  - ### Features
    - This release adds a new ReplicaStatus REGION DISABLED for the Table description. This state indicates that the AWS Region for the replica is inaccessible because the AWS Region is disabled.

## __Amazon DynamoDB Streams__
  - ### Features
    - Documentation updates for streams.dynamodb

## __Amazon SageMaker Service__
  - ### Features
    - This release adds support for launching Amazon SageMaker Studio in your VPC. Use AppNetworkAccessType in CreateDomain API to disable access to public internet and restrict the network traffic to VPC.

# __2.15.2__ __2020-10-02__
## __AWS Batch__
  - ### Features
    - Support tagging for Batch resources (compute environment, job queue, job definition and job) and tag based access control on Batch APIs

## __AWS Cloud Map__
  - ### Features
    - Added support for optional parameters for DiscoverInstances API in AWS Cloud Map

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Personalize Events__
  - ### Features
    - Adds new APIs to write item and user records to Datasets.

## __Amazon Relational Database Service__
  - ### Features
    - Adds the NCHAR Character Set ID parameter to the CreateDbInstance API for RDS Oracle.

## __Amazon Simple Storage Service__
  - ### Features
    - Amazon S3 Object Ownership is a new S3 feature that enables bucket owners to automatically assume ownership of objects that are uploaded to their buckets by other AWS Accounts.

## __Apache HTTP Client__
  - ### Bugfixes
    - Fixed an issue in Apache HTTP client where a request with path parameter as a single slash threw invalid host name error.

## __Elastic Load Balancing__
  - ### Features
    - This release adds support for tagging listeners, rules, and target groups on creation. This release also supported tagging operations through tagging api's for listeners and rules.

# __2.15.1__ __2020-10-01__
## __AWS AppSync__
  - ### Features
    - Exposes the wafWebAclArn field on GraphQL api records. The wafWebAclArn field contains the amazon resource name of a WAF Web ACL if the AWS AppSync API is associated with one.

## __AWS Glue__
  - ### Features
    - Adding additional optional map parameter to get-plan api

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS WAFV2__
  - ### Features
    - AWS WAF is now available for AWS AppSync GraphQL APIs. AWS WAF protects against malicious attacks with AWS Managed Rules or your own custom rules. For more information see the AWS WAF Developer Guide.

## __Amazon Elastic MapReduce__
  - ### Features
    - Documentation updates for elasticmapreduce

## __Amazon QuickSight__
  - ### Features
    - QuickSight now supports connecting to AWS Timestream data source

## __Managed Streaming for Kafka__
  - ### Features
    - Added support for Enabling Zookeeper Encryption in Transit for AWS MSK.

# __2.15.0__ __2020-09-30__
## __AWS DataSync__
  - ### Features
    - This release enables customers to create s3 location for S3 bucket's located on an AWS Outpost.

## __AWS Direct Connect__
  - ### Features
    - Documentation updates for AWS Direct Connect.

## __AWS IoT__
  - ### Features
    - AWS IoT Rules Engine adds Timestream action. The Timestream rule action lets you stream time-series data from IoT sensors and applications to Amazon Timestream databases for time series analysis.

## __AWS MediaConnect__
  - ### Features
    - MediaConnect now supports reservations to provide a discounted rate for a specific outbound bandwidth over a period of time.

## __AWS S3 Control__
  - ### Features
    - Amazon S3 on Outposts expands object storage to on-premises AWS Outposts environments, enabling you to store and retrieve objects using S3 APIs and features.

## __AWS SDK for Java v2__
  - ### Features
    - This release introduces Waiters for the AWS SDK for Java v2! Waiters make it easier for customers to wait for a resource to transition into a desired state. It comes handy when customers are interacting with operations that are eventually consistent on the service side. For more information on Waiters, head on over to the [AWS Developer Blog](https://aws.amazon.com/blogs/developer/category/developer-tools/aws-sdk-for-java/) and check out the [Developer Guide](http://docs.aws.amazon.com/sdk-for-java/v2/developer-guide/welcome.html).
    - Updated service endpoint metadata.

## __AWS SecurityHub__
  - ### Features
    - Added several new resource details objects. Added additional details for CloudFront distributions, IAM roles, and IAM access keys. Added a new ResourceRole attribute for resources.

## __Amazon Elastic MapReduce__
  - ### Features
    - Amazon EMR customers can now use EC2 placement group to influence the placement of master nodes in a high-availability (HA) cluster across distinct underlying hardware to improve cluster availability.

## __Amazon Pinpoint__
  - ### Features
    - Amazon Pinpoint - Features - Customers can start a journey based on an event being triggered by an endpoint or user.

## __Amazon S3 on Outposts__
  - ### Features
    - Amazon S3 on Outposts expands object storage to on-premises AWS Outposts environments, enabling you to store and retrieve objects using S3 APIs and features.

## __Amazon Simple Storage Service__
  - ### Features
    - Amazon S3 on Outposts expands object storage to on-premises AWS Outposts environments, enabling you to store and retrieve objects using S3 APIs and features.

## __Application Auto Scaling__
  - ### Features
    - This release extends Auto Scaling support for cluster storage of Managed Streaming for Kafka. Auto Scaling monitors and automatically expands storage capacity when a critical usage threshold is met.

## __EC2 Image Builder__
  - ### Features
    - EC2 Image Builder adds support for copying AMIs created by Image Builder to accounts specific to each Region.

# __2.14.28__ __2020-09-29__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Connect Service__
  - ### Features
    - Update TagResource API documentation to include Contact Flows and Routing Profiles as supported resources.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for Client to Client routing for AWS Client VPN.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Simple update to description of ComplianceItemStatus.

## __Amazon Timestream Query__
  - ### Features
    - (New Service) Amazon Timestream is a fast, scalable, fully managed, purpose-built time series database that makes it easy to store and analyze trillions of time series data points per day.

## __Amazon Timestream Write__
  - ### Features
    - (New Service) Amazon Timestream is a fast, scalable, fully managed, purpose-built time series database that makes it easy to store and analyze trillions of time series data points per day.

## __Schemas__
  - ### Features
    - Added support for schemas of type JSONSchemaDraft4. Added ExportSchema API that converts schemas in AWS Events registry and Discovered schemas from OpenApi3 to JSONSchemaDraft4.

# __2.14.27__ __2020-09-28__
## __Amazon Relational Database Service__
  - ### Features
    - This release adds the InsufficientAvailableIPsInSubnetFault error for RDS Proxy.

## __Application Auto Scaling__
  - ### Features
    - This release extends Application Auto Scaling support to AWS Comprehend Entity Recognizer endpoint, allowing automatic updates to provisioned Inference Units to maintain targeted utilization level.

# __2.14.26__ __2020-09-25__
## __AWS Batch__
  - ### Features
    - Support custom logging, executionRole, secrets, and linuxParameters (initProcessEnabled, maxSwap, swappiness, sharedMemorySize, and tmpfs). Also, add new context keys for awslogs.

## __AWS Config__
  - ### Features
    - Make the delivery-s3-bucket as an optional parameter for conformance packs and organizational conformance packs

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Security Token Service__
  - ### Features
    - Documentation update for AssumeRole error

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - Documentation updates for docdb

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release supports returning additional information about local gateway resources, such as the local gateway route table.

## __Amazon Fraud Detector__
  - ### Features
    - Increased maximum length of eventVariables values for GetEventPrediction from 256 to 1024.

# __2.14.25__ __2020-09-24__
## __AWS Amplify__
  - ### Features
    - Allow Oauth Token in CreateApp call to be a maximum of 1000 characters instead of 100

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Fixed an issue where successful JSON service responses were required to include a payload (fixes NullPointerException originating from JsonProtocolUnmarshaller).
    - Fixed an issue with XML services, where the service responding with no payload would treat the payload as empty. Now, empty payloads will properly be populated within the XML response as "null".

## __AWS Savings Plans__
  - ### Features
    - Introducing Queued SavingsPlans that will enable customers to queue their purchase request of Savings Plans for future dates.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Amazon EKS now supports configuring your cluster's service CIDR during cluster creation.

## __Amazon Textract__
  - ### Features
    - AWS Textract now supports output results for asynchronous jobs to customer specified s3 bucket.

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe now supports WebM, OGG, AMR and AMR-WB as input formats. You can also specify an output key as a location within your S3 buckets to store the output of your transcription jobs.

## __Synthetics__
  - ### Features
    - AWS Synthetics now supports AWS X-Ray Active Tracing feature. RunConfig is now an optional parameter with timeout updated from (60 - 900 seconds) to (3 - 840 seconds).

# __2.14.24__ __2020-09-23__
## __AWS Backup__
  - ### Features
    - This release allows customers to enable or disable advanced backup settings in backup plan. As part of this feature AWS Backup added support for Windows VSS backup option for EC2 resources.

## __AWS Cost Explorer Service__
  - ### Features
    - This release provides access to Cost Anomaly Detection Public Preview APIs. Cost Anomaly Detection finds cost anomalies based on your historical cost and usage using Machine Learning models.

## __AWS DynamoDB Enhanced Client__
  - ### Bugfixes
    - Fixed incorrect 'duplicate key' error triggered when flattening a TableSchema that has key tags and more than one attribute.

## __Amazon QuickSight__
  - ### Features
    - Added Sheet information to DescribeDashboard, DescribeTemplate and DescribeAnalysis API response.

## __Amazon Translate__
  - ### Features
    - Improvements to DeleteTerminology API.

# __2.14.23__ __2020-09-22__
## __AWS SDK for Java v2__
  - ### Bugfixes
    - Formal parameter names of sychronous streaming methods were aligned with their javadocs.
    - This change makes the `FileStoreTlsKeyManagersProvider` and `SystemPropertyTlsKeyManagersProvider` respect the `ssl.KeyManagerFactory.algorithm` when instantiating the `KeyManagerFactory` rather than always using the hardcoded value of `SunX509`.

## __Amazon Comprehend__
  - ### Features
    - Amazon Comprehend integrates with Amazon SageMaker GroundTruth to allow its customers to annotate their datasets using GroundTruth and train their models using Comprehend Custom APIs.

## __Amazon DynamoDB Streams__
  - ### Features
    - Documentation updates for streams.dynamodb

## __Amazon Lex Model Building Service__
  - ### Features
    - Lex now supports es-US locales

## __Amazon WorkMail__
  - ### Features
    - Adding support for Mailbox Export APIs

# __2.14.22__ __2020-09-21__
## __AWS Glue__
  - ### Features
    - Adding support to update multiple partitions of a table in a single request

## __AWS IoT SiteWise__
  - ### Features
    - This release supports IAM mode for SiteWise Monitor portals

## __AWS Resource Groups__
  - ### Features
    - Documentation updates and corrections for Resource Groups API Reference and SDKs.

## __AWS Resource Groups Tagging API__
  - ### Features
    - Documentation updates for the Resource Groups Tagging API.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon CloudWatch Events__
  - ### Features
    - Add support for Redshift Data API Targets

## __Amazon EventBridge__
  - ### Features
    - Add support for Redshift Data API Targets

## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for the RDS DescribeExportTasks API

# __2.14.21__ __2020-09-18__
## __AWS CodeStar connections__
  - ### Features
    - New integration with the GitHub provider type.

## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports batch operations, which allow users to start, stop, and delete multiple MediaLive resources with a single request.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Single Sign-On Admin__
  - ### Features
    - Documentation updates for AWS SSO APIs.

# __2.14.20__ __2020-09-17__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports additional file formats and metadata for FAQs.

## __Amazon API Gateway__
  - ### Features
    - Adds support for mutual TLS authentication for public regional REST Apis

## __Amazon CloudFront__
  - ### Features
    - Documentation updates for CloudFront

## __Amazon Comprehend__
  - ### Features
    - Amazon Comprehend now supports detecting Personally Identifiable Information (PII) entities in a document.

## __Amazon Elasticsearch Service__
  - ### Features
    - Adds support for data plane audit logging in Amazon Elasticsearch Service.

## __Amazon Transcribe Streaming Service__
  - ### Features
    - Amazon Transcribe now supports channel identification in real-time streaming, which enables you to transcribe multi-channel streaming audio.

## __AmazonApiGatewayV2__
  - ### Features
    - Adds support for mutual TLS authentication and disableAPIExecuteEndpoint for public regional HTTP Apis

# __2.14.19__ __2020-09-16__
## __AWS Greengrass__
  - ### Features
    - This release includes the ability to set run-time configuration for a Greengrass core. The Telemetry feature, also included in this release, can be configured via run-time configuration per core.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Service Catalog__
  - ### Features
    - Enhance DescribeProvisionedProduct API to allow useProvisionedProduct Name as Input, so customer can provide ProvisionedProduct Name instead of ProvisionedProduct Id to describe a ProvisionedProduct.

## __Amazon Connect Service__
  - ### Features
    - This release adds support for contact flows and routing profiles. For details, see the Release Notes in the Amazon Connect Administrator Guide.

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Customers can now provide multiple schedules within a single Data Lifecycle Manager (DLM) policy. Each schedule supports tagging, Fast Snapshot Restore (FSR) and cross region copy individually.

## __Amazon STS__
  - ### Features
    - Make the STSCredentialsProvider stale and prefetch times configurable so clients can control when session credentials are refreshed

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - The ComplianceItemEntry Status description was updated to address Windows patches that aren't applicable.

# __2.14.18__ __2020-09-15__
## __AWS Budgets__
  - ### Features
    - Documentation updates for Daily Cost and Usage budgets

## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports CDI (Cloud Digital Interface) inputs which enable uncompressed video from applications on Elastic Cloud Compute (EC2), AWS Media Services, and from AWS partners

## __AWS Organizations__
  - ### Features
    - AWS Organizations now enables you to add tags to the AWS accounts, organizational units, organization root, and policies in your organization.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now returns confidence scores for 'document' query responses.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - T4g instances are powered by AWS Graviton2 processors

## __Amazon SageMaker Service__
  - ### Features
    - Sagemaker Ground Truth: Added support for a new Streaming feature which helps to continuously feed data and receive labels in real time. This release adds a new input and output SNS data channel.

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe now supports automatic language identification, which enables you to transcribe audio files without needing to know the language in advance.

## __Managed Streaming for Kafka__
  - ### Features
    - Added new API's to support SASL SCRAM Authentication with MSK Clusters.

# __2.14.17__ __2020-09-14__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Fix a bug in the SDK where the contents of the `AsyncRequestBody` is not included in the AWS Signature Version 4 calculation, which is required for some streaming operations such as Glacier `UploadArchive' and ClouSearch Domain `UploadDocuments`.

## __AWS Step Functions__
  - ### Features
    - This release of the AWS Step Functions SDK introduces support for AWS X-Ray.

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - Updated API documentation and added paginators for DescribeCertificates, DescribeDBClusterParameterGroups, DescribeDBClusterParameters, DescribeDBClusterSnapshots and DescribePendingMaintenanceActions

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for the T4G instance family to the EC2 ModifyDefaultCreditSpecification and GetDefaultCreditSpecification APIs.

## __Amazon Managed Blockchain__
  - ### Features
    - Introducing support for Hyperledger Fabric 1.4. When using framework version 1.4, the state database may optionally be specified when creating peer nodes (defaults to CouchDB).

# __2.14.16__ __2020-09-11__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon WorkSpaces__
  - ### Features
    - Adds API support for WorkSpaces Cross-Region Redirection feature.

# __2.14.15__ __2020-09-10__
## __AWS Single Sign-On Admin__
  - ### Features
    - This is an initial release of AWS Single Sign-On (SSO) Access Management APIs. This release adds support for SSO operations which could be used for managing access to AWS accounts.

## __Amazon CloudFront__
  - ### Features
    - Cloudfront adds support for Brotli. You can enable brotli caching and compression support by enabling it in your Cache Policy.

## __Amazon Elastic Block Store__
  - ### Features
    - Documentation updates for Amazon EBS direct APIs.

## __Amazon Pinpoint__
  - ### Features
    - Update SMS message model description to clearly indicate that the MediaUrl field is reserved for future use and is not supported by Pinpoint as of today.

## __Amazon Simple Storage Service__
  - ### Features
    - Bucket owner verification feature added. This feature introduces the x-amz-expected-bucket-owner and x-amz-source-expected-bucket-owner headers.

# __2.14.14__ __2020-09-09__
## __AWS Glue__
  - ### Features
    - Adding support for partitionIndexes to improve GetPartitions performance.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Kinesis Analytics__
  - ### Features
    - Kinesis Data Analytics is adding new AUTOSCALING application status for applications during auto scaling and also adding FlinkRunConfigurationDescription in the ApplicationDetails.

## __Redshift Data API Service__
  - ### Features
    - The Amazon Redshift Data API is generally available. This release enables querying Amazon Redshift data and listing various database objects.

# __2.14.13__ __2020-09-08__
## __AWS CodeBuild__
  - ### Features
    - AWS CodeBuild - Support keyword search for test cases in DecribeTestCases API . Allow deletion of reports in the report group, before deletion of report group using the deleteReports flag.

## __AWS Common Runtime HTTP Client__
  - ### Features
    - This release includes the preview release of the AWS Common Runtime HTTP client for the AWS SDK for Java v2. The code can be found in the `aws-crt-client` module.

## __Amazon DynamoDB Enhanced Client__
  - ### Bugfixes
    - Fix for stack overflow caused by using self-referencing DynamoDB annotated classes.

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex supports en-AU locale

## __Amazon QuickSight__
  - ### Features
    - Adds tagging support for QuickSight customization resources. A user can now specify a list of tags when creating a customization resource and use a customization ARN in QuickSight's tagging APIs.

## __AmazonApiGatewayV2__
  - ### Features
    - You can now secure HTTP APIs using Lambda authorizers and IAM authorizers. These options enable you to make flexible auth decisions using a Lambda function, or using IAM policies, respectively.

## __Elastic Load Balancing__
  - ### Features
    - Adds support for Application Load Balancers on Outposts.

# __2.14.12__ __2020-09-04__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS X-Ray__
  - ### Features
    - Enhancing CreateGroup, UpdateGroup, GetGroup and GetGroups APIs to support configuring X-Ray Insights

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Documentation-only updates for AWS Systems Manager

## __Amazon WorkSpaces__
  - ### Features
    - Adding support for Microsoft Office 2016 and Microsoft Office 2019 in BYOL Images

# __2.14.11__ __2020-09-03__
## __AWS Elemental MediaPackage__
  - ### Features
    - Enables inserting a UTCTiming XML tag in the output manifest of a DASH endpoint which a media player will use to help with time synchronization.

## __AWS Step Functions__
  - ### Features
    - This release of the AWS Step Functions SDK introduces support for payloads up to 256KB for Standard and Express workflows

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now returns confidence scores for both 'answer' and 'question and answer' query responses.

## __Amazon GuardDuty__
  - ### Features
    - GuardDuty findings triggered by failed events now include the error code name within the AwsApiCallAction section.

# __2.14.10__ __2020-09-02__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds a new transit gateway attachment state and resource type.

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API introduces additional statistics for the size and count of Amazon S3 objects that Macie can analyze as part of a classification job.

## __DynamoDB Enhanced Client__
  - ### Features
    - Support for mapping to and from immutable Java objects using ImmutableTableSchema and StaticImmutableTableSchema.

# __2.14.9__ __2020-09-01__
## __AWS SDK for Java v2__
  - ### Bugfixes
    - Code Generator test failures on Windows systems were fixed.

## __AWS SecurityHub__
  - ### Features
    - Added a PatchSummary object for security findings. The PatchSummary object provides details about the patch compliance status of an instance.

## __Amazon CodeGuru Reviewer__
  - ### Features
    - Add support for repository analysis based code reviews

# __2.14.8__ __2020-08-31__
## __AWS Backup__
  - ### Features
    - Documentation updates for Cryo

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon CloudFront__
  - ### Features
    - CloudFront now supports real-time logging for CloudFront distributions. CloudFront real-time logs are more detailed, configurable, and are available in real time.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 and Spot Fleet now support modification of launch template configs for a running fleet enabling instance type, instance weight, AZ, and AMI updates without losing the current fleet ID.

## __Amazon Simple Queue Service__
  - ### Features
    - Documentation updates for SQS.

# __2.14.7__ __2020-08-28__
## __AWS Cost and Usage Report Service__
  - ### Features
    - This release add MONTHLY as the new supported TimeUnit for ReportDefinition.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon CloudFront__
  - ### Features
    - You can now manage CloudFront's additional, real-time metrics with the CloudFront API.

## __Amazon Elastic MapReduce__
  - ### Features
    - Amazon EMR adds support for ICMP, port -1, in Block Public Access Exceptions and API access for EMR Notebooks execution. You can now non-interactively execute EMR Notebooks and pass input parameters.

## __Amazon Route 53__
  - ### Features
    - Documentation updates for Route 53

# __2.14.6__ __2020-08-27__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for WebM DASH outputs as well as H.264 4:2:2 10-bit output in MOV and MP4.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Introduces support to initiate Internet Key Exchange (IKE) negotiations for VPN connections from AWS. A user can now send the initial IKE message to their Customer Gateway (CGW) from VPN endpoints.

## __Amazon GameLift__
  - ### Features
    - GameLift FleetIQ as a standalone feature is now generally available. FleetIQ makes low-cost Spot instances viable for game hosting. Use GameLift FleetIQ with your EC2 Auto Scaling groups.

## __Amazon Redshift__
  - ### Features
    - Documentation updates for Amazon Redshift.

# __2.14.5__ __2020-08-26__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Appflow__
  - ### Features
    - Amazon AppFlow is a fully managed integration service that securely transfers data between AWS services and SaaS applications. This update releases the first version of Amazon AppFlow APIs and SDK.

## __Amazon Route 53 Resolver__
  - ### Features
    - Route 53 Resolver adds support for resolver query logs

# __2.14.4__ __2020-08-24__
## __AWS Database Migration Service__
  - ### Features
    - Added new endpoint settings to include columns with Null and Empty value when using Kinesis and Kafka as target. Added a new endpoint setting to set maximum message size when using Kafka as target.

## __AWS IoT SiteWise__
  - ### Features
    - Add traversalDirection to ListAssociatedAssetsRequest and add portal status to ListPortalsResponse

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

  - ### Bugfixes
    - For JSON protocols, when unmarshalling a response, if a member is declared to be located in the URI, the member is treated as being located in the payload instead.

## __AWS X-Ray__
  - ### Features
    - AWS X-Ray now supports tagging on sampling rules and groups.

## __Amazon CloudWatch Logs__
  - ### Features
    - Documentation updates for CloudWatch Logs

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release enables customers to use VPC prefix lists in their transit gateway route tables, and it adds support for Provisioned IOPS SSD (io2) EBS volumes.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Add string length constraints to OpsDataAttributeName and OpsFilterValue.

## __Managed Streaming for Kafka__
  - ### Features
    - Add UpdateConfiguration and DeleteConfiguration operations.

# __2.14.3__ __2020-08-20__
## __Amazon Chime__
  - ### Features
    - Documentation updates for chime

## __Amazon DynamoDB Streaming Client__
  - ### Bugfixes
    - Fix for CRC not working correctly for compressed responses

## __Amazon FSx__
  - ### Features
    - Documentation updates for Amazon FSx

## __AmazonApiGatewayV2__
  - ### Features
    - Customers can now create Amazon API Gateway HTTP APIs that route requests to AWS AppConfig, Amazon EventBridge, Amazon Kinesis Data Streams, Amazon SQS, and AWS Step Functions.

# __2.14.2__ __2020-08-19__
## __AWS Lake Formation__
  - ### Features
    - Adding additional field in ListPermissions API response to return RAM resource share ARN if a resource were shared through AWS RAM service.

## __AWS Organizations__
  - ### Features
    - Minor documentation updates for AWS Organizations

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Service Catalog__
  - ### Features
    - Enhance SearchProvisionedProducts API to allow queries using productName and provisioningArtifactName. Added lastProvisioningRecordId and lastSuccessfulRecordId to Read ProvisionedProduct APIs

## __AWS Storage Gateway__
  - ### Features
    - Added WORM, tape retention lock, and custom pool features for virtual tapes.

## __Amazon Interactive Video Service__
  - ### Features
    - Amazon Interactive Video Service (IVS) now offers customers the ability to create private channels, allowing customers to restrict their streams by channel or viewer.

## __Amazon Transcribe Streaming Service__
  - ### Features
    - Amazon Transcribe and Amazon Transcribe Medical now enable you to identify different speakers in your real-time streams with speaker identification.

# __2.14.1__ __2020-08-18__
## __AWS CodeBuild__
  - ### Features
    - Documentation updates for codebuild

## __AWS DataSync__
  - ### Features
    - DataSync support for filters as input arguments to the ListTasks and ListLocations API calls.

## __AWS SSO Identity Store__
  - ### Features
    - AWS Single Sign-On (SSO) Identity Store service provides an interface to retrieve all of your users and groups. It enables entitlement management per user or group for AWS SSO and other IDPs.

## __AWS SecurityHub__
  - ### Features
    - New details for DynamoDB tables, Elastic IP addresses, IAM policies and users, RDS DB clusters and snapshots, and Secrets Manager secrets. Added details for AWS KMS keys and RDS DB instances.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Adding the option to use a service linked role to publish events to Pinpoint.

## __Amazon Simple Email Service__
  - ### Features
    - This release includes new APIs to allow customers to add or remove email addresses from their account-level suppression list in bulk.

# __2.14.0__ __2020-08-17__
## __AWS Certificate Manager__
  - ### Features
    - ACM provides support for the new Private CA feature Cross-account CA sharing. ACM users can issue certificates signed by a private CA belonging to another account where the CA was shared with them.

## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - ACM Private CA is launching cross-account support. This allows customers to share their private CAs with other accounts, AWS Organizations, and organizational units to issue end-entity certificates.

## __AWS RoboMaker__
  - ### Features
    - This release introduces RoboMaker Simulation WorldForge, a capability that automatically generates one or more simulation worlds.

## __AWS SDK for Java v2__
  - ### Features
    - The client-side metrics feature is out of developer preview and is now generaly available.

## __Amazon EC2 Container Registry__
  - ### Features
    - This feature adds support for pushing and pulling Open Container Initiative (OCI) artifacts.

## __Amazon Kinesis__
  - ### Features
    - Introducing ShardFilter for ListShards API to filter the shards using a position in the stream, and ChildShards support for GetRecords and SubscribeToShard API to discover children shards on shard end

## __Amazon QuickSight__
  - ### Features
    - Amazon QuickSight now supports programmatic creation and management of analyses with new APIs.

## __Elastic Load Balancing__
  - ### Features
    - Adds support for HTTP Desync Mitigation in Application Load Balancers.
    - Adds support for HTTP Desync Mitigation in Classic Load Balancers.

# __2.13.76__ __2020-08-14__
## __AWS License Manager__
  - ### Features
    - This release includes ability to enforce license assignment rules with EC2 Dedicated Hosts.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon AppStream__
  - ### Features
    - Adds support for the Desktop View feature

## __Amazon Elastic Compute Cloud__
  - ### Features
    - New C5ad instances featuring AMD's 2nd Generation EPYC processors, offering up to 96 vCPUs, 192 GiB of instance memory, 3.8 TB of NVMe based SSD instance storage, and 20 Gbps in Network bandwidth

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker now supports 1) creating real-time inference endpoints using model container images from Docker registries in customers' VPC 2) AUC(Area under the curve) as AutoPilot objective metric

## __Braket__
  - ### Features
    - Fixing bug in our SDK model where device status and device type had been flipped.

# __2.13.75__ __2020-08-13__
## __AWS AppSync__
  - ### Features
    - Documentation update for AWS AppSync support for Direct Lambda Resolvers.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Adding ability to customize expiry for Refresh, Access and ID tokens.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added MapCustomerOwnedIpOnLaunch and CustomerOwnedIpv4Pool to ModifySubnetAttribute to allow CoIP auto assign. Fields are returned in DescribeSubnets and DescribeNetworkInterfaces responses.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adding support for customer provided EC2 launch templates and AMIs to EKS Managed Nodegroups. Also adds support for Arm-based instances to EKS Managed Nodegroups.

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API includes miscellaneous updates and improvements to the documentation.

## __Amazon Relational Database Service__
  - ### Features
    - This release allows customers to specify a replica mode when creating or modifying a Read Replica, for DB engines which support this feature.

## __Braket__
  - ### Features
    - Amazon Braket general availability with Device and Quantum Task operations.

## __CloudWatch Metrics Publisher__
  - ### Bugfixes
    - Fixed a bug where `CloudWatchPublisher#close` would not always complete flushing pending metrics before returning.

# __2.13.74__ __2020-08-12__
## __AWS Cloud9__
  - ### Features
    - Add ConnectionType input parameter to CreateEnvironmentEC2 endpoint. New parameter enables creation of environments with SSM connection.

## __AWS IoT__
  - ### Features
    - Audit finding suppressions: Device Defender enables customers to turn off non-compliant findings for specific resources on a per check basis.

## __AWS Lambda__
  - ### Features
    - Support for creating Lambda Functions using 'java8.al2' and 'provided.al2'

## __AWS SDK for Java v2__
  - ### Features
    - Added an "unsafe" way to retrieve a byte array from `SdkBytes` and `ResponseBytes` without copying the data.

## __AWS Transfer Family__
  - ### Features
    - Adds security policies to control cryptographic algorithms advertised by your server, additional characters in usernames and length increase, and FIPS compliant endpoints in the US and Canada regions.

## __Amazon Comprehend__
  - ### Features
    - Amazon Comprehend Custom Entity Recognition now supports Spanish, German, French, Italian and Portuguese and up to 25 entity types per model.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Introduces support for IPv6-in-IPv4 IPsec tunnels. A user can now send traffic from their on-premise IPv6 network to AWS VPCs that have IPv6 support enabled.

## __Amazon FSx__
  - ### Features
    - This release adds the capability to create persistent file systems for throughput-intensive workloads using Hard Disk Drive (HDD) storage and an optional read-only Solid-State Drive (SSD) cache.

## __Amazon WorkSpaces__
  - ### Features
    - Adds optional EnableWorkDocs property to WorkspaceCreationProperties in the ModifyWorkspaceCreationProperties API

# __2.13.73__ __2020-08-11__
## __AWS Lambda__
  - ### Features
    - Support Managed Streaming for Kafka as an Event Source. Support retry until record expiration for Kinesis and Dynamodb streams event source mappings.

## __AWS Organizations__
  - ### Features
    - Minor documentation update for AWS Organizations

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release rolls back the EC2 On-Demand Capacity Reservations (ODCRs) release 1.11.831 published on 2020-07-30, which was deployed in error.

## __Amazon Simple Storage Service__
  - ### Features
    - Add support for in-region CopyObject and UploadPartCopy through S3 Access Points

# __2.13.72__ __2020-08-10__
## __AWS Glue__
  - ### Features
    - Starting today, you can further control orchestration of your ETL workloads in AWS Glue by specifying the maximum number of concurrent runs for a Glue workflow.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Savings Plans__
  - ### Features
    - Updates to the list of services supported by this API.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Remove CoIP Auto-Assign feature references.

# __2.13.71__ __2020-08-07__
## __AWS Glue__
  - ### Features
    - AWS Glue now adds support for Network connection type enabling you to access resources inside your VPC using Glue crawlers and Glue ETL jobs.

## __AWS Organizations__
  - ### Features
    - Documentation updates for some new error reasons.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Server Migration Service__
  - ### Features
    - In this release, AWS Server Migration Service (SMS) has added new features: 1. APIs to work with application and instance level validation 2. Import application catalog from AWS Application Discovery Service 3. For an application you can start on-demand replication

## __Amazon Simple Storage Service__
  - ### Features
    - Updates Amazon S3 API reference documentation.

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Fixed the issue where `connectionTimeToLive` was not allowed to set to zero. See [#1976](https://github.com/aws/aws-sdk-java-v2/issues/1976)

# __2.13.70__ __2020-08-06__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release supports Wavelength resources, including carrier gateways, and carrier IP addresses.

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex supports the option to enable accuracy improvements and specify an intent classification confidence score threshold.

## __Amazon Lex Runtime Service__
  - ### Features
    - Amazon Lex supports intent classification confidence scores along with a list of the top five intents.

## __Amazon Personalize__
  - ### Features
    - Add 'exploration' functionality

## __Amazon Personalize Events__
  - ### Features
    - Adds support implicit and explicit impression input

## __Amazon Personalize Runtime__
  - ### Features
    - Adds support for implicit impressions

# __2.13.69__ __2020-08-05__
## __AWS AppSync__
  - ### Features
    - AWS AppSync releases support for Direct Lambda Resolvers.

## __AWS Resource Groups Tagging API__
  - ### Features
    - Documentation updates for the Resource Group Tagging API namespace.

## __Amazon FSx__
  - ### Features
    - Documentation updates for StorageCapacity input value format.

## __Amazon Simple Notification Service__
  - ### Features
    - Documentation updates for SNS.

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe now supports custom language models, which can improve transcription accuracy for your specific use case.

# __2.13.68__ __2020-08-04__
## __AWS Health APIs and Notifications__
  - ### Features
    - Documentation updates for health

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

# __2.13.67__ __2020-08-03__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon S3__
  - ### Bugfixes
    - Fixed an issue that could cause "Data read has a different checksum than expected" errors.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Adds a waiter for CommandExecuted and paginators for various other APIs.

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Fixed an issue where, under rare circumstances, streaming request bytes could be misordered.

# __2.13.66__ __2020-07-31__
## __AWS Resource Groups Tagging API__
  - ### Features
    - Updates to the list of services supported by this API.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Storage Gateway__
  - ### Features
    - Add support for gateway VM deprecation dates

## __AWS WAFV2__
  - ### Features
    - Add ManagedByFirewallManager flag to the logging configuration, which indicates whether AWS Firewall Manager controls the configuration.

## __Amazon Chime__
  - ### Features
    - This release increases the CreateMeetingWithAttendee max attendee limit to 10.

## __Amazon Personalize Runtime__
  - ### Features
    - Adds support to use filters with Personalized Ranking recipe

# __2.13.65__ __2020-07-30__
## __AWS CodeBuild__
  - ### Features
    - Adding support for BuildBatch, and CodeCoverage APIs. BuildBatch allows you to model your project environment in source, and helps start multiple builds with a single API call. CodeCoverage allows you to track your code coverage using AWS CodeBuild.

## __AWS Organizations__
  - ### Features
    - Documentation updates for AWS Organizations

## __AWS Resource Groups__
  - ### Features
    - Improved documentation for Resource Groups API operations.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Service Catalog__
  - ### Features
    - This release adds support for ProvisionProduct, UpdateProvisionedProduct & DescribeProvisioningParameters by product name, provisioning artifact name and path name. In addition DescribeProvisioningParameters now returns a list of provisioning artifact outputs.

## __Amazon CloudFront__
  - ### Features
    - Documentation updates for CloudFront

## __Amazon Elastic Compute Cloud__
  - ### Features
    - EC2 On-Demand Capacity Reservations now adds support to bring your own licenses (BYOL) of Windows operating system to launch EC2 instances.

## __Amazon GuardDuty__
  - ### Features
    - GuardDuty can now provide detailed cost metrics broken down by account, data source, and S3 resources, based on the past 30 days of usage. This new feature also supports viewing cost metrics for all member accounts as a GuardDuty master.

## __Amazon Simple Email Service__
  - ### Features
    - This release makes more API operations available to customers in version 2 of the Amazon SES API. With these additions, customers can now access sending authorization, custom verification email, and template API operations. With this release, Amazon SES is also providing new and updated APIs to allow customers to request production access.

## __Managed Streaming for Kafka__
  - ### Features
    - Amazon MSK has added a new API that allows you to reboot brokers within a cluster.

# __2.13.64__ __2020-07-29__
## __AWS Cloud Map__
  - ### Features
    - Added new attribute AWS_EC2_INSTANCE_ID for RegisterInstance API

## __AWS Resource Groups__
  - ### Features
    - Resource Groups released a new feature that enables you to create a group with an associated configuration that specifies how other AWS services interact with the group. There are two new operations `GroupResources` and `UngroupResources` to work on a group with a configuration. In this release, you can associate EC2 Capacity Reservations with a resource group. Resource Groups also added a new request parameter `Group` to replace `GroupName` for all existing operations.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon EC2 Container Registry__
  - ### Features
    - This release adds support for encrypting the contents of your Amazon ECR repository with customer master keys (CMKs) stored in AWS Key Management Service.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adding support to target EC2 On-Demand Capacity Reservations within an AWS Resource Group to launch EC2 instances.

## __Amazon GuardDuty__
  - ### Features
    - GuardDuty now supports S3 Data Events as a configurable data source type. This feature expands GuardDuty's monitoring scope to include S3 data plane operations, such as GetObject and PutObject. This data source is optional and can be enabled or disabled at anytime. Accounts already using GuardDuty must first enable the new feature to use it; new accounts will be enabled by default. GuardDuty masters can configure this data source for individual member accounts and GuardDuty masters associated through AWS Organizations can automatically enable the data source in member accounts.

## __Amazon Kinesis Firehose__
  - ### Features
    - This release includes a new Kinesis Data Firehose feature that supports data delivery to Https endpoint and to partners. You can now use Kinesis Data Firehose to ingest real-time data and deliver to Https endpoint and partners in a serverless, reliable, and salable manner.

# __2.13.63__ __2020-07-28__
## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports several new features: EBU-TT-D captions in Microsoft Smooth outputs; interlaced video in HEVC outputs; video noise reduction (using temporal filtering) in HEVC outputs.

## __AWS SDK for Java v2__
  - ### Features
    - Slight performance improvement when metrics are disabled.
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Fixed an issue where HTTP status code metrics were not always published for async clients.

## __AWS SecurityHub__
  - ### Features
    - Added UpdateSecurityHubConfiguration API. Security Hub now allows customers to choose whether to automatically enable new controls that are added to an existing standard that the customer enabled. For example, if you enabled Foundational Security Best Practices for an account, you can automatically enable new controls as we add them to that standard. By default, new controls are enabled.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Introduces support for tag-on-create capability for the following APIs: CreateVpnConnection, CreateVpnGateway, and CreateCustomerGateway. A user can now add tags while creating these resources. For further detail, please see AWS Tagging Strategies.

## __Amazon Interactive Video Service__
  - ### Features
    - Added a new error code, PendingVerification, to differentiate between errors caused by insufficient IAM permissions and errors caused by account verification.

## __Amazon Relational Database Service__
  - ### Features
    - Adds reporting of manual cluster snapshot quota to DescribeAccountAttributes API

## __Auto Scaling__
  - ### Features
    - Now you can enable Instance Metadata Service Version 2 (IMDSv2) or disable the instance metadata endpoint with Launch Configurations.

## __EC2 Image Builder__
  - ### Features
    - This release updates distribution configurations to allow periods in AMI names.

# __2.13.62__ __2020-07-27__
## __AWS DataSync__
  - ### Features
    - Today AWS DataSync releases support for self-managed object storage Locations and the new TransferMode Option.

## __AWS Database Migration Service__
  - ### Features
    - Basic endpoint settings for relational databases, Preflight validation API.

## __AWS Glue__
  - ### Features
    - Add ability to manually resume workflows in AWS Glue providing customers further control over the orchestration of ETL workloads.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - m6gd, c6gd, r6gd instances are powered by AWS Graviton2 processors and support local NVMe instance storage

## __Amazon Fraud Detector__
  - ### Features
    - Moved the eventTypeName attribute for PutExternalModel API to inputConfiguration. Model ID's no longer allow hyphens.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Assorted doc ticket-fix updates for Systems Manager.

# __2.13.61__ __2020-07-24__
## __AWS Elemental MediaPackage__
  - ### Features
    - The release adds daterange as a new ad marker option. This option enables MediaPackage to insert EXT-X-DATERANGE tags in HLS and CMAF manifests. The EXT-X-DATERANGE tag is used to signal ad and program transition events.

## __AWS MediaConnect__
  - ### Features
    - You can now disable an entitlement to stop streaming content to the subscriber's flow temporarily. When you are ready to allow content to start streaming to the subscriber's flow again, you can enable the entitlement.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports sorting query results based on document attributes. Amazon Kendra also introduced an option to enclose table and column names with double quotes for database data sources.

## __Amazon CloudWatch__
  - ### Features
    - AWS CloudWatch ListMetrics now supports an optional parameter (RecentlyActive) to filter results by only metrics that have received new datapoints in the past 3 hours. This enables more targeted metric data retrieval through the Get APIs

## __Amazon FSx__
  - ### Features
    - Documentation update for FSx for Lustre

## __Amazon Fraud Detector__
  - ### Features
    - GetPrediction has been replaced with GetEventPrediction. PutExternalModel has been simplified to accept a role ARN.

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API introduces additional criteria for sorting and filtering query results for account quotas and usage statistics.

## __Amazon SageMaker Service__
  - ### Features
    - Sagemaker Ground Truth:Added support for OIDC (OpenID Connect) to authenticate workers via their own identity provider instead of through Amazon Cognito. This release adds new APIs (CreateWorkforce, DeleteWorkforce, and ListWorkforces) to SageMaker Ground Truth service. Sagemaker Neo: Added support for detailed target device description by using TargetPlatform fields - OS, architecture, and accelerator. Added support for additional compilation parameters by using JSON field CompilerOptions. Sagemaker Search: SageMaker Search supports transform job details in trial components.

## __AmazonMQ__
  - ### Features
    - Amazon MQ now supports LDAP (Lightweight Directory Access Protocol), providing authentication and authorization of Amazon MQ users via a customer designated LDAP server.

# __2.13.60__ __2020-07-23__
## __AWS Config__
  - ### Features
    - Adding service linked configuration aggregation support along with new enums for config resource coverage

## __AWS Direct Connect__
  - ### Features
    - Documentation updates for AWS Direct Connect

## __AWS Glue__
  - ### Features
    - Added new ConnectionProperties: "KAFKA_SSL_ENABLED" (to toggle SSL connections) and "KAFKA_CUSTOM_CERT" (import CA certificate file)

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon FSx__
  - ### Features
    - Adds support for AutoImport, a new FSx for Lustre feature that allows customers to configure their FSx file system to automatically update its contents when new objects are added to S3 or existing objects are overwritten.

## __Amazon Lightsail__
  - ### Features
    - This release adds support for Amazon Lightsail content delivery network (CDN) distributions and SSL/TLS certificates.

## __Amazon WorkSpaces__
  - ### Features
    - Added UpdateWorkspaceImagePermission API to share Amazon WorkSpaces images across AWS accounts.

# __2.13.59__ __2020-07-22__
## __AWS Elemental MediaLive__
  - ### Features
    - The AWS Elemental MediaLive APIs and SDKs now support the ability to get thumbnails for MediaLive devices that are attached or not attached to a channel. Previously, this thumbnail feature was available only on the console.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon QuickSight__
  - ### Features
    - New API operations - GetSessionEmbedUrl, CreateNamespace, DescribeNamespace, ListNamespaces, DeleteNamespace, DescribeAccountSettings, UpdateAccountSettings, CreateAccountCustomization, DescribeAccountCustomization, UpdateAccountCustomization, DeleteAccountCustomization. Modified API operations to support custom permissions restrictions - RegisterUser, UpdateUser, UpdateDashboardPermissions

# __2.13.58__ __2020-07-21__
## __Amazon CodeGuru Profiler__
  - ### Features
    - Amazon CodeGuru Profiler now supports resource tagging APIs, tags-on-create and tag-based access control features. You can now tag profiling groups for better resource and access control management.

# __2.13.57__ __2020-07-20__
## __AWS CodeBuild__
  - ### Features
    - AWS CodeBuild adds support for Session Manager and Windows 2019 Environment type

## __AWS Ground Station__
  - ### Features
    - Adds optional MTU property to DataflowEndpoint and adds contact source and destination details to DescribeContact response.

## __Amazon CloudFront__
  - ### Features
    - CloudFront adds support for cache policies and origin request policies. With these new policies, you can now more granularly control the query string, header, and cookie values that are included in the cache key and in requests that CloudFront sends to your origin.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added support for tag-on-create for CreateVpcPeeringConnection and CreateRouteTable. You can now specify tags when creating any of these resources. For more information about tagging, see AWS Tagging Strategies. Add poolArn to the response of DescribeCoipPools.

## __Amazon Fraud Detector__
  - ### Features
    - Introduced flexible model training dataset requirements for Online Fraud Insights so that customers can choose any two inputs to train a model instead of being required to use 'email' and 'IP address' at minimum. Added support for resource ARNs, resource tags, resource-based IAM policies and identity-based policies that limit access to a resource based on tags. Added support for customer-managed customer master key (CMK) data encryption. Added new Event Type, Entity Type, and Label APIs. An event type defines the structure for an event sent to Amazon Fraud Detector, including the variables sent as part of the event, the entity performing the event, and the labels that classify the event. Introduced the GetEventPrediction API.

## __Amazon Relational Database Service__
  - ### Features
    - Add a new SupportsParallelQuery output field to DescribeDBEngineVersions. This field shows whether the engine version supports parallelquery. Add a new SupportsGlobalDatabases output field to DescribeDBEngineVersions and DescribeOrderableDBInstanceOptions. This field shows whether global database is supported by engine version or the combination of engine version and instance class.

## __Firewall Management Service__
  - ### Features
    - Added managed policies for auditing security group rules, including the use of managed application and protocol lists.

# __2.13.56__ __2020-07-17__
## __AWS AppSync__
  - ### Features
    - Documentation update to Cachingconfig.cachingKeys to include $context.source as a valid value.

## __AWS Elastic Beanstalk__
  - ### Features
    - Add waiters for `EnvironmentExists`, `EnvironmentUpdated`, and `EnvironmentTerminated`. Add paginators for `DescribeEnvironmentManagedActionHistory` and `ListPlatformVersions`.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Connect Service__
  - ### Features
    - This release adds a set of Amazon Connect APIs to programmatically control call recording with start, stop, pause and resume functions.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for EC2

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API includes miscellaneous updates and improvements to the documentation.

## __Application Auto Scaling__
  - ### Features
    - Documentation updates for Application Auto Scaling

# __2.13.55__ __2020-07-15__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Interactive Video Service__
  - ### Features
    - Introducing Amazon Interactive Video Service - a managed live streaming solution that is quick and easy to set up, and ideal for creating interactive video experiences.

# __2.13.54__ __2020-07-09__
## __AWS Amplify__
  - ### Features
    - Documentation update to the introduction text to specify that this is the Amplify Console API.

## __AWS App Mesh__
  - ### Features
    - AppMesh now supports Ingress which allows resources outside a mesh to communicate to resources that are inside the mesh. See https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual_gateways.html

## __AWS CloudHSM V2__
  - ### Features
    - Documentation updates for cloudhsmv2

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Secrets Manager__
  - ### Features
    - Adds support for filters on the ListSecrets API to allow filtering results by name, tag key, tag value, or description. Adds support for the BlockPublicPolicy option on the PutResourcePolicy API to block resource policies which grant a wide range of IAM principals access to secrets. Adds support for the ValidateResourcePolicy API to validate resource policies for syntax and prevent lockout error scenarios and wide access to secrets.

## __AWS WAFV2__
  - ### Features
    - Added the option to use IP addresses from an HTTP header that you specify, instead of using the web request origin. Available for IP set matching, geo matching, and rate-based rule count aggregation.

## __Alexa For Business__
  - ### Features
    - Added support for registering an AVS device directly to a room using RegisterAVSDevice with a room ARN

## __Amazon CloudWatch Events__
  - ### Features
    - Amazon CloudWatch Events/EventBridge adds support for API Gateway as a target.

## __Amazon Comprehend__
  - ### Features
    - AWS Comprehend now supports Real-time Analysis with Custom Entity Recognition.

## __Amazon DynamoDB Enhanced Client__
  - ### Features
    - Support converting "0" and "1" numbers read from DynamoDB to Boolean and AtomicBoolean.

## __Amazon Elastic Block Store__
  - ### Features
    - This release introduces the following set of actions for the EBS direct APIs: 1. StartSnapshot, which creates a new Amazon EBS snapshot. 2. PutSnapshotBlock, which writes a block of data to a snapshot. 3. CompleteSnapshot, which seals and completes a snapshot after blocks of data have been written to it.

## __Amazon EventBridge__
  - ### Features
    - Amazon EventBridge adds support for API Gateway as a target.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds the DeleteHumanTaskUi API to Amazon Augmented AI

## __Amazon Simple Notification Service__
  - ### Features
    - This release adds support for SMS origination number as an attribute in the MessageAttributes parameter for the SNS Publish API.

# __2.13.53__ __2020-07-08__
## __AWS Cost Explorer Service__
  - ### Features
    - Customers can now see Instance Name alongside each rightsizing recommendation.

## __AWS Organizations__
  - ### Features
    - We have launched a self-service option to make it easier for customers to manage the use of their content by AI services. Certain AI services (Amazon CodeGuru Profiler, Amazon Comprehend, Amazon Lex, Amazon Polly, Amazon Rekognition, Amazon Textract, Amazon Transcribe, and Amazon Translate), may use content to improve the service. Customers have been able to opt out of this use by contacting AWS Support, and now they can opt out on a self-service basis by setting an Organizations policy for all or an individual AI service as listed above. Please refer to the technical documentation for more details.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - EC2 Spot now enables customers to tag their Spot Instances Requests on creation.

## __Amazon Forecast Service__
  - ### Features
    - With this release, Amazon Forecast now supports the ability to add a tag to any resource via the launch of three new APIs: TagResouce, UntagResource and ListTagsForResource. A tag is a simple label consisting of a customer-defined key and an optional value allowing for easier resource management.

# __2.13.52__ __2020-07-07__
## __AWS Glue__
  - ### Features
    - AWS Glue Data Catalog supports cross account sharing of tables through AWS Lake Formation

## __AWS Lake Formation__
  - ### Features
    - AWS Lake Formation supports sharing tables with other AWS accounts and organizations

## __AWS SDK for Java v2__
  - ### Features
    - This release includes the preview release of the client-side metrics for the AWS SDK for Java v2. The SPI can be found in the `metrics-spi` module, and this release also includes a metric publisher for CloudWatch in `cloudwatch-metric-publisher`. See our post over at the [AWS Developer Blog](https://aws.amazon.com/blogs/developer/category/developer-tools/aws-sdk-for-java/) for additional information.
    - Updated service endpoint metadata.

## __AWS Storage Gateway__
  - ### Features
    - Adding support for file-system driven directory refresh, Case Sensitivity toggle for SMB File Shares, and S3 Prefixes and custom File Share names

## __Amazon CloudFront__
  - ### Features
    - Amazon CloudFront adds support for a new security policy, TLSv1.2_2019.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - DescribeAvailabilityZones now returns additional data about Availability Zones and Local Zones.

## __Amazon Elastic File System__
  - ### Features
    - This release adds support for automatic backups of Amazon EFS file systems to further simplify backup management.

# __2.13.51__ __2020-07-06__
## __AWS IoT SiteWise__
  - ### Features
    - This release supports optional start date and end date parameters for the GetAssetPropertyValueHistory API.

## __Amazon QuickSight__
  - ### Features
    - Add Theme APIs and update Dashboard APIs to support theme overrides.

## __Amazon Relational Database Service__
  - ### Features
    - Adds support for Amazon RDS on AWS Outposts.

# __2.13.50__ __2020-07-02__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Connect Service__
  - ### Features
    - Documentation updates for Amazon Connect.

## __Amazon ElastiCache__
  - ### Features
    - Documentation updates for elasticache

# __2.13.49__ __2020-07-01__
## __AWS AppSync__
  - ### Features
    - AWS AppSync supports new 12xlarge instance for server-side API caching

## __AWS CodeBuild__
  - ### Features
    - Support build status config in project source

## __AWS SecurityHub__
  - ### Features
    - This release adds additional details for findings. There are now finding details for auto scaling groups, EC2 volumes, and EC2 VPCs. You can identify detected vulnerabilities and provide related network paths.

## __Amazon Chime__
  - ### Features
    - This release supports third party emergency call routing configuration for Amazon Chime Voice Connectors.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds the exceptions KMSKeyNotAccessibleFault and InvalidDBClusterStateFault to the Amazon RDS ModifyDBInstance API.

## __EC2 Image Builder__
  - ### Features
    - EC2 Image Builder adds support for encrypted AMI distribution.

# __2.13.48__ __2020-06-30__
## __AWS Comprehend Medical__
  - ### Features
    - This release adds the relationships between MedicalCondition and Anatomy in DetectEntitiesV2 API.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix marshaller binding for input event streams when member name and shape name are not equal.

## __Amazon CodeGuru Reviewer__
  - ### Features
    - Release GitHub Enterprise Server source provider integration

## __Amazon EC2 Container Registry__
  - ### Features
    - Add a new parameter (ImageDigest) and a new exception (ImageDigestDoesNotMatchException) to PutImage API to support pushing image by digest.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added support for tag-on-create for CreateVpc, CreateEgressOnlyInternetGateway, CreateSecurityGroup, CreateSubnet, CreateNetworkInterface, CreateNetworkAcl, CreateDhcpOptions and CreateInternetGateway. You can now specify tags when creating any of these resources. For more information about tagging, see AWS Tagging Strategies.

## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for rds

# __2.13.47__ __2020-06-29__
## __AWS CodeStar connections__
  - ### Features
    - Updated and new APIs in support of hosts for connections to installed provider types. New integration with the GitHub Enterprise Server provider type.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon CodeGuru Profiler__
  - ### Features
    - Amazon CodeGuru Profiler is now generally available. The Profiler helps developers to optimize their software, troubleshoot issues in production, and identify their most expensive lines of code. As part of general availability, we are launching: Profiling of AWS Lambda functions, Anomaly detection in CPU profiles, Color My Code on flame graphs, Expanding presence to 10 AWS regions.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Virtual Private Cloud (VPC) customers can now create and manage their own Prefix Lists to simplify VPC configurations.

## __Auto Scaling__
  - ### Features
    - Documentation updates for Amazon EC2 Auto Scaling.

# __2.13.46__ __2020-06-26__
## __AWS CloudFormation__
  - ### Features
    - ListStackInstances and DescribeStackInstance now return a new `StackInstanceStatus` object that contains `DetailedStatus` values: a disambiguation of the more generic `Status` value. ListStackInstances output can now be filtered on `DetailedStatus` using the new `Filters` parameter.

## __AWS Database Migration Service__
  - ### Features
    - This release contains miscellaneous API documentation updates for AWS DMS in response to several customer reported issues.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Don't require Authorization for InitiateAuth and RespondToAuthChallenge.

## __Amazon QuickSight__
  - ### Features
    - Added support for cross-region DataSource credentials copying.

## __Amazon SageMaker Service__
  - ### Features
    - The new 'ModelClientConfig' parameter being added for CreateTransformJob and DescribeTransformJob api actions enable customers to configure model invocation related parameters such as timeout and retry.

# __2.13.45__ __2020-06-25__
## __AWS DynamoDB Enhanced Client__
  - ### Bugfixes
    - Fixed a bug causing a NullPointerException to be thrown in the enhanced DeleteItem operation if a conditionExpression was given with null attributeNames or null attributeValues.

## __AWS Glue__
  - ### Features
    - This release adds new APIs to support column level statistics in AWS Glue Data Catalog

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added support for tag-on-create for Host Reservations in Dedicated Hosts. You can now specify tags when you create a Host Reservation for a Dedicated Host. For more information about tagging, see AWS Tagging Strategies.

# __2.13.44__ __2020-06-24__
## __AWS Amplify__
  - ### Features
    - This release of AWS Amplify Console introduces support for automatically creating custom subdomains for branches based on user-defined glob patterns, as well as automatically cleaning up Amplify branches when their corresponding git branches are deleted.

## __AWS Backup__
  - ### Features
    - Customers can now manage and monitor their backups in a policied manner across their AWS accounts, via an integration between AWS Backup and AWS Organizations

## __AWS CodeCommit__
  - ### Features
    - This release introduces support for reactions to CodeCommit comments. Users will be able to select from a pre-defined list of emojis to express their reaction to any comments.

## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for iam

## __AWS Organizations__
  - ### Features
    - This release adds support for a new backup policy type for AWS Organizations.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Elastic MapReduce__
  - ### Features
    - Amazon EMR customers can now set allocation strategies for On-Demand and Spot instances in their EMR clusters with instance fleets. These allocation strategies use real-time capacity insights to provision clusters faster and make the most efficient use of available spare capacity to allocate Spot instances to reduce interruptions.

## __Amazon FSx__
  - ### Features
    - This release adds the capability to take highly-durable, incremental backups of your FSx for Lustre persistent file systems. This capability makes it easy to further protect your file system data and to meet business and regulatory compliance requirements.

## __Amazon Honeycode__
  - ### Features
    - Introducing Amazon Honeycode - a fully managed service that allows you to quickly build mobile and web apps for teams without programming.

## __Auto Scaling__
  - ### Features
    - Documentation updates for Amazon EC2 Auto Scaling.

# __2.13.43__ __2020-06-23__
## __AWS MediaTailor__
  - ### Features
    - AWS Elemental MediaTailor SDK now allows configuration of Bumper.

## __AWS Organizations__
  - ### Features
    - Added a new error message to support the requirement for a Business License on AWS accounts in China to create an organization.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

# __2.13.42__ __2020-06-22__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds Tag On Create feature support for the ImportImage, ImportSnapshot, ExportImage and CreateInstanceExportTask APIs.

## __Amazon Elastic MapReduce__
  - ### Features
    - Adding support for MaximumCoreCapacityUnits parameter for EMR Managed Scaling. It allows users to control how many units/nodes are added to the CORE group/fleet. Remaining units/nodes are added to the TASK groups/fleet in the cluster.

## __Amazon Rekognition__
  - ### Features
    - This update adds the ability to detect black frames, end credits, shots, and color bars in stored videos

## __Amazon Relational Database Service__
  - ### Features
    - Added paginators for various APIs.

## __Amazon Simple Queue Service__
  - ### Features
    - AWS SQS adds pagination support for ListQueues and ListDeadLetterSourceQueues APIs

# __2.13.41__ __2020-06-19__
## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports Input Prepare schedule actions. This feature improves existing input switching by allowing users to prepare an input prior to switching to it.

## __AWS OpsWorks CM__
  - ### Features
    - Documentation updates for AWS OpsWorks CM.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon ElastiCache__
  - ### Features
    - Documentation updates for elasticache

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds support to tag elastic-gpu on the RunInstances api

# __2.13.40__ __2020-06-18__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for NexGuard FileMarker SDK, which allows NexGuard partners to watermark proprietary content in mezzanine and OTT streaming contexts.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Support__
  - ### Features
    - Documentation updates for support

## __AWSMarketplace Metering__
  - ### Features
    - Documentation updates for meteringmarketplace

## __Amazon Relational Database Service__
  - ### Features
    - Adding support for global write forwarding on secondary clusters in an Aurora global database.

## __Amazon Route 53__
  - ### Features
    - Added a new ListHostedZonesByVPC API for customers to list all the private hosted zones that a specified VPC is associated with.

## __Amazon Simple Email Service__
  - ### Features
    - You can now configure Amazon SES to send event notifications when the delivery of an email is delayed because of a temporary issue. For example, you can receive a notification if the recipient's inbox is full, or if there's a temporary problem with the receiving email server.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Added offset support for specifying the number of days to wait after the date and time specified by a CRON expression before running the maintenance window.

# __2.13.39__ __2020-06-17__
## __AWS App Mesh__
  - ### Features
    - Adds support for route and virtual node listener timeouts.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - nvmeSupport added to DescribeInstanceTypes API

## __Amazon Import/Export Snowball__
  - ### Features
    - AWS Snowcone is a portable, rugged and secure device for edge computing and data transfer. You can use Snowcone to collect, process, and move data to AWS, either offline by shipping the device to AWS or online by using AWS DataSync. With 2 CPUs and 4 GB RAM of compute and 8 TB of storage, Snowcone can run edge computing workloads and store data securely. Snowcone's small size (8.94" x 5.85" x 3.25" / 227 mm x 148.6 mm x 82.65 mm) allows you to set it next to machinery in a factory. Snowcone weighs about 4.5 lbs. (2 kg), so you can carry one in a backpack, use it with battery-based operation, and use the Wi-Fi interface to gather sensor data. Snowcone supports a file interface with NFS support.

## __Amazon Macie 2__
  - ### Features
    - This is a documentation-only update to the Amazon Macie API. This update contains miscellaneous editorial improvements to various API descriptions.

## __Amazon Route 53__
  - ### Features
    - Add PriorRequestNotComplete exception to AssociateVPCWithHostedZone API

# __2.13.38__ __2020-06-16__
## __AWS Data Exchange__
  - ### Features
    - This release fixes a bug in the AWS Data Exchange Python and NodeJS SDKs. The 'KmsKeyArn' field in the create-job API was configured to be required instead of optional. We updated this field to be optional in this release.

## __AWS Lambda__
  - ### Features
    - Adds support for using Amazon Elastic File System (persistent storage) with AWS Lambda. This enables customers to share data across function invocations, read large reference data files, and write function output to a persistent and shared store.

## __Amazon CloudFront__
  - ### Features
    - Documentation updates for CloudFront

## __Amazon DynamoDB Enhanced Client__
  - ### Bugfixes
    - Fix an NPE in `OptionalAttributeConverter` that can happen the if the `nul()` property of the `AttributeValue` is `null`.

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds new US English child voice - Kevin. Kevin is available as Neural voice only.

## __Amazon QLDB__
  - ### Features
    - Documentation updates for Amazon QLDB

## __Auto Scaling__
  - ### Features
    - Introducing instance refresh, a feature that helps you update all instances in an Auto Scaling group in a rolling fashion (for example, to apply a new AMI or instance type). You can control the pace of the refresh by defining the percentage of the group that must remain running/healthy during the replacement process and the time for new instances to warm up between replacements.

# __2.13.37__ __2020-06-15__
## __AWS IoT__
  - ### Features
    - Added support for job executions rollout configuration, job abort configuration, and job executions timeout configuration for AWS IoT Over-the-Air (OTA) Update Feature.

## __Alexa For Business__
  - ### Features
    - Adding support for optional tags in CreateBusinessReportSchedule, CreateProfile and CreateSkillGroup APIs

## __Amazon AppConfig__
  - ### Features
    - This release adds a hosted configuration source provider. Customers can now store their application configurations directly in AppConfig, without the need for an external configuration source.

## __Amazon Chime__
  - ### Features
    - feature: Chime: This release introduces the ability to create an AWS Chime SDK meeting with attendees.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Updated all AuthParameters to be sensitive.

# __2.13.36__ __2020-06-12__
## __AWS CloudFormation__
  - ### Features
    - The following parameters now return the organization root ID or organizational unit (OU) IDs that you specified for DeploymentTargets: the OrganizationalUnitIds parameter on StackSet and the OrganizationalUnitId parameter on StackInstance, StackInstanceSummary, and StackSetOperationResultSummary

## __AWS Glue__
  - ### Features
    - You can now choose to crawl the entire table or just a sample of records in DynamoDB when using AWS Glue crawlers. Additionally, you can also specify a scanning rate for crawling DynamoDB tables.

## __AWS SDK for Java v2 DynamoDB Enhanced Client__
  - ### Bugfixes
    - Added ClientRequestToken in class TransactWriteItemsEnhancedRequest.

## __AWS Storage Gateway__
  - ### Features
    - Display EndpointType in DescribeGatewayInformation

## __Amazon API Gateway__
  - ### Features
    - Documentation updates for Amazon API Gateway

# __2.13.35__ __2020-06-11__
## __AWS IoT Data Plane__
  - ### Features
    - As part of this release, we are introducing a new feature called named shadow, which extends the capability of AWS IoT Device Shadow to support multiple shadows for a single IoT device. With this release, customers can store different device state data into different shadows, and as a result access only the required state data when needed and reduce individual shadow size.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Avoid unnecessary copying in `AsyncRequestBody.fromBytes()`

## __Amazon EC2 Container Service__
  - ### Features
    - This release adds support for deleting capacity providers.

## __Amazon Lex Model Building Service__
  - ### Features
    - This change adds the built-in AMAZON.KendraSearchIntent that enables integration with Amazon Kendra.

## __EC2 Image Builder__
  - ### Features
    - EC2 Image Builder now supports specifying a custom working directory for your build and test workflows. In addition, Image Builder now supports defining tags that are applied to ephemeral resources created by EC2 Image Builder as part of the image creation workflow.

# __2.13.34__ __2020-06-10__
## __AWS Compute Optimizer__
  - ### Features
    - Compute Optimizer supports exporting recommendations to Amazon S3.

## __AWS Service Catalog__
  - ### Features
    - Service Catalog Documentation Update for Integration with AWS Organizations Delegated Administrator feature

## __AWS Shield__
  - ### Features
    - Corrections to the supported format for contact phone numbers and to the description for the create subscription action.

## __Amazon AppConfig__
  - ### Features
    - This release allows customers to choose from a list of predefined deployment strategies while starting deployments.

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Reducing the schedule name of DLM Lifecycle policy from 500 to 120 characters.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - New C6g instances powered by AWS Graviton2 processors and ideal for running advanced, compute-intensive workloads; New R6g instances powered by AWS Graviton2 processors and ideal for running memory-intensive workloads.

## __Amazon Lightsail__
  - ### Features
    - Documentation updates for lightsail

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API removes support for the ArchiveFindings and UnarchiveFindings operations. This release also adds UNKNOWN as an encryption type for S3 bucket metadata.

## __CodeArtifact__
  - ### Features
    - Added support for AWS CodeArtifact.

# __2.13.33__ __2020-06-09__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Transfer Family__
  - ### Features
    - This release updates the API so customers can test use of Source IP to allow, deny or limit access to data in their S3 buckets after integrating their identity provider.

# __2.13.32__ __2020-06-08__
## __AWS Cloud Map__
  - ### Features
    - Added support for tagging Service and Namespace type resources in Cloud Map

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Update javadoc annotation for AwsBasicCredentials

## __AWS Shield__
  - ### Features
    - This release adds the option for customers to identify a contact name and method that the DDoS Response Team can proactively engage when a Route 53 Health Check that is associated with a Shield protected resource fails.

# __2.13.31__ __2020-06-05__
## __AWS Elastic Beanstalk__
  - ### Features
    - These API changes enable an IAM user to associate an operations role with an Elastic Beanstalk environment, so that the IAM user can call Elastic Beanstalk actions without having access to underlying downstream AWS services that these actions call.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Service Catalog__
  - ### Features
    - This release adds support for DescribeProduct and DescribeProductAsAdmin by product name, DescribeProvisioningArtifact by product name or provisioning artifact name, returning launch paths as part of DescribeProduct output and adds maximum length for provisioning artifact name and provisioning artifact description.

## __Amazon API Gateway__
  - ### Features
    - Amazon API Gateway now allows customers of REST APIs to skip trust chain validation for backend server certificates for HTTP and VPC Link Integration. This feature enables customers to configure their REST APIs to integrate with backends that are secured with certificates vended from private certificate authorities (CA) or certificates that are self-signed.

## __Amazon CloudFront__
  - ### Features
    - Amazon CloudFront adds support for configurable origin connection attempts and origin connection timeout.

## __Amazon Personalize__
  - ### Features
    - [Personalize] Adds ability to create and apply filters.

## __Amazon Personalize Runtime__
  - ### Features
    - [Personalize] Adds ability to apply filter to real-time recommendations

## __Amazon Pinpoint__
  - ### Features
    - This release enables additional functionality for the Amazon Pinpoint journeys feature. With this release, you can send messages through additional channels, including SMS, push notifications, and custom channels.

## __Amazon SageMaker Runtime__
  - ### Features
    - You can now specify the production variant to send the inference request to, when invoking a SageMaker Endpoint that is running two or more variants.

# __2.13.30__ __2020-06-04__
## __AWS Elemental MediaPackage VOD__
  - ### Features
    - You can now restrict direct access to AWS Elemental MediaPackage by securing requests for VOD content using CDN authorization. With CDN authorization, content requests require a specific HTTP header and authorization code.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWSMarketplace Metering__
  - ### Features
    - Documentation updates for meteringmarketplace

## __Amazon Elastic Compute Cloud__
  - ### Features
    - New C5a instances, the latest generation of EC2's compute-optimized instances featuring AMD's 2nd Generation EPYC processors. C5a instances offer up to 96 vCPUs, 192 GiB of instance memory, 20 Gbps in Network bandwidth; New G4dn.metal bare metal instance with 8 NVIDIA T4 GPUs.

## __Amazon Lightsail__
  - ### Features
    - This release adds the BurstCapacityPercentage and BurstCapacityTime instance metrics, which allow you to track the burst capacity available to your instance.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - SSM State Manager support for executing an association only at specified CRON schedule after creating/updating an association.

# __2.13.29__ __2020-06-03__
## __AWS Direct Connect__
  - ### Features
    - This release supports the virtual interface failover test, which allows you to verify that traffic routes over redundant virtual interfaces when you bring your primary virtual interface out of service.

## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for the encoding of VP8 or VP9 video in WebM container with Vorbis or Opus audio.

## __AWS Glue__
  - ### Features
    - Adding databaseName in the response for GetUserDefinedFunctions() API.

## __AWS Identity and Access Management__
  - ### Features
    - GenerateServiceLastAccessedDetails will now return ActionLastAccessed details for certain S3 control plane actions

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon ElastiCache__
  - ### Features
    - This release improves the Multi-AZ feature in ElastiCache by adding a separate flag and proper validations.

## __Amazon Elasticsearch Service__
  - ### Features
    - Amazon Elasticsearch Service now offers support for cross-cluster search, enabling you to perform searches, aggregations, and visualizations across multiple Amazon Elasticsearch Service domains with a single query or from a single Kibana interface. New feature includes the ability to setup connection, required to perform cross-cluster search, between domains using an approval workflow.

# __2.13.28__ __2020-06-02__
## __Amazon GuardDuty__
  - ### Features
    - Amazon GuardDuty findings now include S3 bucket details under the resource section if an S3 Bucket was one of the affected resources

# __2.13.27__ __2020-06-01__
## __AWS Key Management Service__
  - ### Features
    - AWS Key Management Service (AWS KMS): If the GenerateDataKeyPair or GenerateDataKeyPairWithoutPlaintext APIs are called on a CMK in a custom key store (origin == AWS_CLOUDHSM), they return an UnsupportedOperationException. If a call to UpdateAlias causes a customer to exceed the Alias resource quota, the UpdateAlias API returns a LimitExceededException.

## __AWS Maven Lambda Archetype__
  - ### Features
    - Updated the `archetype-lambda` to generate SDK client that uses region from environment variable.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Athena__
  - ### Features
    - This release adds support for connecting Athena to your own Apache Hive Metastores in addition to the AWS Glue Data Catalog. For more information, please see https://docs.aws.amazon.com/athena/latest/ug/connect-to-data-source-hive.html

## __Amazon Elastic MapReduce__
  - ### Features
    - Amazon EMR now supports encrypting log files with AWS Key Management Service (KMS) customer managed keys.

## __Amazon FSx__
  - ### Features
    - New capabilities to update storage capacity and throughput capacity of your file systems, providing the flexibility to grow file storage and to scale up or down the available performance as needed to meet evolving storage needs over time.

## __Amazon SageMaker Service__
  - ### Features
    - We are releasing HumanTaskUiArn as a new parameter in CreateLabelingJob and RenderUiTemplate which can take an ARN for a system managed UI to render a task.

## __Amazon WorkLink__
  - ### Features
    - Amazon WorkLink now supports resource tagging for fleets.

# __2.13.26__ __2020-05-28__
## __AWS Marketplace Catalog Service__
  - ### Features
    - AWS Marketplace Catalog now supports accessing initial change payloads with DescribeChangeSet operation.

## __Amazon QLDB Session__
  - ### Features
    - Documentation updates for Amazon QLDB Session

## __Amazon WorkMail__
  - ### Features
    - This release adds support for Amazon WorkMail organization-level retention policies.

## __Managed Streaming for Kafka__
  - ### Features
    - New APIs for upgrading the Apache Kafka version of a cluster and to find out compatible upgrade paths

# __2.13.25__ __2020-05-27__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon GuardDuty__
  - ### Features
    - Documentation updates for GuardDuty

## __Amazon S3__
  - ### Bugfixes
    - Check the `x-amz-content-range` header for `GetObject` responses when the `Content-Range` header is not returned by the service. Fixes [#1209](https://github.com/aws/aws-sdk-java-v2/issues/1209).

## __Elastic Load Balancing__
  - ### Features
    - This release added support for HTTP/2 ALPN preference lists for Network Load Balancers

# __2.13.24__ __2020-05-26__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Allowing cron expression in the DLM policy creation schedule.

## __Amazon ElastiCache__
  - ### Features
    - Amazon ElastiCache now allows you to use resource based policies to manage access to operations performed on ElastiCache resources. Also, Amazon ElastiCache now exposes ARN (Amazon Resource Names) for ElastiCache resources such as Cache Clusters and Parameter Groups. ARNs can be used to apply IAM policies to ElastiCache resources.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - ebsOptimizedInfo, efaSupported and supportedVirtualizationTypes added to DescribeInstanceTypes API

## __Amazon Macie__
  - ### Features
    - This is a documentation-only update to the Amazon Macie Classic API. This update corrects out-of-date references to the service name.

## __Amazon QuickSight__
  - ### Features
    - Add DataSetArns to QuickSight DescribeDashboard API response.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - The AWS Systems Manager GetOpsSummary API action now supports multiple OpsResultAttributes in the request. Currently, this feature only supports OpsResultAttributes with the following TypeNames: [AWS:EC2InstanceComputeOptimizer] or [AWS:EC2InstanceInformation, AWS:EC2InstanceComputeOptimizer]. These TypeNames can be used along with either or both of the following: [AWS:EC2InstanceRecommendation, AWS:RecommendationSource]

# __2.13.23__ __2020-05-22__
## __AWS IoT SiteWise__
  - ### Features
    - This release adds support for the standard deviation auto-computed aggregate and improved support for portal logo images in SiteWise.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Auto Scaling__
  - ### Features
    - Documentation updates for Amazon EC2 Auto Scaling

# __2.13.22__ __2020-05-21__
## __AWS CodeBuild__
  - ### Features
    - CodeBuild adds support for tagging with report groups

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Fixed an issue where a service returning an unknown response event type would cause a failure.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - From this release onwards ProvisionByoipCidr publicly supports IPv6. Updated ProvisionByoipCidr API to support tags for public IPv4 and IPv6 pools. Added NetworkBorderGroup to the DescribePublicIpv4Pools response.

## __Amazon Simple Storage Service__
  - ### Features
    - Deprecates unusable input members bound to Content-MD5 header. Updates example and documentation.

## __Synthetics__
  - ### Features
    - AWS CloudWatch Synthetics now supports configuration of allocated memory for a canary.

# __2.13.21__ __2020-05-20__
## __AWS App Mesh__
  - ### Features
    - List APIs for all resources now contain additional information: when a resource was created, last updated, and its current version number.

## __AWS Backup__
  - ### Features
    - This release allows customers to enable or disable AWS Backup support for an AWS resource type. This release also includes new APIs, update-region-settings and describe-region-settings, which can be used to opt in to a specific resource type. For all current AWS Backup customers, the default settings enable support for EBS, EC2, StorageGateway, EFS, DDB and RDS resource types.

## __AWS CodeDeploy__
  - ### Features
    - Amazon ECS customers using application and network load balancers can use CodeDeploy BlueGreen hook to invoke a CloudFormation stack update. With this update you can view CloudFormation deployment and target details via existing APIs and use your stack Id to list or delete all deployments associated with the stack.

## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports the ability to ingest the content that is streaming from an AWS Elemental Link device: https://aws.amazon.com/medialive/features/link/. This release also adds support for SMPTE-2038 and input state waiters.

## __AWS SecurityHub__
  - ### Features
    - For findings related to controls, the finding information now includes the reason behind the current status of the control. A new field for the findings original severity allows finding providers to use the severity values from the system they use to assign severity.

## __Amazon Chime__
  - ### Features
    - Amazon Chime enterprise account administrators can now set custom retention policies on chat data in the Amazon Chime application.

## __Amazon Transcribe Streaming Service__
  - ### Features
    - This release adds support for vocabulary filtering in streaming with which you can filter unwanted words from the real-time transcription results. Visit https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html to learn more.

## __Application Auto Scaling__
  - ### Features
    - Documentation updates for Application Auto Scaling

# __2.13.20__ __2020-05-19__
## __AWS Health APIs and Notifications__
  - ### Features
    - Feature: Health: AWS Health added a new field to differentiate Public events from Account-Specific events in the API request and response. Visit https://docs.aws.amazon.com/health/latest/APIReference/API_Event.html to learn more.

## __AWS SDK for Java v2__
  - ### Features
    - Endpoint discovery is now enabled by default for future services that will require it. A new method 'endpointDiscoveryEnabled' has been added to client builders that support endpoint discovery allowing a true or false value to be set. 'enableEndpointDiscovery' has been deprecated on the client builders as it is now superseded by 'endpointDiscoveryEnabled'.
    - Updated service endpoint metadata.

## __Amazon Chime__
  - ### Features
    - You can now receive Voice Connector call events through SNS or SQS.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for Federated Authentication via SAML-2.0 in AWS ClientVPN.

## __Amazon Transcribe Service__
  - ### Features
    - Documentation updates for Amazon Transcribe.

# __2.13.19__ __2020-05-18__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Chime__
  - ### Features
    - Amazon Chime now supports redacting chat messages.

## __Amazon DynamoDB__
  - ### Features
    - Documentation updates for dynamodb

## __Amazon EC2 Container Service__
  - ### Features
    - This release adds support for specifying environment files to add environment variables to your containers.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release changes the RunInstances CLI and SDK's so that if you do not specify a client token, a randomly generated token is used for the request to ensure idempotency.

## __Amazon Macie 2__
  - ### Features
    - Documentation updates for Amazon Macie

## __Amazon QLDB__
  - ### Features
    - Amazon QLDB now supports Amazon Kinesis data streams. You can now emit QLDB journal data, via the new QLDB Streams feature, directly to Amazon Kinesis supporting event processing and analytics among related use cases.

# __2.13.18__ __2020-05-15__
## __AWS CloudFormation__
  - ### Features
    - This release adds support for the following features: 1. DescribeType and ListTypeVersions APIs now output a field IsDefaultVersion, indicating if a version is the default version for its type; 2. Add StackRollbackComplete waiter feature to wait until stack status is UPDATE_ROLLBACK_COMPLETE; 3. Add paginators in DescribeAccountLimits, ListChangeSets, ListStackInstances, ListStackSetOperationResults, ListStackSetOperations, ListStackSets APIs.

## __AWS Glue__
  - ### Features
    - Starting today, you can stop the execution of Glue workflows that are running. AWS Glue workflows are directed acyclic graphs (DAGs) of Glue triggers, crawlers and jobs. Using a workflow, you can design a complex multi-job extract, transform, and load (ETL) activity that AWS Glue can execute and track as single entity.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Allow event structures to be used as operation outputs outside of streaming contexts.
    - Fix generation for services that contain operations with the same name as the service.

## __AWS Security Token Service__
  - ### Features
    - API updates for STS

## __Amazon EC2 Container Registry__
  - ### Features
    - This release adds support for specifying an image manifest media type when pushing a manifest to Amazon ECR.

# __2.13.17__ __2020-05-14__
## __AWS SDK for Java v2__
  - ### Features
    - Expose the `extendedRequestId` from `SdkServiceException`, so it can be provided to support to investigate issues.
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Fix generation for operations that share an output shape.
    - Fix unmarshalling of events when structure member name and shape name mismatch.
    - Support event streams that are shared between two operations.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 now supports adding AWS resource tags for associations between VPCs and local gateways, at creation time.

## __Amazon RDS__
  - ### Features
    - Add SourceRegion to CopyDBClusterSnapshot and CreateDBCluster operations. As with CopyDBSnapshot and CreateDBInstanceReadReplica, specifying this field will automatically populate the PresignedURL field with a valid value.

## __EC2 Image Builder__
  - ### Features
    - This release adds a new parameter (SupportedOsVersions) to the Components API. This parameter lists the OS versions supported by a component.

# __2.13.16__ __2020-05-13__
## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix a race condition in `FileAsyncResponseTransformer` where the future fails to complete when onComplete event is dispatched on the same thread that executed request

## __Amazon ElastiCache__
  - ### Features
    - Amazon ElastiCache now supports auto-update of ElastiCache clusters after the "recommended apply by date" of service update has passed. ElastiCache will use your maintenance window to schedule the auto-update of applicable clusters. For more information, see https://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/Self-Service-Updates.html and https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Self-Service-Updates.html

## __Amazon Macie 2__
  - ### Features
    - This release introduces a new major version of the Amazon Macie API. You can use this version of the API to develop tools and applications that interact with the new Amazon Macie.

# __2.13.15__ __2020-05-12__
## __AWS IoT SiteWise__
  - ### Features
    - Documentation updates for iot-bifrost

## __Amazon WorkMail__
  - ### Features
    - Minor API fixes and updates to the documentation.

# __2.13.14__ __2020-05-11__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra is now generally available. As part of general availability, we are launching Metrics for query & storage utilization

## __Amazon CodeGuru Reviewer__
  - ### Features
    - Add Bitbucket integration APIs

## __Amazon Elastic Compute Cloud__
  - ### Features
    - M6g instances are our next-generation general purpose instances powered by AWS Graviton2 processors

# __2.13.13__ __2020-05-08__
## __AWS Resource Groups Tagging API__
  - ### Features
    - Documentation updates for resourcegroupstaggingapi

## __AWS SDK for Java v2__
  - ### Features
    - A helpful error message is now raised when an obviously-invalid region name is given to the SDK, instead of the previous NullPointerException. Fixes [#1642](https://github.com/aws/aws-sdk-java-v2/issues/1642).
    - Updated service endpoint metadata.

## __Amazon GuardDuty__
  - ### Features
    - Documentation updates for GuardDuty

## __Amazon SageMaker Service__
  - ### Features
    - This release adds a new parameter (EnableInterContainerTrafficEncryption) to CreateProcessingJob API to allow for enabling inter-container traffic encryption on processing jobs.

# __2.13.12__ __2020-05-07__
## __AWS CodeBuild__
  - ### Features
    - Add COMMIT_MESSAGE enum for webhook filter types

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon AppConfig__
  - ### Features
    - The description of the AWS AppConfig GetConfiguration API action was amended to include important information about calling ClientConfigurationVersion when you configure clients to call GetConfiguration.

## __Amazon CloudWatch Logs__
  - ### Features
    - Amazon CloudWatch Logs now offers the ability to interact with Logs Insights queries via the new PutQueryDefinition, DescribeQueryDefinitions, and DeleteQueryDefinition APIs.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 now adds warnings to identify issues when creating a launch template or launch template version.

## __Amazon Lightsail__
  - ### Features
    - This release adds support for the following options in instance public ports: Specify source IP addresses, specify ICMP protocol like PING, and enable/disable the Lightsail browser-based SSH and RDP clients' access to your instance.

## __Amazon Route 53__
  - ### Features
    - Amazon Route 53 now supports the EU (Milan) Region (eu-south-1) for latency records, geoproximity records, and private DNS for Amazon VPCs in that region.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This Patch Manager release supports creating patch baselines for Oracle Linux and Debian

# __2.13.11__ __2020-05-06__
## __AWS CodeStar connections__
  - ### Features
    - Added support for tagging resources in AWS CodeStar Connections

## __AWS Comprehend Medical__
  - ### Features
    - New Batch Ontology APIs for ICD-10 and RxNorm will provide batch capability of linking the information extracted by Comprehend Medical to medical ontologies. The new ontology linking APIs make it easy to detect medications and medical conditions in unstructured clinical text and link them to RxNorm and ICD-10-CM codes respectively. This new feature can help you reduce the cost, time and effort of processing large amounts of unstructured medical text with high accuracy.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

# __2.13.10__ __2020-05-05__
## __AWS SDJ for Java v2__
  - ### Features
    - Updating dependency version: Jackson 2.10.3 -> 2.10.4, and combine dependency Jackson-annotations with Jackson.

## __AWS Support__
  - ### Features
    - Documentation updates for support

## __Amazon DynamoDB__
  - ### Bugfixes
    - Tweaked the javadocs for Get/Update, since it was previously wrongfully copied over from Delete and mentions the "delete operation".

## __Amazon Elastic Compute Cloud__
  - ### Features
    - With this release, you can call ModifySubnetAttribute with two new parameters: MapCustomerOwnedIpOnLaunch and CustomerOwnedIpv4Pool, to map a customerOwnedIpv4Pool to a subnet. You will also see these two new fields in the DescribeSubnets response. If your subnet has a customerOwnedIpv4Pool mapped, your network interface will get an auto assigned customerOwnedIpv4 address when placed onto an instance.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - AWS Systems Manager Parameter Store launches new data type to support aliases in EC2 APIs

# __2.13.9__ __2020-05-04__
## __AWS S3 Control__
  - ### Features
    - Amazon S3 Batch Operations now supports Object Lock.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon API Gateway__
  - ### Features
    - Documentation updates for Amazon API Gateway

## __Amazon DynamoDB Enhanced Client__
  - ### Bugfixes
    - Bugfix for handling special characters ':' and '#' in attribute names

## __Amazon Elastic Compute Cloud__
  - ### Features
    - With this release, you can include enriched metadata in Amazon Virtual Private Cloud (Amazon VPC) flow logs published to Amazon CloudWatch Logs or Amazon Simple Storage Service (S3). Prior to this, custom format VPC flow logs enriched with additional metadata could be published only to S3. With this launch, we are also adding additional metadata fields that provide insights about the location such as AWS Region, AWS Availability Zone, AWS Local Zone, AWS Wavelength Zone, or AWS Outpost where the network interface where flow logs are captured exists.

# __2.13.8__ __2020-05-01__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Elastic File System__
  - ### Features
    - Change the TagKeys argument for UntagResource to a URL parameter to address an issue with the Java and .NET SDKs.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Added TimeoutSeconds as part of ListCommands API response.

# __2.13.7__ __2020-04-30__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for including AFD signaling in MXF wrapper.

## __AWS IoT__
  - ### Features
    - AWS IoT Core released Fleet Provisioning for scalable onboarding of IoT devices to the cloud. This release includes support for customer's Lambda functions to validate devices during onboarding. Fleet Provisioning also allows devices to send Certificate Signing Requests (CSR) to AWS IoT Core for signing and getting a unique certificate. Lastly, AWS IoT Core added a feature to register the same certificate for multiple accounts in the same region without needing to register the certificate authority (CA).

## __AWS IoT Events__
  - ### Features
    - Doc only update to correct APIs and related descriptions

## __AWS Lambda__
  - ### Features
    - Documentation updates for Lambda

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Storage Gateway__
  - ### Features
    - Adding support for S3_INTELLIGENT_TIERING as a storage class option

## __Amazon DynamoDB Enhanced Client__
  - ### Bugfixes
    - Made OperationContext a public interface and moved it into public namespace as it was already exposed through another public interface. This will only impact extensions that have been written to reference the old internal-only class that should now switch to the approved stable public interface.

## __Schemas__
  - ### Features
    - Add support for resource policies for Amazon EventBridge Schema Registry, which is now generally available.

# __2.13.6__ __2020-04-29__
## __AWS Cloud Map__
  - ### Features
    - Documentation updates for servicediscovery

## __AWS IoT SiteWise__
  - ### Features
    - AWS IoT SiteWise is a managed service that makes it easy to collect, store, organize and monitor data from industrial equipment at scale. You can use AWS IoT SiteWise to model your physical assets, processes and facilities, quickly compute common industrial performance metrics, and create fully managed web applications to help analyze industrial equipment data, prevent costly equipment issues, and reduce production inefficiencies.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS WAF__
  - ### Features
    - This release add migration API for AWS WAF Classic ("waf" and "waf-regional"). The migration API will parse through your web ACL and generate a CloudFormation template into your S3 bucket. Deploying this template will create equivalent web ACL under new AWS WAF ("wafv2").

## __AWS WAF Regional__
  - ### Features
    - This release add migration API for AWS WAF Classic ("waf" and "waf-regional"). The migration API will parse through your web ACL and generate a CloudFormation template into your S3 bucket. Deploying this template will create equivalent web ACL under new AWS WAF ("wafv2").

## __Amazon Transcribe Service__
  - ### Features
    - With this release, you can now use Amazon Transcribe to create medical custom vocabularies and use them in both medical real-time streaming and medical batch transcription jobs.

# __2.13.5__ __2020-04-28__
## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports several new features: enhanced VQ for H.264 (AVC) output encodes; passthrough of timed metadata and of Nielsen ID3 metadata in fMP4 containers in HLS outputs; the ability to generate a SCTE-35 sparse track without additional segmentation, in Microsoft Smooth outputs; the ability to select the audio from a TS input by specifying the audio track; and conversion of HDR colorspace in the input to an SDR colorspace in the output.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon DynamoDB Enhacned__
  - ### Bugfixes
    - Fix NPE on EnhancedType, created with documentOf, when calling innerToString

## __Amazon EC2 Container Registry__
  - ### Features
    - This release adds support for multi-architecture images also known as a manifest list

## __Amazon Kinesis Video Streams__
  - ### Features
    - Add "GET_CLIP" to the list of supported API names for the GetDataEndpoint API.

## __Amazon Kinesis Video Streams Archived Media__
  - ### Features
    - Add support for the GetClip API for retrieving media from a video stream in the MP4 format.

## __Amazon Route 53__
  - ### Features
    - Amazon Route 53 now supports the Africa (Cape Town) Region (af-south-1) for latency records, geoproximity records, and private DNS for Amazon VPCs in that region.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - SSM State Manager support for adding list association filter for Resource Group and manual mode of managing compliance for an association.

# __2.13.4__ __2020-04-27__
## __AWS Data Exchange__
  - ### Features
    - This release introduces AWS Data Exchange support for configurable encryption parameters when exporting data sets to Amazon S3.

## __AWS Database Migration Service__
  - ### Features
    - Adding minimum replication engine version for describe-endpoint-types api.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.
    - Various performance improvements.

## __Access Analyzer__
  - ### Features
    - This release adds support for inclusion of S3 Access Point policies in IAM Access Analyzer evaluation of S3 bucket access. IAM Access Analyzer now reports findings for buckets shared through access points and identifies the access point that permits access.

## __Amazon SageMaker Service__
  - ### Features
    - Change to the input, ResourceSpec, changing EnvironmentArn to SageMakerImageArn. This affects the following preview APIs: CreateDomain, DescribeDomain, UpdateDomain, CreateUserProfile, DescribeUserProfile, UpdateUserProfile, CreateApp and DescribeApp.

# __2.13.3__ __2020-04-24__
## __AWS IoT__
  - ### Features
    - This release adds a new exception type to the AWS IoT SetV2LoggingLevel API.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Fixed bean-style setter names on serializable builders to match bean-style getter names.

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Enable 1hour frequency in the schedule creation for Data LifeCycle Manager.

## __Amazon Elastic Inference__
  - ### Features
    - This feature allows customers to describe the accelerator types and offerings on any region where Elastic Inference is available.

# __2.13.2__ __2020-04-23__
## __AWS Elemental MediaPackage VOD__
  - ### Features
    - Adds tagging support for PackagingGroups, PackagingConfigurations, and Assets

## __AWS Resource Access Manager__
  - ### Features
    - AWS Resource Access Manager (RAM) provides a new ListResourceTypes action. This action lets you list the resource types that can be shared using AWS RAM.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Storage Gateway__
  - ### Features
    - Added AutomaticTapeCreation APIs

## __AWS Transfer Family__
  - ### Features
    - This release adds support for transfers over FTPS and FTP in and out of Amazon S3, which makes it easy to migrate File Transfer Protocol over SSL (FTPS) and FTP workloads to AWS, in addition to the existing support for Secure File Transfer Protocol (SFTP).

## __Amazon Kinesis Firehose__
  - ### Features
    - You can now deliver streaming data to an Amazon Elasticsearch Service domain in an Amazon VPC. You can now compress streaming data delivered to S3 using Hadoop-Snappy in addition to Gzip, Zip and Snappy formats.

## __Amazon Pinpoint__
  - ### Features
    - This release of the Amazon Pinpoint API enhances support for sending campaigns through custom channels to locations such as AWS Lambda functions or web applications. Campaigns can now use CustomDeliveryConfiguration and CampaignCustomMessage to configure custom channel settings for a campaign.

## __Amazon Relational Database Service__
  - ### Features
    - Adds support for AWS Local Zones, including a new optional parameter AvailabilityZoneGroup for the DescribeOrderableDBInstanceOptions operation.

## __Application Auto Scaling__
  - ### Features
    - This release supports Auto Scaling in Amazon Keyspaces for Apache Cassandra.

# __2.13.1__ __2020-04-22__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon CodeGuru Reviewer__
  - ### Features
    - Add support for code review and recommendation feedback APIs.

## __Amazon Elasticsearch Service__
  - ### Features
    - This change adds a new field 'OptionalDeployment' to ServiceSoftwareOptions to indicate whether a service software update is optional or mandatory. If True, it indicates that the update is optional, and the service software is not automatically updated. If False, the service software is automatically updated after AutomatedUpdateDate.

## __Amazon Redshift__
  - ### Features
    - Amazon Redshift support for usage limits

## __Amazon Transcribe Streaming Service__
  - ### Features
    - Adding ServiceUnavailableException as one of the expected exceptions

## __Firewall Management Service__
  - ### Features
    - This release is to support AWS Firewall Manager policy with Organizational Unit scope.

# __2.13.0__ __2020-04-21__
## __AWS Cost Explorer Service__
  - ### Features
    - Cost Explorer Rightsizing Recommendations integrates with Compute Optimizer and begins offering across instance family rightsizing recommendations, adding to existing support for within instance family rightsizing recommendations.

## __AWS SDK for Java v2__
  - ### Features
    - Bump minor version to '2.13.0-SNAPSHOT' because of upgrade of Jackson version.
    - Updated service endpoint metadata.
    - Updating dependency version: Jackson 2.10.0 -> 2.10.3, Jackson-annotations 2.9.0 -> 2.10.0.

## __Amazon Elastic MapReduce__
  - ### Features
    - Amazon EMR adds support for configuring a managed scaling policy for an Amazon EMR cluster. This enables automatic resizing of a cluster to optimize for job execution speed and reduced cluster cost.

## __Amazon GuardDuty__
  - ### Features
    - AWS GuardDuty now supports using AWS Organizations delegated administrators to create and manage GuardDuty master and member accounts. The feature also allows GuardDuty to be automatically enabled on associated organization accounts.

## __Amazon Route 53 Domains__
  - ### Features
    - You can now programmatically transfer domains between AWS accounts without having to contact AWS Support

# __2.12.0__ __2020-04-20__
## __AWS Cost Explorer Service__
  - ### Features
    - Cost Categories API is now General Available with new dimensions and operations support. You can map costs by account name, service, and charge type dimensions as well as use contains, starts with, and ends with operations. Cost Categories can also be used in RI and SP coverage reports.

## __AWS Glue__
  - ### Features
    - Added a new ConnectionType "KAFKA" and a ConnectionProperty "KAFKA_BOOTSTRAP_SERVERS" to support Kafka connection.

## __AWS IoT Events__
  - ### Features
    - API update that allows users to add AWS Iot SiteWise actions while creating Detector Model in AWS Iot Events

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon DynamoDB Enhanced Client__
  - ### Features
    - The Amazon DynamoDB Enhanced Client is now generally available and provides a natural and intuitive interface for developers to integrate their applications with Amazon DynamoDB by means of an adaptive API that will map inputs and results to and from Java objects modeled by the application, rather than requiring the developers to implement that transformation themselves.

## __AmazonApiGatewayV2__
  - ### Features
    - You can now export an OpenAPI 3.0 compliant API definition file for Amazon API Gateway HTTP APIs using the Export API.

## __Synthetics__
  - ### Features
    - Introducing CloudWatch Synthetics. This is the first public release of CloudWatch Synthetics.

# __2.11.14__ __2020-04-17__
## __AWS OpsWorks CM__
  - ### Features
    - Documentation updates for opsworkscm

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Fraud Detector__
  - ### Features
    - Added support for a new rule engine execution mode. Customers will be able to configure their detector versions to evaluate all rules and return outcomes from all 'matched' rules in the GetPrediction API response. Added support for deleting Detectors (DeleteDetector) and Rule Versions (DeleteRuleVersion).

# __2.11.13__ __2020-04-16__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert now allows you to specify your input captions frame rate for SCC captions sources.

## __AWS Glue__
  - ### Features
    - This release adds support for querying GetUserDefinedFunctions API without databaseName.

## __AWS IoT Events__
  - ### Features
    - API update that allows users to customize event action payloads, and adds support for Amazon DynamoDB actions.

## __AWS Lambda__
  - ### Features
    - Sample code for AWS Lambda operations

## __AWS MediaTailor__
  - ### Features
    - AWS Elemental MediaTailor SDK now allows configuration of Avail Suppression.

## __AWS Migration Hub__
  - ### Features
    - Adding ThrottlingException

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS SecurityHub__
  - ### Features
    - Added a new BatchUpdateFindings action, which allows customers to update selected information about their findings. Security Hub customers use BatchUpdateFindings to track their investigation into a finding. BatchUpdateFindings is intended to replace the UpdateFindings action, which is deprecated.

## __Amazon Augmented AI Runtime__
  - ### Features
    - This release updates Amazon Augmented AI ListHumanLoops and StartHumanLoop APIs.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 now supports adding AWS resource tags for placement groups and key pairs, at creation time. The CreatePlacementGroup API will now return placement group information when created successfully. The DeleteKeyPair API now supports deletion by resource ID.

## __Amazon Import/Export Snowball__
  - ### Features
    - An update to the Snowball Edge Storage Optimized device has been launched. Like the previous version, it has 80 TB of capacity for data transfer. Now it has 40 vCPUs, 80 GiB, and a 1 TiB SATA SSD of memory for EC2 compatible compute. The 80 TB of capacity can also be used for EBS-like volumes for AMIs.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for Amazon RDS Proxy with PostgreSQL compatibility.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker now supports running training jobs on ml.g4dn and ml.c5n instance types. Amazon SageMaker supports in "IN" operation for Search now.

## __EC2 Image Builder__
  - ### Features
    - This release includes support for additional OS Versions within EC2 Image Builder.

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Mark a connection as unreusable if there was a 5xx server error so that a new request will establish a new connection.

# __2.11.12__ __2020-04-08__
## __AWS CloudFormation__
  - ### Features
    - The OrganizationalUnitIds parameter on StackSet and the OrganizationalUnitId parameter on StackInstance, StackInstanceSummary, and StackSetOperationResultSummary are now reserved for internal use. No data is returned for this parameter.

## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK adds support for queue hopping. Jobs can now hop from their original queue to a specified alternate queue, based on the maximum wait time that you specify in the job settings.

## __AWS Migration Hub Config__
  - ### Features
    - Adding ThrottlingException

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Chime__
  - ### Features
    - feature: Chime: This release introduces the ability to tag Amazon Chime SDK meeting resources. You can use tags to organize and identify your resources for cost allocation.

## __Amazon CodeGuru Profiler__
  - ### Features
    - CodeGuruProfiler adds support for resource based authorization to submit profile data.

## __Amazon EC2 Container Service__
  - ### Features
    - This release provides native support for specifying Amazon EFS file systems as volumes in your Amazon ECS task definitions.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release provides the ability to include tags in EC2 event notifications.

# __2.11.11__ __2020-04-07__
## __AWS MediaConnect__
  - ### Features
    - You can now send content from your MediaConnect flow to your virtual private cloud (VPC) without going over the public internet.

## __Amazon API Gateway__
  - ### Features
    - Documentation updates for Amazon API Gateway.

## __Amazon CodeGuru Reviewer__
  - ### Features
    - API updates for CodeGuruReviewer

# __2.11.10__ __2020-04-06__
## __AWS Elastic Beanstalk__
  - ### Features
    - This release adds a new action, ListPlatformBranches, and updates two actions, ListPlatformVersions and DescribePlatformVersion, to support the concept of Elastic Beanstalk platform branches.

## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for AWS Identity and Access Management (IAM).

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Chime__
  - ### Features
    - Amazon Chime proxy phone sessions let you provide two users with a shared phone number to communicate via voice or text for up to 12 hours without revealing personal phone numbers. When users call or message the provided phone number, they are connected to the other party and their private phone numbers are replaced with the shared number in Caller ID.

## __Amazon Transcribe Service__
  - ### Features
    - This release adds support for batch transcription jobs within Amazon Transcribe Medical.

# __2.11.9__ __2020-04-03__
## __AWS RoboMaker__
  - ### Features
    - Added support for limiting simulation unit usage, giving more predictable control over simulation cost

## __AWS S3__
  - ### Features
    - Allow DefaultS3Presigner.Builder to take a custom S3Configuration

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Personalize Runtime__
  - ### Features
    - Amazon Personalize: Add new response field "score" to each item returned by GetRecommendations and GetPersonalizedRanking (HRNN-based recipes only)

# __2.11.8__ __2020-04-02__
## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports Automatic Input Failover. This feature provides resiliency upstream of the channel, before ingest starts.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon CloudWatch__
  - ### Features
    - Amazon CloudWatch Contributor Insights adds support for tags and tagging on resource creation.

## __Amazon GameLift__
  - ### Features
    - Public preview of GameLift FleetIQ as a standalone feature. GameLift FleetIQ makes it possible to use low-cost Spot instances by limiting the chance of interruptions affecting game sessions. FleetIQ is a feature of the managed GameLift service, and can now be used with game hosting in EC2 Auto Scaling groups that you manage in your own account.

## __Amazon Redshift__
  - ### Features
    - Documentation updates for redshift

## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for RDS: creating read replicas is now supported for SQL Server DB instances

# __2.11.7__ __2020-04-01__
## __AWS IoT__
  - ### Features
    - This release introduces Dimensions for AWS IoT Device Defender. Dimensions can be used in Security Profiles to collect and monitor fine-grained metrics.

## __AWS MediaConnect__
  - ### Features
    - You can now send content from your virtual private cloud (VPC) to your MediaConnect flow without going over the public internet.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

# __2.11.6__ __2020-03-31__
## __AWS Elemental MediaStore__
  - ### Features
    - This release adds support for CloudWatch Metrics. You can now set a policy on your container to dictate which metrics MediaStore sends to CloudWatch.

## __AWS Glue__
  - ### Features
    - Add two enums for MongoDB connection: Added "CONNECTION_URL" to "ConnectionPropertyKey" and added "MONGODB" to "ConnectionType"

## __AWS Lambda__
  - ### Features
    - AWS Lambda now supports .NET Core 3.1

## __AWS OpsWorks CM__
  - ### Features
    - Documentation updates for OpsWorks-CM CreateServer values.

## __AWS Organizations__
  - ### Features
    - Documentation updates for AWS Organizations

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Storage Gateway__
  - ### Features
    - Adding audit logging support for SMB File Shares

## __AWS WAFV2__
  - ### Features
    - Added support for AWS Firewall Manager for WAFv2 and PermissionPolicy APIs for WAFv2.

## __Amazon AppConfig__
  - ### Features
    - This release adds an event log to deployments. In the case of a deployment rollback, the event log details the rollback reason.

## __Amazon Detective__
  - ### Features
    - Removing the notes that Detective is in preview, in preparation for the Detective GA release.

## __Amazon Elastic Inference__
  - ### Features
    - This release includes improvements for the Amazon Elastic Inference service.

## __Amazon Pinpoint__
  - ### Features
    - This release of the Amazon Pinpoint API introduces MMS support for SMS messages.

## __Amazon Rekognition__
  - ### Features
    - This release adds DeleteProject and DeleteProjectVersion APIs to Amazon Rekognition Custom Labels.

## __Firewall Management Service__
  - ### Features
    - This release contains FMS wafv2 support.

# __2.11.5__ __2020-03-30__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Access Analyzer__
  - ### Features
    - This release adds support for the creation and management of IAM Access Analyzer analyzers with type organization. An analyzer with type organization continuously monitors all supported resources within the AWS organization and reports findings when they allow access from outside the organization.

# __2.11.4__ __2020-03-27__
## __AWS Global Accelerator__
  - ### Features
    - This update adds an event history to the ListByoipCidr API call. This enables you to see the changes that you've made for an IP address range that you bring to AWS Global Accelerator through bring your own IP address (BYOIP).

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Remove the `LimitExceededException` as a throttling error as it seems many services don't treat it as a throttling error.

## __AWS Service Catalog__
  - ### Features
    - Added "LocalRoleName" as an acceptable Parameter for Launch type in CreateConstraint and UpdateConstraint APIs

## __AWSKendraFrontendService__
  - ### Features
    - The Amazon Kendra Microsoft SharePoint data source now supports include and exclude regular expressions and change log features. Include and exclude regular expressions enable you to provide a list of regular expressions to match the display URL of SharePoint documents to either include or exclude documents respectively. When you enable the changelog feature it enables Amazon Kendra to use the SharePoint change log to determine which documents to update in the index.

# __2.11.3__ __2020-03-26__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS SecurityHub__
  - ### Features
    - Security Hub has now made it easier to opt out of default standards when you enable Security Hub. We added a new Boolean parameter to EnableSecurityHub called EnableDefaultStandards. If that parameter is true, Security Hub's default standards are enabled. A new Boolean parameter for standards, EnabledByDefault, indicates whether a standard is a default standard. Today, the only default standard is CIS AWS Foundations Benchmark v1.2. Additional default standards will be added in the future.To learn more, visit our documentation on the EnableSecurityHub API action.

## __Amazon FSx__
  - ### Features
    - This release includes two changes: a new lower-cost, storage type called HDD (Hard Disk Drive), and a new generation of the Single-AZ deployment type called Single AZ 2. The HDD storage type can be selected on Multi AZ 1 and Single AZ 2 deployment types.

## __Amazon SageMaker Service__
  - ### Features
    - This release updates Amazon Augmented AI CreateFlowDefinition API and DescribeFlowDefinition response.

# __2.11.2__ __2020-03-25__
## __AWS Cost Explorer Service__
  - ### Features
    - Customers can now receive Savings Plans recommendations at the member (linked) account level.

## __AWS SDK for Java v2__
  - ### Features
    - Added a `defaultProfileFile` and `defaultProfileName` option to the client override configuration. Setting this configuration value is equivalent to setting the environment or system properties for the profile file and profile name. Specifically, it sets the default profile file and profile name used by the client.
    - Reduced the number of times the profile file configuration is read from disk on client creation from 3-5 to 1.
    - Updated service endpoint metadata.

## __AWS X-Ray__
  - ### Features
    - GetTraceSummaries - Now provides additional root cause attribute ClientImpacting which indicates whether root cause impacted trace client.

## __Amazon CloudWatch Application Insights__
  - ### Features
    - Amazon CloudWatch Application Insights for .NET and SQL Server now integrates with Amazon CloudWatch Events (AWS CodeDeploy, AWS Health and Amazon EC2 state changes). This feature enables customers to view events related to problems detected by CloudWatch Application Insights, and reduce mean-time-to-resolution (MTTR).

## __Amazon Detective__
  - ### Features
    - The new ACCEPTED_BUT_DISABLED member account status indicates that a member account that accepted the invitation is blocked from contributing data to the behavior graph. The reason is provided in the new DISABLED_REASON property. The new StartMonitoringMember operation enables a blocked member account.

## __Amazon DynamoDB__
  - ### Features
    - When endpoint discovery is enabled, the endpoint discovery process is now initialized with the first request, instead of 60 seconds after the first request.

  - ### Bugfixes
    - Fixed an issue that could cause a null-pointer-exception when using anonymous credentials with endpoint discovery enabled.
    - Fixed an issue where endpoint discovery configuration specified in the profile file was being ignored.

## __Amazon DynamoDB Enhanced Client [Preview]__
  - ### Bugfixes
    - Performance improvements.

## __Amazon Elasticsearch Service__
  - ### Features
    - Adding support for customer packages (dictionary files) to Amazon Elasticsearch Service

## __Amazon Managed Blockchain__
  - ### Features
    - Amazon Managed Blockchain now has support to publish Hyperledger Fabric peer node, chaincode, and certificate authority (CA) logs to Amazon CloudWatch Logs.

## __Amazon S3__
  - ### Bugfixes
    - Fixed a bug where explicitly disabling use-arn-region on S3Configuration would have lower priority than the environment variable, system property or profile property.

# __2.11.1__ __2020-03-24__
## __AWS Organizations__
  - ### Features
    - Introduces actions for giving a member account administrative Organizations permissions for an AWS service. You can run this action only for AWS services that support this feature.

## __AWS RDS DataService__
  - ### Features
    - Documentation updates for rds-data

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Athena__
  - ### Features
    - Documentation updates for Athena, including QueryExecutionStatus QUEUED and RUNNING states. QUEUED now indicates that the query has been submitted to the service. RUNNING indicates that the query is in execution phase.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adding new error codes: Ec2SubnetInvalidConfiguration and NodeCreationFailure for Nodegroups in EKS

# __2.11.0__ __2020-03-23__
## __AWS SDK for Java v2__
  - ### Features
    - Bump minor version to '2.11.0-SNAPSHOT' because of [#1692](https://github.com/aws/aws-sdk-java-v2/issues/1692)
    - Updating dependency version: netty 4.1.42.Final -> 4.1.46.Final (contains the fix for reducing heap usage for netty client)

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adding new error code IamLimitExceeded for Nodegroups in EKS

## __Amazon Route 53__
  - ### Features
    - Documentation updates for Route 53.

## __AmazonApiGatewayV2__
  - ### Features
    - Documentation updates to reflect that the default timeout for integrations is now 30 seconds for HTTP APIs.

# __2.10.91__ __2020-03-20__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Service Catalog__
  - ### Features
    - Added "productId" and "portfolioId" to responses from CreateConstraint, UpdateConstraint, ListConstraintsForPortfolio, and DescribeConstraint APIs

# __2.10.90__ __2020-03-19__
## __AWS Certificate Manager__
  - ### Features
    - AWS Certificate Manager documentation updated on API calls ImportCertificate and ListCertificate. Specific updates included input constraints, private key size for import and next token size for list.

## __AWS Outposts__
  - ### Features
    - Documentation updates for AWS Outposts.

# __2.10.89__ __2020-03-18__
## __AWS MediaConnect__
  - ### Features
    - Feature adds the ability for a flow to have multiple redundant sources that provides resiliency to a source failing. The new APIs added to enable the feature are, AddFlowSources, RemoveFlowSource and UpdateFlow.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Personalize__
  - ### Features
    - [Personalize] Adds support for returning hyperparameter values of the best performing model in a HPO job.

## __Amazon Relational Database Service__
  - ### Features
    - Updated the MaxRecords type in DescribeExportTasks to Integer.

# __2.10.88__ __2020-03-17__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for: AV1 encoding in File Group MP4, DASH and CMAF DASH outputs; PCM/WAV audio output in MPEG2-TS containers; and Opus audio in Webm inputs.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Fix an issue where the signing key is created only once at the start of the request for event streaming requests. This causes requests that span two or more days to have signing errors once the date changes because the signing key was derived only once using the date at the beginning of the request.

# __2.10.87__ __2020-03-16__
## __AWS S3 Control__
  - ### Features
    - Amazon S3 now supports Batch Operations job tagging.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Additional response field "CompromisedCredentialsDetected" added to AdminListUserAuthEvents.

## __Amazon DynamoDB Enhanced Client [Preview]__
  - ### Features
    - The enhanced DDB client table schema now supports custom AttributeConverterProviders, and StaticAttribute can take individual AttributeConverter to override default attribute converter behavior.

## __Amazon EC2 Container Service__
  - ### Features
    - This release adds the ability to update the task placement strategy and constraints for Amazon ECS services.

## __Amazon ElastiCache__
  - ### Features
    - Amazon ElastiCache now supports Global Datastore for Redis. Global Datastore for Redis offers fully managed, fast, reliable and secure cross-region replication. Using Global Datastore for Redis, you can create cross-region read replica clusters for ElastiCache for Redis to enable low-latency reads and disaster recovery across regions. You can create, modify and describe a Global Datastore, as well as add or remove regions from your Global Datastore and promote a region as primary in Global Datastore.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Resource data sync for AWS Systems Manager Inventory now includes destination data sharing. This feature enables you to synchronize inventory data from multiple AWS accounts into a central Amazon S3 bucket. To use this feature, all AWS accounts must be listed in AWS Organizations.

# __2.10.86__ __2020-03-13__
## __Amazon AppConfig__
  - ### Features
    - This release adds S3 as a configuration source provider.

# __2.10.85__ __2020-03-12__
## __AWS IoT__
  - ### Features
    - As part of this release, we are extending capability of AWS IoT Rules Engine to support IoT Cloudwatch log action. The IoT Cloudwatch log rule action lets you send messages from IoT sensors and applications to Cloudwatch logs for troubleshooting and debugging.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS SecurityHub__
  - ### Features
    - The AWS Security Finding Format is being augmented with the following changes. 21 new resource types without corresponding details objects are added. Another new resource type, AwsS3Object, has an accompanying details object. Severity.Label is a new string field that indicates the severity of a finding. The available values are: INFORMATIONAL, LOW, MEDIUM, HIGH, CRITICAL. The new string field Workflow.Status indicates the status of the investigation into a finding. The available values are: NEW, NOTIFIED, RESOLVED, SUPPRESSED.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for EC2

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex now supports tagging for bots, bot aliases and bot channels.

## __AmazonApiGatewayV2__
  - ### Features
    - Amazon API Gateway HTTP APIs is now generally available. HTTP APIs offer the core functionality of REST API at up to 71% lower price compared to REST API, 60% lower p99 latency, and is significantly easier to use. As part of general availability, we added new features to route requests to private backends such as private ALBs, NLBs, and IP/ports. We also brought over a set of features from REST API such as Stage Variables, and Stage/Route level throttling. Custom domain names can also now be used with both REST And HTTP APIs.

# __2.10.84__ __2020-03-11__
## __Amazon Elastic File System__
  - ### Features
    - Documentation updates for elasticfilesystem

## __Amazon Redshift__
  - ### Features
    - Amazon Redshift now supports operations to pause and resume a cluster on demand or on a schedule.

# __2.10.83__ __2020-03-10__
## __AWS IoT Events__
  - ### Features
    - API update that adds a new parameter, durationExpression, to SetTimerAction, and deprecates seconds

## __AWS Marketplace Commerce Analytics__
  - ### Features
    - Change the disbursement data set to look past 31 days instead until the beginning of the month.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Reverts a recent change from 2.10.70 where the json protocol type was changed to application/json, this is now back to application/x-amz-json-1.1.

## __AWSServerlessApplicationRepository__
  - ### Features
    - AWS Serverless Application Repository now supports sharing applications privately with AWS Organizations.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for EC2

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe's Automatic Content Redaction feature enables you to automatically redact sensitive personally identifiable information (PII) from transcription results. It replaces each instance of an identified PII utterance with a [PII] tag in the transcript.

# __2.10.82__ __2020-03-09__
## __AWS Database Migration Service__
  - ### Features
    - Added new settings for Kinesis target to include detailed transaction info; to capture table DDL details; to use single-line unformatted json, which can be directly queried by AWS Athena if data is streamed into S3 through AWS Kinesis Firehose. Added CdcInsertsAndUpdates in S3 target settings to allow capture ongoing insertions and updates only.

## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports the ability to configure the Preferred Channel Pipeline for channels contributing to a Multiplex.

## __AWS SDK for Java v2__
  - ### Features
    - Added support for "retry modes". A retry mode allows configuring multiple SDK parameters at once using default retry profiles, some of which are standardized between AWS SDK languages. See RetryMode javadoc for more information.
    - Added the ability to configure or disable the default retry throttling behavior of the SDK that 'kicks in' during a large volume of retriable service call errors. This behavior can now be configured via `RetryPolicy.retryCapacityCondition`.

  - ### Bugfixes
    - Fixed an issue where specifying your own retry policy would override AWS and service-specific retry conditions. By default, all retry policies now have AWS and service-specific retry conditions added. This can be disabled via the new `RetryPolicy.furtherRefinementsAllowed(false)`.
    - Fixed an issue where the retry condition returned by `RetryPolicy.retryCondition` differed from the one specified by `RetryPolicy.Builder.retryCondition`. The old value can be accessed via the new `RetryPolicy.aggregateRetryCondition`.
    - Use the last seen HTTP/1.1 header value for headers defined to only appear once in an HTTP message instead of merging them all into a list. The order in which header values are inspected is: headers set by the request marshaller, overridden headers set on the client, then finally overridden headers set on the SDK request object. See https://tools.ietf.org/html/rfc2616#section-4.2 for more information.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon Virtual Private Cloud (VPC) NAT Gateway adds support for tagging on resource creation.

# __2.10.81__ __2020-03-06__
## __AWS App Mesh__
  - ### Features
    - App Mesh now supports sharing a Mesh with other AWS accounts. Customers can use AWS Resource Access Manager to share their Mesh with other accounts in their organization to connection applications within a single service mesh. See https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html for details.

## __AWS RoboMaker__
  - ### Features
    - Added support for streaming a GUI from robot and simulation applications

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Signer__
  - ### Features
    - This release enables signing image format override in PutSigningProfile requests, adding two more enum fields, JSONEmbedded and JSONDetached. This release also extends the length limit of SigningProfile name from 20 to 64.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release provides customers with a self-service option to enable Local Zones.

## __Amazon GuardDuty__
  - ### Features
    - Amazon GuardDuty findings now include the OutpostArn if the finding is generated for an AWS Outposts EC2 host.

## __Netty NIO Http Client__
  - ### Bugfixes
    - Expand Http2 connection-level flow control window when a new stream is acquired on that connection so that the connection-level window size is proportional to the number of streams.

# __2.10.80__ __2020-03-05__
## __AWS OpsWorks CM__
  - ### Features
    - Updated the Tag regex pattern to align with AWS tagging APIs.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon DynamoDB Enhanced Client [Preview]__
  - ### Features
    - Adds javadoc to operation methods and request/response objects.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - You can now create AWS Client VPN Endpoints with a specified VPC and Security Group. Additionally, you can modify these attributes when modifying the endpoint.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Amazon EKS now supports adding a KMS key to your cluster for envelope encryption of Kubernetes secrets.

## __Amazon GuardDuty__
  - ### Features
    - Add a new finding field for EC2 findings indicating the instance's local IP address involved in the threat.

# __2.10.79__ __2020-03-04__
## __Amazon Pinpoint__
  - ### Features
    - This release of the Amazon Pinpoint API introduces support for integrating recommender models with email, push notification, and SMS message templates. You can now use these types of templates to connect to recommender models and add personalized recommendations to messages that you send from campaigns and journeys.

# __2.10.78__ __2020-03-03__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon VPC Flow Logs adds support for tags and tagging on resource creation.

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Fix an issue where the Netty client was prematurely considering an HTTP/2 request body as sent, but was still in the process of being transferred to the remote endpoint.

# __2.10.77__ __2020-03-02__
## __AWS Comprehend Medical__
  - ### Features
    - New Time Expression feature, part of DetectEntitiesV2 API will provide temporal relations to existing NERe entities such as Medication, Test, Treatment, Procedure and Medical conditions.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon CloudWatch__
  - ### Features
    - Introducing Amazon CloudWatch Composite Alarms

# __2.10.76__ __2020-02-28__
## __AWS Config__
  - ### Features
    - Correcting list of supported resource types.

# __2.10.75__ __2020-02-28__
## __AWS App Mesh__
  - ### Features
    - App Mesh now supports Transport Layer Security (TLS) between Virtual Nodes in a Mesh. Customers can use managed certificates from an AWS Certificate Manager Private Certificate Authority or bring their own certificates from the local file system to encrypt traffic between their workloads. See https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual-node-tls.html for details.

## __AWS Config__
  - ### Features
    - Accepts a structured query language (SQL) SELECT command and an aggregator name, performs the corresponding search on resources aggregated by the aggregator, and returns resource configurations matching the properties.

## __AWS Glue__
  - ### Features
    - AWS Glue adds resource tagging support for Machine Learning Transforms and adds a new API, ListMLTransforms to support tag filtering. With this feature, customers can use tags in AWS Glue to organize and control access to Machine Learning Transforms.

## __Access Analyzer__
  - ### Features
    - This release includes improvements and fixes bugs for the IAM Access Analyzer feature.

## __Amazon Augmented AI Runtime__
  - ### Features
    - This release updates Amazon Augmented AI ListHumanLoops API, DescribeHumanLoop response, StartHumanLoop response and type names of SDK fields.

## __Amazon CodeGuru Profiler__
  - ### Features
    - Documentation updates for Amazon CodeGuru Profiler

## __Amazon QuickSight__
  - ### Features
    - Added SearchDashboards API that allows listing of dashboards that a specific user has access to.

## __Amazon WorkDocs__
  - ### Features
    - Documentation updates for workdocs

## __Elastic Load Balancing__
  - ### Features
    - Added a target group attribute to support sticky sessions for Network Load Balancers.

# __2.10.74__ __2020-02-27__
## __AWS Global Accelerator__
  - ### Features
    - This release adds support for adding tags to accelerators and bringing your own IP address to AWS Global Accelerator (BYOIP).

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Lightsail__
  - ### Features
    - Adds support to create notification contacts in Amazon Lightsail, and to create instance, database, and load balancer metric alarms that notify you based on the value of a metric relative to a threshold that you specify.

# __2.10.73__ __2020-02-26__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS SecurityHub__
  - ### Features
    - Security Hub has added to the DescribeProducts API operation a new response field called IntegrationTypes. The IntegrationTypes field lists the types of actions that a product performs relative to Security Hub such as send findings to Security Hub and receive findings from Security Hub.

## __Amazon DynamoDB Enhanced Client [Preview]__
  - ### Features
    - Added the BeanTableSchema implementation of TableSchema that allows a TableSchema to be instantiated from an annotated Java bean class which can then be used with the DynamoDB Enhanced Client.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release changes the RunInstances CLI and SDK's so that if you do not specify a client token, a randomly generated token is used for the request to ensure idempotency.

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker UpdateEndpoint API now supports retained variant properties, e.g., instance count, variant weight. SageMaker ListTrials API filter by TrialComponentName. Make ExperimentConfig name length limits consistent with CreateExperiment, CreateTrial, and CreateTrialComponent APIs.

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe's Automatic Content Redaction feature enables you to automatically redact sensitive personally identifiable information (PII) from transcription results. It replaces each instance of an identified PII utterance with a [PII] tag in the transcript.

# __2.10.72__ __2020-02-25__
## __AWS Outposts__
  - ### Features
    - This release adds DeleteSite and DeleteOutpost.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Secrets Manager__
  - ### Features
    - This release increases the maximum allowed size of SecretString or SecretBinary from 10KB to 64KB in the CreateSecret, UpdateSecret, PutSecretValue and GetSecretValue APIs.

## __AWS Step Functions__
  - ### Features
    - This release adds support for CloudWatch Logs for Standard Workflows.

## __Amazon DynamoDB Enhanced Client [Preview]__
  - ### Features
    - Improves discoverability by adding consumer-style methods for all client, table and index operations.

## __Managed Streaming for Kafka__
  - ### Features
    - Amazon MSK has added support for Broker Log delivery to CloudWatch, S3, and Firehose.

# __2.10.71__ __2020-02-24__
## __AWS IoT Events__
  - ### Features
    - Documentation updates for iotcolumbo

## __Amazon CloudWatch Events__
  - ### Features
    - This release allows you to create and manage tags for event buses.

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - Documentation updates for docdb

## __Amazon EventBridge__
  - ### Features
    - This release allows you to create and manage tags for event buses.

## __Amazon FSx__
  - ### Features
    - Announcing persistent file systems for Amazon FSx for Lustre that are ideal for longer-term storage and workloads, and a new generation of scratch file systems that offer higher burst throughput for spiky workloads.

## __Amazon Import/Export Snowball__
  - ### Features
    - AWS Snowball adds a field for entering your GSTIN when creating AWS Snowball jobs in the Asia Pacific (Mumbai) region.

# __2.10.70__ __2020-02-21__
## __AWS WAFV2__
  - ### Features
    - Documentation updates for AWS WAF (wafv2) to correct the guidance for associating a web ACL to a CloudFront distribution.

## __Amazon DynamoDB Enhanced Client [Preview]__
  - ### Features
    - Improves discoverability by adding consumer-style methods for all client, table and index operations.

## __Amazon Redshift__
  - ### Features
    - Extend elastic resize to support resizing clusters to different instance types.

## __EC2 Image Builder__
  - ### Features
    - This release of EC2 Image Builder increases the maximum policy document size for Image Builder resource-based policy APIs.

# __2.10.69__ __2020-02-20__
## __AWS Savings Plans__
  - ### Features
    - Added support for AWS Lambda in Compute Savings Plans

## __Amazon AppConfig__
  - ### Features
    - This release adds exponential growth type support for deployment strategies.

## __Amazon Pinpoint__
  - ### Features
    - As of this release of the Amazon Pinpoint API, the Title property is optional for the CampaignEmailMessage object.

# __2.10.68__ __2020-02-19__
## __AWS Lambda__
  - ### Features
    - AWS Lambda now supports Ruby 2.7

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Service Catalog__
  - ### Features
    - "ListPortfolioAccess" API now has a new optional parameter "OrganizationParentId". When it is provided and if the portfolio with the "PortfolioId" given was shared with an organization or organizational unit with "OrganizationParentId", all accounts in the organization sub-tree under parent which inherit an organizational portfolio share will be listed, rather than all accounts with external shares. To accommodate long lists returned from the new option, the API now supports pagination.

## __Auto Scaling__
  - ### Features
    - Doc update for EC2 Auto Scaling: Add Enabled parameter for PutScalingPolicy

# __2.10.67__ __2020-02-18__
## __Amazon Chime__
  - ### Features
    - Added AudioFallbackUrl to support Chime SDK client.

## __Amazon Relational Database Service__
  - ### Features
    - This release supports Microsoft Active Directory authentication for Amazon Aurora.

## __Auto Scaling__
  - ### Features
    - Amazon EC2 Auto Scaling now supports the ability to enable/disable target tracking, step scaling, and simple scaling policies.

# __2.10.66__ __2020-02-17__
## __AWS Cloud9__
  - ### Features
    - AWS Cloud9 now supports the ability to tag Cloud9 development environments.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon DynamoDB__
  - ### Features
    - Amazon DynamoDB enables you to restore your DynamoDB backup or table data across AWS Regions such that the restored table is created in a different AWS Region from where the source table or backup resides. You can do cross-region restores between AWS commercial Regions, AWS China Regions, and AWS GovCloud (US) Regions.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for EC2

## __Amazon Rekognition__
  - ### Features
    - This update adds the ability to detect text in videos and adds filters to image and video text detection.

# __2.10.65__ __2020-02-14__
## __AWS MediaTailor__
  - ### Features
    - AWS Elemental MediaTailor SDK now allows configuration of Personalization Threshold for HLS and DASH streams.

## __AWS SecurityHub__
  - ### Features
    - Security Hub has released a new DescribeStandards API action. This API action allows a customer to list all of the standards available in an account. For each standard, the list provides the customer with the standard name, description, and ARN. Customers can use the ARN as an input to the BatchEnableStandards API action. To learn more, visit our API documentation.

## __AWS Shield__
  - ### Features
    - This release adds support for associating Amazon Route 53 health checks to AWS Shield Advanced protected resources.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - You can now enable Multi-Attach on Provisioned IOPS io1 volumes through the create-volume API.

## __Amazon S3__
  - ### Features
    - Added support for presigning `CreateMultipartUpload`, `UploadPart`, `CompleteMultipartUpload`, and `AbortMultipartUpload` requests.

# __2.10.64__ __2020-02-13__
## __AWS Elemental MediaPackage VOD__
  - ### Features
    - Adds support for DASH with multiple media presentation description periods triggered by presence of SCTE-35 ad markers in the manifest.Also adds optional configuration for DASH SegmentTemplateFormat to refer to segments by Number with Duration, Number with Timeline or Time with Timeline and compact the manifest by combining duplicate SegmentTemplate tags.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon DynamoDB Enhanced Client [Preview]__
  - ### Features
    - Improves discoverability by adding operation methods for deleteItem(), getItem(), putItem and updateItem(), as applicable. These methods take a request object as parameter. Execute() methods for the table interface is removed since they are no longer needed.

## __Netty NIO HTTP Client__
  - ### Features
    - When there is an I/O error on an http2 request, the SDK will start shutting down the connection - stopping using the http2 connection for new requests and closing it after all streams are finished.

# __2.10.63__ __2020-02-12__
## __AWS Directory Service__
  - ### Features
    - Release to add the ExpirationDateTime as an output to ListCertificates so as to ease customers to look into their certificate lifetime and make timely decisions about renewing them.

## __AWS Glue__
  - ### Features
    - Adding ability to add arguments that cannot be overridden to AWS Glue jobs

## __Amazon Chime__
  - ### Features
    - Documentation updates for Amazon Chime

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for tagging public IPv4 pools.

## __Amazon Elasticsearch Service__
  - ### Features
    - Amazon Elasticsearch Service now offers fine-grained access control, which adds multiple capabilities to give tighter control over data. New features include the ability to use roles to define granular permissions for indices, documents, or fields and to extend Kibana with read-only views and secure multi-tenant support.

## __Amazon Neptune__
  - ### Features
    - This launch enables Neptune start-db-cluster and stop-db-cluster. Stopping and starting Amazon Neptune clusters helps you manage costs for development and test environments. You can temporarily stop all the DB instances in your cluster, instead of setting up and tearing down all the DB instances each time that you use the cluster.

## __Amazon WorkMail__
  - ### Features
    - This release adds support for access control rules management in Amazon WorkMail.

# __2.10.62__ __2020-02-11__
## __AWS CloudFormation__
  - ### Features
    - This release of AWS CloudFormation StackSets allows you to centrally manage deployments to all the accounts in your organization or specific organizational units (OUs) in AWS Organizations. You will also be able to enable automatic deployments to any new accounts added to your organization or OUs. The permissions needed to deploy across accounts will automatically be taken care of by the StackSets service.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Features:This release adds a new setting for a user pool to allow if customer wants their user signup/signin with case insensitive username. The current default setting is case sensitive, and for our next release we will change it to case insensitive.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 Now Supports Tagging Spot Fleet.

# __2.10.61__ __2020-02-10__
## __AWS Key Management Service__
  - ### Features
    - The ConnectCustomKeyStore API now provides a new error code (SUBNET_NOT_FOUND) for customers to better troubleshoot if their "connect-custom-key-store" operation fails.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - Added clarifying information that Amazon DocumentDB shares operational technology with Amazon RDS and Amazon Neptune.

# __2.10.60__ __2020-02-07__
## __AWS RoboMaker__
  - ### Features
    - This release adds support for simulation job batches

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon DynamoDB Enhanced Client [Preview]__
  - ### Features
    - Improves discoverability by renaming the table and index interfaces to be consistent with the client interface naming, and by adding operation methods for createTable(), scan() and query(), as applicable. These methods take a request object as parameter. Execute() methods for the index interface is removed since they are no longer needed.

## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for RDS: when restoring a DB cluster from a snapshot, must create DB instances

## __EC2 Image Builder__
  - ### Features
    - This version of the SDK includes bug fixes and documentation updates.

# __2.10.59__ __2020-02-06__
## __AWS AppSync__
  - ### Features
    - AWS AppSync now supports X-Ray

## __AWS CodeBuild__
  - ### Features
    - AWS CodeBuild adds support for Amazon Elastic File Systems

## __Amazon DynamoDB Enhanced Client [Preview]__
  - ### Features
    - In order to make operations more easily discoverable by an IDE, specific operation methods have been added to the enhanced client interface. An operation method takes a corresponding request object as parameter. Meanwhile, the generic execute() method is removed. This change affects only batch and transcribe operations at the database level.

## __Amazon EC2 Container Registry__
  - ### Features
    - This release contains updated text for the GetAuthorizationToken API.

## __Amazon Elastic Block Store__
  - ### Features
    - Documentation updates for EBS direct APIs.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds platform details and billing info to the DescribeImages API.

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex now supports AMAZON.AlphaNumeric with regular expressions.

# __2.10.58__ __2020-02-05__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for fine-tuned QVBR quality level.

## __AWS Ground Station__
  - ### Features
    - Adds dataflowEndpointRegion property to DataflowEndpointConfig. The dateCreated, lastUpdated, and tags properties on GetSatellite have been deprecated.

## __AWS Resource Groups Tagging API__
  - ### Features
    - Documentation-only update that adds services to the list of supported services.

## __AWS SecurityHub__
  - ### Features
    - Additional resource types are now supported in the AWS Security Finding Format (ASFF). The following new resource types are added, each having an accompanying resource details object with fields for security finding providers to populate: AwsCodeBuildProject, AwsEc2NetworkInterface, AwsEc2SecurityGroup, AwsElasticsearchDomain, AwsLambdaLayerVersion, AwsRdsDbInstance, and AwsWafWebAcl. The following resource types are added without an accompanying details object: AutoscalingAutoscalingGroup, AwsDynamoDbTable, AwsEc2Eip, AwsEc2Snapshot, AwsEc2Volume, AwsRdsDbSnapshot, AwsRedshiftCluster, and AwsS3Object. The number of allowed resources per finding is increased from 10 to 32. A new field is added in the Compliance object, RelatedRequirements. To learn more, visit our documentation on the ASFF.

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Updated the maximum number of tags that can be added to a snapshot using DLM to 45.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release provides support for tagging when you create a VPC endpoint, or VPC endpoint service.

## __Amazon Forecast Query Service__
  - ### Features
    - Documentation updates for Amazon Forecast.

# __2.10.57__ __2020-02-04__
## __AWS IoT__
  - ### Features
    - Updated ThrottlingException documentation to report that the error code is 400, and not 429, to reflect actual system behaviour.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Storage Gateway__
  - ### Features
    - Adding KVM as a support hypervisor

## __Amazon CloudFront__
  - ### Features
    - Documentation updates for CloudFront

## __Amazon DynamoDB Enhanced Client [Preview]__
  - ### Features
    - Changing usage of typed builders for PutItem, UpdateItem and StaticTableSchema to explicitly provide class type.
    - Renames top level sync/async MappedDatabase interfaces as DynamoDbEnhancedClient interfaces. Also adds builder definitions to the interfaces together with a static method that returns the default implementation of the builder.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon VPC Flow Logs adds support for 1-minute aggregation intervals.

## __Amazon S3__
  - ### Bugfixes
    - Fixed an issue where fields in `ListObjectVersionsResponse` and `ListMultipartUploadsResponse` are not decoded correctly when encodingType is specified as url. See [#1601](https://github.com/aws/aws-sdk-java-v2/issues/1601)

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This feature ensures that an instance is patched up to the available patches on a particular date. It can be enabled by selecting the 'ApproveUntilDate' option as the auto-approval rule while creating the patch baseline. ApproveUntilDate - The cutoff date for auto approval of released patches. Any patches released on or before this date will be installed automatically.

## __Amazon WorkMail__
  - ### Features
    - This release adds support for tagging Amazon WorkMail organizations.

## __Managed Streaming for Kafka__
  - ### Features
    - This release enables AWS MSK customers to list Apache Kafka versions that are supported on AWS MSK clusters. Also includes changes to expose additional details of a cluster's state in DescribeCluster and ListClusters APIs.

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Deliver exceptions to stream channels correctly if there's an exception thrown on connection. This also fixes a bug where publisher signals onComplete if the stream is closed as a result of outbound GOAWAY.
    - Throws `IOException` for the race condition where an HTTP2 connection gets reused at the same time it gets inactive so that failed requests can be retried

# __2.10.56__ __2020-01-24__
## __AWS DataSync__
  - ### Features
    - AWS DataSync now supports FSx for Windows File Server Locations

## __AWS OpsWorks CM__
  - ### Features
    - AWS OpsWorks for Chef Automate now supports in-place upgrade to Chef Automate 2. Eligible servers can be updated through the management console, CLI and APIs.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon EC2__
  - ### Features
    - Adds EC2ThrottledException as a recognized throttling exception to be retried

## __Amazon EC2 Container Service__
  - ### Features
    - This release provides support for tagging Amazon ECS task sets for services using external deployment controllers.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adding new error codes for Nodegroups in EKS

## __Amazon WorkSpaces__
  - ### Features
    - Documentation updates for WorkSpaces

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Fix issue where DNS resolution for a host is only made once for the initial request to the host. If the DNS entries change for a hostname, the client will resolve the new address until the client is closed and recreated.

# __2.10.55__ __2020-01-23__
## __AWS Identity and Access Management__
  - ### Features
    - This release enables the Identity and Access Management policy simulator to simulate permissions boundary policies.

## __AWS SDK for Java v2__
  - ### Features
    - Added ServiceMetadata.servicePartitions() to get partition metadata for a specific service
    - Improved error messages on UnknownHostExceptions
    - Updated service endpoint metadata.

## __Amazon DynamoDB Enhanced Client [Preview]__
  - ### Features
    - Support for non-blocking asynchronous calling of all mapper operations

## __Amazon Relational Database Service__
  - ### Features
    - This SDK release introduces APIs that automate the export of Amazon RDS snapshot data to Amazon S3. The new APIs include: StartExportTask, CancelExportTask, DescribeExportTasks. These APIs automate the extraction of data from an RDS snapshot and export it to an Amazon S3 bucket. The data is stored in a compressed, consistent, and query-able format. After the data is exported, you can query it directly using tools such as Amazon Athena or Redshift Spectrum. You can also consume the data as part of a data lake solution. If you archive the data in S3 Infrequent Access or Glacier, you can reduce long term data storage costs by applying data lifecycle policies.

# __2.10.54__ __2020-01-21__
## __AWS Application Discovery Service__
  - ### Features
    - Documentation updates for the AWS Application Discovery Service.

## __AWS CodePipeline__
  - ### Features
    - AWS CodePipeline enables an ability to stop pipeline executions.

## __AWS IoT Events__
  - ### Features
    - Documentation updates for iotcolumbo

## __AWS Marketplace Commerce Analytics__
  - ### Features
    - Remove 4 deprecated data sets, change some data sets available dates to 2017-09-15

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Add an enum value to the result of DescribeByoipCidrs to support CIDRs that are not publicly advertisable.

## __Netty NIO Http Client__
  - ### Bugfixes
    - Fixed a bug where an inactive http2 connection without `GOAWAY` frame received might get reused in a new request, causing `ClosedChannelException`

# __2.10.53__ __2020-01-20__
## __AWS Key Management Service__
  - ### Features
    - The ConnectCustomKeyStore operation now provides new error codes (USER_LOGGED_IN and USER_NOT_FOUND) for customers to better troubleshoot if their connect custom key store operation fails. Password length validation during CreateCustomKeyStore now also occurs on the client side.

## __AWS Lambda__
  - ### Features
    - Added reason codes to StateReasonCode (InvalidSubnet, InvalidSecurityGroup) and LastUpdateStatusReasonCode (SubnetOutOfIPAddresses, InvalidSubnet, InvalidSecurityGroup) for functions that connect to a VPC.

## __Alexa For Business__
  - ### Features
    - Add support for CreatedTime and ConnectionStatusUpdatedTime in response of SearchDevices API.

## __Amazon CloudWatch__
  - ### Features
    - Updating DescribeAnomalyDetectors API to return AnomalyDetector Status value in response.

## __Amazon CloudWatch Application Insights__
  - ### Features
    - This release adds support for a list API to retrieve the configuration events logged during periodic updates to an application by Amazon CloudWatch Application Insights.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release provides support for a preview of bringing your own IPv6 addresses (BYOIP for IPv6) for use in AWS.

# __2.10.52__ __2020-01-17__
## __AWS Batch__
  - ### Features
    - This release ensures INACTIVE job definitions are permanently deleted after 180 days.

## __AWS CloudHSM V2__
  - ### Features
    - This release introduces resource-level and tag-based access control for AWS CloudHSM resources. You can now tag CloudHSM backups, tag CloudHSM clusters on creation, and tag a backup as you copy it to another region.

## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for MP3 audio only outputs.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon EC2 Container Service__
  - ### Features
    - This release provides a public preview for specifying Amazon EFS file systems as volumes in your Amazon ECS task definitions.

## __Amazon Neptune__
  - ### Features
    - This release includes Deletion Protection for Amazon Neptune databases.

## __Amazon Redshift__
  - ### Features
    - Documentation updates for redshift

# __2.10.51__ __2020-01-16__
## __AWS Directory Service__
  - ### Features
    - To reduce the number of errors our customers are facing, we have modified the requirements of input parameters for two of Directory Service APIs.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Client VPN now supports Port Configuration for VPN Endpoints, allowing usage of either port 443 or port 1194.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds two new APIs (UpdateWorkforce and DescribeWorkforce) to SageMaker Ground Truth service for workforce IP whitelisting.

# __2.10.50__ __2020-01-15__
## __AWS Organizations__
  - ### Features
    - Updated description for PolicyID parameter and ConstraintViolationException.

## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS SecurityHub__
  - ### Features
    - Add support for DescribeStandardsControls and UpdateStandardsControl. These new Security Hub API operations are used to track and manage whether a compliance standards control is enabled.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - General Update to EC2 Docs and SDKs

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Document updates for Patch Manager 'NoReboot' feature.

## __Amazon Transcribe Service__
  - ### Bugfixes
    - Fixed an issue where streaming transcriptions would fail with signature validation errors if the date changed during the request.

# __2.10.49__ __2020-01-14__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for partition placement groups and instance metadata option in Launch Templates

# __2.10.48__ __2020-01-13__
## __AWS Backup__
  - ### Features
    - Cross-region backup is a new AWS Backup feature that allows enterprises to copy backups across multiple AWS services to different regions.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for the StopInstances API. You can now stop and start an Amazon EBS-backed Spot Instance at will, instead of relying on the Stop interruption behavior to stop your Spot Instances when interrupted.

## __Amazon Elastic File System__
  - ### Features
    - This release adds support for managing EFS file system policies and EFS Access Points.

## __Amazon S3__
  - ### Bugfixes
    - Fixed bug prevent GetBucketBolicy from ever being successful using the asynchronous S3 client.

# __2.10.47__ __2020-01-10__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.
    - Updated service endpoints and added global endpoints for iso and iso-b.

## __AWS Transfer for SFTP__
  - ### Features
    - This release introduces a new endpoint type that allows you to attach Elastic IP addresses from your AWS account with your server's endpoint directly and whitelist access to your server by client's internet IP address(es) using VPC Security Groups.

## __Amazon Chime__
  - ### Features
    - Add shared profile support to new and existing users

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release introduces the ability to tag egress only internet gateways, local gateways, local gateway route tables, local gateway virtual interfaces, local gateway virtual interface groups, local gateway route table VPC association and local gateway route table virtual interface group association. You can use tags to organize and identify your resources for cost allocation.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds an operation that enables users to override the system-default SSL/TLS certificate for new Amazon RDS DB instances temporarily, or remove the customer override.

## __Amazon S3__
  - ### Bugfixes
    - Fix an issue where s3#listObjects incorrectly decoded marker field. See [#1574](https://github.com/aws/aws-sdk-java-v2/issues/1574).

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker ListTrialComponents API filter by TrialName and ExperimentName.

## __Amazon WorkSpaces__
  - ### Features
    - Added the migrate feature to Amazon WorkSpaces.

# __2.10.46__ __2020-01-09__
## __AWS SDK for Java v2__
  - ### Bugfixes
    - Increase the priority of the AWS_WEB_IDENTITY_TOKEN_FILE/AWS_ROLE_ARN/AWS_ROLE_SESSION_NAME environment variables when loading credentials so that they are considered before web_identity_token_file/role_arn/role_session_name profile properties. This is consistent with the other AWS SDKs, including the CLI.

## __AWS Security Token Service__
  - ### Features
    - Documentation updates for sts

## __Amazon CloudWatch Logs__
  - ### Features
    - Documentation updates for logs

## __Amazon S3__
  - ### Features
    - Add support for Tagging builder in `CreateMultipartUploadRequest`. See [#1440](https://github.com/aws/aws-sdk-java-v2/issues/1440)

# __2.10.45__ __2020-01-08__
## __AWS Cost Explorer Service__
  - ### Features
    - Documentation updates for CreateCostCategoryDefinition and UpdateCostCategoryDefinition API

## __AWS Step Functions__
  - ### Features
    - Add sfn specific http configurations. See [#1325](https://github.com/aws/aws-sdk-java-v2/issues/1325)

## __Amazon EC2__
  - ### Bugfixes
    - Fix NPE when calling `CopySnapshot`. Fixes [#1564](https://github.com/aws/aws-sdk-java-v2/issues/1564)

## __Amazon Translate__
  - ### Features
    - This release adds a new family of APIs for asynchronous batch translation service that provides option to translate large collection of text or HTML documents stored in Amazon S3 folder. This service accepts a batch of up to 5 GB in size per API call with each document not exceeding 1 MB size and the number of documents not exceeding 1 million per batch. See documentation for more information.

## __Firewall Management Service__
  - ### Features
    - AWS Firewall Manager now supports tagging, and tag-based access control, of policies.

# __2.10.44__ __2020-01-07__
## __AWS CodeBuild__
  - ### Features
    - Add encryption key override to StartBuild API in AWS CodeBuild.

## __AWS Migration Hub__
  - ### Features
    - ListApplicationStates API provides a list of all application migration states

## __AWS X-Ray__
  - ### Features
    - Documentation updates for xray

# __2.10.43__ __2020-01-06__
## __AWS Elemental MediaPackage__
  - ### Features
    - You can now restrict direct access to AWS Elemental MediaPackage by securing requests for live content using CDN authorization. With CDN authorization, content requests require a specific HTTP header and authorization code.

## __AWS SDK for Java v2__
  - ### Features
    - Add `RequestBody.fromRemainingByteBuffer(ByteBuffer)` that copies only the remaining readable bytes of the buffer. See [#1534](https://github.com/aws/aws-sdk-java-v2/issues/1534)

  - ### Bugfixes
    - Reduce ReadTimeout and ConnectTimeout for accessing EC2 metadata instance service

## __Amazon Comprehend__
  - ### Features
    - Amazon Comprehend now supports Multilabel document classification

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release supports service providers configuring a private DNS name for services other than AWS services and services available in the AWS marketplace. This feature allows consumers to access the service using an existing DNS name without making changes to their applications.

## __Amazon S3__
  - ### Bugfixes
    - Requests that return an error response in the body of the HTTP response with a successful (200) status code will now correctly be handled as a failed request by the SDK.

# __2.10.42__ __2020-01-02__
## __AWS Cost Explorer Service__
  - ### Features
    - Documentation updates for GetReservationUtilization for the Cost Explorer API.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix unmarshalling for models with xml attributes. See [#1488](https://github.com/aws/aws-sdk-java-v2/issues/1488).

## __Amazon EC2 Container Registry__
  - ### Features
    - Adds waiters for ImageScanComplete and LifecyclePolicyPreviewComplete

## __Amazon Lex Model Building Service__
  - ### Features
    - Documentation updates for Amazon Lex.

## __Amazon Lightsail__
  - ### Features
    - This release adds support for Certificate Authority (CA) certificate identifier to managed databases in Amazon Lightsail.

## __Netty NIO Http Client__
  - ### Bugfixes
    - Propagate exception properly when an exception is thrown from protocol initialization.

# __2.10.41__ __2019-12-23__
## __AWS Health APIs and Notifications__
  - ### Features
    - With this release, you can now centrally aggregate AWS Health events from all accounts in your AWS organization. Visit AWS Health documentation to learn more about enabling and using this feature: https://docs.aws.amazon.com/health/latest/ug/organizational-view-health.html.

## __Amazon Detective__
  - ### Features
    - Updated the documentation for Amazon Detective.

## __Amazon FSx__
  - ### Features
    - This release adds a new family of APIs (create-data-repository-task, describe-data-repository-task, and cancel-data-repository-task) that allow users to perform operations between their file system and its linked data repository.

# __2.10.40__ __2019-12-20__
## __AWS Device Farm__
  - ### Features
    - Introduced browser testing support through AWS Device Farm

## __AWS SecurityHub__
  - ### Features
    - Additional resource types are now fully supported in the AWS Security Finding Format (ASFF). These resources include AwsElbv2LoadBalancer, AwsKmsKey, AwsIamRole, AwsSqsQueue, AwsLambdaFunction, AwsSnsTopic, and AwsCloudFrontDistribution. Each of these resource types includes an accompanying resource details object with fields for security finding providers to populate. Updates were made to the AwsIamAccessKey resource details object to include information on principal ID and name. To learn more, visit our documentation on the ASFF.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release introduces the ability to tag key pairs, placement groups, export tasks, import image tasks, import snapshot tasks and export image tasks. You can use tags to organize and identify your resources for cost allocation.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Amazon EKS now supports restricting access to the API server public endpoint by applying CIDR blocks

## __Amazon Pinpoint__
  - ### Features
    - This release of the Amazon Pinpoint API introduces versioning support for message templates.

## __Amazon Redshift__
  - ### Features
    - Documentation updates for Amazon Redshift RA3 node types.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds an operation that enables users to specify whether a database is restarted when its SSL/TLS certificate is rotated. Only customers who do not use SSL/TLS should use this operation.

## __Amazon S3__
  - ### Bugfixes
    - Fixed an issue where the SDK would attempt to validate the checksum on a PutObjectRequest when S3 was returning invalid checksums. This would cause all requests to buckets with customer-managed-key service-side encryption to fail.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release updates the attachments support to include AttachmentReference source for Automation documents.

## __Amazon Transcribe Service__
  - ### Features
    - AWS Transcribe now supports vocabulary filtering that allows customers to input words to the service that they don't want to see in the output transcript.

# __2.10.39__ __2019-12-19__
## __AWS CodeStar connections__
  - ### Features
    - Public beta for Bitbucket Cloud support in AWS CodePipeline through integration with AWS CodeStar connections.

## __Amazon Data Lifecycle Manager__
  - ### Features
    - You can now copy snapshots across regions using Data Lifecycle Manager (DLM). You can enable policies which, along with create, can now also copy snapshots to one or more AWS region(s). Copies can be scheduled for up to three regions from a single policy and retention periods are set for each region separately.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - We are updating the supportedRootDevices field to supportedRootDeviceTypes for DescribeInstanceTypes API to ensure that the actual value is returned, correcting a previous error in the model.

## __Amazon GameLift__
  - ### Features
    - Amazon GameLift now supports ARNs for all key GameLift resources, tagging for GameLift resource authorization management, and updated documentation that articulates GameLift's resource authorization strategy.

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex now supports conversation logs and slot obfuscation.

## __Amazon Personalize Runtime__
  - ### Features
    - Add context map to get-recommendations and get-personalized-ranking request objects to provide contextual metadata at inference time

## __Amazon S3__
  - ### Bugfixes
    - Fixed an issue where a 'checksum mismatch' error is raised whenever a PutObject request is retried while using an async client.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release allows customers to add tags to Automation execution, enabling them to sort and filter executions in different ways, such as by resource, purpose, owner, or environment.

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe supports job queuing for the StartTranscriptionJob API.

## __Netty NIO HTTP Client__
  - ### Features
    - `SETTINGS_INITIAL_WINDOW_SIZE` is now configurable on HTTP/2 connections opened by the Netty client using `Http2Configuration#initialWindowSize(Integer)` along with `NettyNioAsyncHttpClient.Builder#http2Configuration(Http2Configuration)`. See https://tools.ietf.org/html/rfc7540#section-6.5.2 for more information.

# __2.10.38__ __2019-12-18__
## __AWS OpsWorks CM__
  - ### Features
    - AWS OpsWorks CM now supports tagging, and tag-based access control, of servers and backups.

## __AWS Resource Groups Tagging API__
  - ### Features
    - Documentation updates for resourcegroupstaggingapi

## __Amazon CloudFront__
  - ### Features
    - Documentation updates for CloudFront

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release introduces the ability to tag Elastic Graphics accelerators. You can use tags to organize and identify your accelerators for cost allocation.

## __Amazon Simple Storage Service__
  - ### Features
    - Updates Amazon S3 endpoints allowing you to configure your client to opt-in to using S3 with the us-east-1 regional endpoint, instead of global.

# __2.10.37__ __2019-12-17__
## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports HLS ID3 segment tagging, HLS redundant manifests for CDNs that support different publishing/viewing endpoints, fragmented MP4 (fMP4), and frame capture intervals specified in milliseconds.

## __AWS IoT__
  - ### Features
    - Added a new Over-the-Air (OTA) Update feature that allows you to use different, or multiple, protocols to transfer an image from the AWS cloud to IoT devices.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation updates for Amazon ECS.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for Amazon EC2

## __Amazon Kinesis Analytics__
  - ### Features
    - Kinesis Data Analytics service now supports running Java applications using Flink 1.8.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Added support for Cloud Watch Output and Document Version to the Run Command tasks in Maintenance Windows.

# __2.10.36__ __2019-12-16__
## __AWS Comprehend Medical__
  - ### Features
    - New Ontology linking APIs will provides medication concepts normalization and Diagnoses codes from input text. In this release we will provide two APIs - RxNorm and ICD10-CM.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - You can now configure your EC2 Fleet to preferentially use EC2 Capacity Reservations for launching On-Demand instances, enabling you to fully utilize the available (and unused) Capacity Reservations before launching On-Demand instances on net new capacity.

## __Amazon S3__
  - ### Features
    - CopyObjectRequest now has `destinationBucket` and `destinationKey` properties for clarity.
      The existing names, `bucket` and `key`, are deprecated.

## __AmazonMQ__
  - ### Features
    - Amazon MQ now supports throughput-optimized message brokers, backed by Amazon EBS.

# __2.10.35__ __2019-12-13__
## __AWS CodeBuild__
  - ### Features
    - CodeBuild adds support for cross account

## __Amazon Detective__
  - ### Features
    - This is the initial release of Amazon Detective.

## __Amazon Simple Email Service__
  - ### Features
    - Added the ability to use your own public-private key pair to configure DKIM authentication for a domain identity.

# __2.10.34__ __2019-12-12__
## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fixing exception using `RequestBody.fromInputStream` on non-resettable `InputStreams` by making `reset` conditional on `markSupported`. See [#1544](https://github.com/aws/aws-sdk-java-v2/issues/1544) / [#1545](https://github.com/aws/aws-sdk-java-v2/issues/1545)

## __Access Analyzer__
  - ### Features
    - This release includes improvements and fixes bugs for the IAM Access Analyzer feature.

# __2.10.33__ __2019-12-11__
## __AWS SDK for Java v2__
  - ### Features
    - Adds a `has*` method to requests and responses that have a List or Map property.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release allows customers to attach multiple Elastic Inference Accelerators to a single EC2 instance. It adds support for a Count parameter for each Elastic Inference Accelerator type you specify on the RunInstances and LaunchTemplate APIs.

# __2.10.32__ __2019-12-10__
## __AWSKendraFrontendService__
  - ### Features
    - 1. Adding DocumentTitleFieldName as an optional configuration for SharePoint. 2. updating s3 object pattern to support all s3 keys.

# __2.10.31__ __2019-12-09__
## __AWS Key Management Service__
  - ### Features
    - The Verify operation now returns KMSInvalidSignatureException on invalid signatures. The Sign and Verify operations now return KMSInvalidStateException when a request is made against a CMK pending deletion.

## __Amazon QuickSight__
  - ### Features
    - Documentation updates for QuickSight

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Adds the SSM GetCalendarState API and ChangeCalendar SSM Document type. These features enable the forthcoming Systems Manager Change Calendar feature, which will allow you to schedule events during which actions should (or should not) be performed.

## __Managed Streaming for Kafka__
  - ### Features
    - AWS MSK has added support for Open Monitoring with Prometheus.

## __Netty NIO HTTP Client__
  - ### Features
    - Close HTTP/2 connections if they have had 0 streams for 5 seconds. This can be disabled using `useIdleConnectionReaper(false)` or have the time period adjusted using `connectionMaxIdleTime(...)` on the `NettyNioAsyncHttpClient.Builder`.
    - Periodically ping HTTP/2 connections and close them if the service does not respond. The ping periodicity and timeout time is not currently configurable.

# __2.10.30__ __2019-12-04__
## __Amazon Kinesis Video Signaling Channels__
  - ### Features
    - Announcing support for WebRTC in Kinesis Video Streams, as fully managed capability. You can now use simple APIs to enable your connected devices, web, and mobile apps with real-time two-way media streaming capabilities.

## __Amazon Kinesis Video Streams__
  - ### Features
    - Introduces management of signaling channels for Kinesis Video Streams.

## __AmazonApiGatewayV2__
  - ### Features
    - Amazon API Gateway now supports HTTP APIs (beta), enabling customers to quickly build high performance RESTful APIs that are up to 71% cheaper than REST APIs also available from API Gateway. HTTP APIs are optimized for building APIs that proxy to AWS Lambda functions or HTTP backends, making them ideal for serverless workloads. Using HTTP APIs, you can secure your APIs using OIDC and OAuth 2 out of box, quickly build web applications using a simple CORS experience, and get started immediately with automatic deployment and simple create workflows.

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Fixed an issue where closing the last stream on a connection that had been closed or received a GOAWAY did not close the connection.
    - Fixed an issue where receiving a GOAWAY that would cause the closing of all streams could cause all outstanding streams to be completed successfully instead of exceptionally.

# __2.10.29__ __2019-12-03__
## __AWS Lambda__
  - ### Features
    - - Added the ProvisionedConcurrency type and operations. Allocate provisioned concurrency to enable your function to scale up without fluctuations in latency. Use PutProvisionedConcurrencyConfig to configure provisioned concurrency on a version of a function, or on an alias.

## __AWS Step Functions__
  - ### Features
    - This release of the AWS Step Functions SDK introduces support for Express Workflows.

## __Amazon Elastic Block Store__
  - ### Features
    - This release introduces the EBS direct APIs for Snapshots: 1. ListSnapshotBlocks, which lists the block indexes and block tokens for blocks in an Amazon EBS snapshot. 2. ListChangedBlocks, which lists the block indexes and block tokens for blocks that are different between two snapshots of the same volume/snapshot lineage. 3. GetSnapshotBlock, which returns the data in a block of an Amazon EBS snapshot.

## __Amazon Rekognition__
  - ### Features
    - This SDK Release introduces APIs for Amazon Rekognition Custom Labels feature (CreateProjects, CreateProjectVersion,DescribeProjects, DescribeProjectVersions, StartProjectVersion, StopProjectVersion and DetectCustomLabels). Also new is AugmentedAI (Human In The Loop) Support for DetectModerationLabels in Amazon Rekognition.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for the Amazon RDS Proxy

## __Amazon S3__
  - ### Bugfixes
    - Interacting with an access point in a different region to the one the S3 client is configured for will no longer result in the request being signed for the wrong region and rejected by S3.

## __Amazon SageMaker Service__
  - ### Features
    - You can now use SageMaker Autopilot for automatically training and tuning candidate models using a combination of various feature engineering, ML algorithms, and hyperparameters determined from the user's input data. SageMaker Automatic Model Tuning now supports tuning across multiple algorithms. With Amazon SageMaker Experiments users can create Experiments, ExperimentTrials, and ExperimentTrialComponents to track, organize, and evaluate their ML training jobs. With Amazon SageMaker Debugger, users can easily debug training jobs using a number of pre-built rules provided by Amazon SageMaker, or build custom rules. With Amazon SageMaker Processing, users can run on-demand, distributed, and fully managed jobs for data pre- or post- processing or model evaluation. With Amazon SageMaker Model Monitor, a user can create MonitoringSchedules to automatically monitor endpoints to detect data drift and other issues and get alerted on them. This release also includes the preview version of Amazon SageMaker Studio with Domains, UserProfiles, and Apps. This release also includes the preview version of Amazon Augmented AI to easily implement human review of machine learning predictions by creating FlowDefinitions, HumanTaskUis, and HumanLoops.

## __Application Auto Scaling__
  - ### Features
    - This release supports auto scaling of provisioned concurrency for AWS Lambda.

# __2.10.28__ __2019-12-03__
## __AWS Compute Optimizer__
  - ### Features
    - Initial release of AWS Compute Optimizer. AWS Compute Optimizer recommends optimal AWS Compute resources to reduce costs and improve performance for your workloads.

## __AWS Network Manager__
  - ### Features
    - This is the initial SDK release for AWS Network Manager.

## __AWS Outposts__
  - ### Features
    - This is the initial release for AWS Outposts, a fully managed service that extends AWS infrastructure, services, APIs, and tools to customer sites. AWS Outposts enables you to launch and run EC2 instances and EBS volumes locally at your on-premises location. This release introduces new APIs for creating and viewing Outposts.

## __AWS S3 Control__
  - ### Features
    - Amazon S3 Access Points is a new S3 feature that simplifies managing data access at scale for shared data sets on Amazon S3. Access Points provide a customizable way to access the objects in a bucket, with a unique hostname and access policy that enforces the specific permissions and network controls for any request made through the access point. This represents a new way of provisioning access to shared data sets.

## __AWSKendraFrontendService__
  - ### Features
    - It is a preview launch of Amazon Kendra. Amazon Kendra is a managed, highly accurate and easy to use enterprise search service that is powered by machine learning.

## __Amazon Augmented AI Runtime__
  - ### Features
    - This release adds support for Amazon Augmented AI, which makes it easy to build workflows for human review of machine learning predictions.

## __Amazon CodeGuru Profiler__
  - ### Features
    - (New Service) Amazon CodeGuru Profiler analyzes application CPU utilization and latency characteristics to show you where you are spending the most cycles in your application. This analysis is presented in an interactive flame graph that helps you easily understand which paths consume the most resources, verify that your application is performing as expected, and uncover areas that can be optimized further.

## __Amazon CodeGuru Reviewer__
  - ### Features
    - This is the preview release of Amazon CodeGuru Reviewer.

## __Amazon EC2 Container Service__
  - ### Features
    - This release supports ECS Capacity Providers, Fargate Spot, and ECS Cluster Auto Scaling. These features enable new ways for ECS to manage compute capacity used by tasks.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for the following features: 1. An option to enable acceleration for Site-to-Site VPN connections; 2. Inf1 instances featuring up to 16 AWS Inferentia chips; 3. The ability to associate route tables with internet gateways and virtual private gateways; 4. AWS Local Zones that place compute, storage, database, and other select services; 5. Launching and viewing EC2 instances and EBS volumes running locally in Outposts; 6. Peering Transit Gateways between regions simplifying creation of secure and private global networks on AWS; 7. Transit Gateway Multicast, enabling multicast routing within and between VPCs using Transit Gateway as a multicast router.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Introducing Amazon EKS with Fargate. Customers can now use Amazon EKS to launch pods directly onto AWS Fargate, the serverless compute engine built for containers on AWS.

## __Amazon Elasticsearch Service__
  - ### Features
    - UltraWarm storage provides a cost-effective way to store large amounts of read-only data on Amazon Elasticsearch Service. Rather than attached storage, UltraWarm nodes use Amazon S3 and a sophisticated caching solution to improve performance. For indices that you are not actively writing to and query less frequently, UltraWarm storage offers significantly lower costs per GiB. In Elasticsearch, these warm indices behave just like any other index. You can query them using the same APIs or use them to create dashboards in Kibana.

## __Amazon Fraud Detector__
  - ### Features
    - Amazon Fraud Detector is a fully managed service that makes it easy to identify potentially fraudulent online activities such as online payment fraud and the creation of fake accounts. Amazon Fraud Detector uses your data, machine learning (ML), and more than 20 years of fraud detection expertise from Amazon to automatically identify potentially fraudulent online activity so you can catch more fraud faster.

## __Amazon Simple Storage Service__
  - ### Features
    - Amazon S3 Access Points is a new S3 feature that simplifies managing data access at scale for shared data sets on Amazon S3. Access Points provide a customizable way to access the objects in a bucket, with a unique hostname and access policy that enforces the specific permissions and network controls for any request made through the access point. This represents a new way of provisioning access to shared data sets.

## __Amazon Textract__
  - ### Features
    - This SDK Release introduces Amazon Augmented AI support for Amazon Textract AnalyzeDocument API. Image byte payloads for synchronous operations have increased from 5 MB to 10 MB.

# __2.10.27__ __2019-12-02__
## __Access Analyzer__
  - ### Features
    - Introducing AWS IAM Access Analyzer, an IAM feature that makes it easy for AWS customers to ensure that their resource-based policies provide only the intended access to resources outside their AWS accounts.

# __2.10.26__ __2019-12-02__
## __AWS License Manager__
  - ### Features
    - AWS License Manager now automates discovery of bring-your-own-license usage across the customers organization. With few simple settings, customers can add bring your own license product information along with licensing rules, which would enable License Manager to automatically track the instances that have the specified products installed. If License Manager detects any violation of licensing rules, it would notify the customers designated license administrator to take corrective action.

## __Amazon DynamoDB Enhanced Client [Preview]__
  - ### Features
    - Write operations (put, get, delete) now support 'conditionExpression'

## __Amazon Elastic Compute Cloud__
  - ### Features
    - AWS now provides a new BYOL experience for software licenses, such as Windows and SQL Server, that require a dedicated physical server. You can now enjoy the flexibility and cost effectiveness of using your own licenses on Amazon EC2 Dedicated Hosts, but with the simplicity, resiliency, and elasticity of AWS. You can specify your Dedicated Host management preferences, such as host allocation, host capacity utilization, and instance placement in AWS License Manager. Once set up, AWS takes care of these administrative tasks on your behalf, so that you can seamlessly launch virtual machines (instances) on Dedicated Hosts just like you would launch an EC2 instance with AWS provided licenses.

## __EC2 Image Builder__
  - ### Features
    - This is the first release of EC2 Image Builder, a service that provides a managed experience for automating the creation of EC2 AMIs.

## __Schemas__
  - ### Features
    - This release introduces support for Amazon EventBridge schema registry, making it easy to discover and write code for events in EventBridge.

# __2.10.25__ __2019-11-26__
## __AWS Directory Service__
  - ### Features
    - This release will introduce optional encryption over LDAP network traffic using SSL certificates between customer's self-managed AD and AWS Directory Services instances. The release also provides APIs for Certificate management.

## __AWS Kinesis__
  - ### Bugfixes
    - Reducing default read timeout and write timeout to 10 seconds for Kinesis client.

## __AWS MediaTailor__
  - ### Features
    - AWS Elemental MediaTailor SDK now allows configuration of the Live Pre-Roll feature for HLS and DASH streams.

## __AWS Organizations__
  - ### Features
    - Introduces the DescribeEffectivePolicy action, which returns the contents of the policy that's in effect for the account.

## __AWS RDS DataService__
  - ### Features
    - Type hints to improve handling of some specific parameter types (date/time, decimal etc) for ExecuteStatement and BatchExecuteStatement APIs

## __AWS Resource Groups Tagging API__
  - ### Features
    - You can use tag policies to help standardize on tags across your organization's resources.

## __AWSServerlessApplicationRepository__
  - ### Features
    - AWS Serverless Application Repository now supports verified authors. Verified means that AWS has made a good faith review, as a reasonable and prudent service provider, of the information provided by the requester and has confirmed that the requester's identity is as claimed.

## __Amazon Cognito Identity Provider__
  - ### Features
    - This release adds a new setting for a user pool to configure which recovery methods a user can use to recover their account via the forgot password operation.

## __Amazon DynamoDB__
  - ### Features
    - 1) Amazon Contributor Insights for Amazon DynamoDB is a diagnostic tool for identifying frequently accessed keys and understanding database traffic trends. 2) Support for displaying new fields when a table's encryption state is Inaccessible or the table have been Archived.

## __Amazon Elastic Inference__
  - ### Features
    - Amazon Elastic Inference allows customers to attach Elastic Inference Accelerators to Amazon EC2 and Amazon ECS tasks, thus providing low-cost GPU-powered acceleration and reducing the cost of running deep learning inference. This release allows customers to add or remove tags for their Elastic Inference Accelerators.

## __Amazon QuickSight__
  - ### Features
    - Documentation updates for QuickSight

## __Amazon WorkSpaces__
  - ### Features
    - For the WorkspaceBundle API, added the image identifier and the time of the last update.

## __Netty NIO HTTP Client__
  - ### Features
    - Detect unhealthy http2 connections when read or write times out by sending PING frames

# __2.10.24__ __2019-11-25__
## __AWS CodeBuild__
  - ### Features
    - CodeBuild adds support for test reporting

## __AWS Cost Explorer Service__
  - ### Features
    - This launch provides customers with access to Cost Category Public Beta APIs.

## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for 8K outputs and support for QuickTime Animation Codec (RLE) inputs.

## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports the ability to create a multiple program transport stream (MPTS).

## __AWS Elemental MediaPackage VOD__
  - ### Features
    - Adds a domain name to PackagingGroups, representing the fully qualified domain name for Assets created in the group.

## __AWS Greengrass__
  - ### Features
    - IoT Greengrass supports machine learning resources in 'No container' mode.

## __AWS IoT__
  - ### Features
    - This release adds: 1) APIs for fleet provisioning claim and template, 2) endpoint configuration and custom domains, 3) support for enhanced custom authentication, d) support for 4 additional audit checks: Device and CA certificate key quality checks, IoT role alias over-permissive check and IoT role alias access to unused services check, 5) extended capability of AWS IoT Rules Engine to support IoT SiteWise rule action. The IoT SiteWise rule action lets you send messages from IoT sensors and applications to IoT SiteWise asset properties

## __AWS IoT Secure Tunneling__
  - ### Features
    - This release adds support for IoT Secure Tunneling to remote access devices behind restricted firewalls.

## __AWS Key Management Service__
  - ### Features
    - AWS Key Management Service (KMS) now enables creation and use of asymmetric Customer Master Keys (CMKs) and the generation of asymmetric data key pairs.

## __AWS Lambda__
  - ### Features
    - Added the function state and update status to the output of GetFunctionConfiguration and other actions. Check the state information to ensure that a function is ready before you perform operations on it. Functions take time to become ready when you connect them to a VPC.Added the EventInvokeConfig type and operations to configure error handling options for asynchronous invocation. Use PutFunctionEventInvokeConfig to configure the number of retries and the maximum age of events when you invoke the function asynchronously.Added on-failure and on-success destination settings for asynchronous invocation. Configure destinations to send an invocation record to an SNS topic, an SQS queue, an EventBridge event bus, or a Lambda function.Added error handling options to event source mappings. This enables you to configure the number of retries, configure the maximum age of records, or retry with smaller batches when an error occurs when a function processes a Kinesis or DynamoDB stream.Added the on-failure destination setting to event source mappings. This enables you to send discarded events to an SNS topic or SQS queue when all retries fail or when the maximum record age is exceeded when a function processes a Kinesis or DynamoDB stream.Added the ParallelizationFactor option to event source mappings to increase concurrency per shard when a function processes a Kinesis or DynamoDB stream.

## __AWS Resource Access Manager__
  - ### Features
    - AWS RAM provides new APIs to view the permissions granted to principals in a resource share. This release also creates corresponding resource shares for supported services that use resource policies, as well as an API to promote them to standard shares that can be managed in RAM.

## __AWS WAFV2__
  - ### Features
    - This release introduces new set of APIs ("wafv2") for AWS WAF. Major changes include single set of APIs for creating/updating resources in global and regional scope, and rules are configured directly into web ACL instead of being referenced. The previous APIs ("waf" and "waf-regional") are now referred as AWS WAF Classic. For more information visit: https://docs.aws.amazon.com/waf/latest/APIReference/Welcome.html

## __Alexa For Business__
  - ### Features
    - API update for Alexa for Business: This update enables the use of meeting room configuration that can be applied to a room profile. These settings help improve and measure utilization on Alexa for Business enabled rooms. New features include end meeting reminders, intelligent room release and room utilization analytics report.

## __Amazon AppConfig__
  - ### Features
    - Introducing AWS AppConfig, a new service that enables customers to quickly deploy validated configurations to applications of any size in a controlled and monitored fashion.

## __Amazon Athena__
  - ### Features
    - This release adds additional query lifecycle metrics to the QueryExecutionStatistics object in GetQueryExecution response.

## __Amazon CloudWatch__
  - ### Features
    - This release adds a new feature called "Contributor Insights". "Contributor Insights" supports the following 6 new APIs (PutInsightRule, DeleteInsightRules, EnableInsightRules, DisableInsightRules, DescribeInsightRules and GetInsightRuleReport).

## __Amazon CloudWatch Application Insights__
  - ### Features
    - CloudWatch Application Insights for .NET and SQL Server includes the follwing features: -Tagging Create and manage tags for your applications.-Custom log pattern matching. Define custom log patterns to be detected and monitored.-Resource-level permissions. Specify applications users can access.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Amazon Cognito Userpools now supports Sign in with Apple as an Identity Provider.

## __Amazon Comprehend__
  - ### Features
    - Amazon Comprehend now supports real-time analysis with Custom Classification

## __Amazon Data Lifecycle Manager__
  - ### Features
    - You can now set time based retention policies on Data Lifecycle Manager. With this launch, DLM allows you to set snapshot retention period in the following interval units: days, weeks, months and years.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds two new APIs: 1. ModifyDefaultCreditSpecification, which allows you to set default credit specification at the account level per AWS Region, per burstable performance instance family, so that all new burstable performance instances in the account launch using the new default credit specification. 2. GetDefaultCreditSpecification, which allows you to get current default credit specification per AWS Region, per burstable performance instance family. This release also adds new client exceptions for StartInstances and StopInstances.

## __Amazon Kinesis Analytics__
  - ### Features
    - Kinesis Data Analytics service adds support to configure Java applications to access resources in a VPC. Also releasing support to configure Java applications to set allowNonRestoreState flag through the service APIs.

## __Amazon Lex Runtime Service__
  - ### Features
    - Amazon Lex adds "sessionId" attribute to the PostText and PostContent response.

## __Amazon Redshift__
  - ### Features
    - This release contains changes for 1. Redshift Scheduler 2. Update to the DescribeNodeConfigurationOptions to include a new action type recommend-node-config

## __Amazon Relational Database Service__
  - ### Features
    - Cluster Endpoints can now be tagged by using --tags in the create-db-cluster-endpoint API

## __Amazon Simple Email Service__
  - ### Features
    - This release includes support for automatically suppressing email addresses that result in hard bounce or complaint events at the account level, and for managing addresses on this account-level suppression list.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - AWS Systems Manager Documents now supports more Document Types: ApplicationConfiguration, ApplicationConfigurationSchema and DeploymentStrategy. This release also extends Document Permissions capabilities and introduces a new Force flag for DeleteDocument API.

## __Application Auto Scaling__
  - ### Features
    - This release supports auto scaling of document classifier endpoints for Comprehend; and supports target tracking based on the average capacity utilization metric for AppStream 2.0 fleets.

## __Elastic Load Balancing__
  - ### Features
    - This release of Elastic Load Balancing V2 adds new subnet features for Network Load Balancers and a new routing algorithm for Application Load Balancers.

# __2.10.23__ __2019-11-22__
## __AWS Auto Scaling Plans__
  - ### Features
    - Update default endpoint for AWS Auto Scaling.

## __AWS Certificate Manager__
  - ### Features
    - This release adds support for Tag-Based IAM for AWS Certificate Manager and adding tags to certificates upon creation.

## __AWS CodeBuild__
  - ### Features
    - Add Canonical ARN to LogsLocation.

## __AWS Elemental MediaPackage VOD__
  - ### Features
    - Includes the submission time of Asset ingestion request in the API response for Create/List/Describe Assets.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - The ProcessCredentialsProvider now supports credential files up to 64 KB by default through an increase of the processOutputLimit from 1024 bytes to 64000 bytes.

## __AWS Security Token Service__
  - ### Features
    - Support tagging for STS sessions and tag based access control for the STS APIs

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds two new APIs (DescribeInstanceTypes and DescribeInstanceTypeOfferings) that give customers access to instance type attributes and regional and zonal offerings.

## __Amazon Elastic MapReduce__
  - ### Features
    - Amazon EMR adds support for concurrent step execution and cancelling running steps. Amazon EMR has added a new Outpost ARN field in the ListCluster and DescribeCluster API responses that is populated for clusters launched in an AWS Outpost subnet.

## __Amazon Forecast Service__
  - ### Features
    - This release adds two key updates to existing APIs. 1. Amazon Forecast can now generate forecasts in any quantile using the optional parameter forecastTypes in the CreateForecast API and 2. You can get additional details (metrics and relevant error messages) on your AutoML runs using the DescribePredictor and GetAccuracyMetrics APIs.

## __Amazon Rekognition__
  - ### Features
    - This release adds enhanced face filtering support to the IndexFaces API operation, and introduces face filtering for CompareFaces and SearchFacesByImage API operations.

## __Amazon Simple Notification Service__
  - ### Features
    - Added documentation for the dead-letter queue feature.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Add RebootOption and LastNoRebootInstallOperationTime for DescribeInstancePatchStates and DescribeInstancePatchStatesForPatchGroup API

## __Application Auto Scaling__
  - ### Features
    - Update default endpoint for Application Auto Scaling.

# __2.10.22__ __2019-11-21__
## __AWS Amplify__
  - ### Features
    - This release of AWS Amplify Console introduces support for backend environments. Backend environments are containers for AWS deployments. Each environment is a collection of AWS resources.

## __AWS AppSync__
  - ### Features
    - AppSync: AWS AppSync now supports the ability to add, configure, and maintain caching for your AWS AppSync GraphQL API.

## __AWS Config__
  - ### Features
    - AWS Config launches Custom Configuration Items. A new feature which allows customers to publish resource configuration for third-party resources, custom, or on-premises servers.

## __AWS Glue__
  - ### Features
    - This release adds support for Glue 1.0 compatible ML Transforms.

## __AWSMarketplace Metering__
  - ### Features
    - Documentation updates for the AWS Marketplace Metering Service.

## __Amazon Connect Participant Service__
  - ### Features
    - This release adds 5 new APIs: CreateParticipantConnection, DisconnectParticipant, GetTranscript, SendEvent, and SendMessage. For Amazon Connect chat, you can use them to programmatically perform participant actions on the configured Amazon Connect instance. Learn more here: https://docs.aws.amazon.com/connect-participant/latest/APIReference/Welcome.html

## __Amazon Connect Service__
  - ### Features
    - This release adds a new API: StartChatContact. You can use it to programmatically start a chat on the specified Amazon Connect instance. Learn more here: https://docs.aws.amazon.com/connect/latest/APIReference/Welcome.html

## __Amazon DynamoDB__
  - ### Features
    - With this release, you can convert an existing Amazon DynamoDB table to a global table by adding replicas in other AWS Regions.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for attaching AWS License Manager Configurations to Amazon Machine Image (AMI) using ImportImage API; and adds support for running different instance sizes on EC2 Dedicated Hosts

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex now supports Sentiment Analysis

## __Amazon Lex Runtime Service__
  - ### Features
    - Amazon Lex now supports Sentiment Analysis

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - The release contains new API and API changes for AWS Systems Manager Explorer product.

## __Amazon Transcribe Service__
  - ### Features
    - With this release, Amazon Transcribe now supports transcriptions from audio sources in Hebrew (he-IL), Swiss German (de-CH), Japanese (ja-JP), Turkish (tr-TR), Arabic-Gulf (ar-AE), Malay (ms-MY), Telugu (te-IN)

# __2.10.21__ __2019-11-20__
## __AWS Application Discovery Service__
  - ### Features
    - New exception type for use with Migration Hub home region

## __AWS CloudTrail__
  - ### Features
    - 1. This release adds two new APIs, GetInsightSelectors and PutInsightSelectors, which let you configure CloudTrail Insights event delivery on a trail. An Insights event is a new type of event that is generated when CloudTrail detects unusual activity in your AWS account. In this release, only "ApiCallRateInsight" is a supported Insights event type. 2. This release also adds the new "ExcludeManagementEventSource" option to the existing PutEventSelectors API. This field currently supports only AWS Key Management Services.

## __AWS CodeCommit__
  - ### Features
    - This release adds support for creating pull request approval rules and pull request approval rule templates in AWS CodeCommit. This allows developers to block merges of pull requests, contingent on the approval rules being satisfiied.

## __AWS DataSync__
  - ### Features
    - Update to configure task to run periodically on a schedule

## __AWS Elemental MediaStore__
  - ### Features
    - This release fixes a broken link in the SDK documentation.

## __AWS Migration Hub__
  - ### Features
    - New exception type for use with Migration Hub home region

## __AWS Migration Hub Config__
  - ### Features
    - AWS Migration Hub Config Service allows you to get and set the Migration Hub home region for use with AWS Migration Hub and Application Discovery Service

## __AWS Storage Gateway__
  - ### Features
    - The new DescribeAvailabilityMonitorTest API provides the results of the most recent High Availability monitoring test. The new StartAvailabilityMonitorTest API verifies the storage gateway is configured for High Availability monitoring. The new ActiveDirectoryStatus response element has been added to the DescribeSMBSettings and JoinDomain APIs to indicate the status of the gateway after the most recent JoinDomain operation. The new TimeoutInSeconds parameter of the JoinDomain API allows for the configuration of the timeout in which the JoinDomain operation must complete.

## __Amazon Chime__
  - ### Features
    - Adds APIs to create and manage meeting session resources for the Amazon Chime SDK

## __Amazon Data Lifecycle Manager__
  - ### Features
    - DLM now supports Fast Snapshot Restore. You can enable Fast Restore on snapshots created by DLM, provide the AZs and the number of snapshots to be enabled with this capability.

## __Amazon EC2 Container Service__
  - ### Features
    - Added support for CPU and memory task-level overrides on the RunTask and StartTask APIs. Added location information to Tasks.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release of Amazon Elastic Compute Cloud (Amazon EC2) introduces support for Amazon Elastic Block Store (Amazon EBS) fast snapshot restores.
    - Upgrades to Instance Metadata Service version 2 (IMDS v2). With IMDS v2, a session token is used to make requests for EC2 instance metadata and credentials.

## __Amazon FSx__
  - ### Features
    - Announcing a Multi-AZ deployment type for Amazon FSx for Windows File Server, providing fully-managed Windows file storage with high availability and redundancy across multiple AWS Availability Zones.

## __Amazon Kinesis Firehose__
  - ### Features
    - With this release, Amazon Kinesis Data Firehose allows server side encryption with customer managed CMKs. Customer managed CMKs ( "Customer Master Keys") are AWS Key Management Service (KMS) keys that are fully managed by the customer. With customer managed CMKs, customers can establish and maintain their key policies, IAM policies, rotating policies and add tags. For more information about AWS KMS and CMKs, please refer to: https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html. Please refer to the following link to create CMKs: https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-create-cmk.html

## __Amazon QuickSight__
  - ### Features
    - Amazon QuickSight now supports programmatic creation and management of data sources, data sets, dashboards and templates with new APIs. Templates hold dashboard metadata, and can be used to create copies connected to the same or different dataset as required. Also included in this release are APIs for SPICE ingestions, fine-grained access control over AWS resources using AWS Identity and Access Management (IAM) policies, as well AWS tagging. APIs are supported for both Standard and Enterprise Edition, with edition-specific support for specific functionality.

## __Amazon Simple Storage Service__
  - ### Features
    - This release introduces support for Amazon S3 Replication Time Control, a new feature of S3 Replication that provides a predictable replication time backed by a Service Level Agreement. S3 Replication Time Control helps customers meet compliance or business requirements for data replication, and provides visibility into the replication process with new Amazon CloudWatch Metrics.

## __Amazon Transcribe Service__
  - ### Features
    - With this release Amazon Transcribe enables alternative transcriptions so that you can see different interpretations of transcribed audio.

# __2.10.20__ __2019-11-19__
## __AWS CloudFormation__
  - ### Features
    - This release of AWS CloudFormation StackSets enables users to detect drift on a stack set and the stack instances that belong to that stack set.

## __AWS CodeBuild__
  - ### Features
    - Add support for ARM and GPU-enhanced build environments and a new SSD-backed Linux compute type with additional CPU and memory in CodeBuild

## __AWS Config__
  - ### Features
    - AWSConfig launches support for conformance packs. A conformance pack is a new resource type that allows you to package a collection of Config rules and remediation actions into a single entity. You can create and deploy conformance packs into your account or across all accounts in your organization

## __AWS Identity and Access Management__
  - ### Features
    - IAM reports the timestamp when a role's credentials were last used to make an AWS request. This helps you identify unused roles and remove them confidently from your AWS accounts.

## __AWS IoT__
  - ### Features
    - As part of this release, we are extending the capability of AWS IoT Rules Engine to send messages directly to customer's own web services/applications. Customers can now create topic rules with HTTP actions to route messages from IoT Core directly to URL's that they own. Ownership is proved by creating and confirming topic rule destinations.

## __AWS Lambda__
  - ### Features
    - This release provides three new runtimes to support Node.js 12 (initially 12.13.0), Python 3.8 and Java 11.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for RunInstances to specify the metadata options for new instances; adds a new API, ModifyInstanceMetadataOptions, which lets you modify the metadata options for a running or stopped instance; and adds support for CreateCustomerGateway to specify a device name.

## __Auto Scaling__
  - ### Features
    - Amazon EC2 Auto Scaling now supports Instance Weighting and Max Instance Lifetime. Instance Weighting allows specifying the capacity units for each instance type included in the MixedInstancesPolicy and how they would contribute to your application's performance. Max Instance Lifetime allows specifying the maximum length of time that an instance can be in service. If any instances are approaching this limit, Amazon EC2 Auto Scaling gradually replaces them.

## __Elastic Load Balancing__
  - ### Features
    - This release allows forward actions on Application Load Balancers to route requests to multiple target groups, based on the weight you specify for each target group.

# __2.10.19__ __2019-11-18__
## __AWS CloudFormation__
  - ### Features
    - This release introduces APIs for the CloudFormation Registry, a new service to submit and discover resource providers with which you can manage third-party resources natively in CloudFormation.

## __AWS Cost Explorer Service__
  - ### Features
    - add EstimatedOnDemandCostWithCurrentCommitment to GetSavingsPlansPurchaseRecommendationRequest API

## __Amazon Pinpoint__
  - ### Features
    - This release of the Amazon Pinpoint API introduces support for using and managing message templates for messages that are sent through the voice channel. It also introduces support for specifying default values for message variables in message templates.

## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for rds

## __Amazon SageMaker Runtime__
  - ### Features
    - Amazon SageMaker Runtime now supports a new TargetModel header to invoke a specific model hosted on multi model endpoints.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker now supports multi-model endpoints to host multiple models on an endpoint using a single inference container.

## __Amazon Simple Storage Service__
  - ### Features
    - Added support for S3 Replication for existing objects. This release allows customers who have requested and been granted access to replicate existing S3 objects across buckets.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - The release contains new API and API changes for AWS Systems Manager Explorer product.

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Update default connectionMaxIdleTimeout of NettyNioAsyncClient to 5 seconds

# __2.10.18__ __2019-11-15__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for DolbyVision encoding, and SCTE35 & ESAM insertion to DASH ISO EMSG.

## __AWS SDK for Java v2__
  - ### Features
    - When SdkException or one of its children is created without a 'message', inherit the message from the exception 'cause' (if any). This should reduce the chance of an exception being raised by the SDK with a null message.

## __Amazon Chime__
  - ### Features
    - This release adds support for Chime Room Management APIs

## __Amazon CloudWatch Logs__
  - ### Features
    - Documentation updates for logs

## __Amazon Cognito Identity Provider__
  - ### Features
    - This release adds a new option in the User Pool to allow specifying sender's name in the emails sent by Amazon Cognito. This release also adds support to add SES Configuration Set to the emails sent by Amazon Cognito.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - You can now add tags while copying snapshots. Previously, a user had to first copy the snapshot and then add tags to the copied snapshot manually. Moving forward, you can specify the list of tags you wish to be applied to the copied snapshot as a parameter on the Copy Snapshot API.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Introducing Amazon EKS managed node groups, a new feature that lets you easily provision worker nodes for Amazon EKS clusters and keep them up to date using the Amazon EKS management console, CLI, and APIs.

## __Amazon Elastic MapReduce__
  - ### Features
    - Access to the cluster ARN makes it easier for you to author resource-level permissions policies in AWS Identity and Access Management. To simplify the process of obtaining the cluster ARN, Amazon EMR has added a new field containing the cluster ARN to all API responses that include the cluster ID.

## __Amazon GuardDuty__
  - ### Features
    - This release includes new operations related to findings export, including: CreatePublishingDestination, UpdatePublishingDestination, DescribePublishingDestination, DeletePublishingDestination and ListPublishingDestinations.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release updates AWS Systems Manager Parameter Store documentation for the enhanced search capability.

## __Amazon WorkSpaces__
  - ### Features
    - Added APIs to register your directories with Amazon WorkSpaces and to modify directory details.

## __Elastic Load Balancing__
  - ### Features
    - Documentation-only change to the default value of the routing.http.drop_invalid_header_fields.enabled attribute.

# __2.10.17__ __2019-11-14__
## __AWSMarketplace Metering__
  - ### Features
    - Added CustomerNotEntitledException in MeterUsage API for Container use case.

## __Amazon Cognito Identity Provider__
  - ### Features
    - This release adds a new setting at user pool client to prevent user existence related errors during authentication, confirmation, and password recovery related operations. This release also adds support to enable or disable specific authentication flows for a user pool client.

## __Amazon Connect Service__
  - ### Features
    - This release enhances the existing user management APIs and adds 3 new APIs - TagResource, UntagResource, and ListTagsForResource to support tagging Amazon Connect users, which facilitates more granular access controls for Amazon Connect users within an Amazon Connect instance. You can learn more about the new APIs here: https://docs.aws.amazon.com/connect/latest/APIReference/Welcome.html.

## __Amazon Personalize__
  - ### Features
    - Amazon Personalize: Adds ability to get batch recommendations by creating a batch inference job.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Updates support for adding attachments to Systems Manager Automation documents

# __2.10.16__ __2019-11-13__
## __AWS Data Exchange__
  - ### Features
    - Introducing AWS Data Exchange, a service that makes it easy for AWS customers to securely create, manage, access, and exchange data sets in the cloud.

## __AWS IoT__
  - ### Features
    - This release adds the custom fields definition support in the index definition for AWS IoT Fleet Indexing Service. Custom fields can be used as an aggregation field to run aggregations with both existing GetStatistics API and newly added GetCardinality, GetPercentiles APIs. GetStatistics will return all statistics (min/max/sum/avg/count...) with this release. For more information, please refer to our latest documentation: https://docs.aws.amazon.com/iot/latest/developerguide/iot-indexing.html

## __Amazon CloudSearch__
  - ### Features
    - Amazon CloudSearch domains let you require that all traffic to the domain arrive over HTTPS. This security feature helps you block clients that send unencrypted requests to the domain.

## __Amazon Data Lifecycle Manager__
  - ### Features
    - You can now add tags to a lifecycle policy in Data Lifecycle Manager (DLM). Tags allow you to categorize your policies in different ways, such as by department, purpose or owner. You can also enable resource level permissions based on tags to set access control on ability to modify or delete a tagged policy.

## __Amazon Simple Email Service__
  - ### Features
    - This is the first release of version 2 of the Amazon SES API. You can use this API to configure your Amazon SES account, and to send email. This API extends the functionality that exists in the previous version of the Amazon SES API.

# __2.10.15__ __2019-11-12__
## __AWS CodePipeline__
  - ### Features
    - AWS CodePipeline now supports the use of variables in action configuration.

## __AWS Marketplace Catalog Service__
  - ### Features
    - This is the first release for the AWS Marketplace Catalog service which allows you to list, describe and manage change requests on your published entities on AWS Marketplace.

## __Amazon DynamoDB__
  - ### Features
    - Amazon DynamoDB enables you to restore your data to a new DynamoDB table using a point-in-time or on-demand backup. You now can modify the settings on the new restored table. Specifically, you can exclude some or all of the local and global secondary indexes from being created with the restored table. In addition, you can change the billing mode and provisioned capacity settings.

## __Amazon Transcribe Service__
  - ### Features
    - With this release, Amazon Transcribe now supports transcriptions from audio sources in Welsh English (en-WL), Scottish English(en-AB), Irish English(en-IE), Farsi(fa-IR), Tamil(ta-IN), Indonesian(id-ID), Portuguese (pt-PT), Dutch(nl-NL).

## __Elastic Load Balancing__
  - ### Features
    - You can configure your Application Load Balancer to either drop invalid header fields or forward them to targets.

# __2.10.14__ __2019-11-11__
## __AWS CloudFormation__
  - ### Features
    - The Resource Import feature enables customers to import existing AWS resources into new or existing CloudFormation Stacks.

## __AWS Cost Explorer Service__
  - ### Features
    - This launch provides customers with access to GetCostAndUsageWithResources API.

## __Amazon Polly__
  - ### Features
    - Add `PollyPresigner` which enables support for presigning `SynthesizeSpeech` requests.

# __2.10.13__ __2019-11-08__
## __Amazon Cognito Identity__
  - ### Features
    - This release adds support for disabling classic flow.

## __Amazon EC2 Container Registry__
  - ### Features
    - This release contains ticket fixes for Amazon ECR.

# __2.10.12__ __2019-11-07__
## __AWS S3__
  - ### Features
    - Added support for presignPutObject in S3Presigner.

## __AWS SSO OIDC__
  - ### Features
    - This is an initial release of AWS Single Sign-On OAuth device code authorization service.

## __AWS Single Sign-On__
  - ### Features
    - This is an initial release of AWS Single Sign-On (SSO) end-user access. This release adds support for accessing AWS accounts assigned in AWS SSO using short term credentials.

## __Amazon Comprehend__
  - ### Features
    - This release adds new languages (ar, hi, ko, ja, zh, zh-TW) for Amazon Comprehend's DetectSentiment, DetectEntities, DetectKeyPhrases, BatchDetectSentiment, BatchDetectEntities and BatchDetectKeyPhrases APIs

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - AWS Systems Manager Session Manager target length increased to 400.

## __Netty NIO HTTP Client__
  - ### Features
    - Switch from setting the absolute URI in HTTP requests with no `Host` header to setting the absolute request path and query paramters and a `Host` header.

# __2.10.11__ __2019-11-06__
## __AWS SDK for Java v2__
  - ### Features
    - Added the web identity credentials provider to the default credential chain

## __AWS Savings Plans__
  - ### Features
    - This is the first release of Savings Plans, a new flexible pricing model that offers low prices on Amazon EC2 and AWS Fargate usage.

# __2.10.10__ __2019-11-06__
## __AWS Budgets__
  - ### Features
    - Documentation updates for budgets to track Savings Plans utilization and coverage

## __AWS CodeBuild__
  - ### Features
    - Add support for Build Number, Secrets Manager and Exported Environment Variables.

## __AWS Cost Explorer Service__
  - ### Features
    - This launch provides customers with access to Savings Plans management APIs.

## __AWS Savings Plans__
  - ### Features
    - This is the first release of Savings Plans, a new flexible pricing model that offers low prices on Amazon EC2 and AWS Fargate usage.

## __AWS Signer__
  - ### Features
    - This release adds support for tagging code-signing profiles in AWS Signer.

## __Amazon Elastic File System__
  - ### Features
    - EFS customers can select a lifecycle policy that automatically moves files that have not been accessed for 7 days into the EFS Infrequent Access (EFS IA) storage class. EFS IA provides price/performance that is cost-optimized for files that are not accessed every day.

# __2.10.9__ __2019-11-05__
## __AWS CodeStar Notifications__
  - ### Features
    - This release adds a notification manager for events in repositories, build projects, deployments, and pipelines. You can now configure rules and receive notifications about events that occur for resources. Each notification includes a status message as well as a link to the resource (repository, build project, deployment application, or pipeline) whose event generated the notification.

## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for Amazon RDS

# __2.10.8__ __2019-11-04__
## __AWS RoboMaker__
  - ### Features
    - RoboMaker Fleet Management launch a feature to verify your robot is ready to download and install the new robot application using a download condition file, which is a script run on the robot prior to downloading the new deployment.

## __Amazon DynamoDB Accelerator (DAX)__
  - ### Features
    - Documentation updates for dax

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for ec2

# __2.10.7__ __2019-11-01__
## __AWS CloudTrail__
  - ### Features
    - This release adds two new APIs, GetTrail and ListTrails, and support for adding tags when you create a trail by using a new TagsList parameter on CreateTrail operations.

## __AWS Database Migration Service__
  - ### Features
    - This release contains task timeline attributes in replication task statistics. This release also adds a note to the documentation for the CdcStartPosition task request parameter. This note describes how to enable the use of native CDC start points for a PostgreSQL source by setting the new slotName extra connection attribute on the source endpoint to the name of an existing logical replication slot.

## __Amazon Pinpoint__
  - ### Features
    - This release of the Amazon Pinpoint API introduces support for using and managing journeys, and querying analytics data for journeys.

# __2.10.6__ __2019-10-31__
## __AWS Amplify__
  - ### Features
    - This release of AWS Amplify Console introduces support for Web Previews. This feature allows user to create ephemeral branch deployments from pull request submissions made to a connected repository. A pull-request preview deploys every pull request made to your Git repository to a unique preview URL.

## __AWS Support__
  - ### Features
    - The status descriptions for TrustedAdvisorCheckRefreshStatus have been updated

## __Amazon Simple Storage Service__
  - ### Features
    - S3 Inventory now supports a new field 'IntelligentTieringAccessTier' that reports the access tier (frequent or infrequent) of objects stored in Intelligent-Tiering storage class.

# __2.10.5__ __2019-10-30__
## __Amazon ElastiCache__
  - ### Features
    - Amazon ElastiCache for Redis 5.0.5 now allows you to modify authentication tokens by setting and rotating new tokens. You can now modify active tokens while in use, or add brand-new tokens to existing encryption-in-transit enabled clusters that were previously setup without authentication tokens. This is a two-step process that allows you to set and rotate the token without interrupting client requests.

# __2.10.4__ __2019-10-29__
## __AWS Cloud9__
  - ### Features
    - Added CREATING and CREATE_FAILED environment lifecycle statuses.

## __Amazon AppStream__
  - ### Features
    - Adds support for providing domain names that can embed streaming sessions

# __2.10.3__ __2019-10-28__
## __Amazon Simple Storage Service__
  - ### Features
    - Adding support in SelectObjectContent for scanning a portion of an object specified by a scan range.

# __2.10.2__ __2019-10-28__
## __AWS Transfer for SFTP__
  - ### Features
    - This release adds logical directories support to your AWS SFTP server endpoint, so you can now create logical directory structures mapped to Amazon Simple Storage Service (Amazon S3) bucket paths for users created and stored within the service. Amazon S3 bucket names and paths can now be hidden from AWS SFTP users, providing an additional level of privacy to meet security requirements. You can lock down your SFTP users' access to designated folders (commonly referred to as 'chroot'), and simplify complex folder structures for data distribution through SFTP without replicating files across multiple users.

## __Amazon EC2 Container Registry__
  - ### Features
    - This release of Amazon Elastic Container Registry Service (Amazon ECR) introduces support for image scanning. This identifies the software vulnerabilities in the container image based on the Common Vulnerabilities and Exposures (CVE) database.

## __Amazon ElastiCache__
  - ### Features
    - Amazon ElastiCache adds support for migrating Redis workloads hosted on Amazon EC2 into ElastiCache by syncing the data between the source Redis cluster and target ElastiCache for Redis cluster in real time. For more information, see https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/migrate-to-elasticache.html.

# __2.10.1__ __2019-10-25__
## __Amazon Transcribe Streaming Service__
  - ### Features
    - With this release, Amazon Transcribe Streaming now supports audio sources in Australian English (en-AU).

# __2.10.0__ __2019-10-24__
## __AWS App Mesh__
  - ### Features
    - This release adds support for the gRPC and HTTP/2 protocols.

## __AWS SDK for Java v2__
  - ### Features
    - Updating to use Jackson 2.10.0 and Netty 4.1.42.Final

## __Amazon Chime__
  - ### Features
    - This release introduces Voice Connector PDX region and defaults previously created Voice Connectors to IAD. You can create Voice Connector Groups and add region specific Voice Connectors to direct telephony traffic across AWS regions in case of regional failures. With this release you can add phone numbers to Voice Connector Groups and can bulk move phone numbers between Voice Connectors, between Voice Connector and Voice Connector Groups and between Voice Connector Groups. Voice Connector now supports additional settings to enable SIP Log capture. This is in addition to the launch of Voice Connector Cloud Watch metrics in this release. This release also supports assigning outbound calling name (CNAM) to AWS account and individual phone numbers assigned to Voice Connectors. * Voice Connector now supports a setting to enable real time audio streaming delivered via Kinesis Audio streams. Please note that recording Amazon Chime Voice Connector calls with this feature maybe be subject to laws or regulations regarding the recording of telephone calls and other electronic communications. AWS Customer and their end users' have the responsibility to comply with all applicable laws regarding the recording, including properly notifying all participants in a recorded session or to a recorded communication that the session or communication is being recorded and obtain their consent.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release updates CreateFpgaImage to support tagging FPGA images on creation

## __Amazon GameLift__
  - ### Features
    - Amazon GameLift offers expanded hardware options for game hosting: Custom game builds can use the Amazon Linux 2 operating system, and fleets for both custom builds and Realtime servers can now use C5, M5, and R5 instance types.

## __Amazon SageMaker Service__
  - ### Features
    - Adds support for the new family of Elastic Inference Accelerators (eia2) for SageMaker Hosting and Notebook Services

## __Netty NIO Http Client__
  - ### Bugfixes
    - Fix a race condition where the channel is closed right after all content is buffered, causing `server failed to complete the response` error by adding a flag when `LastHttpContentHandler` is received.

# __2.9.26__ __2019-10-23__
## __AWS Security Token Service__
  - ### Features
    - AWS Security Token Service (STS) now supports a regional configuration flag to make the client respect the region without the need for the endpoint parameter.

## __Amazon Connect Service__
  - ### Features
    - This release adds 4 new APIs ListQueues, ListPhoneNumbers, ListContactFlows, and ListHoursOfOperations, which can be used to programmatically list Queues, PhoneNumbers, ContactFlows, and HoursOfOperations configured for an Amazon Connect instance respectively. You can learn more about the new APIs here: https://docs.aws.amazon.com/connect/latest/APIReference/Welcome.html.

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds new female voices: US Spanish - Lupe and Brazilian Portuguese - Camila; both voices are available in Standard and Neural engine.

# __2.9.25__ __2019-10-22__
## __AWS IoT Events__
  - ### Features
    - Add support for new serial evaluation method for events in a detector model.

## __AWS OpsWorks CM__
  - ### Features
    - AWS OpsWorks for Chef Automate (OWCA) now allows customers to use a custom domain and respective certificate, for their AWS OpsWorks For Chef Automate servers. Customers can now provide a CustomDomain, CustomCertificate and CustomPrivateKey in CreateServer API to configure their Chef Automate servers with a custom domain and certificate.

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Better handle `GOAWAY` messages from the remote endpoint.

# __2.9.24__ __2019-10-18__
## __Amazon CloudWatch__
  - ### Features
    - New Period parameter added to MetricDataQuery structure.

## __Netty NIO Http Client__
  - ### Bugfixes
    - Update `HealthCheckedChannelPool` to check `KEEP_ALIVE` when acquiring a channel from the pool to avoid soon-to-be inactive channels being picked up by a new request. This should reduce the frequency of `IOException: Server failed to complete response` errors. See [#1380](https://github.com/aws/aws-sdk-java-v2/issues/1380), [#1466](https://github.com/aws/aws-sdk-java-v2/issues/1466).

# __2.9.23__ __2019-10-17__
## __AWS Batch__
  - ### Features
    - Adding support for Compute Environment Allocation Strategies

## __Amazon Relational Database Service__
  - ### Features
    - Amazon RDS now supports Amazon RDS on VMware with the introduction of APIs related to Custom Availability Zones and Media installation.

# __2.9.22__ __2019-10-16__
## __AWS Marketplace Commerce Analytics__
  - ### Features
    - add 2 more values for the supporting sections - age of past due funds + uncollected funds breakdown

## __AWS RoboMaker__
  - ### Features
    - This release adds support for ROS2 Dashing as a beta feature

## __Managed Streaming for Kafka__
  - ### Features
    - AWS MSK has added support for adding brokers to a cluster.

# __2.9.21__ __2019-10-15__
## __Amazon Kinesis Video Streams Archived Media__
  - ### Features
    - Add ON_DISCONTINUITY mode to the GetHLSStreamingSessionURL API

# __2.9.20__ __2019-10-14__
## __Amazon Personalize__
  - ### Features
    - AWS Personalize: Adds ability to create a solution version using FULL or UPDATE training mode

## __Amazon WorkSpaces__
  - ### Features
    - Documentation updates for WorkSpaces

# __2.9.19__ __2019-10-11__
## __AWS Greengrass__
  - ### Features
    - Greengrass OTA service supports Raspbian/Armv6l platforms.

# __2.9.18__ __2019-10-10__
## __AWS IoT Analytics__
  - ### Features
    - Add `completionTime` to API call ListDatasetContents.

## __AWS SDK for Java v2__
  - ### Features
    - Implement arn parser functions in `arns` module.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - New EC2 M5n, M5dn, R5n, R5dn instances with 100 Gbps network performance and Elastic Fabric Adapter (EFA) for ultra low latency; New A1.metal bare metal instance powered by AWS Graviton Processors

## __Amazon Lex Runtime Service__
  - ### Features
    - Amazon Lex now supports Session API checkpoints

## __Firewall Management Service__
  - ### Features
    - Firewall Manager now supports Amazon VPC security groups, making it easier to configure and manage security groups across multiple accounts from a single place.

# __2.9.17__ __2019-10-09__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for Dolby Atmos encoding, up to 36 outputs, accelerated transcoding with frame capture and preferred acceleration feature.

## __AWS SDK for Java v2__
  - ### Features
    - Expose instance signature through EC2MetadataUtils

  - ### Bugfixes
    - Fix the implementations of `equals(Object)` and `hashCode()` for `DefaultSdkAutoConstructList` and `DefaultSdkAutoConstructMap` so that they follow the Java `equals` and `hashCode` contract. In addition, ensure that these implementations' `toString()` methods return nicely readable results. Fixes [#1445](https://github.com/aws/aws-sdk-java-v2/issues/1445)

## __Amazon ElastiCache__
  - ### Features
    - Amazon ElastiCache now allows you to apply available service updates on demand to your Memcached and Redis Cache Clusters. Features included: (1) Access to the list of applicable service updates and their priorities. (2) Service update monitoring and regular status updates. (3) Recommended apply-by-dates for scheduling the service updates. (4) Ability to stop and later re-apply updates. For more information, see https://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/Self-Service-Updates.html and https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Self-Service-Updates.html

## __Managed Streaming for Kafka__
  - ### Features
    - Updated documentation for Amazon Managed Streaming for Kafka service.

# __2.9.16__ __2019-10-08__
## __AWS DataSync__
  - ### Features
    - Add Sync options to enable/disable TaskQueueing

## __AWS Organizations__
  - ### Features
    - Documentation updates for organizations

## __AWS SDK for Java v2__
  - ### Features
    - EC2MetadataUtils: add marketplaceProductCodes inside InstanceInfo's POJO

## __Amazon EventBridge__
  - ### Features
    - Documentation updates for Amazon EventBridge.

## __Amazon Kinesis Firehose__
  - ### Features
    - With this release, you can use Amazon Kinesis Firehose delivery streams to deliver streaming data to Amazon Elasticsearch Service version 7.x clusters. For technical documentation, look for CreateDeliveryStream operation in Amazon Kinesis Firehose API reference.

## __Amazon S3 Control__
  - ### Features
    - Adds support for the Amazon S3 Control service to the SDK.

# __2.9.15__ __2019-10-07__
## __AWS Direct Connect__
  - ### Features
    - This release adds a service provider field for physical connection creation and provides a list of available partner providers for each Direct Connect location.

## __AWS Glue__
  - ### Features
    - AWS Glue now provides ability to use custom certificates for JDBC Connections.

## __Amazon Import/Export Snowball__
  - ### Features
    - AWS Snowball Edge now allows you to perform an offline update to the software of your Snowball Edge device when your device is not connected to the internet. Previously, updating your Snowball Edge's software required that the device be connected to the internet or be sent back to AWS. Now, you can keep your Snowball Edge software up to date even if your device(s) cannot connect to the internet, or are required to run in an air-gapped environment. To complete offline updates, download the software update from a client machine with connection to the internet using the AWS Command Line Interface (CLI). Then, have the Snowball Edge device download and install the software update using the Snowball Edge device API. For more information about offline updates, visit the Snowball Edge documentation page.

## __Amazon Kinesis Firehose__
  - ### Features
    - Amazon Kinesis Data Firehose now allows delivering data to Elasticsearch clusters set up in a different AWS account than the Firehose AWS account. For technical documentation, look for ElasticsearchDestinationConfiguration in the Amazon Kinesis Firehose API reference.

## __Amazon Pinpoint__
  - ### Features
    - This release of the Amazon Pinpoint API introduces support for using and managing message templates.

## __Amazon Pinpoint Email Service__
  - ### Features
    - This release of the Amazon Pinpoint Email API introduces support for using and managing message templates.

# __2.9.14__ __2019-10-04__
## __AWS Elemental MediaPackage__
  - ### Features
    - New Harvest Job APIs to export segment-accurate content windows from MediaPackage Origin Endpoints to S3. See https://docs.aws.amazon.com/mediapackage/latest/ug/harvest-jobs.html for more info

## __Amazon CloudWatch__
  - ### Bugfixes
    - Add cloudwatch specific http configurations, specifically reducing `connectionMaxIdleTime`. Related to [#1380](https://github.com/aws/aws-sdk-java-v2/issues/1380)

## __Amazon Cognito Identity Provider__
  - ### Features
    - This release adds ClientMetadata input parameter to multiple Cognito User Pools operations, making this parameter available to the customer configured lambda triggers as applicable.

## __Amazon S3__
  - ### Bugfixes
    - Add s3 specific http configurations, specifically reducing `connectionMaxIdleTime`. Related to [#1122](https://github.com/aws/aws-sdk-java-v2/issues/1122)

## __Amazon S3 Control__
  - ### Features
    - Adds support for the Amazon S3 Control service to the SDK.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Documentation updates for Systems Manager / StartSession.

# __2.9.13__ __2019-10-03__
## __AWS Device Farm__
  - ### Features
    - Documentation updates for devicefarm

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release allows customers to purchase regional EC2 RIs on a future date.

## __Amazon Elasticsearch Service__
  - ### Features
    - Amazon Elasticsearch Service now supports configuring additional options for domain endpoint, such as whether to require HTTPS for all traffic.

## __Application Auto Scaling__
  - ### Features
    - Documentation updates for Application Auto Scaling

# __2.9.12__ __2019-10-02__
## __Amazon Lightsail__
  - ### Features
    - This release adds support for the automatic snapshots add-on for instances and block storage disks.

# __2.9.11__ __2019-10-01__
## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - This release provides support for describe and modify CA certificates.

# __2.9.10__ __2019-09-30__
## __AWS WAF__
  - ### Features
    - Lowering the threshold for Rate Based rule from 2000 to 100.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for creating a Read Replica with Active Directory domain information. This release updates RDS API to indicate whether an OrderableDBInstanceOption supports Kerberos Authentication.

## __AmazonMQ__
  - ### Features
    - Amazon MQ now includes the ability to scale your brokers by changing the host instance type. See the hostInstanceType property of UpdateBrokerInput (https://docs.aws.amazon.com/amazon-mq/latest/api-reference/brokers-broker-id.html#brokers-broker-id-model-updatebrokerinput), and pendingHostInstanceType property of DescribeBrokerOutput (https://docs.aws.amazon.com/amazon-mq/latest/api-reference/brokers-broker-id.html#brokers-broker-id-model-describebrokeroutput).

# __2.9.9__ __2019-09-27__
## __AWS Amplify__
  - ### Features
    - This release adds access logs APIs and artifact APIs for AWS Amplify Console.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Update the pool size for default async future completion executor service. See [#1251](https://github.com/aws/aws-sdk-java-v2/issues/1251), [#994](https://github.com/aws/aws-sdk-java-v2/issues/994)

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) removes FirelensConfiguration from the DescribeTask output during the FireLens public preview.

# __2.9.8__ __2019-09-26__
## __AWS CodePipeline__
  - ### Features
    - Documentation updates for CodePipeline

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release updates the AWS Systems Manager Parameter Store PutParameter and LabelParameterVersion APIs to return the "Tier" of parameter created/updated and the "parameter version" labeled respectively.

# __2.9.7__ __2019-09-25__
## __AWS Database Migration Service__
  - ### Features
    - This release adds a new DeleteConnection API to delete the connection between a replication instance and an endpoint. It also adds an optional S3 setting to specify the precision of any TIMESTAMP column values written to an S3 object file in .parquet format.

## __AWS Global Accelerator__
  - ### Features
    - API Update for AWS Global Accelerator to support for DNS aliasing.

## __Amazon SageMaker Service__
  - ### Features
    - Enable G4D and R5 instances in SageMaker Hosting Services

# __2.9.6__ __2019-09-24__
## __AWS Comprehend Medical__
  - ### Features
    - Use Amazon Comprehend Medical to analyze medical text stored in the specified Amazon S3 bucket. Use the console to create and manage batch analysis jobs, or use the batch APIs to detect both medical entities and protected health information (PHI). The batch APIs start, stop, list, and retrieve information about batch analysis jobs. This release also includes DetectEntitiesV2 operation which returns the Acuity and Direction entities as attributes instead of types.

## __AWS DataSync__
  - ### Features
    - Added S3StorageClass, OverwriteMode sync option, and ONLY_FILES_TRANSFERRED setting for the VerifyMode sync option.

## __Amazon Transcribe Service__
  - ### Features
    - With this update Amazon Transcribe enables you to provide an AWS KMS key to encrypt your transcription output.

# __2.9.5__ __2019-09-23__
## __AWS RDS DataService__
  - ### Features
    - RDS Data API now supports Amazon Aurora Serverless PostgreSQL databases.

## __Amazon Redshift__
  - ### Features
    - Adds API operation DescribeNodeConfigurationOptions and associated data structures.

# __2.9.4__ __2019-09-20__
## __AWS Greengrass__
  - ### Features
    - Greengrass OTA service now returns the updated software version in the PlatformSoftwareVersion parameter of a CreateSoftwareUpdateJob response

## __Amazon Elastic Compute Cloud__
  - ### Features
    - G4 instances are Amazon EC2 instances based on NVIDIA T4 GPUs and are designed to provide cost-effective machine learning inference for applications, like image classification, object detection, recommender systems, automated speech recognition, and language translation. G4 instances are also a cost-effective platform for building and running graphics-intensive applications, such as remote graphics workstations, video transcoding, photo-realistic design, and game streaming in the cloud. To get started with G4 instances visit https://aws.amazon.com/ec2/instance-types/g4.

## __Amazon Relational Database Service__
  - ### Features
    - Add a new LeaseID output field to DescribeReservedDBInstances, which shows the unique identifier for the lease associated with the reserved DB instance. AWS Support might request the lease ID for an issue related to a reserved DB instance.

## __Amazon WorkSpaces__
  - ### Features
    - Adds the WorkSpaces restore feature

# __2.9.3__ __2019-09-19__
## __AWS Glue__
  - ### Features
    - AWS Glue DevEndpoints now supports GlueVersion, enabling you to choose Apache Spark 2.4.3 (in addition to Apache Spark 2.2.1). In addition to supporting the latest version of Spark, you will also have the ability to choose between Python 2 and Python 3.

## __AWS MediaConnect__
  - ### Features
    - When you grant an entitlement, you can now specify the percentage of the entitlement data transfer that you want the subscriber to be responsible for.

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces support for container image manifest digests. This enables you to identify all tasks launched using a container image pulled from ECR in order to correlate what was built with where it is running.

# __2.9.2__ __2019-09-18__
## __AWS Resource Access Manager__
  - ### Features
    - AWS RAM provides a new ListPendingInvitationResources API action that lists the resources in a resource share that is shared with you but that the invitation is still pending for

## __AWS WAF Regional__
  - ### Features
    - Lowering the threshold for Rate Based rule from 2000 to 100.

## __Amazon API Gateway__
  - ### Features
    - Amazon API Gateway simplifies accessing PRIVATE APIs by allowing you to associate one or more Amazon Virtual Private Cloud (VPC) Endpoints to a private API. API Gateway will create and manage DNS alias records necessary for easily invoking the private APIs. With this feature, you can leverage private APIs in web applications hosted within your VPCs.

# __2.9.1__ __2019-09-17__
## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for iam

## __Amazon Athena__
  - ### Features
    - This release adds DataManifestLocation field indicating the location and file name of the data manifest file. Users can get a list of files that the Athena query wrote or intended to write from the manifest file.

## __Amazon Personalize__
  - ### Features
    - [Personalize] Adds trainingHours to solutionVersion properties.

# __2.9.0__ __2019-09-16__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for multi-DRM SPEKE with CMAF outputs, MP3 ingest, and options for improved video quality.

## __AWS SDK for Java v2__
  - ### Features
    - Bump minor version to `2.9.0-SNAPSHOT` because of [#1413](https://github.com/aws/aws-sdk-java-v2/issues/1413).
    - Updating dependencies versions: jackson 2.9.8 -> 2.9.9, slf4j 1.7.35 -> 1.7.38, netty 4.1.39.Final -> 4.1.41.Final (contains the fix for the performance regression in 4.1.39)

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - This release lets customers add tags to an Amazon EKS cluster. These tags can be used to control access to the EKS API for managing the cluster using IAM. The Amazon EKS TagResource API allows customers to associate tags with their cluster. Customers can list tags for a cluster using the ListTagsForResource API and remove tags from a cluster with the UntagResource API. Note: tags are specific to the EKS cluster resource, they do not propagate to other AWS resources used by the cluster.

# __2.8.7__ __2019-09-12__
## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports High Efficiency Video Coding (HEVC) for standard-definition (SD), high-definition (HD), and ultra-high-definition (UHD) encoding with HDR support.Encoding with HEVC offers a number of advantages. While UHD video requires an advanced codec beyond H.264 (AVC), high frame rate (HFR) or High Dynamic Range (HDR) content in HD also benefit from HEVC's advancements. In addition, benefits can be achieved with HD and SD content even if HDR and HFR are not needed.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Fix for FleetActivityStatus and FleetStateCode enum

## __Amazon WorkMail Message Flow__
  - ### Features
    - This release allows customers to access email messages as they flow to and from Amazon WorkMail.

## __Elastic Load Balancing__
  - ### Features
    - Documentation updates for elasticloadbalancingv2: This release adds support for TLS SNI on Network Load Balancers

# __2.8.6__ __2019-09-11__
## __AWS Config__
  - ### Features
    - Adding input validation for the OrganizationConfigRuleName string.

## __AWS MediaConnect__
  - ### Features
    - This release adds support for the RIST protocol on sources and outputs.

## __AWS Step Functions__
  - ### Features
    - Fixing letter case in Map history event details to be small case

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for new data fields and log format in VPC flow logs.

## __Amazon Relational Database Service__
  - ### Features
    - This release allows customers to specify a custom parameter group when creating a Read Replica, for DB engines which support this feature.

## __Amazon Simple Email Service__
  - ### Features
    - Updated API documentation to correct broken links, and to update content based on customer feedback.

# __2.8.5__ __2019-09-10__
## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix marshalling for models with xml attribute. See [#1182](https://github.com/aws/aws-sdk-java-v2/issues/1182)

## __AWS Storage Gateway__
  - ### Features
    - The CloudWatchLogGroupARN parameter of the UpdateGatewayInformation API allows for configuring the gateway to use a CloudWatch log-group where Storage Gateway health events will be logged.

# __2.8.4__ __2019-09-09__
## __AWS App Mesh__
  - ### Features
    - This release adds support for http retry policies.

## __AWS Marketplace Commerce Analytics__
  - ### Features
    - Add FDP+FPS (monthly_revenue_field_demonstration_usage + monthly_revenue_flexible_payment_schedule) to Marketplace Commerce Analytics Service

## __AWS RoboMaker__
  - ### Features
    - Support for Connectivity to Simulation. When you need to interact with the applications in your simulation job, you can connect to your robot application or simulation application with port forwarding. When you configure port forwarding, traffic will be forwarded from the simulation job port to the application port. Port forwarding makes it easy to connect with tools such as ROS Bridge and other tools. This can be useful when you want to debug or run custom tools to interact with your applications.

## __Amazon AppStream__
  - ### Features
    - IamRoleArn support in CreateFleet, UpdateFleet, CreateImageBuilder APIs

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release expands Site-to-Site VPN tunnel options to allow customers to restrict security algorithms and configure timer settings for VPN connections. Customers can specify these new options while creating new VPN connections, or they can modify the tunnel options on existing connections using a new API.

## __Amazon QLDB__
  - ### Features
    - (New Service) Amazon QLDB is a fully managed ledger database that provides a transparent, immutable, and cryptographically verifiable transaction log owned by a central trusted authority. Amazon QLDB is a new class of serverless database that eliminates the need to engage in the complex development effort of building your own ledger-like applications and it automatically scales to support the demands of your application. Introduces Amazon QLDB API operations needed for managing Amazon QLDB ledgers. This includes the ability to manage Amazon QLDB ledgers, cryptographically verify documents, and export the journal in a ledger.

## __Amazon QLDB Session__
  - ### Features
    - (New Service) Amazon QLDB is a fully managed ledger database that provides a transparent, immutable, and cryptographically verifiable transaction log owned by a central trusted authority. Amazon QLDB is a new class of serverless database that eliminates the need to engage in the complex development effort of building your own ledger-like applications and it automatically scales to support the demands of your application. Introduces Amazon QLDB API operations needed for interacting with data in Amazon QLDB ledgers.

# __2.8.3__ __2019-09-06__
## __Amazon Kinesis Analytics__
  - ### Features
    - Documentation updates for kinesisanalytics

# __2.8.2__ __2019-09-05__
## __AWS Config__
  - ### Features
    - AWS Config now includes the option for marking RemediationConfigurations as automatic, removing the need to call the StartRemediationExecution API. Manual control over resource execution rate is also included, and RemediationConfigurations are now ARN addressable. Exceptions to exclude account resources from being remediated can be configured with the new PutRemediationExceptions, DescribeRemediationExceptions, and DeleteRemediationExceptions APIs.

# __2.8.1__ __2019-09-04__
## __AWS Step Functions__
  - ### Features
    - Added support for new history events

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Amazon EKS DescribeCluster API returns a new OIDC issuer field that can be used to create OIDC identity provider for IAM for Service Accounts feature.

## __Amazon Transcribe Service__
  - ### Features
    - MediaFormat is now optional for StartTranscriptionJob API.

# __2.8.0__ __2019-09-03__
## __AWS Resource Groups Tagging API__
  - ### Features
    - Documentation updates for resourcegroupstaggingapi

## __AWS SDK for Java v2__
  - ### Features
    - Bump minor version to 2.8.0-SNAPSHOT because of [#1391](https://github.com/aws/aws-sdk-java-v2/issues/1391).
    - Upgrade Netty version to 4.1.39.Final, netty reactive streams version to 2.0.3, netty open ssl version to 2.0.25.Final

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces support for attaching Amazon Elastic Inference accelerators to your containers. This enables you to run deep learning inference workloads with hardware acceleration in a more efficient way.

## __Amazon GameLift__
  - ### Features
    - You can now make use of PKI resources to provide more secure connections between your game clients and servers. To learn more, please refer to the public Amazon GameLift documentation.

# __2.7.36__ __2019-08-30__
## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces support for modifying the cluster settings for existing clusters, which enables you to toggle whether Container Insights is enabled or not. Support is also introduced for custom log routing using the ECS FireLens integration.

## __AmazonApiGatewayManagementApi__
  - ### Features
    - You can use getConnection to return information about the connection (when it is connected, IP address, etc) and deleteConnection to disconnect the given connection

## __AmazonMQ__
  - ### Features
    - Adds support for updating security groups selection of an Amazon MQ broker.

# __2.7.35__ __2019-08-29__
## __AWS CodePipeline__
  - ### Features
    - Introducing pipeline execution trigger details in ListPipelineExecutions API.

## __AWS Lambda__
  - ### Features
    - Adds a "MaximumBatchingWindowInSeconds" parameter to event source mapping api's. Usable by Dynamodb and Kinesis event sources.

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces support for including Docker container IDs in the API response when describing and stopping tasks. This enables customers to easily map containers to the tasks they are associated with.

## __Amazon ElastiCache__
  - ### Features
    - Amazon ElastiCache for Redis now supports encryption at rest using customer managed customer master keys (CMKs) in AWS Key Management Service (KMS). Amazon ElastiCache now supports cluster names upto 40 characters for replicationGoups and upto 50 characters for cacheClusters.

## __Application Auto Scaling__
  - ### Features
    - With the current release, you can suspend and later resume any of the following scaling actions in Application Auto Scaling: scheduled scaling actions, dynamic scaling in actions, dynamic scaling out actions.

# __2.7.34__ __2019-08-28__
## __AWS Elemental MediaConvert__
  - ### Features
    - This release adds the ability to send a job to an on-demand queue while simulating the performance of a job sent to a reserved queue. Use this setting to estimate the number of reserved transcoding slots (RTS) you need for a reserved queue.

## __AWS Global Accelerator__
  - ### Features
    - API Update for AWS Global Accelerator Client IP Preservation

## __Amazon Simple Queue Service__
  - ### Features
    - Added support for message system attributes, which currently lets you send AWS X-Ray trace IDs through Amazon SQS.

# __2.7.33__ __2019-08-27__
## __AWS Organizations__
  - ### Features
    - Documentation updates for organizations

# __2.7.32__ __2019-08-26__
## __AWS SecurityHub__
  - ### Features
    - This release resolves an issue with the DescribeHub action, changes the MasterId and InvitationId parameters for AcceptInvitation to Required, and changes the AccountIds parameter for DeleteInvitations and DeclineInvitations to Required.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This feature adds "default tier" to the AWS Systems Manager Parameter Store for parameter creation and update. AWS customers can now set the "default tier" to one of the following values: Standard (default), Advanced or Intelligent-Tiering. This allows customers to create advanced parameters or parameters in corresponding tiers with one setting rather than code change to specify parameter tiers.

# __2.7.31__ __2019-08-23__
## __AWS Elemental MediaPackage VOD__
  - ### Features
    - Adds optional Constant Initialization Vector (IV) to HLS Encryption for MediaPackage VOD.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release of EC2 VM Import Export adds support for exporting Amazon Machine Image(AMI)s to a VM file

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe - support transcriptions from audio sources in Russian (ru-RU) and Chinese (zh-CN).

# __2.7.30__ __2019-08-22__
## __AWS DataSync__
  - ### Features
    - This release adds support for SMB location type.

## __Amazon Relational Database Service__
  - ### Features
    - This release allows users to enable RDS Data API while creating Aurora Serverless databases.

# __2.7.29__ __2019-08-21__
## __Amazon DynamoDB__
  - ### Features
    - Public preview version of 'dynamodb-enhanced' that has a new DynamoDb mapper library that can be used with the v2 SDK. See README.md in the module for more detailed information about this module.

## __Amazon ElastiCache__
  - ### Features
    - ElastiCache extends support for Scale down for Redis Cluster-mode enabled and disabled replication groups

## __Amazon Forecast Query Service__
  - ### Features
    - Amazon Forecast is a fully managed machine learning service that makes it easy for customers to generate accurate forecasts using their historical time-series data

## __Amazon Forecast Service__
  - ### Features
    - Amazon Forecast is a fully managed machine learning service that makes it easy for customers to generate accurate forecasts using their historical time-series data

## __Amazon Personalize Runtime__
  - ### Features
    - Increased limits on number of items recommended and reranked: The maximum number of results returned from getRecommendations API has been increased to 200. The maximum number of items which can be reranked via getPersonalizedRanking API has been increased to 200.

## __Amazon Rekognition__
  - ### Features
    - Documentation updates for Amazon Rekognition.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker now supports Amazon EFS and Amazon FSx for Lustre file systems as data sources for training machine learning models. Amazon SageMaker now supports running training jobs on ml.p3dn.24xlarge instance type. This instance type is offered as a limited private preview for certain SageMaker customers. If you are interested in joining the private preview, please reach out to the SageMaker Product Management team via AWS Support."

## __Amazon Simple Queue Service__
  - ### Features
    - This release provides a way to add metadata tags to a queue when it is created. You can use tags to organize and identify your Amazon SQS queues for cost allocation.

## __Apache HTTP Client__
  - ### Features
    - Enable TLS client authentication support for the Apache HTTP Client by allowing customers to specify a `TlsKeyManagersProvider` on the builder. The `KeyManger`s provided will be used when the remote server wants to authenticate the client.

## __HTTP Client SPI__
  - ### Features
    - Add `TlsKeyManagersProvider` interface for supporting TLS client auth in HTTP client implementations.

## __Netty NIO HTTP Client__
  - ### Features
    - Add ability to to use HTTP proxies with the Netty async client.

# __2.7.28__ __2019-08-20__
## __AWS Transfer for SFTP__
  - ### Features
    - New field in response of TestIdentityProvider

## __Alexa For Business__
  - ### Features
    - Adding support for optional locale input in CreateProfile and UpdateProfile APIs

## __Amazon AppStream__
  - ### Features
    - Includes API updates to support streaming through VPC endpoints for image builders and stacks.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker introduces Managed Spot Training. Increases the maximum number of metric definitions to 40 for SageMaker Training and Hyperparameter Tuning Jobs. SageMaker Neo adds support for Acer aiSage and Qualcomm QCS605 and QCS603.

# __2.7.27__ __2019-08-19__
## __AWS App Mesh__
  - ### Features
    - Fix for HttpMethod enum

## __AWS Cost and Usage Report Service__
  - ### Features
    - New IAM permission required for editing AWS Cost and Usage Reports - Starting today, you can allow or deny IAM users permission to edit Cost & Usage Reports through the API and the Billing and Cost Management console. To allow users to edit Cost & Usage Reports, ensure that they have 'cur: ModifyReportDefinition' permission. Refer to the technical documentation (https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_cur_ModifyReportDefinition.html) for additional details.

# __2.7.26__ __2019-08-16__
## __AWS RoboMaker__
  - ### Features
    - Two feature release: 1. AWS RoboMaker introduces log-based simulation. Log-based simulation allows you to play back pre-recorded log data such as sensor streams for testing robotic functions like localization, mapping, and object detection. Use the AWS RoboMaker SDK to test your robotic applications. 2. AWS RoboMaker allow customer to setup a robot deployment timeout when CreateDeploymentJob.

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces support for controlling the usage of swap space on a per-container basis for Linux containers.

## __Amazon Elastic MapReduce__
  - ### Features
    - Amazon EMR has introduced an account level configuration called Block Public Access that allows you to block clusters with ports open to traffic from public IP sources (i.e. 0.0.0.0/0 for IPv4 and ::/0 for IPv6) from launching. Individual ports or port ranges can be added as exceptions to allow public access.

# __2.7.25__ __2019-08-15__
## __AWS App Mesh__
  - ### Features
    - This release adds support for http header based routing and route prioritization.

## __AWS CodeCommit__
  - ### Features
    - This release adds an API, BatchGetCommits, that allows retrieval of metadata for multiple commits in an AWS CodeCommit repository.

## __AWS Glue__
  - ### Features
    - GetJobBookmarks API is withdrawn.

## __AWS Storage Gateway__
  - ### Features
    - CreateSnapshotFromVolumeRecoveryPoint API supports new parameter: Tags (to be attached to the created resource)

## __Amazon Athena__
  - ### Features
    - This release adds support for querying S3 Requester Pays buckets. Users can enable this feature through their Workgroup settings.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds an option to use private certificates from AWS Certificate Manager (ACM) to authenticate a Site-to-Site VPN connection's tunnel endpoints and customer gateway device.

# __2.7.24__ __2019-08-14__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds a new API called SendDiagnosticInterrupt, which allows you to send diagnostic interrupts to your EC2 instance.

# __2.7.23__ __2019-08-13__
## __AWS AppSync__
  - ### Features
    - Adds a configuration option for AppSync GraphQL APIs

# __2.7.22__ __2019-08-12__
## __Amazon CloudWatch__
  - ### Features
    - Documentation updates for monitoring

## __Amazon Rekognition__
  - ### Features
    - Adding new Emotion, Fear

## __Application Auto Scaling__
  - ### Features
    - Documentation updates for Application Auto Scaling

## __Auto Scaling__
  - ### Features
    - Amazon EC2 Auto Scaling now supports a new Spot allocation strategy "capacity-optimized" that fulfills your request using Spot Instance pools that are optimally chosen based on the available Spot capacity.

# __2.7.21__ __2019-08-09__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert has added support for multi-DRM SPEKE with CMAF outputs, MP3 ingest, and options for improved video quality.

## __AWS IoT__
  - ### Features
    - This release adds Quality of Service (QoS) support for AWS IoT rules engine republish action.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fixed the issue where ByteArrayAsyncRequestBody can send duplicate requests when another request comes in at the same time the subscription completes.
    - For APIs that support input event streams, set the `Content-Type` to `application/vnd.amazon.eventstream` on the request.

## __Amazon GuardDuty__
  - ### Features
    - New "evidence" field in the finding model to provide evidence information explaining why the finding has been triggered. Currently only threat-intelligence findings have this field. Some documentation updates.

## __Amazon Lex Runtime Service__
  - ### Features
    - Manage Amazon Lex session state using APIs on the client

## __Amazon Redshift__
  - ### Features
    - Add expectedNextSnapshotScheduleTime and expectedNextSnapshotScheduleTimeStatus to redshift cluster object.

# __2.7.20__ __2019-08-08__
## __AWS CodeBuild__
  - ### Features
    - CodeBuild adds CloudFormation support for SourceCredential

## __AWS Glue__
  - ### Features
    - You can now use AWS Glue to find matching records across dataset even without identifiers to join on by using the new FindMatches ML Transform. Find related products, places, suppliers, customers, and more by teaching a custom machine learning transformation that you can use to identify matching matching records as part of your analysis, data cleaning, or master data management project by adding the FindMatches transformation to your Glue ETL Jobs. If your problem is more along the lines of deduplication, you can use the FindMatches in much the same way to identify customers who have signed up more than ones, products that have accidentally been added to your product catalog more than once, and so forth. Using the FindMatches MLTransform, you can teach a Transform your definition of a duplicate through examples, and it will use machine learning to identify other potential duplicates in your dataset. As with data integration, you can then use your new Transform in your deduplication projects by adding the FindMatches transformation to your Glue ETL Jobs. This release also contains additional APIs that support AWS Lake Formation.

## __AWS Lake Formation__
  - ### Features
    - Lake Formation: (New Service) AWS Lake Formation is a fully managed service that makes it easier for customers to build, secure and manage data lakes. AWS Lake Formation simplifies and automates many of the complex manual steps usually required to create data lakes including collecting, cleaning and cataloging data and securely making that data available for analytics and machine learning.

## __AWS OpsWorks CM__
  - ### Features
    - This release adds support for Chef Automate 2 specific engine attributes.

# __2.7.19__ __2019-08-07__
## __Amazon CloudWatch Application Insights__
  - ### Features
    - CloudWatch Application Insights for .NET and SQL Server now provides integration with AWS Systems Manager OpsCenter. This integration allows you to view and resolve problems and operational issues detected for selected applications.

# __2.7.18__ __2019-08-06__
## __AWS Batch__
  - ### Features
    - Documentation updates for AWS Batch

# __2.7.17__ __2019-08-05__
## __AWS DataSync__
  - ### Features
    - Support VPC endpoints.

## __AWS IoT__
  - ### Features
    - In this release, AWS IoT Device Defender introduces audit mitigation actions that can be applied to audit findings to help mitigate security issues.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 now supports a new Spot allocation strategy "Capacity-optimized" that fulfills your request using Spot Instance pools that are optimally chosen based on the available Spot capacity.

# __2.7.16__ __2019-08-02__
## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix the issue where the `content-length` set on the request is not honored for streaming operations.

## __AWS Security Token Service__
  - ### Features
    - Documentation updates for sts

# __2.7.15__ __2019-07-30__
## __AWS Elemental MediaConvert__
  - ### Features
    - MediaConvert adds support for specifying priority (-50 to 50) on jobs submitted to on demand or reserved queues

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fixed the issue where `AsyncResponseHandler#prepare` was not invoked before `#onHeaders`. See [#1343](https://github.com/aws/aws-sdk-java-v2/issues/1343).

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds support for Neural text-to-speech engine.

## __Amazon Route 53__
  - ### Features
    - Amazon Route 53 now supports the Middle East (Bahrain) Region (me-south-1) for latency records, geoproximity records, and private DNS for Amazon VPCs in that region.

# __2.7.14__ __2019-07-29__
## __AWS CodeCommit__
  - ### Features
    - This release supports better exception handling for merges.

## __Netty NIO Http Client__
  - ### Bugfixes
    - Update `HandlerRemovingChannelPool` to only remove per request handlers if the channel is open or registered to avoid the race condition when the DefaultChannelPipeline is trying to removing the handler at the same time, causing `NoSuchElementException`.

# __2.7.13__ __2019-07-26__
## __AWS Batch__
  - ### Features
    - AWS Batch now supports SDK auto-pagination and Job-level docker devices.

## __AWS Cost Explorer Service__
  - ### Features
    - Adds support for resource optimization recommendations.

## __AWS Glue__
  - ### Features
    - This release provides GetJobBookmark and GetJobBookmarks APIs. These APIs enable users to look at specific versions or all versions of the JobBookmark for a specific job. This release also enables resetting the job bookmark to a specific run via an enhancement of the ResetJobBookmark API.

## __AWS Greengrass__
  - ### Features
    - Greengrass OTA service supports openwrt/aarch64 and openwrt/armv7l platforms.

## __AWS MediaConnect__
  - ### Features
    - This release adds support for the Zixi pull protocol on outputs.

## __Amazon CloudWatch Logs__
  - ### Features
    - Allow for specifying multiple log groups in an Insights query, and deprecate storedByte field for LogStreams and interleaved field for FilterLogEventsRequest.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - You can now create EC2 Capacity Reservations using Availability Zone ID or Availability Zone name. You can view usage of Amazon EC2 Capacity Reservations per AWS account.

# __2.7.12__ __2019-07-25__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert has added several features including support for: audio normalization using ITU BS.1770-3, 1770-4 algorithms, extension of job progress indicators, input cropping rectangle & output position rectangle filters per input, and dual SCC caption mapping to additional codecs and containers.

## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive is adding Input Clipping, Immediate Mode Input Switching, and Dynamic Inputs.

## __Amazon EC2 Container Registry__
  - ### Features
    - This release adds support for immutable image tags.

# __2.7.11__ __2019-07-24__
## __AWS Glue__
  - ### Features
    - This release provides GlueVersion option for Job APIs and WorkerType option for DevEndpoint APIs. Job APIs enable users to pick specific GlueVersion for a specific job and pin the job to a specific runtime environment. DevEndpoint APIs enable users to pick different WorkerType for memory intensive workload.

## __AWS Security Token Service__
  - ### Features
    - New STS GetAccessKeyInfo API operation that returns the account identifier for the specified access key ID.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release introduces support for split tunnel with AWS Client VPN, and also adds support for opt-in Regions in DescribeRegions API. In addition, customers can now also tag Launch Templates on creation.

## __Amazon Pinpoint__
  - ### Features
    - This release adds support for programmatic access to many of the same campaign metrics that are displayed on the Amazon Pinpoint console. You can now use the Amazon Pinpoint API to monitor and assess performance data for campaigns, and integrate metrics data with other reporting tools. We update the metrics data continuously, resulting in a data latency timeframe that is limited to approximately two hours.

# __2.7.10__ __2019-07-23__
## __AWS Secrets Manager__
  - ### Features
    - This release increases the maximum allowed size of SecretString or SecretBinary from 7KB to 10KB in the CreateSecret, UpdateSecret, PutSecretValue and GetSecretValue APIs. This release also increases the maximum allowed size of ResourcePolicy from 4KB to 20KB in the GetResourcePolicy and PutResourcePolicy APIs.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - You can now use Maintenance Windows to select a resource group as the target. By selecting a resource group as the target of a Maintenance Window, customers can perform routine tasks across different resources such as Amazon Elastic Compute Cloud (AmazonEC2) instances, Amazon Elastic Block Store (Amazon EBS) volumes, and Amazon Simple Storage Service(Amazon S3) buckets within the same recurring time window.

# __2.7.9__ __2019-07-22__
## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix model builder enum fluent setters to check null before calling `toString` to avoid NPE.

## __AWS Shield__
  - ### Features
    - Adding new VectorType (HTTP_Reflection) and related top contributor types to describe WordPress Pingback DDoS attacks.

## __AmazonMQ__
  - ### Features
    - Adds support for AWS Key Management Service (KMS) to offer server-side encryption. You can now select your own customer managed CMK, or use an AWS managed CMK in your KMS account.

# __2.7.8__ __2019-07-19__
## __AWS IoT Events__
  - ### Features
    - Adds support for IoT Events, Lambda, SQS and Kinesis Firehose actions.

## __Amazon Simple Queue Service__
  - ### Features
    - This release updates the information about the availability of FIFO queues and includes miscellaneous fixes.

# __2.7.7__ __2019-07-18__
## __AWS CodeDeploy__
  - ### Features
    - Documentation updates for codedeploy

## __Amazon Comprehend__
  - ### Features
    - Amazon Comprehend now supports multiple entities for custom entity recognition

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces support for cluster settings. Cluster settings specify whether CloudWatch Container Insights is enabled or disabled for the cluster.

## __Amazon ElastiCache__
  - ### Features
    - Updates for Elasticache

# __2.7.6__ __2019-07-17__
## __AWS Config__
  - ### Features
    - This release adds more granularity to the status of an OrganizationConfigRule by adding a new status. It also adds an exception when organization access is denied.

## __AWS Database Migration Service__
  - ### Features
    - S3 endpoint settings update: 1) Option to append operation column to full-load files. 2) Option to add a commit timestamp column to full-load and cdc files. Updated DescribeAccountAttributes to include UniqueAccountIdentifier.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Notify error by invoking `AsyncResponseTransformer#exceptionOccurred` for streaming operations for services using xml protocol such as S3 when the request fails and is not retriable.

## __Auto Scaling__
  - ### Features
    - Documentation updates for autoscaling

# __2.7.5__ __2019-07-12__
## __AWS Identity and Access Management__
  - ### Features
    - Removed exception that was indicated but never thrown for IAM GetAccessKeyLastUsed API

## __AWS RoboMaker__
  - ### Features
    - Added Melodic as a supported Robot Software Suite Version

## __AWS SDK for Java v2__
  - ### Features
    - Introduce a new method `equalsBySdkFields` to compare only non-inherited fields for model classes.

  - ### Bugfixes
    - Fix `AwsSessionCredentials#equals` to not compare super because the super is an interface.
    - Fix the bug where `equals` and `hashCode` methods in the AWS service request and response classes were not calling super.

## __Amazon Elasticsearch Service__
  - ### Features
    - Amazon Elasticsearch Service now supports M5, C5, and R5 instance types.

## __AmazonApiGatewayV2__
  - ### Features
    - Bug fix (Add tags field to Update Stage , Api and DomainName Responses )

# __2.7.4__ __2019-07-11__
## __Amazon CloudWatch Events__
  - ### Features
    - Adds APIs for partner event sources, partner event buses, and custom event buses. These new features are managed in the EventBridge service.

## __Amazon EventBridge__
  - ### Features
    - Amazon EventBridge is a serverless event bus service that makes it easy to connect your applications with data from a variety of sources, including AWS services, partner applications, and your own applications.

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Fix the issue where the SDK can invoke `channel#read` twice per request and buffer content aggressively before the subscriber is able to consume the data. This should fix [#1122](https://github.com/aws/aws-sdk-java-v2/issues/1122).

# __2.7.3__ __2019-07-10__
## __AWS SDK for Java v2__
  - ### Features
    - Automatically retry on CRC32 checksum validation failures when the service returns a CRC32 checksum that differs from the one the SDK calculated. Previously this would just throw an exception.

## __AWS Service Catalog__
  - ### Features
    - This release adds support for Parameters in ExecuteProvisionedProductServiceAction and adds functionality to get the default parameter values for a Self-Service Action execution against a Provisioned Product via DescribeServiceActionExecutionParameters

## __Amazon Glacier__
  - ### Features
    - Documentation updates for glacier

## __Amazon QuickSight__
  - ### Features
    - Amazon QuickSight now supports embedding dashboards for all non-federated QuickSight users. This includes IAM users, AD users and users from the QuickSight user pool. The get-dashboard-embed-url API accepts QUICKSIGHT as identity type with a user ARN to authenticate the embeddable dashboard viewer as a non-federated user.

# __2.7.2__ __2019-07-09__
## __AWS Amplify__
  - ### Features
    - This release adds webhook APIs and manual deployment APIs for AWS Amplify Console.

## __AWS Config__
  - ### Features
    - AWS Config now supports a new set of APIs to manage AWS Config rules across your organization in AWS Organizations. Using this capability, you can centrally create, update, and delete AWS Config rules across all accounts in your organization. This capability is particularly useful if you have a need to deploy a common set of AWS Config rules across all accounts. You can also specify accounts where AWS Config rules should not be created. In addition, you can use these APIs from the master account in AWS Organizations to enforce governance by ensuring that the underlying AWS Config rules are not modifiable by your organization member accounts.These APIs work for both managed and custom AWS Config rules. For more information, see Enabling AWS Config Rules Across all Accounts in Your Organization in the AWS Config Developer Guide.The new APIs are available in all commercial AWS Regions where AWS Config and AWS Organizations are supported. For the full list of supported Regions, see AWS Regions and Endpoints in the AWS General Reference. To learn more about AWS Config, visit the AWS Config webpage. To learn more about AWS Organizations, visit the AWS Organizations webpage.

## __AWS WAF__
  - ### Features
    - Updated SDK APIs to add tags to WAF Resources: WebACL, Rule, Rulegroup and RateBasedRule. Tags can also be added during creation of these resources.

## __AWS WAF Regional__
  - ### Features
    - Updated SDK APIs to add tags to WAF Resources: WebACL, Rule, Rulegroup and RateBasedRule. Tags can also be added during creation of these resources.

## __Amazon CloudWatch__
  - ### Features
    - This release adds three new APIs (PutAnomalyDetector, DeleteAnomalyDetector, and DescribeAnomalyDetectors) to support the new feature, CloudWatch Anomaly Detection. In addition, PutMetricAlarm and DescribeAlarms APIs are updated to support management of Anomaly Detection based alarms.

## __Amazon Elastic File System__
  - ### Features
    - EFS customers can now enable Lifecycle Management for all file systems. You can also now select from one of four Lifecycle Management policies (14, 30, 60 and 90 days), to automatically move files that have not been accessed for the period of time defined by the policy, from the EFS Standard storage class to the EFS Infrequent Access (IA) storage class. EFS IA provides price/performance that is cost-optimized for files that are not accessed every day.

## __Amazon GameLift__
  - ### Features
    - GameLift FlexMatch now supports matchmaking of up to 200 players per game session, and FlexMatch can now automatically backfill your game sessions whenever there is an open slot.

## __Amazon Kinesis Video Streams__
  - ### Features
    - Add "GET_DASH_STREAMING_SESSION_URL" as an API name to the GetDataEndpoint API.

## __Amazon Kinesis Video Streams Archived Media__
  - ### Features
    - Adds support for the GetDASHStreamingSessionURL API. Also adds support for the Live Replay playback mode of the GetHLSStreamingSessionURL API.

## __Netty NIO HTTP Client__
  - ### Features
    - Improved error messaging when a connection is closed. Fixes [#1260](https://github.com/aws/aws-sdk-java-v2/issues/1260).

# __2.7.1__ __2019-07-08__
## __AWS Cost Explorer Service__
  - ### Features
    - This release introduces a new operation called GetUsageForecast, which allows you to programmatically access AWS Cost Explorer's forecasting engine on usage data (running hours, data transfer, etc).

# __2.7.0__ __2019-07-03__
## __AWS SDK for Java v2__
  - ### Features
    - Update Apache http client version to `4.5.9`.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - AssignPrivateIpAddresses response includes two new fields: AssignedPrivateIpAddresses, NetworkInterfaceId

## __Amazon Relational Database Service__
  - ### Features
    - This release supports Cross-Account Cloning for Amazon Aurora clusters.

## __Amazon Simple Storage Service__
  - ### Features
    - Add S3 x-amz-server-side-encryption-context support.

## __Amazon Simple Workflow Service__
  - ### Features
    - This release adds APIs that allow adding and removing tags to a SWF domain, and viewing tags for a domain. It also enables adding tags when creating a domain.

## __Apache Http Client__
  - ### Bugfixes
    - Disable apache normalization to handle breaking change introduced in apache httpclient `4.5.7`. See [aws/aws-sdk-java[#1919](https://github.com/aws/aws-sdk-java-v2/issues/1919)](https://github.com/aws/aws-sdk-java/issues/1919) for more information.

# __2.6.5__ __2019-07-02__
## __AWS Elemental MediaStore__
  - ### Features
    - This release adds support for tagging, untagging, and listing tags for AWS Elemental MediaStore containers.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix a bug in `FileAsyncResponseTransformer` that causes the future from `prepare()` to not be completed if `onError` is called on its `Subscriber` wile consuming the response stream. Fixes [#1279](https://github.com/aws/aws-sdk-java-v2/issues/1279)

## __Amazon AppStream__
  - ### Features
    - Adding ImageBuilderName in Fleet API and Documentation updates for AppStream.

# __2.6.4__ __2019-07-01__
## __AWS Organizations__
  - ### Features
    - Specifying the tag key and tag value is required for tagging requests.

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - This release provides support for cluster delete protection and the ability to stop and start clusters.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for specifying a maximum hourly price for all On-Demand and Spot instances in both Spot Fleet and EC2 Fleet.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for RDS DB Cluster major version upgrade

# __2.6.3__ __2019-06-28__
## __Alexa For Business__
  - ### Features
    - This release allows developers and customers to add SIP addresses and international phone numbers to contacts.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - You can now launch 8xlarge and 16xlarge instance sizes on the general purpose M5 and memory optimized R5 instance types.

## __Amazon Redshift__
  - ### Features
    - ClusterAvailabilityStatus: The availability status of the cluster for queries. Possible values are the following: Available, Unavailable, Maintenance, Modifying, Failed.

## __Amazon S3__
  - ### Bugfixes
    - Update `ChecksumCalculatingStreamProvider` to comply with `ContentStreamProvider` contract.

## __Amazon WorkSpaces__
  - ### Features
    - Minor API fixes for WorkSpaces.

# __2.6.2__ __2019-06-27__
## __AWS Direct Connect__
  - ### Features
    - Tags will now be included in the API responses of all supported resources (Virtual interfaces, Connections, Interconnects and LAGs). You can also add tags while creating these resources.

## __AWS EC2 Instance Connect__
  - ### Features
    - Amazon EC2 Instance Connect is a simple and secure way to connect to your instances using Secure Shell (SSH). With EC2 Instance Connect, you can control SSH access to your instances using AWS Identity and Access Management (IAM) policies as well as audit connection requests with AWS CloudTrail events. In addition, you can leverage your existing SSH keys or further enhance your security posture by generating one-time use SSH keys each time an authorized user connects.

## __Amazon Pinpoint__
  - ### Features
    - This release includes editorial updates for the Amazon Pinpoint API documentation.

## __Amazon WorkSpaces__
  - ### Features
    - Added support for the WorkSpaces restore feature and copying WorkSpaces Images across AWS Regions.

# __2.6.1__ __2019-06-26__
## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fixed issue where specifying a custom presigning time causes a runtime exception.

## __Amazon DynamoDB__
  - ### Features
    - Documentation updates for dynamodb

# __2.6.0__ __2019-06-26__
## __AWS CodeCommit__
  - ### Features
    - This release supports better exception handling for merges.

## __Amazon S3__
  - ### Bugfixes
    - Modify the types of Part#size and ObjectVersion#size from Integer to Long. This is a breaking change for customers who are using the size() method.

## __AmazonApiGatewayV2__
  - ### Features
    - You can now perform tag operations on ApiGatewayV2 Resources (typically associated with WebSocket APIs)

## __Netty NIO Http Client__
  - ### Bugfixes
    - Completes the response normally when subscription is cancelled from the subscriber and not invoke `SdkAsyncHttpResponseHandler#onError` from the publisher.

# __2.5.71__ __2019-06-25__
## __AWS SDK for Java v2__
  - ### Bugfixes
    - Only allows a single execution interceptor with the same class name to be included in loaded execution interceptors.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Starting today, you can use Traffic Mirroring to copy network traffic from an elastic network interface of Amazon EC2 instances and then send it to out-of-band security and monitoring appliances for content inspection, threat monitoring, and troubleshooting. These appliances can be deployed as individual instances, or as a fleet of instances behind a Network Load Balancer with a User Datagram Protocol (UDP) listener. Traffic Mirroring supports filters and packet truncation, so that you only extract the traffic of interest to monitor by using monitoring tools of your choice.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Changing Amazon EKS full service name to Amazon Elastic Kubernetes Service.

## __Amazon S3__
  - ### Bugfixes
    - Fixes [#1196](https://github.com/aws/aws-sdk-java-v2/issues/1196) by changing S3 FilterRule enums to correctly model each enum as capitalized

# __2.5.70__ __2019-06-24__
## __AWS Resource Groups Tagging API__
  - ### Features
    - Updated service APIs and documentation.

## __AWS SecurityHub__
  - ### Features
    - This release includes a new Tags parameter for the EnableSecurityHub operation, and the following new operations: DescribeHub, CreateActionTarget, DeleteActionTarget, DescribeActionTargets, UpdateActionTarget, TagResource, UntagResource, and ListTagsforResource. It removes the operation ListProductSubscribers, and makes Title and Description required attributes of AwsSecurityFinding.

## __Amazon API Gateway__
  - ### Features
    - Customers can pick different security policies (TLS version + cipher suite) for custom domains in API Gateway

## __Amazon CloudWatch Application Insights__
  - ### Features
    - CloudWatch Application Insights detects errors and exceptions from logs, including .NET custom application logs, SQL Server logs, IIS logs, and more, and uses a combination of built-in rules and machine learning, such as dynamic baselining, to identify common problems. You can then easily drill into specific issues with CloudWatch Automatic Dashboards that are dynamically generated. These dashboards contain the most recent alarms, a summary of relevant metrics, and log snippets to help you identify root cause.

## __Amazon FSx__
  - ### Features
    - Starting today, you can join your Amazon FSx for Windows File Server file systems to your organization's self-managed Microsoft Active Directory while creating the file system. You can also perform in-place updates of file systems to keep your Active Directory configuration up to date.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - AWS Systems Manager now supports deleting a specific version of a SSM Document.

## __AmazonApiGatewayV2__
  - ### Features
    - Customers can get information about security policies set on custom domain resources in API Gateway

## __Elastic Load Balancing__
  - ### Features
    - This release adds support for UDP on Network Load Balancers

## __Service Quotas__
  - ### Features
    - Service Quotas enables you to view and manage your quotas for AWS services from a central location.

# __2.5.69__ __2019-06-21__
## __AWS Device Farm__
  - ### Features
    - This release includes updated documentation about the default timeout value for test runs and remote access sessions. This release also includes miscellaneous bug fixes for the documentation.

## __AWS Elemental MediaPackage__
  - ### Features
    - Added two new origin endpoint fields for configuring which SCTE-35 messages are treated as advertisements.

## __AWS Identity and Access Management__
  - ### Features
    - We are making it easier for you to manage your permission guardrails i.e. service control policies by enabling you to retrieve the last timestamp when an AWS service was accessed within an account or AWS Organizations entity.

## __Amazon Kinesis Video Streams Media__
  - ### Features
    - Documentation updates for Amazon Kinesis Video Streams.

# __2.5.68__ __2019-06-20__
## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - ACM Private CA is launching Root CAs and hierarchy management, a new feature that expands the scope of ACM Private CA from supporting only subordinate issuing CAs, to now include a full CA hierarchy that includes root CAs - the cryptographic root of trust for an organization.

## __AWS Glue__
  - ### Features
    - Starting today, you can now use workflows in AWS Glue to author directed acyclic graphs (DAGs) of Glue triggers, crawlers and jobs. Workflows enable orchestration of your ETL workloads by building dependencies between Glue entities (triggers, crawlers and jobs). You can visually track status of the different nodes in the workflows on the console making it easier to monitor progress and troubleshoot issues. Also, you can share parameters across entities in the workflow.

## __AWS Health APIs and Notifications__
  - ### Features
    - API improvements for the AWS Health service.

## __AWS IoT Events Data__
  - ### Features
    - "The colon character ':' is now permitted in Detector Model 'key' parameter values.

## __AWS OpsWorks__
  - ### Features
    - Documentation updates for OpsWorks Stacks.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for RDS storage autoscaling

# __2.5.67__ __2019-06-19__
## __Amazon Elastic Container Service for Kubernetes__
  - ### Features
    - Changing Amazon EKS full service name to Amazon Elastic Kubernetes Service.

# __2.5.66__ __2019-06-18__
## __AWS Resource Groups Tagging API__
  - ### Features
    - You can use tag policies to help standardize on tags across your organization's resources.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - You can now launch new 12xlarge, 24xlarge, and metal instance sizes on the Amazon EC2 compute optimized C5 instance types featuring 2nd Gen Intel Xeon Scalable Processors.

# __2.5.65__ __2019-06-17__
## __AWS RoboMaker__
  - ### Features
    - Add the ServiceUnavailableException (503) into CreateSimulationJob API.

## __AWS Service Catalog__
  - ### Features
    - Restrict concurrent calls by a single customer account for CreatePortfolioShare and DeletePortfolioShare when sharing/unsharing to an Organization.

## __Amazon Neptune__
  - ### Features
    - This release adds a feature to configure Amazon Neptune to publish audit logs to Amazon CloudWatch Logs.

# __2.5.64__ __2019-06-14__
## __Amazon AppStream__
  - ### Features
    - Added 2 new values(WINDOWS_SERVER_2016, WINDOWS_SERVER_2019) for PlatformType enum.

## __Amazon CloudFront__
  - ### Features
    - A new datatype in the CloudFront API, AliasICPRecordal, provides the ICP recordal status for CNAMEs associated with distributions. AWS services in China customers must file for an Internet Content Provider (ICP) recordal if they want to serve content publicly on an alternate domain name, also known as a CNAME, that they have added to CloudFront. The status value is returned in the CloudFront response; you cannot configure it yourself. The status is set to APPROVED for all CNAMEs (aliases) in regions outside of China.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Correction to enumerations in EC2 client.

## __Amazon Personalize__
  - ### Features
    - Documentation updates for Amazon Personalize.

# __2.5.63__ __2019-06-13__
## __AWS App Mesh__
  - ### Features
    - This release adds support for AWS Cloud Map as a service discovery method for virtual nodes.

## __Amazon ElastiCache__
  - ### Features
    - This release is to add support for reader endpoint for cluster-mode disabled Amazon ElastiCache for Redis clusters.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - G4 instances are Amazon EC2 instances based on NVIDIA T4 GPUs and are designed to provide cost-effective machine learning inference for applications, like image classification, object detection, recommender systems, automated speech recognition, and language translation. G4 instances are also a cost-effective platform for building and running graphics-intensive applications, such as remote graphics workstations, video transcoding, photo-realistic design, and game streaming in the cloud. To get started with G4 instances visit https://aws.amazon.com/ec2/instance-types/g4.

## __Amazon GuardDuty__
  - ### Features
    - Support for tagging functionality in Create and Get operations for Detector, IP Set, Threat Intel Set, and Finding Filter resources and 3 new tagging APIs: ListTagsForResource, TagResource, and UntagResource.

# __2.5.62__ __2019-06-12__
## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix a bug in the code generator causing event headers to be incorrectly marshalled and unmarshalled to and from the payload.

## __AWS Service Catalog__
  - ### Features
    - This release adds a new field named Guidance to update provisioning artifact, this field can be set by the administrator to provide guidance to end users about which provisioning artifacts to use.

# __2.5.61__ __2019-06-11__
## __Amazon SageMaker Service__
  - ### Features
    - The default TaskTimeLimitInSeconds of labeling job is increased to 8 hours. Batch Transform introduces a new DataProcessing field which supports input and output filtering and data joining. Training job increases the max allowed input channels from 8 to 20.

# __2.5.60__ __2019-06-10__
## __AWS CodeBuild__
  - ### Features
    - AWS CodeBuild adds support for source version on project level.

## __AWS CodeCommit__
  - ### Features
    - This release adds two merge strategies for merging pull requests: squash and three-way. It also adds functionality for resolving merge conflicts, testing merge outcomes, and for merging branches using one of the three supported merge strategies.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix NPE for streaming APIs in async client if there is a failure before AsyncResponseTransformer#prepare is called for first time. See https://github.com/aws/aws-sdk-java-v2/issues/1268

## __Amazon Personalize__
  - ### Features
    - Amazon Personalize is a machine learning service that makes it easy for developers to create individualized recommendations for customers using their applications.

## __Amazon Personalize Events__
  - ### Features
    - Introducing Amazon Personalize - a machine learning service that makes it easy for developers to create individualized recommendations for customers using their applications.

## __Amazon Personalize Runtime__
  - ### Features
    - Amazon Personalize is a machine learning service that makes it easy for developers to create individualized recommendations for customers using their applications.

# __2.5.59__ __2019-06-07__
## __AWS SDK for Java v2__
  - ### Bugfixes
    - Allow customers to disable read and write timeout by setting `Duration.ZERO` to `readTimeout` and `writeTimeout`. See [#1281](https://github.com/aws/aws-sdk-java-v2/issues/1281)

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds DNS entries and NLB ARNs to describe-vpc-endpoint-connections API response. Adds owner ID to describe-vpc-endpoints and create-vpc-endpoint API responses.

# __2.5.58__ __2019-06-06__
## __AWS MediaConnect__
  - ### Features
    - This release adds support for encrypting entitlements using Secure Packager and Encoder Key Exchange (SPEKE).

## __AWS Organizations__
  - ### Features
    - You can tag and untag accounts in your organization and view tags on an account in your organization.

## __Amazon CloudWatch Logs__
  - ### Features
    - Documentation updates for logs

## __Amazon DynamoDB__
  - ### Features
    - Documentation updates for dynamodb

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces support for launching container instances using supported Amazon EC2 instance types that have increased elastic network interface density. Using these instance types and opting in to the awsvpcTrunking account setting provides increased elastic network interface (ENI) density on newly launched container instances which allows you to place more tasks on each container instance.

## __Amazon GuardDuty__
  - ### Features
    - Improve FindingCriteria Condition field names, support long-typed conditions and deprecate old Condition field names.

## __Amazon Simple Email Service__
  - ### Features
    - You can now specify whether the Amazon Simple Email Service must deliver email over a connection that is encrypted using Transport Layer Security (TLS).

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - OpsCenter is a new Systems Manager capability that allows you to view, diagnose, and remediate, operational issues, aka OpsItems, related to various AWS resources by bringing together contextually relevant investigation information. New APIs to create, update, describe, and get OpsItems as well as OpsItems summary API.

# __2.5.57__ __2019-06-05__
## __AWS Glue__
  - ### Features
    - Support specifying python version for Python shell jobs. A new parameter PythonVersion is added to the JobCommand data type.

# __2.5.56__ __2019-06-04__
## __AWS Identity and Access Management__
  - ### Features
    - This release adds validation for policy path field. This field is now restricted to be max 512 characters.

## __AWS Storage Gateway__
  - ### Features
    - AWS Storage Gateway now supports AWS PrivateLink, enabling you to administer and use gateways without needing to use public IP addresses or a NAT/Internet Gateway, while avoiding traffic from going over the internet.

## __Amazon ElastiCache__
  - ### Features
    - Amazon ElastiCache now allows you to apply available service updates on demand. Features included: (1) Access to the list of applicable service updates and their priorities. (2) Service update monitoring and regular status updates. (3) Recommended apply-by-dates for scheduling the service updates, which is critical if your cluster is in ElastiCache-supported compliance programs. (4) Ability to stop and later re-apply updates. For more information, see https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Self-Service-Updates.html

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for Host Recovery feature which automatically restarts instances on to a new replacement host if failures are detected on Dedicated Host.

## __Amazon Simple Storage Service__
  - ### Features
    - Documentation updates for s3

# __2.5.55__ __2019-06-03__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 I3en instances are the new storage-optimized instances offering up to 60 TB NVMe SSD instance storage and up to 100 Gbps of network bandwidth.

## __Amazon Relational Database Service__
  - ### Features
    - Amazon RDS Data API is generally available. Removing beta notes in the documentation.

# __2.5.54__ __2019-05-30__
## __AWS CodeCommit__
  - ### Features
    - This release adds APIs that allow adding and removing tags to a repository, and viewing tags for a repository. It also enables adding tags when creating a repository.

## __AWS IoT Analytics__
  - ### Features
    - IoT Analytics adds the option to use your own S3 bucket to store channel and data store resources. Previously, only service-managed storage was used.

## __AWS IoT Events__
  - ### Features
    - The AWS IoT Events service allows customers to monitor their IoT devices and sensors to detect failures or changes in operation and to trigger actions when these events occur

## __AWS IoT Events Data__
  - ### Features
    - The AWS IoT Events service allows customers to monitor their IoT devices and sensors to detect failures or changes in operation and to trigger actions when these events occur

## __AWS RDS DataService__
  - ### Features
    - The RDS Data API is generally available for the MySQL-compatible edition of Amazon Aurora Serverless in the US East (N. Virginia and Ohio), US West (Oregon), EU (Ireland), and Asia Pacific (Tokyo) regions. This service enables you to easily access Aurora Serverless clusters with web services-based applications including AWS Lambda and AWS AppSync. The new APIs included in this SDK release are ExecuteStatement, BatchExecuteStatement, BeginTransaction, CommitTransaction, and RollbackTransaction. The ExecuteSql API is deprecated; instead use ExecuteStatement which provides additional functionality including transaction support.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Improved exception messages in credential providers to exclude detailed parse errors that may contain sensitive information.

## __AWS Service Catalog__
  - ### Features
    - Service Catalog ListStackInstancesForProvisionedProduct API enables customers to get details of a provisioned product with type "CFN_STACKSET". By passing the provisioned product id, the API will list account, region and status of each stack instances that are associated with this provisioned product.

## __Amazon Pinpoint Email Service__
  - ### Features
    - You can now specify whether the Amazon Pinpoint Email service must deliver email over a connection that is encrypted using Transport Layer Security (TLS).

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for Activity Streams for database clusters.

## __Managed Streaming for Kafka__
  - ### Features
    - Updated APIs for Amazon MSK to enable new features such as encryption in transit, client authentication, and scaling storage.

# __2.5.53__ __2019-05-29__
## __AWS IoT Things Graph__
  - ### Features
    - Initial release.

## __AWS SecurityHub__
  - ### Features
    - This update adds the ListProductSubscribers API, DescribeProducts API, removes CONTAINS as a comparison value for the StringFilter, and only allows use of EQUALS instead of CONTAINS in MapFilter.

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Customers can now simultaneously take snapshots of multiple EBS volumes attached to an EC2 instance. With this new capability, snapshots guarantee crash-consistency across multiple volumes by preserving the order of IO operations. This new feature is fully integrated with Amazon Data Lifecycle Manager (DLM) allowing customers to automatically manage snapshots by creating lifecycle policies.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Customers can now simultaneously take snapshots of multiple EBS volumes attached to an EC2 instance. With this new capability, snapshots guarantee crash-consistency across multiple volumes by preserving the order of IO operations. This new feature is fully integrated with Amazon Data Lifecycle Manager (DLM) allowing customers to automatically manage snapshots by creating lifecycle policies.

## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for rds

## __Amazon S3__
  - ### Bugfixes
    - Allows S3 to be used with object keys that have a leading slash "/myKey"

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Systems Manager - Documentation updates

# __2.5.52__ __2019-05-28__
## __AWS Ground Station__
  - ### Features
    - AWS Ground Station is a fully managed service that enables you to control satellite communications, downlink and process satellite data, and scale your satellite operations efficiently and cost-effectively without having to build or manage your own ground station infrastructure.

## __AWS RoboMaker__
  - ### Features
    - Added support for an additional robot software suite (Gazebo 9) and for cancelling deployment jobs.

## __AWS Security Token Service__
  - ### Features
    - Documentation updates for iam

## __AWS Storage Gateway__
  - ### Features
    - Introduce AssignTapePool operation to allow customers to migrate tapes between pools.

## __AWS WAF__
  - ### Features
    - Documentation updates for waf

## __Amazon Chime__
  - ### Features
    - This release adds the ability to search and order toll free phone numbers for Voice Connectors.

## __Amazon Pinpoint Email Service__
  - ### Features
    - This release adds support for programmatic access to Deliverability dashboard subscriptions and the deliverability data provided by the Deliverability dashboard for domains and IP addresses. The data includes placement metrics for campaigns that use subscribed domains to send email.

## __Amazon Relational Database Service__
  - ### Features
    - Add a new output field Status to DBEngineVersion which shows the status of the engine version (either available or deprecated). Add a new parameter IncludeAll to DescribeDBEngineVersions to make it possible to return both available and deprecated engine versions. These changes enable a user to create a Read Replica of an DB instance on a deprecated engine version.

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe - support transcriptions from audio sources in Modern Standard Arabic (ar-SA).

# __2.5.51__ __2019-05-24__
## __AWS CodeDeploy__
  - ### Features
    - AWS CodeDeploy now supports tagging for the application and deployment group resources.

## __AWS Elemental MediaStore Data Plane__
  - ### Features
    - MediaStore - This release adds support for chunked transfer of objects, which reduces latency by making an object available for downloading while it is still being uploaded.

## __AWS OpsWorks for Chef Automate__
  - ### Features
    - Documentation updates for OpsWorks for Chef Automate; attribute values updated for Chef Automate 2.0 release.

# __2.5.50__ __2019-05-23__
## __AWS SDK for Java v2__
  - ### Bugfixes
    - Updated aws-java-sdk and bom modules to include ALL service modules.

## __AWS WAF Regional__
  - ### Features
    - Documentation updates for waf-regional

## __Amazon Elastic Compute Cloud__
  - ### Features
    - New APIs to enable EBS encryption by default feature. Once EBS encryption by default is enabled in a region within the account, all new EBS volumes and snapshot copies are always encrypted

# __2.5.49__ __2019-05-22__
## __AWS Budgets__
  - ### Features
    - Added new datatype PlannedBudgetLimits to Budget model, and updated examples for AWS Budgets API for UpdateBudget, CreateBudget, DescribeBudget, and DescribeBudgets

## __AWS Device Farm__
  - ### Features
    - This release introduces support for tagging, tag-based access control, and resource-based access control.

## __AWS Service Catalog__
  - ### Features
    - Service Catalog UpdateProvisionedProductProperties API enables customers to manage provisioned product ownership. Administrators can now update the user associated to a provisioned product to another user within the same account allowing the new user to describe, update, terminate and execute service actions in that Service Catalog resource. New owner will also be able to list and describe all past records executed for that provisioned product.

## __Amazon API Gateway__
  - ### Features
    - This release adds support for tagging of Amazon API Gateway resources.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds idempotency support for associate, create route and authorization APIs for AWS Client VPN Endpoints.

## __Amazon Elastic File System__
  - ### Features
    - AWS EFS documentation updated to reflect the minimum required value for ProvisionedThroughputInMibps is 1 from the previously documented 0. The service has always required a minimum value of 1, therefor service behavior is not changed.

## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for rds

## __Amazon WorkLink__
  - ### Features
    - Amazon WorkLink is a fully managed, cloud-based service that enables secure, one-click access to internal websites and web apps from mobile phones. This release introduces new APIs to associate and manage website authorization providers with Amazon WorkLink fleets.

# __2.5.48__ __2019-05-21__
## __AWS DataSync__
  - ### Features
    - Documentation update and refine pagination token on Datasync List API's

## __Alexa For Business__
  - ### Features
    - This release contains API changes to allow customers to create and manage Network Profiles for their Shared devices

# __2.5.47__ __2019-05-20__
## __AWS Elemental MediaPackage VOD__
  - ### Features
    - AWS Elemental MediaPackage now supports Video-on-Demand (VOD) workflows. These new features allow you to easily deliver a vast library of source video Assets stored in your own S3 buckets using a small set of simple to set up Packaging Configurations and Packaging Groups.

## __AWSMarketplace Metering__
  - ### Features
    - Documentation updates for meteringmarketplace

## __Managed Streaming for Kafka__
  - ### Features
    - Updated APIs for the Managed Streaming for Kafka service that let customers create clusters with custom Kafka configuration.

# __2.5.46__ __2019-05-17__
## __Amazon AppStream__
  - ### Features
    - Includes APIs for managing subscriptions to AppStream 2.0 usage reports and configuring idle disconnect timeouts on AppStream 2.0 fleets.

# __2.5.45__ __2019-05-16__
## __AWS Elemental MediaLive__
  - ### Features
    - Added channel state waiters to MediaLive.

## __Amazon Simple Storage Service__
  - ### Features
    - This release updates the Amazon S3 PUT Bucket replication API to include a new optional field named token, which allows you to add a replication configuration to an S3 bucket that has Object Lock enabled.

# __2.5.44__ __2019-05-15__
## __AWS CodePipeline__
  - ### Features
    - This feature includes new APIs to add, edit, remove and view tags for pipeline, custom action type and webhook resources. You can also add tags while creating these resources.

## __AWS Elemental MediaPackage__
  - ### Features
    - Adds optional configuration for DASH SegmentTemplateFormat to refer to segments by Number with Duration, rather than Number or Time with SegmentTimeline.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix a bug in `EventStreamAsyncResponseTransformer` where the reference to the current stream `Subscriber` is not reset in `prepare`, causing an `IllegalStateException` to be thrown when attemping to subscribe to the event stream upon a retry.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adding tagging support for VPC Endpoints and VPC Endpoint Services.

## __Amazon Relational Database Service__
  - ### Features
    - In the RDS API and CLI documentation, corrections to the descriptions for Boolean parameters to avoid references to TRUE and FALSE. The RDS CLI does not allow TRUE and FALSE values values for Boolean parameters.

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe - support transcriptions from audio sources in Indian English (en-IN) and Hindi (hi-IN).

# __2.5.43__ __2019-05-14__
## __AWS Storage Gateway__
  - ### Features
    - Add Tags parameter to CreateSnapshot and UpdateSnapshotSchedule APIs, used for creating tags on create for one off snapshots and scheduled snapshots.

## __Amazon Chime__
  - ### Features
    - Amazon Chime private bots GA release.

## __Amazon Comprehend__
  - ### Features
    - With this release AWS Comprehend now supports Virtual Private Cloud for Asynchronous Batch Processing jobs

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Pagination support for ec2.DescribeSubnets, ec2.DescribeDhcpOptions

# __2.5.42__ __2019-05-13__
## __AWS DataSync__
  - ### Features
    - AWS DataSync now enables exclude and include filters to control what files and directories will be copied as part of a task execution.

## __AWS IoT Analytics__
  - ### Features
    - ContentDeliveryRule to support sending dataset to S3 and glue

## __AWS Lambda__
  - ### Features
    - AWS Lambda now supports Node.js v10

# __2.5.41__ __2019-05-10__
## __AWS Glue__
  - ### Features
    - AWS Glue now supports specifying existing catalog tables for a crawler to examine as a data source. A new parameter CatalogTargets is added to the CrawlerTargets data type.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix a bug where events in an event stream were being signed with the request date, and not with the current system time.

## __AWS Security Token Service__
  - ### Features
    - AWS Security Token Service (STS) now supports passing IAM Managed Policy ARNs as session policies when you programmatically create temporary sessions for a role or federated user. The Managed Policy ARNs can be passed via the PolicyArns parameter, which is now available in the AssumeRole, AssumeRoleWithWebIdentity, AssumeRoleWithSAML, and GetFederationToken APIs. The session policies referenced by the PolicyArn parameter will only further restrict the existing permissions of an IAM User or Role for individual sessions.

# __2.5.40__ __2019-05-08__
## __AWS IoT 1-Click Projects Service__
  - ### Features
    - Added automatic pagination support for ListProjects and ListPlacements APIs.

## __AWS Service Catalog__
  - ### Features
    - Adds "Parameters" field in UpdateConstraint API, which will allow Admin user to update "Parameters" in created Constraints.

## __Amazon Elastic Container Service for Kubernetes__
  - ### Features
    - Documentation update for Amazon EKS to clarify allowed parameters in update-cluster-config.

## __Amazon Kinesis Analytics__
  - ### Features
    - Kinesis Data Analytics APIs now support tagging on applications.

## __Amazon SageMaker Service__
  - ### Features
    - Workteams now supports notification configurations. Neo now supports Jetson Nano as a target device and NumberOfHumanWorkersPerDataObject is now included in the ListLabelingJobsForWorkteam response.

# __2.5.39__ __2019-05-07__
## __AWS AppSync__
  - ### Features
    - AWS AppSync now supports the ability to add additional authentication providers to your AWS AppSync GraphQL API as well as the ability to retrieve directives configured against fields or object type definitions during schema introspection.

## __AWS Storage Gateway__
  - ### Features
    - Add optional field AdminUserList to CreateSMBFileShare and UpdateSMBFileShare APIs.

## __Alexa For Business__
  - ### Features
    - This release adds an API allowing authorized users to delete a shared device's history of voice recordings and associated response data.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Patch Manager adds support for Microsoft Application Patching.

# __2.5.38__ __2019-05-06__
## __AWS CodePipeline__
  - ### Features
    - Documentation updates for codepipeline

## __AWS Config__
  - ### Features
    - AWS Config now supports tagging on PutConfigRule, PutConfigurationAggregator and PutAggregationAuthorization APIs.

## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for iam

## __AWS Security Token Service__
  - ### Features
    - Documentation updates for sts

# __2.5.37__ __2019-05-03__
## __AWS Elemental MediaConvert__
  - ### Features
    - DASH output groups using DRM encryption can now enable a playback device compatibility mode to correct problems with playback on older devices.

## __AWS Elemental MediaLive__
  - ### Features
    - You can now switch the channel mode of your channels from standard to single pipeline and from single pipeline to standard. In order to switch a channel from single pipeline to standard all inputs attached to the channel must support two encoder pipelines.

## __Amazon Cognito Identity Provider__
  - ### Features
    - This release of Amazon Cognito User Pools introduces the new AdminSetUserPassword API that allows administrators of a user pool to change a user's password. The new password can be temporary or permanent.

## __Amazon WorkMail__
  - ### Features
    - Amazon WorkMail is releasing two new actions: 'GetMailboxDetails' and 'UpdateMailboxQuota'. They add insight into how much space is used by a given mailbox (size) and what its limit is (quota). A mailbox quota can be updated, but lowering the value will not influence WorkMail per user charges. For a closer look at the actions please visit https://docs.aws.amazon.com/workmail/latest/APIReference/API_Operations.html

# __2.5.36__ __2019-05-02__
## __AWS Key Management Service__
  - ### Features
    - AWS Key Management Service (KMS) can return an INTERNAL_ERROR connection error code if it cannot connect a custom key store to its AWS CloudHSM cluster. INTERNAL_ERROR is one of several connection error codes that help you to diagnose and fix a problem with your custom key store.

## __Alexa For Business__
  - ### Features
    - This release allows developers and customers to send text and audio announcements to rooms.

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Fix a bug in the Netty client where the read timeout isn't applied correctly for some requests.

# __2.5.35__ __2019-05-01__
## __AWS X-Ray__
  - ### Features
    - AWS X-Ray now includes Analytics, an interactive approach to analyzing user request paths (i.e., traces). Analytics will allow you to easily understand how your application and its underlying services are performing. With X-Ray Analytics, you can quickly detect application issues, pinpoint the root cause of the issue, determine the severity of the issues, and identify which end users were impacted. With AWS X-Ray Analytics you can explore, analyze, and visualize traces, allowing you to find increases in response time to user requests or increases in error rates. Metadata around peak periods, including frequency and actual times of occurrence, can be investigated by applying filters with a few clicks. You can then drill down on specific errors, faults, and response time root causes and view the associated traces.

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces additional task definition parameters that enable you to define secret options for Docker log configuration, a per-container list contains secrets stored in AWS Systems Manager Parameter Store or AWS Secrets Manager.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds an API for the modification of a VPN Connection, enabling migration from a Virtual Private Gateway (VGW) to a Transit Gateway (TGW), while preserving the VPN endpoint IP addresses on the AWS side as well as the tunnel options.

# __2.5.34__ __2019-04-30__
## __AWS CodePipeline__
  - ### Features
    - This release contains an update to the PipelineContext object that includes the Pipeline ARN, and the Pipeline Execution Id. The ActionContext object is also updated to include the Action Execution Id.

## __AWS Direct Connect__
  - ### Features
    - This release adds support for AWS Direct Connect customers to use AWS Transit Gateway with AWS Direct Connect gateway to route traffic between on-premise networks and their VPCs.

## __AWS Service Catalog__
  - ### Features
    - Admin users can now associate/disassociate aws budgets with a portfolio or product in Service Catalog. End users can see the association by listing it or as part of the describe portfolio/product output. A new optional boolean parameter, "DisableTemplateValidation", is added to ProvisioningArtifactProperties data type. The purpose of the parameter is to enable or disable the CloudFormation template validtion when creating a product or a provisioning artifact.

## __Amazon Managed Blockchain__
  - ### Features
    - (New Service) Amazon Managed Blockchain is a fully managed service that makes it easy to create and manage scalable blockchain networks using popular open source frameworks.

## __Amazon Neptune__
  - ### Features
    - Adds a feature to allow customers to specify a custom parameter group when restoring a database cluster.

# __2.5.33__ __2019-04-29__
## __AWS Transfer for SFTP__
  - ### Features
    - This release adds support for per-server host-key management. You can now specify the SSH RSA private key used by your SFTP server.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds support for Elastic Fabric Adapter (EFA) ENIs.

# __2.5.32__ __2019-04-26__
## __AWS Identity and Access Management__
  - ### Features
    - AWS Security Token Service (STS) enables you to request session tokens from the global STS endpoint that work in all AWS Regions. You can configure the global STS endpoint to vend session tokens that are compatible with all AWS Regions using the new IAM SetSecurityTokenServicePreferences API.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix bug in ChecksumValidatingSubscriber which results in NPE if checksum validation fails.

## __Amazon Simple Notification Service__
  - ### Features
    - With this release AWS SNS adds tagging support for Topics.

# __2.5.31__ __2019-04-25__
## __AWS Batch__
  - ### Features
    - Documentation updates for AWS Batch.

## __AWS Lambda__
  - ### Features
    - AWS Lambda now supports the GetLayerVersionByArn API.

## __Amazon DynamoDB__
  - ### Features
    - This update allows you to tag Amazon DynamoDB tables when you create them. Tags are labels you can attach to AWS resources to make them easier to manage, search, and filter.

## __Amazon GameLift__
  - ### Features
    - This release introduces the new Realtime Servers feature, giving game developers a lightweight yet flexible solution that eliminates the need to build a fully custom game server. The AWS SDK updates provide support for scripts, which are used to configure and customize Realtime Servers.

## __Amazon Inspector__
  - ### Features
    - AWS Inspector - Improve the ListFindings API response time and decreases the maximum number of agentIDs from 500 to 99.

## __Amazon WorkSpaces__
  - ### Features
    - Documentation updates for workspaces

## __Netty NIO Async Http Client__
  - ### Bugfixes
    - Add workaround to await channel pools to be closed before shutting down EventLoopGroup to avoid the race condition between `channelPool.close` and `eventLoopGroup.shutdown`. See [#1109](https://github.com/aws/aws-sdk-java-v2/issues/1109).

# __2.5.30__ __2019-04-24__
## __AWS CloudFormation__
  - ### Features
    - Documentation updates for cloudformation

## __AWS MediaConnect__
  - ### Features
    - Adds support for ListEntitlements pagination.

## __AWS MediaTailor__
  - ### Features
    - AWS Elemental MediaTailor SDK now includes a new parameter to support origin servers that produce single-period DASH manifests.

## __AWS SDK for Java v2__
  - ### Features
    - Make `BytesWrapper`, parent of `SdkBytes` and `ResponseBytes`, public. Fixes [#1208](https://github.com/aws/aws-sdk-java-v2/issues/1208).
    - Support for `credential_source` property in profiles.

  - ### Bugfixes
    - Fixed a bug in asynchronous clients, where a service closing a connection between when a channel is acquired and handlers are attached could lead to response futures never being completed. Fixes [#1207](https://github.com/aws/aws-sdk-java-v2/issues/1207).

## __AWS Storage Gateway__
  - ### Features
    - AWS Storage Gateway now supports Access Control Lists (ACLs) on File Gateway SMB shares, enabling you to apply fine grained access controls for Active Directory users and groups.

## __Alexa For Business__
  - ### Features
    - This release adds support for the Alexa for Business gateway and gateway group APIs.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - You can now launch the new Amazon EC2 general purpose burstable instance types T3a that feature AMD EPYC processors.

## __Amazon Relational Database Service__
  - ### Features
    - A new parameter "feature-name" is added to the add-role and remove-role db cluster APIs. The value for the parameter is optional for Aurora MySQL compatible database clusters, but mandatory for Aurora PostgresQL. You can find the valid list of values using describe db engine versions API.

## __Amazon Route 53__
  - ### Features
    - Amazon Route 53 now supports the Asia Pacific (Hong Kong) Region (ap-east-1) for latency records, geoproximity records, and private DNS for Amazon VPCs in that region.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release updates AWS Systems Manager APIs to allow customers to configure parameters to use either the standard-parameter tier (the default tier) or the advanced-parameter tier. It allows customers to create parameters with larger values and attach parameter policies to an Advanced Parameter.

## __Amazon Textract__
  - ### Features
    - This release adds support for checkbox also known as SELECTION_ELEMENT in Amazon Textract.

# __2.5.29__ __2019-04-19__
## __AWS Resource Groups__
  - ### Features
    - The AWS Resource Groups service increased the query size limit to 4096 bytes.

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe - support transcriptions from audio sources in Spanish Spanish (es-ES).

## __Amazon WorkSpaces__
  - ### Features
    - Added a new reserved field.

# __2.5.28__ __2019-04-18__
## __AWS Application Discovery Service__
  - ### Features
    - The Application Discovery Service's DescribeImportTasks and BatchDeleteImportData APIs now return additional statuses for error reporting.

## __AWS Organizations__
  - ### Features
    - AWS Organizations is now available in the AWS GovCloud (US) Regions, and we added a new API action for creating accounts in those Regions. For more information, see CreateGovCloudAccount in the AWS Organizations API Reference.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Document updates for Amazon Cognito Identity Provider.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds the TimeoutAction parameter to the ScalingConfiguration of an Aurora Serverless DB cluster. You can now configure the behavior when an auto-scaling capacity change can't find a scaling point.

## __Amazon S3__
  - ### Bugfixes
    - Reduced the frequency of 'server failed to send complete response' exceptions when using S3AsyncClient.

## __Amazon WorkLink__
  - ### Features
    - Amazon WorkLink is a fully managed, cloud-based service that enables secure, one-click access to internal websites and web apps from mobile phones. This release introduces new APIs to link and manage internal websites and web apps with Amazon WorkLink fleets.

## __Amazon WorkSpaces__
  - ### Features
    - Documentation updates for workspaces

## __Managed Streaming for Kafka__
  - ### Features
    - Amazon Kafka - Added tagging APIs

# __2.5.27__ __2019-04-17__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for requester-managed Interface VPC Endpoints (powered by AWS PrivateLink). The feature prevents VPC endpoint owners from accidentally deleting or otherwise mismanaging the VPC endpoints of some AWS VPC endpoint services.

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds Arabic language support with new female voice - "Zeina"

# __2.5.26__ __2019-04-16__
## __AWS Organizations__
  - ### Features
    - Documentation updates for organizations

## __AWS SDK for Java v2__
  - ### Features
    - Enable support for credential_process in an AWS credential profile

## __AWS Storage Gateway__
  - ### Features
    - This change allows you to select either a weekly or monthly maintenance window for your volume or tape gateway. It also allows you to tag your tape and volume resources on creation by adding a Tag value on calls to the respective api endpoints.

## __Amazon CloudWatch__
  - ### Features
    - Documentation updates for monitoring

## __Amazon Cognito Identity Provider__
  - ### Features
    - This release adds support for the new email configuration in Amazon Cognito User Pools. You can now specify whether Amazon Cognito emails your users by using its built-in email functionality or your Amazon SES email configuration.

## __Amazon Redshift__
  - ### Features
    - DescribeResize can now return percent of data transferred from source cluster to target cluster for a classic resize.

## __AmazonMQ__
  - ### Features
    - This release adds the ability to retrieve information about broker engines and broker instance options. See Broker Engine Types and Broker Instance Options in the Amazon MQ REST API Reference.

## __Netty NIO Http Client__
  - ### Bugfixes
    - Update `UnusedChannelExceptionHandler` to check the cause of the exception so that it does emit warn logs if the cause is netty io exception. See [#1171](https://github.com/aws/aws-sdk-java-v2/issues/1171)

# __2.5.25__ __2019-04-05__
## __AWS Elemental MediaConvert__
  - ### Features
    - Rectify incorrect modelling of DisassociateCertificate method

## __AWS Elemental MediaLive__
  - ### Features
    - Today AWS Elemental MediaLive (https://aws.amazon.com/medialive/) adds the option to create "Single Pipeline" channels, which offers a lower-cost option compared to Standard channels. MediaLive Single Pipeline channels have a single encoding pipeline rather than the redundant dual Availability Zone (AZ) pipelines that MediaLive provides with a "Standard" channel.

## __AWS Glue__
  - ### Features
    - AWS Glue now supports workerType choices in the CreateJob, UpdateJob, and StartJobRun APIs, to be used for memory-intensive jobs.

## __AWS IoT 1-Click Devices Service__
  - ### Features
    - Documentation updates for 1-Click: improved descriptions of resource tagging APIs.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Lazily initialize `ApiCallTimeoutException` and `ApiCallAttemptTimeoutException`. This change would improve performance of async api calls.

## __AWS Transcribe Streaming__
  - ### Features
    - Amazon Transcribe now supports GB English, CA French and FR French which expands upon the existing language support for US English and US Spanish.

## __Amazon Comprehend__
  - ### Features
    - With this release AWS Comprehend provides confusion matrix for custom document classifier.

# __2.5.24__ __2019-04-04__
## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for iam

## __Amazon Elastic Container Service for Kubernetes__
  - ### Features
    - Added support to enable or disable publishing Kubernetes cluster logs in AWS CloudWatch

# __2.5.23__ __2019-04-03__
## __AWS Batch__
  - ### Features
    - Support for GPU resource requirement in RegisterJobDefinition and SubmitJob

## __Amazon Comprehend__
  - ### Features
    - With this release AWS Comprehend adds tagging support for document-classifiers and entity-recognizers.

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Fix a bug where SNI was not enabled in Netty NIO Async Client for TLS and caused the requests to fail of handshake_failure in some services. See [#1171](https://github.com/aws/aws-sdk-java-v2/issues/1171)

# __2.5.22__ __2019-04-02__
## __AWS Certificate Manager__
  - ### Features
    - Documentation updates for acm

## __AWS SecurityHub__
  - ### Features
    - This update includes 3 additional error codes: AccessDeniedException, InvalidAccessException, and ResourceConflictException. This update also removes the error code ResourceNotFoundException from the GetFindings, GetInvitationsCount, ListInvitations, and ListMembers operations.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Add paginators.

# __2.5.21__ __2019-04-01__
## __Amazon Elastic MapReduce__
  - ### Features
    - Amazon EMR adds the ability to modify instance group configurations on a running cluster through the new "configurations" field in the ModifyInstanceGroups API.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - March 2019 documentation updates for Systems Manager.

# __2.5.20__ __2019-03-29__
## __AWS Greengrass__
  - ### Features
    - Greengrass APIs now support tagging operations on resources

## __Amazon API Gateway__
  - ### Bugfixes
    - Fix the SDK cloberring existed 'Accept' headers on marshalled requests.

## __Amazon CloudWatch__
  - ### Features
    - Added 3 new APIs, and one additional parameter to PutMetricAlarm API, to support tagging of CloudWatch Alarms.

## __Amazon Comprehend__
  - ### Features
    - With this release AWS Comprehend supports encryption of output results of analysis jobs and volume data on the storage volume attached to the compute instance that processes the analysis job.

# __2.5.19__ __2019-03-28__
## __AWS Elemental MediaLive__
  - ### Features
    - This release adds a new output locking mode synchronized to the Unix epoch.

## __AWS Service Catalog__
  - ### Features
    - Adds "Tags" field in UpdateProvisionedProduct API. The product should have a new RESOURCE_UPDATE Constraint with TagUpdateOnProvisionedProduct field set to ALLOWED for it to work. See API docs for CreateConstraint for more information

## __Amazon Pinpoint Email Service__
  - ### Features
    - This release adds support for using the Amazon Pinpoint Email API to tag the following types of Amazon Pinpoint resources: configuration sets; dedicated IP pools; deliverability dashboard reports; and, email identities. A tag is a label that you optionally define and associate with these types of resources. Tags can help you categorize and manage these resources in different ways, such as by purpose, owner, environment, or other criteria. A resource can have as many as 50 tags. For more information, see the Amazon Pinpoint Email API Reference.

## __Amazon WorkSpaces__
  - ### Features
    - Amazon WorkSpaces adds tagging support for WorkSpaces Images, WorkSpaces directories, WorkSpaces bundles and IP Access control groups.

# __2.5.18__ __2019-03-27__
## __AWS App Mesh__
  - ### Features
    - This release includes AWS Tagging integration for App Mesh, VirtualNode access logging, TCP routing, and Mesh-wide external traffic egress control. See https://docs.aws.amazon.com/app-mesh/latest/APIReference/Welcome.html for more details.

## __AWS Storage Gateway__
  - ### Features
    - This change allows you to select a pool for archiving virtual tapes. Pools are associated with S3 storage classes. You can now choose to archive virtual tapes in either S3 Glacier or S3 Glacier Deep Archive storage class. CreateTapes API now takes a new PoolId parameter which can either be GLACIER or DEEP_ARCHIVE. Tapes created with this parameter will be archived in the corresponding storage class.

## __AWS Transfer for SFTP__
  - ### Features
    - This release adds PrivateLink support to your AWS SFTP server endpoint, enabling the customer to access their SFTP server within a VPC, without having to traverse the internet. Customers can now can create a server and specify an option whether they want the endpoint to be hosted as public or in their VPC, and with the in VPC option, SFTP clients and users can access the server only from the customer's VPC or from their on-premises environments using DX or VPN. This release also relaxes the SFTP user name requirements to allow underscores and hyphens.

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces support for external deployment controllers for ECS services with the launch of task set management APIs. Task sets are a new primitive for controlled management of application deployments within a single ECS service.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - You can now launch the new Amazon EC2 R5ad and M5ad instances that feature local NVMe attached SSD instance storage (up to 3600 GB). M5ad and R5ad feature AMD EPYC processors that offer a 10% cost savings over the M5d and R5d EC2 instances.

## __Amazon Simple Storage Service__
  - ### Features
    - S3 Glacier Deep Archive provides secure, durable object storage class for long term data archival. This SDK release provides API support for this new storage class.

## __Apache Http Client__
  - ### Features
    - Add the ability to set a custom Apache HttpRoutePlanner and CredentialProvider

## __Elastic Load Balancing__
  - ### Features
    - This release adds support for routing based on HTTP headers, methods, query string or query parameters and source IP addresses in Application Load Balancer.

# __2.5.17__ __2019-03-26__
## __AWS Glue__
  - ### Features
    - This new feature will now allow customers to add a customized csv classifier with classifier API. They can specify a custom delimiter, quote symbol and control other behavior they'd like crawlers to have while recognizing csv files

## __Amazon WorkMail__
  - ### Features
    - Documentation updates for Amazon WorkMail.

# __2.5.16__ __2019-03-25__
## __AWS Direct Connect__
  - ### Features
    - Direct Connect gateway enables you to establish connectivity between your on-premise networks and Amazon Virtual Private Clouds (VPCs) in any commercial AWS Region (except in China) using AWS Direct Connect connections at any AWS Direct Connect location. This release enables multi-account support for Direct Connect gateway, with multi-account support for Direct Connect gateway, you can associate up to ten VPCs from any AWS account with a Direct Connect gateway. The AWS accounts owning VPCs and the Direct Connect gateway must belong to the same AWS payer account ID. This release also enables Direct Connect Gateway owners to allocate allowed prefixes from each associated VPCs.

## __AWS Elemental MediaConvert__
  - ### Features
    - This release adds support for detailed job progress status and S3 server-side output encryption. In addition, the anti-alias filter will now be automatically applied to all outputs

## __AWS IoT 1-Click Devices Service__
  - ### Features
    - This release adds tagging support for AWS IoT 1-Click Device resources. Use these APIs to add, remove, or list tags on Devices, and leverage the tags for various authorization and billing scenarios. This release also adds the ARN property for DescribeDevice response object.

## __AWS IoT Analytics__
  - ### Features
    - This change allows you to specify the number of versions of IoT Analytics data set content to be retained. Previously, the number of versions was managed implicitly via the setting of the data set's retention period.

## __AWS RoboMaker__
  - ### Features
    - Added additional progress metadata fields for robot deployments

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe - With this release Amazon Transcribe enhances the custom vocabulary feature to improve accuracy by providing customization on pronunciations and output formatting.

## __Firewall Management Service__
  - ### Features
    - AWS Firewall Manager now allows customer to centrally enable AWS Shield Advanced DDoS protection for their entire AWS infrastructure, across accounts and applications.

## __URL Connection Http Client__
  - ### Bugfixes
    - Bypass ssl validations when `TRUST_ALL_CERTIFICATES` is set to true.

# __2.5.15__ __2019-03-22__
## __AWS IoT 1-Click Projects Service__
  - ### Features
    - This release adds tagging support for AWS IoT 1-Click Project resources. Use these APIs to add, remove, or list tags on Projects, and leverage the tags for various authorization and billing scenarios. This release also adds the ARN property to projects for DescribeProject and ListProject responses.

## __Amazon CloudSearch Domain__
  - ### Bugfixes
    - Use application/x-www-form-urlencoded as Content-Type for search API

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe - support transcriptions from audio sources in German (de-DE) and Korean (ko-KR).

## __Netty NIO Http Client__
  - ### Features
    - Add sslProvider configuration in `NettyNioAsyncHttpClient.Builder`.

# __2.5.14__ __2019-03-21__
## __AWS IoT__
  - ### Features
    - This release adds the GetStatistics API for the AWS IoT Fleet Indexing Service, which allows customers to query for statistics about registered devices that match a search query. This release only supports the count statistics. For more information about this API, see https://docs.aws.amazon.com/iot/latest/apireference/API_GetStatistics.html

## __AWS SDK for Java v2__
  - ### Features
    - Automatically retry on `RequestThrottledException` error codes.

  - ### Bugfixes
    - Fix bug where the stream returned from a `ContentStreamProvider` is not closed after request execution. See [#1138](https://github.com/aws/aws-sdk-java-v2/issues/1138)

## __Amazon CloudWatch Events__
  - ### Features
    - Added 3 new APIs, and one additional parameter to the PutRule API, to support tagging of CloudWatch Events rules.

## __Amazon Cognito Identity Provider__
  - ### Features
    - This release adds tags and tag-based access control support to Amazon Cognito User Pools.

## __Amazon Lightsail__
  - ### Features
    - This release adds the DeleteKnownHostKeys API, which enables Lightsail's browser-based SSH or RDP clients to connect to the instance after a host key mismatch.

## __Amazon S3__
  - ### Bugfixes
    - Fix bug in `ChecksumCalculatingInputStream` where methods not overridden, such as `close()`, are not called on the wrapped stream. See [#1138](https://github.com/aws/aws-sdk-java-v2/issues/1138).

## __Auto Scaling__
  - ### Features
    - Documentation updates for Amazon EC2 Auto Scaling

# __2.5.13__ __2019-03-20__
## __AWS CodePipeline__
  - ### Features
    - Add support for viewing details of each action execution belonging to past and latest pipeline executions that have occurred in customer's pipeline. The details include start/updated times, action execution results, input/output artifacts information, etc. Customers also have the option to add pipelineExecutionId in the input to filter the results down to a single pipeline execution.

## __AWSMarketplace Metering__
  - ### Features
    - This release increases AWS Marketplace Metering Service maximum usage quantity to 2147483647 and makes parameters usage quantity and dryrun optional.

## __Amazon Cognito Identity__
  - ### Features
    - This release adds tags and tag-based access control support to Amazon Cognito Identity Pools (Federated Identities).

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Fix a bug that could pollute non SDK threads with `ThreadLocal`'s when allocating memory. See [#1133](https://github.com/aws/aws-sdk-java-v2/issues/1133)

## __Netty NIO Http Client__
  - ### Bugfixes
    - Fix failed test NettyNioAsyncHttpClientSpiVerificationTest when running with JDK11. See [#1038](https://github.com/aws/aws-sdk-java-v2/issues/1038)

# __2.5.12__ __2019-03-19__
## __AWS Config__
  - ### Features
    - AWS Config adds a new API called SelectResourceConfig to run advanced queries based on resource configuration properties.

## __AWS SDK for Java v2__
  - ### Features
    - Adds the Java vendor the user agent as well as using the updated user agent for all HTTP calls

## __Amazon Elastic Container Service for Kubernetes__
  - ### Features
    - Added support to control private/public access to the Kubernetes API-server endpoint

## __Amazon S3__
  - ### Features
    - Add support for getUrl operation. The API can be used to generate a URL that represents an object in Amazon S3. The url can only be used to download the object content if the object has public read permissions. Original issue: https://github.com/aws/aws-sdk-java-v2/issues/860

  - ### Bugfixes
    - Only set content type of S3 `CreateMultipartUploadRequest` if `Content-Type` header is not present and honor the overridden content type.

# __2.5.11__ __2019-03-18__
## __AWS Database Migration Service__
  - ### Features
    - S3 Endpoint Settings added support for 1) Migrating to Amazon S3 as a target in Parquet format 2) Encrypting S3 objects after migration with custom KMS Server-Side encryption. Redshift Endpoint Settings added support for encrypting intermediate S3 objects during migration with custom KMS Server-Side encryption.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix HeaderUnmarshaller to compare header ignoring cases.

## __Amazon Chime__
  - ### Features
    - This release adds support for the Amazon Chime Business Calling and Voice Connector features.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - DescribeFpgaImages API now returns a new DataRetentionSupport attribute to indicate if the AFI meets the requirements to support DRAM data retention. DataRetentionSupport is a read-only attribute.

# __2.5.10__ __2019-03-14__
## __AWS Certificate Manager__
  - ### Features
    - AWS Certificate Manager has added a new API action, RenewCertificate. RenewCertificate causes ACM to force the renewal of any private certificate which has been exported.

## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - AWS Certificate Manager (ACM) Private CA allows customers to manage permissions on their CAs. Customers can grant or deny AWS Certificate Manager permission to renew exported private certificates.

## __AWS Config__
  - ### Features
    - AWS Config - add ability to tag, untag and list tags for ConfigRule, ConfigurationAggregator and AggregationAuthorization resource types. Tags can be used for various scenarios including tag based authorization.

## __AWS IoT__
  - ### Features
    - In this release, AWS IoT introduces support for tagging OTA Update and Stream resources. For more information about tagging, see the AWS IoT Developer Guide.

## __Amazon CloudWatch__
  - ### Features
    - New Messages parameter for the output of GetMetricData, to support new metric search functionality.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds tagging support for Dedicated Host Reservations.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Automatic Model Tuning now supports random search and hyperparameter scaling.

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Backport `FixedChannelPool` fix from https://github.com/netty/netty/pull/7927, which ensures that the operation doesn't become blocked from closing the wrapped pool.
    - Fix a possible `NullPointerException` if `HttpOrHttp2ChannelPool` is closed while the protocol is still being determined. The operation is now done synchronously with other operations on the pool to prevent a data race.

# __2.5.9__ __2019-03-13__
## __AWS Config__
  - ### Features
    - Config released Remediation APIs allowing Remediation of Config Rules

## __Amazon CloudWatch Logs__
  - ### Features
    - Documentation updates for logs

## __Netty Nio HTTP Client__
  - ### Bugfixes
    - Update `SslCompletionEventHandler` to close channel for `SslCloseCompletionEvent` only if the channel is not currently in use. This would fix the race condition in the async clients causing incorrect IOException to be thrown when the service returns error response and closes the connection. See [#1076](https://github.com/aws/aws-sdk-java-v2/issues/1076)

# __2.5.8__ __2019-03-12__
## __AWSServerlessApplicationRepository__
  - ### Features
    - The AWS Serverless Application Repository now supports associating a ZIP source code archive with versions of an application.

## __Netty Nio Http Client__
  - ### Bugfixes
    - Fix a bug where the channel fails to be released if there is an exception thrown.

# __2.5.7__ __2019-03-11__
## __AWS Cost Explorer Service__
  - ### Features
    - The only change in this release is to make TimePeriod a required parameter in GetCostAndUsageRequest.

## __AWS Elastic Beanstalk__
  - ### Features
    - Elastic Beanstalk added support for tagging, and tag-based access control, of all Elastic Beanstalk resources.

## __AWS Glue__
  - ### Features
    - CreateDevEndpoint and UpdateDevEndpoint now support Arguments to configure the DevEndpoint.

## __AWS IoT__
  - ### Features
    - Documentation updates for iot

## __Amazon QuickSight__
  - ### Features
    - Amazon QuickSight user and group operation results now include group principal IDs and user principal IDs. This release also adds "DeleteUserByPrincipalId", which deletes users given their principal ID. The update also improves role session name validation.

## __Amazon Rekognition__
  - ### Features
    - Documentation updates for Amazon Rekognition

## __Amazon S3__
  - ### Bugfixes
    - Set `Content-Type` to `binary/octet-stream` for `S3#createMultipartRequest`. See [#1092](https://github.com/aws/aws-sdk-java-v2/issues/1092)

## __Apache Http Client__
  - ### Bugfixes
    - Updated to not set a default `Content-Type` if the header does not exist. Per [RFC7231](https://tools.ietf.org/html/rfc7231#page-11), we should let the recipient to decide if not known.

# __2.5.6__ __2019-03-08__
## __AWS CodeBuild__
  - ### Features
    - CodeBuild also now supports Git Submodules. CodeBuild now supports opting out of Encryption for S3 Build Logs. By default these logs are encrypted.

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker notebook instances now support enabling or disabling root access for notebook users. SageMaker Neo now supports rk3399 and rk3288 as compilation target devices.

## __Amazon Simple Storage Service__
  - ### Features
    - Documentation updates for s3

# __2.5.5__ __2019-03-07__
## __AWS App Mesh__
  - ### Features
    - This release includes a new version of the AWS App Mesh APIs. You can read more about the new APIs here: https://docs.aws.amazon.com/app-mesh/latest/APIReference/Welcome.html.

## __AWS Elemental MediaLive__
  - ### Features
    - This release adds a MediaPackage output group, simplifying configuration of outputs to AWS Elemental MediaPackage.

## __AWS Greengrass__
  - ### Features
    - Greengrass group UID and GID settings can now be configured to use a provided default via FunctionDefaultConfig. If configured, all Lambda processes in your deployed Greengrass group will by default start with the provided UID and/or GID, rather than by default starting with UID "ggc_user" and GID "ggc_group" as they would if not configured. Individual Lambdas can also be configured to override the defaults if desired via each object in the Functions list of your FunctionDefinitionVersion.

## __AWS SDK For Java v2__
  - ### Bugfixes
    - Fix bug in the generated async clients where cancelling the `CompletableFuture` returned from an async operation does not result in cancelling the underlying HTTP request execution. In some cases, this can lead to unnecesarily keeping resources from being freed until the request execution finishes.

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces additional task definition parameters that enable you to define dependencies for container startup and shutdown, a per-container start and stop timeout value, as well as an AWS App Mesh proxy configuration which eases the integration between Amazon ECS and AWS App Mesh.

## __Amazon GameLift__
  - ### Features
    - Amazon GameLift-hosted instances can now securely access resources on other AWS services using IAM roles. See more details at https://aws.amazon.com/releasenotes/amazon-gamelift/.

## __Amazon Relational Database Service__
  - ### Features
    - You can configure your Aurora database cluster to automatically copy tags on the cluster to any automated or manual database cluster snapshots that are created from the cluster. This allows you to easily set metadata on your snapshots to match the parent cluster, including access policies. You may enable or disable this functionality while creating a new cluster, or by modifying an existing database cluster.

## __Auto Scaling__
  - ### Features
    - Documentation updates for autoscaling

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Fix a bug where, if the future returned from the `NettyRequestExecutor#execute` is cancelled, the client continues to wait for the `Channel` acquire to complete, which leads to keeping potentially many resources around unnecessarily.

# __2.5.4__ __2019-03-06__
## __AWS Direct Connect__
  - ### Features
    - Exposed a new available port speeds field in the DescribeLocation api call.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix the generated ServiceMetadata classes for services that have PARTITION_OVERRIDDEN_ENDPOINTS

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds pagination support for ec2.DescribeVpcs, ec2.DescribeInternetGateways and ec2.DescribeNetworkAcls APIs

## __Amazon Elastic File System__
  - ### Features
    - Documentation updates for elasticfilesystem adding new examples for EFS Lifecycle Management feature.

# __2.5.3__ __2019-03-05__
## __AWS CodeDeploy__
  - ### Features
    - Documentation updates for codedeploy

## __AWS Elemental MediaLive__
  - ### Features
    - This release adds support for pausing and unpausing one or both pipelines at scheduled times.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Add missing non-service modules to bom. See [#1063](https://github.com/aws/aws-sdk-java-v2/issues/1063)

## __AWS Storage Gateway__
  - ### Features
    - ActivateGateway, CreateNFSFileShare and CreateSMBFileShare APIs support a new parameter: Tags (to be attached to the created resource). Output for DescribeNFSFileShare, DescribeSMBFileShare and DescribeGatewayInformation APIs now also list the Tags associated with the resource. Minimum length of a KMSKey is now 7 characters.

## __Amazon Textract__
  - ### Features
    - This release is intended ONLY for customers that are officially part of the Amazon Textract Preview program. If you are not officially part of the Amazon Textract program THIS WILL NOT WORK. Our two main regions for Amazon Textract Preview are N. Virginia and Dublin. Also some members have been added to Oregon and Ohio. If you are outside of any of these AWS regions, Amazon Textract Preview definitely will not work. If you would like to be part of the Amazon Textract program, you can officially request sign up here - https://pages.awscloud.com/textract-preview.html. To set expectations appropriately, we are aiming to admit new preview participants once a week until General Availability.

# __2.5.2__ __2019-03-04__
## __AWS Elemental MediaPackage__
  - ### Features
    - This release adds support for user-defined tagging of MediaPackage resources. Users may now call operations to list, add and remove tags from channels and origin-endpoints. Users can also specify tags to be attached to these resources during their creation. Describe and list operations on these resources will now additionally return any tags associated with them.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release updates AWS Systems Manager APIs to support service settings for AWS customers. A service setting is a key-value pair that defines how a user interacts with or uses an AWS service, and is typically created and consumed by the AWS service team. AWS customers can read a service setting via GetServiceSetting API and update the setting via UpdateServiceSetting API or ResetServiceSetting API, which are introduced in this release. For example, if an AWS service charges money to the account based on a feature or service usage, then the AWS service team might create a setting with the default value of "false". This means the user can't use this feature unless they update the setting to "true" and intentionally opt in for a paid feature.

# __2.5.1__ __2019-03-01__
## __AWS Auto Scaling Plans__
  - ### Features
    - Documentation updates for autoscaling-plans

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for modifying instance event start time which allows users to reschedule EC2 events.

# __2.5.0__ __2019-02-28__
## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix a bug in the code generator where the enum getter for a structure member is not being generated in some cases. Additionally, fix a bug that generated the wrong code for enum getters where the enum is not at the top level container but is nested, such as `List<List<EnumType>>`. This breaks the interface for affected services so the minor version is increased.
    - Fixed a bug where the request would fail of NoSuchElementException. This bug would affect `TranscribeStreaming#startStreamTranscription` request

## __Alexa For Business__
  - ### Features
    - This release adds the PutInvitationConfiguration API to configure the user invitation email template with custom attributes, and the GetInvitationConfiguration API to retrieve the configured values.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - AWS Systems Manager State Manager now supports associations using documents shared by other AWS accounts.

## __AmazonApiGatewayV2__
  - ### Features
    - Marking certain properties as explicitly required and fixing an issue with the GetApiMappings operation for ApiMapping resources.

## __Application Auto Scaling__
  - ### Features
    - Documentation updates for application-autoscaling

## __Netty Nio HTTP Client__
  - ### Bugfixes
    - Added try-catch blocks to prevent uncompleted future when exception is thrown.

# __2.4.17__ __2019-02-27__
## __AWS WAF__
  - ### Features
    - Documentation updates for waf

## __AWS WAF Regional__
  - ### Features
    - Documentation updates for waf-regional

## __core__
  - ### Bugfixes
    - Netty 4.1.33.Final

# __2.4.16__ __2019-02-26__
## __AWS Application Discovery Service__
  - ### Features
    - Documentation updates for discovery

## __AWS Cost and Usage Report Service__
  - ### Features
    - Adding support for Athena and new report preferences to the Cost and Usage Report API.

## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added several features including support for: auto-rotation or user-specified rotation of 0, 90, 180, or 270 degrees; multiple output groups with DRM; ESAM XML documents to specify ad insertion points; Offline Apple HLS FairPlay content protection.

## __AWS OpsWorks for Chef Automate__
  - ### Features
    - Documentation updates for opsworkscm

## __AWS Organizations__
  - ### Features
    - Documentation updates for AWS Organizations

## __AWS Resource Groups__
  - ### Features
    - Documentation updates for Resource Groups API; updating description of Tag API.

## __Amazon Pinpoint__
  - ### Features
    - This release adds support for the Amazon Resource Groups Tagging API to Amazon Pinpoint, which means that you can now add and manage tags for Amazon Pinpoint projects (apps), campaigns, and segments. A tag is a label that you optionally define and associate with Amazon Pinpoint resource. Tags can help you categorize and manage these types of resources in different ways, such as by purpose, owner, environment, or other criteria. For example, you can use tags to apply policies or automation, or to identify resources that are subject to certain compliance requirements. A project, campaign, or segment can have as many as 50 tags. For more information about using and managing tags in Amazon Pinpoint, see the Amazon Pinpoint Developer Guide at https://docs.aws.amazon.com/pinpoint/latest/developerguide/welcome.html. For more information about the Amazon Resource Group Tagging API, see the Amazon Resource Group Tagging API Reference at https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/Welcome.html.

## __Amazon S3__
  - ### Bugfixes
    - Fix the issue where NoSuchBucketException was not unmarshalled for `s3#getBucketPolicy` when the bucket doesn't exist. See [#1088](https://github.com/aws/aws-sdk-java-v2/issues/1088)

# __2.4.15__ __2019-02-25__
## __AWS CodeCommit__
  - ### Removals
    - Removing invalid "fips" region

## __AWS Cost Explorer Service__
  - ### Features
    - Added metrics to normalized units.

## __AWS Elasticache__
  - ### Removals
    - Removing invalid "fips" region

## __AWS Elemental MediaStore__
  - ### Features
    - This release adds support for access logging, which provides detailed records for the requests that are made to objects in a container.

## __AWS SDK for Java v2__
  - ### Removals
    - Removes invalid AWS regions that don't match the partition regex

## __Amazon DynamoDB__
  - ### Removals
    - Removing invalid "local" region

## __Amazon MTurk__
  - ### Removals
    - Removing invalid "sandbox" region

## __Amazon S3__
  - ### Removals
    - Removing invalid dualstack regions and s3-external-1

## __Auto Scaling__
  - ### Features
    - Added support for passing an empty SpotMaxPrice parameter to remove a value previously set when updating an Amazon EC2 Auto Scaling group.

## __Elastic Load Balancing__
  - ### Features
    - This release enables you to use the existing client secret when modifying a rule with an action of type authenticate-oidc.

# __2.4.14__ __2019-02-22__
## __AWS Cloud9__
  - ### Features
    - Adding EnvironmentLifecycle to the Environment data type.

## __AWS Glue__
  - ### Features
    - AWS Glue adds support for assigning AWS resource tags to jobs, triggers, development endpoints, and crawlers. Each tag consists of a key and an optional value, both of which you define. With this capacity, customers can use tags in AWS Glue to easily organize and identify your resources, create cost allocation reports, and control access to resources.

## __AWS Step Functions__
  - ### Features
    - This release adds support for tag-on-create. You can now add tags when you create AWS Step Functions activity and state machine resources. For more information about tagging, see AWS Tagging Strategies.

## __Amazon Athena__
  - ### Features
    - This release adds tagging support for Workgroups to Amazon Athena. Use these APIs to add, remove, or list tags on Workgroups, and leverage the tags for various authorization and billing scenarios.

# __2.4.13__ __2019-02-21__
## __AWS CodeBuild__
  - ### Features
    - Add support for CodeBuild local caching feature

## __AWS Organizations__
  - ### Features
    - Documentation updates for organizations

## __AWS Transfer for SFTP__
  - ### Features
    - Bug fix: increased the max length allowed for request parameter NextToken when paginating List operations

## __Amazon CloudWatch__
  - ### Features
    - Documentation updates for monitoring

## __Amazon Kinesis Video Streams__
  - ### Features
    - Documentation updates for Kinesis Video Streams

## __Amazon Kinesis Video Streams Archived Media__
  - ### Features
    - In this release, HLS playback of KVS streams can be configured to output MPEG TS fragments using the ContainerFormat parameter. HLS playback of KVS streams can also be configured to include the EXT-X-PROGRAM-DATE-TIME field using the DisplayFragmentTimestamp parameter.

## __Amazon Kinesis Video Streams Media__
  - ### Features
    - Documentation updates for Kinesis Video Streams

## __Amazon WorkDocs__
  - ### Features
    - Documentation updates for workdocs

# __2.4.12__ __2019-02-20__
## __AWS CodeCommit__
  - ### Features
    - This release adds an API for adding / updating / deleting / copying / moving / setting file modes for one or more files directly to an AWS CodeCommit repository without requiring a Git client.

## __AWS Direct Connect__
  - ### Features
    - Documentation updates for AWS Direct Connect

## __AWS Elemental MediaLive__
  - ### Features
    - This release adds support for VPC inputs, allowing you to push content from your Amazon VPC directly to MediaLive.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fixed an issue where the SDK could be over-retrying on signature errors.
    - Fixed an issue where the SDK could fail to adjust the local clock under skewed-clock conditions.

# __2.4.11__ __2019-02-19__
## __AWS Directory Service__
  - ### Features
    - This release adds support for tags during directory creation (CreateDirectory, CreateMicrosoftAd, ConnectDirectory).

## __AWS IoT__
  - ### Features
    - AWS IoT - AWS IoT Device Defender adds support for configuring behaviors in a security profile with statistical thresholds. Device Defender also adds support for configuring multiple data-point evaluations before a violation is either created or cleared.

## __Amazon Elastic File System__
  - ### Features
    - Amazon EFS now supports adding tags to file system resources as part of the CreateFileSystem API . Using this capability, customers can now more easily enforce tag-based authorization for EFS file system resources.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - AWS Systems Manager now supports adding tags when creating Activations, Patch Baselines, Documents, Parameters, and Maintenance Windows

# __2.4.10__ __2019-02-18__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Secrets Manager__
  - ### Features
    - This release increases the maximum allowed size of SecretString or SecretBinary from 4KB to 7KB in the CreateSecret, UpdateSecret, PutSecretValue and GetSecretValue APIs.

## __Amazon Athena__
  - ### Features
    - This release adds support for Workgroups to Amazon Athena. Use Workgroups to isolate users, teams, applications or workloads in the same account, control costs by setting up query limits and creating Amazon SNS alarms, and publish query-related metrics to Amazon CloudWatch.

# __2.4.9__ __2019-02-15__
## __AWS IoT__
  - ### Features
    - In this release, IoT Device Defender introduces support for tagging Scheduled Audit resources.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Attach `extendedRequestId` to `AwsResponseMetadata` if available for event streaming operations so that customers can retrieve it from response metadata

## __Amazon Chime__
  - ### Features
    - Documentation updates for Amazon Chime

## __Application Auto Scaling__
  - ### Features
    - Documentation updates for Application Auto Scaling

# __2.4.8__ __2019-02-14__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds tagging and ARN support for AWS Client VPN Endpoints.You can now run bare metal workloads on EC2 M5 and M5d instances. m5.metal and m5d.metal instances are powered by custom Intel Xeon Scalable Processors with a sustained all core frequency of up to 3.1 GHz. m5.metal and m5d.metal offer 96 vCPUs and 384 GiB of memory. With m5d.metal, you also have access to 3.6 TB of NVMe SSD-backed instance storage. m5.metal and m5d.metal instances deliver 25 Gbps of aggregate network bandwidth using Elastic Network Adapter (ENA)-based Enhanced Networking, as well as 14 Gbps of bandwidth to EBS.You can now run bare metal workloads on EC2 z1d instances. z1d.metal instances are powered by custom Intel Xeon Scalable Processors with a sustained all core frequency of up to 4.0 GHz. z1d.metal offers 48 vCPUs, 384 GiB of memory, and 1.8 TB of NVMe SSD-backed instance storage. z1d.metal instances deliver 25 Gbps of aggregate network bandwidth using Elastic Network Adapter (ENA)-based Enhanced Networking, as well as 14 Gbps of bandwidth to EBS.

## __Amazon Kinesis Video Streams__
  - ### Features
    - Adds support for Tag-On-Create for Kinesis Video Streams. A list of tags associated with the stream can be created at the same time as the stream creation.

# __2.4.7__ __2019-02-13__
## __AWS MediaTailor__
  - ### Features
    - This release adds support for tagging AWS Elemental MediaTailor resources.

## __Amazon Elastic File System__
  - ### Features
    - Customers can now use the EFS Infrequent Access (IA) storage class to more cost-effectively store larger amounts of data in their file systems. EFS IA is cost-optimized storage for files that are not accessed every day. You can create a new file system and enable Lifecycle Management to automatically move files that have not been accessed for 30 days from the Standard storage class to the IA storage class.

## __Amazon Rekognition__
  - ### Features
    - GetContentModeration now returns the version of the moderation detection model used to detect unsafe content.

# __2.4.6__ __2019-02-12__
## __AWS Lambda__
  - ### Features
    - Documentation updates for AWS Lambda

## __AWS Transcribe Streaming__
  - ### Features
    - Amazon Transcribe now supports US Spanish, which expands upon the existing language support for US English.

## __Netty Nio HTTP Client__
  - ### Bugfixes
    - Awaits `EventLoopGroup#shutdownGracefully` to complete when closing Netty client.

# __2.4.5__ __2019-02-11__
## __AWS CodeBuild__
  - ### Features
    - Add customized webhook filter support

## __AWS Elemental MediaPackage__
  - ### Features
    - Adds optional configuration for DASH to compact the manifest by combining duplicate SegmentTemplate tags. Adds optional configuration for DASH SegmentTemplate format to refer to segments by "Number" (default) or by "Time".

## __Amazon AppStream__
  - ### Features
    - This update enables customers to find the start time, max expiration time, and connection status associated with AppStream streaming session.

## __Amazon CloudWatch Logs__
  - ### Bugfixes
    - Fix infinite pagination bug in CloudWatchLogsClient.getLogEventsPaginator API. See https://github.com/aws/aws-sdk-java-v2/issues/1045

# __2.4.4__ __2019-02-08__
## __AWS Application Discovery Service__
  - ### Features
    - Documentation updates for the AWS Application Discovery Service.

## __AWS S3__
  - ### Bugfixes
    - Use request header to determine if checksum validation should be enabled for `s3#putObject`

## __AWS SDK for Java v2__
  - ### Features
    - Never initialie the default region provider chain if the region is always specified in the client builder.
    - Never initialize the default credentials provider chain if credentials are always specified in the client builder.

  - ### Bugfixes
    - Defer all errors raised when creating `ProfileCredentialsProvider` to the `resolveCredentials()` call.

## __Amazon Data Lifecycle Manager__
  - ### Features
    - This release is to correct the timestamp format to ISO8601 for the DateCreated and DateModified files in the GetLifecyclePolicy response object.

## __Amazon EC2 Container Service__
  - ### Features
    - Amazon ECS introduces the PutAccountSettingDefault API, an API that allows a user to set the default ARN/ID format opt-in status for all the roles and users in the account. Previously, setting the account's default opt-in status required the use of the root user with the PutAccountSetting API.

# __2.4.3__ __2019-02-07__
## __AWS Elemental MediaLive__
  - ### Features
    - This release adds tagging of channels, inputs, and input security groups.

## __AWS RoboMaker__
  - ### Features
    - Added support for tagging and tag-based access control for AWS RoboMaker resources. Also, DescribeSimulationJob now includes a new failureReason field to help debug simulation job failures

## __Amazon Elasticsearch Service__
  - ### Features
    - Feature: Support for three Availability Zone deployments

## __Amazon GameLift__
  - ### Features
    - This release delivers a new API action for deleting unused matchmaking rule sets. More details are available at https://aws.amazon.com/releasenotes/?tag=releasenotes%23keywords%23amazon-gamelift.

# __2.4.2__ __2019-02-06__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - Add Linux with SQL Server Standard, Linux with SQL Server Web, and Linux with SQL Server Enterprise to the list of allowed instance platforms for On-Demand Capacity Reservations.

## __Amazon FSx__
  - ### Features
    - New optional ExportPath parameter added to the CreateFileSystemLustreConfiguration object for user-defined export paths. Used with the CreateFileSystem action when creating an Amazon FSx for Lustre file system.

# __2.4.1__ __2019-02-05__
## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix an issue where an exception could be raised when configuring the idle connection reaper in the apache HTTP client [#1059](https://github.com/aws/aws-sdk-java-v2/issues/1059).

## __AWS Service Catalog__
  - ### Features
    - Service Catalog Documentation Update for ProvisionedProductDetail

## __AWS Shield__
  - ### Features
    - The DescribeProtection request now accepts resource ARN as valid parameter.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - ec2.DescribeVpcPeeringConnections pagination support

# __2.4.0__ __2019-02-04__
## __AWS CodeCommit__
  - ### Features
    - This release supports a more graceful handling of the error case when a repository is not associated with a pull request ID in a merge request in AWS CodeCommit.

## __AWS SDK for Java v2__
  - ### Features
    - Add support for `connectionTimeToLive`, `connectionMaxIdleTime` and `useIdleConnectionReaper` to the netty HTTP client.
    - Enable `useIdleConnectionReaper` by default for Netty and Apache.
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Added a new handler ([#1041](https://github.com/aws/aws-sdk-java-v2/issues/1041)) to close channels which have triggered an SslCloseCompletionEvent and are no longer usable per [#452](https://github.com/aws/aws-sdk-java-v2/issues/452).
    - Fix the deadlock issue in `EventStreamAsyncResponseTransformer` for event streaming operations triggered in an edge case where customer subscriber signals `Subscription#request` the same time as `SdkPublisher` signals `Subscriber#onComplete`
    - Reduced netty client logging noise, by logging at a DEBUG level (instead of WARN) when encountering IO errors on channels not currently in use and not logging the whole stack trace.
    - Removed broken client methods: `BackupClient#getSupportedResourceTypes()` and `PinpointSmsVoiceClient.listConfigurationSets()`.

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces support for GPU workloads by enabling you to create clusters with GPU-enabled container instances.

## __Amazon WorkSpaces__
  - ### Features
    - This release sets ClientProperties as a required parameter.

## __Application Auto Scaling__
  - ### Features
    - Documentation updates for application-autoscaling

## __Netty NIO HTTP Client__
  - ### Features
    - Allows customers to enable wire logging with the Netty client at debug level.

# __2.3.9__ __2019-01-25__
## __AWS CodeCommit__
  - ### Features
    - The PutFile API will now throw new exception FilePathConflictsWithSubmodulePathException when a submodule exists at the input file path; PutFile API will also throw FolderContentSizeLimitExceededException when the total size of any folder on the path exceeds the limit as a result of the operation.

## __AWS Device Farm__
  - ### Features
    - Introduces a new rule in Device Pools - "Availability". Customers can now ensure they pick devices that are available (i.e., not being used by other customers).

## __AWS Elemental MediaLive__
  - ### Features
    - This release adds support for Frame Capture output groups and for I-frame only manifests (playlists) in HLS output groups.

## __AWS MediaConnect__
  - ### Features
    - This release adds support for tagging, untagging, and listing tags for existing AWS Elemental MediaConnect resources.

# __2.3.8__ __2019-01-24__
## __AWS CodeBuild__
  - ### Features
    - This release adds support for cross-account ECR images and private registry authentication.

## __Amazon CloudWatch Logs__
  - ### Features
    - Documentation updates for CloudWatch Logs

## __Amazon EC2 Container Registry__
  - ### Features
    - Amazon ECR updated the default endpoint URL to support AWS Private Link.

## __Amazon Pinpoint SMS and Voice Service__
  - ### Features
    - Added the ListConfigurationSets operation, which returns a list of the configuration sets that are associated with your account.

## __Amazon Relational Database Service__
  - ### Features
    - The Amazon RDS API allows you to add or remove Identity and Access Management (IAM) role associated with a specific feature name with an RDS database instance. This helps with capabilities such as invoking Lambda functions from within a trigger in the database, load data from Amazon S3 and so on

## __Elastic Load Balancing__
  - ### Features
    - Elastic Load Balancing now supports TLS termination on Network Load Balancers. With this launch, you can offload the decryption/encryption of TLS traffic from your application servers to the Network Load Balancer. This enables you to run your backend servers optimally and keep your workloads secure. Additionally, Network Load Balancers preserve the source IP of the clients to the back-end applications, while terminating TLS on the load balancer. When TLS is enabled on an NLB, Access Logs can be enabled for the load balancer, and log entries will be emitted for all TLS connections.

# __2.3.7__ __2019-01-23__
## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - Added TagOnCreate parameter to the CreateCertificateAuthority operation, updated the Tag regex pattern to align with AWS tagging APIs, and added RevokeCertificate limit.

## __AWS SDK for Java v2__
  - ### Features
    - Redact potentially-sensitive data from the `toString` of service request and response objects.

  - ### Bugfixes
    - Fixed the time marshalling issue when CBOR is disabled. See [#1023](https://github.com/aws/aws-sdk-java-v2/issues/1023)

## __Amazon WorkLink__
  - ### Features
    - This is the initial SDK release for Amazon WorkLink. Amazon WorkLink is a fully managed, cloud-based service that enables secure, one-click access to internal websites and web apps from mobile phones. With Amazon WorkLink, employees can access internal websites as seamlessly as they access any other website. IT administrators can manage users, devices, and domains by enforcing their own security and access policies via the AWS Console or the AWS SDK.

## __AmazonApiGatewayManagementApi__
  - ### Features
    - Fixes a typo in the 'max' constraint.

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Add `OneTimeReadTimeoutHanlder` to requests with `expect: 100-continue` header to avoid unexpected `ReadTimeoutException`. See [#954](https://github.com/aws/aws-sdk-java-v2/issues/954)

# __2.3.6__ __2019-01-21__
## __AWS Application Discovery Service__
  - ### Features
    - The Application Discovery Service's import APIs allow you to import information about your on-premises servers and applications into ADS so that you can track the status of your migrations through the Migration Hub console.

## __AWS Database Migration Service__
  - ### Features
    - Update for DMS TestConnectionSucceeds waiter

## __Amazon AppStream__
  - ### Features
    - This API update includes support for tagging Stack, Fleet, and ImageBuilder resources at creation time.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - AWS Systems Manager State Manager now supports configuration management of all AWS resources through integration with Automation.

## __Firewall Management Service__
  - ### Features
    - This release provides support for cleaning up web ACLs during Firewall Management policy deletion. You can now enable the DeleteAllPolicyResources flag and it will delete all system-generated web ACLs.

# __2.3.5__ __2019-01-18__
## __AWS Glue__
  - ### Features
    - AllocatedCapacity field is being deprecated and replaced with MaxCapacity field

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adjust EC2's available instance types.

# __2.3.4__ __2019-01-17__
## __AWS Lambda__
  - ### Features
    - Documentation updates for AWS Lambda

## __Amazon Lightsail__
  - ### Features
    - This release adds functionality to the CreateDiskSnapshot API that allows users to snapshot instance root volumes. It also adds various documentation updates.

## __Amazon Pinpoint__
  - ### Features
    - This release updates the PutEvents operation. AppPackageName, AppTitle, AppVersionCode, SdkName fields will now be accepted as a part of the event when submitting events.

## __Amazon Rekognition__
  - ### Features
    - GetLabelDetection now returns bounding box information for common objects and a hierarchical taxonomy of detected labels. The version of the model used for video label detection is also returned. DetectModerationLabels now returns the version of the model used for detecting unsafe content.

# __2.3.3__ __2019-01-16__
## __AWS Backup__
  - ### Features
    - AWS Backup is a unified backup service designed to protect AWS services and their associated data. AWS Backup simplifies the creation, migration, restoration, and deletion of backups, while also providing reporting and auditing

## __AWS Cost Explorer Service__
  - ### Features
    - Removed Tags from the list of GroupBy dimensions available for GetReservationCoverage.

## __Amazon DynamoDB__
  - ### Features
    - Amazon DynamoDB now integrates with AWS Backup, a centralized backup service that makes it easy for customers to configure and audit the AWS resources they want to backup, automate backup scheduling, set retention policies, and monitor all recent backup and restore activity. AWS Backup provides a fully managed, policy-based backup solution, simplifying your backup management, and helping you meet your business and regulatory backup compliance requirements. For more information, see the Amazon DynamoDB Developer Guide.

## __URLConnection HTTP Client__
  - ### Bugfixes
    - Fix NullPointer of AbortableInputStream delegate if there is no body within UrlConnectionHttpClient

# __2.3.2__ __2019-01-14__
## __AWS Elemental MediaConvert__
  - ### Features
    - IMF decode from a Composition Playlist for IMF specializations App [#2](https://github.com/aws/aws-sdk-java-v2/issues/2) and App [#2](https://github.com/aws/aws-sdk-java-v2/issues/2)e; up to 99 input clippings; caption channel selection for MXF; and updated rate control for CBR jobs. Added support for acceleration in preview

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fixed the bug where query parameters are incorrectly moved to body in async clients. See [#958](https://github.com/aws/aws-sdk-java-v2/issues/958)

## __AWS Storage Gateway__
  - ### Features
    - JoinDomain API supports two more parameters: organizational unit(OU) and domain controllers. Two new APIs are introduced: DetachVolume and AttachVolume.

# __2.3.1__ __2019-01-11__
## __AWS RDS DataService__
  - ### Features
    - Documentation updates for RDS Data API.

## __AWS SDK for Java v2__
  - ### Features
    - Updated to the latest service models.

## __Amazon Elastic MapReduce__
  - ### Features
    - Documentation updates for Amazon EMR

# __2.3.0__ __2019-01-09__
## __AWS SDK for Java v2__
  - ### Features
    - Updated to the latest service models.

  - ### Bugfixes
    - ChecksumValidatingPublisher deals with any packetization of the incoming data. See https://github.com/aws/aws-sdk-java-v2/issues/965
    - Fix an issue where dates were being unmarshalled incorrectly for the CBOR protocol used by Amazon Kinesis.
    - Make default `asyncFutureCompletionExeuctor` a true multi-threads executor. See [#968](https://github.com/aws/aws-sdk-java-v2/issues/968)

## __AWS STS__
  - ### Bugfixes
    - Changed the region resolution logic for `role_arn`-based profiles: 1. Check for a `region` property in the same profile as the `role_arn` definition. 2. Check the default region chain. 3. Fall back to the global endpoint and `us-east-1` signing. Fixes [#988](https://github.com/aws/aws-sdk-java-v2/issues/988).

## __Amazon S3__
  - ### Bugfixes
    - Fix `SyncChecksumValidationInterceptor` and `AsyncChecksumValidationInterceptor` to use `long` instead of `int` for contentLength`. See [#963](https://github.com/aws/aws-sdk-java-v2/issues/963)

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Preserve interrupted flag if `Http2MultiplexedChannelPool#close()` interrupted.

## __URLConnection HTTP Client__
  - ### Bugfixes
    - Disable following redirects automatically since doing so causes SDK response handling to fail

## __core__
  - ### Features
    - Jackson 2.9.7 -> 2.9.8

# __2.2.0__ __2018-12-14__
## __AWS SDK for Java v2__
  - ### Features
    - Adds the operation name of the calling API to the ExecutionContext class. This exposes a way to get the API name from within an ExecutionInterceptor.
    - Updated to the latest service models.

## __Amazon S3__
  - ### Bugfixes
    - Modify type of S3Object#size member from integer to long. This is a breaking change for customers who are using the size() method currently
    - S3 putObject API using UrlConnectionHttpClient goes into infinite loop. See https://github.com/aws/aws-sdk-java-v2/pull/942 for more details.

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Fix a bug where it's possible for an HTTP2 channel pool to be closed while some channels are still being released causing them to be left open and leaked.

## __URLConnection HTTP Client__
  - ### Features
    - Adding a hook to enable custom creation of the initial `HttpURLConnection`. This enables customers to control how a connection is established for a given `URL` including handling any required proxy configuration etc.

# __2.1.4__ __2018-12-07__
## __AWS CodeDeploy__
  - ### Features
    - Supporting AWS CodeDeploy

## __AWS SDK for Java v2__
  - ### Features
    - Add `modifyException` API to `ExecutionInterceptor`.
    - Add application/gzip mime type
    - Update spot bugs version to 3.1.9
    - Updated to the latest service models.

  - ### Bugfixes
    - Fix infinite stream of results bug in auto paginator APIs when the next token is an empty string
    - Fixes nullpointerexception when server responds with null values in map.
    - Use the class loader that loaded the SDK to load the HTTP implementations. See [#56](https://github.com/aws/aws-sdk-java-v2/issues/56)

## __Amazon S3__
  - ### Bugfixes
    - Turns off trailing checksums when using SSE-C or SSE-KMS
    - Update S3 headObject/headBucket operations to throw NoSuchKey/NoSuchException when S3 is returning 404. See [#123](https://github.com/aws/aws-sdk-java-v2/issues/123), [#544](https://github.com/aws/aws-sdk-java-v2/issues/544)

## __Netty NIO Async HTTP Client__
  - ### Bugfixes
    - Close created `ChannelPool`s in `close()` method.
    - Fix the issue where streaming requests with `Expect: 100-continue` header sometimes are hanging because 100Continue response message is not being read automatically. See [#459](https://github.com/aws/aws-sdk-java-v2/issues/459)

## __core__
  - ### Features
    - Netty 4.1.32.Final

# __2.1.3__ __2018-11-29__
## __AWS SDK for Java v2__
  - ### Features
    - Updated to the latest service models.

# __2.1.2__ __2018-11-28__
## __AWS SDK for Java v2__
  - ### Features
    - Updated to the latest service models.

## __core__
  - ### Features
    - Jackson 2.9.6 -> 2.9.7

# __2.1.1__ __2018-11-27__
## __AWS Organizations__
  - ### Bugfixes
    - Add `organizations` to `aws-sdk-java` module.

## __AWS SDK for Java V2__
  - ### Bugfixes
    - Fixes Issue [#864](https://github.com/aws/aws-sdk-java-v2/issues/864) by checking for embedded JSON objects while unmarshalling bytes.

## __AWS SDK for Java v2__
  - ### Features
    - Updated to the latest service models.
    - Updated to the latest service models.

  - ### Bugfixes
    - Fix async pagination javadocs to use the correct method name `SdkPublisher#subscribe`.
    - Fixed an issue where close() and abort() weren't being honored for streaming responses in all cases.
    - Preserve computedChecksum in `ChecksumValidatingInputStream` so that it doesn't throw error if it validates more than once. See [#873](https://github.com/aws/aws-sdk-java-v2/issues/873)

# __2.1.0__ __2018-11-19__
## __AWS SDK for Java v2__
  - ### Features
    - AWS SDK for Java v2 is generally available now. To get started, please see this [blog post](https://aws.amazon.com/blogs/developer/aws-sdk-for-java-2-x-released/).
    - Update Netty version to Netty 4.1.31.Final

  - ### Bugfixes
    - Temporarily removed OSGi support because the Netty HTTP client does not yet support it. See [#726](https://github.com/aws/aws-sdk-java-v2/issues/726)

## __Netty NIO Async HTTP Client__
  - ### Bugfixes
    - Not invoke fireExceptionCaught if the channel is not active. see [#452](https://github.com/aws/aws-sdk-java-v2/issues/452)

# __2.0.0-preview-13__ __2018-11-13__
## __AWS SDK for Java v2__
  - ### Features
    - Add `Automatic-Module-Name` manifest entry.
    - Add `AwsResponseMetadata` support to allow users to retrieve metadata information such as `requestId`, `extendedRequestId` from the response. see [#670](https://github.com/aws/aws-sdk-java-v2/issues/670)
    - Add apiCallTimeout and apiCallAttemptTimeout feature for synchronous calls.
    - Guava 23.0 -> 26.0
    - upgrade maven-bundle-plugin -> 4.0.0

  - ### Bugfixes
    - Attach `SdkHttpResponse` to the responses of event streaming operations.

## __AWS Security Token Service__
  - ### Features
    - Added supplier functionality to StsAssumeRoleWithSamlCredentialProvider.  This allows for the saml assertion to be refreshed before getting new credentials from STS.

## __AWS Step Function__
  - ### Removals
    - Remove AWS Step Function high level library for now. We will add them in the future.

## __Amazon S3__
  - ### Features
    - Add support for automatically decoding URL-encoded parts of the ListObjects and ListObjectsV2 responses. See https://docs.aws.amazon.com/AmazonS3/latest/API/v2-RESTBucketGET.html and https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGET.html.

  - ### Bugfixes
    - Update S3 `EndpointAddressInterceptor` to honor request protocol.

## __Apache HTTP Client__
  - ### Features
    - Add support for idle connection reaping.

## __core__
  - ### Features
    - Apache HttpClient 4.5.5 -> 4.5.6
    - Netty 4.1.28 -> 4.1.30

# __2.0.0-preview-12__ __2018-09-18__
## __AWS SDK for Java v2__
  - ### Features
    - Add mfa_serial to ProfileProperty
    - Allow clients to add Socket Channel Option
    - Implement apiCallAttemptTimeout and apiCallTimeout feature for asynchrounous calls. Customers can specify timeout via `ClientOverrideConfiguaration.Builder#apiCallTimeout(Duration)` or `RequestOverrideConfiguration.Builder#apiCallAttemptTimeout(Duration)`. Note: this feature is only implemented for asynchrounous api calls.
    - Improve logging for debuggability. see `SdkStandardLogger`.
    - Refactored all services to make module names match the service id from the service model
    - Removed sdk-core dependency from the profiles module. This allows reading from profile files without pulling in the rest of the SDK.
    - Replacing legacy `HttpResponse` with `SdkHttpFullResponse`.
    - Update service models to be current as of 2018-09-07.

  - ### Bugfixes
    - Fix Response Fetcher hasNextPage to check if the output token is non null or non empty if it is a collection or map type. Related to [#677](https://github.com/aws/aws-sdk-java-v2/issues/677)
    - RetryPolicy bug fix: adding throttlingBackoffStrategy to `RetryPolicy.Builder`. see [#646](https://github.com/aws/aws-sdk-java-v2/issues/646)

## __AWS STS__
  - ### Features
    - Add the ability to provide a Supplier<AssumeRoleRequest> to StsAssumeRoleCredentialsProvider

## __Aamazon S3__
  - ### Bugfixes
    - Fix NPE for S3 GET request using http protocol. see [#612](https://github.com/aws/aws-sdk-java-v2/issues/612)

## __Amazon SimpleDB__
  - ### Removals
    - Amazon SimpleDB module is removed from the SDK 2.0. To use SimpleDB, use SDK 1.11.x. Note that you can run SDK 1.11 and 2.0 in the same application.

## __runtime__
  - ### Bugfixes
    - Netty 4.1.26.Final -> 4.1.28.Final

# __2.0.0-preview-11__ __2018-07-30__
## __AWS SDK for Java v2__
  - ### Features
    - Accept `SdkBytes` and `byte[]` instead of `ByteBuffer` in generated setters.
    - Add support to disable EC2 instance metadata service usage via environment variable and system property. [#430](https://github.com/aws/aws-sdk-java-v2/issues/430)
    - Caching `XPathFactory` to improve performance of exception handling for services using XML protocol
    - Exceptions use builders and are immutable.
    - Incorporate the [Reactive Streams Technology Compatibility Kit](https://github.com/reactive-streams/reactive-streams-jvm/tree/master/tck) and ensure current implementations are compliant. [#519](https://github.com/aws/aws-sdk-java-v2/issues/519)
    - Modules (annotations, auth, sdk-core, aws-core, profiles, regions) are refactored under the core module.
    - Refactor signer interfaces to be independent from Amazon/AWS specific classes. Signer interfaces expose a sign method that takes in the request to sign and ExecutionAttributes instance. Parameters needed for signing are to be passed through ExecutionAttributes. SDK signer implementations have overloaded sign methods that can take either generic ExecutionAttributes or modeled params classes as convenience for customers.
    - Region class clean up including the following: - Flattened GovCloud - Renamed `Region.value()` to `Region.id()` - Dropped `get` prefix in the method names. eg: `getRegions()` -> `regions()`
    - Renamed all non-service enums to be singular, not plural.
    - Renaming `SdkBuilder.apply()` -> `SdkBuilder.applyMutation()` and renaming `ResponseTransformer.apply()` to `ResponseTransformer.transform()`.
    - Return `SdkBytes` instead of `ByteBuffer` from generated getters.
    - Update all service models to follow V2 naming convention. eg: `WAFException` -> `WafException`
    - Update service name in clients, requests and exceptions to match 2.0 naming conventions (eg. DynamoDBClient -> DynamoDbClient)
    - Updated `AwsCredentials` to interface implemented by `AwsBasicCredentials` and `AwsSessionCredentials`. Renamed `AwsCredentialsProvider.getCredentials()` to `AwsCredentialsProvider.resolveCredentials()`.
    - Use auto constructed containers for list and map members. [#497](https://github.com/aws/aws-sdk-java-v2/pull/497), [#529](https://github.com/aws/aws-sdk-java-v2/pull/529), [#600](https://github.com/aws/aws-sdk-java-v2/pull/600)
    - Various AsyncClient Refactors:\n - Drop async prefix in `SdkAyncClientBuilder`: `SdkAsyncClientBuilder.asyncHttpClientBuilder() -> SdkAsyncClientBuilder.httpClientBuilder()`\n - Create `SdkEventLoopGroup` to allow users to provide `EventLoopGroup` and `ChannelFactory`.
    - upgrade Netty 4.1.22.Final to Netty 4.1.26.Final

  - ### Deprecations
    - Deprecating `QueryStringSigner` in favor of `Aws4Signer`.

  - ### Removals
    - Make paginators resume method private.(We will re-add the feature in the future)
    - Removing gzipEnabled client configuration.

## __AWS WAF Regional__
  - ### Features
    - AWS Waf Regional clients are now in `software.amazon.awssdk.services.waf.regional` package.

## __Amazon DynamoDB__
  - ### Features
    - Add default DynamoDB specific retry policy.
    - Update DynamoDB default max retry count to 8. Related to [#431](https://github.com/aws/aws-sdk-java-v2/issues/431)

## __Amazon DynamoDB Streams__
  - ### Features
    - Dynamodb Streams clients are now in `software.amazon.awssdk.services.dynamodb.streams` package.

## __Amazon S3__
  - ### Features
    - Move `AWSS3V4Signer` to auth module.

## __Netty NIO Async HTTP Client__
  - ### Bugfixes
    - Fix the Netty async client to stop publishing to the request stream once `Content-Length` is reached.

# __2.0.0-preview-10__ __2018-05-25__
## __AWS SDK for Java v2__
  - ### Features
    - Add [SdkHttpResponse](https://github.com/aws/aws-sdk-java-v2/blob/master/http-client-spi/src/main/java/software/amazon/awssdk/http/SdkHttpResponse.java) to [SdkResponse](https://github.com/aws/aws-sdk-java-v2/blob/master/core/src/main/java/software/amazon/awssdk/core/SdkResponse.java) so that customers can retrieve Http data such as headers, status code from the response object.
    - Add a standard User-Agent when making requests to the metadata service.  User-Agent pattern: aws-sdk-java/<version>
    - Added Consumer<Builder>-style methods for all client overloads.
    - Added Consumer<Builder>-style methods for vararg parameters.
    - AsyncResponseTransformer byte array and string methods now match the sync model.
    - Include root causes in the exception message from AWSCredentialsProviderChain to ease troubleshooting.
    - Moved AWS specific retry policies to aws-core module, created AwsServiceException and moved isThrottlingException and isClockSkewException methods to SdkServiceException.
    - Renamed "Bytes" overload for streaming operations to "AsBytes", and "String" overload for enums to "AsString"
    - Renamed AsyncRequestProvider to AsyncRequestBody to better match sync's RequestBody
    - Renamed AsyncResponseHandler to AsyncResponseTransformer and StreamingResponseHandler to ResponseTransformer.
    - Renamed `AdvancedServiceConfiguration` to `ServiceConfiguration`
    - Renamed `RequestOverrideConfig` to `RequestOverrideConfiguration` to match `ClientOverrideConfiguration` naming.
    - Simplified configuration of HTTP clients.
    - Split core module to regions, profiles, auth, aws-core and core modules.[#27](https://github.com/aws/aws-sdk-java-v2/issues/27)
    - Updating default retry policy to include newly added conditions.

  - ### Removals
    - Remove httpRequestTimeout and totalExecutionTimeout features

## __AWS Secrets Manager__
  - ### Features
    - Add AWS Secrets Manager to v2.

## __Amazon S3__
  - ### Features
    - Renamed `S3AdvancedConfiguration` to `S3Configuration`

# __2.0.0-preview-9__ __2018-03-20__
## __AWS Lambda__
  - ### Features
    - Added latest model for new service features.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix default user agent to comply with [RFC 7231](https://tools.ietf.org/html/rfc7231#section-5.5.3). Related to [#80](https://github.com/aws/aws-sdk-java-v2/issues/80)
    - Maven artifact software.amazon.awssdk:bom no longer includes non-SDK dependencies.

# __2.0.0-preview-8__ __2018-02-02__
## __AWS SDK for Java v2__
  - ### Features
    - Added Consumer<Builder> methods to multiple locations where they were previously missing.
    - Added `SdkClient` base interface that all service clients implement.
    - Added and standardized `toString` implementations of public data classes.
    - Adding the following services from re:invent 2017:
       - Alexa For Business
       - AWS Migration Hub
       - AWS Cost Explorer
       - AWS Cloud9
       - AWS CloudHSM V2
       - Amazon Comprehend
       - AWS Glue
       - Amazon GuardDuty
       - Amazon Kinesis Video Streams
       - AWS Elemental MediaConvert
       - AWS Elemental MediaLive
       - AWS Elemental MediaPackage
       - AWS Elemental MediaStore
       - AWS Mobile
       - AmazonMQ
       - AWS Price List
       - AWS Resource Groups
       - Amazon SageMaker
       - AWS Serverless Application Repository
       - Amazon Route 53 Auto Naming
       - Amazon Translate
       - Amazon WorkMail
    - Setting `Content-Type` header for streaming requests. Related to [#357](https://github.com/aws/aws-sdk-java-v2/issues/357)
    - upgrade Netty 4.1.17.Final to 4.1.19.Final

  - ### Bugfixes
    - Fixed issue where error message in S3 exceptions could be "null" if the exception did not have a modeled type.

## __Amazon CloudWatch__
  - ### Features
    - Added pagination configuration to CloudWatch

## __Netty NIO Async HTTP Client__
  - ### Bugfixes
    - Fix race condition in the async client causing instability when making multiple concurent requests. Fixes [#202](https://github.com/aws/aws-sdk-java-v2/issues/202)

# __2.0.0-preview-7__ __2017-12-15__
## __AWS SDK for Java v2__
  - ### Features
    - Added `Bytes` methods to all streaming operations. These methods will load the service response into memory and return a `ResponseBytes` object that eases conversion into other types, like strings. eg. `String object = s3.getObjectBytes(request).asUtf8String()`. [#324](https://github.com/aws/aws-sdk-java-v2/pull/324)
    - Added `ProfileCredentialsProvider.create("profile-name")` helper to `ProfileCredentialsProvider` to account for common use-case where only profile name is provided. [#347](https://github.com/aws/aws-sdk-java-v2/pull/347)
    - Adds convenience type overloads to allow easier to use types on modeled objects. [#336](https://github.com/aws/aws-sdk-java-v2/pull/336)
    - Automatically retry streaming downloads to a file if they fail or are interrupted. [#324](https://github.com/aws/aws-sdk-java-v2/pull/324)
    - Implementation of a generic HTTP credential provider used to get credentials from an container metadata service. Replica of v1 [implementation](https://github.com/aws/aws-sdk-java/blob/master/aws-java-sdk-core/src/main/java/com/amazonaws/auth/ContainerCredentialsProvider.java#L108) [#328](https://github.com/aws/aws-sdk-java-v2/pull/328)
    - Refactors the exceptions used by the SDK. [#301](https://github.com/aws/aws-sdk-java-v2/pull/301)
    - Remove the legacy `AmazonWebServiceRequest`, `AmazonWebServiceResult`, and `AmazonWebServiceResponse` classes. They are replaced with `AwsRequest` and `AwsResponse`. [#289](https://github.com/aws/aws-sdk-java-v2/issues/289)
    - Updated profile-based region and credential loading to more closely mirror the behavior in the AWS CLI. Notably, profile names in `~/.aws/config` must be prefixed with "profile " (except for the default profile) and profile names in `~/.aws/credentials` must not be prefixed with "profile ". [#296](https://github.com/aws/aws-sdk-java-v2/pull/296)
    - Upgrade maven-compiler-plugin from 3.6.0 to 3.7.0
    - Upgraded dependencies
       * Wiremock (com.github.tomakehurst:wiremock) 1.55 -> 2.12.0
       * Json Path (com.jayway.jsonpath:json-path) 2.2.0 -> 2.4.0
    - upgrade to Jackson 2.9.3

  - ### Removals
    - Remove easymock as a dependency, mockito should be used for all mocking going forward. [#348](https://github.com/aws/aws-sdk-java-v2/pull/348)
    - Removed the following unused dependencies [#349](https://github.com/aws/aws-sdk-java-v2/issues/349):
       * org.eclipse:text
       * info.cukes:cucumber-java
       * info.cukes:cucumber-junit
       * info.cukes:cucumber-guice
       * com.google.inject:guice
       * org.bouncycastle:bcprov-jdk15on
       * com.google.guava:guava
       * io.burt:jmespath-jackson
       * javax.annotation:javax.annotation-api

## __Amazon S3__
  - ### Bugfixes
    - Fixing exception unmarshalling for S3. [#297](https://github.com/aws/aws-sdk-java-v2/issues/297)

## __Netty NIO Async HTTP Client__
  - ### Bugfixes
    - Fixes Issue [#340](https://github.com/aws/aws-sdk-java-v2/issues/340) where connection acquisition time was calculated incorrectly in the Netty client.

# __2.0.0-preview-6__ __2017-12-06__
## __AWS AppSync__
  - ### Features
    - Adding AWS AppSync based on customer request. [#318](https://github.com/aws/aws-sdk-java-v2/pull/318)

## __AWS Lambda__
  - ### Removals
    - Removed high-level utilities. [#247](https://github.com/aws/aws-sdk-java-v2/pull/247)

## __AWS SDK for Java v2__
  - ### Features
    - Add paginators-1.json file for some services [#298](https://github.com/aws/aws-sdk-java-v2/pull/298)
    - Added a primitive `Waiter` class for simplifying poll-until-condition-is-met behavior. [#300](https://github.com/aws/aws-sdk-java-v2/pull/300)
    - Adding Consumer<Builder> to overrideConfiguration on ClientBuilder [#291](https://github.com/aws/aws-sdk-java-v2/pull/291)
    - Adding helper to Either that allows construction from two possibly null values [#292](https://github.com/aws/aws-sdk-java-v2/pull/292)
    - Adding knownValues static to enum generation [#218](https://github.com/aws/aws-sdk-java-v2/pull/218)
    - Adding validation to Region class [#261](https://github.com/aws/aws-sdk-java-v2/pull/261)
    - Converted all wiremock tests to run as part of the build. [#260](https://github.com/aws/aws-sdk-java-v2/pull/260)
    - Enhanced pagination for synchronous clients[#207](https://github.com/aws/aws-sdk-java-v2/pull/207)
    - Implementing Consumer<Builder> fluent setter pattern on client operations [#280](https://github.com/aws/aws-sdk-java-v2/pull/280)
    - Implementing Consumer<Builder> fluent setters pattern on model builders. [#278](https://github.com/aws/aws-sdk-java-v2/pull/278)
    - Making it easier to supply async http configuration. [#274](https://github.com/aws/aws-sdk-java-v2/pull/274)
    - Refactoring retry logic out to separate class [#177](https://github.com/aws/aws-sdk-java-v2/pull/177)
    - Removing unnecessary javax.mail dependency [#312](https://github.com/aws/aws-sdk-java-v2/pull/312)
    - Replacing constructors with static factory methods [#284](https://github.com/aws/aws-sdk-java-v2/pull/284)
    - Retry policy refactor [#190](https://github.com/aws/aws-sdk-java-v2/pull/190)
    - Update latest models for existing services [#299](https://github.com/aws/aws-sdk-java-v2/pull/299)
    - Upgrade dependencies to support future migration to Java 9. [#271](https://github.com/aws/aws-sdk-java-v2/pull/271)
    - Upgraded dependencies:
      * javapoet 1.8.0 -> 1.9.0 [#311](https://github.com/aws/aws-sdk-java-v2/pull/311)
      * Apache HttpClient 4.5.2 -> 4.5.4 [#308](https://{github.com/aws/aws-sdk-java-v2/pull/308)
      * Jackson 2.9.1 -> 2.9.2 [#310](https://github.com/aws/aws-sdk-java-v2/pull/310)
      * Netty 4.1.13 -> 4.1.17 [#309](https://github.com/{aws/aws-sdk-java-v2/pull/309)
    - Use java.util.Objects to implement equals, hashCode [#294](https://github.com/aws/aws-sdk-java-v2/pull/294)

  - ### Bugfixes
    - Attempting to fix class-loader exception raised on gitter. [#216](https://github.com/aws/aws-sdk-java-v2/pull/216)
    - Call doClose in HttpClientDependencies#close method [#268](https://github.com/aws/aws-sdk-java-v2/pull/268)
    - Fixing bundle exports [#281](https://github.com/aws/aws-sdk-java-v2/pull/281)

  - ### Removals
    - Delete old jmespath AST script [#266](https://github.com/aws/aws-sdk-java-v2/pull/266)
    - Remove current waiter implementation. [#258](https://github.com/aws/aws-sdk-java-v2/pull/258)
    - Removed policy builder. [#259](https://github.com/aws/aws-sdk-java-v2/pull/259)
    - Removed progress listeners until they can be updated to V2 standards. [#285](https://github.com/aws/aws-sdk-java-v2/pull/285)

## __Amazon CloudFront__
  - ### Removals
    - Removed high-level cloudfront utilities. [#242](https://github.com/aws/aws-sdk-java-v2/pull/242)

## __Amazon DynamoDB__
  - ### Features
    - Adding some helpers for being able to create DyanmoDB AttributeValues. [#276](https://github.com/aws/aws-sdk-java-v2/pull/276)

  - ### Bugfixes
    - Fixed TableUtils that broke with enum change. [#235](https://github.com/aws/aws-sdk-java-v2/pull/235)

## __Amazon EC2__
  - ### Removals
    - Removed high-level utilities. [#244](https://github.com/aws/aws-sdk-java-v2/pull/244)

## __Amazon EMR__
  - ### Removals
    - Removed high-level utilities. [#245](https://github.com/aws/aws-sdk-java-v2/pull/245)

## __Amazon Glacier__
  - ### Removals
    - Removed high-level utilities. [#246](https://github.com/aws/aws-sdk-java-v2/pull/246)

## __Amazon Polly__
  - ### Removals
    - Removed polly presigners until they can be updated for V2. [#287](https://github.com/aws/aws-sdk-java-v2/pull/287)

## __Amazon S3__
  - ### Features
    - Adding utility that creates temporary bucket name using user-name  [#234](https://github.com/aws/aws-sdk-java-v2/pull/234)

## __Amazon SES__
  - ### Removals
    - Removed high-level utilities. [#248](https://github.com/aws/aws-sdk-java-v2/pull/248)

## __Amazon SNS__
  - ### Removals
    - Removed high-level utilities. [#255](https://github.com/aws/aws-sdk-java-v2/pull/255)

## __Amazon SQS__
  - ### Bugfixes
    - Porting SQS test to make use of async and hopefully resolve the bug [#240](https://github.com/aws/aws-sdk-java-v2/pull/240)

  - ### Removals
    - Removed high-level utilities and the interceptor that rewrites the endpoint based on the SQS queue. [#238](https://github.com/aws/aws-sdk-java-v2/pull/238)

## __Amazon SimpleDB__
  - ### Removals
    - Removed high-level utilities and unused response metadata handler. [#249](https://github.com/aws/aws-sdk-java-v2/pull/249)

## __Netty NIO Async HTTP Client__
  - ### Features
    - Adding socket resolver helper that will load the appropriate SocketChannel [#293](https://github.com/aws/aws-sdk-java-v2/pull/293)

  - ### Bugfixes
    - Netty spurious timeout error fix [#283](https://github.com/aws/aws-sdk-java-v2/pull/283)
    - Temporarily disable epoll [#254](https://github.com/aws/aws-sdk-java-v2/pull/254)

# __2.0.0-preview-5__ __2017-10-17__
## __AWS SDK for Java v2__
  - ### Features
    - Asynchronous request handler for strings `AsyncRequestProvider.fromString("hello world!!!")` [PR #183](https://github.com/aws/aws-sdk-java-v2/pull/183)
    - General HTTP core clean-up [PR #178](https://github.com/aws/aws-sdk-java-v2/pull/178)
    - Get value from request POJO using member model names `String bucketName = s3PutObjectResponse.getValueForField("Bucket", String.class);` [PR #144](https://github.com/aws/aws-sdk-java-v2/pull/144)
    - Model enums on service POJOs [PR #195](https://github.com/aws/aws-sdk-java-v2/pull/195)
    - Move `core` classes to their own package `software.amazon.awssdk.core` [PR #194](https://github.com/aws/aws-sdk-java-v2/pull/194)

  - ### Bugfixes
    - Resolve potential security issue handling DTD entities [PR #198](https://github.com/aws/aws-sdk-java-v2/pull/198)
    - Serialization/deserialization of complex model objects [PR #128](https://github.com/aws/aws-sdk-java-v2/pull/128) / [Issue #121](https://github.com/aws/aws-sdk-java-v2/issues/121)

## __Amazon S3__
  - ### Features
    - Handle 100-continue header for PUT object [PR #169](https://github.com/aws/aws-sdk-java-v2/pull/169)

## __Netty NIO Async HTTP Client__
  - ### Bugfixes
    - Better handling of event-loop selection for AWS Lambda container [PR #208](https://github.com/aws/aws-sdk-java-v2/pull/208)
    - Data corruption fix in streaming responses and stability fixes [PR #173](https://github.com/aws/aws-sdk-java-v2/pull/173)

# __2.0.0-preview-4__ __2017-09-19__
## __AWS SDK for Java v2__
  - ### Features
    - Added convenience methods for both sync and async streaming operations for file based uploads/downloads.
    - Added some convenience implementation of [AsyncResponseHandler](https://github.com/aws/aws-sdk-java-v2/blob/master/core/src/main/java/software/amazon/awssdk/async/AsyncResponseHandler.java) to emit to a byte array or String.
    - Immutable objects can now be modified easily with a newly introduced [copy](https://github.com/aws/aws-sdk-java-v2/blob/master/utils/src/main/java/software/amazon/awssdk/utils/builder/ToCopyableBuilder.java#L42) method that applies a transformation on the builder for the object and returns a new immutable object.
    - Major refactor of RequestHandler interfaces. Newly introduced [ExecutionInterceptors](https://github.com/aws/aws-sdk-java-v2/blob/master/core/src/main/java/software/amazon/awssdk/interceptor/ExecutionInterceptor.java) have a cleaner, more consistent API and are much more powerful.
    - S3's CreateBucket no longer requires the location constraint to be specified, it will be inferred from the client region if not present.
    - The [File](https://github.com/aws/aws-sdk-java-v2/blob/master/core/src/main/java/software/amazon/awssdk/sync/StreamingResponseHandler.java#L92) and [OutputStream](https://github.com/aws/aws-sdk-java-v2/blob/master/core/src/main/java/software/amazon/awssdk/sync/StreamingResponseHandler.java#L107) implementations of StreamingResponseHandler now return the POJO response in onComplete.

  - ### Bugfixes
    - Fixed a bug in default credential provider chain where it would erroneously abort at the ProfileCredentialsProvider. See [Issue #135](https://github.com/aws/aws-sdk-java-v2/issues/135)
    - Many improvements and fixes to the Netty NIO based transport.
    - Several fixes around S3's endpoint resolution, particularly with advanced options like path style addressing and accelerate mode. See [Issue #130](https://github.com/aws/aws-sdk-java-v2/issues/130)
    - Several fixes around serialization and deserialization of immutable objects. See [Issue #122](https://github.com/aws/aws-sdk-java-v2/issues/122)
    - Type parameters are now correctly included for [StreamingResponseHandler](https://github.com/aws/aws-sdk-java-v2/blob/master/core/src/main/java/software/amazon/awssdk/sync/StreamingResponseHandler.java) on the client interface.

  - ### Removals
    - Dependency on JodaTime has been dropped in favor of Java 8's APIS.
    - DynamoDBMapper and DynamoDB Document API have been removed.
    - Metrics subsystem has been removed.

# __2.0.0-preview-2__ __2017-07-21__
## __AWS SDK for Java v2__
  - ### Features
    - New pluggable HTTP implementation built on top of Java's HttpUrlConnection. Good choice for simple applications with low throughput requirements. Better cold start latency than the default Apache implementation.
    - Simple convenience methods have been added for operations that require no input parameters.
    - Substantial improvements to start up time and cold start latencies
    - The Netty NIO HTTP client now uses a shared event loop group for better resource management. More options for customizing the event loop group are now available.
    - Using java.time instead of the legacy java.util.Date in generated model classes.
    - Various improvements to the immutability of model POJOs. ByteBuffers are now copied and collections are returned as unmodifiable.

# __2.0.0-preview-1__ __2017-06-28__
## __AWS SDK for Java v2__
  - ### Features
    - Initial release of the AWS SDK for Java v2. See our [blog post](https://aws.amazon.com/blogs/developer/aws-sdk-for-java-2-0-developer-preview) for information about this new major version. This release is considered a developer preview and is not intended for production use cases.

