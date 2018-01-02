package basic;

public class Method {
	void display1() {
		System.out.println("Method 클래스의 display1() 메소드 호출");
	}

	void display2() {
		System.out.println("Method 클래스의 display2() 메소드 호출");
	}
	
	void sum1(){
		int tot = 0;
		for(int i = 1; i <=100; i++)
			tot +=i;
			System.out.println("1~100까지의 범위의 정수의 합계" + tot);
		
	}
	
	void sum2(int x){
		int tot = 0; 
		for(int i =1; i<=x; i++)
			tot+=i;
		System.out.println("1부터"+ x +" 까지의 범위의 정수의 합은 " + tot);
	}
	
	void sum3(int x, int y){
		int tot = 0; 
		for(int i =x ; i <= y; i++){
		tot += i;
		}
		System.out.println(x+"부터"+y+"까지의 범위의 정수의 합은 " + tot);
	}
}
