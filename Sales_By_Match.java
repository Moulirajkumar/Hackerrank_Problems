class Sales_By_Match {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) 
    {
    // Write your code here
    //List al=new ArrayList();
    int count=0;
    for(int i=0;i<ar.size();i++)
    {
       if(ar.get(i) !=0)
       {
           for(int j=i+1;j<n;j++)
           {
               if(ar.get(i)==ar.get(j))
               {
                   count++;
                   ar.set(j,0);
                   break;
               }
           }
       }
    }
    return count;
    }

}
