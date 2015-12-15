package com.couponWS.client;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import Coupon.Coupon;

public class CouponClientTest {

	@Test
	public void testReadCoupon() {
		CouponClient client=new CouponClient();
		Coupon c=client.ReadCoupon("13");
		System.out.println(c);
		assertNotNull(c);
		//fail("Not yet implemented");
	}
	@Test
	public void testReadCoupon2() {
		CouponClient client=new CouponClient();
		Coupon c=client.ReadCoupon2("13");
		System.out.println(c);
		assertNotNull(c);
		//fail("Not yet implemented");
	}
	@Test
	public void testGetTime(){
		CouponClient client=new CouponClient();
		Coupon c=client.GetTime("13");
		System.out.println(c);
		assertNotNull(c);
		//fail("Not yet implemented");
	}
	@Test
	public void testFindCouponByTime(){
		CouponClient client=new CouponClient();
		List<Coupon> c=client.FindCouponByTimeC("2015-11-18");
		System.out.println(c);
		assertNotNull(c);
		//fail("Not yet implemented");
	}
	@Test
	public void testFindCouponForItem(){
		CouponClient client=new CouponClient();
		List<Coupon> c=client.FindCouponForItemC("item5");
		System.out.println(c);
		assertNotNull(c);
		//fail("Not yet implemented");
	}
	@Test
	public void testFindCouponByType(){
		CouponClient client=new CouponClient();
		List<Coupon> c=client.FindCouponByTypeC("1");
		System.out.println(c);
		assertNotNull(c);
		//fail("Not yet implemented");
	}
	@Test
	public void testDeleteCoupon(){
		CouponClient client=new CouponClient();
		client.Delete("51");
	}
}
