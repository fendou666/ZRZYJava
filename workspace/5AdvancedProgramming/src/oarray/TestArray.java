package oarray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//������
public class TestArray {
      public static ArrayList<People> AL=new ArrayList<People>(); //��������������������
      Scanner Sc=new Scanner(System.in);
      public void show(){
          System.out.println("��ӭ���������棺��������Ĺ�����ѡ����Ҫ�Ĳ�����");
          System.out.println("1��ע��һ���û���������ע����û���¼��");
          System.out.println("2����ѯ������");
          System.out.println("3��ɾ�������");
          System.out.println("4�����ĸ��˵���Ϣ�����޸�\n");
          System.out.println("���루1~4�����ڵ�һ������");
      }
      public static boolean login(String name,String pass){
         
            if(name.equals("admin")&&pass.equals("123")){
                System.out.println("��½�ɹ�!");
                return false;
               
            }else{
                System.out.println("��½ʧ�ܣ����������룡");
                return true;
            }
         
      }
     
      //���һ����(������ע����û���¼)
      public void Insert(){
          System.out.println("����µ��û�");
          System.out.println("��ϵ�˵�id��");
          int id=Sc.nextInt();
          System.out.println("��ϵ�˵�������");
          String name=Sc.next();
          System.out.println("��ϵ�˵����룺");
          String pass=Sc.next();
          System.out.println("��ϵ�˵ĵ绰��");
          String num=Sc.next();
                   
          //�������ϵ�˵���Ϣ
          System.out.println("Id: "+id);
          System.out.println("�û�����"+name);
          System.out.println("����:"+pass);
          System.out.println("�绰��"+num);
          People Pe=new People(id,name,pass,num);
          AL.add(Pe);
      }
     
      //��ѯ������
      public void Select(){
          System.out.println("id"+"\t�û���"+"\t����"+"\t�绰");
          Iterator it=AL.iterator();
          while(it.hasNext()){
              People Pe=(People) it.next();
              System.out.println(Pe.getId()+"\t"+Pe.getName()+"\t"+Pe.getPass()+"\t"+Pe.getNum());
          }
      }
     
      //ɾ��ô����
      public void Delect(){
          System.out.println("�������Ҫɾ����Id��");
          int id=Sc.nextInt();
          Iterator it=AL.iterator();
          while(it.hasNext()){
              People Pe=(People) it.next();
              if(Pe.getId()==id){
                  AL.remove(Pe);
                  System.out.println("ɾ���ɹ���");
              }
          }
      }
      public void Delect2(){
          System.out.println("�������Ҫɾ����Id��");
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

                 System.out.println("ɾ���ɹ���") ;
          }
      }
     
      //�޸�ô������Ϣ
      public void Update(){
          System.out.println("�������Ҫ�޸���ϵ�˵�Id��");
          int id=Sc.nextInt();
          Iterator it=AL.iterator();
          while(it.hasNext()){
              People Pe=(People)it.next();
              if(Pe.getId()==id){
                  AL.remove(Pe);
                  System.out.println("�޸�ǰ��������"+Pe.getName());
                  System.out.println("�޸�ǰ�����룺"+Pe.getPass());
                  System.out.println("�޸�ǰ�ĵ绰��"+Pe.getNum());
                  System.out.println("�������޸ĺ��������");
                  String name=Sc.next();
                  System.out.println("�������޸ĺ�����룺");
                  String pass=Sc.next();
                  System.out.println("�������޸ĺ�ĵ绰��");
                  String num=Sc.next();
                  People pe=new People(id,name,pass,num);
                  AL.add(pe);
                  System.out.println("�޸ĳɹ�");
              }
          }     
      }
      public static void main(String[] args) {
        //����Scanner��
          String name=null;
          String pass=null;
          Scanner sc=new Scanner(System.in);
          do{
              System.out.println("�������������û���������");
              System.out.println("�������û���:");
              name=sc.nextLine();
              System.out.println("����������:");
              pass=sc.nextLine();
              System.out.println("��������û���������Ϊ��");
              System.out.println("�û�����"+name);
              System.out.println("����:"+pass);
          }while(login(name,pass));//����login���ݿ���̨������û���������
         
          //��ҳ��
          TestArray main=new TestArray();
         
          do{
              main.show();
              int num=sc.nextInt();
              switch(num){
              case 1:main.Insert();break;
              case 2:main.Select();break;
              case 3:main.Delect();break;
              case 4:main.Update();break;
              default :System.out.println("�����������������룡");
              }
              System.out.println("�����루true/false���Ƿ�������г���");
          }while(sc.nextBoolean());
          System.out.println("�������");
    }
}


 