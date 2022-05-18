class Utopian_Tree {

    /*
     * Complete the 'utopianTree' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int utopianTree(int n) {
    // Write your code here
    int height=1;
    if(n==0)
    {
        return 1;
    }
    else
    {
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                height=height+1;
            }
            else
            {
                height=height*2;
            }
        }
    }
    return height;
    }

}
