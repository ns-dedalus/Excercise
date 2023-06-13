package Exercise1;

public class CarClass {

    String parts1 ="abc";
    String parts2 = "xyz";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarClass CC = new CarClass();
		CC.CarMethod1();
		System.out.println("parts1: "+CC.parts1);
		
		CarClass CC2 = new CarClass();
		CC2.CarMehtod2();
		System.out.println("parts2: "+CC2.parts2);
		
		
	}

	public void CarMethod1()
	{
		String Model1 ="XUV300";
		int AirBags =6;
		System.out.println("Model1: "+Model1);
		System.out.println("AirBags: "+AirBags);
	}
	
	public void CarMehtod2()
	{
		String Model2 ="XUV500";
		int AirBags = 8;
		System.out.println("Model2: "+Model2);
		System.out.println("AirBags: "+AirBags);
	}
}
