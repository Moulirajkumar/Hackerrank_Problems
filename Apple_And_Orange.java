class Apple_And_Orange {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
    int count1=0;
    int count2=0;
    for(int i=0;i<apples.size();i++)
    {
        int x=apples.get(i);
        x=x+a;
        if(x>=s && x<=t)
        {
            count1++;
        }
    }
    for(int i=0;i<oranges.size();i++)
    {
        int x=oranges.get(i);
        x=x+b;
        if(x>=s && x<=t)
        {
            count2++;
        }
    }
    System.out.println(count1);
    System.out.println(count2);
    }

}