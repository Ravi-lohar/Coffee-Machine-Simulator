import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        CoffeeMachine simulator = new CoffeeMachine();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("              Coffee Machine              ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");

        while(true){
            System.out.println();
            System.out.println("Select what you want to do");
            System.out.println("-------------------------------- ");
            System.out.println("1. Buy Coffee");
            System.out.println("2. Fill Ingredients");
            System.out.println("3. Clean Machine");
            System.out.println("4. Check Ingredient Status");
            System.out.println("5. Coffee Sales Analytics   ");
            System.out.println("6. Exit");
            System.out.println("--------------------------------");
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();
            if(choice == 1){
                simulator.buyCoffee(sc);
                System.out.println("Making Coffee");
            }
            else if (choice == 2) {
                simulator.fillIngredients(sc);
            }
            else if (choice == 3) {
                System.out.println("Machine Cleaned");
            }
            else if (choice == 4){
                simulator.showIngredients();
            }
            else if (choice == 5) {
                simulator.showAnalytics();
            }
            else if (choice == 6) {
                System.out.println("Exiting from the coffee Machine");
                return;
            }
            else {
                System.out.println("Invalid action! Please try again.");
            }
        }
    }
}

