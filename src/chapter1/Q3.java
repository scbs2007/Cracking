package chapter1;
import java.util.*;

public class Q3 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		boolean flag =  false;
		if(s.length()==t.length())
		{
			Map<Character, Integer> m = new HashMap<Character, Integer>();
			Map<Character, Integer> m2 = new HashMap<Character, Integer>();
			int i;
			char ch;
			for(i=0;i<s.length();++i)
			{
				ch = s.charAt(i);
				if(m.containsKey(ch))
				{
					m.put(ch, m.get(ch)+1);
					continue;
				}
				m.put(ch, 1);
			}
			for(i=0;i<t.length();++i)
			{
				ch = t.charAt(i);
				if(m2.containsKey(ch))
				{
					m2.put(ch, m2.get(ch)+1);
					continue;
				}
				m2.put(ch, 1);
			}
			flag = true;
			for(i=0;i<t.length();++i)
			{
				if(m.get(t.charAt(i))!=m.get(s.charAt(i))){
					flag = false;
					break;
				}
			}
		}
		if(flag)
			System.out.println("True");
		else
			System.out.println("False");
		sc.close();
	}
}
