/**
 *   �������ƣ�ͼ�����ϵͳ��ͼ�������
 *   ����˵����ʵ��ͼ�����ϵͳ�� ������ɾ���ġ��顱 ���ܡ�
 *   �����ߣ�ChianSofti.java170207.lizm    2017��4��13�� ����7:15:14
 *   �����ߣ�
 *   
 *   
 */

package com.library;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * 
 *   �����ƣ�BookManager  ͼ�������
 *   ��˵������ͼ����Ϣ������࣬���漯������ɾ�Ĳ�ķ���
 *   �����ߣ�ChianSofti.java170207.lizm    2017��4��13�� ����7:15:14
 *   �����ߣ�
 *   
 *
 */
public class BookManager {
	private final static Scanner sc = new Scanner(System.in);  
	private final static String[] bookInfo = {
		"���", "����", "����", "������", "����", "����", "����"
	};
	
	private String[] bookId = null;    //ͼ��������
	private String[] bookName = null;    //ͼ����������
	private String[] bookAuthor = null;    //ͼ����������
	private String[] bookPublish = null;    //ͼ�����������
	private int[] bookTotalNum = null;    //ͼ������������
	private int[] bookRemainderNum = null;    //ͼ������������
	private String[] bookType = null;    //ͼ����������
	private int bookListLength = 0;    //���в�ͬͼ�������
	
	/**
	 * ����������ʼ������
	 * ����˵����Ϊ�������Է����ڴ�
	 */
	public void initBookList(){
		bookId = new String[1];
		bookName = new String[1];
		bookAuthor = new String[1];
		bookPublish = new String[1];
		bookTotalNum = new int[1];
		bookRemainderNum = new int[1];
		bookType = new String[1];
	}
	
	/**
	 * 
	 * �������� createNewBookList  ��̬���������Сԭ����
	 * ����˵���� ��ɾ��������Ԫ��ʱ�����������飬���ƶ����ԭ�����е�Ԫ�ؿ�����������
	 *         �������������Ԫ��ʱ������ԭ���鳤��+1�������飬��ԭ�����е�Ԫ�ؿ�������������
	 * @param newLength  ������ĳ���
	 * @param copyLength  ԭ��������Ҫ�����ĳ���
	 */
	public void createNewBookList(int newLength, int copyLength){
		String[] nBookId = new String[newLength];
		String[] nBookName = new String[newLength];
		String[] nBookAuthor = new String[newLength];
		String[] nBookPublish = new String[newLength];
		int[] nBookTotalNum = new int[newLength];
		int[] nBookRemainderNum = new int[newLength];
		String[] nBookType = new String[newLength];
		System.arraycopy(bookId, 0, nBookId, 0, copyLength);
		System.arraycopy(bookName, 0, nBookName, 0, copyLength);
		System.arraycopy(bookAuthor, 0, nBookAuthor, 0, copyLength);
		System.arraycopy(bookPublish, 0, nBookPublish, 0, copyLength);
		System.arraycopy(bookTotalNum, 0, nBookTotalNum, 0, copyLength);
		System.arraycopy(bookRemainderNum, 0, nBookRemainderNum, 0, copyLength);
		System.arraycopy(bookType, 0, nBookType, 0, copyLength);
		bookId = nBookId;
		bookName = nBookName;
		bookAuthor = nBookAuthor;
		bookPublish = nBookPublish;
		bookTotalNum = nBookTotalNum;
		bookRemainderNum = nBookRemainderNum;
		bookType = nBookType;
	}
	
	/**
	 * 
	 * �������� moveBookList  �ƶ�����
	 * ����˵���� ��ɾ��������Ԫ��ʱ����indexλ�ÿ�ʼ�Ѻ����Ԫ���ƶ���ǰ��ȥ
	 * @param index  ��Ҫ��ʼ�ƶ�Ԫ�ص�λ��
	 */
	public void moveBookList(int index){
		for (int i = index; i < bookListLength - 1; i++) {
			bookId[index] = bookId[index + 1];
			bookName[index] = bookName[index + 1];
			bookAuthor[index] = bookAuthor[index + 1];
			bookPublish[index] = bookPublish[index + 1];
			bookTotalNum[index] = bookTotalNum[index + 1];
			bookRemainderNum[index] = bookRemainderNum[index + 1];
			bookType[index] = bookType[index + 1];
		}
	}
	
	/**
	 * 
	 * �������� addBook  �������������Ԫ��
	 * ����˵���� �������Ϊ�գ����ȳ�ʼ�����飬
	 *        �����Ȳ�ѯ�������Ƿ��и�id���У������Ԫ�صĿ��
	 *        û�У��򴴽�һ������ԭ����+1�����飬��Ϊ���һ��Ԫ�ظ�ֵ
	 * @return �����Ƿ���ӳɹ�
	 */
	public boolean addBook(){
		if(bookListLength == 0){
			initBookList();
			setBookInfo(bookListLength);
			return true;
		}
		String id = getInputString(bookInfo[0], null);
		int index = findBookById(id);
		if(index >= 0){
			int addNum = getInputInt(null, "��⵽ͼ����������鼮���������������");
			bookTotalNum[index] += addNum;
			bookRemainderNum[index] += addNum;
			System.out.println("��⵽ͼ����������鼮�����Զ���ӿ��");
		}else{
			createNewBookList(bookListLength + 1, bookListLength);
			bookId[bookListLength] = id;
			setBookInfo(bookListLength);
			bookListLength++;
		}
		System.out.println("ͼ�顶" + bookName[bookListLength-1] + "��������");
		return true;
	}
	
	/**
	 * 
	 * �������� setBookInfo ����һ�������Ϣ
	 * ����˵���� ��������û��Ԫ��ʱ�����������������Ҫ����id������Ԫ��ʱ������Ҫ��������id
	 * @param index  ��Ҫ���õ��±�
	 */
	public void setBookInfo(int index){
		//������ͷʱ
		if(index == 0){
			bookId[bookListLength] = getInputString(bookInfo[0], null);
		}
		bookName[index] = getInputString(bookInfo[1], null);
		bookAuthor[index] = getInputString(bookInfo[2], null);
		bookPublish[index] = getInputString(bookInfo[3], null);
		bookTotalNum[index] = getInputInt(bookInfo[4], null);
		bookRemainderNum[index] = getInputInt(bookInfo[5], null);;
		bookType[index] = getInputString(bookInfo[6], null);
	}
	
	/**
	 * 
	 * �������� deleteBook  ɾ�������е�һ�������Ϣ
	 * ����˵���� ����bookId, ���������е�Ԫ�أ�������ڣ���������ɾ����������ݣ�
	 *         ɾ��ʱ��Ҫ����moveBookList(int index)��������
	 *         Ԫ���ƶ���������createNewBookList(int newLength, int copyLength)���������鳤�Ƚ���
	 *         ��С
	 * @return ����true��false�Ƿ�ɾ���ɹ�
	 */
	public boolean deleteBook(){
		String id = getInputString(bookInfo[0], null);
		int index = findBookById(id);
		if(index >= 0){
			moveBookList(index);
			createNewBookList(bookListLength-1, bookListLength-1);
			bookListLength--;
			System.out.println("ͼ����Ϊ��" + bookId[index] + "ɾ���ɹ�");
			return true;
		}else{
			System.out.println("��ɾ����ͼ���Ų�����");
			return false;
		}
	}
	
	/**
	 * 
	 * �������� findBookByString  ͨ���ַ�������book��Ϣ
	 * ����˵���� ͨ������bookId����bookName�����飬�Լ��ַ�����Ϣ����������м���
	 * @param infoArray  ��Ҫ����������
	 * @param infoString �����ַ���
	 * 
	 * @return ���ز��ҵ������� index
	 */
	public int findBookByString(String[] infoArray, String infoString) {
		System.out.println(infoString);
		int index = -1;
		for (int i = 0; i < bookListLength; i++) {
			if(infoArray[i].equals(infoString)){
				index = i;
				break;
			}
		}
		return index;
	}
	
	/**
	 * 
	 * �������� findBookById  ͨ��bookId����book��Ϣ
	 * ����˵���� ͨ������findBookByString(String[] infoArray, String infoString)������bookId
	 *         ����
	 * @param id ��Ҫ��ѯ��bookId
	 * @return ���ز��ҵ������� index
	 */
	
	public int findBookById(String id){
		return findBookByString(bookId, id);
	}
	
	/**
	 * 
	 * �������� findBookByName  ͨ��bookName����book��Ϣ
	 * ����˵���� ͨ������findBookByString(String[] infoArray, String infoString)������bookName
	 *         ����
	 * @param name ��Ҫ��ѯ��bookName
	 * @return ���ز��ҵ������� index
	 */
	public int findBookByName(String name){
		return findBookByString(bookName, name);
	}
	
	/**
	 * 
	 * �������� findBookByAuthor  ͨ��bookAuthor����book��Ϣ
	 * ����˵���� ��������б������ҳ�������bookAuthor��ͬ��book��Ϣ
	 * @param authorName   ��Ҫ��ѯ��authorName
	 *
	 * @return ���ز��ҵ��������б� indexList
	 */
	public List<Integer> findBookByAuthor(String authorName){
		List<Integer> indexList = new ArrayList<Integer>();
		for (int i = 0; i < bookListLength; i++) {
			if(bookAuthor[i].equals(authorName)){
				indexList.add(i);
			}
		}
		return indexList;
	}
	
	/**
	 * 
	 * �������� modifyBook �޸�book��Ϣ
	 * ����˵���� ͨ��id��ȡ��book��Ϣ�����޸�
	 * @return ����true��false�Ƿ��޸ĳɹ�
	 */
	public boolean modifyBook(){
		String id = getInputString(bookInfo[0], null);
		int index = findBookById(id);
		if(index >= 0){
			System.out.println("ԭͼ����Ϣ���£�");
			printBook(index);
			setBookInfo(index);
			System.out.println("ͼ����" + bookId[index] + "�޸����");
			return true;
		}else{
			System.out.println("���޸ĵ�ͼ���Ų�����");
			return false;
		}
	}
	
	/**
	 * 
	 * �������� printBook  ��ӡһ������
	 * ����˵���� ͨ�������index ��ȡ����Ӧbook��Ϣ������ӡ��������
	 * @param index ��Ҫ��ӡ��book �������е�����λ��
	 */
	public void printBook(int index){
		System.out.println(bookInfo[0] + ":" + bookId[index] + " " + 
				bookInfo[1] + ":" + bookName[index] + " " + 
				bookInfo[2] + ":" + bookAuthor[index] + " " + 
				bookInfo[3] + ":" + bookPublish[index] + " " + 
				bookInfo[4] + ":" + bookTotalNum[index] + " " + 
				bookInfo[5] + ":" + bookRemainderNum[index] + " " + 
				bookInfo[6] + ":" + bookType[index]);
	}
	
	/**
	 * 
	 * �������� printBooks  ��ӡ����book����
	 * ����˵���� ͨ������������б� ��ȡ����Ӧbook��Ϣ������ӡ��������
	 * @param indexs  �����б���Ҫ��ӡ������book�������е�����λ�� 
	 */
	public void printBooks(List<Integer> indexs){
		for(int i : indexs){
			printBook(i);
		}
	}
	
	/**
	 * 
	 * �������� printBookList ��ӡ����������book��Ϣ
	 * ����˵������ӡ����������book��Ϣ
	 */
	public void printBookList(){
		for (int i = 0; i < bookListLength; i++) {
			printBook(i);
		}
	}
	
	/**
	 * 
	 * �������� getInputString  ��ȡһ���ַ�������
	 * ����˵���� ����2����ʾ�����ӡ��Ȼ��Ӽ��̻�ȡһ���ַ�������
	 * @param info ���������Ϣ
	 * @param other  ������Ҫ����ʾ��Ϣ
	 * @return ���شӼ��̽��յ����ַ���
	 */
	public String getInputString(String info, String other){
		printInfo(info, other);
		String value = sc.next();
		return value;
	}
	
	/**
	 * 
	 * �������� getInputInt  ��ȡһ����������
	 * ����˵����  ����2����ʾ�����ӡ��Ȼ��Ӽ��̻�ȡһ���������룬���������Ͳ�ƥ���쳣
	 * @param info ���������Ϣ
	 * @param other ������Ҫ����ʾ��Ϣ
	 * @return ���شӼ��̽��յ�������
	 */
	public int getInputInt(String info, String other){
		int value = 0;
		while(true){
			printInfo(info, other);
			try{
				value = sc.nextInt();
				break;
			}catch(InputMismatchException e){
				System.out.println("���벻ƥ�䣬����������");
				sc.next();
			}
		}
		return value;
	}
	
	/**
	 * 
	 * �������� getInputBoolean  ��ȡһ����������
	 * ����˵���� ����2����ʾ�����ӡ��Ȼ��Ӽ��̻�ȡһ���������룬���������Ͳ�ƥ���쳣
	 * @param info ���������Ϣ
	 * @param other ������Ҫ����ʾ��Ϣ
	 * @return ���شӼ��̽��յ��Ĳ���ֵ
	 */
	public boolean getInputBoolean(String info, String other){
		boolean value = false;
		while(true){
			printInfo(info, other);
			try{
				value = sc.nextBoolean();
				break;
			}catch(InputMismatchException e){
				System.out.println("���벻ƥ�䣬����������");
				sc.next();
			}
		}
		return value;
	}
	
	/**
	 * 
	 * �������� printInfo  �����ʾ��
	 * ����˵���� ���ݴ�����ʾ��Ĳ�ͬ�����ʾ����info��Ϊ�գ���������Ե���ʾ��
	 *  	   ���other��Ϊ�գ����һ����ʾ��
	 *       ���ǰ������Ϊ������� �������룺����ʾ���������ʾ��
	 * @param info ���������Ϣ
	 * @param other ������Ҫ����ʾ��Ϣ
	 */
	public void printInfo(String info, String other){
		if(info != null){
			System.out.println("������ͼ��" + info + ":");
		}else if(other != null){
			System.out.println(other);
		}else{
			System.out.println("�����룺");
		}
	}
	
	/**
	 * 
	 * �������� showMenu   ����Ŀ�ʼ�˵�
	 * ����˵���� �����������Ĵ��ڣ�չʾ��������й��ܣ���������Ӧ�ķ���
	 */
	public void showMenu(){
		while(true){
			System.out.println("************��ӭ����ͼ�����ϵͳ*************");
			System.out.println("*           1.��ѯͼ��                                                *");
			System.out.println("*           2.���ͼ��                                                *");
			System.out.println("*           3.ɾ��ͼ��                                                *");
			System.out.println("*           4.�޸�ͼ��                                                *");
			System.out.println("*           5.�鿴����ͼ��                                        *");
			System.out.println("*           6.�˳�ϵͳ                                                *");
			int index = getInputInt(null, null);
			switch (index) {
			case 1:
				selectMenu();
				break;
			case 2:
				addBook();
				break;
			case 3:
				deleteBook();
				break;
			case 4:
				modifyBook();
				break;
			case 5:
				printBookList();
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("��������");
				break;
			}
		}
	}
	
	/**
	 * 
	 * �������� selectMenu ��ѯ�Ĳ˵�
	 * ����˵�����Բ�ѯ�� ��ţ����������� ���в�ѯ��������Ӧ�ķ���
	 */
	public void selectMenu(){
		while(true){
			System.out.println("��ѡ���ѯ���ͣ�1.��� 2.���� 3.���� 4.������һ��");
			int num = getInputInt(null, null);
			String info = "";
			int type = 0;  // ǰ����
			int index = -1;
			List<Integer> indexs = null;
			switch(num){
			case 1:
				info = getInputString("���", null);
				index = findBookById(info);
				break;
			case 2:
				info = getInputString("����", null);
				index = findBookByName(info);
				break;
			case 3:
				info = getInputString("����", null);
				indexs = findBookByAuthor(info);
				type = 1;  // ����
				break;
			case 4:
				return;
			default:
				System.out.println("��������");
			}
			
			//���ַ���ֵ��һ�����Ƕ��
			if(type == 0){
				if (index >= 0) {
					printBook(index);
				}else{
					System.out.println("û�в�ѯ������");
				}
			}else{
				if(indexs != null){
					printBooks(indexs);
				}else{
					System.out.println("û�в�ѯ������");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		BookManager lb = new BookManager();
		lb.showMenu();
	}
}
