package com.lesson1;

import java.util.Objects;

public class Man implements Person {

	private String name;
	private int age;
	private String country;
	private String city;

	public Man(String name, int age, String country, String city) {
		this.name = name;
		this.age = age;
		this.country = country;
		this.city = city;
	}

	@Override
	public void introduce(String name) {
		System.out.println("My name is " + this.name); 
	}

	@Override
	public void sayAge(int age) {
		System.out.println("i'm " + this.age + " year old");
	}

	@Override
	public void sayFrom(String country, String city) {
		System.out.println("I'm from " + this.city + ", " + this.country);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age, country, city);
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof Man) {
			Man that = (Man) object;
			return Objects.equals(this.name, that.name) && this.age == that.age
					&& Objects.equals(this.country, that.country) && Objects.equals(this.city, that.city);
		}
		return false;
	}

}
