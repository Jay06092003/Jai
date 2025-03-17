
public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int i=1;
		int c=0;
		do {
			if(n%i==0) {
				c++;
				} 		
				i++;
		}		
	
		while(i<=n);
		if(c==2)
		{
			System.out.println("it a prime ");
		}
		else {
			System.out.println("it a not prime ");
		}
}
	}


