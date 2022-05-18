public class Jumping_on_the_Clouds {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int full=100;
        int temp=arr[(k)%n];
        for(int i=0;i<n;i=i++)
        {
            if((i)%k==0 && arr[i]==0)
            full--;
            else
            full=full-3;
            if(temp==arr[(i+k)%n])
            break;
        }
        System.out.println(full);
    }
}
