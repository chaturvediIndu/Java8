package lambda;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramExample {

    public static int getAnagrams(List<String> words) {
        Map<String, String> map = new HashMap<>();

        for (String word : words) {
            System.out.println("word here " + word);


            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = String.valueOf(chars);
            String sorted1 = new String(chars);

            System.out.println(" Sorted    " + sorted1);
            System.out.println("---------------- ");
            map.put(sorted1, sorted1);



/*
        Map <String, String> map1 = words.stream()
                .filter(word -> { char [] my = word.toCharArray();  Arrays.sort(my);  String sortedWord = new String(my);})
                .collect(Collectors.toMap(sortedWord, sortedWord));
        System.out.println("count of the map " +map.size());
*/

        }

        System.out.println("map.values() " + map.values());
        return map.size();
    }

    public static void main(String[] args) {

        List<String> words = Arrays.asList("inch", "cat", "chin", "kit", "act" );
        System.out.println(AnagramExample.getAnagrams(words));

        }
}
