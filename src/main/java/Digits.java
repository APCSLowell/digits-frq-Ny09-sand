import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ 
	    digitList=new ArrayList<Integer>();
	    digitList.add(0,num%10); 
	    int please = num/10; 
	    while(please>0){
		    digitList.add(0,please%10); 
		    please/=10; 
	    } 
	    
			
		}


	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		for ( int i = 1; i< digitList.size(); i++) {
			if( digitList.get(i)<digitList.get(i-1)){
				return false; 
			} 
		} 
		return true; 
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
