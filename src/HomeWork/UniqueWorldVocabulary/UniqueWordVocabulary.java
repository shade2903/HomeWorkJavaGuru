package HomeWork.UniqueWorldVocabulary;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {

    Set<String> setList = new HashSet<>();

    public void addWord(String word) {

        setList.add(word);
    }

    public int getWordsCount() {
        return setList.size();
    }

    public void printVocabulary() {
        System.out.println(setList);
    }

}
