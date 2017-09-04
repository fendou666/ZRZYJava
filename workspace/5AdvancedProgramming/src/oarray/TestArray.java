package oarray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//主函数
public class TestArray {
      public static ArrayList<People> AL=new ArrayList<People>(); //声明这个容器来存放数据
      Scanner Sc=new Scanner(System.in);
      public void show(){
          System.out.println("欢迎进入主界面：请在下面的功能中选择你要的操作：");
          System.out.println("1、注册一个用户（可以用注册的用户登录）");
          System.out.println("2、查询所有人");
          System.out.println("3、删除麽个人");
          System.out.println("4、对哪个人的信息进行修改\n");
          System.out.println("输入（1~4）以内的一个数子");
      }
      public static boolean login(String name,String pass){
         
            if(name.equals("admin")&&pass.equals("123")){
                System.out.println("登陆成功!");
                return false;
               
            }else{
                System.out.println("登陆失败，请重新输入！");
                return true;
            }
         
      }
     
      //添加一个人(可以用注册的用户登录)
      public void Insert(){
          System.out.println("添加新的用户");
          System.out.println("联系人的id：");
          int id=Sc.nextInt();
          System.out.println("联系人的姓名：");
          String name=Sc.next();
          System.out.println("联系人的密码：");
          String pass=Sc.next();
          System.out.println("联系人的电话：");
          String num=Sc.next();
                   
          //输出新联系人的信息
          System.out.println("Id: "+id);
          System.out.println("用户名："+name);
          System.out.println("密码:"+pass);
          System.out.println("电话："+num);
          People Pe=new People(id,name,pass,num);
          AL.add(Pe);
      }
     
      //查询所有人
      public void Select(){
          System.out.println("id"+"\t用户名"+"\t密码"+"\t电话");
          Iterator it=AL.iterator();
          while(it.hasNext()){
              People Pe=(People) it.next();
              System.out.println(Pe.getId()+"\t"+Pe.getName()+"\t"+Pe.getPass()+"\t"+Pe.getNum());
          }
      }
     
      //删除么个人
      public void Delect(){
          System.out.println("请输出你要删除的Id：");
          int id=Sc.nextInt();
          Iterator it=AL.iterator();
          while(it.hasNext()){
              People Pe=(People) it.next();
              if(Pe.getId()==id){
                  AL.remove(Pe);
                  System.out.println("删除成功！");
              }
          }
      }
      public void Delect2(){
          System.out.println("请输出你要删除的Id：");
          int id=Sc.nextInt();
          Iterator it=AL.iterator();
          int position = -1;
          while(it.hasNext()){
              People Pe=(People) it.next();
              if(id == Pe.getId()){
                  position = AL.indexOf(Pe);
              }
              }
          if(position != -1){
                 AL.remove(position);

                 System.out.println("删除成功！") ;
          }
      }
     
      //修改么个人信息
      public void Update(){
          System.out.println("请输出你要修改联系人的Id：");
          int id=Sc.nextInt();
          Iterator it=AL.iterator();
          while(it.hasNext()){
              People Pe=(People)it.next();
              if(Pe.getId()==id){
                  AL.remove(Pe);
                  System.out.println("修改前的姓名："+Pe.getName());
                  System.out.println("修改前的密码："+Pe.getPass());
                  System.out.println("修改前的电话："+Pe.getNum());
                  System.out.println("请输入修改后的姓名：");
                  String name=Sc.next();
                  System.out.println("请输入修改后的密码：");
                  String pass=Sc.next();
                  System.out.println("请输入修改后的电话：");
                  String num=Sc.next();
                  People pe=new People(id,name,pass,num);
                  AL.add(pe);
                  System.out.println("修改成功");
              }
          }     
      }
      public static void main(String[] args) {
        //创建Scanner流
          String name=null;
          String pass=null;
          Scanner sc=new Scanner(System.in);
          do{
              System.out.println("请在下面输入用户名和密码");
              System.out.println("请输入用户名:");
              name=sc.nextLine();
              System.out.println("请输入密码:");
              pass=sc.nextLine();
              System.out.println("你输入的用户名和密码为：");
              System.out.println("用户名："+name);
              System.out.println("密码:"+pass);
          }while(login(name,pass));//调用login传递控制台输入的用户名好密码
         
          //主页面
          TestArray main=new TestArray();
         
          do{
              main.show();
              int num=sc.nextInt();
              switch(num){
              case 1:main.Insert();break;
              case 2:main.Select();break;
              case 3:main.Delect();break;
              case 4:main.Update();break;
              default :System.out.println("输入有误，请重新输入！");
              }
              System.out.println("请输入（true/false）是否继续运行程序：");
          }while(sc.nextBoolean());
          System.out.println("程序结束");
    }
}


 