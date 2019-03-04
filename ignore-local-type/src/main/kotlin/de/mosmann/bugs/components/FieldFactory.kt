package de.mosmann.bugs.components

import de.mosmann.bugs.framework.Component
import de.mosmann.bugs.framework.HasValue

interface FieldFactory {
  fun <T, C> factoryFor(type: Class<T>): () -> C
      where C: Component, C: HasValue<T>
}