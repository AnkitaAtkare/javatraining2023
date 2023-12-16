package JavaTraining;

public class ReturnTypeEx {
	
		
	
public void deposite() {

	System.out.println("new account");
}
public int moneywithdraw() {

	System.out.println("current account");
	return 0;
}
public String statement() {

	String s="bnk statement";
	System.out.println("account");

	return "hello";

}
public static void main(String[] args) {

	ReturnTypeEx h= new ReturnTypeEx();
	h.moneywithdraw();
	h.deposite();
System.out.println(h.statement());
}
}
