package com.viewnext;

public class ClassA {
	
	private int num;

	public ClassA(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public void error() throws Exception{
		throw new Exception("Fallo porque me da la gana!!");
	}

	public void errorFinally() throws Exception{
		throw new Exception("Fallo dentro del finaly!!");
	}

}
