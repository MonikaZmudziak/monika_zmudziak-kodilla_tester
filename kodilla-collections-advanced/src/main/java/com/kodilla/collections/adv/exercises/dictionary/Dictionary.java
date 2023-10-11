package com.kodilla.collections.adv.exercises.dictionary;

import java.util.*;

public class Dictionary {
/**Klasa ta będzie przechowywała wpisy słownika w mapie:

 Map<String, List<EnglishWord>>
 Kluczami będą polskie słowa, a wartościami – listy odpowiadających im
 słów angielskich. Klasa będzie posiadała trzy metody: addWord,
 która będzie dodawała jeden wpis do słownika, oraz dwie metody o nazwie
 findEnglishWords, różniące się argumentami
 **/

    Map<String, List<EnglishWord>> dictionary = new HashMap<>();

    public void addWord(String polishWord,EnglishWord englishWord){
        List<EnglishWord>englishWords =
                dictionary.getOrDefault(polishWord, new ArrayList<>());
        englishWords.add(englishWord);
        dictionary.put(polishWord,englishWords);
    }

    //metoda wyszukująca angielskie słowa na podstawie polskiego
    public List<EnglishWord> findEnglishWords(String polishWord){
        return dictionary.getOrDefault(polishWord,Collections.emptyList());
    }
// metoda wyszukująca polskie słowa na podstawie polskiego biorąca pod uwagę, jaka część mowy nas interesuje
    public List<EnglishWord> findEnglishWords(String polishWord, PartOfSpeech partOfSpeech){
        List<EnglishWord> result = new ArrayList<>();
        for(EnglishWord englishWord : dictionary.getOrDefault(polishWord, Collections.emptyList())){
            if(englishWord.getPartOfSpeech().equals(partOfSpeech))
                result.add(englishWord);
        }
        return result;

    }
    public int size(){
        return dictionary.size();
    }
}
