package com.syntax.class10;

public class ChaseBankAtm extends BankAtm {

	public ChaseBankAtm(double checkingFund, double savingFund) {
		super(checkingFund, savingFund);  // invokes super class constructor
	}
	/* We have two options
 	1. Add unimplemented method and write a logic for these methods --> Make this concrete
 	2. Make ChaseBankAtm class abstract	 	
 */
	
	
	@Override
	public void depositMoney(String accountType, double amount) {
		
		System.out.println(amount+"$ is deposited to your "+accountType + " account");
		
		if(accountType.equals("checking")) {
			checkingFund+=amount;
		}else if(accountType.equals("saving")) {
			savingFund+=amount;
		}
	}
	@Override
	public void depositCheck(String accountType, double amount) {
		System.out.println((amount*0.99)+"$ is deposited to your "+ accountType+ " account");
		
		if(accountType.equals("checking")) {
			checkingFund+=amount*0.99;
		}else if(accountType.equals("saving")) {
			savingFund+=amount*0.99;
		}
	}


}
