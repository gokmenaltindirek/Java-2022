package loopDemo;

public class Main {

	public static void main(String[] args) {
		//For
        //i+1 : i++ (i yi birer birer artırır)
        //i-1 : i-- (i yi birer birer azaltır)
        //tek sayılar : i=1 ; ... ; i+=2
        //çift sayılar : i=2 ; ... ; i+=2
        for (int i = 2; i<10; i+=2) {
            System.out.println(i);
        }
        System.out.println("For döngüsü bitti");



        int i = 1;
        //While
        while (i<10) {
            System.out.println(i);
            //i nin artış miktarı tanımlanmazsa infinite loop a girer. bu yüzden aşağıdaki gibi tanımlanır:
            i+=2;
        }

        System.out.println("While döngüsü bitti");

        //Do-While: while dan farkı > while ile tanımlanan şart sağlanmasa bile en az bir kere çalışır.
        //j=100 durumunda 100 çıktısı alınır ancak devamı gelmez.
        //Veritabanına döngünün çalıştığına dair log atmak istenirse kullanılabilir.
        int j = 1;
        do {
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("Do-While döngüsü bitti");

	}

}
