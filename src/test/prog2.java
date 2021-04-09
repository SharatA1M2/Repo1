package test;

public class prog2 {
	

	public static void main(String args[]) 
	 { 
	     double rateOfInterest = 16.5; //interest
	     double tMonths = 36; //tenure
	     double loanAmountcal = 304403; //amount including Ins Prem
	     double finalEMI ;
	     double rate1;
	     double rate2;
	     double rate3;
	     double newrate;
	     double principle;
	     double Net_Disb;
	     double Processing_Fee;
	     double Stamp_Duty;
	     double Pre_emi;
	     double Ins_prem;
	     newrate = rateOfInterest/(100*12);   // newrate is to be divided by 100 and then divided by 12 (for conversion of ROI to monthly and for %)
	     rate1 = (1 + newrate);
	     rate2 = Math.pow(rate1, tMonths);
	     rate3 = (rate2 - 1);
	     principle = (loanAmountcal) * (newrate) * rate2;
	     finalEMI = Math.round(principle / rate3);
	     //EMI = (i / 12) * a * Math.pow((1 + (i / 12)), t) / (1 - Math.pow((1 + (i / 12)), t));
	     System.out.println( finalEMI); 
	     //Net Disb
	     
	  
	     Processing_Fee=3000;
	     Stamp_Duty=500;
	     Pre_emi=0;
	     Ins_prem=10000;
	     Net_Disb=loanAmountcal-(Processing_Fee+Stamp_Duty+ Pre_emi+Ins_prem);
	     System.out.println(Net_Disb); 
	     

	    
	 } 
	} 



