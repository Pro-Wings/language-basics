package com.prowings.oops;

public class IsInstanceDemo {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Integer i = 20;
		
		String s = "ABC";
		Float f = 20.0f;

		System.out.println(i instanceof Integer);
		
		System.out.println(Class.forName("java.lang.Integer").isInstance(i));

		System.out.println(Class.forName("java.lang.String").isInstance(i));
		
		System.out.println(">>>>>>>>>>>>>>>>>>>");
		int[] numbers = {10,20,30};

		Object[] mixObjects = {i, s, f};
		
		for(Object o : mixObjects)
		{
			if(o instanceof String)
			{
				System.out.println(o);
			}
		}
	
	}

}
