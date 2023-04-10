package Factory_design_pattern;

import Factory_design_pattern.components.Button.Androidbutton;
import Factory_design_pattern.components.Button.Button;
import Factory_design_pattern.components.Dropdown.AndroidDropdown;
import Factory_design_pattern.components.Menu.Androidmenu;
import Factory_design_pattern.components.Menu.Menu;

public class Androidfactory implements UIfactory{
    public Androidbutton createbutton(){
        return new Androidbutton();
    }
    public Androidmenu createmenu(){
        return new Androidmenu();
    }
    public AndroidDropdown createdropdown(){ return new AndroidDropdown();}


}
