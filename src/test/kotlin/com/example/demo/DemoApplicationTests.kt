package com.example.demo

import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@SpringBootTest
class DemoApplicationTests {

	@Test
	fun contextLoads() {
	}

	@Test
	fun `use MockK`() {
		val fooer = mockk<Foo>()
		every {
			fooer.bar()
		} returns 2
		assertEquals(2, fooer.bar())
	}
}

interface Foo {
	fun bar(): Int
}