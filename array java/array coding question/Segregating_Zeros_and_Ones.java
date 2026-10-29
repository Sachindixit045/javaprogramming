class Solution {
    void segregate0and1(int[] arr) {
        // code here
        // write segregating 0s and 1s at gfg
        int zeroes = 0;
        int ones = 0;
        int n = arr.length;
        for(int ele : arr){
            if(ele == 0){
                zeroes++;
            }else{
                ones++;
            }
        }
        int i = 0;
        int j = n-1;
        while(i<j){
            if(arr[i] ==0){
                i++;
            }else if(arr[j] ==1){
                j--;
            }else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            
            
        }
    }
}
