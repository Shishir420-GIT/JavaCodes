class MethodOverloading{

	void add(){
		System.out.println("\nOOPs You didn't provide any argument.");
	}
	void add(int x, int y){
		int c = x+y;
		System.out.println("\nAddion of " +x+ " and "+y+ " is : "+c);
	}
	void add(int x, int y, int z){
		int c = x+y+z;
		System.out.println("\nAddion of " +x+ ","+y+ " and " + z + " is : "+c);
	}
	public static void main(String[] args) {
		Numbers obj = new Numbers();
		obj.add();
		obj.add(4,5);
		obj.add(9,8,7);
    }   
}