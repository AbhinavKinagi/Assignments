package in.ac.kletech;

abstract class Customer {
	int iCustID;
	String sCustName;
	double dBillAmt;
	String sTeleno;
	
	Customer(int iCustID,String sCustName,String sTeleno,double dBillAmt)
	{
		this.iCustID=iCustID;
		this.sCustName=sCustName;
		this.sTeleno=sTeleno;
		this.dBillAmt=dBillAmt;
	}
	
	void displayDetails()
	{
		System.out.println("\n");
		System.out.println("Customer ID is "+iCustID);
		System.out.println("Customer Name is :"+sCustName);
		System.out.println("Customer phone no is: "+sTeleno);
		System.out.println("Bill Amount is :"+dBillAmt);
	}
	void computeBill(){}
}
class RegularCustomer extends Customer{
	double dDis;
	RegularCustomer(int iCustID,String sCustName,String sTeleno,double dBillAmt,double dDis)
	{
		super(iCustID,sCustName,sTeleno,dBillAmt);
		this.dDis=dDis;
	}
	void computeBill()
	{
		dBillAmt=dBillAmt*0.5;
		System.out.println("5% discount for regular customer & total Bill Amount:"+dBillAmt);
	}
}	
	class PrivilagedCustomer extends Customer{
		String smemodtype;
		PrivilagedCustomer(int iCustID,String sCustName,String sTeleno,double dBillAmt,String smemodtype)
		{
			super(iCustID,sCustName,sTeleno,dBillAmt);
			this.smemodtype=smemodtype;
		}
		void computeBill()
		{
			if(smemodtype=="gold")
			{
				dBillAmt=dBillAmt*0.20;
				System.out.println("20% discount &total bill amount:"+dBillAmt);
			}
			if(smemodtype=="silver")
			{
				dBillAmt=dBillAmt*0.15;
				System.out.println("15% discount &total bill amount:"+dBillAmt);
			}
			if(smemodtype=="bronze")
			{
				dBillAmt=dBillAmt*0.10;
				System.out.println("10% discount &total bill amount:"+dBillAmt);
			}
	
	}
}
