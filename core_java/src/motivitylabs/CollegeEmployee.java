package motivitylabs;

public class CollegeEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff employee1=new Staff();
		employee1.id=10101;
		employee1.name="kumar";
		Staff.collegeName="Sr";
		Staff.department="C.S.E";
		
		
		System.out.println("the id:"+employee1.id+" name is "+employee1.name+" dapartment is: "+Staff.department+" subject teaches by him is ");
		employee1.subjectTeaches("java");
		employee1.subjectTeaches("java","python");
		
		
		Staff employee2=new Staff();
		employee2.id=10102;
		employee2.name="nikhil";
		System.out.println("the id:"+employee2.id+" name is "+employee2.name+" dapartment is: "+Staff.department+" subject teaches by him is ");
		employee2.subjectTeaches("Web design");
		employee2.subjectTeaches("python","javascript");

	}

}

//method overloading
class Staff{
	int id;
	String name;
	static String collegeName;
	static String department;
	void subjectTeaches(String subject1) {
		System.out.println("the subject teachers by him is "+subject1);
	}
	void subjectTeaches(String subject1,String subject2) {
		System.out.println("the subject teachers by him is "+subject1+" "+subject2);
		
	}
}
class Non_Teaching{
	void labsTeaches(String subject1) {
		System.out.println("The lab teacher maintains is "+subject1);
	}
	void labsTeaches(String subject1,String subject2) {
		System.out.println("the labs teaches maintains is "+subject1+" "+subject2);
	}
}
