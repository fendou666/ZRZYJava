package o20170228;

public class A5Student implements A5Human  {

	private String name;
	private int studentNumber;

	public A5Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public A5Student(String name, int studentNumber) {
		super();
		this.name = name;
		this.studentNumber = studentNumber;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("���ڳԷ�");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("����˯��");
	}

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		System.out.println("����Ҫ������һֱ����");
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("����ѧϰ");
	}

	@Override
	public void thought() {
		// TODO Auto-generated method stub
		System.out.println("����˼��");
	}
	
}
