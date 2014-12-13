package Domain;

import java.util.ArrayList;

public class Category extends Component {
	private ArrayList<Component> allComponents = new ArrayList<Component>();
	private String name;

	public Category(String nm){
		name = nm;
	}
	
	public String getName(){
		return name;
	}
	
	public void addComponent(Component c1){
		allComponents.add(c1);
	}
}
