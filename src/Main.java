import java.util.Scanner;

public class Main {
 public static void main(String[]args) {
     Scanner input = new Scanner(System.in);
     boolean Isopen = true;
     while (Isopen) {
         System.out.print("New Game or Exit?");
         System.out.println("1 for New Game, 2 for Exit.");
         int number = input.nextInt();
         if (number == 1) {
             Isopen=false;
             System.out.println("New Game selected.");
         } else if (number == 2) {
             Isopen=false;
             System.out.println("Exit.");
         } else {
             System.out.println("Invalid Input!");
         }
     }
 }}
