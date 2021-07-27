
package problem2;

import java.util.Scanner;

interface Input {
    public void add(char c);
    public String getValue();
} 
class TextInput implements Input {
    String resultString = "";
    @Override
    public void add(char c) {
        resultString = resultString + c ; 
    }
    @Override
    public String getValue() {
        return resultString ;
    }
}
class  NumericInput implements Input {
    String resultString = "";
    @Override
    public void add(char c) {
        if ( c >= '0' && c <= '9' ){
            resultString = resultString + c ;
        }
    }
    @Override
    public String getValue() {
        return resultString ;
    }
}
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Input input = new TextInput();
        char c = sc.next().charAt(0);
        input.add(c);
        c = sc.next().charAt(0);
        input.add(c);
        c = sc.next().charAt(0);
        input.add(c);
        System.out.println(input.getValue());
        
        input = new NumericInput();
        c = sc.next().charAt(0);
        input.add(c);
        c = sc.next().charAt(0);
        input.add(c);
        c = sc.next().charAt(0);
        input.add(c);
        System.out.println(input.getValue());
    } 
}
