class MethodOverloading{
	void overloadDemo(float a){
		System.out.println("from method 1");
	}
	void overloaaDemo(int a){
		System.out.println("from method 2"+ a);
	}
public static void main(String ar[]){
	MethodOverloading md2=new MethodOverloading();
	md2.overloadDemo(3.2f);
	md2.overloadDemo(4);
}
}
