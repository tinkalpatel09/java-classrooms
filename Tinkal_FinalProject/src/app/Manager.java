package app;
//Tinkal Patel 201833879
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

/**
 * user
 */
public class Manager extends Person {

    private String specialCode = "1234";
    GamePlay game = new GamePlay();
    GameData gdat = new GameData();

    public void Register() {
        boolean trial = false;
        Scanner input = new Scanner(System.in);
        String username;
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        do {
            trial = false;
            System.out.print("Enter your username: ");
            username = input.nextLine();
            if (this.getUsernames().contains(username)) {
                System.out.println("This username already exists.Try a different one.");
                trial = true;
            }
        } while (trial);
        System.out.print("Enter your password: ");
        String password = input.nextLine();
        System.out.print("Enter your Email: ");
        String email = input.nextLine();
        this.getNames().add(name);
        this.getUsernames().add(username);
        this.getPasswords().add(password);
        this.getEmail().add(email);
        System.out.println("SUCCESS! You are registered.");
    }

    public String getSpecialCode() {
        return specialCode;
    }

    public void setSpecialCode(String specialCode) {
        this.specialCode = specialCode;
    }

    public void addNewCategory() throws IOException {
        Scanner input;
        input = new Scanner(System.in);
        System.out.print("Enter the name of your category: ");
        String name = input.nextLine();
        gdat.addData(name, "Categories.txt");
        gdat.addData("cat" + name, "questionAnswers.txt");
        for (short x = 0; x < 10; x++) {
            input = new Scanner(System.in);
            System.out.print("Enter Question " + (x + 1) + ": ");
            String question = input.nextLine();
            gdat.addData(question, "questionAnswers.txt");
            System.out.print("Enter Answer " + (x + 1) + ": ");
            String answer = input.nextLine();
            gdat.addData(answer, "questionAnswers.txt");
        }
        gdat.updateData();
    }

    public void editQuestion() throws IOException {
        ArrayList<String> QandA = new ArrayList<String>();
        String file = "D:\\Sem_Troisieme\\JAVA\\TRIVIA-GAME\\Project\\src\\app\\questionAnswers.txt";
        Scanner input;
        input = new Scanner(System.in);
        short i = 0;
        String nextCat = "";
        short choice = game.selectCategory(gdat);
        String SelectedCat = "cat" + gdat.getCategories().get(choice);
        String question = "";
        String answer = "";
        ArrayList<String> questions = new ArrayList<String>();
        ArrayList<String> answers = new ArrayList<String>();
        for (String x : gdat.getQuestionAnswers()) {
            if (x.equals(SelectedCat)) {
                for (int y = (gdat.getQuestionAnswers().indexOf(x) + 1), index = 0; index < 10; y += 2, index++) {
                    question = gdat.getQuestionAnswers().get(y);
                    answer = gdat.getQuestionAnswers().get(y + 1);
                    questions.add(question);
                    answers.add(answer);
                    System.out.println((index + 1) + ". " + question);
                }
            } else {
                if (question != "") {
                    break;
                }
            }
        }
        input = new Scanner(System.in);
        System.out.print("\nSelect which Question you wish to Edit: ");
        int select = input.nextInt();
        input = new Scanner(System.in);
        System.out.print("\nEnter the new Question: ");
        String NewQuestion = input.nextLine();
        gdat.modifyData((String) questions.get(select - 1), NewQuestion);
        System.out.print("\nEnter the new Answer: ");
        String NewAnswer = input.nextLine();
        gdat.modifyData((String) answers.get(select - 1), NewAnswer);
        gdat.updateData();
    }

}
