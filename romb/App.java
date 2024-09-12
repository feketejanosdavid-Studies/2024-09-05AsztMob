import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("Rombusz kerület-terület számítás");

		Scanner sc = new Scanner(System.in);

		System.out.print("Oldal: ");
		String sideStr = sc.nextLine();
		double side = Double.parseDouble(sideStr);

		System.out.print("Alfa: ");
		String alphaStr = sc.nextLine();
		double alpha = Double.parseDouble(alphaStr);

		double perimeter = side * 4;
		double rad = alpha * Math.PI / 180;
		double area = Math.pow(side, 2) * Math.sin(rad);
		
		//formázott kimenet
		System.out.printf("Kerület: %.2f\n", perimeter);
		System.out.printf("Terület: %.2f\n", area);
	}
}
