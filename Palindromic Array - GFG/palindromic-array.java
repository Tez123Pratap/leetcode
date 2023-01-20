//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
    public static boolean reverse(int num){
        int no=num;
        int sum=0;
        while(no>0){
            sum=sum*10+(no%10);
            no/=10;
        }
        if(sum==num)
            return true;
        return false;
    }
	public static int palinArray(int[] a, int n)
           {
                  for(int i=0;i<n;i++){
                      if(reverse(a[i])) continue;
                        return 0;
                  }
                  return 1;
           }
           
}