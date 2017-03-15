package o20170227;

public class A1Clothes {
	private String season;
	private String color;
	private String type;
	
	public A1Clothes() {
		// TODO Auto-generated constructor stub
	}
	public A1Clothes(String season, String color, String type) {
		this.season = season;
		this.color = color;
		this.type = type;
	}
	
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	public String toString() {
		return  "这件" + type +"衣服是" + season + "穿的" + "颜色是" + color;
	}
}
