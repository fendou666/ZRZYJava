package basic_20170214practice;

public class A2FoodPeopleAmount {

	private int FoodAmount;
	private byte perCapitaFoodAmount;
	private int personAmount;
	
	public A2FoodPeopleAmount(int FoodAmount, byte perCapitaFoodAmount){
		this.FoodAmount = FoodAmount;
		this.perCapitaFoodAmount = perCapitaFoodAmount;
		this.personAmount = FoodAmount/perCapitaFoodAmount;
	}
	
	
	public int getFoodAmount(){
		return FoodAmount;
	}
	public void setFoodAmount(int FoodAmount){
		this.FoodAmount = FoodAmount; 
	}
	public byte getPerCapitaFoodAmout(){
		return perCapitaFoodAmount;
	}
	public void setPerCapitaFoodAmount(byte perCapitaFoodAmount){
		this.perCapitaFoodAmount = perCapitaFoodAmount;
		
	}
	public int getPersonAmount(){
		return personAmount;
	}
	public void setPersonAmount(int personAmount){
		this.personAmount = personAmount;
	}

}
