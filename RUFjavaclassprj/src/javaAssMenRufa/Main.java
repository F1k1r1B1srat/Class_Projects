package javaAssMenRufa;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x;
		Circle c=new Circle();
		Square s=new Square();
		Triangle t=new Triangle();
		Rectangle r=new Rectangle();
		
		Scanner taker= new Scanner(System.in);
		System.out.println("Select the type of Shape you want:( 1- 2D Shape, 2- 3D Shape ):");
		x=taker.nextInt();
		while(x!=1&x!=2) {
			 System.out.println("Wrong input please refer the instruction");
			 System.out.println("Select the type of Shape you want:( 1- 2D Shape, 2- 3D Shape ):");
		}
			 
		
		if(x==1) {
			System.out.println("Select from 2D Shapes:( 1-Circle,2-Square,3-Triangle,4-Rectangle,5-Polygon ):");
			x=taker.nextInt();
			
			while(x!=1&x!=2&x!=3&x!=4&x!=5) { 
				
				 System.out.println("Wrong input please refer the instruction");
				 System.out.println("Select from 2D Shapes:( 1-Circle,2-Square,3-Triangle,4-Rectangle,5-Polygon ):");
				 x=taker.nextInt();
			      }
			switch(x) {
			case 1:
			System.out.println("Enter the radius: ");
			x=taker.nextInt();
			c.setRadius(x);
			c.area();
			c.perimeter();
			c.display();
			break;
			
			case 2: 
				System.out.println("Enter the Length: ");
				x=taker.nextInt();
				s.setLength(x);
				s.area();
				s.perimeter();
				s.display();
				break;
			              
			case 3: 
				System.out.println("Enter the Length and width respectivly: ");
				x=taker.nextInt();
				r.setLength(x);
				x=taker.nextInt();
				r.setWidth(x);
				
				r.area();
				r.perimeter();
				r.display();
				break;
				
			case 4:
				System.out.println("Please enter the base,height,side A&B respectivly: ");
				t.setBase(taker.nextInt());
				t.setHeight(taker.nextInt());
				t.setSideA(taker.nextInt());
				t.setSideC(taker.nextInt());
				
				t.area();
				t.perimeter();
				t.display();
				break;
				
			case 5:
				System.out.println("Select the type of polygon:(1-Hexagon,2-Heptagon,3-Octagon): ");
				x=taker.nextInt();
				while(x!=1&x!=2&x!=3) {
					 System.out.println("Wrong input please refer the instruction");
					 System.out.println("Select the type of polygon:(1-Hexagon,2-Heptagon,3-Octagon): ");
				}
				if(x==1) {
					
				}
				else if(x==2){
					
				}
				else {
					
				}
				
				
					break;
			              }
			
			else {
				System.out.println("Select from 3D Shapes:(1-Sphere,2-Cylinder,3-Cone,4-Cube,5-Pyramid ): ");
				x=taker.nextInt();
				
			
			}
		
		}
		
		taker.close();
		
	}
		
	
	}


