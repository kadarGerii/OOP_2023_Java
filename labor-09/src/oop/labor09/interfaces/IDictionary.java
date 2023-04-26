package oop.labor09.interfaces;

public interface IDictionary {
    final static String DICTIONARY_FILE = "dict.txt";
    boolean add(String word);
    boolean find(String word);
    int size();
}
