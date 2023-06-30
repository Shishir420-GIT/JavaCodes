class MyArrays{

	void printArray(int b[]){
        for(int n:b){
            System.out.println(n);
        }
	}

	int sum(int a[]){
		int temp = 0;
		for(int n:a){
			temp = temp + n;
		}
		return temp;
	}
	public static void main(String[] args){
		int x[] = {1,2,3,4,5};
        int y[] = {5,6,7,8};
		MyArrays obj = new MyArrays();
		System.out.println(obj.sum(y)); //getting sum of array elements

		//MyArrays obj = new MyArrays();
        obj.printArray(x); //printing the array
	}
}
