import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		int n;
		String description;
		double weight = 0;
		String zone;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input number of package:");
		n = scanner.nextInt();		
		
		Scanner scannerDes = new Scanner(System.in);
		Scanner scannerWeight = new Scanner(System.in);
		Scanner scannerZone = new Scanner(System.in);

		StringBuilder sb = new StringBuilder();
		double lowRate = 0;
		String lowzone;
		String shippingName = "";
		for(int i=0; i<n; i++) {
			System.out.println("Input description:");
			description = scannerDes.nextLine();
			
			weight = 1;
			
			System.out.println("Input weight:");
			try {
				weight =getDouble(scannerWeight.nextLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Input zone:");
			zone = scannerZone.nextLine();
			
			ShippingUSA objUPS = new UPS(description, weight, zone, "Other");
			ShippingUSA objUS_Mail = new US_Mail(description, weight, zone, "Other");
			ShippingUSA objFedEx = new FedEx(description, weight, zone, "Other");
			
			List<ShippingUSA> obj = new ArrayList<ShippingUSA>();
			obj.add(objUPS);
			obj.add(objUS_Mail);
			obj.add(objFedEx);
			
			lowRate=obj.get(0).getRate();
			shippingName = obj.get(0).getClass().getName();
			for(int j=1; j<3; j++) {
				if(obj.get(j).getRate() < lowRate) 
				{
					lowRate = obj.get(j).getRate();
					shippingName = obj.get(j).getClass().getName();
					
					if(obj.get(j).getPersonType().equals("Student")) {
						lowRate = lowRate - lowRate * 0.1;
					}
					else if(obj.get(j).getPersonType().equals("Senior")){
						lowRate = lowRate - lowRate * 0.15;
					}
				}
			}
			
			sb.append(description + "   $" + lowRate + "   " + shippingName + "\n");
		}
		
		System.out.println(sb.toString());
	}
	
	public static double getDouble(String st) throws IOException // reads an double from the keyboard input
    {
	    String s = st;
	    return (Double.valueOf(s)).doubleValue();
    }


}
