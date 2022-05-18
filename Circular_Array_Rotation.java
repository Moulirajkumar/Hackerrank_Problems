class Circular_Array_Rotation {

    /*
     * Complete the 'circularArrayRotation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER k
     *  3. INTEGER_ARRAY queries
     */

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
    // Write your code here
    int temp=0;
    int last=a.size()-1;
    for(int i=1;i<=k;i++)
    {
        temp=a.get(last);
        a.remove(last);
        a.add(0,temp);
    }
    List al=new ArrayList();
    for(int i=0;i<queries.size();i++)
    {
        al.add(a.get(queries.get(i)));
    }
    return al;
    }

}
