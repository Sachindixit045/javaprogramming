public class First_Non_Repeating_Character{
    public static void main(String[] args){
        String str = "aabbcdde";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int count = 0;
            
            for(int j =0; j<str.length(); j++){
                if(str.charAt(j) == ch){
                    count++;
                }
                
            }
            if(count == 1){
                System.out.println("your first non repeating charcater is: " + ch);
                break;
            }
        }
    }
}