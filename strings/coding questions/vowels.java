public class vowels{
    public static void main(String[] args){
        String name = "sachin";
        int count = 0;
        for(int i = 0; i< name.length(); i++){
            char ch = name.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
                System.out.println(ch);
            }
            
             
        }
        System.out.println(count);
    }
}