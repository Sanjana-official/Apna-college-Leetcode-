import java.util.Arrays;

public class Code3 {
    public static void main(String[] args) {
        int num1[]={1,2,4,0,0,0};
        int num2[]={3,2,1};
        int index=0;
        int m=num1.length,n=num2.length;
        for(int i=m-n ; i<m;i++)
        {
            num1[i]=num2[index];
            index++;
        }
        Arrays.sort(num1);
        System.out.println(Arrays.toString(num1));
    }
}
