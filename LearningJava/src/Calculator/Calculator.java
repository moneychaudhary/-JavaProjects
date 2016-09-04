package Calculator;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by money on 22/6/16.
 */
public class Calculator {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Operator1,Operator2,Operand");
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input,",");


        String s1= st.nextToken();
        String s2=st.nextToken();
        String s3=st.nextToken();

        s1=s1.trim();
        s2=s2.trim();
        s3=s3.trim();

        int var1 = Integer.parseInt(s1);
        int var2 = Integer.parseInt(s2);

        if(s3.equals("+"))
        {
            System.out.println("Sum of "+ var1 + " and "+var2+ "i s "+(var1+var2));
        }
        else if(s3.equals("-"))
        {
            System.out.println("Difference of "+ var1 + " and "+var2+ "i s "+(var1-var2));
        }
        else if(s3.equals("*"))
        {
            System.out.println("Multiplication of "+ var1 + " and "+var2+ "i s "+(var1*var2));
        }
        else if(s3.equals("/"))
        {
            float result = (float)var1/var2;
            System.out.println("Division of "+ var1 + " by "+var2+ " is "+  result);
        }
        else
            System.out.println("Error in input");





    }
}
