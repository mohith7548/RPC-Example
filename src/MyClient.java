import java.rmi.*;
import java.util.Scanner;

public class MyClient {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two Numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        try {
            MathFun stub = (MathFun) Naming.lookup("rmi://localhost:5000/kune");
            System.out.print(
                    "1. Addition\n" +
                    "2. Subtraction\n" +
                    "3. Multiplication\n" +
                    "4. Division\n" +
                    "5. Modulo\n" +
                    "Choose an option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(stub.add(x, y));
                    break;
                case 2:
                    System.out.println(stub.sub(x, y));
                    break;
                case 3:
                    System.out.println(stub.mul(x, y));
                    break;
                case 4:
                    System.out.println(stub.div(x, y));
                    break;
                case 5:
                    System.out.println(stub.mod(x, y));
                    break;
                default:
                    System.out.println("Wrong Option! Run again");
                    System.exit(0);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}