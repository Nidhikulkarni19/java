//Dog---> guarding(String location)
//House---> watch(String location)---> Dog.guarding(location)
//main()---> House.watch("Gate");

class Dog
{
	public static void guarding(String location)
	{
		System.out.println("running guarding in class dog");
		System.out.println("location :"+location);
		
	}
}