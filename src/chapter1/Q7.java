package chapter1;

import java.util.BitSet;
import java.util.Scanner;

public class Q7 {

	public static void disp(int M, int N, int arr[][])
	{
		for(int i=0;i<M;++i)
		{
			for(int j=0;j<N;++j)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int M=sc.nextInt();
		int N = sc.nextInt();
		int i,j;
		int arr[][]=new int[M][N];
		for(i =0; i<M; ++i)
			{
			for(j=0;j<N;++j)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		disp(M,N,arr);
		BitSet row = new BitSet(M);
		BitSet col = new BitSet(N);
		
		for(i=0;i<M;i++)
		{
			if(row.get(i)==true)
				continue;
			for(j=0;j<N;++j)
			{	
				if(col.get(j)==true)
					continue;
				if(arr[i][j]==0)
				{
					row.set(i);
					col.set(j);
				}
			}
		}
		for(i=0;i<M;i++)
		{
			if(row.get(i)==true)
			{	
				for(j=0;j<N;++j)
					arr[i][j]=0;
			}
		}
		for(i=0;i<N;i++)
		{
			if(col.get(i)==true)
			{	
				for(j=0;j<M;++j)
					arr[j][i]=0;
			}
		}
		disp(M,N,arr);
		sc.close();
	}

}
