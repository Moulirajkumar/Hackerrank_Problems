public class Cats_and_a_Mouse {
    
    public static String meth1(int x,int y,int z)
    {
        int result1=Math.abs(x-z);
        int result2=Math.abs(y-z);
        if(result1==result2)
        {
            return "Mouse C";
        }
        else if(result1>result2)
        {
            return "Cat B";
        }
        else
        {
            return "Cat A";
        }
    } 
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            String result=meth1(a,b,c);
            System.out.println(result);
        }
    }
}
