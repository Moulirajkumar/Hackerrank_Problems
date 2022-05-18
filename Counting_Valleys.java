class Counting_Valleys {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
    // Write your code here
    int ups=0;
    int downs=0;
    for(int i=0;i<steps;i++)
    {
        if(path.charAt(i)=='U')
        {
            if(ups==-1)
            {
                downs++;
            }
            ups++;
        }
        if(path.charAt(i)=='D')
        {
            ups--;
        }
    }
    return downs;
    }

}
