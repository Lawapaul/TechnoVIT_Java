package object_oriented;

public class Login {
	
	int n;
	Login(int n1){
		n1=n;
	}
	
	void check() {
		if (n==10) {
			System.out.println("Access Granted!");
			
		}
		
	}
	
	class biometric extends Login{
		int f;
		biometric(int n1,int f1){
			super(n1);
			f=f1;
			
		}
	}
	void check1() {
		
		super.check();
		if (f=n+10) {
			System.out.print("Access Granted");
		}
	}
	
	class IN2{
		
		public static void main(String[] args) {
			
			biometric o=new biometric(10,20);
			o1.check();
			
		}
	}
	
	

}
