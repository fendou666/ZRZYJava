package o20170308ThreadComu;

public class Producter implements Runnable {
	private Info info=null;

	public Producter(Info info) {
		this.info = info;
	}
	@Override
	public void run() {
		boolean flag=false;
		for (int i = 0; i < 10; i++) {
			if(flag){
				this.info.set("��Ϊ", "�ֻ�"+i);
				flag=false;
			}else{
				this.info.set("����", "�ʼǱ�"+i);
				flag=true;
			}
		}
		
	}

}