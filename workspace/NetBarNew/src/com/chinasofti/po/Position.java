package com.chinasofti.po;

public class Position {

	// 区域
	private String area;
	// 电脑机号
	private int id;
	// 当前位置的用户
	private User use;
	// 当前位置状态(默认没有人上机)
	private boolean used = false;
	// cpu
	private String cpu;
	// 电脑显卡
	private String graphicsCard;
	// 电脑内存大小
	private String memoryCapacity;
	// 电脑显示器英寸
	private String inchMonitor;
	// 沙发
	private String sofa;
	
	
	public Position() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Position(String area, int id) {
		this.area = area;
		this.id = id;
		inchMonitor = "27寸";
		if (area == "休闲区") {
			cpu = "i3-6100";
			graphicsCard = "gtx550ti";
			memoryCapacity = "4g";
			sofa = "普通沙发";
		}
		if (area == "游戏区") {
			cpu = "i5-7600k";
			graphicsCard = "gtx660ti";
			memoryCapacity = "8g";
			sofa = "高级软舒沙发";
		}
		if (area == "包间") {
			cpu = "i7-6700k";
			graphicsCard = "gtx980ti";
			memoryCapacity = "16g";
			sofa = "舒睡高软沙发";
			
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
		return "这个区域是" + area + ", cpu为" + cpu
				+ ", 显卡" + graphicsCard + ", 内存"
				+ memoryCapacity + ", 显示器" + inchMonitor 
				+ ", 沙发是" + sofa;
	}
	@Override
	
//	public String toString() {
//		return "选定机号 [area=" + area + ", id=" + id + ", cpu=" + cpu
//				+ ", graphicsCard=" + graphicsCard + ", memoryCapacity="
//				+ memoryCapacity + ", inchMonitor=" + inchMonitor + ", sofa="
//				+ sofa + "]";
//	}
	public String toString() {
		return "选定区域" + area + ", 机号" + id;
	}
}
