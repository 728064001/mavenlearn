package com.haolei.helloworld;
import org.junit.*;
import static org.junit.Assert.*;

public class TestHelloWorld{
	@Test
	public void testSsyHello(){
		HelloWorld helloworld = new HelloWorld();
		String str = helloworld.sayHello("maven");
		assertEquals(str,"hello:maven");
	}
}