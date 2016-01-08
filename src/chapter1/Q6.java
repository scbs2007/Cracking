package chapter1;
import java.util.*;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][]= new int [n][n];
		int i, j;
		
		for(i = 0;i < n; ++i)
		{
			for(j = 0;j < n; ++j)
				arr[i][j] = sc.nextInt();
		}
		
		sc.close();
	}

}
