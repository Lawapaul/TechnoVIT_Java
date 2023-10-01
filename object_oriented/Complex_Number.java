package object_oriented;

public class Complex_Number {
	
	private int re,ima;
	Complex_Number(){
		
		re=1;
		ima=1;
	}
	
	Complex_Number(int i){
		re=ima=i;
		
	}
	Complex_Number(int i,int j){
		
		re=j;
		ima=j;
		
	}
	public void add(Complex_Number t) {
		
		System.out.println("Real: " + (re+t.re));
		System.out.println("Real: " + (ima+t.ima));
	
	public void print() {
		
	}
		
		
	}

}
