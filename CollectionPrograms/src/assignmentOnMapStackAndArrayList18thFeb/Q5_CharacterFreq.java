package assignmentOnMapStackAndArrayList18thFeb;

import java.util.HashMap;

public class Q5_CharacterFreq {

	public static void main(String[] args) {
		String s = "pizzapan";
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i = 0; i < s.length(); i++)
		{
			Character ch = s.charAt(i);
			
			int cnt = 1;
			
			if(hm.containsKey(ch))
			{
				Integer in = hm.get(ch);
				cnt = cnt + 1;
				
				hm.put(ch, cnt);
			}
			else
			{
				hm.put(ch, 1);
			}
		}
		
		System.out.println(hm);

	}

}
