package com.chinasofti.po;

public class Position {

	// ����
	private String area;
	// ���Ի���
	private int id;
	// ��ǰλ�õ��û�
	private User use;
	// ��ǰλ��״̬(Ĭ��û�����ϻ�)
	private boolean used = false;
	// cpu
	private String cpu;
	// �����Կ�
	private String graphicsCard;
	// �����ڴ��С
	private String memoryCapacity;
	// ������ʾ��Ӣ��
	private String inchMonitor;
	// ɳ��
	private String sofa;
	
	
	public Position() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Position(String area, int id) {
		this.area = area;
		this.id = id;
		inchMonitor = "27��";
		if (area == "������") {
			cpu = "i3-6100";
			graphicsCard = "gtx550ti";
			memoryCapacity = "4g";
			sofa = "��ͨɳ��";
		}
		if (area == "��Ϸ��") {
			cpu = "i5-7600k";
			graphicsCard = "gtx660ti";
			memoryCapacity = "8g";
			sofa = "�߼�����ɳ��";
		}
		if (area == "����") {
			cpu = "i7-6700k";
			graphicsCard = "gtx980ti";
			memoryCapacity = "16g";
			sofa = "��˯����ɳ��";
			
		}
	}
	
	



	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUse() {
		return use;
	}

	public void setUse(User use) {
		this.use = use;
	}

	public boolean isUsed() {
		return used;
	}

	public void setUsed(boolean used) {
		this.used = used;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getGraphicsCard() {
		return graphicsCard;
	}

	public void setGraphicsCard(String graphicsCard) {
		this.graphicsCard = graphicsCard;
	}

	public String getMemoryCapacity() {
		return memoryCapacity;
	}

	public void setMemoryCapacity(String memoryCapacity) {
		this.memoryCapacity = memoryCapacity;
	}

	public String getInchMonitor() {
		return inchMonitor;
	}

	public void setInchMonitor(String inchMonitor) {
		this.inchMonitor = inchMonitor;
	}

	public String getSofa() {
		return sofa;
	}

	public void setSofa(String sofa) {
		this.sofa = sofa;
	}

	public String areaInfo() {
		return "���������" + area + ", cpuΪ" + cpu
				+ ", �Կ�" + graphicsCard + ", �ڴ�"
				+ memoryCapacity + ", ��ʾ��" + inchMonitor 
				+ ", ɳ����" + sofa;
	}
	@Override
	
//	public String toString() {
//		return "ѡ������ [area=" + area + ", id=" + id + ", cpu=" + cpu
//				+ ", graphicsCard=" + graphicsCard + ", memoryCapacity="
//				+ memoryCapacity + ", inchMonitor=" + inchMonitor + ", sofa="
//				+ sofa + "]";
//	}
	public String toString() {
		return "ѡ������" + area + ", ����" + id;
	}
}
