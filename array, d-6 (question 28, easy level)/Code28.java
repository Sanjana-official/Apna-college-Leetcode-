public class Code28{
    public static boolean isPalindrome(String s) {
        String newS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println("newS.length()= "+ newS.length() + ", (newS.length()/2) = "+(newS.length()/2));
        for(int i=0;i<(newS.length()/2);i++)
        {
            if(newS.charAt(i)!=newS.charAt(newS.length()-1-i))
            {
                System.out.println("newS.charAt(i)= "+newS.charAt(i)+", newS.charAt(newS.length()-1-i)" + newS.charAt(newS.length()-1-i));
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        // System.out.println(isPalindrome(s));
        
        String originalString = "Hello, World!";

        // 1. Create a StringBuilder
        StringBuilder stringBuilder = new StringBuilder(originalString);

        // 2. Reverse the content
        stringBuilder.reverse();

        // 3. Convert back to a String
        String reversedString = stringBuilder.toString();

        System.out.println("Original string: " + originalString);
        System.out.println("Reversed string: " + reversedString);

    }
}