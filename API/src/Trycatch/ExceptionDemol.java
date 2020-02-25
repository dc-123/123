package Trycatch;

public class ExceptionDemol {

	public static void main(String[] args) {
		System.out.println("程序开始");
		try {
			    String str =null;
			     System.out.println(str.length());
		} catch (Exception e) {
			System.out.println("出现空指针异常");
		}
	   
	     System.out.println("程序结束");
	}

}
