package practiceJava;

public class PlayingCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isCatPlay = isCatPlaying(false, 35);
		
		System.out.println("isCatPlay " + isCatPlay);

	}
	
	public static boolean isCatPlaying(boolean summer, int temperature) {
		if(!summer) {
			if(temperature >= 25 && temperature <=35) {
				return true;
			}else {
				return false;
			}
		}else {
			if(temperature >= 25 && temperature <=45) {
				return true;
			}
		}
		return false;
	}

}
