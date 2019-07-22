class FunctionTest{
	void Add(){
		int a = 4;
		int b = 10;
		System.out.println("the sum is "+(a+b));
	}
	void Subtract(){
		int a = 6;
		int b = 3;
		System.out.println("the difference is "+(a-b));
	}
	void Multiply(){
		int a = 4;
		int b = 20;
		System.out.println("the product is "+(a*b));
	}
	void divide(){
		int a = 20;
		int b = 2;
		System.out.println("the division is "+(a/b));
	}
	public static void main(String arg[]){
		FunctionTest a = new FunctionTest();
		a.Add();
		a.Subtract();
		a.Multiply();
		a.divide();
	}
}