public class reverse_array {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60};
        int n =arr.length;
        int i = 0; 
        int j = n-1;

        while(i<j){
            int tem = arr[i];
            arr[i] = arr[j];
            arr[j] = tem;
            i++;
            j--;

        }

        // printing array
        for(int ele : arr){
            System.out.print(ele + " ");
        }

    }
}
