package kr.co.edu.test;

public class Test {
	
	public static void main(String[] args) {
		
		TestClass2 testClass2 = new TestClass2();
		
		try {
			int result = testClass2.getTestClass().sum(1, 1);
			System.out.println("result : " + result);
			
			int result2 = testClass2.getTestClass().sum(1, 1);
			
			System.out.println("result2 : " + result2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
