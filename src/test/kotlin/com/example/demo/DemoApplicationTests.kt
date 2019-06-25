package com.example.demo

import io.mockk.every
import io.mockk.mockk
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
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