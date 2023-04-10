package Factory_design_pattern.components.Button;

public class iosbutton implements Button {
    @Override
//    as we're implementing Interface Button class here so we can change button to androidbutton/iosbutton
    public iosbutton clickbutton() {
        return new iosbutton();
    }
}
