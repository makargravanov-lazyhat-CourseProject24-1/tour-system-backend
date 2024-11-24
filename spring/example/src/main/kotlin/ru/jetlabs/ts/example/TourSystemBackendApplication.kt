package ru.jetlabs.ts.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import ru.jetlabs.ts.common.Example

@SpringBootApplication
class TourSystemBackendApplication

fun main(args: Array<String>) {
	runApplication<TourSystemBackendApplication>(*args)

	val k = Example() // FROM COMMON MODULE
}
