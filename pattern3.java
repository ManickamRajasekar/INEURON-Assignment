
public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int n=10;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)//M
			{
				if(j==0 || j==(n-1)
						|| i==j && i<=(n-1)/2
						|| i+j==(n-1) && j>(n-1)/2) 
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");

				}
			}
			System.out.print(" ");
			for(j=0;j<n;j++)//A
			{
				if(i==0 && j>0 && j<(3*n)/4
						|| j==0 && i>0
						|| j==(3*n)/4 && i>0
						|| i==(n-1)/2 && j<=(3*n)/4) 
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");

				}
			}
			for(j=0;j<n;j++)//N
			{
				if(j==0 
						|| j==(n-1) 
						|| i==j) 
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");

				}
			}
			System.out.print("  ");
			for(j=0;j<n;j++)//I
			{
				if(i==0 || i==(n-1) || j==(n-1)/2) 
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");

				}
			}
			System.out.print("  ");
			for(j=0;j<n;j++)//C
			{
				if(i==0 && j>0 || j==0 && i>0 && i<(n-1) || i==(n-1) && j>0) 
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");

				}

			}
			System.out.print("  ");

			for(j=0;j<n;j++)//K
			{
				if(j==0 || i+j==(n-1)/2 || i-j==(n-1)/2) 
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");

				}
			}
			for(j=0;j<n;j++)//A
			{
				if(i==0 && j>0 && j<(3*n)/4
						|| j==0 && i>0
						|| j==(3*n)/4 && i>0
						|| i==(n-1)/2 && j<=(3*n)/4) 
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");

				}
			}
			for(j=0;j<n;j++)//M
			{
				if(j==0 || j==(n-1)
						|| i==j && i<=(n-1)/2
						|| i+j==(n-1) && j>(n-1)/2) 
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");

				}
			}
			System.out.print("         ");
			for(j=0;j<n;j++)//I
			{
				if(i==0 || i==(n-1) || j==(n-1)/2) 
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");

				}
			}
			System.out.print("  ");
			for(j=0;j<n;j++)//N
			{
				if(j==0 
						|| j==(n-1) 
						|| i==j) 
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");

				}
			}
			System.out.print("  ");
			for(j=0;j<n;j++)//E
			{
				if(i==0 || i==(n-1) || j==0 || i==(n-1)/2) 
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");

				}
			}
			System.out.print("  ");
			for(j=0;j<n;j++)//U
			{
				if(i==(n-1) && j>0 && j<(n-1) || j==0 && i<(n-1) || j==(n-1) && i<(n-1)) 
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");

				}
			}
			System.out.print("  ");
			for(j=0;j<n;j++)//R
			{
				if(j==0 || i==0 && j<(3*n)/4 || j==(3*n)/4 && i>0 && i<=(n-1)/2 || i==n/2 && j<(3*n)/4 || i>n/2 && i==j)

				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");

				} 
			}
			System.out.print("  ");
			for(j=0;j<n;j++)//O
			{
				if(i==0 && j>0 && j<(n-1) || j==0 && i>0 && i<(n-1) || i==(n-1) && j>0 && j<(n-1) || j==(n-1) && i>0 && i<(n-1))

				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");

				} 
			}
			System.out.print("  ");
			for(j=0;j<n;j++)//N
			{
				if(j==0 || i==j || j==(n-1))

				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");

				} 
			}
			System.out.print("  ");
			System.out.println();
		}
	}

}
