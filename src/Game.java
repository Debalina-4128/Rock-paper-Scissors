import java.util.*;

public class Game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = "yes";
        while(str.equals("yes")) {
            String[] option = {"rock", "paper", "scissors"};
            Random random = new Random();
            int index = random.nextInt(option.length);
            String randomString = option[index];
            System.out.println("Make a choice: ");
            String choice = sc.nextLine().toLowerCase();
            switch(choice) {
                case "rock": {
                    if (randomString.equals("rock")) {
                        System.out.println("It's a tie");
                    } else if (randomString.equals("paper")) {
                        System.out.println("You lose");
                    } else {
                        System.out.println("You win");
                    }
                    break;
                }
                case "paper": {
                    if (randomString.equals("paper")) {
                        System.out.println("It's a tie");
                    } else if (randomString.equals("scissors")) {
                        System.out.println("You lose");
                    } else {
                        System.out.println("You win");
                    }
                    break;
                }
                case "scissors":{
                    if (randomString.equals("scissors")) {
                        System.out.println("It's a tie");
                    } else if (randomString.equals("rock")) {
                        System.out.println("You lose");
                    } else {
                        System.out.println("You win");
                    }
                    break;
                }
                default:
                    System.out.println("Invalid choice. Please choose rock, paper, or scissors.");
            }
            System.out.println("Do you want to play again?");
            str = sc.nextLine().toLowerCase();
        }
    }
}
