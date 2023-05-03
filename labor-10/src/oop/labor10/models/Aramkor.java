package oop.labor10.models;

import java.util.ArrayList;
import java.util.List;

public class Aramkor {
    private List<Alkatresz>alkatreszek;
    public Aramkor(){
        alkatreszek = new ArrayList<>();
    }
    public void hozzaad(Alkatresz alk){
        alkatreszek.add(alk);
    }
    public int alkatreszekSzama(){
        return alkatreszek.size();
    }
    public double osszAr(){
        double ossz = 0;
        for(Alkatresz a : alkatreszek){
            ossz += a.getAr();
        }
        return ossz;
    }
    public boolean torol(Alkatresz alk){
        for(Alkatresz a : alkatreszek){
            if(a.equals(alk)){
                alkatreszek.remove(a);
                return true;
            }
        }
        return false;
    }
}
