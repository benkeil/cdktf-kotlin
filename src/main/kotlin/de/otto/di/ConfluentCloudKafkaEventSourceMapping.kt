package de.otto.di

import com.hashicorp.cdktf.providers.aws.lambdafunction.LambdaEventSourceMapping
import imports.terraform_aws_modules.aws.Lambda

// new LambdaEventSourceMapping(this, 'ConfluentCloudKafkaLambdaEventSourceMapping', {
//    dependsOn: [this.function],
//    functionName: this.function.functionName,
//    topics,
//    startingPosition: 'LATEST',
//    selfManagedEventSource: {
//        endpoints: {
//            KAFKA_BOOTSTRAP_SERVERS: bootstrapServer,
//    },
//    },
//    batchSize,
//    maximumBatchingWindowInSeconds,
//    sourceAccessConfiguration: [
//    {
//            type: 'BASIC_AUTH',
//            uri: secretArn,
//    },
//    ],
// });

fun Lambda.addConfluentCloudKafkaEventSourceMapping(id: String, topic: String) {
  LambdaEventSourceMapping.Builder.create(this, id)
      .dependsOn(listOf(this))
      .functionName(this.functionName)
      .topics(listOf(topic))
      .build()
}
