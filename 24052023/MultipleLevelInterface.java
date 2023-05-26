interface A {
	void fa();
}

interface B extends A {
	void fb();
}

class XYZ implements B {

	@Override
	public void fa() {
		System.out.println("XYZ:fa");
	}

	@Override
	public void fb() {
		System.out.println("XYZ:fb");
	}

}

public class MultipleLevelInterface {

	public static void main(String[] args) {

		XYZ obj = new XYZ();
		obj.fa();
		obj.fb();

	}

}