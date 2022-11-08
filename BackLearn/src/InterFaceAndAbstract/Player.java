package InterFaceAndAbstract;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
	private String name;
	private String weapon;
	private int hitPoints;
	private int strength;
	
	public Player(String name, int hitPoints, int strength) {
		this.name =name;
		this.hitPoints =hitPoints;
		this.strength = strength;
		this.weapon = "Sword";
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}



	@Override
	public List<String> write() {
		// TODO Auto-generated method stub
		List<String> values = new ArrayList<String>();
		values.add(0, this.name);
		values.add(1, "" + this.hitPoints);
		values.add(2, "" + this.strength);
		values.add(3, this.weapon);
		
		return values;
	}

	@Override
	public void read(List<String> StringBox) {
		// TODO Auto-generated method stub
		if(StringBox != null && StringBox.size()>0) {
			this.name = StringBox.get(0);
			this.hitPoints = Integer.parseInt(StringBox.get(1));
			this.strength = Integer.parseInt(StringBox.get(2));
			this.weapon = StringBox.get(3);
		}
		
	}
	
	@Override
	public String toString() {
		return "Player{"+
				"name='" + name +'\''+
				", strength=" + strength +
				", weapon='" + weapon + '\''+
				'}';
	}
	
}
