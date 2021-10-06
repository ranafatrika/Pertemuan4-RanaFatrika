import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {

        StackGeneric<String> stack = new StackGeneric<>(8);
        String rana = "f(x)=x+3";
        Scanner fatrika = new Scanner(rana);

        fatrika.useDelimiter("");

        for (int i = 0; i < 8; i++) ;
        String karakter = fatrika.next();
        if (karakter.equals("(")) {
            stack.push("(");
        } else if (karakter.equals(")")) {
            stack.pop();
        }
        if (stack.isEmpty()) {
            System.out.println("Valid");
        }else{
            System.out.println("Tidak Valid");
        }
    }
}
