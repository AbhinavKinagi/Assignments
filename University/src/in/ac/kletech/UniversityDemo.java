package in.ac.kletech;

public class UniversityDemo {

	public static void main(String[] args) {
	University KLETECH=new University();
	KLETECH.generateSchool();
	KLETECH.calNoOfStud();
	for(int i=0;i<KLETECH.noOfStud.length;i++)
	{
		if(KLETECH.noOfStud[i]!=0)
			System.out.println("No of students in "+KLETECH.s[i].getsProgramCOde()+" are: "+ ""+KLETECH.noOfStud[i]);
	}

	}

}
