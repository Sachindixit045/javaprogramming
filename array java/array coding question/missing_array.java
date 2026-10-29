class Solution {
    int missingNum(int arr[]) {
        // code here
        // write missing array gfg at googlr then you can check
        long n = arr.length +1;
        long sum = n*(n+1)/2;
        long arraysum = 0;
        for(int ele : arr){
            arraysum += ele;
        }
       return (int)(sum - arraysum);
    }

}
