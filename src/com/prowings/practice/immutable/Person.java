package com.prowings.practice.immutable;

public final class Person {

	private final int pid;
	private final String name;
	private final Address addr;
	
	public Person() {
		super();
		this.pid = 0;
		this.name = "";
		this.addr = new Address();
	}
	public Person(int pid, String name, Address addr) {
		super();
		this.pid = pid;
		this.name = name;
//		this.addr = addr;
		
		Address dummyAddr = new Address();
		dummyAddr.setPin(addr.getPin());
		dummyAddr.setCountry(addr.getCountry());
		
		this.addr = dummyAddr;
		
	}
	public int getPid() {
		return pid;
	}
	public String getName() {
		return name;
	}
	public Address getAddr() {
//		return addr;
		Address dummyAddr = new Address();
		dummyAddr.setPin(this.addr.getPin());
		dummyAddr.setCountry(this.addr.getCountry());
		
		return dummyAddr;
		
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", addr=" + addr + "]";
	}
	
	
	
}
