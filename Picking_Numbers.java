
class Picking_Numbers {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
    // Write your code here
    int count=0;
    Collections.sort(a);
    int b=0;
    int [] arr=new int[a.size()];
    for(int i=0;i<a.size();i++)
    {
       for(int j=i+1;j<a.size();j++)
       {
           int store=Math.abs(a.get(i)-a.get(j));
           if(store<=1)
           {
               count++;
           }
       }
        arr[b++]=count;
        count=0;
    }
    int max=-1;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>max)
        {
            max=arr[i];
        }
    }
    return max+1;
    }

}
