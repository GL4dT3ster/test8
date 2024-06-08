import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers, I'll find the greatest: ");
        System.out.print("1) ");
        float num1 = scanner.nextFloat();
        System.out.print("2) ");
        float num2 = scanner.nextFloat();
        System.out.print("3) ");
        float num3 = scanner.nextFloat();

        if (num1 > num2 && num2 >= num3){
            System.out.print("The greatest number is " + num1);
        } else if (num1 > num2 && num3 >= num2 && num1 > num3){
            System.out.print("The greatest number is " + num1);
        } else if (num2 > num1 && num1 >= num3){
            System.out.print("The greatest number is " + num2);
        } else if (num2 > num1 && num3 >= num1 && num2 > num3){
            System.out.print("The greatest number is " + num2);
        } else if (num3 > num2 && num2 >= num1){
            System.out.print("The greatest number is " + num3);
        } else if (num3 > num2 && num1 >= num2 && num3 > num1) {
            System.out.print("The greatest number is " + num3);
        } else if (num1 == num2 && num2 > num3){
            System.out.print("The first and the second numbers are the same. The greatest number is " + num1);
        } else if (num3 == num2 && num2 > num1){
            System.out.print("The second and the third numbers are the same. The greatest number is " + num2);
        } else if (num1 == num3 && num3 > num2){
            System.out.print("The first and the third numbers are the same. The greatest number is " + num1);
        } else {
            System.out.print("Numbers are the same. There is no the greatest number");
        }
    }
}
