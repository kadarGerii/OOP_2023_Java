package extra.util;

import java.util.ArrayList;

public class Degree {
    private String degree;
    private static ArrayList<String> degrees = new ArrayList<>();
    public Degree(String degree){
        this.degree = degree;
        if(!degrees.contains(degree)){
            degrees.add(degree);
        }
    }
    public void setDegree(String degree){
        this.degree = degree;

    }

    public String getDegree() {
        return degree;
    }

    public static ArrayList<String> getDegrees() {
        return degrees;
    }

    @Override
    public String toString() {
        return degree;
    }
}
