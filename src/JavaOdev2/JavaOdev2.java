package JavaOdev2;
import java.util.Scanner;
public class JavaOdev2 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		System.out.println("Armut kaç kilo:");
		System.out.println("Elma kaç kilo:");
		System.out.println("Domates kaç kilo:");
		System.out.println("Muz kaç kilo:");
		System.out.println("Patlıcan kaç kilo:");
		double armut = girdi.nextDouble();
		double elma = girdi.nextDouble();
		double dom = girdi.nextDouble();
		double muz = girdi.nextDouble();
		double pat = girdi.nextDouble();
		double top;
		top =(armut*2.14)+(elma*3.67)+(dom*1.11)+(muz*0.95)+(pat*5.00);
		System.out.print("Toplam Tutar:" +top);
	}

}
