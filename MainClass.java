class FirstOOP{
	static void MethodOne(){
		System.out.println("This is methood one");
	}
	static void MethodTwo(){
		System.out.println("This is methood Two");
	}
}

class MainClass{
	public static void main(String Atg[]){
		//FirstOOP obj = new FirstOOP();
		FirstOOP.MethodOne();
		FirstOOP.MethodTwo();
	}
}