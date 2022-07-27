package practiceJava;

public class FlourPacker {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean reasult = canPack(2	, 1,  5);
		System.out.println("reasult " + reasult);
	}
	
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		//one bigCount == 5 kilos
		int afterCalculateBG = bigCount * 5;
		int sumup = afterCalculateBG + smallCount;
		boolean candivided = (afterCalculateBG - goal) % 5 == 0;
		boolean candividedB = (afterCalculateBG - (goal-smallCount)) % 5 == 0;
		//boolean bgDivided = (afterCalculateBG > goal) ? (goal) % 5 == 0 : false;
		boolean smDivided = smallCount > (goal % 10);
		
		if(bigCount < 0 || smallCount < 0 || goal < 0) {
			return false;
		}else {
			if(sumup == goal) {
				return true;
			}else if(sumup > goal) {
				if(afterCalculateBG > goal && smDivided) {
					return true;
				}else if(afterCalculateBG < goal && smDivided) {
					return  true;
				}else if(afterCalculateBG > goal && !smDivided) {
					if(candividedB || candivided) {
						return true;
					}else {
						return false;
					}
				}else {
					return false;
				}
			}
		}		
		return false;
	}
	
}
