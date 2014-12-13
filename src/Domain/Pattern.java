package Domain;

public class Pattern extends Component{
	private String name, context, problem, solution, consequences, imageLink;
	
	public Pattern(String nm, String cont, String pr, String so, String cons, String il){
		name = nm;
		context = cont;
		problem = pr;
		solution = so;
		consequences = cons;
		imageLink = il;
	}
	
	public String getName(){
		return name;
	}
	
	public String getContext(){
		return context;
	}
	
	public String getProblem(){
		return problem;
	}
	
	public String getSolution(){
		return solution;
	}
	
	public String getConsequences(){
		return consequences;
	}
	
	public String getImageLink(){
		return imageLink;
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
	
	public void setSolutions(String so){
		solution = so;
	}
	
	public void setConsequences(String cs){
		consequences = cs;
	}
	
	public void setImageLink(String il){
		imageLink = il;
	}
}
