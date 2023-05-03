package oop.labor10.models;

import java.util.Objects;

public class Kondenzator extends Alkatresz{
    private final double ertek;

    public Kondenzator(double ar, double ertek) {
        super(ar);
        this.ertek = ertek;
    }

    public double getErtek() {
        return ertek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Kondenzator that = (Kondenzator) o;
        return Double.compare(that.ertek, ertek) == 0 && that.getAr() == getAr();
    }

    @Override
    public int hashCode() {
        return Objects.hash(ertek);
    }

    @Override
    public String toString() {
        return "Kondenzator: " + ertek + " Ara: " + getAr();
    }
}
