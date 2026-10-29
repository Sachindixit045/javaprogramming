public class solve_two_sum_problem {
    public static void main(String[] args){
        // Input: nums = [2,7,11,15], target = 9
        // Output: [0,1]
        int[] index = new int[2];
        int[] arr = {2,7,11,15};
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == 9){
                    index[i] = i;
                    index[j] = j;
                    
                    break;
                }
            }
        }
        System.out.print(index[0] +" " + index[1]);
    }

}
