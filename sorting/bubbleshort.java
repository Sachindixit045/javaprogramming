public class bubbleshort{
    public static void main(String[] args){
        int[] arr = {19,13,20,14,30};
        for(int i =0 ; i< arr.length - 1; i++){
            for(int j =0; j< arr.length - 1 - i; j++){
                int temp = arr[j];
                if(arr[j]> arr[j+1]){
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i =0; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}