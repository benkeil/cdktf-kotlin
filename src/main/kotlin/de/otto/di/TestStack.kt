package de.otto.di

import com.hashicorp.cdktf.TerraformStack
import com.hashicorp.cdktf.providers.aws.AwsProvider
import com.hashicorp.cdktf.providers.aws.iam.DataAwsIamPolicyDocumentStatement
import imports.terraform_aws_modules.aws.S3Bucket
import software.constructs.Construct

class TestStack(scope: Construct, id: String) : TerraformStack(scope, id) {
  init {
    AwsProvider.Builder.create(this, "aws").region("eu-central-1").build()

    S3Bucket.Builder.create(this, "S3Bucket.test")
        .bucket("test-bucket")
        .acl("private")
        .versioning(mapOf("enabled" to "true"))
        .build()

    Lambda.builder(
            this,
            "asdasd",
            MyProps(
                service = "service",
                name = "name",
                filename = "filename",
                handler = "handler",
                memorySize = 512,
                timeout = 10,
            ))
        .grantPermissions(DataAwsIamPolicyDocumentStatement.builder().build())
        .grantPermissions(DataAwsIamPolicyDocumentStatement.builder().build())
        .grantPermissions(DataAwsIamPolicyDocumentStatement.builder().build())
        .build()
        .addConfluentCloudLambdaTrigger()
  }
}
