class Solution {
    public void rotateArr(int arr[], int d) {
        // code here
        // write Rotate Array gfg on google then you will check this problem
        int n = arr.length;
         d = d % n;
        reverse(arr , 0, d-1);
        reverse(arr , d, n-1);
        reverse(arr , 0, n-1);
    }    
        public static void reverse(int[] arr , int a, int b){
            int i = a;
            int j = b;
            while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
            }
        }
    
}