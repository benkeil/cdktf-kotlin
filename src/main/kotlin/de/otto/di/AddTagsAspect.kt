package de.otto.di

import com.hashicorp.cdktf.IAspect
import software.constructs.IConstruct

fun isTaggableConstruct(construct: IConstruct): Boolean {
  construct::class.members.forEach(::println)
  return false
}

class AddTagsAspect : IAspect {
  override fun visit(node: IConstruct) {
    if (isTaggableConstruct(node)) {}
  }
}
