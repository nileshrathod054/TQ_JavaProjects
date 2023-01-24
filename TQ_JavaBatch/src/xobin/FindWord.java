package xobin;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindWord {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input_from_question = br.readLine();
		int count;
		input_from_question = input_from_question.toLowerCase();
		String words[] = input_from_question.split(" ");
		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "0";
				}
			}

			if (count > 1 && words[i] != "0") {
				System.out.println(words[i]);
			}
		}
	}
}
