package conditional;
import java.util.Scanner;
public class square_or_not {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        System.out.println("Enter the bridth: ");
        int bridth = sc.nextInt();
        if(length == bridth){
            System.out.println("This is the square");

        }
        else{
            System.out.println("This is not square");
        }
    }
}
