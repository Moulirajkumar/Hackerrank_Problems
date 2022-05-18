class Birthday_Cake_Candles {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
    int max=candles.get(0);
    for(int i=0;i<candles.size();i++)
    {
        if(max<candles.get(i))
        {
            max=candles.get(i);
        }
    }
    int count=0;
    for(int i=0;i<candles.size();i++)
    {
        if(max==candles.get(i))
        {
            count++;
        }
    }
    return count;
    }

}