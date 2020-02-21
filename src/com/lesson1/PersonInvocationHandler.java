package com.lesson1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonInvocationHandler implements InvocationHandler {

	private Person person;

	public PersonInvocationHandler(Person person) {
		this.person = person;
	}

	@Override
	public Object invoke(Object object, Method method, Object[] arg) throws Throwable {
		System.out.println("Hello!");
		return method.invoke(person, arg);
	}

}
