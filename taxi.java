package notort;

import java.util.Scanner;

public class Not {

	public static void main(String[] args) {

	int km;
	double perKm = 2.20 , total = 10;
	
	
	Scanner input = new Scanner(System.in);
	System.out.print("Mesafeyi KM Cinsinden Giriniz :");
	km = input.nextInt();
	
	

	
		
	
	
	
	total += km*perKm;
	
		
	if (total<=20) {
		total = 20; 
	}
	System.out.println("Ödeyeceğiniz Tutar :" +total);
		
		
		
		
		
		
		
		
		
		
	} 

}
 