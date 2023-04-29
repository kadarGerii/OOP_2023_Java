package oop.labor09.models.interfaces;

public interface IDictionary {
    final static String DICTIONARY_FILE = "dict.txt";//name of the .txt file we will work with

    boolean add(String word);// adding a word to an ArrayList/Hash-set/Tree-set dictionary

    boolean find(String word);//finding a word in a dictionary

    int size();//return the size of the dictionary
}
