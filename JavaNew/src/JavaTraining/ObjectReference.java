package JavaTraining;

import java.util.Scanner;

public class ObjectReference {
	public void add(int i, int j) {


		System.out.println(i + j);

	}     

	public void sub(int i, int j) {

		System.out.println(i - j);

	}

	public void multi(int i, int j) {


		System.out.println(i * j);

	}

	public void div(int i, int j) {


		System.out.println(i / j);

	}

	public static void main(String[] args) {


		Scanner sc;
		sc=new Scanner(System.in);
		System.out.println("Enter two values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		
		ObjectReference r= new ObjectReference();//object reference of the class
		r.add(a, b);
		r.multi(a, b);
		r.sub(a, b);
		r.div(a, b);
		

	}

}
