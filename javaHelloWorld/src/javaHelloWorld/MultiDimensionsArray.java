package javaHelloWorld;

public class MultiDimensionsArray {

	public static void main(String[] args) {
		
		String[][] sehirler= new String [3][3];
		sehirler[0][0]="İstanbul";
		sehirler[0][1]="samsun";
		sehirler[0][2]="asda";
		sehirler[1][0]="ordu";
		sehirler[1][1]="izmir";
		sehirler[1][2]="konya";
		String nullSehir="Samsun";
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(sehirler[i][j]);
				
				if (sehirler[i][j]==null) {
					System.out.println(nullSehir);
					
					
			}
			
			}
		}
	}

}
