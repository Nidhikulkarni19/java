class Drumstick{
	public static void main(String[] args)
	{
		boolean open=true;
		
		open=false;
		
		boolean start=false;
		
		int doorNo;
		doorNo=125;
		int autoNo=67; //implicit
		autoNo=doorNo; //explicit
		
		open=start;
		doorNo=autoNo;
		int floor=67;
		floor=doorNo;
	}
}