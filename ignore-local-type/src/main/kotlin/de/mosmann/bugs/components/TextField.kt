package de.mosmann.bugs.components

import de.mosmann.bugs.framework.Component
import de.mosmann.bugs.framework.HasValue

class TextField : Component(), HasValue<String> {
  private var value: String? = null

  override fun getValue(): String? = value

  override fun setValue(value: String?) {
    this.value = value
  }
}