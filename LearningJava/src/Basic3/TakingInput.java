package Basic3;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by money on 22/6/16.
 */
public class TakingInput
{
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter Float value");
//        float num = Float.parseFloat(input.readLine());
//        System.out.println(num);
        System.out.println("Enter name ,age ");
        String line= input.readLine();

        StringTokenizer st= new StringTokenizer(line , ",");
        String s1= st.nextToken();
        String s2 = st.nextToken();

        s1=s1.trim();
        s2=s2.trim();

        int age = Integer.parseInt(s2);

        System.out.println(s1 );
        System.out.println(age);



    }
}
