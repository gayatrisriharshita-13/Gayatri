import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("=== ACRONYM GAME START ===");

        do {
            try {
                AcronymBase game = new AcronymGameMode();  // polymorphism
                game.displayWelcome();
                ((AcronymGameMode)game).play();
            }
            catch(Exception e) {
                System.out.println("Error: " + e);
            }

            System.out.println("\n1. Play Again");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

        } while(choice == 1);

        System.out.println("\n=== GAME ENDED ===");
    }
}

