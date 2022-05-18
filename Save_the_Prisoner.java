class Save_the_Prisoner {

    /*
     * Complete the 'saveThePrisoner' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     *  3. INTEGER s
     */

    public static int saveThePrisoner(int n, int m, int s) {
    // Write your code here
    int a=(m+s-1)%n;
    if(a==0)
    return n;
    else
    return a;

    }

}