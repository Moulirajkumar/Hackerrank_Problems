class Staircase {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
    int space=n-1;
    int count=1;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<space;j++)
        {
            System.out.print(" ");
        }
        for(int j=0;j<count;j++)
        {
            System.out.print("#");
        }
        System.out.println();
        space--;
        count++;
    }

    }

}