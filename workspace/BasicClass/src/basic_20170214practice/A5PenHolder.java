package basic_20170214practice;

public class A5PenHolder {
 	private float size;
	private String color;
	private int penAmount;
	private String material;
	
	public A5PenHolder(float size, String color, int PenAmount, String material){
		this.size = size;
		this.color = color;
		this.penAmount = penAmount;
		this.material = material;
	}
	
	
	public float getSize() {
		return size;
	}


	public void setSize(float size) {
		this.size = size;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getPenAmount() {
		return penAmount;
	}


	public void setPenAmount(int penAmount) {
		this.penAmount = penAmount;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public boolean penHolderCompare(A5PenHolder anotherPenHolder){
		
		if (size == anotherPenHolder.size) {
			
			if (color.equals(anotherPenHolder.color)) {
				
				if (penAmount == anotherPenHolder.penAmount) {
					
					if (material.equals(anotherPenHolder.material)) {
						return true;
					} else {
						return false;
					}
					
				} else {
					return false;
				}
				
			} else {
				return false;
			}
			
		}else {
			return false;
		}
	}
	
}
