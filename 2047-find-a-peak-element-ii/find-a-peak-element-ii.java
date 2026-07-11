class Solution {
    public int getMax(int[][] mat,int mid)
    {
        int index=-1;
        int max=Integer.MIN_VALUE;
        int n=mat.length;
        for(int i=0;i<n;i++)
        {
            if(mat[i][mid]>max)
            {
                index=i;
                max=mat[i][mid];
            }
        }
        return index;
    }

    public int[] findPeakGrid(int[][] mat)
    {
        int n=mat.length;
        int m=mat[0].length;

        int low=0;
        int high=m-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int max=getMax(mat,mid);
            int left=(mid-1>=0)?mat[max][mid-1]:-1;
            int right=(mid+1<m)?mat[max][mid+1]:-1;

            if(mat[max][mid]>left && mat[max][mid]>right)
            {
                return new int[]{max,mid};
            }
            else if(mat[max][mid]<left)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}