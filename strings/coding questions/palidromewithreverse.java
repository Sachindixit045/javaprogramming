public class palidromewithreverse{
    public static void main(String[] args){
        StringBuilder st = new StringBuilder("madam");
        StringBuilder rev = new StringBuilder(st);
        rev.reverse();
        if(st.toString().equals(rev.toString())){
              System.out.println("its palidrome");
        }else{
            System.out.println("not palidrome");
        }
    }
}