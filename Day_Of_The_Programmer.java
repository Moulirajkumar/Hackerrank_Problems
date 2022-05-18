
class Day_Of_The_Programmer {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
    // Write your code here
    String str="";
    if(year<1918)
    {
        if(year%4==0)
        {
            str="12.09."+year;
        }
        else
        {
            str="13.09."+year;
        }
    }
    else if(year==1918)
    {
        str="26.09."+year;
    }
    else
    {
        if(year%400==0 || (year%4==0 && !(year%100==0)))
        {
            str="12.09."+year;
        }
        else
        {
            str="13.09."+year;
        }
    }
    return str;
    }

}