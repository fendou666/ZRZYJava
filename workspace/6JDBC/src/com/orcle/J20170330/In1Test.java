package com.orcle.J20170330;

import java.util.List;

public class In1Test {
	public static void main(String[] args) throws Exception {
		In1StudentDao sd = new In1StudentDao();

		
//		��������
//		��������
//		In1Student s = new In1Student(22,"С��", "��", "6�����");
//		int count = sd.insterStudent(s);
//		if(count<0){
//			System.out.println("��������ʧ��");
//		}else{
//			System.out.println(count);
//			System.out.println("�������ݳɹ�");
//		}
//		��������
//		In1Student s = new In1Student(22,"�����", "��", "��ɽ����");
//		int count = sd.updateStudent(s);
//		if(count<0){
//			System.out.println("��������ʧ��");
//		}else{
//			System.out.println(count);
//			System.out.println("�������ݳɹ�");
//		}
//		ɾ������
//		In1Student s = new In1Student(22,"С��", "��", "6�����");
//		int count = sd.deleteStudent(s);
//		if(count<0){
//			System.out.println("ɾ������ʧ��");
//		}else{
//			System.out.println(count);
//			System.out.println("ɾ�����ݳɹ�");
//		}
		
		
//		��ѯ����
		List<In1Student> stuAry = sd.selectStudent();
		for(In1Student stu: stuAry){
			System.out.println(stu);
		}
		if(sd == null){
			System.out.println("��ѯʧ��");
		}else{
			System.out.println("��ѯ�ɹ�");
		}
		
		
	}
}