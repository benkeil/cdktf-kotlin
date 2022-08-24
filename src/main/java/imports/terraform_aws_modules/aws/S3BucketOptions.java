package imports.terraform_aws_modules.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-23T18:39:12.185Z")
@software.amazon.jsii.Jsii(module = imports.terraform_aws_modules.aws.$Module.class, fqn = "terraform-aws-modules_s3-bucket_aws.S3BucketOptions")
@software.amazon.jsii.Jsii.Proxy(S3BucketOptions.Jsii$Proxy.class)
public interface S3BucketOptions extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformModuleUserOptions {

    /**
     * (Optional) Sets the accelerate configuration of an existing bucket.
     * <p>
     * Can be Enabled or Suspended.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAccelerationStatus() {
        return null;
    }

    /**
     * (Optional) The canned ACL to apply.
     * <p>
     * Conflicts with <code>grant</code>
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAcl() {
        return null;
    }

    /**
     * Controls if S3 bucket should have deny non-SSL transport policy attached.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachDenyInsecureTransportPolicy() {
        return null;
    }

    /**
     * Controls if S3 bucket should have ELB log delivery policy attached.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachElbLogDeliveryPolicy() {
        return null;
    }

    /**
     * Controls if S3 bucket should have ALB/NLB log delivery policy attached.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachLbLogDeliveryPolicy() {
        return null;
    }

    /**
     * Controls if S3 bucket should have bucket policy attached (set to `true` to use value of `policy` as bucket policy).
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPolicy() {
        return null;
    }

    /**
     * Controls if a user defined public bucket policy will be attached (set to `false` to allow upstream to apply defaults to the bucket).
     * <p>
     * Default: true
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPublicPolicy() {
        return null;
    }

    /**
     * Controls if S3 bucket should require the latest version of TLS.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachRequireLatestTlsPolicy() {
        return null;
    }

    /**
     * Whether Amazon S3 should block public ACLs for this bucket.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getBlockPublicAcls() {
        return null;
    }

    /**
     * Whether Amazon S3 should block public bucket policies for this bucket.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getBlockPublicPolicy() {
        return null;
    }

    /**
     * (Optional, Forces new resource) The name of the bucket.
     * <p>
     * If omitted, Terraform will assign a random, unique name.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getBucket() {
        return null;
    }

    /**
     * (Optional, Forces new resource) Creates a unique bucket name beginning with the specified prefix.
     * <p>
     * Conflicts with bucket.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getBucketPrefix() {
        return null;
    }

    /**
     * Whether to manage S3 Bucket Ownership Controls on this bucket.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getControlObjectOwnership() {
        return null;
    }

    /**
     * List of maps containing rules for Cross-Origin Resource Sharing.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getCorsRule() {
        return null;
    }

    /**
     * Controls if S3 bucket should be created.
     * <p>
     * Default: true
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateBucket() {
        return null;
    }

    /**
     * The account ID of the expected bucket owner.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getExpectedBucketOwner() {
        return null;
    }

    /**
     * (Optional, Default:false ) A boolean that indicates all objects should be deleted from the bucket so that the bucket can be destroyed without error.
     * <p>
     * These objects are not recoverable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getForceDestroy() {
        return null;
    }

    /**
     * An ACL policy grant.
     * <p>
     * Conflicts with <code>acl</code>
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getGrant() {
        return null;
    }

    /**
     * Whether Amazon S3 should ignore public ACLs for this bucket.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIgnorePublicAcls() {
        return null;
    }

    /**
     * Map containing intelligent tiering configuration.
     * <p>
     * Default: [object Object]
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getIntelligentTiering() {
        return null;
    }

    /**
     * List of maps containing configuration of object lifecycle management.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getLifecycleRule() {
        return null;
    }

    /**
     * Map containing access bucket logging configuration.
     * <p>
     * Default: [object Object]
     * The property type contains a map, they have special handling, please see {@link cdk.tf/module-map-inputs the docs}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getLogging() {
        return null;
    }

    /**
     * Map containing S3 object locking configuration.
     * <p>
     * Default: [object Object]
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getObjectLockConfiguration() {
        return null;
    }

    /**
     * Whether S3 bucket should have an Object Lock configuration enabled.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getObjectLockEnabled() {
        return null;
    }

    /**
     * Object ownership.
     * <p>
     * Valid values: BucketOwnerEnforced, BucketOwnerPreferred or ObjectWriter. 'BucketOwnerEnforced': ACLs are disabled, and the bucket owner automatically owns and has full control over every object in the bucket. 'BucketOwnerPreferred': Objects uploaded to the bucket change ownership to the bucket owner if the objects are uploaded with the bucket-owner-full-control canned ACL. 'ObjectWriter': The uploading account will own the object if the object is uploaded with the bucket-owner-full-control canned ACL.
     * <p>
     * Default: ObjectWriter
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getObjectOwnership() {
        return null;
    }

    /**
     * Bucket owner's display name and ID.
     * <p>
     * Conflicts with <code>acl</code>
     * <p>
     * Default: [object Object]
     * The property type contains a map, they have special handling, please see {@link cdk.tf/module-map-inputs the docs}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getOwner() {
        return null;
    }

    /**
     * (Optional) A valid bucket policy JSON document.
     * <p>
     * Note that if the policy document is not specific enough (but still valid), Terraform may view the policy as constantly changing in a terraform plan. In this case, please make sure you use the verbose/specific version of the policy. For more information about building AWS IAM policy documents with Terraform, see the AWS IAM Policy Document Guide.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPolicy() {
        return null;
    }

    /**
     * Do you agree that Putin doesn't respect Ukrainian sovereignty and territorial integrity?
     * <p>
     * More info: https://en.wikipedia.org/wiki/Putin_khuylo!
     * <p>
     * Default: true
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getPutinKhuylo() {
        return null;
    }

    /**
     * Map containing cross-region replication configuration.
     * <p>
     * Default: [object Object]
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getReplicationConfiguration() {
        return null;
    }

    /**
     * (Optional) Specifies who should bear the cost of Amazon S3 data transfer.
     * <p>
     * Can be either BucketOwner or Requester. By default, the owner of the S3 bucket would incur the costs of any data transfer. See Requester Pays Buckets developer guide for more information.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRequestPayer() {
        return null;
    }

    /**
     * Whether Amazon S3 should restrict public bucket policies for this bucket.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getRestrictPublicBuckets() {
        return null;
    }

    /**
     * Map containing server-side encryption configuration.
     * <p>
     * Default: [object Object]
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getServerSideEncryptionConfiguration() {
        return null;
    }

    /**
     * (Optional) A mapping of tags to assign to the bucket.
     * <p>
     * Default: [object Object]
     * The property type contains a map, they have special handling, please see {@link cdk.tf/module-map-inputs the docs}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * Map containing versioning configuration.
     * <p>
     * Default: [object Object]
     * The property type contains a map, they have special handling, please see {@link cdk.tf/module-map-inputs the docs}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getVersioning() {
        return null;
    }

    /**
     * Map containing static web-site hosting or redirect configuration.
     * <p>
     * Default: [object Object]
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getWebsite() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3BucketOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketOptions> {
        java.lang.String accelerationStatus;
        java.lang.String acl;
        java.lang.Boolean attachDenyInsecureTransportPolicy;
        java.lang.Boolean attachElbLogDeliveryPolicy;
        java.lang.Boolean attachLbLogDeliveryPolicy;
        java.lang.Boolean attachPolicy;
        java.lang.Boolean attachPublicPolicy;
        java.lang.Boolean attachRequireLatestTlsPolicy;
        java.lang.Boolean blockPublicAcls;
        java.lang.Boolean blockPublicPolicy;
        java.lang.String bucket;
        java.lang.String bucketPrefix;
        java.lang.Boolean controlObjectOwnership;
        java.lang.Object corsRule;
        java.lang.Boolean createBucket;
        java.lang.String expectedBucketOwner;
        java.lang.Boolean forceDestroy;
        java.lang.Object grant;
        java.lang.Boolean ignorePublicAcls;
        java.lang.Object intelligentTiering;
        java.lang.Object lifecycleRule;
        java.util.Map<java.lang.String, java.lang.String> logging;
        java.lang.Object objectLockConfiguration;
        java.lang.Boolean objectLockEnabled;
        java.lang.String objectOwnership;
        java.util.Map<java.lang.String, java.lang.String> owner;
        java.lang.String policy;
        java.lang.Boolean putinKhuylo;
        java.lang.Object replicationConfiguration;
        java.lang.String requestPayer;
        java.lang.Boolean restrictPublicBuckets;
        java.lang.Object serverSideEncryptionConfiguration;
        java.util.Map<java.lang.String, java.lang.String> tags;
        java.util.Map<java.lang.String, java.lang.String> versioning;
        java.lang.Object website;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        java.util.List<java.lang.Object> providers;
        java.lang.Boolean skipAssetCreationFromLocalModules;

        /**
         * Sets the value of {@link S3BucketOptions#getAccelerationStatus}
         * @param accelerationStatus (Optional) Sets the accelerate configuration of an existing bucket.
         *                           Can be Enabled or Suspended.
         * @return {@code this}
         */
        public Builder accelerationStatus(java.lang.String accelerationStatus) {
            this.accelerationStatus = accelerationStatus;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getAcl}
         * @param acl (Optional) The canned ACL to apply.
         *            Conflicts with <code>grant</code>
         * @return {@code this}
         */
        public Builder acl(java.lang.String acl) {
            this.acl = acl;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getAttachDenyInsecureTransportPolicy}
         * @param attachDenyInsecureTransportPolicy Controls if S3 bucket should have deny non-SSL transport policy attached.
         * @return {@code this}
         */
        public Builder attachDenyInsecureTransportPolicy(java.lang.Boolean attachDenyInsecureTransportPolicy) {
            this.attachDenyInsecureTransportPolicy = attachDenyInsecureTransportPolicy;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getAttachElbLogDeliveryPolicy}
         * @param attachElbLogDeliveryPolicy Controls if S3 bucket should have ELB log delivery policy attached.
         * @return {@code this}
         */
        public Builder attachElbLogDeliveryPolicy(java.lang.Boolean attachElbLogDeliveryPolicy) {
            this.attachElbLogDeliveryPolicy = attachElbLogDeliveryPolicy;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getAttachLbLogDeliveryPolicy}
         * @param attachLbLogDeliveryPolicy Controls if S3 bucket should have ALB/NLB log delivery policy attached.
         * @return {@code this}
         */
        public Builder attachLbLogDeliveryPolicy(java.lang.Boolean attachLbLogDeliveryPolicy) {
            this.attachLbLogDeliveryPolicy = attachLbLogDeliveryPolicy;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getAttachPolicy}
         * @param attachPolicy Controls if S3 bucket should have bucket policy attached (set to `true` to use value of `policy` as bucket policy).
         * @return {@code this}
         */
        public Builder attachPolicy(java.lang.Boolean attachPolicy) {
            this.attachPolicy = attachPolicy;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getAttachPublicPolicy}
         * @param attachPublicPolicy Controls if a user defined public bucket policy will be attached (set to `false` to allow upstream to apply defaults to the bucket).
         * @return {@code this}
         */
        public Builder attachPublicPolicy(java.lang.Boolean attachPublicPolicy) {
            this.attachPublicPolicy = attachPublicPolicy;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getAttachRequireLatestTlsPolicy}
         * @param attachRequireLatestTlsPolicy Controls if S3 bucket should require the latest version of TLS.
         * @return {@code this}
         */
        public Builder attachRequireLatestTlsPolicy(java.lang.Boolean attachRequireLatestTlsPolicy) {
            this.attachRequireLatestTlsPolicy = attachRequireLatestTlsPolicy;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getBlockPublicAcls}
         * @param blockPublicAcls Whether Amazon S3 should block public ACLs for this bucket.
         * @return {@code this}
         */
        public Builder blockPublicAcls(java.lang.Boolean blockPublicAcls) {
            this.blockPublicAcls = blockPublicAcls;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getBlockPublicPolicy}
         * @param blockPublicPolicy Whether Amazon S3 should block public bucket policies for this bucket.
         * @return {@code this}
         */
        public Builder blockPublicPolicy(java.lang.Boolean blockPublicPolicy) {
            this.blockPublicPolicy = blockPublicPolicy;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getBucket}
         * @param bucket (Optional, Forces new resource) The name of the bucket.
         *               If omitted, Terraform will assign a random, unique name.
         * @return {@code this}
         */
        public Builder bucket(java.lang.String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getBucketPrefix}
         * @param bucketPrefix (Optional, Forces new resource) Creates a unique bucket name beginning with the specified prefix.
         *                     Conflicts with bucket.
         * @return {@code this}
         */
        public Builder bucketPrefix(java.lang.String bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getControlObjectOwnership}
         * @param controlObjectOwnership Whether to manage S3 Bucket Ownership Controls on this bucket.
         * @return {@code this}
         */
        public Builder controlObjectOwnership(java.lang.Boolean controlObjectOwnership) {
            this.controlObjectOwnership = controlObjectOwnership;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getCorsRule}
         * @param corsRule List of maps containing rules for Cross-Origin Resource Sharing.
         * @return {@code this}
         */
        public Builder corsRule(java.lang.Object corsRule) {
            this.corsRule = corsRule;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getCreateBucket}
         * @param createBucket Controls if S3 bucket should be created.
         * @return {@code this}
         */
        public Builder createBucket(java.lang.Boolean createBucket) {
            this.createBucket = createBucket;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getExpectedBucketOwner}
         * @param expectedBucketOwner The account ID of the expected bucket owner.
         * @return {@code this}
         */
        public Builder expectedBucketOwner(java.lang.String expectedBucketOwner) {
            this.expectedBucketOwner = expectedBucketOwner;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getForceDestroy}
         * @param forceDestroy (Optional, Default:false ) A boolean that indicates all objects should be deleted from the bucket so that the bucket can be destroyed without error.
         *                     These objects are not recoverable.
         * @return {@code this}
         */
        public Builder forceDestroy(java.lang.Boolean forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getGrant}
         * @param grant An ACL policy grant.
         *              Conflicts with <code>acl</code>
         * @return {@code this}
         */
        public Builder grant(java.lang.Object grant) {
            this.grant = grant;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getIgnorePublicAcls}
         * @param ignorePublicAcls Whether Amazon S3 should ignore public ACLs for this bucket.
         * @return {@code this}
         */
        public Builder ignorePublicAcls(java.lang.Boolean ignorePublicAcls) {
            this.ignorePublicAcls = ignorePublicAcls;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getIntelligentTiering}
         * @param intelligentTiering Map containing intelligent tiering configuration.
         * @return {@code this}
         */
        public Builder intelligentTiering(java.lang.Object intelligentTiering) {
            this.intelligentTiering = intelligentTiering;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getLifecycleRule}
         * @param lifecycleRule List of maps containing configuration of object lifecycle management.
         * @return {@code this}
         */
        public Builder lifecycleRule(java.lang.Object lifecycleRule) {
            this.lifecycleRule = lifecycleRule;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getLogging}
         * @param logging Map containing access bucket logging configuration.
         * @return {@code this}
         */
        public Builder logging(java.util.Map<java.lang.String, java.lang.String> logging) {
            this.logging = logging;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getObjectLockConfiguration}
         * @param objectLockConfiguration Map containing S3 object locking configuration.
         * @return {@code this}
         */
        public Builder objectLockConfiguration(java.lang.Object objectLockConfiguration) {
            this.objectLockConfiguration = objectLockConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getObjectLockEnabled}
         * @param objectLockEnabled Whether S3 bucket should have an Object Lock configuration enabled.
         * @return {@code this}
         */
        public Builder objectLockEnabled(java.lang.Boolean objectLockEnabled) {
            this.objectLockEnabled = objectLockEnabled;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getObjectOwnership}
         * @param objectOwnership Object ownership.
         *                        Valid values: BucketOwnerEnforced, BucketOwnerPreferred or ObjectWriter. 'BucketOwnerEnforced': ACLs are disabled, and the bucket owner automatically owns and has full control over every object in the bucket. 'BucketOwnerPreferred': Objects uploaded to the bucket change ownership to the bucket owner if the objects are uploaded with the bucket-owner-full-control canned ACL. 'ObjectWriter': The uploading account will own the object if the object is uploaded with the bucket-owner-full-control canned ACL.
         * @return {@code this}
         */
        public Builder objectOwnership(java.lang.String objectOwnership) {
            this.objectOwnership = objectOwnership;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getOwner}
         * @param owner Bucket owner's display name and ID.
         *              Conflicts with <code>acl</code>
         * @return {@code this}
         */
        public Builder owner(java.util.Map<java.lang.String, java.lang.String> owner) {
            this.owner = owner;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getPolicy}
         * @param policy (Optional) A valid bucket policy JSON document.
         *               Note that if the policy document is not specific enough (but still valid), Terraform may view the policy as constantly changing in a terraform plan. In this case, please make sure you use the verbose/specific version of the policy. For more information about building AWS IAM policy documents with Terraform, see the AWS IAM Policy Document Guide.
         * @return {@code this}
         */
        public Builder policy(java.lang.String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getPutinKhuylo}
         * @param putinKhuylo Do you agree that Putin doesn't respect Ukrainian sovereignty and territorial integrity?.
         *                    More info: https://en.wikipedia.org/wiki/Putin_khuylo!
         * @return {@code this}
         */
        public Builder putinKhuylo(java.lang.Boolean putinKhuylo) {
            this.putinKhuylo = putinKhuylo;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getReplicationConfiguration}
         * @param replicationConfiguration Map containing cross-region replication configuration.
         * @return {@code this}
         */
        public Builder replicationConfiguration(java.lang.Object replicationConfiguration) {
            this.replicationConfiguration = replicationConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getRequestPayer}
         * @param requestPayer (Optional) Specifies who should bear the cost of Amazon S3 data transfer.
         *                     Can be either BucketOwner or Requester. By default, the owner of the S3 bucket would incur the costs of any data transfer. See Requester Pays Buckets developer guide for more information.
         * @return {@code this}
         */
        public Builder requestPayer(java.lang.String requestPayer) {
            this.requestPayer = requestPayer;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getRestrictPublicBuckets}
         * @param restrictPublicBuckets Whether Amazon S3 should restrict public bucket policies for this bucket.
         * @return {@code this}
         */
        public Builder restrictPublicBuckets(java.lang.Boolean restrictPublicBuckets) {
            this.restrictPublicBuckets = restrictPublicBuckets;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getServerSideEncryptionConfiguration}
         * @param serverSideEncryptionConfiguration Map containing server-side encryption configuration.
         * @return {@code this}
         */
        public Builder serverSideEncryptionConfiguration(java.lang.Object serverSideEncryptionConfiguration) {
            this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getTags}
         * @param tags (Optional) A mapping of tags to assign to the bucket.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getVersioning}
         * @param versioning Map containing versioning configuration.
         * @return {@code this}
         */
        public Builder versioning(java.util.Map<java.lang.String, java.lang.String> versioning) {
            this.versioning = versioning;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getWebsite}
         * @param website Map containing static web-site hosting or redirect configuration.
         * @return {@code this}
         */
        public Builder website(java.lang.Object website) {
            this.website = website;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getProviders}
         * @param providers the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder providers(java.util.List<? extends java.lang.Object> providers) {
            this.providers = (java.util.List<java.lang.Object>)providers;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketOptions#getSkipAssetCreationFromLocalModules}
         * @param skipAssetCreationFromLocalModules the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder skipAssetCreationFromLocalModules(java.lang.Boolean skipAssetCreationFromLocalModules) {
            this.skipAssetCreationFromLocalModules = skipAssetCreationFromLocalModules;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3BucketOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketOptions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link S3BucketOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketOptions {
        private final java.lang.String accelerationStatus;
        private final java.lang.String acl;
        private final java.lang.Boolean attachDenyInsecureTransportPolicy;
        private final java.lang.Boolean attachElbLogDeliveryPolicy;
        private final java.lang.Boolean attachLbLogDeliveryPolicy;
        private final java.lang.Boolean attachPolicy;
        private final java.lang.Boolean attachPublicPolicy;
        private final java.lang.Boolean attachRequireLatestTlsPolicy;
        private final java.lang.Boolean blockPublicAcls;
        private final java.lang.Boolean blockPublicPolicy;
        private final java.lang.String bucket;
        private final java.lang.String bucketPrefix;
        private final java.lang.Boolean controlObjectOwnership;
        private final java.lang.Object corsRule;
        private final java.lang.Boolean createBucket;
        private final java.lang.String expectedBucketOwner;
        private final java.lang.Boolean forceDestroy;
        private final java.lang.Object grant;
        private final java.lang.Boolean ignorePublicAcls;
        private final java.lang.Object intelligentTiering;
        private final java.lang.Object lifecycleRule;
        private final java.util.Map<java.lang.String, java.lang.String> logging;
        private final java.lang.Object objectLockConfiguration;
        private final java.lang.Boolean objectLockEnabled;
        private final java.lang.String objectOwnership;
        private final java.util.Map<java.lang.String, java.lang.String> owner;
        private final java.lang.String policy;
        private final java.lang.Boolean putinKhuylo;
        private final java.lang.Object replicationConfiguration;
        private final java.lang.String requestPayer;
        private final java.lang.Boolean restrictPublicBuckets;
        private final java.lang.Object serverSideEncryptionConfiguration;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.util.Map<java.lang.String, java.lang.String> versioning;
        private final java.lang.Object website;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.ITerraformIterator forEach;
        private final java.util.List<java.lang.Object> providers;
        private final java.lang.Boolean skipAssetCreationFromLocalModules;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.accelerationStatus = software.amazon.jsii.Kernel.get(this, "accelerationStatus", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.acl = software.amazon.jsii.Kernel.get(this, "acl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.attachDenyInsecureTransportPolicy = software.amazon.jsii.Kernel.get(this, "attachDenyInsecureTransportPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachElbLogDeliveryPolicy = software.amazon.jsii.Kernel.get(this, "attachElbLogDeliveryPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachLbLogDeliveryPolicy = software.amazon.jsii.Kernel.get(this, "attachLbLogDeliveryPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachPolicy = software.amazon.jsii.Kernel.get(this, "attachPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachPublicPolicy = software.amazon.jsii.Kernel.get(this, "attachPublicPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachRequireLatestTlsPolicy = software.amazon.jsii.Kernel.get(this, "attachRequireLatestTlsPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.blockPublicAcls = software.amazon.jsii.Kernel.get(this, "blockPublicAcls", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.blockPublicPolicy = software.amazon.jsii.Kernel.get(this, "blockPublicPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.bucket = software.amazon.jsii.Kernel.get(this, "bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.bucketPrefix = software.amazon.jsii.Kernel.get(this, "bucketPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.controlObjectOwnership = software.amazon.jsii.Kernel.get(this, "controlObjectOwnership", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.corsRule = software.amazon.jsii.Kernel.get(this, "corsRule", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.createBucket = software.amazon.jsii.Kernel.get(this, "createBucket", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.expectedBucketOwner = software.amazon.jsii.Kernel.get(this, "expectedBucketOwner", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.forceDestroy = software.amazon.jsii.Kernel.get(this, "forceDestroy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.grant = software.amazon.jsii.Kernel.get(this, "grant", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.ignorePublicAcls = software.amazon.jsii.Kernel.get(this, "ignorePublicAcls", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.intelligentTiering = software.amazon.jsii.Kernel.get(this, "intelligentTiering", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.lifecycleRule = software.amazon.jsii.Kernel.get(this, "lifecycleRule", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.logging = software.amazon.jsii.Kernel.get(this, "logging", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.objectLockConfiguration = software.amazon.jsii.Kernel.get(this, "objectLockConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.objectLockEnabled = software.amazon.jsii.Kernel.get(this, "objectLockEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.objectOwnership = software.amazon.jsii.Kernel.get(this, "objectOwnership", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.owner = software.amazon.jsii.Kernel.get(this, "owner", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.policy = software.amazon.jsii.Kernel.get(this, "policy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.putinKhuylo = software.amazon.jsii.Kernel.get(this, "putinKhuylo", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.replicationConfiguration = software.amazon.jsii.Kernel.get(this, "replicationConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.requestPayer = software.amazon.jsii.Kernel.get(this, "requestPayer", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.restrictPublicBuckets = software.amazon.jsii.Kernel.get(this, "restrictPublicBuckets", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.serverSideEncryptionConfiguration = software.amazon.jsii.Kernel.get(this, "serverSideEncryptionConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.versioning = software.amazon.jsii.Kernel.get(this, "versioning", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.website = software.amazon.jsii.Kernel.get(this, "website", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.forEach = software.amazon.jsii.Kernel.get(this, "forEach", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformIterator.class));
            this.providers = software.amazon.jsii.Kernel.get(this, "providers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
            this.skipAssetCreationFromLocalModules = software.amazon.jsii.Kernel.get(this, "skipAssetCreationFromLocalModules", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.accelerationStatus = builder.accelerationStatus;
            this.acl = builder.acl;
            this.attachDenyInsecureTransportPolicy = builder.attachDenyInsecureTransportPolicy;
            this.attachElbLogDeliveryPolicy = builder.attachElbLogDeliveryPolicy;
            this.attachLbLogDeliveryPolicy = builder.attachLbLogDeliveryPolicy;
            this.attachPolicy = builder.attachPolicy;
            this.attachPublicPolicy = builder.attachPublicPolicy;
            this.attachRequireLatestTlsPolicy = builder.attachRequireLatestTlsPolicy;
            this.blockPublicAcls = builder.blockPublicAcls;
            this.blockPublicPolicy = builder.blockPublicPolicy;
            this.bucket = builder.bucket;
            this.bucketPrefix = builder.bucketPrefix;
            this.controlObjectOwnership = builder.controlObjectOwnership;
            this.corsRule = builder.corsRule;
            this.createBucket = builder.createBucket;
            this.expectedBucketOwner = builder.expectedBucketOwner;
            this.forceDestroy = builder.forceDestroy;
            this.grant = builder.grant;
            this.ignorePublicAcls = builder.ignorePublicAcls;
            this.intelligentTiering = builder.intelligentTiering;
            this.lifecycleRule = builder.lifecycleRule;
            this.logging = builder.logging;
            this.objectLockConfiguration = builder.objectLockConfiguration;
            this.objectLockEnabled = builder.objectLockEnabled;
            this.objectOwnership = builder.objectOwnership;
            this.owner = builder.owner;
            this.policy = builder.policy;
            this.putinKhuylo = builder.putinKhuylo;
            this.replicationConfiguration = builder.replicationConfiguration;
            this.requestPayer = builder.requestPayer;
            this.restrictPublicBuckets = builder.restrictPublicBuckets;
            this.serverSideEncryptionConfiguration = builder.serverSideEncryptionConfiguration;
            this.tags = builder.tags;
            this.versioning = builder.versioning;
            this.website = builder.website;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.providers = (java.util.List<java.lang.Object>)builder.providers;
            this.skipAssetCreationFromLocalModules = builder.skipAssetCreationFromLocalModules;
        }

        @Override
        public final java.lang.String getAccelerationStatus() {
            return this.accelerationStatus;
        }

        @Override
        public final java.lang.String getAcl() {
            return this.acl;
        }

        @Override
        public final java.lang.Boolean getAttachDenyInsecureTransportPolicy() {
            return this.attachDenyInsecureTransportPolicy;
        }

        @Override
        public final java.lang.Boolean getAttachElbLogDeliveryPolicy() {
            return this.attachElbLogDeliveryPolicy;
        }

        @Override
        public final java.lang.Boolean getAttachLbLogDeliveryPolicy() {
            return this.attachLbLogDeliveryPolicy;
        }

        @Override
        public final java.lang.Boolean getAttachPolicy() {
            return this.attachPolicy;
        }

        @Override
        public final java.lang.Boolean getAttachPublicPolicy() {
            return this.attachPublicPolicy;
        }

        @Override
        public final java.lang.Boolean getAttachRequireLatestTlsPolicy() {
            return this.attachRequireLatestTlsPolicy;
        }

        @Override
        public final java.lang.Boolean getBlockPublicAcls() {
            return this.blockPublicAcls;
        }

        @Override
        public final java.lang.Boolean getBlockPublicPolicy() {
            return this.blockPublicPolicy;
        }

        @Override
        public final java.lang.String getBucket() {
            return this.bucket;
        }

        @Override
        public final java.lang.String getBucketPrefix() {
            return this.bucketPrefix;
        }

        @Override
        public final java.lang.Boolean getControlObjectOwnership() {
            return this.controlObjectOwnership;
        }

        @Override
        public final java.lang.Object getCorsRule() {
            return this.corsRule;
        }

        @Override
        public final java.lang.Boolean getCreateBucket() {
            return this.createBucket;
        }

        @Override
        public final java.lang.String getExpectedBucketOwner() {
            return this.expectedBucketOwner;
        }

        @Override
        public final java.lang.Boolean getForceDestroy() {
            return this.forceDestroy;
        }

        @Override
        public final java.lang.Object getGrant() {
            return this.grant;
        }

        @Override
        public final java.lang.Boolean getIgnorePublicAcls() {
            return this.ignorePublicAcls;
        }

        @Override
        public final java.lang.Object getIntelligentTiering() {
            return this.intelligentTiering;
        }

        @Override
        public final java.lang.Object getLifecycleRule() {
            return this.lifecycleRule;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getLogging() {
            return this.logging;
        }

        @Override
        public final java.lang.Object getObjectLockConfiguration() {
            return this.objectLockConfiguration;
        }

        @Override
        public final java.lang.Boolean getObjectLockEnabled() {
            return this.objectLockEnabled;
        }

        @Override
        public final java.lang.String getObjectOwnership() {
            return this.objectOwnership;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getOwner() {
            return this.owner;
        }

        @Override
        public final java.lang.String getPolicy() {
            return this.policy;
        }

        @Override
        public final java.lang.Boolean getPutinKhuylo() {
            return this.putinKhuylo;
        }

        @Override
        public final java.lang.Object getReplicationConfiguration() {
            return this.replicationConfiguration;
        }

        @Override
        public final java.lang.String getRequestPayer() {
            return this.requestPayer;
        }

        @Override
        public final java.lang.Boolean getRestrictPublicBuckets() {
            return this.restrictPublicBuckets;
        }

        @Override
        public final java.lang.Object getServerSideEncryptionConfiguration() {
            return this.serverSideEncryptionConfiguration;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getVersioning() {
            return this.versioning;
        }

        @Override
        public final java.lang.Object getWebsite() {
            return this.website;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.ITerraformIterator getForEach() {
            return this.forEach;
        }

        @Override
        public final java.util.List<java.lang.Object> getProviders() {
            return this.providers;
        }

        @Override
        public final java.lang.Boolean getSkipAssetCreationFromLocalModules() {
            return this.skipAssetCreationFromLocalModules;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAccelerationStatus() != null) {
                data.set("accelerationStatus", om.valueToTree(this.getAccelerationStatus()));
            }
            if (this.getAcl() != null) {
                data.set("acl", om.valueToTree(this.getAcl()));
            }
            if (this.getAttachDenyInsecureTransportPolicy() != null) {
                data.set("attachDenyInsecureTransportPolicy", om.valueToTree(this.getAttachDenyInsecureTransportPolicy()));
            }
            if (this.getAttachElbLogDeliveryPolicy() != null) {
                data.set("attachElbLogDeliveryPolicy", om.valueToTree(this.getAttachElbLogDeliveryPolicy()));
            }
            if (this.getAttachLbLogDeliveryPolicy() != null) {
                data.set("attachLbLogDeliveryPolicy", om.valueToTree(this.getAttachLbLogDeliveryPolicy()));
            }
            if (this.getAttachPolicy() != null) {
                data.set("attachPolicy", om.valueToTree(this.getAttachPolicy()));
            }
            if (this.getAttachPublicPolicy() != null) {
                data.set("attachPublicPolicy", om.valueToTree(this.getAttachPublicPolicy()));
            }
            if (this.getAttachRequireLatestTlsPolicy() != null) {
                data.set("attachRequireLatestTlsPolicy", om.valueToTree(this.getAttachRequireLatestTlsPolicy()));
            }
            if (this.getBlockPublicAcls() != null) {
                data.set("blockPublicAcls", om.valueToTree(this.getBlockPublicAcls()));
            }
            if (this.getBlockPublicPolicy() != null) {
                data.set("blockPublicPolicy", om.valueToTree(this.getBlockPublicPolicy()));
            }
            if (this.getBucket() != null) {
                data.set("bucket", om.valueToTree(this.getBucket()));
            }
            if (this.getBucketPrefix() != null) {
                data.set("bucketPrefix", om.valueToTree(this.getBucketPrefix()));
            }
            if (this.getControlObjectOwnership() != null) {
                data.set("controlObjectOwnership", om.valueToTree(this.getControlObjectOwnership()));
            }
            if (this.getCorsRule() != null) {
                data.set("corsRule", om.valueToTree(this.getCorsRule()));
            }
            if (this.getCreateBucket() != null) {
                data.set("createBucket", om.valueToTree(this.getCreateBucket()));
            }
            if (this.getExpectedBucketOwner() != null) {
                data.set("expectedBucketOwner", om.valueToTree(this.getExpectedBucketOwner()));
            }
            if (this.getForceDestroy() != null) {
                data.set("forceDestroy", om.valueToTree(this.getForceDestroy()));
            }
            if (this.getGrant() != null) {
                data.set("grant", om.valueToTree(this.getGrant()));
            }
            if (this.getIgnorePublicAcls() != null) {
                data.set("ignorePublicAcls", om.valueToTree(this.getIgnorePublicAcls()));
            }
            if (this.getIntelligentTiering() != null) {
                data.set("intelligentTiering", om.valueToTree(this.getIntelligentTiering()));
            }
            if (this.getLifecycleRule() != null) {
                data.set("lifecycleRule", om.valueToTree(this.getLifecycleRule()));
            }
            if (this.getLogging() != null) {
                data.set("logging", om.valueToTree(this.getLogging()));
            }
            if (this.getObjectLockConfiguration() != null) {
                data.set("objectLockConfiguration", om.valueToTree(this.getObjectLockConfiguration()));
            }
            if (this.getObjectLockEnabled() != null) {
                data.set("objectLockEnabled", om.valueToTree(this.getObjectLockEnabled()));
            }
            if (this.getObjectOwnership() != null) {
                data.set("objectOwnership", om.valueToTree(this.getObjectOwnership()));
            }
            if (this.getOwner() != null) {
                data.set("owner", om.valueToTree(this.getOwner()));
            }
            if (this.getPolicy() != null) {
                data.set("policy", om.valueToTree(this.getPolicy()));
            }
            if (this.getPutinKhuylo() != null) {
                data.set("putinKhuylo", om.valueToTree(this.getPutinKhuylo()));
            }
            if (this.getReplicationConfiguration() != null) {
                data.set("replicationConfiguration", om.valueToTree(this.getReplicationConfiguration()));
            }
            if (this.getRequestPayer() != null) {
                data.set("requestPayer", om.valueToTree(this.getRequestPayer()));
            }
            if (this.getRestrictPublicBuckets() != null) {
                data.set("restrictPublicBuckets", om.valueToTree(this.getRestrictPublicBuckets()));
            }
            if (this.getServerSideEncryptionConfiguration() != null) {
                data.set("serverSideEncryptionConfiguration", om.valueToTree(this.getServerSideEncryptionConfiguration()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getVersioning() != null) {
                data.set("versioning", om.valueToTree(this.getVersioning()));
            }
            if (this.getWebsite() != null) {
                data.set("website", om.valueToTree(this.getWebsite()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getForEach() != null) {
                data.set("forEach", om.valueToTree(this.getForEach()));
            }
            if (this.getProviders() != null) {
                data.set("providers", om.valueToTree(this.getProviders()));
            }
            if (this.getSkipAssetCreationFromLocalModules() != null) {
                data.set("skipAssetCreationFromLocalModules", om.valueToTree(this.getSkipAssetCreationFromLocalModules()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("terraform-aws-modules_s3-bucket_aws.S3BucketOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketOptions.Jsii$Proxy that = (S3BucketOptions.Jsii$Proxy) o;

            if (this.accelerationStatus != null ? !this.accelerationStatus.equals(that.accelerationStatus) : that.accelerationStatus != null) return false;
            if (this.acl != null ? !this.acl.equals(that.acl) : that.acl != null) return false;
            if (this.attachDenyInsecureTransportPolicy != null ? !this.attachDenyInsecureTransportPolicy.equals(that.attachDenyInsecureTransportPolicy) : that.attachDenyInsecureTransportPolicy != null) return false;
            if (this.attachElbLogDeliveryPolicy != null ? !this.attachElbLogDeliveryPolicy.equals(that.attachElbLogDeliveryPolicy) : that.attachElbLogDeliveryPolicy != null) return false;
            if (this.attachLbLogDeliveryPolicy != null ? !this.attachLbLogDeliveryPolicy.equals(that.attachLbLogDeliveryPolicy) : that.attachLbLogDeliveryPolicy != null) return false;
            if (this.attachPolicy != null ? !this.attachPolicy.equals(that.attachPolicy) : that.attachPolicy != null) return false;
            if (this.attachPublicPolicy != null ? !this.attachPublicPolicy.equals(that.attachPublicPolicy) : that.attachPublicPolicy != null) return false;
            if (this.attachRequireLatestTlsPolicy != null ? !this.attachRequireLatestTlsPolicy.equals(that.attachRequireLatestTlsPolicy) : that.attachRequireLatestTlsPolicy != null) return false;
            if (this.blockPublicAcls != null ? !this.blockPublicAcls.equals(that.blockPublicAcls) : that.blockPublicAcls != null) return false;
            if (this.blockPublicPolicy != null ? !this.blockPublicPolicy.equals(that.blockPublicPolicy) : that.blockPublicPolicy != null) return false;
            if (this.bucket != null ? !this.bucket.equals(that.bucket) : that.bucket != null) return false;
            if (this.bucketPrefix != null ? !this.bucketPrefix.equals(that.bucketPrefix) : that.bucketPrefix != null) return false;
            if (this.controlObjectOwnership != null ? !this.controlObjectOwnership.equals(that.controlObjectOwnership) : that.controlObjectOwnership != null) return false;
            if (this.corsRule != null ? !this.corsRule.equals(that.corsRule) : that.corsRule != null) return false;
            if (this.createBucket != null ? !this.createBucket.equals(that.createBucket) : that.createBucket != null) return false;
            if (this.expectedBucketOwner != null ? !this.expectedBucketOwner.equals(that.expectedBucketOwner) : that.expectedBucketOwner != null) return false;
            if (this.forceDestroy != null ? !this.forceDestroy.equals(that.forceDestroy) : that.forceDestroy != null) return false;
            if (this.grant != null ? !this.grant.equals(that.grant) : that.grant != null) return false;
            if (this.ignorePublicAcls != null ? !this.ignorePublicAcls.equals(that.ignorePublicAcls) : that.ignorePublicAcls != null) return false;
            if (this.intelligentTiering != null ? !this.intelligentTiering.equals(that.intelligentTiering) : that.intelligentTiering != null) return false;
            if (this.lifecycleRule != null ? !this.lifecycleRule.equals(that.lifecycleRule) : that.lifecycleRule != null) return false;
            if (this.logging != null ? !this.logging.equals(that.logging) : that.logging != null) return false;
            if (this.objectLockConfiguration != null ? !this.objectLockConfiguration.equals(that.objectLockConfiguration) : that.objectLockConfiguration != null) return false;
            if (this.objectLockEnabled != null ? !this.objectLockEnabled.equals(that.objectLockEnabled) : that.objectLockEnabled != null) return false;
            if (this.objectOwnership != null ? !this.objectOwnership.equals(that.objectOwnership) : that.objectOwnership != null) return false;
            if (this.owner != null ? !this.owner.equals(that.owner) : that.owner != null) return false;
            if (this.policy != null ? !this.policy.equals(that.policy) : that.policy != null) return false;
            if (this.putinKhuylo != null ? !this.putinKhuylo.equals(that.putinKhuylo) : that.putinKhuylo != null) return false;
            if (this.replicationConfiguration != null ? !this.replicationConfiguration.equals(that.replicationConfiguration) : that.replicationConfiguration != null) return false;
            if (this.requestPayer != null ? !this.requestPayer.equals(that.requestPayer) : that.requestPayer != null) return false;
            if (this.restrictPublicBuckets != null ? !this.restrictPublicBuckets.equals(that.restrictPublicBuckets) : that.restrictPublicBuckets != null) return false;
            if (this.serverSideEncryptionConfiguration != null ? !this.serverSideEncryptionConfiguration.equals(that.serverSideEncryptionConfiguration) : that.serverSideEncryptionConfiguration != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.versioning != null ? !this.versioning.equals(that.versioning) : that.versioning != null) return false;
            if (this.website != null ? !this.website.equals(that.website) : that.website != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.providers != null ? !this.providers.equals(that.providers) : that.providers != null) return false;
            return this.skipAssetCreationFromLocalModules != null ? this.skipAssetCreationFromLocalModules.equals(that.skipAssetCreationFromLocalModules) : that.skipAssetCreationFromLocalModules == null;
        }

        @Override
        public final int hashCode() {
            int result = this.accelerationStatus != null ? this.accelerationStatus.hashCode() : 0;
            result = 31 * result + (this.acl != null ? this.acl.hashCode() : 0);
            result = 31 * result + (this.attachDenyInsecureTransportPolicy != null ? this.attachDenyInsecureTransportPolicy.hashCode() : 0);
            result = 31 * result + (this.attachElbLogDeliveryPolicy != null ? this.attachElbLogDeliveryPolicy.hashCode() : 0);
            result = 31 * result + (this.attachLbLogDeliveryPolicy != null ? this.attachLbLogDeliveryPolicy.hashCode() : 0);
            result = 31 * result + (this.attachPolicy != null ? this.attachPolicy.hashCode() : 0);
            result = 31 * result + (this.attachPublicPolicy != null ? this.attachPublicPolicy.hashCode() : 0);
            result = 31 * result + (this.attachRequireLatestTlsPolicy != null ? this.attachRequireLatestTlsPolicy.hashCode() : 0);
            result = 31 * result + (this.blockPublicAcls != null ? this.blockPublicAcls.hashCode() : 0);
            result = 31 * result + (this.blockPublicPolicy != null ? this.blockPublicPolicy.hashCode() : 0);
            result = 31 * result + (this.bucket != null ? this.bucket.hashCode() : 0);
            result = 31 * result + (this.bucketPrefix != null ? this.bucketPrefix.hashCode() : 0);
            result = 31 * result + (this.controlObjectOwnership != null ? this.controlObjectOwnership.hashCode() : 0);
            result = 31 * result + (this.corsRule != null ? this.corsRule.hashCode() : 0);
            result = 31 * result + (this.createBucket != null ? this.createBucket.hashCode() : 0);
            result = 31 * result + (this.expectedBucketOwner != null ? this.expectedBucketOwner.hashCode() : 0);
            result = 31 * result + (this.forceDestroy != null ? this.forceDestroy.hashCode() : 0);
            result = 31 * result + (this.grant != null ? this.grant.hashCode() : 0);
            result = 31 * result + (this.ignorePublicAcls != null ? this.ignorePublicAcls.hashCode() : 0);
            result = 31 * result + (this.intelligentTiering != null ? this.intelligentTiering.hashCode() : 0);
            result = 31 * result + (this.lifecycleRule != null ? this.lifecycleRule.hashCode() : 0);
            result = 31 * result + (this.logging != null ? this.logging.hashCode() : 0);
            result = 31 * result + (this.objectLockConfiguration != null ? this.objectLockConfiguration.hashCode() : 0);
            result = 31 * result + (this.objectLockEnabled != null ? this.objectLockEnabled.hashCode() : 0);
            result = 31 * result + (this.objectOwnership != null ? this.objectOwnership.hashCode() : 0);
            result = 31 * result + (this.owner != null ? this.owner.hashCode() : 0);
            result = 31 * result + (this.policy != null ? this.policy.hashCode() : 0);
            result = 31 * result + (this.putinKhuylo != null ? this.putinKhuylo.hashCode() : 0);
            result = 31 * result + (this.replicationConfiguration != null ? this.replicationConfiguration.hashCode() : 0);
            result = 31 * result + (this.requestPayer != null ? this.requestPayer.hashCode() : 0);
            result = 31 * result + (this.restrictPublicBuckets != null ? this.restrictPublicBuckets.hashCode() : 0);
            result = 31 * result + (this.serverSideEncryptionConfiguration != null ? this.serverSideEncryptionConfiguration.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.versioning != null ? this.versioning.hashCode() : 0);
            result = 31 * result + (this.website != null ? this.website.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.providers != null ? this.providers.hashCode() : 0);
            result = 31 * result + (this.skipAssetCreationFromLocalModules != null ? this.skipAssetCreationFromLocalModules.hashCode() : 0);
            return result;
        }
    }
}
