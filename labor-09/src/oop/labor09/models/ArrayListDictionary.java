package oop.labor09.models;

import oop.labor09.models.interfaces.IDictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListDictionary implements IDictionary {
    private List<String> words = new ArrayList<>();//ArrayList for the words in our dictionary
    private static ArrayListDictionary instance = null;//the one and only dictionary

    private ArrayListDictionary() {
        try (Scanner scanner = new Scanner(new File(DICTIONARY_FILE))) {//filling up the dictionary
            while (scanner.hasNextLine()) {
                add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static IDictionary newInstance() {//creating the dictionary(only once!)
        if (instance == null) {
            instance = new ArrayListDictionary();
        }
        return instance;
    }

    @Override
    public boolean add(String word) {//adding a new word to the dictionary
        if (!find(word)) {
            words.add(word);
            return true;
        }
        return false;
    }

    @Override
    public boolean find(String word) {//finding a word in the dictionary
        return words.contains(word);
    }

    @Override
    public int size() {//number of words in the dictionary
        return words.size();
    }
}
