package oop.labor10.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Aramkor {
    private List<Alkatresz>alkatreszek = new ArrayList<>();
    List<Ellenallas>ellenallasok = new ArrayList<>();
    public Aramkor(){
        alkatreszek = new ArrayList<>();
    }
    public Aramkor(String file){
        this.alkatreszek = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File(file))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] tokens = line.split(" ");
                String alk = tokens[0].trim();
                double ar = Double.parseDouble(tokens[1].trim());
                if(alk.equals("Kondenzator")){
                    double ertek = Double.parseDouble(tokens[2].trim());
                    alkatreszek.add(new Kondenzator(ar, ertek));
                }
                if(alk.equals("Ellenallas")){
                    double ertek = Double.parseDouble(tokens[2].trim());
                    alkatreszek.add(new Ellenallas(ar, ertek));
                }
                if(alk.equals("Tranzisztor")){
                    String kod = tokens[2].trim();
                    alkatreszek.add(new Tranzisztor(ar, kod));
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void hozzaad(Alkatresz alk){
        alkatreszek.add(alk);
        if(alk.getClass() == Ellenallas.class){
            ellenallasok.add((Ellenallas) alk);
        }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aramkor aramkor = (Aramkor) o;
        if(aramkor.alkatreszekSzama() != this.alkatreszekSzama()) return false;
        for(int i = 0; i < alkatreszekSzama(); ++i){
            if(!alkatreszek.contains(aramkor.alkatreszek.get(i))) return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(alkatreszek);
    }

    public boolean keresAlkatresz(Alkatresz alk){
        return alkatreszek.contains(alk);
    }
    public boolean csakEllenallasok(){
        for(Alkatresz a : alkatreszek){
            if (a.getClass() != Ellenallas.class)
                return false;
        }
        return true;
    }
    public double eredoEllenallas(){
        double sum = 0;
        if(csakEllenallasok()){
            for (Ellenallas e : ellenallasok){
                sum += e.getErtek();
            }
            return sum;
        }
        return -1;
    }
    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        for(Alkatresz e : alkatreszek){
            result.append("\t" + e + "\n");
        }
        return "Aramkor: \n" + result;
    }
}
