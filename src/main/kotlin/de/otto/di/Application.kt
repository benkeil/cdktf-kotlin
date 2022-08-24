package de.otto.di

import com.hashicorp.cdktf.App
import com.hashicorp.cdktf.Aspects
import com.hashicorp.cdktf.LocalBackend

class Application

fun main() {
  val app = App()
  val stack = TestStack(app, "cdktf-java")
  LocalBackend.Builder.create(stack).build()
  Aspects.of(stack).add(AddTagsAspect())
  app.synth()
}
