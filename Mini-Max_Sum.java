class Mini-Max_Sum {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    int min=arr.get(0);
    int max=arr.get(0);
    long totalsum=0;
    for(int i=0;i<arr.size();i++)
    {
        totalsum+=arr.get(i);
        if(min>arr.get(i))
        min=arr.get(i);
        else if(max<arr.get(i))
        max=arr.get(i);
    }
    System.out.println((totalsum-max)+" "+(totalsum-min));
    }

}
