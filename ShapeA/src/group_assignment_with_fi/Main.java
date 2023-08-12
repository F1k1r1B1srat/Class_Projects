package group_assignment_with_fi;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int choice=10;
		System.out.println("Hello, What type of Shape do you want to calculate?");
		while(choice!=0) {
		System.out.println("1. 2D shapes\n"
				+ "2. 3D shapes\n"
				+ "0. exit");
		choice=scan.nextInt();
		switch(choice) {
		case 1: 
					System.out.println("1. Circle\n"
							+ "2. Square\n"
							+ "3. Triangle\n"
							+ "4. Rectangle\n"
							+ "5. Hexagon\n"
							+ "6. Heptagon\n"
							+ "7. Octagon\n"
							+ "0. exit");
					choice=scan.nextInt();
		break;
		case 2: 
			System.out.println("1. Sphare"
					+ "2. Cylinder\n"
					+ "3. Cone\n"
					+ "4. Cube\n"
					+ "5. Triangular Pyramid\n"
					+ "6. Square pyramind\n"
					+ "0. exit");
			break;
			default:
				System.out.println("Invalid input");
				break;
		
		}
		
	}}
}
