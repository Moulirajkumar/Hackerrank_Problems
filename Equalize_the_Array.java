class Equalize_the_Array {

    /*
     * Complete the 'equalizeArray' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int equalizeArray(List<Integer> arr) {
    // Write your code here
    List count=new ArrayList();
    int n=arr.size();
    for(int i=0;i<arr.size()-1;i++)
    {
        int num=1;
        for(int j=i+1;j<arr.size();j++)
        {
            if(arr.get(i)==arr.get(j))
            {
                arr.remove(j);
                j--;
                num++;   
            }
        }
        count.add(i,num);
    }
    int max=(int)count.get(0);
    for(int i=0;i<count.size();i++)
    {
        if((int)count.get(i)>max)
        {
         max=(int)count.get(i);   
        }
    }
    
        return n-max;
    }
}
