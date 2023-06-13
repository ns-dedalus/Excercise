package NestedExample;

class OuterClass{
	int oa = 10;
	class InnerClass{
		int inr=20;
		public void displayinner() {
			OuterClass o = new OuterClass();
			int lo=30;
		    System.out.println("OuterClass int without instance"+oa);
		//	System.out.println("OuterClass int with instance"+o.oa);
			System.out.println("local inner variable"+lo);
			
		}
	
		
		
	}
	
	public void OuterMethod() {
		InnerClass ic = new InnerClass();
		System.out.println("Inner vairable"+ic.inr);
		System.out.println(oa);
		
	}
}

class O{
	abstract class A{
		abstract public void getdata() ;
	}
	
	class B extends A{
		public void getdata() {
			System.out.println("inherited inner class");
		}
	}
}
public class NestedMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass inc = oc.new InnerClass();
		inc.displayinner();
		oc.OuterMethod();
		
		O outerc = new O();
		O.B inheritedClass = outerc.new B();
		inheritedClass.getdata();
	//	System.out.println(oc.oa);
	}

}
