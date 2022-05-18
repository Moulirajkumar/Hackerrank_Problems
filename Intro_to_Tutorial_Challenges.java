class Intro_to_Tutorial_Challenges {

    /*
     * Complete the 'introTutorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER V
     *  2. INTEGER_ARRAY arr
     */

    public static int introTutorial(int V, List<Integer> arr) {
    // Write your code here
    int value=0;
    for(int i=0;i<arr.size();i++)
    {
        if(V==(int)arr.get(i))
        value=i;
    }
    return value;
    }

}
