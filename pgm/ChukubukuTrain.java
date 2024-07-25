class ChukubukuTrain
{
	public static void main(String[] args)
	{
		Train.book("SBC" ,"Miraj");
		Train.book("Belagavi" , "UgarKhurd" , 4440);
		Train.book("Vijayapur" , "Yeshwantpura" , 4540 , 1290.9980);
		Train.cancel(1234567890);
		Train.cancel("Ahmadnagar" , "Hyderabad");
	}
}