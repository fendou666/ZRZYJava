package o20170227;

public class A1test {
	
	public static void method(A1SportMan test){
		
		if (test instanceof A1DiveMan){
			test.exercise();
		}else {
			System.out.println("����˶�Ա������ˮ�˶�Ա");
		}
		
	
	}
	
	
	public static void main(String[] args) {
		// Ӿ��
		A1Clothes swimsuit = new A1Clothes("�ļ�", "��ɫ", "Ӿ��");
		// ����
		A1Clothes jersey = new A1Clothes("�ļ�", "��ɫ", "����");
//		
//		A1Factory fac = new A1Factory("���¹���", "����");
//		
//		fac.makeClothes(swimsuit);
//		fac.makeClothes(jersey);
//		
		A1DiveMan tianl = new A1DiveMan("����", swimsuit, "���Ҷ�", "˫����ˮ");
		
		A1FootballMan  zl = new A1FootballMan("�����M", jersey, "���Ҷ�", "����");
		
		System.out.println(tianl.toString());
		System.out.println(zl.toString());
		
		A1SportMan dive = new A1DiveMan("����", swimsuit, "���Ҷ�", "˫����ˮ");
		A1SportMan football = new A1FootballMan("�����M", jersey, "���Ҷ�", "����");
		
		method(dive);
		method(football);
		boolean z1 = dive instanceof A1SportMan || football instanceof A1SportMan;
		boolean z2 = dive instanceof A1SportMan && football instanceof A1SportMan;
		boolean z3 = dive instanceof A1DiveMan && football instanceof A1FootballMan;
		boolean z4 = dive instanceof A1FootballMan;
		boolean z5 = football instanceof A1DiveMan;
		System.out.println(z1);
		System.out.println(z2);
		System.out.println(z3);
		System.out.println(z4);
		System.out.println(z5);
		
		A1DiveMan test = (A1DiveMan)dive;
		test.test();
		//jersey = (jersey)fac;
		

		
		
		
	}
}
