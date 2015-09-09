package com.study.basic1.hashcode;

public class Temp1 {


	
	public static void main(String[] args) {
	
		Temp1 t = new Temp1();
		
		t.whatIsHashCode();		// practiece 1
		t.funnyTest1_1();		// practiece 2
		
	}
	
	
	
	
	
	
	private String data = null;
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}


	public String abc= "A";
	public static String s_abc = "A";
	

	/**
	 * 	HashCode��??
	 */
	public void whatIsHashCode(){
		// TODO HashCode �� ���ؼ� ���� �˾ƺ����Ѵ�. (�̿ϼ�..)
		
		
		
		Temp1 t1 = new Temp1();	// instance ���� 1 �ʱ�ȭ
		Temp1 t2 = new Temp1();	// instance ���� 2 �ʱ�ȭ
		String abc = "A";		// �������� �ʱ�ȭ
		

		
		/*
		 *	
		 * 	HashCode �� �޸𸮸� ���� ����Ű�°��� �ƴ�, JVM ���� �����ϴ� �޸𸮸� ����Ű�� Ư���� �ڵ��� �Ѵ�.
		 * 	�� ����Ǵ� ������ �ٸ��ٸ�, �ʱ�ȭ �� ���� ���Ƶ� �޸��ּҰ� ���� �޶�� �ϴ°� �ƴѰ�?
		 * 
		 * 	������ �Ʒ� ���� ����� �ٸ� 5���� String ������ hashCode�� ��� ����.
		 * 	������ �޶� ���� ������ HashCode �� ��� ���� ������ �ñ��ϴ�.
		 */
		
		
		// instance ���� 1
		System.out.println("[1] "+t1.abc + "/" + t1.abc.hashCode());
		// instance ���� 2
		System.out.println("[2] "+t2.abc + "/" + t2.abc.hashCode());
		// ��������
		System.out.println("[3] "+abc + "/" + abc.hashCode());
		// ��������
		System.out.println("[4] "+this.abc + "/" + this.abc.hashCode());
		// �������� (static)
		System.out.println("[5] "+s_abc + "/" + s_abc.hashCode());
		
	}



	/**
	 *  ���Կ������� Ư�̻���
	 */
	public void funnyTest1_1(){
		
		Temp1 t1 = new Temp1();		
		Temp1 t2 = new Temp1();	
		
		

		t1.setData("������ 1");
		t2.setData("������ 2");
		
		System.out.println("�翬�� ���� �ٸ�  �ؽ��ڵ� : " + t1.hashCode() + " / " + t2.hashCode());
		System.out.println("�翬�� ���� �ٸ� ������ : " + t1.getData() + " / " + t2.getData());
		
		
		// t1 �� �ؽ��ڵ带 t2�� �ؽ��ڵ�� �����ع�����.
		t1 = t2;	

		
		System.out.println("������ ���� �ؽ��ڵ� : " + t1.hashCode() + " / " + t2.hashCode());
		System.out.println("������ ���� ������ : " + t1.getData() + "/" + t2.getData());					 
		
		
		
		// t1 �� t2�� ������ �޸� �ּҰ��� ���� �����Ƿ�, ���߿� setData �� "������ 4" �� ���� �ȴ�.
		t1.setData("������ 3");
		t2.setData("������ 4");
		

		System.out.println("t1�� set �ϵ� t2�� set �ϵ� ������ �ؽ��ڵ� : " + t1.hashCode() + " / " + t2.hashCode());
		System.out.println("t1�� set �ϵ� t2�� set �ϵ� ������ ������ : " + t1.getData() + "/" + t2.getData());

		System.out.println(t1==t2);
		System.out.println(t1.equals(t2));
		
		
	}
	
	
	
	
	
	
	
	
	@Override
	public int hashCode() {
		// eclipse �ڵ�����
		final int prime = 31;
		int result = 1;
		result = prime * result + ((abc == null) ? 0 : abc.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		// eclipse �ڵ�����
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
