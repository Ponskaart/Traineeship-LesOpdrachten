package nl.belastindienst.consoleApplicationExcercise.Services;

public class MenuService {
    int userChoice = -1;
    boolean quit = false;

    public void runMenu() {
        printWelcomeMessage();
//TODO inser scanner method for userchoice
        while (!quit) {
            printMenuChoices();
//            userChoice =
            executionOfMenuChoices(userChoice);
        }
    }

    private void executionOfMenuChoices(int userChoice) {
//TODO add methods to the menu
        switch (userChoice) {
            case 1-> {
                System.out.println("test 1");
            }
            case 2 -> {
                System.out.println("test 2");
            }

            case 3 -> {
                System.out.println("test 3");

            }

            case 4 -> {
                System.out.println("test 4");
            }

            case 0 -> {
                quit = true;
            }

            default -> {
                System.out.println("We've encountered an unexpected error, please contact your system administrator");
            }
        }
    }

    private void printWelcomeMessage() {
        System.out.println("+-------------------------------+");
        System.out.println("|Welcome to the Student Registry|");
        System.out.println("+-------------------------------+");
        System.out.println("\n");

    }

    private void printMenuChoices() {
        System.out.println("What would you like to do? ");
        System.out.println("\n");
        System.out.println("1) Add student to the registry");
        System.out.println("2) Remove student from the registry");
        System.out.println("3) Find specific student by name");
        System.out.println("4) Show all students");
        System.out.println("0) Quit");
        System.out.println("\n");
        System.out.println("Your choice: ");
    }
}
