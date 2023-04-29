package oop.labor09.models;

import oop.labor09.models.enums.DictionaryType;
import oop.labor09.models.interfaces.IDictionary;

import static oop.labor09.models.ArrayListDictionary.newInstance;

public class DictionaryProvider {
    public static IDictionary createDictionary(DictionaryType type) {//creating the dictionary
        IDictionary dictionary = null; //initializing the dictionary
        switch (type) {//switch case for the type of our dictionary
            case ARRAY_LIST:
                dictionary = ArrayListDictionary.newInstance();
                break;
            case HASH_SET:
                dictionary = HashSetDictionary.newInstance();//not existing yet!
                break;
            case TREE_SET:
                dictionary = TreeSetDictionary.newInstance();//not existing yet!
                break;
        }
        return dictionary;//the completed dictionary
    }
}
