package selections;

import java.util.Scanner;

public class PointPosition {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		double x0,y0,x1,y1,x2,y2;
		
		System.out.println("Enter three points for p0, p1, and p2: ");
		
		x0=input.nextDouble();
		y0=input.nextDouble();
		x1=input.nextDouble();
		y1=input.nextDouble();
		x2=input.nextDouble();
		y2=input.nextDouble();
		
		String p0="( "+x0+" , "+y0+" ) ";
		String p1="( "+x1+" , "+y1+" ) ";
		String p2="( "+x2+" , "+y2+" ) ";
		
		double condition=(x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);
		
		if(condition>0) {
			System.out.println(p2+" is on the left side of the line from "+p0+p1);
		}else if(condition==0) {
			System.out.println(p2+" is on the same side of the line from "+p0+p1);
		}else {
			System.out.println(p2+" is on the right side of the line from "+p0+p1);
		}
	}

}
