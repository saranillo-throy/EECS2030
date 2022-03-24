package practice;
class D {
	protected int maxLifeTime;
	public D() {
		maxLifeTime = 0;
		System.out.println("Plant: default");
	}
	public D(int lifeTime) {
		maxLifeTime = lifeTime;
		System.out.println("Plant: overloaded");
	}
}

class Vegetable extends D{
	String name;
	int plantSeason;
	int harvestSeason;
	public Vegetable() {
		name = null;
		plantSeason = 0;
		harvestSeason = 0;
		System.out.println("Vegetable: default");
	}
	public Vegetable(String na, int plant, int harvest) {
		super(5);
		name = na;
		plantSeason = plant;
		harvestSeason = harvest;
		System.out.println("Vegetable: Overloaded");
	}
	public Vegetable(Vegetable veg) {
		
		System.out.println("Vegetable: Copy");
	}
}

final class RootVegetable extends Vegetable{
	String type;
	public RootVegetable (String tp, String na, int plant, int harvest) {
		super(na, plant, harvest);
		type = tp;
		System.out.println("RootVegeatble: Overloaded");
	}
}