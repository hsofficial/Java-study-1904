package accessModifier;

public class A {
	/* ���������ڴ� �ܼ��� �������� ������ �ƴϰ�
	 * �Ը��ִ� ���ø����̼� ���߽� ����ڰ� ��ü ���������� ����ϴ� �ʵ峪 �޼ҵ忡
	 * �߸��� ������ �ϹǷμ� �ǵ�ġ ���� ���۵��� ����Ŵ
	 * public : ������ �ȳ�â��(�ƹ��� ���ͼ� ������ ���ϴ�.)
	 * private : ������� ���� �ݰ�
	 */
	private int field;	//private�ʵ�(�� Ŭ������ ���ٰ�����)
	public A() {}	//public�޼ҵ� - ������(������ ���ٰ���)
	void method() {}	//default �޼ҵ�(�� ��Ű�������� ���ٰ�����)
	void test() {
		A a = new A();//public ���ٰ���(�� ��Ű��, �ܺ� ��Ű��)
		a.field = 5; //private ���ٰ���(�� Ŭ���� ����)
		a.method(); //default ���ٰ���(�� ��Ű�� ����)
	}

}