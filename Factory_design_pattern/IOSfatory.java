package Factory_design_pattern;

import Factory_design_pattern.components.Button.Button;
import Factory_design_pattern.components.Button.iosbutton;
import Factory_design_pattern.components.Dropdown.Dropdown;
import Factory_design_pattern.components.Dropdown.iosDropdown;
import Factory_design_pattern.components.Menu.Menu;
import Factory_design_pattern.components.Menu.iosmenu;

public class IOSfatory implements UIfactory{
    public iosbutton createbutton(){
        return new iosbutton();
    }
    public iosmenu createmenu(){
        return new iosmenu();
    }
    public iosDropdown createdropdown(){
        return new iosDropdown();
    }
}
