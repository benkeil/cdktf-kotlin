package de.otto.di

import com.hashicorp.cdktf.TerraformStack
import com.hashicorp.cdktf.providers.aws.AwsProvider
import com.hashicorp.cdktf.providers.aws.iam.DataAwsIamPolicyDocumentStatement
import software.constructs.Construct

class TestStack(scope: Construct, id: String) : TerraformStack(scope, id) {
  init {
    AwsProvider.Builder.create(this, "aws").region("eu-central-1").build()

    KotlinLambdaBuilder(
            this,
            "asdasd",
            LambdaBuilderProperties(
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
        .addConfluentCloudKafkaEventSourceMapping("asdasd", "de.otto.fuckyou")
  }
}
