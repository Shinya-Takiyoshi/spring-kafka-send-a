package com.example.kafkasend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaSendApplication

fun main(args: Array<String>) {
	runApplication<KafkaSendApplication>(*args)
}
