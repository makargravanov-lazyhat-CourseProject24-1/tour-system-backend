package ru.jetlabs.toursystembackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TourSystemBackendApplication

fun main(args: Array<String>) {
	runApplication<TourSystemBackendApplication>(*args)
}
