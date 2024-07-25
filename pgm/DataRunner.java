class DataRunner{
	public static void main(String[] args)
	{
		int start=4;
		int end=3;
		int result=start+end;
		
		start=start+end; //re-assign
		boolean same=result==start;
		System.out.println(same); //explicit reference
		System.out.println(result); //explicit reference
		System.out.println(10); //here 10 is stored in constant pool
		//location of 10 and then passes to println
		// this type of reference is called as IMPLICIT REFERENCE(if ref variable doesn't have variable pointing to the location)
		
		int doorNo=67; //explicit reference
		System.out.println(99); //implicit reference
		
		String email="contact@x-workz.in";
		System.out.println("om@x-workz.in");
		
		System.out.println(email+" OF X-WORKZ");  //string concatination
		
		System.out.println("===========================================");
		System.out.println(5+4);
		System.out.println("5+4");
		System.out.println("A"+"B");
		
		double salary=10.500;
		String name="vaijayant & chey2 together";
		System.out.println("salary of "+name +" is: "+salary); //here we have total 5 references
		
		
	}
}