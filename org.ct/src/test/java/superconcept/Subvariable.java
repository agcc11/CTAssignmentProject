package superconcept;

public class Subvariable extends Supervariable {

	int a=20;
	
	void add() {
		super.add();  //for calling superclass method
		System.out.println("subclass");
	}
	
	void m1()
	{
		System.out.println(a);
		System.out.println(super.a);
	}
	
	Subvariable()
	{
		super(21);
		System.out.println("subclass constructor");
	}
}
