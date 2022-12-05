import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter greeting: ");
        String greeting = sc.nextLine();
        String result = "Hello " + greeting;
        System.out.println(result);

//        String myName = "Tèo";
//        System.out.printf("my name's %s", myName);
        sc.close();
    }
}