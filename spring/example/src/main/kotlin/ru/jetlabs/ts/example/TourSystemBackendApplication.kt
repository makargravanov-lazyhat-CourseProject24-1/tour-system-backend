package ru.jetlabs.ts.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TourSystemBackendApplication

fun main(args: Array<String>) {
	runApplication<TourSystemBackendApplication>(*args)
}
