package A1BasicArray;

import java.util.Scanner;



public class Main {
//	总变量
	// 用户变量，以下3个变量数组长度要一样
	private String [] user; // 所有用户，包括管理员
	private String [] pwd; // 每个用户的密码
	private String [] userType; // 用户类型[管理员，普通用户]，对应用户数组用每一个用户的用户类型
	// 当前用户位置变量
	private int currentUser; //当前登陆的用户在数组的中位置，以便统一操作，添加书等等, 不可超过user长度
	// 其他
	Scanner input = new Scanner(System.in);
	
//	用户变量 TODO 看别人此处怎么定义
	private String [] userBook; // 每个用户对应的已经借阅的书
//	管理员变量
	//所有书的变量
	String [] bookNum; // 书的编号
	String [] bookName; // 书的名字
	String [] bookAuthor; // 书的作者
	String [] bookPress; // 书的出版社
	int    [] bookToutle; // 书的总数量
	int    [] bookBorrowOutCount; //书的借出数量
	int    [] bookResidueCount; //书的剩余数量
	String [] bookUsers; // 已经借出去对应的用户
	String [] bookLog; // 书的借阅记录  TODO
//	String [] bookStatus; //书是否可借阅
	// 书的管理
//	String [] bookSign; // 书是否被删除了
	
	public Main(){
		initUser(); // 总初始化
		initUserBookInfo(); // 用户书初始化
		initBook(); // 管理员变量书的初始化
	}
	
//	总界面（既是用户也是管理员）
	public void firstPage(){
		System.out.println("1. 登陆");
		System.out.println("2. 退出");
		System.out.println("请输入:");
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
		System.out.println("请以这种方式输入用户名密码: 用户名_密码");
		String str = input.next();
		String [] strAry = str.split("_");
		
		for (int i =0 ; i< user.length; i++) {
			if (user[i]==null){
				break;
			}
			if (strAry[0].equals(user[i]) && strAry[1].equals(pwd[i])){
				
				if (userType[i].equals("admin")) {
//					进入管理页面
					adminUI();
				}else {
//					进入用户界面
					userUI();
				}
				currentUser = i;
				return;
			}
		}
 		System.out.println("输入错误重新输入");
 		login();
	}
	
//	总方法
	//总初始化	
	public void initUser(){
		user     = 	new String []{"admin", "user1"};
		pwd  	 = 	new String []{"admin", "123"};
		userType = 	new String []{"admin", "user"};
		
	}
	//用户数据初始化
	public void initUserBookInfo(){
		userBook = 	new String []{null, null};
	}
	
	//管理员数据初始化
	public void initBook(){
		bookNum       = 	new String []{"0001","0002"}; // 书的编号
		bookName      = 	new String []{"红楼梦","人民的名义"}; // 书的名字
		bookAuthor    = 	new String []{"曹雪芹","周梅森"}; // 书的作者
		bookPress     = 	new String []{"西安交通大学出版社","中国人民出版社"}; // 书的出版社
		bookToutle    = 	new int []{100,100}; // 书的总数量
		bookBorrowOutCount = new int []{0,0}; //书的借出数量
		bookResidueCount = 	new int []{100,100}; //书的剩余数量
		bookUsers = 		new String []{null,null}; // 已经借出去对应的用户
//		bookLog = 			new String []{"0001","0002"};  // 书的借阅记录  TODO
	}
	
//	用户界面
	public void userUI(){
		System.out.println("1. 借书");
		System.out.println("2. 还书");
		System.out.println("3. 已拥有的书");
		System.out.println("4. 借书记录");
		System.out.println("5. 返回");
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
			System.out.println("输入错误重新选择");
		}
	}
//	借书	
	public void getBookUI(){
		System.out.println("请以这种格式输入: 书编号_借阅数量");
		String bookStr = input.next();
		String [] book = bookStr.split("_");
		getBook(book[0], Integer.parseInt(book[1]));
		System.out.println("继续借书，输入1");
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
								"书编号：" + bookNum[bookIndex] +
								"书名：" + bookName[bookIndex] +
								"作者：" + bookAuthor[bookIndex] +
								"出版社：" + bookPress[bookIndex] +
								"书数量：" + count + "\n";
//			已借出数量 
			bookBorrowOutCount[bookIndex] += count;  
//			剩余数量 
			bookResidueCount[bookIndex] -= count;
//			书借阅记录添加
			bookUsers[bookIndex] = bookUsers[bookIndex]==null
									?"":bookUsers[bookIndex]
									+ "user" +currentUser  // 哪个用户
									+  "_" + count +","; //借了基本书
//			用户的借阅记录添加
			userBook[currentUser] =  userBook[currentUser]==null
									?"":userBook[currentUser]
									+  bookNumStr + "_" + count +",";
			// TODO 总借阅记录添加
//			bookUsers[bookIndex] = bookUsers[bookIndex]==null
//					?"":bookUsers[bookIndex]
//					+ "user" +currentUser  // 哪个用户
//					+ bookNumStr + "_" + count +","; //借的书编号
		}else {
			if (bookIndex == -1){
				System.out.println("书编号不存在");
			}else{
				System.out.println("输入数量超过已有数量");
			}
		}
	}
	public void returnBookUI(){
//		System.out.println("请以这种格式输入: 书编号_还书数量");
//		System.out.println("继续换书，输入1");
//		if (input.nextInt()==1) {
//			returnBookUI();
//		}else {
//			return;
//		}
		
//		TODO 暂时还书指还掉所有书
		int bookIndex = 0;
		int count = 0;
		for (String bookStr: userBook[currentUser].split(",")) {
			String [] book = bookStr.split("_");
//			TODO 如果书被删除了怎么办
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
		System.out.println("暂时没写");
	}
//	用户操作的方法
	
//	管理员界面
	public void adminUI(){
		System.out.println("\t\t管理员");
		System.out.println("1: 查询读书");
		System.out.println("2: 增加读书");
		System.out.println("3: 删除读书");
		System.out.println("4: 修改读书信息");
		System.out.println("5: 读书借阅记录");
		System.out.println("6: 返回");
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
			System.out.println("暂时不写");
			break;
		case 6:
			break;
		default:
			System.out.println("输入错误，重新输入");
			adminUI();
		}
	}
//	管理员方法
//	显示所有读书
	public void showAllBook(){
		for (int i=0; i<bookNum.length; i++) {
			if (bookNum == null){
				break;
			}
			System.out.println("书编号：" + bookNum[i] +
								"书名：" + bookName[i] +
								"作者：" + bookAuthor[i] +
								"出版社：" + bookPress[i] +
								"书总数量：" + bookToutle[i] +
								"已借出数量：" + bookBorrowOutCount[i] +
								"剩余数量：" + bookResidueCount[i] +
								"所有接触人：" + bookUsers[i] +
								"书的借阅记录：" + bookLog[i]
					);
		}
	}
//	查询读书
	public void queryBook(){
		System.out.println("请输入书的编号：");
		String bookNumStr = input.next();
		int bookIndex = haveTheBook(bookNumStr);
		if(bookIndex!=-1){
			
		}else{
			System.out.println("输入编号有误");
			queryBook();
		}
	}
//	增加读书
	public void addBook(){
		System.out.println("请输入书的编号:");
		String bookNumStr = input.next();
		if (haveTheBook(bookNumStr)!=-1) {
			System.out.println("这个书编号已经存在");
			addBook();
			return;
		}
		System.out.println("请以这种格式添加书:书名_作者_出版社_书总数量");
		String bookStr = input.next();
		String [] bookProperties = bookStr.split("_");
//		TODO 另一种方式定义一个变量记录已经添加的书的位置，一直只需要直接在位置后添加
		for (int i=0;i<bookNum.length;i++) {
			if (bookNum[i] == null) {
				bookName[i] = bookProperties[0];
				bookAuthor[i] = bookProperties[1];
				bookPress[i] = bookProperties[2];
				bookToutle[i] = Integer.parseInt(bookProperties[3]);
				bookBorrowOutCount[i] = 0; // 可以不写
				bookResidueCount[i] = bookToutle[i];
				bookUsers[i] = null; // 可以不写
				bookLog[i] = null; // 可以不写
			}
		}
	}
//	书位置查找，如果书不存在返回-1, 存在返回书的位置
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
	
//	删除读书
	public void delBook(){
		System.out.println("暂时没想到怎么做");
	}
//	修改读书信息
	public void changeBookInfo(){
		System.out.println("请输入要修改的书号：");
		String bookNumStr = input.next();
		int bookChangeIndex = 0;
		while((bookChangeIndex=haveTheBook(bookNumStr))!=-1){
			System.out.println("输入的编号不存在，重新输入");
			bookNumStr = input.next();
		}
//		更改对应的信息
		while (true) {
			System.out.println("选择要修改的信息");
			System.out.println("1:书名");
			System.out.println("2:作者");
			System.out.println("3:出版社");
			System.out.println("4:总数量");
			System.out.println("5:退出");
			switch(input.nextInt()){
			case 1:
				System.out.println("请输入更改后的书名：");
				bookName[bookChangeIndex] =input.next();
				break;
			case 2:
				System.out.println("请输入更改后的作者：");
				bookAuthor[bookChangeIndex] =input.next();
				break;
			case 3:
				System.out.println("请输入更改后的出版社：");
				bookPress[bookChangeIndex] =input.next();
				break;
			case 4:
				System.out.println("请输入更改后的书的总量：");
				bookToutle[bookChangeIndex] =input.nextInt();
				bookResidueCount[bookChangeIndex] = bookToutle[bookChangeIndex] 
													- bookBorrowOutCount[bookChangeIndex];
				break;
			case 5:
				break;
			default:
				System.out.println("输入错误");
			}
		}
	}
	
//	读书借阅记录, 按时间的借书还书记录日志
	public void timeBookLog(){
		System.out.println("暂时不做");
	}
	
	public static void main(String[] args) {
//		总变量
//		用户变量
//		管理员变量
		Main m = new Main();
		m.firstPage();
		
	}
	
}
