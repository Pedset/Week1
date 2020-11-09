package week1pack;

public class OtherClass {

	//1
	public long returnLowestLong(long arg0, long arg1) {
		return Math.min(arg0, arg1);
	}
	//2
	public float returnLowestFloat(float arg0, float arg1) {
		return Math.min(arg0, arg1);
	}
	//3
	public int returnLowestInt(int arg0, int arg1) {
		return Math.min(arg0, arg1);
	}
	//4
	public double returnLowestDouble(double arg0, double arg1) {
		return Math.min(arg0, arg1);
	}
	//5 & 7
	public int returnMaxInt(int arg0, int arg1) {
		return Math.max(arg0, arg1);
	}
	//6
	public double returnMaxDouble(double arg0, double arg1) {
		return Math.max(arg0, arg1);
	}
	//8
	public long returnMaxLong(long arg0, long arg1) {
		return Math.max(arg0, arg1);
	}
	//9
	public double returnPow(double arg0, double arg1) {
		return Math.pow(arg0, arg1);
	}
	//10
	public int returnPlusOneInt(int i) {
		return ++i;
	}
	//11
	public long returnPlusOneLong(long i) {
		return ++i;
	}
	//12
	public int returnMinOneInt(int i) {
		return --i;
	}
	//13
	public long returnMinOneLong(long i) {
		return --i;
	}
	//14
	public double returnSquareRootDouble(double d) {
		return Math.sqrt(d);
	}
	//15
	public double returnCubeRootDouble(double d) {
		return Math.cbrt(d);
	}
	//Bonus
	public double returnRandomDouble() {
		return Math.random();
	}
	
	
}
