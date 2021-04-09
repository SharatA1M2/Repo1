package test;



public class prog3 {
	

	public static void main(String args[]) 
	 { 
	     double Sarv_Suarksha_prem=1985 ; //Refer Simplified calculator based on age,tenure and amount
	     double cred_prem_rate=9.27; //CRED_PROTECT prem rate as per age_band and tenure
	     double loanAmount=75000;
	     double tenure_month=60;
	     double cred_prem ;
	     double cred_prem_gst;
	     double total_ins_prem;
	     double monthly_ins_prem;
	     cred_prem= Math.round((loanAmount/1000)*cred_prem_rate);   
	     cred_prem_gst=Math.round(cred_prem+0.18*cred_prem);
	     total_ins_prem= Math.round(cred_prem_gst+Sarv_Suarksha_prem);
	     monthly_ins_prem=Math.round(total_ins_prem/tenure_month);
	     
	     System.out.println(Sarv_Suarksha_prem); 
	     System.out.println(cred_prem_gst); 
	     System.out.println(total_ins_prem); 
	     System.out.println(monthly_ins_prem); 
	    

	    
	 } 
	} 




