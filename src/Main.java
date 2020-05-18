import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Bar hi = new Bar();
        Drinks strawberry = new Drinks();
        strawberry.milkshake("strawberry", 7);
        Drinks banana = new Drinks();
        banana.milkshake("banana", 8);
        Drinks chocolate = new Drinks();
        chocolate.milkshake("chocolate", 6);
        int option;
        int bill = 0;
    do {
        System.out.println(hi.greet);

        System.out.println("1. Strawberry milkshake for 7 pound;");
        System.out.println("2. Banana milkshake for 8 pound;");
        System.out.println("3. Chocolate milkshake for 6 pound;");
        System.out.println("0. I've had enough, I'm going home.");

        Scanner choice = new Scanner(System.in);
        option = choice.nextInt();

              switch (option) {
                  case 1:{
                      System.out.println("Here comes a strawberry milkshake!");
                      bill += strawberry.price;
                      break;}
                  case 2:{
                      System.out.println("Here comes a banana milkshake!");
                      bill += banana.price;
                      break;}
                  case 3:{
                      System.out.println("Here comes a chocolate milkshake!");
                      bill += chocolate.price;
                      break;}
                  case 0:{
                      System.out.print("OK. Here is your bill: ");
                      break;}
                  default:
                      System.out.println("You have to choose one of the available options.");
              }

            System.out.println(bill);
        } while ( option != 0);
    }
}
