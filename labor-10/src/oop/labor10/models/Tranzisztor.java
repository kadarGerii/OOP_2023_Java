package oop.labor10.models;

import java.util.Objects;

public class Tranzisztor extends Alkatresz{
    private final String kod;

    public Tranzisztor(double ar, String kod) {
        super(ar);
        this.kod = kod;
    }

    public String getKod() {
        return kod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Tranzisztor that = (Tranzisztor) o;
        return Objects.equals(kod, that.kod) && getAr() == that.getAr();
    }

    @Override
    public int hashCode() {
        return Objects.hash(kod);
    }

    @Override
    public String toString() {
        return "Tranzisztor: " + kod + " Ara: " + getAr();
    }
}
