class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) 
    {
        int length=0,width=0,maxarea=Integer.MIN_VALUE;
        double maxdiag = 0.0;
        for(int i=0; i<dimensions.length; i++)
        {
            length = dimensions[i][0];
            width = dimensions[i][1];
            double diag = Math.sqrt(dimensions[i][0]*dimensions[i][0]+dimensions[i][1]*dimensions[i][1]);
            if(diag > maxdiag || (diag==maxdiag && length*width>maxarea))
            {
                maxdiag = diag;
                maxarea = length*width;
            }
        }
        return maxarea;
    }
}
