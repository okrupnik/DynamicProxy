package com.lesson1;

import java.lang.reflect.Proxy;

/**
 * @author krupnik_o
 *
 */
public class Main {

	public static void main(String[] args) {
		
		//Create original object
		Man petr = new Man("Petr", 21, "Belarus", "Minsk");
		
		//Get classLoader of original object
		ClassLoader petrClassLoader = petr.getClass().getClassLoader();
		
		//Get all interfaces that is implemented by original object 
		Class[] petrInterfaces = petr.getClass().getInterfaces(); 
		
		//Create proxy of our object
		Person petrProxy = (Person) Proxy.newProxyInstance(petrClassLoader, petrInterfaces, new PersonInvocationHandler(petr));
		
		petrProxy.introduce(petr.getName());
	}

}
