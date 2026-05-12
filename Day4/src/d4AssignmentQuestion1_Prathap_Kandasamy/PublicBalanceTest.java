package d4AssignmentQuestion1_Prathap_Kandasamy;

public class PublicBalanceTest {

	public static void main(String[] args) {
		
		PublicBalanceTest acc=new PublicBalanceTest();
		
		try{
			acc.deposit(6000);
			acc.withdraw(2000);
			acc.withdraw(10000); 
			
		}catch (InvalidAmountException e) {
		    System.out.println(e.getMessage());
		}
		catch (InsufficientBalanceException e) {
		    System.out.println(e.getMessage());
		}
	}
    double balance= 5000;

    public void deposit(double amount) throws InvalidAmountException{

        try{
            if (amount<=0){
                throw new InvalidAmountException("Invalid deposit amount");
            }

            balance +=amount;
            System.out.println("Deposited: "+amount);
            System.out.println("Balance: "+balance);

        } finally{
            System.out.println("Transaction attempt completed");
        }
    }

    public void withdraw(double amount)
            throws InvalidAmountException, InsufficientBalanceException{

        try{
            if (amount<=0){
                throw new InvalidAmountException("Invalid withdraw amount");
            }

            if (amount>balance){
                throw new InsufficientBalanceException("Insufficient balance");
            }

            balance-=amount;
            System.out.println("Withdrawn: "+amount);
            System.out.println("Balance: "+balance);

        } finally{
            System.out.println("Transaction attempt completed");
        }
    }

}