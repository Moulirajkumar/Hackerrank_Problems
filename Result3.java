//Diagonal Difference
class Result3 {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int sum1=0;
    int sum2=0;
    for(int i=0;i<arr.size();i++)
    {
        sum1=sum1+arr.get(i).get(i);
        sum2=sum2+arr.get(i).get(arr.size()-i-1);
    }
    return Math.abs(sum1-sum2);
}
}