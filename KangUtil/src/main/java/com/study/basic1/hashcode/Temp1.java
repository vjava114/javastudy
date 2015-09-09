package com.study.basic1.hashcode;

public class Temp1 {



	private String data = null;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}


	public  String abc= "A";
	
	public static void main(String[] args) {
	
		
		Temp1 t1 = new Temp1();
		Temp1 t2 = new Temp1();

		String abc = "A";
		
		System.out.println(t1.abc.hashCode());
		System.out.println(t2.abc.hashCode());
		System.out.println(abc.hashCode());

		
		

//		HashMap map1 = new HashMap();
//		HashMap map2 = new HashMap();
//
//		map1 = map2;	// Q1. map2의 값이 map1 으로 복사되는걸까?
//		
//		map1.put(1, "AAA");
//		
//		System.out.println(map1.get(1));	//  Q2.  map1 의 값은 뭐가 출력될까?
//		System.out.println(map2.get(1));	//  Q2.  map1 의 값은 뭐가 출력될까?
//		
//		System.out.println(map1.equals(map2));
		

		Temp1 t = new Temp1();

//		t.funnyTest1_1();
//		t.funnyTest1_1();
		
	}


	
	public void funnyTest1_1(){
		
		Temp1 t1 = new Temp1();		
		Temp1 t2 = new Temp1();	
		
		t1.setData("데이터 1");
		t2.setData("데이터 2");
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
		t1 = t2;	// t1 의 메모리 주소값을 t2 로 바꿔준다
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
		System.out.println(t1.getData());
		System.out.println(t2.getData());
		
		System.out.println(t1==t2);
		System.out.println(t1.equals(t2));
		
		
	}
	
	public void funnyTest1_2(){

		Temp1 t1 = new Temp1();		
		Temp1 t2 = new Temp1();		
		
		t1 = t2;			
		
		t1.setData("데이터 1");
		t2.setData("데이터 2");
		
		System.out.println(t1.getData());
		System.out.println(t2.getData());
		
	}
	
	
}
