package basic;

public class MethodMain {

	// 실행 클래스 : main 메소드를 선언한 클래스
	// -> 다른 클래스의 인스턴스로 메소드 호출하여 결과를 발생시킨다.

	public static void main(String[] args) {

		// 클래스로 인스턴스(객체)를 생성하여 참조변수에 저장한다.
		// => 동일 패키지에 선언된 클래스 사용가능하다.
		// ( public , protected , default)
		// private은 같은 패키지에 있더라도 사용 불가능하다 .

		Method m1 = new Method();

		// 인스턴스가 저장된 참조변수를 이용하여 메소드 호출한다.
		m1.display1();
		m1.display2();
		m1.sum1();
		m1.sum2(200);
		
		m1.sum3(0, 100);
	}

}
