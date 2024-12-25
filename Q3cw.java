package Day12;

public class Q3cw extends A {
	public static void main(String[] args) {
		 Q1cw obj=new Q1cw();
		 obj.s1();
		 obj.s2();
		 obj.s3();
	}


}


}
class A extends B{
	public void s1() {
		System.out.println("Hii I am A");
	}
}
class B extends C{
	public void s2() {
		System.out.println("Hii I am B");
	}
}
class C{
	public void s3() {
		System.out.println("Hii I am C");
	}
}

