package o20170303;

import java.io.Serializable;
// 假设一个学生类
public class ObjectBase implements Serializable {
	
	private int stuId;
	private String classNum;
	private String name;
	
	public ObjectBase() {
		
	}
	public ObjectBase(int stuId, String classNum, String name) {
		super();
		this.stuId = stuId;
		this.classNum = classNum;
		this.name = name;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getClassNum() {
		return classNum;
	}
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "ObjectBase [stuId=" + stuId + ", classNum=" + classNum
				+ ", name=" + name + "]";
	}
	
}
