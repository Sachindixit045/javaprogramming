public class insertionsort{
    public static void main(String[] args){
        int[] arr = {20,9,34,22,54,21};
        int n = arr.length;
        for(int i = 1; i<n; i++){
            int j = i; 
            while(j > 0 && arr[j] < arr[j-1]){
                int tem = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = tem;
                j--;
            }
            

        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}