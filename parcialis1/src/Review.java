public class Review {
    private final String text;
    private final int ertekeles;

    public Review(String text, int ertekeles) {
        this.text = text;
        this.ertekeles = ertekeles;
    }

    public String getText() {
        return text;
    }

    public int getErtekeles() {
        return ertekeles;
    }
    public String toString(){
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < this.ertekeles; i++) {
            temp.append("*");
        }
        return temp + this.text + "\n";
    }
}
