package arrayDemo;

public class Main {

	public static void main(String[] args) {
		 String ogrenci1 = "Aylin";
	        String ogrenci2 = "Ahmet";
	        String ogrenci3 = "Ayşe";

	        System.out.println(ogrenci1);
	        System.out.println(ogrenci2);
	        System.out.println(ogrenci3);

	        System.out.println("--------------------------------");

	        //Yukarıdaki gibi tek tek yazmak yerine dizi tanımlanır:
	        String [] ogrenciler = new String[4];
	        ogrenciler[0]="Aylin";
	        ogrenciler[1]="Ahmet";
	        ogrenciler[2]="Ayşe";
	        ogrenciler[3]="Ayşe";

	        for (int i=0; i<ogrenciler.length;i++) {
	            System.out.println(ogrenciler[i]);
	        }

	        System.out.println("--------------------------------");

	        for (String ogrenci:ogrenciler) {
	            System.out.println(ogrenci);
	        }

	}

}
