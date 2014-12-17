package com.haolei.helloworld;
import org.junit.*;
import static org.junit.Assert.*;

public class TestHelloWorld{
	@Test
	public void testSayHello(){
		HelloWorld he = new HelloWorld();
		String str = he.sayHello("maven");
		assertEquals(str,"hello:maven");
	}
}