public class Count_Even_Numbers_in_an_Array {
    public static void main(String[] args){
        int[] arr = {29,32,45,32,12,56,5,6};
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.print(count);
    }
    
}
