import java.io.*;
class A
{
	public static void main(String ar[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			
			int numberOfEmptyCells = 0;
			int numberOfX = 0;
			int numberOfO = 0;
			
			char grid[][] = new char[3][3];
			for(int i = 0;i<3;i++)
			{
				String s = br.readLine();
				for(int j = 0;j<3;j++)
				{
					grid[i][j] = s.charAt(j);
					if(grid[i][j] == '_')numberOfEmptyCells++;
					if(grid[i][j] == 'X')numberOfX++;
					if(grid[i][j] == 'O')numberOfO++;
				}
			}
			
			int numberOfWinX = 0;
			int numberOfWinO = 0;
			
			//first column
			if(grid[0][0] == 'X' && grid[1][0] == 'X' && grid[2][0] == 'X')numberOfWinX =1;
			if(grid[0][0] == 'O' && grid[1][0] == 'O' && grid[2][0] == 'O')numberOfWinO =1;
			
			//last row
			if(grid[2][0] == 'X' && grid[2][1] == 'X' && grid[2][2] == 'X')numberOfWinX =1;
			if(grid[2][0] == 'O' && grid[2][1] == 'O' && grid[2][2] == 'O')numberOfWinO =1;
			
			//last column
			if(grid[2][2] == 'X' && grid[1][2] == 'X' && grid[0][2] == 'X')numberOfWinX =1;
			if(grid[2][2] == 'O' && grid[1][2] == 'O' && grid[0][2] == 'O')numberOfWinO =1;
			
			//first row
			if(grid[0][2] == 'X' && grid[0][1] == 'X' && grid[0][0] == 'X')numberOfWinX =1;
			if(grid[0][2] == 'O' && grid[0][1] == 'O' && grid[0][0] == 'O')numberOfWinO =1;
			
			
			//second row
			if(grid[1][2] == 'X' && grid[1][1] == 'X' && grid[1][0] == 'X')numberOfWinX =1;
			if(grid[1][2] == 'O' && grid[1][1] == 'O' && grid[1][0] == 'O')numberOfWinO =1;
			
			//second column
			if(grid[0][1] == 'X' && grid[1][1] == 'X' && grid[2][1] == 'X')numberOfWinX =1;
			if(grid[0][1] == 'O' && grid[1][1] == 'O' && grid[2][1] == 'O')numberOfWinO =1;

			// diagonals from 0 0 
			if(grid[0][0] == 'X' && grid[1][1] == 'X' && grid[2][2] == 'X')numberOfWinX =1;
			if(grid[0][0] == 'O' && grid[1][1] == 'O' && grid[2][2] == 'O')numberOfWinO =1;
			
			//last digonal
			if(grid[0][2] == 'X' && grid[1][1] == 'X' && grid[2][0] == 'X')numberOfWinX =1;
			if(grid[0][2] == 'O' && grid[1][1] == 'O' && grid[2][0] == 'O')numberOfWinO =1;
			

			
			if((numberOfWinX ==1 && numberOfWinO  ==1 )|| (numberOfX - numberOfO < 0) || (numberOfX - numberOfO > 1))
			{
				System.out.println(3); 
			}
			else if(numberOfO == 0 && numberOfX == 0 && numberOfEmptyCells == 9){
				System.out.println(2);
			}
			else if((numberOfWinX ==1 && numberOfWinO == 0 && numberOfX > numberOfO))
			{
				System.out.println(1);
			}
			else if((numberOfWinX ==0 && numberOfWinO == 1 && numberOfX == numberOfO))
			{
				System.out.println(1);
			}
			else if(numberOfWinX == 0 && numberOfWinO == 0 && numberOfEmptyCells == 0)
			{
				System.out.println(1);
			}
			else if(numberOfWinX == 0 && numberOfWinO == 0 && numberOfEmptyCells > 0)
			{
				System.out.println(2);
			}
			else
			{
				System.out.println(3); 
				
			}
			
		}
	}
}