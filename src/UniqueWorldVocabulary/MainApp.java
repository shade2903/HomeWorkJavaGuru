package UniqueWorldVocabulary;

public class MainApp {
    public static void main(String[] args) {
        UniqueWordVocabulary wordVocabulary = new UniqueWordVocabulary();
        wordVocabulary.addWord("vova");
        wordVocabulary.addWord("lena");
        wordVocabulary.addWord("marin");
        wordVocabulary.addWord("vova");
        System.out.println(wordVocabulary.getWordsCount());
        wordVocabulary.printVocabulary();



    }
}
