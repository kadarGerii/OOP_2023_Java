import java.io.File;
import java.io.FileNotFoundException;
import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Szallas szallas1 = new Szallas("Home Sweet Home", "At home");
        szallas1.newReview(new Review("Tiszta jo", 5));
        szallas1.newReview(new Review("Jo a kaja", 5));
        szallas1.newReview(new Review("Fain szemelyzet", 4));
        System.out.println(szallas1.allReviews());
        UtazasiIroda iroda = new UtazasiIroda("places.csv");
        System.out.println(iroda.listOffers());
        try(Scanner scanner1 = new Scanner(new File("reviews.csv"))){
            scanner1.nextLine();
            while (scanner1.hasNextLine()) {
                String line = scanner1.nextLine();
                String[]item1 = line.split(",");
                int id = Integer.parseInt(item1[0].trim());
                String text = item1[1].trim();
                int ert = Integer.parseInt(item1[2].trim());
                iroda.addReview(id, new Review(text, ert));
            }
        iroda.szallasok.add(szallas1);
        iroda.listBookingReviews();
    }catch(FileNotFoundException e){
            throw(e);
        }
    }
}