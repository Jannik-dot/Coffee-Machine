package machine;
import java.util.Scanner;

public class CoffeeMachine {
    static int waterIn = 400; // variables are available for all methods
    static int milkIn = 540;
    static int beansIn = 120;
    static int cupsIn = 9;
    static int moneyIn = 550;
    public static void main(String[] args) {
        action();
    }

   public static void action() {
       Scanner scanner = new Scanner(System.in);
       String action;
       do {
           System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
           action = scanner.next();
           switch (action) {
               case "buy":
                   buy();
                   break;
               case "fill":
                    fillMachine();
                   break;
               case "take":
                    take();
                   break;
               case "remaining":
                   System.out.println("The coffee machine has:");
                   System.out.println(waterIn + " of water");
                   System.out.println(milkIn + " of milk");
                   System.out.println(beansIn + " of coffee beans");
                   System.out.println(cupsIn + " of disposable cups");
                   System.out.println(moneyIn + " of money");
               default:
                   break;
           }
       } while (!"exit".equals(action));
   }




    static void buy () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2- latte, 3 - cappuccino , back - to main menu:");
        String order = scanner.next();

        switch (order) {
            case "1":
                if (waterIn < 250) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (beansIn < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (cupsIn < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                }
                waterIn -= 250;
                beansIn -= 16;
                moneyIn += 4;
                cupsIn -= 1;
                break;
            case "2":
                if (waterIn < 350) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (beansIn < 20) {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                } else if (cupsIn < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                    break;
                } else if (milkIn < 75) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                }
                waterIn -= 350;
                milkIn -= 75;
                beansIn -= 20;
                moneyIn += 7;
                cupsIn -= 1;
                break;
            case "3":
                if (waterIn < 200) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (beansIn < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                } else if (cupsIn < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                    break;
                } else if (milkIn < 100) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                }
                waterIn -= 200;
                milkIn -= 100;
                beansIn -= 12;
                moneyIn += 6;
                cupsIn -= 1;
                break;
            default:
                break;
        }


    }

    static void fillMachine () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        waterIn += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milkIn += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        beansIn += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        cupsIn += scanner.nextInt();

    }

    static void take () {
        System.out.println("I gave you $" + moneyIn);
        moneyIn = 0;

    }
}
