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
	
	public void setName(String n){
		name = n;
	}
	
	public void setContext(String c){
		context = c;
	}
	
	public void setProblem(String p){
		problem = p; 
	}
	
	public void setConsequences(String cs){
		consequences = cs;
	}
	
	public void setImageLink(String il){
		imageLink = il;
	}
}
