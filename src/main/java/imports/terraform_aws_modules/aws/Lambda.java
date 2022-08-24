package imports.terraform_aws_modules.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.63.0 (build 7c24e36)", date = "2022-08-24T12:41:41.334Z")
@software.amazon.jsii.Jsii(module = imports.terraform_aws_modules.aws.$Module.class, fqn = "terraform-aws-modules_lambda_aws.Lambda")
public class Lambda extends com.hashicorp.cdktf.TerraformModule {

    protected Lambda(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Lambda(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public Lambda(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.terraform_aws_modules.aws.LambdaOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), options });
    }

    public Lambda(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaCloudwatchLogGroupArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaCloudwatchLogGroupArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaCloudwatchLogGroupNameOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaCloudwatchLogGroupNameOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaEventSourceMappingFunctionArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaEventSourceMappingFunctionArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaEventSourceMappingStateOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaEventSourceMappingStateOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaEventSourceMappingStateTransitionReasonOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaEventSourceMappingStateTransitionReasonOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaEventSourceMappingUuidOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaEventSourceMappingUuidOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaFunctionArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFunctionArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaFunctionInvokeArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFunctionInvokeArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaFunctionKmsKeyArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFunctionKmsKeyArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaFunctionLastModifiedOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFunctionLastModifiedOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaFunctionNameOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFunctionNameOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaFunctionQualifiedArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFunctionQualifiedArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaFunctionSourceCodeHashOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFunctionSourceCodeHashOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaFunctionSourceCodeSizeOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFunctionSourceCodeSizeOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaFunctionUrlIdOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFunctionUrlIdOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaFunctionUrlOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFunctionUrlOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaFunctionVersionOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFunctionVersionOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaLayerArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaLayerArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaLayerCreatedDateOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaLayerCreatedDateOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaLayerLayerArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaLayerLayerArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaLayerSourceCodeSizeOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaLayerSourceCodeSizeOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaLayerVersionOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaLayerVersionOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaRoleArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaRoleArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaRoleNameOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaRoleNameOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaRoleUniqueIdOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaRoleUniqueIdOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLocalFilenameOutput() {
        return software.amazon.jsii.Kernel.get(this, "localFilenameOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getS3ObjectOutput() {
        return software.amazon.jsii.Kernel.get(this, "s3ObjectOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAssumeRolePolicyStatements() {
        return software.amazon.jsii.Kernel.get(this, "assumeRolePolicyStatements", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAssumeRolePolicyStatements(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "assumeRolePolicyStatements", java.util.Objects.requireNonNull(value, "assumeRolePolicyStatements is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getCors() {
        return software.amazon.jsii.Kernel.get(this, "cors", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setCors(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "cors", java.util.Objects.requireNonNull(value, "cors is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getDockerPipCache() {
        return software.amazon.jsii.Kernel.get(this, "dockerPipCache", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setDockerPipCache(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "dockerPipCache", java.util.Objects.requireNonNull(value, "dockerPipCache is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEventSourceMapping() {
        return software.amazon.jsii.Kernel.get(this, "eventSourceMapping", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEventSourceMapping(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "eventSourceMapping", java.util.Objects.requireNonNull(value, "eventSourceMapping is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getPolicyStatements() {
        return software.amazon.jsii.Kernel.get(this, "policyStatements", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setPolicyStatements(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "policyStatements", java.util.Objects.requireNonNull(value, "policyStatements is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getSourcePath() {
        return software.amazon.jsii.Kernel.get(this, "sourcePath", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setSourcePath(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "sourcePath", java.util.Objects.requireNonNull(value, "sourcePath is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getTrustedEntities() {
        return software.amazon.jsii.Kernel.get(this, "trustedEntities", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setTrustedEntities(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "trustedEntities", java.util.Objects.requireNonNull(value, "trustedEntities is required"));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> getAllowedTriggers() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.Object>)(software.amazon.jsii.Kernel.get(this, "allowedTriggers", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setAllowedTriggers(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> value) {
        software.amazon.jsii.Kernel.set(this, "allowedTriggers", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getArchitectures() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "architectures", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setArchitectures(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "architectures", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getArtifactsDir() {
        return software.amazon.jsii.Kernel.get(this, "artifactsDir", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setArtifactsDir(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "artifactsDir", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachAsyncEventPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachAsyncEventPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachAsyncEventPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachAsyncEventPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachCloudwatchLogsPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachCloudwatchLogsPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachCloudwatchLogsPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachCloudwatchLogsPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachDeadLetterPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachDeadLetterPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachDeadLetterPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachDeadLetterPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachNetworkPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachNetworkPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachNetworkPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachNetworkPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPolicies() {
        return software.amazon.jsii.Kernel.get(this, "attachPolicies", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachPolicies(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachPolicies", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPolicyJson() {
        return software.amazon.jsii.Kernel.get(this, "attachPolicyJson", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachPolicyJson(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachPolicyJson", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPolicyJsons() {
        return software.amazon.jsii.Kernel.get(this, "attachPolicyJsons", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachPolicyJsons(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachPolicyJsons", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPolicyStatements() {
        return software.amazon.jsii.Kernel.get(this, "attachPolicyStatements", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachPolicyStatements(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachPolicyStatements", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachTracingPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachTracingPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachTracingPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachTracingPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAuthorizationType() {
        return software.amazon.jsii.Kernel.get(this, "authorizationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuthorizationType(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "authorizationType", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getBuildInDocker() {
        return software.amazon.jsii.Kernel.get(this, "buildInDocker", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setBuildInDocker(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "buildInDocker", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCloudwatchLogsKmsKeyId() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchLogsKmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCloudwatchLogsKmsKeyId(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cloudwatchLogsKmsKeyId", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getCloudwatchLogsRetentionInDays() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchLogsRetentionInDays", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setCloudwatchLogsRetentionInDays(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "cloudwatchLogsRetentionInDays", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getCloudwatchLogsTags() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "cloudwatchLogsTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setCloudwatchLogsTags(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "cloudwatchLogsTags", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCompatibleArchitectures() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "compatibleArchitectures", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setCompatibleArchitectures(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "compatibleArchitectures", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCompatibleRuntimes() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "compatibleRuntimes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setCompatibleRuntimes(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "compatibleRuntimes", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreate() {
        return software.amazon.jsii.Kernel.get(this, "create", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreate(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "create", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateAsyncEventConfig() {
        return software.amazon.jsii.Kernel.get(this, "createAsyncEventConfig", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateAsyncEventConfig(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createAsyncEventConfig", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateCurrentVersionAllowedTriggers() {
        return software.amazon.jsii.Kernel.get(this, "createCurrentVersionAllowedTriggers", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateCurrentVersionAllowedTriggers(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createCurrentVersionAllowedTriggers", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateCurrentVersionAsyncEventConfig() {
        return software.amazon.jsii.Kernel.get(this, "createCurrentVersionAsyncEventConfig", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateCurrentVersionAsyncEventConfig(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createCurrentVersionAsyncEventConfig", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateFunction() {
        return software.amazon.jsii.Kernel.get(this, "createFunction", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateFunction(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createFunction", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateLambdaFunctionUrl() {
        return software.amazon.jsii.Kernel.get(this, "createLambdaFunctionUrl", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateLambdaFunctionUrl(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createLambdaFunctionUrl", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateLayer() {
        return software.amazon.jsii.Kernel.get(this, "createLayer", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateLayer(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createLayer", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreatePackage() {
        return software.amazon.jsii.Kernel.get(this, "createPackage", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreatePackage(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createPackage", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateRole() {
        return software.amazon.jsii.Kernel.get(this, "createRole", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateRole(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createRole", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateUnqualifiedAliasAllowedTriggers() {
        return software.amazon.jsii.Kernel.get(this, "createUnqualifiedAliasAllowedTriggers", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateUnqualifiedAliasAllowedTriggers(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createUnqualifiedAliasAllowedTriggers", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateUnqualifiedAliasAsyncEventConfig() {
        return software.amazon.jsii.Kernel.get(this, "createUnqualifiedAliasAsyncEventConfig", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateUnqualifiedAliasAsyncEventConfig(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createUnqualifiedAliasAsyncEventConfig", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateUnqualifiedAliasLambdaFunctionUrl() {
        return software.amazon.jsii.Kernel.get(this, "createUnqualifiedAliasLambdaFunctionUrl", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateUnqualifiedAliasLambdaFunctionUrl(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createUnqualifiedAliasLambdaFunctionUrl", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDeadLetterTargetArn() {
        return software.amazon.jsii.Kernel.get(this, "deadLetterTargetArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDeadLetterTargetArn(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "deadLetterTargetArn", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDestinationOnFailure() {
        return software.amazon.jsii.Kernel.get(this, "destinationOnFailure", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDestinationOnFailure(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "destinationOnFailure", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDestinationOnSuccess() {
        return software.amazon.jsii.Kernel.get(this, "destinationOnSuccess", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDestinationOnSuccess(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "destinationOnSuccess", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDockerBuildRoot() {
        return software.amazon.jsii.Kernel.get(this, "dockerBuildRoot", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDockerBuildRoot(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dockerBuildRoot", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDockerFile() {
        return software.amazon.jsii.Kernel.get(this, "dockerFile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDockerFile(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dockerFile", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDockerImage() {
        return software.amazon.jsii.Kernel.get(this, "dockerImage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDockerImage(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dockerImage", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getDockerWithSshAgent() {
        return software.amazon.jsii.Kernel.get(this, "dockerWithSshAgent", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setDockerWithSshAgent(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "dockerWithSshAgent", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getEnvironmentVariables() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "environmentVariables", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setEnvironmentVariables(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "environmentVariables", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getEphemeralStorageSize() {
        return software.amazon.jsii.Kernel.get(this, "ephemeralStorageSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setEphemeralStorageSize(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "ephemeralStorageSize", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFileSystemArn() {
        return software.amazon.jsii.Kernel.get(this, "fileSystemArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFileSystemArn(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "fileSystemArn", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFileSystemLocalMountPath() {
        return software.amazon.jsii.Kernel.get(this, "fileSystemLocalMountPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFileSystemLocalMountPath(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "fileSystemLocalMountPath", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFunctionName() {
        return software.amazon.jsii.Kernel.get(this, "functionName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFunctionName(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "functionName", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHandler() {
        return software.amazon.jsii.Kernel.get(this, "handler", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHandler(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "handler", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHashExtra() {
        return software.amazon.jsii.Kernel.get(this, "hashExtra", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHashExtra(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "hashExtra", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getIgnoreSourceCodeHash() {
        return software.amazon.jsii.Kernel.get(this, "ignoreSourceCodeHash", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setIgnoreSourceCodeHash(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "ignoreSourceCodeHash", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getImageConfigCommand() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "imageConfigCommand", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setImageConfigCommand(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "imageConfigCommand", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getImageConfigEntryPoint() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "imageConfigEntryPoint", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setImageConfigEntryPoint(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "imageConfigEntryPoint", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getImageConfigWorkingDirectory() {
        return software.amazon.jsii.Kernel.get(this, "imageConfigWorkingDirectory", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setImageConfigWorkingDirectory(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "imageConfigWorkingDirectory", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getImageUri() {
        return software.amazon.jsii.Kernel.get(this, "imageUri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setImageUri(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "imageUri", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyArn() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKmsKeyArn(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kmsKeyArn", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getLambdaAtEdge() {
        return software.amazon.jsii.Kernel.get(this, "lambdaAtEdge", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setLambdaAtEdge(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "lambdaAtEdge", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLambdaRole() {
        return software.amazon.jsii.Kernel.get(this, "lambdaRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLambdaRole(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "lambdaRole", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLayerName() {
        return software.amazon.jsii.Kernel.get(this, "layerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLayerName(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "layerName", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLayers() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "layers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setLayers(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "layers", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getLayerSkipDestroy() {
        return software.amazon.jsii.Kernel.get(this, "layerSkipDestroy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setLayerSkipDestroy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "layerSkipDestroy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLicenseInfo() {
        return software.amazon.jsii.Kernel.get(this, "licenseInfo", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLicenseInfo(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "licenseInfo", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLocalExistingPackage() {
        return software.amazon.jsii.Kernel.get(this, "localExistingPackage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLocalExistingPackage(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "localExistingPackage", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaximumEventAgeInSeconds() {
        return software.amazon.jsii.Kernel.get(this, "maximumEventAgeInSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaximumEventAgeInSeconds(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maximumEventAgeInSeconds", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaximumRetryAttempts() {
        return software.amazon.jsii.Kernel.get(this, "maximumRetryAttempts", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaximumRetryAttempts(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maximumRetryAttempts", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMemorySize() {
        return software.amazon.jsii.Kernel.get(this, "memorySize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMemorySize(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "memorySize", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getNumberOfPolicies() {
        return software.amazon.jsii.Kernel.get(this, "numberOfPolicies", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setNumberOfPolicies(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "numberOfPolicies", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getNumberOfPolicyJsons() {
        return software.amazon.jsii.Kernel.get(this, "numberOfPolicyJsons", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setNumberOfPolicyJsons(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "numberOfPolicyJsons", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPackageType() {
        return software.amazon.jsii.Kernel.get(this, "packageType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPackageType(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "packageType", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPolicies() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "policies", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setPolicies(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "policies", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPolicy() {
        return software.amazon.jsii.Kernel.get(this, "policy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPolicy(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "policy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPolicyJson() {
        return software.amazon.jsii.Kernel.get(this, "policyJson", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPolicyJson(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "policyJson", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPolicyJsons() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "policyJsons", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setPolicyJsons(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "policyJsons", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPolicyPath() {
        return software.amazon.jsii.Kernel.get(this, "policyPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPolicyPath(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "policyPath", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getProvisionedConcurrentExecutions() {
        return software.amazon.jsii.Kernel.get(this, "provisionedConcurrentExecutions", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setProvisionedConcurrentExecutions(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "provisionedConcurrentExecutions", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getPublish() {
        return software.amazon.jsii.Kernel.get(this, "publish", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setPublish(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "publish", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getPutinKhuylo() {
        return software.amazon.jsii.Kernel.get(this, "putinKhuylo", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setPutinKhuylo(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "putinKhuylo", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getRecreateMissingPackage() {
        return software.amazon.jsii.Kernel.get(this, "recreateMissingPackage", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setRecreateMissingPackage(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "recreateMissingPackage", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getReservedConcurrentExecutions() {
        return software.amazon.jsii.Kernel.get(this, "reservedConcurrentExecutions", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setReservedConcurrentExecutions(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "reservedConcurrentExecutions", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRoleDescription() {
        return software.amazon.jsii.Kernel.get(this, "roleDescription", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRoleDescription(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "roleDescription", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getRoleForceDetachPolicies() {
        return software.amazon.jsii.Kernel.get(this, "roleForceDetachPolicies", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setRoleForceDetachPolicies(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "roleForceDetachPolicies", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRoleName() {
        return software.amazon.jsii.Kernel.get(this, "roleName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRoleName(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "roleName", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRolePath() {
        return software.amazon.jsii.Kernel.get(this, "rolePath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRolePath(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "rolePath", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRolePermissionsBoundary() {
        return software.amazon.jsii.Kernel.get(this, "rolePermissionsBoundary", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRolePermissionsBoundary(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "rolePermissionsBoundary", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getRoleTags() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "roleTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setRoleTags(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "roleTags", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRuntime() {
        return software.amazon.jsii.Kernel.get(this, "runtime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRuntime(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "runtime", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getS3Acl() {
        return software.amazon.jsii.Kernel.get(this, "s3Acl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setS3Acl(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "s3Acl", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getS3Bucket() {
        return software.amazon.jsii.Kernel.get(this, "s3Bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setS3Bucket(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "s3Bucket", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getS3ExistingPackage() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "s3ExistingPackage", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setS3ExistingPackage(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "s3ExistingPackage", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getS3ObjectStorageClass() {
        return software.amazon.jsii.Kernel.get(this, "s3ObjectStorageClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setS3ObjectStorageClass(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "s3ObjectStorageClass", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getS3ObjectTags() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "s3ObjectTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setS3ObjectTags(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "s3ObjectTags", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getS3ObjectTagsOnly() {
        return software.amazon.jsii.Kernel.get(this, "s3ObjectTagsOnly", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setS3ObjectTagsOnly(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "s3ObjectTagsOnly", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getS3Prefix() {
        return software.amazon.jsii.Kernel.get(this, "s3Prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setS3Prefix(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "s3Prefix", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getS3ServerSideEncryption() {
        return software.amazon.jsii.Kernel.get(this, "s3ServerSideEncryption", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setS3ServerSideEncryption(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "s3ServerSideEncryption", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getStoreOnS3() {
        return software.amazon.jsii.Kernel.get(this, "storeOnS3", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setStoreOnS3(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "storeOnS3", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setTags(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getTimeout() {
        return software.amazon.jsii.Kernel.get(this, "timeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setTimeout(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "timeout", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTracingMode() {
        return software.amazon.jsii.Kernel.get(this, "tracingMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTracingMode(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "tracingMode", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getUseExistingCloudwatchLogGroup() {
        return software.amazon.jsii.Kernel.get(this, "useExistingCloudwatchLogGroup", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setUseExistingCloudwatchLogGroup(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "useExistingCloudwatchLogGroup", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVpcSecurityGroupIds() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "vpcSecurityGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setVpcSecurityGroupIds(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "vpcSecurityGroupIds", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVpcSubnetIds() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "vpcSubnetIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setVpcSubnetIds(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "vpcSubnetIds", value);
    }

    /**
     * A fluent builder for {@link imports.terraform_aws_modules.aws.Lambda}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.terraform_aws_modules.aws.Lambda> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope This parameter is required.
         * @param id This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private imports.terraform_aws_modules.aws.LambdaOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.options().dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param forEach This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(final com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.options().forEach(forEach);
            return this;
        }

        /**
         * @return {@code this}
         * @param providers This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder providers(final java.util.List<? extends java.lang.Object> providers) {
            this.options().providers(providers);
            return this;
        }

        /**
         * @return {@code this}
         * @param skipAssetCreationFromLocalModules This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder skipAssetCreationFromLocalModules(final java.lang.Boolean skipAssetCreationFromLocalModules) {
            this.options().skipAssetCreationFromLocalModules(skipAssetCreationFromLocalModules);
            return this;
        }

        /**
         * Map of allowed triggers to create Lambda permissions.
         * <p>
         * Default: [object Object]
         * The property type contains a map, they have special handling, please see {@link cdk.tf/module-map-inputs the docs}
         * <p>
         * @return {@code this}
         * @param allowedTriggers Map of allowed triggers to create Lambda permissions. This parameter is required.
         */
        public Builder allowedTriggers(final java.util.Map<java.lang.String, ? extends java.lang.Object> allowedTriggers) {
            this.options().allowedTriggers(allowedTriggers);
            return this;
        }

        /**
         * Instruction set architecture for your Lambda function.
         * <p>
         * Valid values are ["x86_64"] and ["arm64"].
         * <p>
         * @return {@code this}
         * @param architectures Instruction set architecture for your Lambda function. This parameter is required.
         */
        public Builder architectures(final java.util.List<java.lang.String> architectures) {
            this.options().architectures(architectures);
            return this;
        }

        /**
         * Directory name where artifacts should be stored.
         * <p>
         * Default: builds
         * <p>
         * @return {@code this}
         * @param artifactsDir Directory name where artifacts should be stored. This parameter is required.
         */
        public Builder artifactsDir(final java.lang.String artifactsDir) {
            this.options().artifactsDir(artifactsDir);
            return this;
        }

        /**
         * Map of dynamic policy statements for assuming Lambda Function role (trust relationship).
         * <p>
         * Default: [object Object]
         * <p>
         * @return {@code this}
         * @param assumeRolePolicyStatements Map of dynamic policy statements for assuming Lambda Function role (trust relationship). This parameter is required.
         */
        public Builder assumeRolePolicyStatements(final java.lang.Object assumeRolePolicyStatements) {
            this.options().assumeRolePolicyStatements(assumeRolePolicyStatements);
            return this;
        }

        /**
         * Controls whether async event policy should be added to IAM role for Lambda Function.
         * <p>
         * @return {@code this}
         * @param attachAsyncEventPolicy Controls whether async event policy should be added to IAM role for Lambda Function. This parameter is required.
         */
        public Builder attachAsyncEventPolicy(final java.lang.Boolean attachAsyncEventPolicy) {
            this.options().attachAsyncEventPolicy(attachAsyncEventPolicy);
            return this;
        }

        /**
         * Controls whether CloudWatch Logs policy should be added to IAM role for Lambda Function.
         * <p>
         * Default: true
         * <p>
         * @return {@code this}
         * @param attachCloudwatchLogsPolicy Controls whether CloudWatch Logs policy should be added to IAM role for Lambda Function. This parameter is required.
         */
        public Builder attachCloudwatchLogsPolicy(final java.lang.Boolean attachCloudwatchLogsPolicy) {
            this.options().attachCloudwatchLogsPolicy(attachCloudwatchLogsPolicy);
            return this;
        }

        /**
         * Controls whether SNS/SQS dead letter notification policy should be added to IAM role for Lambda Function.
         * <p>
         * @return {@code this}
         * @param attachDeadLetterPolicy Controls whether SNS/SQS dead letter notification policy should be added to IAM role for Lambda Function. This parameter is required.
         */
        public Builder attachDeadLetterPolicy(final java.lang.Boolean attachDeadLetterPolicy) {
            this.options().attachDeadLetterPolicy(attachDeadLetterPolicy);
            return this;
        }

        /**
         * Controls whether VPC/network policy should be added to IAM role for Lambda Function.
         * <p>
         * @return {@code this}
         * @param attachNetworkPolicy Controls whether VPC/network policy should be added to IAM role for Lambda Function. This parameter is required.
         */
        public Builder attachNetworkPolicy(final java.lang.Boolean attachNetworkPolicy) {
            this.options().attachNetworkPolicy(attachNetworkPolicy);
            return this;
        }

        /**
         * Controls whether list of policies should be added to IAM role for Lambda Function.
         * <p>
         * @return {@code this}
         * @param attachPolicies Controls whether list of policies should be added to IAM role for Lambda Function. This parameter is required.
         */
        public Builder attachPolicies(final java.lang.Boolean attachPolicies) {
            this.options().attachPolicies(attachPolicies);
            return this;
        }

        /**
         * Controls whether policy should be added to IAM role for Lambda Function.
         * <p>
         * @return {@code this}
         * @param attachPolicy Controls whether policy should be added to IAM role for Lambda Function. This parameter is required.
         */
        public Builder attachPolicy(final java.lang.Boolean attachPolicy) {
            this.options().attachPolicy(attachPolicy);
            return this;
        }

        /**
         * Controls whether policy_json should be added to IAM role for Lambda Function.
         * <p>
         * @return {@code this}
         * @param attachPolicyJson Controls whether policy_json should be added to IAM role for Lambda Function. This parameter is required.
         */
        public Builder attachPolicyJson(final java.lang.Boolean attachPolicyJson) {
            this.options().attachPolicyJson(attachPolicyJson);
            return this;
        }

        /**
         * Controls whether policy_jsons should be added to IAM role for Lambda Function.
         * <p>
         * @return {@code this}
         * @param attachPolicyJsons Controls whether policy_jsons should be added to IAM role for Lambda Function. This parameter is required.
         */
        public Builder attachPolicyJsons(final java.lang.Boolean attachPolicyJsons) {
            this.options().attachPolicyJsons(attachPolicyJsons);
            return this;
        }

        /**
         * Controls whether policy_statements should be added to IAM role for Lambda Function.
         * <p>
         * @return {@code this}
         * @param attachPolicyStatements Controls whether policy_statements should be added to IAM role for Lambda Function. This parameter is required.
         */
        public Builder attachPolicyStatements(final java.lang.Boolean attachPolicyStatements) {
            this.options().attachPolicyStatements(attachPolicyStatements);
            return this;
        }

        /**
         * Controls whether X-Ray tracing policy should be added to IAM role for Lambda Function.
         * <p>
         * @return {@code this}
         * @param attachTracingPolicy Controls whether X-Ray tracing policy should be added to IAM role for Lambda Function. This parameter is required.
         */
        public Builder attachTracingPolicy(final java.lang.Boolean attachTracingPolicy) {
            this.options().attachTracingPolicy(attachTracingPolicy);
            return this;
        }

        /**
         * The type of authentication that the Lambda Function URL uses.
         * <p>
         * Set to 'AWS_IAM' to restrict access to authenticated IAM users only. Set to 'NONE' to bypass IAM authentication and create a public endpoint.
         * <p>
         * Default: NONE
         * <p>
         * @return {@code this}
         * @param authorizationType The type of authentication that the Lambda Function URL uses. This parameter is required.
         */
        public Builder authorizationType(final java.lang.String authorizationType) {
            this.options().authorizationType(authorizationType);
            return this;
        }

        /**
         * Whether to build dependencies in Docker.
         * <p>
         * @return {@code this}
         * @param buildInDocker Whether to build dependencies in Docker. This parameter is required.
         */
        public Builder buildInDocker(final java.lang.Boolean buildInDocker) {
            this.options().buildInDocker(buildInDocker);
            return this;
        }

        /**
         * The ARN of the KMS Key to use when encrypting log data.
         * <p>
         * @return {@code this}
         * @param cloudwatchLogsKmsKeyId The ARN of the KMS Key to use when encrypting log data. This parameter is required.
         */
        public Builder cloudwatchLogsKmsKeyId(final java.lang.String cloudwatchLogsKmsKeyId) {
            this.options().cloudwatchLogsKmsKeyId(cloudwatchLogsKmsKeyId);
            return this;
        }

        /**
         * Specifies the number of days you want to retain log events in the specified log group.
         * <p>
         * Possible values are: 1, 3, 5, 7, 14, 30, 60, 90, 120, 150, 180, 365, 400, 545, 731, 1827, and 3653.
         * <p>
         * @return {@code this}
         * @param cloudwatchLogsRetentionInDays Specifies the number of days you want to retain log events in the specified log group. This parameter is required.
         */
        public Builder cloudwatchLogsRetentionInDays(final java.lang.Number cloudwatchLogsRetentionInDays) {
            this.options().cloudwatchLogsRetentionInDays(cloudwatchLogsRetentionInDays);
            return this;
        }

        /**
         * A map of tags to assign to the resource.
         * <p>
         * Default: [object Object]
         * The property type contains a map, they have special handling, please see {@link cdk.tf/module-map-inputs the docs}
         * <p>
         * @return {@code this}
         * @param cloudwatchLogsTags A map of tags to assign to the resource. This parameter is required.
         */
        public Builder cloudwatchLogsTags(final java.util.Map<java.lang.String, java.lang.String> cloudwatchLogsTags) {
            this.options().cloudwatchLogsTags(cloudwatchLogsTags);
            return this;
        }

        /**
         * A list of Architectures Lambda layer is compatible with.
         * <p>
         * Currently x86_64 and arm64 can be specified.
         * <p>
         * @return {@code this}
         * @param compatibleArchitectures A list of Architectures Lambda layer is compatible with. This parameter is required.
         */
        public Builder compatibleArchitectures(final java.util.List<java.lang.String> compatibleArchitectures) {
            this.options().compatibleArchitectures(compatibleArchitectures);
            return this;
        }

        /**
         * A list of Runtimes this layer is compatible with.
         * <p>
         * Up to 5 runtimes can be specified.
         * <p>
         * @return {@code this}
         * @param compatibleRuntimes A list of Runtimes this layer is compatible with. This parameter is required.
         */
        public Builder compatibleRuntimes(final java.util.List<java.lang.String> compatibleRuntimes) {
            this.options().compatibleRuntimes(compatibleRuntimes);
            return this;
        }

        /**
         * CORS settings to be used by the Lambda Function URL.
         * <p>
         * Default: [object Object]
         * <p>
         * @return {@code this}
         * @param cors CORS settings to be used by the Lambda Function URL. This parameter is required.
         */
        public Builder cors(final java.lang.Object cors) {
            this.options().cors(cors);
            return this;
        }

        /**
         * Controls whether resources should be created.
         * <p>
         * Default: true
         * <p>
         * @return {@code this}
         * @param create Controls whether resources should be created. This parameter is required.
         */
        public Builder create(final java.lang.Boolean create) {
            this.options().create(create);
            return this;
        }

        /**
         * Controls whether async event configuration for Lambda Function/Alias should be created.
         * <p>
         * @return {@code this}
         * @param createAsyncEventConfig Controls whether async event configuration for Lambda Function/Alias should be created. This parameter is required.
         */
        public Builder createAsyncEventConfig(final java.lang.Boolean createAsyncEventConfig) {
            this.options().createAsyncEventConfig(createAsyncEventConfig);
            return this;
        }

        /**
         * Whether to allow triggers on current version of Lambda Function (this will revoke permissions from previous version because Terraform manages only current resources).
         * <p>
         * Default: true
         * <p>
         * @return {@code this}
         * @param createCurrentVersionAllowedTriggers Whether to allow triggers on current version of Lambda Function (this will revoke permissions from previous version because Terraform manages only current resources). This parameter is required.
         */
        public Builder createCurrentVersionAllowedTriggers(final java.lang.Boolean createCurrentVersionAllowedTriggers) {
            this.options().createCurrentVersionAllowedTriggers(createCurrentVersionAllowedTriggers);
            return this;
        }

        /**
         * Whether to allow async event configuration on current version of Lambda Function (this will revoke permissions from previous version because Terraform manages only current resources).
         * <p>
         * Default: true
         * <p>
         * @return {@code this}
         * @param createCurrentVersionAsyncEventConfig Whether to allow async event configuration on current version of Lambda Function (this will revoke permissions from previous version because Terraform manages only current resources). This parameter is required.
         */
        public Builder createCurrentVersionAsyncEventConfig(final java.lang.Boolean createCurrentVersionAsyncEventConfig) {
            this.options().createCurrentVersionAsyncEventConfig(createCurrentVersionAsyncEventConfig);
            return this;
        }

        /**
         * Controls whether Lambda Function resource should be created.
         * <p>
         * Default: true
         * <p>
         * @return {@code this}
         * @param createFunction Controls whether Lambda Function resource should be created. This parameter is required.
         */
        public Builder createFunction(final java.lang.Boolean createFunction) {
            this.options().createFunction(createFunction);
            return this;
        }

        /**
         * Controls whether the Lambda Function URL resource should be created.
         * <p>
         * @return {@code this}
         * @param createLambdaFunctionUrl Controls whether the Lambda Function URL resource should be created. This parameter is required.
         */
        public Builder createLambdaFunctionUrl(final java.lang.Boolean createLambdaFunctionUrl) {
            this.options().createLambdaFunctionUrl(createLambdaFunctionUrl);
            return this;
        }

        /**
         * Controls whether Lambda Layer resource should be created.
         * <p>
         * @return {@code this}
         * @param createLayer Controls whether Lambda Layer resource should be created. This parameter is required.
         */
        public Builder createLayer(final java.lang.Boolean createLayer) {
            this.options().createLayer(createLayer);
            return this;
        }

        /**
         * Controls whether Lambda package should be created.
         * <p>
         * Default: true
         * <p>
         * @return {@code this}
         * @param createPackage Controls whether Lambda package should be created. This parameter is required.
         */
        public Builder createPackage(final java.lang.Boolean createPackage) {
            this.options().createPackage(createPackage);
            return this;
        }

        /**
         * Controls whether IAM role for Lambda Function should be created.
         * <p>
         * Default: true
         * <p>
         * @return {@code this}
         * @param createRole Controls whether IAM role for Lambda Function should be created. This parameter is required.
         */
        public Builder createRole(final java.lang.Boolean createRole) {
            this.options().createRole(createRole);
            return this;
        }

        /**
         * Whether to allow triggers on unqualified alias pointing to $LATEST version.
         * <p>
         * Default: true
         * <p>
         * @return {@code this}
         * @param createUnqualifiedAliasAllowedTriggers Whether to allow triggers on unqualified alias pointing to $LATEST version. This parameter is required.
         */
        public Builder createUnqualifiedAliasAllowedTriggers(final java.lang.Boolean createUnqualifiedAliasAllowedTriggers) {
            this.options().createUnqualifiedAliasAllowedTriggers(createUnqualifiedAliasAllowedTriggers);
            return this;
        }

        /**
         * Whether to allow async event configuration on unqualified alias pointing to $LATEST version.
         * <p>
         * Default: true
         * <p>
         * @return {@code this}
         * @param createUnqualifiedAliasAsyncEventConfig Whether to allow async event configuration on unqualified alias pointing to $LATEST version. This parameter is required.
         */
        public Builder createUnqualifiedAliasAsyncEventConfig(final java.lang.Boolean createUnqualifiedAliasAsyncEventConfig) {
            this.options().createUnqualifiedAliasAsyncEventConfig(createUnqualifiedAliasAsyncEventConfig);
            return this;
        }

        /**
         * Whether to use unqualified alias pointing to $LATEST version in Lambda Function URL.
         * <p>
         * Default: true
         * <p>
         * @return {@code this}
         * @param createUnqualifiedAliasLambdaFunctionUrl Whether to use unqualified alias pointing to $LATEST version in Lambda Function URL. This parameter is required.
         */
        public Builder createUnqualifiedAliasLambdaFunctionUrl(final java.lang.Boolean createUnqualifiedAliasLambdaFunctionUrl) {
            this.options().createUnqualifiedAliasLambdaFunctionUrl(createUnqualifiedAliasLambdaFunctionUrl);
            return this;
        }

        /**
         * The ARN of an SNS topic or SQS queue to notify when an invocation fails.
         * <p>
         * @return {@code this}
         * @param deadLetterTargetArn The ARN of an SNS topic or SQS queue to notify when an invocation fails. This parameter is required.
         */
        public Builder deadLetterTargetArn(final java.lang.String deadLetterTargetArn) {
            this.options().deadLetterTargetArn(deadLetterTargetArn);
            return this;
        }

        /**
         * Description of your Lambda Function (or Layer).
         * <p>
         * @return {@code this}
         * @param description Description of your Lambda Function (or Layer). This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.options().description(description);
            return this;
        }

        /**
         * Amazon Resource Name (ARN) of the destination resource for failed asynchronous invocations.
         * <p>
         * @return {@code this}
         * @param destinationOnFailure Amazon Resource Name (ARN) of the destination resource for failed asynchronous invocations. This parameter is required.
         */
        public Builder destinationOnFailure(final java.lang.String destinationOnFailure) {
            this.options().destinationOnFailure(destinationOnFailure);
            return this;
        }

        /**
         * Amazon Resource Name (ARN) of the destination resource for successful asynchronous invocations.
         * <p>
         * @return {@code this}
         * @param destinationOnSuccess Amazon Resource Name (ARN) of the destination resource for successful asynchronous invocations. This parameter is required.
         */
        public Builder destinationOnSuccess(final java.lang.String destinationOnSuccess) {
            this.options().destinationOnSuccess(destinationOnSuccess);
            return this;
        }

        /**
         * Root dir where to build in Docker.
         * <p>
         * @return {@code this}
         * @param dockerBuildRoot Root dir where to build in Docker. This parameter is required.
         */
        public Builder dockerBuildRoot(final java.lang.String dockerBuildRoot) {
            this.options().dockerBuildRoot(dockerBuildRoot);
            return this;
        }

        /**
         * Path to a Dockerfile when building in Docker.
         * <p>
         * @return {@code this}
         * @param dockerFile Path to a Dockerfile when building in Docker. This parameter is required.
         */
        public Builder dockerFile(final java.lang.String dockerFile) {
            this.options().dockerFile(dockerFile);
            return this;
        }

        /**
         * Docker image to use for the build.
         * <p>
         * @return {@code this}
         * @param dockerImage Docker image to use for the build. This parameter is required.
         */
        public Builder dockerImage(final java.lang.String dockerImage) {
            this.options().dockerImage(dockerImage);
            return this;
        }

        /**
         * Whether to mount a shared pip cache folder into docker environment or not.
         * <p>
         * @return {@code this}
         * @param dockerPipCache Whether to mount a shared pip cache folder into docker environment or not. This parameter is required.
         */
        public Builder dockerPipCache(final java.lang.Object dockerPipCache) {
            this.options().dockerPipCache(dockerPipCache);
            return this;
        }

        /**
         * Whether to pass SSH_AUTH_SOCK into docker environment or not.
         * <p>
         * @return {@code this}
         * @param dockerWithSshAgent Whether to pass SSH_AUTH_SOCK into docker environment or not. This parameter is required.
         */
        public Builder dockerWithSshAgent(final java.lang.Boolean dockerWithSshAgent) {
            this.options().dockerWithSshAgent(dockerWithSshAgent);
            return this;
        }

        /**
         * A map that defines environment variables for the Lambda Function.
         * <p>
         * Default: [object Object]
         * The property type contains a map, they have special handling, please see {@link cdk.tf/module-map-inputs the docs}
         * <p>
         * @return {@code this}
         * @param environmentVariables A map that defines environment variables for the Lambda Function. This parameter is required.
         */
        public Builder environmentVariables(final java.util.Map<java.lang.String, java.lang.String> environmentVariables) {
            this.options().environmentVariables(environmentVariables);
            return this;
        }

        /**
         * Amount of ephemeral storage (/tmp) in MB your Lambda Function can use at runtime.
         * <p>
         * Valid value between 512 MB to 10,240 MB (10 GB).
         * <p>
         * Default: 512
         * <p>
         * @return {@code this}
         * @param ephemeralStorageSize Amount of ephemeral storage (/tmp) in MB your Lambda Function can use at runtime. This parameter is required.
         */
        public Builder ephemeralStorageSize(final java.lang.Number ephemeralStorageSize) {
            this.options().ephemeralStorageSize(ephemeralStorageSize);
            return this;
        }

        /**
         * Map of event source mapping.
         * <p>
         * Default: [object Object]
         * <p>
         * @return {@code this}
         * @param eventSourceMapping Map of event source mapping. This parameter is required.
         */
        public Builder eventSourceMapping(final java.lang.Object eventSourceMapping) {
            this.options().eventSourceMapping(eventSourceMapping);
            return this;
        }

        /**
         * The Amazon Resource Name (ARN) of the Amazon EFS Access Point that provides access to the file system.
         * <p>
         * @return {@code this}
         * @param fileSystemArn The Amazon Resource Name (ARN) of the Amazon EFS Access Point that provides access to the file system. This parameter is required.
         */
        public Builder fileSystemArn(final java.lang.String fileSystemArn) {
            this.options().fileSystemArn(fileSystemArn);
            return this;
        }

        /**
         * The path where the function can access the file system, starting with /mnt/.
         * <p>
         * @return {@code this}
         * @param fileSystemLocalMountPath The path where the function can access the file system, starting with /mnt/. This parameter is required.
         */
        public Builder fileSystemLocalMountPath(final java.lang.String fileSystemLocalMountPath) {
            this.options().fileSystemLocalMountPath(fileSystemLocalMountPath);
            return this;
        }

        /**
         * A unique name for your Lambda Function.
         * <p>
         * @return {@code this}
         * @param functionName A unique name for your Lambda Function. This parameter is required.
         */
        public Builder functionName(final java.lang.String functionName) {
            this.options().functionName(functionName);
            return this;
        }

        /**
         * Lambda Function entrypoint in your code.
         * <p>
         * @return {@code this}
         * @param handler Lambda Function entrypoint in your code. This parameter is required.
         */
        public Builder handler(final java.lang.String handler) {
            this.options().handler(handler);
            return this;
        }

        /**
         * The string to add into hashing function.
         * <p>
         * Useful when building same source path for different functions.
         * <p>
         * @return {@code this}
         * @param hashExtra The string to add into hashing function. This parameter is required.
         */
        public Builder hashExtra(final java.lang.String hashExtra) {
            this.options().hashExtra(hashExtra);
            return this;
        }

        /**
         * Whether to ignore changes to the function's source code hash.
         * <p>
         * Set to true if you manage infrastructure and code deployments separately.
         * <p>
         * @return {@code this}
         * @param ignoreSourceCodeHash Whether to ignore changes to the function's source code hash. This parameter is required.
         */
        public Builder ignoreSourceCodeHash(final java.lang.Boolean ignoreSourceCodeHash) {
            this.options().ignoreSourceCodeHash(ignoreSourceCodeHash);
            return this;
        }

        /**
         * The CMD for the docker image.
         * <p>
         * @return {@code this}
         * @param imageConfigCommand The CMD for the docker image. This parameter is required.
         */
        public Builder imageConfigCommand(final java.util.List<java.lang.String> imageConfigCommand) {
            this.options().imageConfigCommand(imageConfigCommand);
            return this;
        }

        /**
         * The ENTRYPOINT for the docker image.
         * <p>
         * @return {@code this}
         * @param imageConfigEntryPoint The ENTRYPOINT for the docker image. This parameter is required.
         */
        public Builder imageConfigEntryPoint(final java.util.List<java.lang.String> imageConfigEntryPoint) {
            this.options().imageConfigEntryPoint(imageConfigEntryPoint);
            return this;
        }

        /**
         * The working directory for the docker image.
         * <p>
         * @return {@code this}
         * @param imageConfigWorkingDirectory The working directory for the docker image. This parameter is required.
         */
        public Builder imageConfigWorkingDirectory(final java.lang.String imageConfigWorkingDirectory) {
            this.options().imageConfigWorkingDirectory(imageConfigWorkingDirectory);
            return this;
        }

        /**
         * The ECR image URI containing the function's deployment package.
         * <p>
         * @return {@code this}
         * @param imageUri The ECR image URI containing the function's deployment package. This parameter is required.
         */
        public Builder imageUri(final java.lang.String imageUri) {
            this.options().imageUri(imageUri);
            return this;
        }

        /**
         * The ARN of KMS key to use by your Lambda Function.
         * <p>
         * @return {@code this}
         * @param kmsKeyArn The ARN of KMS key to use by your Lambda Function. This parameter is required.
         */
        public Builder kmsKeyArn(final java.lang.String kmsKeyArn) {
            this.options().kmsKeyArn(kmsKeyArn);
            return this;
        }

        /**
         * Set this to true if using Lambda@Edge, to enable publishing, limit the timeout, and allow edgelambda.amazonaws.com to invoke the function.
         * <p>
         * @return {@code this}
         * @param lambdaAtEdge Set this to true if using Lambda@Edge, to enable publishing, limit the timeout, and allow edgelambda.amazonaws.com to invoke the function. This parameter is required.
         */
        public Builder lambdaAtEdge(final java.lang.Boolean lambdaAtEdge) {
            this.options().lambdaAtEdge(lambdaAtEdge);
            return this;
        }

        /**
         * IAM role ARN attached to the Lambda Function.
         * <p>
         * This governs both who / what can invoke your Lambda Function, as well as what resources our Lambda Function has access to. See Lambda Permission Model for more details.
         * <p>
         * @return {@code this}
         * @param lambdaRole IAM role ARN attached to the Lambda Function. This parameter is required.
         */
        public Builder lambdaRole(final java.lang.String lambdaRole) {
            this.options().lambdaRole(lambdaRole);
            return this;
        }

        /**
         * Name of Lambda Layer to create.
         * <p>
         * @return {@code this}
         * @param layerName Name of Lambda Layer to create. This parameter is required.
         */
        public Builder layerName(final java.lang.String layerName) {
            this.options().layerName(layerName);
            return this;
        }

        /**
         * List of Lambda Layer Version ARNs (maximum of 5) to attach to your Lambda Function.
         * <p>
         * @return {@code this}
         * @param layers List of Lambda Layer Version ARNs (maximum of 5) to attach to your Lambda Function. This parameter is required.
         */
        public Builder layers(final java.util.List<java.lang.String> layers) {
            this.options().layers(layers);
            return this;
        }

        /**
         * Whether to retain the old version of a previously deployed Lambda Layer.
         * <p>
         * @return {@code this}
         * @param layerSkipDestroy Whether to retain the old version of a previously deployed Lambda Layer. This parameter is required.
         */
        public Builder layerSkipDestroy(final java.lang.Boolean layerSkipDestroy) {
            this.options().layerSkipDestroy(layerSkipDestroy);
            return this;
        }

        /**
         * License info for your Lambda Layer.
         * <p>
         * Eg, MIT or full url of a license.
         * <p>
         * @return {@code this}
         * @param licenseInfo License info for your Lambda Layer. This parameter is required.
         */
        public Builder licenseInfo(final java.lang.String licenseInfo) {
            this.options().licenseInfo(licenseInfo);
            return this;
        }

        /**
         * The absolute path to an existing zip-file to use.
         * <p>
         * @return {@code this}
         * @param localExistingPackage The absolute path to an existing zip-file to use. This parameter is required.
         */
        public Builder localExistingPackage(final java.lang.String localExistingPackage) {
            this.options().localExistingPackage(localExistingPackage);
            return this;
        }

        /**
         * Maximum age of a request that Lambda sends to a function for processing in seconds.
         * <p>
         * Valid values between 60 and 21600.
         * <p>
         * @return {@code this}
         * @param maximumEventAgeInSeconds Maximum age of a request that Lambda sends to a function for processing in seconds. This parameter is required.
         */
        public Builder maximumEventAgeInSeconds(final java.lang.Number maximumEventAgeInSeconds) {
            this.options().maximumEventAgeInSeconds(maximumEventAgeInSeconds);
            return this;
        }

        /**
         * Maximum number of times to retry when the function returns an error.
         * <p>
         * Valid values between 0 and 2. Defaults to 2.
         * <p>
         * @return {@code this}
         * @param maximumRetryAttempts Maximum number of times to retry when the function returns an error. This parameter is required.
         */
        public Builder maximumRetryAttempts(final java.lang.Number maximumRetryAttempts) {
            this.options().maximumRetryAttempts(maximumRetryAttempts);
            return this;
        }

        /**
         * Amount of memory in MB your Lambda Function can use at runtime.
         * <p>
         * Valid value between 128 MB to 10,240 MB (10 GB), in 64 MB increments.
         * <p>
         * Default: 128
         * <p>
         * @return {@code this}
         * @param memorySize Amount of memory in MB your Lambda Function can use at runtime. This parameter is required.
         */
        public Builder memorySize(final java.lang.Number memorySize) {
            this.options().memorySize(memorySize);
            return this;
        }

        /**
         * Number of policies to attach to IAM role for Lambda Function.
         * <p>
         * @return {@code this}
         * @param numberOfPolicies Number of policies to attach to IAM role for Lambda Function. This parameter is required.
         */
        public Builder numberOfPolicies(final java.lang.Number numberOfPolicies) {
            this.options().numberOfPolicies(numberOfPolicies);
            return this;
        }

        /**
         * Number of policies JSON to attach to IAM role for Lambda Function.
         * <p>
         * @return {@code this}
         * @param numberOfPolicyJsons Number of policies JSON to attach to IAM role for Lambda Function. This parameter is required.
         */
        public Builder numberOfPolicyJsons(final java.lang.Number numberOfPolicyJsons) {
            this.options().numberOfPolicyJsons(numberOfPolicyJsons);
            return this;
        }

        /**
         * The Lambda deployment package type.
         * <p>
         * Valid options: Zip or Image
         * <p>
         * Default: Zip
         * <p>
         * @return {@code this}
         * @param packageType The Lambda deployment package type. This parameter is required.
         */
        public Builder packageType(final java.lang.String packageType) {
            this.options().packageType(packageType);
            return this;
        }

        /**
         * List of policy statements ARN to attach to Lambda Function role.
         * <p>
         * @return {@code this}
         * @param policies List of policy statements ARN to attach to Lambda Function role. This parameter is required.
         */
        public Builder policies(final java.util.List<java.lang.String> policies) {
            this.options().policies(policies);
            return this;
        }

        /**
         * An additional policy document ARN to attach to the Lambda Function role.
         * <p>
         * @return {@code this}
         * @param policy An additional policy document ARN to attach to the Lambda Function role. This parameter is required.
         */
        public Builder policy(final java.lang.String policy) {
            this.options().policy(policy);
            return this;
        }

        /**
         * An additional policy document as JSON to attach to the Lambda Function role.
         * <p>
         * @return {@code this}
         * @param policyJson An additional policy document as JSON to attach to the Lambda Function role. This parameter is required.
         */
        public Builder policyJson(final java.lang.String policyJson) {
            this.options().policyJson(policyJson);
            return this;
        }

        /**
         * List of additional policy documents as JSON to attach to Lambda Function role.
         * <p>
         * @return {@code this}
         * @param policyJsons List of additional policy documents as JSON to attach to Lambda Function role. This parameter is required.
         */
        public Builder policyJsons(final java.util.List<java.lang.String> policyJsons) {
            this.options().policyJsons(policyJsons);
            return this;
        }

        /**
         * Path of policies to that should be added to IAM role for Lambda Function.
         * <p>
         * @return {@code this}
         * @param policyPath Path of policies to that should be added to IAM role for Lambda Function. This parameter is required.
         */
        public Builder policyPath(final java.lang.String policyPath) {
            this.options().policyPath(policyPath);
            return this;
        }

        /**
         * Map of dynamic policy statements to attach to Lambda Function role.
         * <p>
         * Default: [object Object]
         * <p>
         * @return {@code this}
         * @param policyStatements Map of dynamic policy statements to attach to Lambda Function role. This parameter is required.
         */
        public Builder policyStatements(final java.lang.Object policyStatements) {
            this.options().policyStatements(policyStatements);
            return this;
        }

        /**
         * Amount of capacity to allocate.
         * <p>
         * Set to 1 or greater to enable, or set to 0 to disable provisioned concurrency.
         * <p>
         * Default: -1
         * <p>
         * @return {@code this}
         * @param provisionedConcurrentExecutions Amount of capacity to allocate. This parameter is required.
         */
        public Builder provisionedConcurrentExecutions(final java.lang.Number provisionedConcurrentExecutions) {
            this.options().provisionedConcurrentExecutions(provisionedConcurrentExecutions);
            return this;
        }

        /**
         * Whether to publish creation/change as new Lambda Function Version.
         * <p>
         * @return {@code this}
         * @param publish Whether to publish creation/change as new Lambda Function Version. This parameter is required.
         */
        public Builder publish(final java.lang.Boolean publish) {
            this.options().publish(publish);
            return this;
        }

        /**
         * Do you agree that Putin doesn't respect Ukrainian sovereignty and territorial integrity?
         * <p>
         * More info: https://en.wikipedia.org/wiki/Putin_khuylo!
         * <p>
         * Default: true
         * <p>
         * @return {@code this}
         * @param putinKhuylo Do you agree that Putin doesn't respect Ukrainian sovereignty and territorial integrity?. This parameter is required.
         */
        public Builder putinKhuylo(final java.lang.Boolean putinKhuylo) {
            this.options().putinKhuylo(putinKhuylo);
            return this;
        }

        /**
         * Whether to recreate missing Lambda package if it is missing locally or not.
         * <p>
         * Default: true
         * <p>
         * @return {@code this}
         * @param recreateMissingPackage Whether to recreate missing Lambda package if it is missing locally or not. This parameter is required.
         */
        public Builder recreateMissingPackage(final java.lang.Boolean recreateMissingPackage) {
            this.options().recreateMissingPackage(recreateMissingPackage);
            return this;
        }

        /**
         * The amount of reserved concurrent executions for this Lambda Function.
         * <p>
         * A value of 0 disables Lambda Function from being triggered and -1 removes any concurrency limitations. Defaults to Unreserved Concurrency Limits -1.
         * <p>
         * Default: -1
         * <p>
         * @return {@code this}
         * @param reservedConcurrentExecutions The amount of reserved concurrent executions for this Lambda Function. This parameter is required.
         */
        public Builder reservedConcurrentExecutions(final java.lang.Number reservedConcurrentExecutions) {
            this.options().reservedConcurrentExecutions(reservedConcurrentExecutions);
            return this;
        }

        /**
         * Description of IAM role to use for Lambda Function.
         * <p>
         * @return {@code this}
         * @param roleDescription Description of IAM role to use for Lambda Function. This parameter is required.
         */
        public Builder roleDescription(final java.lang.String roleDescription) {
            this.options().roleDescription(roleDescription);
            return this;
        }

        /**
         * Specifies to force detaching any policies the IAM role has before destroying it.
         * <p>
         * Default: true
         * <p>
         * @return {@code this}
         * @param roleForceDetachPolicies Specifies to force detaching any policies the IAM role has before destroying it. This parameter is required.
         */
        public Builder roleForceDetachPolicies(final java.lang.Boolean roleForceDetachPolicies) {
            this.options().roleForceDetachPolicies(roleForceDetachPolicies);
            return this;
        }

        /**
         * Name of IAM role to use for Lambda Function.
         * <p>
         * @return {@code this}
         * @param roleName Name of IAM role to use for Lambda Function. This parameter is required.
         */
        public Builder roleName(final java.lang.String roleName) {
            this.options().roleName(roleName);
            return this;
        }

        /**
         * Path of IAM role to use for Lambda Function.
         * <p>
         * @return {@code this}
         * @param rolePath Path of IAM role to use for Lambda Function. This parameter is required.
         */
        public Builder rolePath(final java.lang.String rolePath) {
            this.options().rolePath(rolePath);
            return this;
        }

        /**
         * The ARN of the policy that is used to set the permissions boundary for the IAM role used by Lambda Function.
         * <p>
         * @return {@code this}
         * @param rolePermissionsBoundary The ARN of the policy that is used to set the permissions boundary for the IAM role used by Lambda Function. This parameter is required.
         */
        public Builder rolePermissionsBoundary(final java.lang.String rolePermissionsBoundary) {
            this.options().rolePermissionsBoundary(rolePermissionsBoundary);
            return this;
        }

        /**
         * A map of tags to assign to IAM role.
         * <p>
         * Default: [object Object]
         * The property type contains a map, they have special handling, please see {@link cdk.tf/module-map-inputs the docs}
         * <p>
         * @return {@code this}
         * @param roleTags A map of tags to assign to IAM role. This parameter is required.
         */
        public Builder roleTags(final java.util.Map<java.lang.String, java.lang.String> roleTags) {
            this.options().roleTags(roleTags);
            return this;
        }

        /**
         * Lambda Function runtime.
         * <p>
         * @return {@code this}
         * @param runtime Lambda Function runtime. This parameter is required.
         */
        public Builder runtime(final java.lang.String runtime) {
            this.options().runtime(runtime);
            return this;
        }

        /**
         * The canned ACL to apply.
         * <p>
         * Valid values are private, public-read, public-read-write, aws-exec-read, authenticated-read, bucket-owner-read, and bucket-owner-full-control. Defaults to private.
         * <p>
         * Default: private
         * <p>
         * @return {@code this}
         * @param s3Acl The canned ACL to apply. This parameter is required.
         */
        public Builder s3Acl(final java.lang.String s3Acl) {
            this.options().s3Acl(s3Acl);
            return this;
        }

        /**
         * S3 bucket to store artifacts.
         * <p>
         * @return {@code this}
         * @param s3Bucket S3 bucket to store artifacts. This parameter is required.
         */
        public Builder s3Bucket(final java.lang.String s3Bucket) {
            this.options().s3Bucket(s3Bucket);
            return this;
        }

        /**
         * The S3 bucket object with keys bucket, key, version pointing to an existing zip-file to use The property type contains a map, they have special handling, please see {@link cdk.tf/module-map-inputs the docs}.
         * <p>
         * @return {@code this}
         * @param s3ExistingPackage The S3 bucket object with keys bucket, key, version pointing to an existing zip-file to use The property type contains a map, they have special handling, please see {@link cdk.tf/module-map-inputs the docs}. This parameter is required.
         */
        public Builder s3ExistingPackage(final java.util.Map<java.lang.String, java.lang.String> s3ExistingPackage) {
            this.options().s3ExistingPackage(s3ExistingPackage);
            return this;
        }

        /**
         * Specifies the desired Storage Class for the artifact uploaded to S3.
         * <p>
         * Can be either STANDARD, REDUCED_REDUNDANCY, ONEZONE_IA, INTELLIGENT_TIERING, or STANDARD_IA.
         * <p>
         * Default: ONEZONE_IA
         * <p>
         * @return {@code this}
         * @param s3ObjectStorageClass Specifies the desired Storage Class for the artifact uploaded to S3. This parameter is required.
         */
        public Builder s3ObjectStorageClass(final java.lang.String s3ObjectStorageClass) {
            this.options().s3ObjectStorageClass(s3ObjectStorageClass);
            return this;
        }

        /**
         * A map of tags to assign to S3 bucket object.
         * <p>
         * Default: [object Object]
         * The property type contains a map, they have special handling, please see {@link cdk.tf/module-map-inputs the docs}
         * <p>
         * @return {@code this}
         * @param s3ObjectTags A map of tags to assign to S3 bucket object. This parameter is required.
         */
        public Builder s3ObjectTags(final java.util.Map<java.lang.String, java.lang.String> s3ObjectTags) {
            this.options().s3ObjectTags(s3ObjectTags);
            return this;
        }

        /**
         * Set to true to not merge tags with s3_object_tags.
         * <p>
         * Useful to avoid breaching S3 Object 10 tag limit.
         * <p>
         * @return {@code this}
         * @param s3ObjectTagsOnly Set to true to not merge tags with s3_object_tags. This parameter is required.
         */
        public Builder s3ObjectTagsOnly(final java.lang.Boolean s3ObjectTagsOnly) {
            this.options().s3ObjectTagsOnly(s3ObjectTagsOnly);
            return this;
        }

        /**
         * Directory name where artifacts should be stored in the S3 bucket.
         * <p>
         * If unset, the path from <code>artifacts_dir</code> is used
         * <p>
         * @return {@code this}
         * @param s3Prefix Directory name where artifacts should be stored in the S3 bucket. This parameter is required.
         */
        public Builder s3Prefix(final java.lang.String s3Prefix) {
            this.options().s3Prefix(s3Prefix);
            return this;
        }

        /**
         * Specifies server-side encryption of the object in S3.
         * <p>
         * Valid values are "AES256" and "aws:kms".
         * <p>
         * @return {@code this}
         * @param s3ServerSideEncryption Specifies server-side encryption of the object in S3. This parameter is required.
         */
        public Builder s3ServerSideEncryption(final java.lang.String s3ServerSideEncryption) {
            this.options().s3ServerSideEncryption(s3ServerSideEncryption);
            return this;
        }

        /**
         * The absolute path to a local file or directory containing your Lambda source code.
         * <p>
         * @return {@code this}
         * @param sourcePath The absolute path to a local file or directory containing your Lambda source code. This parameter is required.
         */
        public Builder sourcePath(final java.lang.Object sourcePath) {
            this.options().sourcePath(sourcePath);
            return this;
        }

        /**
         * Whether to store produced artifacts on S3 or locally.
         * <p>
         * @return {@code this}
         * @param storeOnS3 Whether to store produced artifacts on S3 or locally. This parameter is required.
         */
        public Builder storeOnS3(final java.lang.Boolean storeOnS3) {
            this.options().storeOnS3(storeOnS3);
            return this;
        }

        /**
         * A map of tags to assign to resources.
         * <p>
         * Default: [object Object]
         * The property type contains a map, they have special handling, please see {@link cdk.tf/module-map-inputs the docs}
         * <p>
         * @return {@code this}
         * @param tags A map of tags to assign to resources. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.options().tags(tags);
            return this;
        }

        /**
         * The amount of time your Lambda Function has to run in seconds.
         * <p>
         * Default: 3
         * <p>
         * @return {@code this}
         * @param timeout The amount of time your Lambda Function has to run in seconds. This parameter is required.
         */
        public Builder timeout(final java.lang.Number timeout) {
            this.options().timeout(timeout);
            return this;
        }

        /**
         * Tracing mode of the Lambda Function.
         * <p>
         * Valid value can be either PassThrough or Active.
         * <p>
         * @return {@code this}
         * @param tracingMode Tracing mode of the Lambda Function. This parameter is required.
         */
        public Builder tracingMode(final java.lang.String tracingMode) {
            this.options().tracingMode(tracingMode);
            return this;
        }

        /**
         * List of additional trusted entities for assuming Lambda Function role (trust relationship).
         * <p>
         * @return {@code this}
         * @param trustedEntities List of additional trusted entities for assuming Lambda Function role (trust relationship). This parameter is required.
         */
        public Builder trustedEntities(final java.lang.Object trustedEntities) {
            this.options().trustedEntities(trustedEntities);
            return this;
        }

        /**
         * Whether to use an existing CloudWatch log group or create new.
         * <p>
         * @return {@code this}
         * @param useExistingCloudwatchLogGroup Whether to use an existing CloudWatch log group or create new. This parameter is required.
         */
        public Builder useExistingCloudwatchLogGroup(final java.lang.Boolean useExistingCloudwatchLogGroup) {
            this.options().useExistingCloudwatchLogGroup(useExistingCloudwatchLogGroup);
            return this;
        }

        /**
         * List of security group ids when Lambda Function should run in the VPC.
         * <p>
         * @return {@code this}
         * @param vpcSecurityGroupIds List of security group ids when Lambda Function should run in the VPC. This parameter is required.
         */
        public Builder vpcSecurityGroupIds(final java.util.List<java.lang.String> vpcSecurityGroupIds) {
            this.options().vpcSecurityGroupIds(vpcSecurityGroupIds);
            return this;
        }

        /**
         * List of subnet ids when Lambda Function should run in the VPC.
         * <p>
         * Usually private or intra subnets.
         * <p>
         * @return {@code this}
         * @param vpcSubnetIds List of subnet ids when Lambda Function should run in the VPC. This parameter is required.
         */
        public Builder vpcSubnetIds(final java.util.List<java.lang.String> vpcSubnetIds) {
            this.options().vpcSubnetIds(vpcSubnetIds);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.terraform_aws_modules.aws.Lambda}.
         */
        @Override
        public imports.terraform_aws_modules.aws.Lambda build() {
            return new imports.terraform_aws_modules.aws.Lambda(
                this.scope,
                this.id,
                this.options != null ? this.options.build() : null
            );
        }

        private imports.terraform_aws_modules.aws.LambdaOptions.Builder options() {
            if (this.options == null) {
                this.options = new imports.terraform_aws_modules.aws.LambdaOptions.Builder();
            }
            return this.options;
        }
    }
}
