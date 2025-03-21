package mapexamples;

import java.util.HashMap;
import java.util.Map;
/*To solve the problem of expanding the input string s = "w4a3h1" into wwwwaaah using a Map and ensuring an O(n) complexity, you can follow these steps:

Parse the Input String: Loop through the string to identify characters and their corresponding counts.
Store in a Map: Store each character and its count in a Map.
Build the Output String: Use the Map to build the expanded string.
*/
public class Main {
    public static void main(String[] args) {
        String s = "w4a3h1";
        
        // Step 1: Parse the input string and store in a Map
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (int i = 0; i < s.length(); i += 2) {
            char c = s.charAt(i); // Character
            int count = Character.getNumericValue(s.charAt(i + 1)); // Corresponding count
            charCountMap.put(c, count);
        }
        
        // Step 2: Build the output string
        StringBuilder output = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                output.append(c);
            }
        }
        
        // Print the output string
        System.out.println(output.toString()); // Output: wwwwaaah
    }
}

