package patrones_comportamiento.mediator.mediator_laboratory;

import java.util.ArrayList;
import java.util.List;

//Implementar la clase ConcreteMediator
public class ChatMediatorImpl implements ChatMediator {
    private List<Colleague> colleagues;

    public ChatMediatorImpl(){
        this.colleagues = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, Colleague colleague) {
        for(Colleague c : colleagues){
            if(c != colleague){
                c.receive(message);
            }
        }
    }

    @Override
    public void addUser(Colleague colleague) {
        this.colleagues.add(colleague);
    }
}
