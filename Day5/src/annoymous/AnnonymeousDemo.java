package annoymous;

public class AnnonymeousDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
		BankOps iciciBank=new BankOps() {
			@Override
			public void withdraw(double amount) {
				System.out.println("Withdrawing amount "+amount+" from ICIC Bank");
			}
		};
		
        iciciBank.withdraw(5000);

        BankOps hdfcBank=new BankOps(){
        	@Override
            public void withdraw(double amount){
                System.out.println("Withdrawing amount " +amount+ " from HDFC Bank");
            }
        };
        hdfcBank.withdraw(10000);
	}

}
