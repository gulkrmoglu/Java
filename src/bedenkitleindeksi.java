package main;

import java.util.Scanner;

public class bedenkitleindeksi {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Kilonuzu Girin: ");
		int kilo=scanner.nextInt();
        System.out.println("Boyunuzu Girin: ");
        double boy=scanner.nextDouble();
        double bki=kilo/(boy*boy);
        
        System.out.println("Beden kitle indeksiniz: " + bki);
	}

}
