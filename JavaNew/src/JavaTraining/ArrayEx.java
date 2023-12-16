package JavaTraining;

public class ArrayEx {//store multiple value in single line
public static void main(String[] args) {

	int a[]= {20,30,40,50,10}; 
	int a1[]=new int[5];
	a1[0]= 20;
	a1[1]= 30;
	a1[2]= 40;
	a1[3]= 50;
	a1[4]= 10;
	for (int i = 0; i < a.length; i++){
		System.out.println(a[i]);
		
	}
	System.out.println(a.length);
	for (int i = 0; i < a1.length; i++){
		
		System.out.println(a1[i]);
	}
	
	
}
}

