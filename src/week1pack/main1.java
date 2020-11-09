package week1pack;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class main1 {
	OtherClass newClass = new OtherClass();
	
	
	
	@Test
	public void testingMinLong() {
		Assert.assertEquals(1L, newClass.returnLowestLong(1L, 5L));
	}
	
	@Test
	public void testingMinFloat() {
		//While delta is the maximum difference (delta) between expected and actual for which both numbers are still considered equal
		Assert.assertEquals(2.4f, newClass.returnLowestFloat(2.4f, 23.2f), 0);
	}
	
	@Test
	public void testingMinInt() {
		Assert.assertEquals(1, newClass.returnLowestInt(1, 5));
	}
	
	@Test
	public void testingMinDouble() {
		Assert.assertEquals(2.3, newClass.returnLowestDouble(2.3, 6.6), 0);
	}
	
	@Test
	public void testingMaxInt() {
		Assert.assertEquals(88, newClass.returnMaxInt(5, 88));
	}
	
	@Test
	public void testingMaxDouble() {
		Assert.assertEquals(8.3, newClass.returnMaxDouble(5.4, 8.3), 0);
	}
	
	@Test
	public void testingMaxLong() {
		Assert.assertEquals(568768L, newClass.returnMaxLong(568768L, 8545L));
	}
	
	@Test
	public void testingPow() {
		Assert.assertEquals(25, newClass.returnPow(5.0 , 2.0), 0);
	}
	
	@Test
	public void testingPlusOneInt() {
		Assert.assertEquals(4, newClass.returnPlusOneInt(3));
	}
	
	@Test
	public void testingPlusOneLong() {
		Assert.assertEquals(4L, newClass.returnPlusOneLong(3L));
	}
	
	@Test
	public void testingMinOneInt() {
		Assert.assertEquals(3, newClass.returnMinOneInt(4));
	}
	
	@Test
	public void testingMinOneLong() {
		Assert.assertEquals(65, newClass.returnMinOneLong(66));
	}
	
	@Test
	public void testingSquareRootDouble() {
		Assert.assertEquals(5, newClass.returnSquareRootDouble(25.0), 0);
	}
	
	@Test
	public void testingCubeRootDouble() {
		Assert.assertEquals(3, newClass.returnCubeRootDouble(27.0), 0);
	}
	
	@Test
	public void testingRandomDouble() {
		Assert.assertEquals(0.5, newClass.returnRandomDouble(), 0.5);
	}
	
	
}
