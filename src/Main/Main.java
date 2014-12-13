package Main;

import Domain.Pattern;

public class Main {
	public static void main(String[] arg){
		Domain.Category category1 = new Domain.Category("category1");
		
		//Categorie 1
		Domain.Category purpose = new Domain.Category("Purpose");
		Domain.Category scope = new Domain.Category("Scope");
		category1.addComponent(purpose);
		category1.addComponent(scope);
		
		//Purpose
		Domain.Category behavioral = new Domain.Category("Behavioral");
		Domain.Category structural = new Domain.Category("Structural");
		Domain.Category creational = new Domain.Category("Creational");
		purpose.addComponent(behavioral);
		purpose.addComponent(structural);
		purpose.addComponent(creational);
		
		//scope
		Domain.Category class1 = new Domain.Category("Class");
		Domain.Category object = new Domain.Category("Object");
		scope.addComponent(class1);
		scope.addComponent(object);
		
		//behavioral
		Domain.Pattern strategy = new Domain.Pattern("Strategy", "reduces complexity", "When you have to preform a runtime object change",null, "you have to add more classes", null);
		Domain.Pattern iterator = new Domain.Pattern("Iterator", "separate the list from the through-walker", "when there are multiple through-walkers",null, "you have to add more classes", null);
		behavioral.addComponent(strategy);
		behavioral.addComponent(iterator);
		
		//Structural
		Domain.Pattern facade = new Domain.Pattern("Facade", "reduces complexity", "when the associations between two parts is too complicated","add a facade that has all the associations", "you have to add more classes", null);
		structural.addComponent(facade);
		
	}
}
