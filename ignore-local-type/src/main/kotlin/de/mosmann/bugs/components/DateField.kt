package de.mosmann.bugs.components

import de.mosmann.bugs.framework.Component
import de.mosmann.bugs.framework.HasValue
import java.time.LocalDate

class DateField : Component(), HasValue<LocalDate> {
  private var value: LocalDate? = null

  override fun getValue(): LocalDate? = value

  override fun setValue(value: LocalDate?) {
    this.value = value
  }
}