package app;
//Tinkal Patel 201833879
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Manager manager = new Manager();
        GamePlay game = new GamePlay();
        User user = new User();
        GameData gdat = new GameData();
        boolean trial = true;
        short choiceOne = 0;
        short choiceTwo = 0;

        // Main Program..
        gdat.createData();
        while (trial) {

            System.out.println("\n\n-- WELCOME TO TRIVIA APP--");
            System.out.println("######################");
            Scanner input = new Scanner(System.in);
            trial = false;

            System.out.println("1.Login (If already registered)");
            System.out.println("2.Register to the game.");
            System.out.println("3.Exit.");
            System.out.print("Enter your choice: ");
            try {
                choiceOne = input.nextShort();
                if (choiceOne < 1 || choiceOne > 3) {
                    System.out.println("Wrong value only 1-3 options available.");
                    trial = true;
                }
                if (choiceOne == 1) {
                    do {
                        input = new Scanner(System.in);
                        trial = false;
                        System.out.println("\n 1.Login as the Manager.(you need special code)");
                        System.out.println("2. Login as a Player.(you must be registered)");
                        try {
                            choiceTwo = input.nextShort();
                            if (choiceTwo == 1) {
                                short i = 0;
                                do {
                                    input = new Scanner(System.in);
                                    System.out.print("Enter the special 4 digit password:");
                                    String spclPassword = input.nextLine();
                                    String spclCode = manager.getSpecialCode();
                                    if (spclCode.equals(spclPassword)) {
                                        trial = false;
                                        break;
                                    } else {
                                        i++;
                                        System.out.println("Wrong Code." + (3 - i) + " attempts left.");
                                        trial = true;
                                        if (i == 3) {
                                            System.out.println("\n Multiple wrong attempts.");
                                            break;
                                        }
                                    }
                                } while (trial);
                            } else if (choiceTwo == 2) {

                                if (user.Login()) {
                                    break;
                                } else {
                                    user.Register();
                                    trial = true;
                                }
                            } else {
                                System.out.println("Invalid Choice.");
                                trial = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid Choice");
                            trial = true;
                        }
                    } while (trial);
                    if (choiceTwo == 1) {
                        System.out.println("\n Select an option from the following: ");
                        System.out.println("1.Edit a Question.");
                        System.out.println("2.Add a new Category.");
                        System.out.println("3.Change the Pass Code.");
                        System.out.print("Enter choice: ");
                        Short choice = input.nextShort();
                        switch (choice) {
                        case 1: {
                            manager.editQuestion();
                            break;
                        }
                        case 2: {
                            manager.addNewCategory();
                            break;
                        }
                        case 3: {
                            input = new Scanner(System.in);
                            System.out.print("\n Enter the new code: ");
                            String newCode = input.nextLine();
                            manager.setSpecialCode(newCode);
                        }
                        }
                        trial = true;
                    }
                    if (choiceTwo == 2) {
                        trial = true;
                        do {
                            gdat.updateData();
                            
                            user.PlayQuestion(user);
                            user.IncrementTimesPlayed();
                            System.out.print("Press Enter to play again or any other key to go to main menu:");
                            input = new Scanner(System.in);
                            if (input.nextLine().equals("")) {
                                trial = true;
                            } else {
                                trial = false;
                            }
                        } while (trial);
                        trial = true;
                    }
                } else if (choiceOne == 2) {
                    user.Register();
                    trial = true;
                } else if (choiceOne == 3) {

                    System.out.println("Exiting Now......");
                    System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("Something Went Wrong !!");
                trial = true;
            }
        }

    }
}