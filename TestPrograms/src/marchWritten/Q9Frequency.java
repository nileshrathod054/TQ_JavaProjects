package marchWritten;

import java.util.HashMap;

/*9. WAP to print the word frequency using map [1M] E.g. Input: “Nothing is as easy as it looks Nothing” then 
Output: {Nothing=2, is=1, as=2, easy=1, it=1, looks=1} 10. 
import java.util.HashMap;*/

public class Q9Frequency {
	public static void main(String[] args) {
		String str = "Nothing is as easy as it looks Nothing";
		String[] words = str.split(" ");

		HashMap<String, Integer> wordFreq = new HashMap<String, Integer>();

		for (String word : words) {
			if (wordFreq.containsKey(word)) {
				wordFreq.put(word, wordFreq.get(word) + 1);
			} else {
				wordFreq.put(word, 1);
			}
		}

		System.out.println(wordFreq);
	}
}
