public class Code31 {
    public static String removeOccurrences(String s,String part) {
        StringBuilder sb = new StringBuilder(s);
        while(sb.length()>0 && sb.indexOf(part)<s.length())
        {
            sb.delete(sb.indexOf(part), part.length());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        
    }
}
