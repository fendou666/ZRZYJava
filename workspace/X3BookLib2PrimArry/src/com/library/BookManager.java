/**
 *   �������ƣ�ͼ�����ϵͳ��ͼ�������
 *   ����˵����ʵ��ͼ�����ϵͳ�� ������ɾ���ġ��顱 ���ܡ�
 *   �����ߣ�ChianSofti.java170207.lizm    2017��4��13�� ����7:15:14
 *   �����ߣ�
 *   
 *   
 */

package com.library;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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
	private Book[] bookAry;
	
	
	public BookManager(){
	
	}
	
	/**
	 * ����������ʾ���ж���<br>
	 * ������ѭ������bookAry�е�������
	 */
	public void showBooks(){
		for(Book b: bookAry){
			System.out.println(b);
		}
	}
	
	/**
	 * ��������ͨ��bookId�������Ƿ����<br>
	 * ������ͨ�����βε�bookId������bookAry�Ƚ�ȷ�������������
	 * @param bookId  ��Ҫ���ҵ�����
	 * 
	 * @return ����ֵ-1�������ڣ���������ֵ����Ż������������е�index
	 */
	public int seacheById(String bookId){
		int rec=0;
		boolean haveBookId = false;
		if (bookAry.length==0){
			rec = -1;
		}else{
			int bookIndex = 0;
			for (int i = 0; i < bookAry.length; i++) {
				if(bookAry[i].getBookId().equals(bookId)){
					haveBookId = true;
					bookIndex = i;
				}
			}
			rec = haveBookId ? bookIndex : -1;
		}
		return rec;
	}
	
	/**
	 * ������������� <br>
	 * ����������飬ֻ�Բ����ڵ��������ӣ�������������, <br>
	 * 		����飬����ǰ���������copyһ�����飬<br>
	 * 		���鳤�ȱ���ǰ�Ķ�һ��,Ȼ������������һ��Ԫ���ϸ�ֵ<br>
	 * 
	 * @param b ����Ҫ��ӵ���
	 * @return false ������Ӳ��ɹ������Ѿ����ڣ�<br>
	 * 		 	true  ������ӳɹ�
	 */
	
	public boolean addBook(Book b){
		boolean rec = false;
//		TODO �ο�������ô��
		if(bookAry==null){
			bookAry = new Book[]{b};
		}else if(seacheById(b.getBookId()) == -1){
			Book [] newAry = Arrays.copyOf(bookAry, bookAry.length+1);
			newAry[newAry.length-1] = b;
			bookAry = newAry;
			rec = true;
		}
		return rec;
	}
	
	/**
	 * ��������ɾ���� <br>
	 * ����������ID�ҵ�Ҫɾ������ <br>
	 * 		���û�����IDֱ�ӷ���false��<br>
	 * 		����ҵ��Ȿ�飬ͨ��Arrays.copyof ��ֵһ����ԭ����С1һ�����ȵ�������<br>
	 * 		Ȼ��(ͨ��System.arraycopy)��Ҫɾ�����λ�õĺ���Ĳ��ָ��Ƶ��µ�������<br>
	 * 
	 * @param bookId ����Ҫɾ�������ID
	 * @return false ����ɾ�����ɹ�(��ǰID������)��<br>
	 * 		 	true  ����ɾ���ɹ�
	 */
	public boolean delBook(String bookId){
		System.out.println("ɾ��ǰ����");
		showBooks();
		boolean rec = false;
		int index;
		if((index =seacheById(bookId)) == -1){
			System.out.println("��ID������");
			rec = false;
		}else {
			Book[] copyOf = Arrays.copyOf(bookAry, bookAry.length-1);
			System.arraycopy(bookAry, index+1, copyOf, index, bookAry.length-1-index);
			bookAry = copyOf;
			System.out.println("ɾ�������");
			showBooks();
			rec = true;
		}
		return rec;
	}
	
	/**
	 * �������������� <br>
	 * ����������ID�ҵ�Ҫ���µ��� <br>
	 * 		���û�����IDֱ�ӷ���false��<br>
	 * 		����ҵ��Ȿ�飬ֱ�Ӹ����ҵ�����ID��indexλ��ֱ�Ӹ�ֵ�µ���<br>
	 * 
	 * @param bookId ����Ҫ���µ����ID
	 * @param newBook ����Ҫ���º����
	 * @return false ������²��ɹ�(��ǰID������)��<br>
	 * 		 	true  ������³ɹ�
	 */
	public boolean updBook(String bookId, Book newBook){
		System.out.println("ɾ��ǰ����");
		showBooks();
		boolean rec = false;
		int index;
		if((index =seacheById(bookId)) == -1){
			System.out.println("��ID������");
			rec = false;
		}else {
			bookAry[index] = newBook;
			rec = true;
		}
		return rec;
	}
	
	
	public static void main(String[] args) {
		
	}
}
