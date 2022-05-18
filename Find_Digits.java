class Find_Digits {

    /*
     * Complete the 'findDigits' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int findDigits(int n) {
    // Write your code here
    int temp=n;
    int count=0;
    while(temp!=0)
    {
        int rem=temp%10;
        if(rem==0)
        {
            temp=temp/10;
            continue;
        }
        
        if(n%rem==0)
        {
            count++;
        }
        temp=temp/10;
    }
    return count;
    }

}
