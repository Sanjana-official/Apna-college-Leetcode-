import java.util.Arrays;

public class Code29{
     public static boolean isAnagram(String s, String t) {
        if(s.length()==t.length())
        {
            char sArray[] = s.toCharArray();
            char tArray[] = t.toCharArray();

            Arrays.sort(sArray);
            Arrays.sort(tArray);

            boolean  result=Arrays.equals(sArray,tArray);

            if(result){
                return  true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}