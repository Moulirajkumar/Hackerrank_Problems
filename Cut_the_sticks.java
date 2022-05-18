class Cut_the_sticks {

    /*
     * Complete the 'cutTheSticks' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> cutTheSticks(List<Integer> arr) {
    // Write your code here
    List al=new ArrayList();
    al.add(arr.size());
    while(arr.size()>=1)
    {
        int min=arr.get(0);
        for(int j=arr.size()-1;j>=0;j--)
        {
            if((int)arr.get(j)<min)
            {
                min=(int)arr.get(j);
            }
        }
        for(int j=arr.size()-1;j>=0;j--)
        {
             arr.set(j,arr.get(j)-min);
            if((int)arr.get(j)==0)
            {
                arr.remove(j);
            }
        }
        if(arr.size()<1){
            break;
        }
        al.add(arr.size());
    }
    return al;
    }

}