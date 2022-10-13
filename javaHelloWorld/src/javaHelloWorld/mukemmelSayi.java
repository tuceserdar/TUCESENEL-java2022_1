package javaHelloWorld;

public class mukemmelSayi {

	public static void main(String[] args) {
		
		int number=17;
		int toplam=0;
		
		for (int i = 1; i > number; i++) {
			if (number % i ==0) {
				toplam=toplam+i;
			}
			
			if(toplam==number) {
				System.out.println("mükemmel");
			}
			else {
				System.out.println("mükemmel değil");
			}
		}
		
		
		
	}

}
