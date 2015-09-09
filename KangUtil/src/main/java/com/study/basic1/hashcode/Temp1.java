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
	public static String s_abc = "A";
	
	public static void main(String[] args) {
	
		Temp1 t = new Temp1();

		
//		t.whatIsHashCode();
		t.funnyTest1_1();
		
	}
	
	

	/**
	 * 	HashCode란??
	 */
	public void whatIsHashCode(){
		// TODO HashCode 에 대해서 좀더 알아봐야한다. (미완성..)
		
		
		
		Temp1 t1 = new Temp1();	// instance 변수 1 초기화
		Temp1 t2 = new Temp1();	// instance 변수 2 초기화
		String abc = "A";		// 지역변수 초기화
		

		
		/*
		 *	
		 * 	HashCode 는 메모리를 직접 가르키는것이 아닌, JVM 에서 관리하는 메모리를 가르키는 특정한 코드라고 한다.
		 * 	즉 선언되는 변수가 다르다면, 초기화 된 값이 같아도 메모리주소가 각각 달라야 하는것 아닌가?
		 * 
		 * 	하지만 아래 선언 방식이 다른 5가지 String 변수의 hashCode가 모두 같다.
		 * 	변수가 달라도 값이 같으면 HashCode 가 모두 같은 이유가 궁금하다.
		 */
		
		
		// instance 변수 1
		System.out.println("[1] "+t1.abc + "/" + t1.abc.hashCode());
		// instance 변수 2
		System.out.println("[2] "+t2.abc + "/" + t2.abc.hashCode());
		// 지역변수
		System.out.println("[3] "+abc + "/" + abc.hashCode());
		// 전역변수
		System.out.println("[4] "+this.abc + "/" + this.abc.hashCode());
		// 전역변수 (static)
		System.out.println("[5] "+s_abc + "/" + s_abc.hashCode());
		
	}



	/**
	 *  대입연산자의 특이사항
	 */
	public void funnyTest1_1(){
		
		Temp1 t1 = new Temp1();		
		Temp1 t2 = new Temp1();	
		
		

		t1.setData("데이터 1");
		t2.setData("데이터 2");
		
		System.out.println("당연히 서로 다른  해시코드 : " + t1.hashCode() + " / " + t2.hashCode());
		System.out.println("당연히 서로 다른 데이터 : " + t1.getData() + " / " + t2.getData());
		
		
		// t1 의 해시코드를 t2의 해시코드로 대입해버린다.
		t1 = t2;	

		
		System.out.println("같아져 버린 해시코드 : " + t1.hashCode() + " / " + t2.hashCode());
		System.out.println("같아져 버린 데이터 : " + t1.getData() + "/" + t2.getData());					 
		
		
		
		// t1 과 t2는 동일한 메모리 주소값을 갖고 있으므로, 나중에 setData 한 "데이터 4" 로 들어가게 된다.
		t1.setData("데이터 3");
		t2.setData("데이터 4");
		

		System.out.println("t1에 set 하든 t2에 set 하든 동일한 해시코드 : " + t1.hashCode() + " / " + t2.hashCode());
		System.out.println("t1에 set 하든 t2에 set 하든 동일한 데이터 : " + t1.getData() + "/" + t2.getData());

		System.out.println(t1==t2);
		System.out.println(t1.equals(t2));
		
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((abc == null) ? 0 : abc.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Temp1 other = (Temp1) obj;
		if (abc == null) {
			if (other.abc != null)
				return false;
		} else if (!abc.equals(other.abc))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}
}
