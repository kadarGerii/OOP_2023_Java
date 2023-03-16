package extra.util;

import java.util.ArrayList;

public class Major {
    private ArrayList<String> majors = new ArrayList<>();
    String major;
    public Major(String major){
        this.major = major;
        if(!majors.contains(major)){
            this.majors.add(major);
        }
    }

    public String getCurrentMajor() {
        return major;
    }
    public ArrayList<String> getMajors(){
        return majors;
    }

    public void setParticularMajor(String particularMajor) {
        this.major = particularMajor;
        if (!majors.contains(particularMajor))
            this.majors.add(particularMajor);
    }

    @Override
    public String toString() {
        return this.major;
    }
}
