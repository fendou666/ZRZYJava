package Knowledge;

public class KTest {
	
	
	public static void main(String[] args) {
//		�̶߳Գ�Ա�����;ֲ�������Ӱ��
//		Thread th1 = new Thread(new K1Value(), "�߳�1");
//		Thread th2 = new Thread(new K1Value(), "�߳�2");
//		th1.start();
//		th2.start();
//		֤�����������������ǵ�ǰ����
//		�̵߳ĸ�ֵ�����췽������������
//		�������ֱ�����ʽ��ֻҪӵ������ͬ�ĳ�Ա�������ߴ�������ͬ�Ĳ���������֮������˹�ϵ
//		����Ǳ�����ʽ3,Ϊ���������й�ϵ�����ø����߳�ӵ����ͬ�ĳ�Ա����
//		ͬ����ͨ�������뾲̬������,ָ���ǳ�Ա�����������
//		����һ�������Զ��󣬰��������Ķ�����Ϊ��ͬ�߳��ഴ���Ĳ�ͬ�̵߳���ͬ��Ա����, K2Threadʵ��runnable�ӿ�
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
//		K3StaticMethodLock ObjS6 = new K3StaticMethodLock();
//		Thread th1 = new Thread(new K3Thread1(ObjS1),  "�߳�1");
//		Thread th2 = new Thread(new K3Thread2(ObjS2),  "�߳�2");
//		Thread th3 = new Thread(new K3Thread3(ObjS3),  "�߳�3");
//		Thread th4 = new Thread(new K3Thread4(ObjS4),  "�߳�4");
//		Thread th5 = new Thread(new K3Thread5(ObjS5),  "�߳�5");
//		Thread th6 = new Thread(new K3Thread6(ObjS6),  "�߳�6"); //ͬ����ȡ����̬��
//		th1.start();
//		th2.start();
//		th3.start();
//		th4.start();
//		th5.start();
//		th6.start();
//		��̬����ͬ�������
//		K4CommonAndStatic obj = new K4CommonAndStatic();
//		Thread th1 = new Thread(new K4CommonThread(obj),  "��ͨ�����߳�");
//		Thread th2 = new Thread(new K4StaticThread(obj),  "��̬�����߳�");
//		th1.start();
//		th2.start();
//		��Ϊÿ��run���õĶ���ķ�����ͬ������Ҫ��������߳�
//		������
//		K5ObjLock obj = new K5ObjLock();
//		Thread th1 = new Thread(new K5Thread1(obj),  "�߳�1");
//		Thread th2 = new Thread(new K5Thread2(obj),  "�߳�2");
//		th1.start();
//		th2.start();
		
		// ����������̬����������
//		֤��ֻ�з�����������this���� һ������һ��������һ����������
//		K6ObjAllLock obj =  new K6ObjAllLock();
//		Thread th1 = new Thread(new K6Thread1(obj),  "ͬ�����߳�");
//		Thread th2 = new Thread(new K6Thread2(obj),  "ͬ�������߳�");
//		Thread th3 = new Thread(new K6Thread3(obj),  "��̬�����߳�");
//		Thread th4 = new Thread(new K6Thread4(obj),  "��̬������ͬ�����߳�");
//		th1.start();
//		th2.start();
//		th3.start();
//		th4.start();
		
//		�ȴ��뻽��		
		K7WaitNotify  obj =  new K7WaitNotify();
//		��������߳�ͬʱ���п�����Ч������Ϊ�п��ܵȴ��̻߳�û�����У������߳��Ѿ�����  //������������Ҫ��������˼· �����һ��Ҫ��˳����
//		�����еȴ��߳�
		Thread th1 = new Thread(new K7Thread1(obj),  "wait�߳�");
		th1.start();
//		�ȵȴ��߳�������ϣ������л����߳�(���Ƚ�������ע�͵���������)
		Thread th2 = new Thread(new K7Thread2(obj),  "notify�߳�");
		th2.start();
		
//		һ��λ�õȴ�������λ�û���
		
	}
}
