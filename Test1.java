class Main{	
	public void marry1(){
	  System.out.println("Marry1");
	}
	public static void main(String[] args){
	  Child m = new Child();
	  m.marry1();
	}
}
class Child extends Main{
	public void marry1(){
		System.out.println("Marry2");
	}	
   }
