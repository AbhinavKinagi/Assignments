package in.ac.kletech;

public class University {

	final static String code1="E30";
	final static String code2="E241";
	int noOfStud[]=new int[8];
	School[] s=new School[8];
	static
	{
		System.out.println("KLETECH University");
		System.out.println("CET codes :"+code1+"and"+code2);
	}
	class School
	{
		private String sProgramCOde;
		private String sSchoolCoordinator;
		private int iNoOfStud;
		private int iNoOfStaff;
		
		public String getsProgramCOde() {
			return sProgramCOde;
		}
		public String getsSchoolCoordinator() {
			return sSchoolCoordinator;
		}
		public int getiNoOfStud() {
			return iNoOfStud;
		}
		public int getiNoOfStaff() {
			return iNoOfStaff;
		}
		public School(String sProgramCOde,String sSchoolCoordinator,int iNoOfStud,int iNoOfStaff)
		{
			super();
			this.sProgramCOde=sProgramCOde;
			this.sSchoolCoordinator=sSchoolCoordinator;
			if(iNoOfStud>120)
				System.out.println("Intake exceeded in "+this.sProgramCOde);
				else
					this.iNoOfStud=iNoOfStud;
					this.iNoOfStaff=iNoOfStaff;
			}
		}
		void generateSchool()
		{
			s[0]=new School("CS","John",50,20);
			s[1]=new School("EC","David",60,20);
			s[2]=new School("EE","Ramesh",50,20);
			s[3]=new School("IT","Suresh",70,20);
			s[4]=new School("BT","Yuvraj",40,10);
			s[5]=new School("AM","Mitchell",90,20);
			s[6]=new School("CV","Ambrose",50,20);
			s[7]=new School("IP","Kane",124,20);
		}
		
		void calNoOfStud()
		{
			for(int i=0;i<noOfStud.length;i++)
			{
				noOfStud[i]=s[i].getiNoOfStud();
			}
		}
	}
	

