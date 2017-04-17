package A1BasicArray;

import java.util.Scanner;



public class Main {
//	�ܱ���
	// �û�����������3���������鳤��Ҫһ��
	private String [] user; // �����û�����������Ա
	private String [] pwd; // ÿ���û�������
	private String [] userType; // �û�����[����Ա����ͨ�û�]����Ӧ�û�������ÿһ���û����û�����
	// ��ǰ�û�λ�ñ���
	private int currentUser; //��ǰ��½���û����������λ�ã��Ա�ͳһ�����������ȵ�, ���ɳ���user����
	// ����
	Scanner input = new Scanner(System.in);
	
//	�û����� TODO �����˴˴���ô����
	private String [] userBook; // ÿ���û���Ӧ���Ѿ����ĵ���
//	����Ա����
	//������ı���
	String [] bookNum; // ��ı��
	String [] bookName; // �������
	String [] bookAuthor; // �������
	String [] bookPress; // ��ĳ�����
	int    [] bookToutle; // ���������
	int    [] bookBorrowOutCount; //��Ľ������
	int    [] bookResidueCount; //���ʣ������
	String [] bookUsers; // �Ѿ����ȥ��Ӧ���û�
	String [] bookLog; // ��Ľ��ļ�¼  TODO
//	String [] bookStatus; //���Ƿ�ɽ���
	// ��Ĺ���
//	String [] bookSign; // ���Ƿ�ɾ����
	
	public Main(){
		initUser(); // �ܳ�ʼ��
		initUserBookInfo(); // �û����ʼ��
		initBook(); // ����Ա������ĳ�ʼ��
	}
	
//	�ܽ��棨�����û�Ҳ�ǹ���Ա��
	public void firstPage(){
		System.out.println("1. ��½");
		System.out.println("2. �˳�");
		System.out.println("������:");
		switch(input.nextInt()){
		case 1:
			login();
			break;
		case 2:
			System.exit(0);
		}
		firstPage();
	}
	/**
	 * 
	 * @see "aaa"
	 */
	
	public void login(){
		System.out.println("�������ַ�ʽ�����û�������: �û���_����");
		String str = input.next();
		String [] strAry = str.split("_");
		
		for (int i =0 ; i< user.length; i++) {
			if (user[i]==null){
				break;
			}
			if (strAry[0].equals(user[i]) && strAry[1].equals(pwd[i])){
				
				if (userType[i].equals("admin")) {
//					�������ҳ��
					adminUI();
				}else {
//					�����û�����
					userUI();
				}
				currentUser = i;
				return;
			}
		}
 		System.out.println("���������������");
 		login();
	}
	
//	�ܷ���
	//�ܳ�ʼ��	
	public void initUser(){
		user     = 	new String []{"admin", "user1"};
		pwd  	 = 	new String []{"admin", "123"};
		userType = 	new String []{"admin", "user"};
		
	}
	//�û����ݳ�ʼ��
	public void initUserBookInfo(){
		userBook = 	new String []{null, null};
	}
	
	//����Ա���ݳ�ʼ��
	public void initBook(){
		bookNum       = 	new String []{"0001","0002"}; // ��ı��
		bookName      = 	new String []{"��¥��","���������"}; // �������
		bookAuthor    = 	new String []{"��ѩ��","��÷ɭ"}; // �������
		bookPress     = 	new String []{"������ͨ��ѧ������","�й����������"}; // ��ĳ�����
		bookToutle    = 	new int []{100,100}; // ���������
		bookBorrowOutCount = new int []{0,0}; //��Ľ������
		bookResidueCount = 	new int []{100,100}; //���ʣ������
		bookUsers = 		new String []{null,null}; // �Ѿ����ȥ��Ӧ���û�
//		bookLog = 			new String []{"0001","0002"};  // ��Ľ��ļ�¼  TODO
	}
	
//	�û�����
	public void userUI(){
		System.out.println("1. ����");
		System.out.println("2. ����");
		System.out.println("3. ��ӵ�е���");
		System.out.println("4. �����¼");
		System.out.println("5. ����");
		switch(input.nextInt()){
		case 1:
			getBookUI();
			break;
		case 2:
			returnBookUI();
			break;
		case 3:
			ownerBooks();
			break;
		case 4:
			userBookLog();
			break;
		case 5:
			return;
		default:
			System.out.println("�����������ѡ��");
		}
	}
//	����	
	public void getBookUI(){
		System.out.println("�������ָ�ʽ����: ����_��������");
		String bookStr = input.next();
		String [] book = bookStr.split("_");
		getBook(book[0], Integer.parseInt(book[1]));
		System.out.println("�������飬����1");
		if (input.nextInt()==1) {
			getBookUI();
		}else {
			return;
		}
	}
	
	public void getBook(String bookNumStr, int count){
		int bookIndex = haveTheBook(bookNumStr);
		if (bookIndex!=-1 && bookResidueCount[bookIndex]>=count) {
			userBook[bookIndex]	= userBook[bookIndex]==null
								 ?"":userBook[bookIndex] + 
								"���ţ�" + bookNum[bookIndex] +
								"������" + bookName[bookIndex] +
								"���ߣ�" + bookAuthor[bookIndex] +
								"�����磺" + bookPress[bookIndex] +
								"��������" + count + "\n";
//			�ѽ������ 
			bookBorrowOutCount[bookIndex] += count;  
//			ʣ������ 
			bookResidueCount[bookIndex] -= count;
//			����ļ�¼���
			bookUsers[bookIndex] = bookUsers[bookIndex]==null
									?"":bookUsers[bookIndex]
									+ "user" +currentUser  // �ĸ��û�
									+  "_" + count +","; //���˻�����
//			�û��Ľ��ļ�¼���
			userBook[currentUser] =  userBook[currentUser]==null
									?"":userBook[currentUser]
									+  bookNumStr + "_" + count +",";
			// TODO �ܽ��ļ�¼���
//			bookUsers[bookIndex] = bookUsers[bookIndex]==null
//					?"":bookUsers[bookIndex]
//					+ "user" +currentUser  // �ĸ��û�
//					+ bookNumStr + "_" + count +","; //�������
		}else {
			if (bookIndex == -1){
				System.out.println("���Ų�����");
			}else{
				System.out.println("��������������������");
			}
		}
	}
	public void returnBookUI(){
//		System.out.println("�������ָ�ʽ����: ����_��������");
//		System.out.println("�������飬����1");
//		if (input.nextInt()==1) {
//			returnBookUI();
//		}else {
//			return;
//		}
		
//		TODO ��ʱ����ָ����������
		int bookIndex = 0;
		int count = 0;
		for (String bookStr: userBook[currentUser].split(",")) {
			String [] book = bookStr.split("_");
//			TODO ����鱻ɾ������ô��
			bookIndex =  haveTheBook(book[0]);
			count = Integer.parseInt(book[1]);
			bookBorrowOutCount[bookIndex] -= count;
			bookResidueCount[bookIndex] += count;
		}
		userBook[currentUser] = null;
	}
	
	public void ownerBooks(){
		for (String bookStr: userBook[currentUser].split(",")) {
			System.out.println(bookStr);
		}
	}
	
	public void userBookLog(){
		System.out.println("��ʱûд");
	}
//	�û������ķ���
	
//	����Ա����
	public void adminUI(){
		System.out.println("\t\t����Ա");
		System.out.println("1: ��ѯ����");
		System.out.println("2: ���Ӷ���");
		System.out.println("3: ɾ������");
		System.out.println("4: �޸Ķ�����Ϣ");
		System.out.println("5: ������ļ�¼");
		System.out.println("6: ����");
		switch(input.nextInt()){
		case 1:
			queryBook();
			break;
		case 2:
			addBook();
			break;
		case 3:
			delBook();
			break;
		case 4:
			changeBookInfo();
			break;
		case 5:
			System.out.println("��ʱ��д");
			break;
		case 6:
			break;
		default:
			System.out.println("���������������");
			adminUI();
		}
	}
//	����Ա����
//	��ʾ���ж���
	public void showAllBook(){
		for (int i=0; i<bookNum.length; i++) {
			if (bookNum == null){
				break;
			}
			System.out.println("���ţ�" + bookNum[i] +
								"������" + bookName[i] +
								"���ߣ�" + bookAuthor[i] +
								"�����磺" + bookPress[i] +
								"����������" + bookToutle[i] +
								"�ѽ��������" + bookBorrowOutCount[i] +
								"ʣ��������" + bookResidueCount[i] +
								"���нӴ��ˣ�" + bookUsers[i] +
								"��Ľ��ļ�¼��" + bookLog[i]
					);
		}
	}
//	��ѯ����
	public void queryBook(){
		System.out.println("��������ı�ţ�");
		String bookNumStr = input.next();
		int bookIndex = haveTheBook(bookNumStr);
		if(bookIndex!=-1){
			
		}else{
			System.out.println("����������");
			queryBook();
		}
	}
//	���Ӷ���
	public void addBook(){
		System.out.println("��������ı��:");
		String bookNumStr = input.next();
		if (haveTheBook(bookNumStr)!=-1) {
			System.out.println("��������Ѿ�����");
			addBook();
			return;
		}
		System.out.println("�������ָ�ʽ�����:����_����_������_��������");
		String bookStr = input.next();
		String [] bookProperties = bookStr.split("_");
//		TODO ��һ�ַ�ʽ����һ��������¼�Ѿ���ӵ����λ�ã�һֱֻ��Ҫֱ����λ�ú����
		for (int i=0;i<bookNum.length;i++) {
			if (bookNum[i] == null) {
				bookName[i] = bookProperties[0];
				bookAuthor[i] = bookProperties[1];
				bookPress[i] = bookProperties[2];
				bookToutle[i] = Integer.parseInt(bookProperties[3]);
				bookBorrowOutCount[i] = 0; // ���Բ�д
				bookResidueCount[i] = bookToutle[i];
				bookUsers[i] = null; // ���Բ�д
				bookLog[i] = null; // ���Բ�д
			}
		}
	}
//	��λ�ò��ң�����鲻���ڷ���-1, ���ڷ������λ��
	public int haveTheBook(String addBookNum) {
		int bookNumIndex = -1;
		for (int i=0;i<bookNum.length;i++) {
			if (bookNum[i] == null) {
				return bookNumIndex;
			}
			if (bookNum[i].equals(addBookNum)) {
				bookNumIndex = i;
				break;
			}
		}
		return bookNumIndex;
	}
	
//	ɾ������
	public void delBook(){
		System.out.println("��ʱû�뵽��ô��");
	}
//	�޸Ķ�����Ϣ
	public void changeBookInfo(){
		System.out.println("������Ҫ�޸ĵ���ţ�");
		String bookNumStr = input.next();
		int bookChangeIndex = 0;
		while((bookChangeIndex=haveTheBook(bookNumStr))!=-1){
			System.out.println("����ı�Ų����ڣ���������");
			bookNumStr = input.next();
		}
//		���Ķ�Ӧ����Ϣ
		while (true) {
			System.out.println("ѡ��Ҫ�޸ĵ���Ϣ");
			System.out.println("1:����");
			System.out.println("2:����");
			System.out.println("3:������");
			System.out.println("4:������");
			System.out.println("5:�˳�");
			switch(input.nextInt()){
			case 1:
				System.out.println("��������ĺ��������");
				bookName[bookChangeIndex] =input.next();
				break;
			case 2:
				System.out.println("��������ĺ�����ߣ�");
				bookAuthor[bookChangeIndex] =input.next();
				break;
			case 3:
				System.out.println("��������ĺ�ĳ����磺");
				bookPress[bookChangeIndex] =input.next();
				break;
			case 4:
				System.out.println("��������ĺ�����������");
				bookToutle[bookChangeIndex] =input.nextInt();
				bookResidueCount[bookChangeIndex] = bookToutle[bookChangeIndex] 
													- bookBorrowOutCount[bookChangeIndex];
				break;
			case 5:
				break;
			default:
				System.out.println("�������");
			}
		}
	}
	
//	������ļ�¼, ��ʱ��Ľ��黹���¼��־
	public void timeBookLog(){
		System.out.println("��ʱ����");
	}
	
	public static void main(String[] args) {
//		�ܱ���
//		�û�����
//		����Ա����
		Main m = new Main();
		m.firstPage();
		
	}
	
}
