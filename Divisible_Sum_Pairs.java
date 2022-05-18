class Divisible_Sum_Pairs {

    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    // Write your code here
    int count=0;
    for(int i=0;i<ar.size();i++)
    {
        for(int j=i+1;j<ar.size();j++)
        {
            if((ar.get(i)+ar.get(j))%k==0)
            {
                count++;
            }
        }
    }
    return count;
    }

}
