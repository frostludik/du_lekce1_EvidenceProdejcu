
import java.net.InetAddress;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        String nameAndSurname;
        LocalDate sellersBirthdate = LocalDate.of(1980, 1, 1);
        int numberOfContracts = 3;
        double weightOfSoldCarrots = 10.5;
        String sellerLocation = "Brno";
        String vehiclePlateNr = "ABC 1234";
        double carConsumption = 5.2;
        String ipAddress = "12.256.30.12";


        double averageCarrotsSoldPerContract = weightOfSoldCarrots / numberOfContracts;

        System.out.println("Průměrné množství prodané mrkve na jednu smlouvu je " + averageCarrotsSoldPerContract + " t.");
    }
}