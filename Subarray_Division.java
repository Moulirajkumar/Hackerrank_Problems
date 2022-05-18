class Subarray_Division {

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
    // Write your code here
    int count=0;
    for(int i=0;i<=s.size()-m;i++)
    {
        int sum=0;
        for(int j=i;j<i+m;j++)
        {
            sum=sum+s.get(j);
        }
        if(sum==d)
        {
            count++;
        }
    }
    return count;
    }

}