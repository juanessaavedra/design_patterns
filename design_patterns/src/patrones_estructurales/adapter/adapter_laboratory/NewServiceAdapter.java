package patrones_estructurales.adapter.adapter_laboratory;

public class NewServiceAdapter implements Target {
    private NewService newService;

    public NewServiceAdapter(NewService newService) {
        this.newService = newService;
    }

    @Override
    public void request() {
        newService.performAction();
    }
}
