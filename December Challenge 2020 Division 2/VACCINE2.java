	import java.io.*;

	class A
	{
		public static void main(String ar[])throws Exception
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int t = Integer.parseInt(br.readLine().trim());
			
			while(t-- >0)
			{
				String in[] = br.readLine().split(" ");
				int n = Integer.parseInt(in[0]);
				int D = Integer.parseInt(in[1]);
				
				int arr[] = new int[n];
				
				String num[] = br.readLine().split(" ");
				int inriskPeople = 0;
				for(int i=0;i<num.length;i++){
					arr[i]  = Integer.parseInt(num[i]);
					if(arr[i]>= 80 || arr[i] <= 9)inriskPeople++;
				}
				
				int count = 0;
				int totaldays = 0;
				if(inriskPeople != 0)
				{
					for(int i=0;i<num.length;i++)
					{
						if(arr[i] != -1)
						{
							if(arr[i] <= 9 || arr[i] >= 80)
							{
								count++;
								inriskPeople--;
								arr[i] = -1;
								if(count == D)
								{
									totaldays++;
									count = 0;
								}
							}
							if(inriskPeople == 0)break;
						}
					}
				}
				if(count != 0)totaldays++;
				count = 0;
				for(int i = 0;i<arr.length;i++)
				{
					if(arr[i] != -1)
					{
						count++;
						arr[i] =-1;
						if(count == D)
						{
							totaldays++;
							count = 0;
							
						}
					}
				}
				
				if(count != 0)totaldays++;
				System.out.println(totaldays);
			}	
		}
	}