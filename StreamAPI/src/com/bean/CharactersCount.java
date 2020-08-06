package com.bean;

public class CharactersCount {

	String name;
	long distinctCharacterCount;
	public CharactersCount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CharactersCount(String name, long distinctCharacterCount) {
		super();
		this.name = name;
		this.distinctCharacterCount = distinctCharacterCount;
	}
	@Override
	public String toString() {
		return "CharactersCount [name=" + name + ", distinctCharacterCount=" + distinctCharacterCount + "]";
	}
	
	
	
	
}
