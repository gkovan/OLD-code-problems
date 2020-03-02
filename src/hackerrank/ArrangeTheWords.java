package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/***********
We define a sentence to be a string of space-separated words that starts with a capital letter followed by
lowercase letters and spaces, and ends with a period, i.e., it satisfies the regular expression ^[A-Z][a-z
]*\.$. We want to rearrange the words in a sentence such that the following conditions are satisfied:
1. Each word is ordered by length, ascending.
2. Words of equal length must appear in the same order as in the original sentence.
3. The rearranged sentence must be formatted to satisfy the regular expression ^[A-Z][a-z ]*\.$
For example, consider the sentence Cats and hats. First the words are ordered by length, maintaining
original order for ties: [and, cats, hats]. Now reassemble the sentence, applying formatting: And cats hats.

***********/

/*************

Sample Input 0
The lines are printed in reverse order.

Sample Output 0
In the are lines order printed reverse.

*************/

public class ArrangeTheWords {

	/*
	 * Complete the 'arrange' function below.
	 *
	 * The function is expected to return a STRING. The function accepts STRING
	 * sentence as parameter.
	 */
	public static String arrange(String sentence) {
		sentence = sentence.substring(0, sentence.length() - 1).toLowerCase();
		Map<Integer, List<String>> map = new TreeMap<>();
		String[] split = sentence.split(" ");
		StringBuilder stringb = new StringBuilder();
		Arrays.stream(split).forEach(s -> {
			int len = s.length();
			map.putIfAbsent(len, new ArrayList<>());
			map.get(len).add(s);
		});
		map.forEach((key, value) -> value.forEach(s -> stringb.append(s).append(" ")));
		String answer = stringb.toString().trim();
		answer = answer.substring(0, 1).toUpperCase() + answer.substring(1) + ".";
		return answer;
	}
	
	public static void main(String[] args) {
		
		String str = "The lines are printed in reverse order.";
		String result  = arrange(str);
		System.out.println(result);	
	}

}
