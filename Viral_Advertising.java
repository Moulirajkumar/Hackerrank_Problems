class Viral_Advertising {

    /*
     * Complete the 'viralAdvertising' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int viralAdvertising(int n) {
    // Write your code here
    int shared=5;
    int liked=5/2;
    int cumm=liked;
    for(int i=0;i<n-1;i++)
    {
        shared=liked*3;
        liked=shared/2;
        cumm=cumm+liked;
        
    }
    return cumm;
    }

}
