package de.otto.di

import com.hashicorp.cdktf.providers.aws.iam.DataAwsIamPolicyDocumentStatement
import software.constructs.Construct

data class MyProps(
    val service: String,
    val name: String,
    val filename: String,
    val handler: String,
    val memorySize: Int?,
    val timeout: Int?,
)

class LambdaBuilder(
    private val scope: Construct,
    private val id: String,
    private val properties: MyProps,
) {
  private val applicationPolicyStatements: MutableCollection<DataAwsIamPolicyDocumentStatement> = mutableListOf()

  fun build(): Lambda {
    return Lambda(
        scope,
        id,
        LambdaProperties(
            service = properties.service,
            name = properties.name,
            filename = properties.filename,
            handler = properties.handler,
            memorySize = properties.memorySize,
            timeout = properties.timeout,
            applicationPolicyStatements = applicationPolicyStatements,
        ))
  }

  fun grantPermissions(permission: DataAwsIamPolicyDocumentStatement): LambdaBuilder {
    this.applicationPolicyStatements.add(permission)
    return this
  }
}

fun Lambda.Companion.builder(scope: Construct, id: String, properties: MyProps) = LambdaBuilder(scope, id, properties)
