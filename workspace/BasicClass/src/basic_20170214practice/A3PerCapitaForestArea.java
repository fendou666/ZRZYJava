package basic_20170214practice;

public class A3PerCapitaForestArea {
	private int forestArea;
	private int peopleAmount;
	private int perCapitaForestArea;
	
	public A3PerCapitaForestArea(int forestArea, int peopleAmount){
		this.forestArea = forestArea;
		this.peopleAmount = peopleAmount;
		this.perCapitaForestArea = forestArea/peopleAmount;
	}
	
	public int getForestArea(){
		return forestArea;
	}
	public void setForestArea(int forestArea){
		this.forestArea = forestArea;
	}
	public int getPeopleAmount(){
		return peopleAmount;
	}
	public void setPeopleAmount(int peopleAmount){
		this.peopleAmount = peopleAmount;
	}
	public int getPerCapitaForestArea(){
		return perCapitaForestArea;
	}
	
}
