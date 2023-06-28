package superconcept;

public class Supervariable {

	
	int a=10;
	
	Supervariable(int w)   //not argument then superclass constructor automaticallly call in subclass
	{
		System.out.println("super constructor");
	}
	void add() {
		System.out.println("superclass");
	}
}
