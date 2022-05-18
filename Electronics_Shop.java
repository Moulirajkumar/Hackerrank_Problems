public class Electronics_Shop {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long budget=sc.nextLong();
        long n=sc.nextLong();
        long m=sc.nextLong();
        int[] arr1=new int[(int)n];
        int[] arr2=new int[(int)m];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        long high=-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                long sum=arr1[i]+arr2[j];
                if(sum>high && sum<=budget)
                {
                    high=sum;
                }
            }
        }
        if(high==0)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(high);
        }
    }
}
