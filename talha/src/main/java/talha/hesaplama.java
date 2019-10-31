package talha;

import java.util.*;
import java.math.*;

import java.util.Scanner;

public class hesaplama {
	
	public static String topla(String sayi1,String sayi2) {
		BigDecimal bigDecimal1 = new BigDecimal(sayi1);
		BigDecimal bigDecimal2 = new BigDecimal(sayi2);
		return bigDecimal1
				.add(new BigDecimal(sayi2))
				.toPlainString();
		
		
	}
	public static void main(String[] args) {
		
		
		Scanner konsolOku = new Scanner(System.in);
		System.out.print("sayi 1 giriniz: ");
		String sayi1 = konsolOku.nextLine();
		System.out.print("sayi 2 giriniz: ");
		String sayi2 = konsolOku.nextLine();
		
		String sonuc = hesaplama.topla(sayi1,sayi2);
		System.out.printf("%s + %s = %s",sayi1,sayi2,sonuc);
	}

}
