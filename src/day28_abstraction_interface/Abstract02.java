package day28_abstraction_interface;

public abstract class Abstract02 {
    public abstract void abs1();
}

abstract class Tiger extends Abstract02{
	//If child class is abstract, no need to inherit abstract methods
	//If you want you can
	public abstract void abs2();
}

class Cat extends Abstract02{
	public void abs1() {
		System.out.println("I inherited abs1 because Cat is concrete class");
	}
}

class Fish extends Tiger{
	//When you extend an abstract class you have to inherit all abstract classes
	//form all parents.(parent, grand parent, grand grand parent ...)
	public void abs2() {
		System.out.println("I inherited abs2 because Fish is child concrete class");
	}
	public void abs1() {
		System.out.println("I inherited abs1 because Fish is grand child concrete class");
	}
}
