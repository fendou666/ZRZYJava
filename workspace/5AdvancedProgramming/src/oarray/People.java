package oarray;

public class People {
	private  int id;//��ϵ��id
    private String name;//��ϵ������
    private String pass;//��ϵ������
    private  String num;//��ϵ�˵绰
    public People(int id,String name,String pass,String num){
	     this.id=id;
	     this.name=name;
	     this.pass=pass;
	     this.num=num;
	 }
	 public int getId() {
	     return id;
	 }
	 public void setId(int id) {
	     this.id = id;
	 }
	 public String getName() {
	     return name;
	 }
	 public void setName(String name) {
	     this.name = name;
	 }
	 public String getPass() {
	     return pass;
	 }
	 public void setPass(String pass) {
	     this.pass = pass;
	 }
	 public String getNum() {
	     return num;
	 }
	 public void setNum(String num) {
	     this.num = num;
	 }
	
	
}
