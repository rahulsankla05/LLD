package Factory_design_pattern;

import Factory_design_pattern.components.Button.Button;
import Factory_design_pattern.components.Dropdown.Dropdown;
import Factory_design_pattern.components.Menu.Menu;

public interface UIfactory {
    Button createbutton();
    Menu createmenu();
    Dropdown createdropdown();

}
