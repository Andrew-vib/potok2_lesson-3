package lesson3;

import java.util.*;

public class ArrayClass {

public static void main(String[] args){

        String[] arrWords = {"облако", "рельс", "кляча", "лабаз", "курок",
                            "нефть","рельс", "отражение", "баржа", "сирота",
                            "корсар", "облако", "одеколон"};


        Map<String, Integer> map = new HashMap<>();
        for (String getWord : arrWords) {
                map.put(getWord, map.getOrDefault(getWord, 0) + 1);
        }
        System.out.println("Words occur n-times: ");
        System.out.println(map);



        Set<String> uniq = new HashSet<>(Arrays.asList(arrWords));
        System.out.println("List of unique words: ");
        System.out.println(uniq);



}
}
