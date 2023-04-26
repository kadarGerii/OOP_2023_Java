package oop.labor09.models;

import oop.labor09.interfaces.IDictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListDictionary implements IDictionary {
    private List<String> words = new ArrayList<>();
    private static ArrayListDictionary instance = null;
    private ArrayListDictionary(){
        try(Scanner scanner = new Scanner(new File(DICTIONARY_FILE))){
            while(scanner.hasNextLine()){
                add(scanner.nextLine());
            }
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }
    public static IDictionary newInstance(){
        if(instance == null){
            instance = new ArrayListDictionary();
        }
        return instance;
    }
    @Override
    public boolean add(String word) {
        if(!find(word)){
            words.add(word);
            return true;
        }
        return false;
    }

    @Override
    public boolean find(String word) {
        return words.contains(word);
    }

    @Override
    public int size() {
        return words.size();
    }
}
