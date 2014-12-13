package Domain;

import java.awt.Image;

public class Pattern extends Component{
	private String name, context, problem, solution, consequences, imageLink;
	private Image image;
	
	public Pattern(String nm, String cont, String pr, String cons, String il){
		name = nm;
		context = cont;
		problem = pr;
		consequences = cons;
		imageLink = il;
	}
	
	public String getName(){
		return name;
	}
}
