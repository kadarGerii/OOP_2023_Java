import java.util.ArrayList;

public class Szallas {
    private final int ID;
    private final String name;
    private final String location;
    private ArrayList<Review> reviews = new ArrayList<>();
    private static int counter = 0;

    public Szallas(String name, String location) {
        this.name = name;
        this.location = location;
        this.ID = counter++;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
    public void newReview(Review review){
        this.reviews.add(review);
    }
    public double avgReview(){
        double sum = 0.0;
        for(Review r: reviews){
            sum+=r.getErtekeles();
        }
        if(reviews.size()==0){
            return Double.NaN;
        }
        return (double)sum/reviews.size();
    }
    public ArrayList<String> getReviewMessages(){
        ArrayList<String> messages= new ArrayList<>();
        for (Review r:reviews){
            if(r.getErtekeles()>=4){
                messages.add(r.getText());
            }
        }
        return messages;
    }
    public String allReviews(){
        StringBuffer result = new StringBuffer();
        for (Review r : reviews){
            result.append("\t" + r);
        }
        return this.getName() + "\n" + result;
    }
}
