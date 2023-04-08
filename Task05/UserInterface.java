import java.util.Scanner;

public class UserInterface {
    private CommandManager commandManager = new CommandManager();
    private Scanner scanner = new Scanner(System.in);
    
    public void start() {
        boolean exit = false;
        while (!exit) {
            System.out.println("1. Execute the command");
            System.out.println("2. Cancel the last command");
            System.out.println("3. Exit the program");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    executeCommand();
                    break;
                case 2:
                    undoLastCommand();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Невідомий вибір");
            }
        }
    }
    
    private void executeCommand() {
        // код для отримання команди від користувача
        Command command = new SomeCommand();
        commandManager.executeCommand(command);
    }
    
    private void undoLastCommand() {
        commandManager.undoLastCommand();
    }

    private static class SomeCommand extends Command {

        public SomeCommand() {
        }
    }
}
