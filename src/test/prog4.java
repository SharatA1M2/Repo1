package test;



public class prog4 {
	

	public static void main(String args[]) 
	 { 
	     double IRR=10.5 ; //Refer Simplified calculator based on age,tenure and amount
	     double days=11; //CRED_PROTECT prem rate as per age_band and tenure
	     double loanAmount=70000;
	     double pre_emi;
	     pre_emi= Math.round((loanAmount*IRR/(100*365)*days));   
	    
	     System.out.println(pre_emi); 
	   

	    
	 } 
	} 
