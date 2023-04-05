import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class UtazasiIroda {
    ArrayList<Szallas> szallasok = new ArrayList<>();
    private static int counter = 0;

    public UtazasiIroda(String file) {
        try(Scanner scanner = new Scanner(new File(file))){

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[]item = line.split(",");
                String name = item[0].trim();
                String place = item[1].trim();
                szallasok.add(new Szallas(name, place));
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public StringBuffer listOffers(){
        StringBuffer result = new StringBuffer();
        for (Szallas sz : szallasok){
            result.append(sz.getID() + " " +  sz.getName() + "  " + sz.getLocation() + "\n");
        }
        return  result;
    }
    public void addReview(int ID, Review review){
        for(Szallas sz : szallasok){
            if(sz.getID() == ID){
                sz.newReview(review);
            }
        }
    }
    public void listBookingReviews(){
        StringBuffer result = new StringBuffer();
        for (Szallas sz: szallasok){
            System.out.println(sz.getName());
            for(String s: sz.getReviewMessages()){
                result.append(s + "\n\t");
            }
            System.out.println(result + "\t" + sz.avgReview());
        }
    }
}
