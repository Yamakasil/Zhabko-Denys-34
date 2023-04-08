import java.util.ArrayList;
import java.util.List;

public class MacroCommand extends Command {
    private List<Command> commands = new ArrayList<>();
    
    public void addCommand(Command command) {
        commands.add(command);
    }
    
  
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
    
    public void undo() {
        for (int i = commands.size() - 1; i >= 0; i--) {
            Command command = commands.get(i);
            command.undo();
        }
    }
}
