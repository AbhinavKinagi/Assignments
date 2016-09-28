package in.ac.kletech;

public class CustomerDemo {

	public static void main(String[] args) {
		
		Customer[] arr=new PrivilagedCustomer[3];
		arr[0]=new PrivilagedCustomer(1,"e","8123458",5000,"gold");
		arr[0].displayDetails();
		arr[0].computeBill();
		
		arr[1]=new PrivilagedCustomer(1,"w","8123458",5000,"gold");
		arr[1].displayDetails();
		arr[1].computeBill();
		
		arr[2]=new PrivilagedCustomer(1,"q","8123458",5000,"gold");
		arr[2].displayDetails();
		arr[2].computeBill();

		Customer[] s=new RegularCustomer[2];
		s[0]=new RegularCustomer(2,"b","12345678",7000,0.1);
		s[0].displayDetails();
		s[0].computeBill();
		
		s[1]=new RegularCustomer(3,"c","87654321",8000,0.5);
		s[1].displayDetails();
		s[1].computeBill();
	}

}
