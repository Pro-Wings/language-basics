package com.prowings.oops;

import java.lang.reflect.Field;

public class ClassClassDemo {
	
	public static void main(String[] args) {
		
		Integer i = 40;
		
		A a = new A();
		
		Class cls = a.getClass();
		
		String className =  cls.getName();
		
		System.out.println(className);
		System.out.println(cls.getPackageName());
		
		Field[] fields = cls.getDeclaredFields();
		
		for(Field f : fields)
		{
			System.out.println(f.getName());
		}
		
	}

}
