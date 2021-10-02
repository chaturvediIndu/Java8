package lambda;

class Solution {
    public String toFormat(String input) {
        char inChar[] = input.toCharArray();
        String output = "";
        int i;
        for(i=0;i<input.length();i++) {
            int count = 1;

            while(i+1<input.length() && inChar[i] == inChar[i+1] ) {
                System.out.println(i+1<input.length());
                System.out.println(inChar[i]);
                System.out.println(inChar[i+1]);

                count+=1;
                i+=1;
                System.out.println( "i value "+ i);
            }
            output+=inChar[i]+String.valueOf(count);
        }
        return output;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        //String input = "aaabbbbccaaa";
        String input = "aaaa";
        System.out.println("Formatted String is: " + sol.toFormat(input));
    }
}