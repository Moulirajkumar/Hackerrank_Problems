class Breaking_The_Records {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
    int min=scores.get(0);
    int max=scores.get(0);
    int min_count=0;
    int max_count=0;
    for(int i=0;i<scores.size();i++)
    {
        if(min>scores.get(i))
        {
         min=scores.get(i);
         min_count++;   
        }
        if(max<scores.get(i))
        {
         max=scores.get(i);
         max_count++;
        }
    }
    List al=new ArrayList();
    al.add(max_count);
    al.add(min_count);
    return al;
    }

}