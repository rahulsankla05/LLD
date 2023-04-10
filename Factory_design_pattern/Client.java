package Factory_design_pattern;

public class Client {
    public static void main(String[] args) {
        Flutter flutter=new Flutter();
        UIfactory factory=flutter.createUIfactory("Android");
        factory.createbutton();
        factory.createdropdown();
        factory.createmenu();
    }
}
