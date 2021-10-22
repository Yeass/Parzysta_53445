
public class Main {

    public static void main(String[] args) {
        System.out.println("Zadanie 3\n");

        int randomnumber = (int) (Math.random() * (100 - 1));

        System.out.println("Losowo wygenerowana liczba: " + randomnumber);

        if (randomnumber % 2 == 0) {
            System.out.println("Liczba jest parzysta!");
        } else {
            System.out.println("Liczba nie jest parzysta!");
        }

        System.out.println("\nZadanie 4: Klocki LEGO\n");

        int randombricks = (int) (Math.random() * (100 - 50));
        System.out.println("Losowo wygenerowana liczba klockow: " + randombricks);

        int randomcapacity = (int) (Math.random() * (10 - 5));

        if (randomcapacity % 2 != 0) {

            randomcapacity += 1;

        }
        System.out.println("Losowo wygenerowana wielkosc pudelek: " + randomcapacity);

        int resultamount = randombricks / randomcapacity;
        System.out.println("Pelnych pojemnikow jest: " + resultamount);

        int resultamountrest = randombricks % randomcapacity;
        System.out.println("Pustych  pojemnikow jest: " + resultamountrest);

        int resultamountall = resultamount + resultamountrest;
        System.out.println("Wszystkich pojemnikow jest: " + resultamountall);

        System.out.println("\nZadanie 5: VAT\n");

        double netto = 9.99F;
        double brutto = netto * 1.23F;
        System.out.println("Cena brutto produktu: " + brutto);


    }
}