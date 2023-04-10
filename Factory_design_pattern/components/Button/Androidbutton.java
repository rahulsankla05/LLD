package Factory_design_pattern.components.Button;

public class Androidbutton implements Button {
    @Override
    public Androidbutton clickbutton() {
        return new Androidbutton();
    }
}
