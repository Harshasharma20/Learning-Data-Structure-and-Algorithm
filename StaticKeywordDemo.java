class StaticKeywordDemo{
	int empId;
	String empName;
	String companyName;

	public StaticKeywordDemo(int empId,String empName,String companyName){
		this.empId=empId;
		this.empName=empName;
		this.companyName=companyName;
	}

	void display(){
	System.out.println(empId+ ":" +empName+ ":"+companyName);
	}


	public static void main(String[] args){
		StaticKeywordDemo skd1 = new StaticKeywordDemo(10,"Harsha","Harsha Pvt ");
		skd1.display();	
		StaticKeywordDemo skd2 = new StaticKeywordDemo(20,"Bharti","Bharti Pvt ");
		skd2.display();	
		StaticKeywordDemo skd3 = new StaticKeywordDemo(30,"Priyanka","Priyanka Pvt ");
		skd3.display();		
		StaticKeywordDemo skd4 = new StaticKeywordDemo(40,"Aryaman","Aryaman Pvt ");
		skd4.display();	
	}
}
