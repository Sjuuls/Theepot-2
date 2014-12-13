package Domain;

import java.util.ArrayList;

public abstract class Component {
private ArrayList<Component> allPatterns = new ArrayList<Component>();
	
	public abstract String getName();
	
	
	
	
	
	public void addPattern(Component c1){
		allPatterns.add(c1);
	}
}
