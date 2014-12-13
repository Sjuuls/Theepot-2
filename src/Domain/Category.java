package Domain;

import java.util.ArrayList;

public class Category extends Component {
	private ArrayList<Component> allComponent = new ArrayList<Component>();
	private String name;

	public Category(String nm){
		name = nm;
	}
	
	public String getName(){
		return name;
	}
}
