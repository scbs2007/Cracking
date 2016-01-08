package chapter1;

import java.util.*;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		char arr[] = s.toCharArray();
		int i = s.length() - 1;
		while(arr[i]==' ')
		{
			i--;
		}
		int count = arr.length-1;
		
		for(; i >= 0; i--)
		{
			if(s.charAt(i) == ' ')
			{
				arr[count--] = '0';
				arr[count--] = '2';
				arr[count--] = '%';
			}
			else
				arr[count--] = s.charAt(i);
		}
		System.out.println(arr);
		sc.close();	
	}

}
