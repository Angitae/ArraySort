package basic;

public class Method {
	void display1() {
		System.out.println("Method Ŭ������ display1() �޼ҵ� ȣ��");
	}

	void display2() {
		System.out.println("Method Ŭ������ display2() �޼ҵ� ȣ��");
	}
	
	void sum1(){
		int tot = 0;
		for(int i = 1; i <=100; i++)
			tot +=i;
			System.out.println("1~100������ ������ ������ �հ�" + tot);
		
	}
	
	void sum2(int x){
		int tot = 0; 
		for(int i =1; i<=x; i++)
			tot+=i;
		System.out.println("1����"+ x +" ������ ������ ������ ���� " + tot);
	}
	
	void sum3(int x, int y){
		int tot = 0; 
		for(int i =x ; i <= y; i++){
		tot += i;
		}
		System.out.println(x+"����"+y+"������ ������ ������ ���� " + tot);
	}
}
