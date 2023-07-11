
public class JourneyCalculatorApp {
	public static void main(String[] args) {
		// TODO Auto-generated method 
//		Scanner sc = new Scanner(System.in);
		JourneyCalculator journeyCalculator = new JourneyCalculator();
//		double result = journeyCalculator.calculateDistance(60.0,1.5);
//		double result = journeyCalculator.calculateDistance(sc.nextDouble(), sc.nextDouble());

		System.out.printf("%.2f",journeyCalculator.calculateDistance(60.0,1.5));
	}
}
