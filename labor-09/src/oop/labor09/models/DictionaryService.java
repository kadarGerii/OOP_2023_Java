package oop.labor09.models;

import oop.labor09.models.enums.DictionaryType;
import oop.labor09.models.interfaces.IDictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DictionaryService {
    private IDictionary dictionary;

    public DictionaryService(DictionaryType type) {
        DictionaryProvider.createDictionary(type);//create a "type" type of dictionary
    }

    public boolean findWord(String word) {
        return dictionary.find(word);//calls the find() method
    }

    public ArrayList<String> findWordsFile(String wordFile) {
        List<String> words = new ArrayList<>();//creating ArrayList for words we want to search
        try(Scanner scanner = new Scanner(new File(wordFile))){//opening the file of the words we want to search
            while(scanner.hasNextLine()){
                words.add(scanner.nextLine());//reading the words to an ArrayList
            }
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        ArrayList<String> unknown = new ArrayList<>();//creating an ArrayList for the unknown words
        for(String w : words){
            if(!findWord(w)){
                unknown.add(w);//collecting all the unknown words from that file above
            }
        }
        return unknown;//returning all the unknown words
    }
}
