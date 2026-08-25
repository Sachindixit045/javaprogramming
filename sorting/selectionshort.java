public class selectionshort {
  public static void main(String[] args){
    int[] arr = {8,7,9,10,15,10};
    for(int i = 0; i<arr.length -1; i++){
        int small = i;
        for(int j= i + 1; j<arr.length; j++){
            if(arr[small]>arr[j]){
                small = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[small];
        arr[small] = temp;

    }
    for(int i = 0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }

  }  
}
