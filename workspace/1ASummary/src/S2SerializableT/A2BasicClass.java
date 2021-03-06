package S2SerializableT;

import java.io.Serializable;
import java.util.Date;

public class A2BasicClass implements Serializable {
	private String city;
	private Date dateTime;
	private double averagePM;
	private double maxPM;
	public A2BasicClass(String city, Date dateTime, double averagePM,
			double maxPM) {
		super();
		this.city = city;
		this.dateTime = dateTime;
		this.averagePM = averagePM;
		this.maxPM = maxPM;
	}
	public A2BasicClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public double getAveragePM() {
		return averagePM;
	}
	public void setAveragePM(double averagePM) {
		this.averagePM = averagePM;
	}
	public double getMaxPM() {
		return maxPM;
	}
	public void setMaxPM(double maxPM) {
		this.maxPM = maxPM;
	}
	
	
	@Override
	public String toString() {
		return "A2BasicClass [city=" + city + ", dateTime=" + dateTime
				+ ", averagePM=" + averagePM + ", maxPM=" + maxPM + "]";
	}
	
	
	
}
