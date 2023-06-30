package commend;

import java.util.ArrayList;
import java.util.List;

public class Watior {
    private List<Command> commands= new ArrayList<>();

    public void setCommands(Command command) {
        commands.add(command);
        this.commands = commands;
    }
    public  void say(){
        System.out.println("订单来了");
        for(Command command:commands){
            if(command!=null){
            command.execute();}
        }
    }
}
