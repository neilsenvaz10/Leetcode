class Solution {
    public void nextPermutation(int[] arr) {
        //pivot
        int pivot=-1;
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                pivot=i;
                break;
            }
        }
        if(pivot==-1)
        {
            int low=0;
            int high=arr.length-1;
            while(low<=high)
            {
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
            return;
        }

        //Find the rightmost element greater than the pivot
        int swapIdx = arr.length - 1;
        while (arr[swapIdx] <= arr[pivot])
        {
            swapIdx--;
        }
        
        //swap with correct element
        int temporary=arr[pivot]; 
        arr[pivot]=arr[swapIdx]; 
        arr[swapIdx]=temporary; 

        //swap elements after pivot in increasing order
        int low=pivot+1;
        int high=arr.length-1;
        while(low<=high)
        {
            int temp=arr[low];                
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        return;
    }
}