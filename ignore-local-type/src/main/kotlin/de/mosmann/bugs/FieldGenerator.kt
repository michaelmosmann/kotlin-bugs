package de.mosmann.bugs

import de.mosmann.bugs.components.FieldFactory
import de.mosmann.bugs.framework.Component
import de.mosmann.bugs.framework.HasValue
import de.mosmann.bugs.model.Property

class FieldGenerator(private val fieldFactory: FieldFactory) {

  fun addFields(parent: Component, properties: List<Property<out Any>>) {
    properties.forEach{
      addField<Any,Fake<Any>>(parent, it)
    }
  }

  fun <T, C> addField(parent: Component, property: Property<out T>)
      where C: Component, C: HasValue<T> {
    val factory = fieldFactory.factoryFor<T,C>(property.type)
    val field = factory.invoke()
    field.setValue(property.value)
    parent.add(field)
  }
}