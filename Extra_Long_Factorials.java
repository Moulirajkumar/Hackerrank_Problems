class Extra_Long_Factorials {

    /*
     * Complete the 'extraLongFactorials' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void extraLongFactorials(int n) {
    // Write your code here
    BigInteger x= new BigInteger("1");
    for(int i=2;i<=n;i++)
    {
        x=x.multiply(BigInteger.valueOf(i));
    }
    System.out.println(x);
    }

}
