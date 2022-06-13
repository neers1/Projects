
 import java.util.Scanner;
public class IntroApplication {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter number");
        num = input.nextInt();
        System.out.println("Number is " + num);
        int i = 0;
        while (i < num) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }
                i++;

            }
        }
    }











