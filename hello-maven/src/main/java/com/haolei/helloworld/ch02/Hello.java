package com.haolei.helloworld.ch02;
import com.haolei.helloworld.HelloWorld;
public class Hello{
	public String say(String name){
		HelloWorld hw = new HelloWorld();
		return hw.sayHello(name);
	}

}