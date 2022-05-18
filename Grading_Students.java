class Grading_Students {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    List al=new ArrayList();
    for(int i=0;i<grades.size();i++)
    {
        int x=grades.get(i);
        int rem=x%5;
        if(x>=38 && (x+5-rem)-x<3)
        {
            al.add((x+5)-rem);
        }
        else
        {
            al.add(x);
        }
    }
    return al;
    }

}