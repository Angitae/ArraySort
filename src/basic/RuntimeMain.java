package basic;

public class RuntimeMain {
	public static void main(String[] args) {
		//Runtime Ŭ���� : JVM�� ������ �����ϱ�
		// �����ڰ� ����ȭ �Ǿ��־� �ν��Ͻ���  new �����ڷ� �����ؾ� �Ѵ�. 
		
//		Runtime rt = new Runtime();
		// ���Ͱ��� �ϸ� �ν��Ͻ��� ������ ������ �� �ִ�.
		// getRuntime() : Runtime �ν��Ͻ��� �����Ͽ� ��ȯ�ϴ� �޼ҵ�  
		// �ϳ��� �ν��Ͻ��� �����Ͽ� ��ȯ�Ѵ�.  (�̱��� ���)
		Runtime rt  = Runtime.getRuntime();
		Runtime rt2  = Runtime.getRuntime();
		
		System.out.println("rt1 = "+ rt);
		System.out.println("rt2 = "+ rt2);
		// �ּҰ� ����. ���Ͱ��� ������ �ְ� �Ǹ�...
		System.out.println("=========================");
		System.out.println("���� JVM�� ������� �޸� ũ�� "+
		(Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory())+"Byte");

		//gc() --->  garbage collector ���α׷� �����ϴ� �޼ҵ� -> ���ʿ��� �޸� ���� 
//		Runtime.getRuntime().gc();
		// ���� ���� ����
		System.gc();
		
		System.out.println("������� �޸� ���� ��");
		System.out.println("���� JVM�� ������� �޸� ũ�� "+
		(Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory())+"Byte");
		// dos, windows ��� ������ �� (�ܺ� ���α׷� ������ �� exec �ٵ� �� ��� ���Ѵ�. )
	}
}
