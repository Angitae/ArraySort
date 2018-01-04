package basic;

public class RuntimeMain {
	public static void main(String[] args) {
		//Runtime 클래스 : JVM의 정보를 저장하기
		// 생성자가 은닉화 되어있어 인스턴스를  new 연산자로 생성해야 한다. 
		
//		Runtime rt = new Runtime();
		// 위와같이 하면 인스턴스가 여러개 생성될 수 있다.
		// getRuntime() : Runtime 인스턴스를 생성하여 반환하는 메소드  
		// 하나의 인스턴스만 생성하여 반환한다.  (싱글톤 기법)
		Runtime rt  = Runtime.getRuntime();
		Runtime rt2  = Runtime.getRuntime();
		
		System.out.println("rt1 = "+ rt);
		System.out.println("rt2 = "+ rt2);
		// 주소가 같다. 위와같이 생성해 주게 되면...
		System.out.println("=========================");
		System.out.println("현재 JVM이 사용중인 메모리 크기 "+
		(Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory())+"Byte");

		//gc() --->  garbage collector 프로그램 실행하는 메소드 -> 불필요한 메모리 정리 
//		Runtime.getRuntime().gc();
		// 위와 같은 내용
		System.gc();
		
		System.out.println("사용중인 메모리 정리 후");
		System.out.println("현재 JVM이 사용중인 메모리 크기 "+
		(Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory())+"Byte");
		// dos, windows 명령 실행할 때 (외부 프로그램 실행할 때 exec 근데 잘 사용 안한다. )
	}
}
