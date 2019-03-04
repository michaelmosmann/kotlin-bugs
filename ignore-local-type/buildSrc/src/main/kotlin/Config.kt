object Versions {
  const val asciidoctor_pdf = "1.5.0-alpha.16"
  const val asciidoctorj = "1.5.3.2"
  const val byte_buddy = "1.9.3"
  const val guice = "4.2.2"
  const val h2 = "1.4.197"
  const val jacoco = "0.8.3"
  const val jdbi3 = "3.5.1"
  const val karibu_testing = "1.0.7"
  const val mockk = "1.9"
  const val postgres = "42.2.5"
  const val servlet = "3.1.0"
  const val slf4j = "1.7.25"
  const val logback = "1.2.3"
  const val strikt = "0.17.2"
  const val vaadin = "12.0.3"
}

object Libs {
  const val asciidoctor_pdf = "org.asciidoctor:asciidoctorj-pdf:${Versions.asciidoctor_pdf}"
  const val asciidoctorj = "org.asciidoctor:asciidoctorj:${Versions.asciidoctorj}"

  const val byte_buddy = "net.bytebuddy:byte-buddy:${Versions.byte_buddy}"

  const val findbugs_jsr305 = "com.google.code.findbugs:jsr305:3.0.2"

  const val h2 = "com.h2database:h2:${Versions.h2}"

  const val guice_core = "com.google.inject:guice:${Versions.guice}"
  const val guice_servlet = "com.google.inject.extensions:guice-servlet:${Versions.guice}"
  const val guice_grapher = "com.google.inject.extensions:guice-grapher:${Versions.guice}"
  const val guice_multibindings = "com.google.inject.extensions:guice-multibindings:${Versions.guice}"
  const val guice_throwingproviders = "com.google.inject.extensions:guice-throwingproviders:${Versions.guice}"

  const val jdbi_core = "org.jdbi:jdbi3-core:${Versions.jdbi3}"
  const val jdbi_kotlin = "org.jdbi:jdbi3-kotlin:${Versions.jdbi3}"
  const val jdbi_postgres = "org.jdbi:jdbi3-postgres:${Versions.jdbi3}"
  const val jdbi_testing = "org.jdbi:jdbi3-testing:${Versions.jdbi3}"

  const val karibu_testing = "com.github.mvysny.kaributesting:karibu-testing-v10:${Versions.karibu_testing}"
  const val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:1.3.11"

  const val mockk = "io.mockk:mockk:${Versions.mockk}"

  const val postgres = "org.postgresql:postgresql:${Versions.postgres}"

  const val servlet_api = "javax.servlet:javax.servlet-api:${Versions.servlet}"
  const val slf4j_api = "org.slf4j:slf4j-api:${Versions.slf4j}"
  const val logback = "ch.qos.logback:logback-classic:${Versions.logback}"
  const val strikt_core = "io.strikt:strikt-core:${Versions.strikt}"

  const val vaadin_bom = "com.vaadin:vaadin-bom:${Versions.vaadin}"
  const val vaadin_core = "com.vaadin:vaadin-core:${Versions.vaadin}"
}