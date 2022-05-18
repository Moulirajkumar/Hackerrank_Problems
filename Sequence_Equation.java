class Sequence_Equation {

    /*
     * Complete the 'permutationEquation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY p as parameter.
     */

    public static List<Integer> permutationEquation(List<Integer> p) {
    // Write your code here
    List al=new ArrayList();
    for(int temp=1;temp<=p.size();temp++)
    {
        for(int i=0;i<p.size();i++)
        {
            if(temp==p.get(i))
            {
                for(int j=0;j<p.size();j++)
                {
                    if(i+1==p.get(j))
                    {
                        al.add(j+1);
                    }
                }
            }
        }
    }
    return al;
    }

}
