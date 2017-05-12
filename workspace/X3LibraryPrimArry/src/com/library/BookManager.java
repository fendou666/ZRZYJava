/**
 *   程序名称：图书管理系统，图书馆理类
 *   功能说明：实现图书管理系统的 “增、删、改、查” 功能。
 *   做成者：ChianSofti.java170207.lizm    2017年4月13日 下午7:15:14
 *   更新者：
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
 *   类名称：BookManager  图书管理类
 *   类说明：对图书信息管理的类，里面集成了增删改查的方法
 *   做成者：ChianSofti.java170207.lizm    2017年4月13日 下午7:15:14
 *   更新者：
 *   
 *
 */
public class BookManager {
	private Book[] bookAry;
	
	/**
	 * 方法名：通过bookId查找书是否存在<br>
	 * 描述：通过将形参的bookId与书库存bookAry比较确定存在这个书编号
	 * @param bookId  需要查找的书编号
	 * 
	 * @return 返回值-1代表不存在，返回其他值代表放回书编号在数组中的index
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
	 * 方法名：添加书 <br>
	 * 描述：添加书，只对不存在的书进行添加，如果存在则不添加, <br>
	 * 		添加书，将以前的书库重新copy一个数组，<br>
	 * 		数组长度比以前的多一个,然后在数组的最后一个元素上赋值<br>
	 * 
	 * @param b 代表要添加的书
	 * @return false 代表添加不成功，书已经存在，<br>
	 * 		 	true  代表添加成功
	 */
	
	public boolean addBook(Book b){
		boolean rec = false;
		if(seacheById(b.getBookId()) == -1){
			Book [] newAry = Arrays.copyOf(bookAry, bookAry.length+1);
			newAry[newAry.length-1] = b;
			bookAry = newAry;
			rec = true;
		}
		return rec;
	}
	
	public boolean delBook(String bookId){
		boolean rec = false;
		int index;
		if((index =seacheById(bookId)) == -1){
			System.out.println("书ID不存在");
			rec = false;
		}else {
			
			System.arraycopy(src, srcPos, dest, destPos, length);
			
		}
		return rec;
	}
	
	public static void main(String[] args) {
		
	}
}
