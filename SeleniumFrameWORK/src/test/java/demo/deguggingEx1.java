package demo;

public class deguggingEx1 {

	public static void main(String[] args) {
     int a=10;
     int b=40;
     
     int temp;
     temp=a;
    a=b;
    b=temp;
    System.out.println(a);
    System.out.println(b);
	}

}
