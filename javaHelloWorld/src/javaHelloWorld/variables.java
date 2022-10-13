package javaHelloWorld;

public class variables {

	public static void main(String[] args) {

		double[] myList = { 1.2, 1.5, 1.9, 2.7 };
		double enBuyuk = myList[0];

		for (double number : myList)
			if (enBuyuk < number) {
				enBuyuk = number;

			}
		System.out.println("En büyük sayi:"+enBuyuk);

	}

}
