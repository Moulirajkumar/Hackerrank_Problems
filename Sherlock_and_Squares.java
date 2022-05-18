class Sherlock_and_Squares {

    /*
     * Complete the 'squares' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER a
     *  2. INTEGER b
     */

    public static int squares(int a, int b) {
    // Write your code here
    int count=0;
    for(int i=(int)Math.sqrt(a);i<=(int)Math.sqrt(b);i++)
    {
      if((i*i)>=a && (i*i)<=b)
      {
         count++; 
      }  
    }
    return count;
    }

}
