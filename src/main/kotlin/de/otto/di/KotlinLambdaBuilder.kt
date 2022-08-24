package de.otto.di

import com.hashicorp.cdktf.providers.aws.iam.DataAwsIamPolicyDocumentStatement
import imports.terraform_aws_modules.aws.Lambda
import software.constructs.Construct

data class LambdaBuilderProperties(
    val service: String,
    val name: String,
    val filename: String,
    val handler: String,
    val memorySize: Int?,
    val timeout: Int?,
)

// new Lambda(this, 'Lambda.ImportProductVariations', {
//    filename: `${buildDir}/libs/function.jar`,
//    service,
//    name: 'import-product-variations',
//    handler: 'de.otto.di.handler.ImportProductVariations::handleRequest',
//    runtime: AwsLambdaRuntime.java11,
//    applicationPolicyStatements: [
//    {
//        effect: 'Allow',
//        actions: ['secretsmanager:GetSecretValue'],
//        resources: [secretVersion.arn],
//    },
//    {
//        effect: 'Allow',
//        actions: ['dynamodb:PutItem', 'dynamodb:DeleteItem', 'dynamodb:GetItem'],
//        resources: [partialVariationTable.arn, `${partialVariationTable.arn}/*`],
//    },
//    ],
//    environment: {
//            VARIATION_TABLE_NAME: partialVariationTable.name,
//    },
//    memorySize: 512,
//    tracingConfig: 'PassThrough',
//    enableInsights: true,
//    logLevel: 'ERROR',
// })

class KotlinLambdaBuilder(
    private val scope: Construct,
    private val id: String,
    private val properties: LambdaBuilderProperties,
) {
  private val applicationPolicyStatements: MutableCollection<DataAwsIamPolicyDocumentStatement> = mutableListOf()

  companion object {}

  fun build(): Lambda {
    return Lambda.Builder.create(scope, id)
        .functionName("${properties.service}--${properties.name}")
        .sourcePath("./libs/function.jar")
        .memorySize(properties.memorySize)
        .timeout(properties.timeout)
        .policyStatements(applicationPolicyStatements)
        .runtime("java11")
        .build()
  }

  private fun getHandler(name: String) = "de.otto.di.handler.${name}::handleRequest"

  fun grantPermissions(permission: DataAwsIamPolicyDocumentStatement): KotlinLambdaBuilder {
    this.applicationPolicyStatements.add(permission)
    return this
  }
}
