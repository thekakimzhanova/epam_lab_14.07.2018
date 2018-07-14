 
package javaapplication29;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Алия
 * Reference: решение было написано с помощью источника https://www.codevscolor.com/java-count-words-repeating-words/
 */


public class JavaApplication29 {


    public static void main(String[] args) {
        
        String inputText = "";        
        Scanner scanner = new Scanner(System.in);       
        int count;        
        System.out.println("Enter your text: ");        
        inputText = scanner.nextLine();
        
        String[] wordsArray = inputText.replaceAll("[^a-z^A-Z]"," ").split("\\s+");
        String[] tokensArray = inputText.replaceAll("[^a-z^A-Z]","").split("");  
     
        HashMap<String, Integer> mapWords = new HashMap<>();
        HashMap<String, Integer> mapTokens = new HashMap<>();
        
        for (String word : wordsArray) {
            
            if (mapWords.containsKey(word)) {
                count = mapWords.get(word);
                mapWords.put(word, count + 1);
            } else {
                mapWords.put(word, 1);
            }
        }
        for (String token : tokensArray) {
            
            if (mapTokens.containsKey(token)) {
                count = mapTokens.get(token);
                mapTokens.put(token, count + 1);
            } else {
                mapTokens.put(token, 1);
            }
        }
        
        for (Map.Entry<String, Integer> entry : mapWords.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
         for (Map.Entry<String, Integer> entry2 : mapTokens.entrySet()) {
            System.out.println(entry2.getKey() + " : " + entry2.getValue());
        }
         scanner.close();
    }
}
    
