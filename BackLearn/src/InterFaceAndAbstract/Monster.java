package InterFaceAndAbstract;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
	private String name;
	private int hitPoints;
	private int strength;

	public Monster(String name, int hitPoints, int strength) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
	}
	
	public String getName() {
		return name;
	}

	public int getHitPoints() {
		return hitPoints;
	}
	
	public int getStrength() {
		return strength;
	}

	@Override
	public List<String> write() {
		// TODO Auto-generated method stub
		List<String>values = new ArrayList<String>();
		values.add(0, this.name);
		values.add(1, ""+this.hitPoints);
		values.add(2, ""+this.strength);
		return values;
	}

	@Override
	public void read(List<String> StringBox) {
		// TODO Auto-generated method stub
		if(StringBox != null && StringBox.size()>0) {
			this.name = StringBox.get(0);
			this.hitPoints = Integer.parseInt(StringBox.get(1));
			this.strength = Integer.parseInt(StringBox.get(2));
		}
	}
	
	@Override
	public String toString() {
		return "Monster{name=" + "'"+this.name+"'"+", "
				+"hitPoints=" + this.hitPoints+", "
				+"strength=" + this.strength + "}";
	}

}
