package basic;

public class MethodMain {

	// ���� Ŭ���� : main �޼ҵ带 ������ Ŭ����
	// -> �ٸ� Ŭ������ �ν��Ͻ��� �޼ҵ� ȣ���Ͽ� ����� �߻���Ų��.

	public static void main(String[] args) {

		// Ŭ������ �ν��Ͻ�(��ü)�� �����Ͽ� ���������� �����Ѵ�.
		// => ���� ��Ű���� ����� Ŭ���� ��밡���ϴ�.
		// ( public , protected , default)
		// private�� ���� ��Ű���� �ִ��� ��� �Ұ����ϴ� .

		Method m1 = new Method();

		// �ν��Ͻ��� ����� ���������� �̿��Ͽ� �޼ҵ� ȣ���Ѵ�.
		m1.display1();
		m1.display2();
		m1.sum1();
		m1.sum2(200);
		
		m1.sum3(0, 100);
	}

}
