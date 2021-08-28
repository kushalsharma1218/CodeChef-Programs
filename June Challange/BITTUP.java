import java.io.*;
class A
{   
    
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(reader.readLine());
		 for (int p1 = 0; p1 < t; p1++){
		     String[] s = reader.readLine().split(" ");
		    long n =  Long.parseLong(s[0]);
            long k =  Long.parseLong(s[1]);
            
           System.out.println(fastPower(n,k,1000000007));
		 }
		 writer.close();
	}
	
	 static long fastPower(long a, long b,int mod){
		  
		     
		     long first= (power(2,a, mod) - 1)%mod;
		     
		     
            long realAns= power(first,b, mod);
            
            
            return realAns;
		 }
		 static long power(long x, long y, long p)
		 {
			long res = 1; // Initialize result
		 
			x = x % p; // Update x if it is more than or
			// equal to p
		 
			if (x == 0)
			  return 0; // In case x is divisible by p;
		 
			while (y > 0)
			{
		 
			  // If y is odd, multiply x with result
			  if ((y & 1) != 0)
				res = (res * x) % p;
		 
			  // y must be even now
			  y = y >> 1; // y = y/2
			  x = (x * x) % p;
			}
			return res;
		 }
}