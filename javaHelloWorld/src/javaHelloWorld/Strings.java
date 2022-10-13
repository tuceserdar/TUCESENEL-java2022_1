package javaHelloWorld;

import java.util.Iterator;

public class Strings {

	public static void main(String[] args) {
		String mesaj= "Bugün hava çok güzel";
		/*
		 * System.out.println(mesaj);
		 * 
		 * System.out.println("Eleman sayısı:" +mesaj.length());
		 * 
		 * System.out.println("5. eleman:" + mesaj.charAt(4));
		 * 
		 * System.out.println(mesaj.concat(". Yani bence"));
		 * 
		 * System.out.println(mesaj.startsWith("B"));
		 * 
		 * System.out.println(mesaj.endsWith("z"));
		 * 
		 * char[] karakterler = new char[5];
		 * 
		 * mesaj.getChars(1, 5, karakterler, 1);
		 * 
		 * System.out.println(karakterler);
		 * 
		 * System.out.println(mesaj.indexOf("h"));
		 */
		
		/*String yeniMesaj= mesaj.replace(' ','-');
		System.out.println(yeniMesaj); */
		
		String yeniMesaj2=mesaj.substring(2);
		System.out.println(yeniMesaj2);
		
		for (String kelime:mesaj.split(" ")) {
			System.out.println(kelime);
			
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		String mesaj2="                      Tuçe Deniz Ömer                 ";
		System.out.println(mesaj2.trim());
		
	}
	

}

