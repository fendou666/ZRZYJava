package com.liushuai.netbar.manager;

public class Positions {
	
	private Member [] members = new Member[100];
	//
	public Positions(){
		System.out.println("��֧�����ֵ��÷�ʽ");
	}
	// ״̬��������״̬������
	public Positions(String [][] area){
		for (int i=0; i<members.length; i++) {
			// (λ�ö�����)area�������� id������Ի���
			if (i< Integer.parseInt(area[0][1])) {
				members[i] = new Member(area[0][0], i+1, "����");
			} else if (i<Integer.parseInt(area[1][1])) {
				members[i] = new Member(area[1][0], i+1, "����");
			} else {
				members[i] = new Member(area[2][0], i+1, "����");
			}
		}
	}
	
	public Member[] getPositions() {
		return members;
	}
	 
}
