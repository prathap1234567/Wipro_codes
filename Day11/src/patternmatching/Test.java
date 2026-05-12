package patternmatching;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj1=new Success("Transaction is Success");
		Object obj2=new Pending("Transaction is Pending");
		Object obj3=new Failure("Transaction Failed");
		
		Object obj=switch(obj2) {
		case Success(String message)->message;
		case Pending(String message)->message;
		case Failure(String message)->message;
		
		case null,default->"default";

	};
	System.out.println(obj);
	}
}
