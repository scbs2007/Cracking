package chapter1;
import java.util.*;

public class Q1 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		Set<Character> m = new HashSet<Character>();
		boolean flag = true;
		int i;
		for(i=0;i<s.length();++i)
		{
			char ch = s.charAt(i);
			if(m.contains(ch))
			{
				flag = false;
				System.out.println("False");
				break;
			}
			m.add(ch);
			
		}
		if(flag)
			System.out.println("True");
		System.out.println("Without using additional DS");
		int p1, p2;
		flag = true;
		for(p1=0; p1<s.length()-1; ++p1)
		{
			for(p2 = p1+1; p2<s.length();++p2)
			{
				if(s.charAt(p1) == s.charAt(p2))
				{
					flag = false;
					System.out.println("False");
					break;
				}
			}
			if(!flag)
				break;
		}
		if(flag)
			System.out.println("True");
		
		sc.close();
	}
}
