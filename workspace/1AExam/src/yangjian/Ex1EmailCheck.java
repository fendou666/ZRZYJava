package yangjian;

public class Ex1EmailCheck {

	public int checkEmail(String email){
		int  rec = 0;
		// �ж�ֻ��һ��@����
		if(email.indexOf('@') != email.lastIndexOf('@')||
				// �ո��ж�
				email.indexOf(' ')!=-1 ||
				// �����ж�
				(email.length()-email.lastIndexOf(".com"))==4){
			
			rec = 0;
		}
		
		return rec;
	}
	
}
