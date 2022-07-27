package practiceJava;

public class PaintJob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double resultA = getBucketCount(2.75, 3.25, 2.5, 1);
		double resultB = getBucketCount(3.4, 2.1 ,1.5);
		double resultC = getBucketCount(3.26,0.75);
		
		System.out.println("resultA " + resultA);
		System.out.println("resultB " + resultB);
		System.out.println("resultC " + resultC);
		
	}

	public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
		int result = 0;
		if(width <= 0 || height <=0 ||  areaPerBucket <=0 || extraBuckets <0) {
			return -1;
		}else {
			boolean coverArea = ((width * height)/(areaPerBucket)-extraBuckets)> 0;
			if(coverArea) {
				result = (int)Math.ceil(((width * height)/areaPerBucket)-extraBuckets);
			}
			
		}
		return result;
	}
	public static int getBucketCount(double width, double height, double areaPerBucket) {
		int result = 0;
		if(width <= 0 || height <=0 ||  areaPerBucket <=0) {
			return -1;
		}else {
			boolean coverArea = (width * height)/(areaPerBucket) > 0;
			if(coverArea) {
				result = (int)Math.ceil((width * height)/(areaPerBucket));
			}
			
		}
		return result;
	}
	public static int getBucketCount(double area,double areaPerBucket) {
		int result = 0;
		if(area <=0 ||  areaPerBucket <=0) {
			return -1;
		}else {
			boolean coverArea = (area)/(areaPerBucket) > 0;
			if(coverArea) {
				result = (int)Math.ceil(area /(areaPerBucket));
			}
			
		}
		return result;
	}
}
