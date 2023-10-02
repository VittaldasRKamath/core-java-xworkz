public class ReverseWordsInMiddle {
    public static void main(String[] args) {
        String input = "good";
        
        // Create a StringBuilder and append the input string to it
        StringBuilder reversed = new StringBuilder(input);
        
        // Use the reverse() method to reverse the StringBuilder
        reversed.reverse();
        
        // Convert the StringBuilder back to a String
        String result = reversed.toString();
        
        // Print the reversed string
        System.out.println("Hello " + result + " morning");  // This will print "doog"
    }
}