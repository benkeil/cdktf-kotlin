package de.otto.di

import com.hashicorp.cdktf.TerraformStack
import com.hashicorp.cdktf.providers.aws.iam.DataAwsIamPolicyDocumentStatement
import com.hashicorp.cdktf.providers.aws.lambdafunction.LambdaFunction
import software.constructs.Construct

data class LambdaProperties(
    val service: String,
    val name: String,
    val filename: String,
    val handler: String,
    val memorySize: Int?,
    val timeout: Int?,
    val applicationPolicyStatements: Collection<DataAwsIamPolicyDocumentStatement>?
)

class Lambda(private val scope: Construct, private val id: String, val properties: LambdaProperties) : TerraformStack(scope, id) {

  companion object {}

  init {
    LambdaFunction.Builder.create(scope, id).build()
  }
}
