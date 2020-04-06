package me.gabrielkirsten.testcontainermockserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TestcontainerMockserverApplication

fun main(args: Array<String>) {
	runApplication<TestcontainerMockserverApplication>(*args)
}
