class Designer_PDF_Viewer {

    /*
     * Complete the 'designerPdfViewer' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h
     *  2. STRING word
     */

    public static int designerPdfViewer(List<Integer> h, String word) {
    // Write your code here
    int max=-1;
    int len=word.length();
    for(int i=0;i<len;i++)
    {
        int num=word.charAt(i)-97;
        if(h.get(num)>max)
        {
            max=h.get(num);
        }
    }
    return max*len;
    }

}
