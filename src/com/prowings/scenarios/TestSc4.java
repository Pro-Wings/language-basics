package com.prowings.scenarios;

class TestSc4 {

	public void method(Object i) {
		System.out.println("Object");
	}

//	public void method(String i) {
//		System.out.println("String");
//	}

//	public void method(Integer i) {
//		System.out.println("Integer");
//	}

//	public void method(Float i) {
//		System.out.println("Float");
//	}

	public void method(Number i) {
		System.out.println("Number");
	}

	public static void main(String[] args) {

		TestSc4 t = new TestSc4();
		t.method(null);
	}

}