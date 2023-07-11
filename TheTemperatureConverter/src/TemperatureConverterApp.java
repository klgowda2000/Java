import java.util.Scanner;

public class TemperatureConverterApp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		TemperaturConverter t = new TemperaturConverter();
		System.out.printf("%.2f",t.convertFahrenheitToCelsius(sc.nextDouble()));
		sc.close();
	}
}
