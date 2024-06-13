package main;
import java.util.Scanner;

public class yakıtTutarı {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Aracınız kaç kilometre kuruş yakıyor? ");
		double kurus=scanner.nextDouble();
		
        System.out.println("Aracınızla kaç kilometre gittiniz? "); 
        
        int km =scanner.nextInt();
        
        System.out.println("Toplam ödemeniz gereken tutar: "+ (kurus*km) + "tl'dir..");
		

	}

}
