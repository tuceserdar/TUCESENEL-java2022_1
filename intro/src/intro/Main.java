package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		String ortaMetin="İlginizi çekebilir";
		String altMetin="Vade süresi";
		
		System.out.println(ortaMetin);
		
		int vade =12;
		double dolarDun= 18.25;
		double dolarBugun= 18.30;
		
		boolean dolarDustuMu= false; //boolean mesela bi buton var internet şube. müşteri giriş yaptıysa
									 // göstermiyoruz. göster gösterme  durumlarında boolean kullanılıyor
		
		
		String okYonu="";
		
		if (dolarBugun<dolarDun) {
			okYonu="down.jpg";
			System.out.println(okYonu);
		} 
		
		else if (dolarBugun==dolarDun) {
			okYonu="eşittir.jpg";
			System.out.println(okYonu);
			
		}
		
		else {
			okYonu="up.jpg";
			System.out.println(okYonu);
		}
		
		// hızlı kredi yazan alandaki veriler nasıl tutuluyor? mesela trendyolda mac ruj diye aratıyosun binlerce ürün geliyor. 
		//her birini tek tek string diyip veri tanımlanmıyor. bunlar array ile tutuluyor
		//tek bir değişkende veri tutma array içinde oluyor.

		String [] krediler= {"Hızlı Kredi","Kamu Personeli", "Emekli"};
		for (int i = 0; i < krediler.length; i++) {
			
			System.out.println(krediler[i]);
			
		}
	}
	
}




