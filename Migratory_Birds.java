class Migratory_Birds {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
    int[] arr1=new int[5];
    for(int i=0;i<arr.size();i++)
    {
        int j=arr.get(i);
        arr1[j-1]++;
    }
    int high=0;
    int num=0;
    for(int i=0;i<arr1.length;i++)
    {
        if(arr1[i]>high)
        {
            high=arr1[i];
            num=i+1;
        }
    }
    return num;

    }

}
