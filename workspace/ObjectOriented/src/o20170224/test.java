package o20170224;

public class test {
	public static void main(String[] args) {
		// Ӿ��
		Clothes swimsuit = new Clothes("�ļ�", "��ɫ", "Ӿ��");
		// ����
		Clothes jersey = new Clothes("�ļ�", "��ɫ", "����");
		
		Factory fac = new Factory("���¹���", "����");
		
		fac.makeClothes(swimsuit);
		fac.makeClothes(jersey);
		
		DiveMan tianl = new DiveMan("����", swimsuit, "���Ҷ�", "˫����ˮ");
		
		FootballMan  zl = new FootballMan("�����M", swimsuit, "���Ҷ�", "����");
		
		tianl.toString();
		zl.toString();
		
		
		SportMan zm = new DiveMan("����", swimsuit, "���Ҷ�", "˫����ˮ");
		
		DiveMan zz = (DiveMan)zm;
		zz.test();
		//jersey = (jersey)fac;
		
		// �������Է��֣���������֮���ת����ֻ�и������Ͳ���
		Same1 s1 = new Same1();
		Same2 s2 = new Same2();
		
		Same1 s11 = s1;
		Same2 s22 = s2;
		
		//Same2 s21 = (Same2)s1;
		
		
		
	}
}
