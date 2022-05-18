class Time_Conversion {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    String str="";
    if(s.substring(0,2).equals("12") && s.contains("AM"))
    {
        str="00";
        s=str+s.substring(2,s.length());
    }
    if (!s.substring(0,2).equals("12") && s.contains("PM"))
    {
        str=Integer.toString(Integer.parseInt(s.substring(0,2))+12);
        s=str+s.substring(2,s.length());
    }
    return s.substring(0,s.length()-2);
    }

}