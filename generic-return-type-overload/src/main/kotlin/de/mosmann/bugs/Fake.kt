package de.mosmann.bugs

import de.mosmann.bugs.framework.Component
import de.mosmann.bugs.framework.HasValue

@Deprecated("needed for a hack to make the code compile")
class Fake<T> : Component(), HasValue<T> {
  override fun getValue(): T? {
    throw IllegalArgumentException("not implemented")
  }

  override fun setValue(value: T?) {
    throw IllegalArgumentException("not implemented")
  }
}