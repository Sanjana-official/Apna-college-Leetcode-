import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Code2 {
    public static void main(String args[])
    {
        int arr[][]={{1,2,3},{2,4,5}};
        // Print the 2D array
        // System.out.println(Arrays.deepToString(arr));

        int[] doesExist = IntStream.rangeClosed(1, (arr.length*arr[0].length)).toArray();
        // System.out.println(Arrays.toString(doesExist));

        int[] array1D = Stream.of(arr) //we start with a stream of objects Stream<int[]>
                    .flatMapToInt(IntStream::of) //we I'll map each int[] to IntStream
                    .toArray(); //we're now IntStream, just collect the ints to array.
        // System.out.println(Arrays.toString(array1D));

        Arrays.sort(array1D);
        // System.out.println(Arrays.toString(array1D));

        int ans[]= new int[2];

        //for missing element
        boolean found;
        for(int i = 0;i<array1D.length;i++)
        {
            int toFind = doesExist[i];
            found = IntStream.of(array1D).anyMatch(n -> n == toFind );
            if(found !=true)
            {
                ans[1]=doesExist[i];
            }
        }


        //for repeated element
        for(int i=0;i<array1D.length-1;i++)
        {
            if(array1D[i]==array1D[i+1])
            {
                ans[0]=array1D[i];
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}

