package Knowledge;

public class KTest {
	
	
	public static void main(String[] args) {
//		�̶߳Գ�Ա�����;ֲ�������Ӱ��
//		K1Value thObj1 = new K1Value();
//		Thread th1 = new Thread(thObj1, "�߳�1");
//		Thread th2 = new Thread(thObj1, "�߳�2");
//		th1.start();
//		th2.start();
//		ͬ����ͨ�������뾲̬������
//		K2MethodLock ObjM = new K2MethodLock();
//		Thread th1 = new Thread(new K2Thread1(ObjM),  "�߳�1");
//		Thread th2 = new Thread(new K2Thread2(ObjM),  "�߳�2");
//		Thread th3 = new Thread(new K2Thread3(ObjM),  "�߳�3");
//		Thread th4 = new Thread(new K2Thread4(ObjM),  "�߳�4");
//		Thread th5 = new Thread(new K2Thread5(ObjM),  "�߳�5");
//		th1.start();
//		th2.start();
//		th3.start();
//		th4.start();
//		th5.start();
//		��̬������
//		K3StaticMethodLock ObjS1 = new K3StaticMethodLock();
//		K3StaticMethodLock ObjS2 = new K3StaticMethodLock();
//		K3StaticMethodLock ObjS3 = new K3StaticMethodLock();
//		K3StaticMethodLock ObjS4 = new K3StaticMethodLock();
//		K3StaticMethodLock ObjS5 = new K3StaticMethodLock();
//		Thread th1 = new Thread(new K3Thread1(ObjS1),  "�߳�1");
//		Thread th2 = new Thread(new K3Thread2(ObjS2),  "�߳�2");
//		Thread th3 = new Thread(new K3Thread3(ObjS3),  "�߳�3");
//		Thread th4 = new Thread(new K3Thread4(ObjS4),  "�߳�4");
//		Thread th5 = new Thread(new K3Thread5(ObjS5),  "�߳�5");
//		th1.start();
//		th2.start();
//		th3.start();
//		th4.start();
//		th5.start();
//		��̬����ͬ�������
		K4CommonAndStatic Obj = new K4CommonAndStatic();
		Thread th1 = new Thread(new K4CommonThread(Obj),  "��ͨ�����߳�");
		Thread th2 = new Thread(new K4StaticThread(Obj),  "��̬�����߳�");
		th1.start();
		th2.start();
//		��̬����������ͨ������
		
//		��Ϊÿ��run���õĶ���ķ�����ͬ������Ҫ��������߳�
//		������

//		�ȴ��뻽��		
	}
}
