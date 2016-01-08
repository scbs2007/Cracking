package chapter1;

import java.util.*;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		StringBuilder res = new StringBuilder();
		
		String s = sc.nextLine();
		HashMap <Character, Integer> m = new HashMap<Character, Integer>();
		for(int i=0;i<s.length();++i)
		{
			char ch = (s.charAt(i));
			if(m.containsKey(ch))
			{
				m.put(ch, m.get(ch)+1);
			}
			else
				m.put(ch, 1);
		}
		for(Map.Entry<Character, Integer> entry:m.entrySet())
		{
			res.append(""+entry.getKey()+entry.getValue());
		}
		
		System.out.println(res.toString());
		sc.close();	
	}

}
