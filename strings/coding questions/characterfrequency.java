public class characterfrequency {
    public static void main(String[] args) {
        String str = "programming";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            // Check if character has already appeared
            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }

            // Count frequency
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            System.out.println(ch + " = " + count);
        }
    }
}