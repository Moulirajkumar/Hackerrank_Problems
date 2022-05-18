class Beautiful_Days_at_the_Movies {

    /*
     * Complete the 'beautifulDays' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER i
     *  2. INTEGER j
     *  3. INTEGER k
     */

    public static int beautifulDays(int i, int j, int k) {
    // Write your code here
    int count=0;
    for(int a=i;a<=j;a++)
    {
        int temp=a;
        int temp2=a;
        int rev=0;
        while(temp!=0)
        {
            rev=rev*10+temp%10;
            temp=temp/10;
        }
        int store=Math.abs(a-rev);
        if(store%k==0)
        {
            count++;
        }
    }
    return count;

    }

}
