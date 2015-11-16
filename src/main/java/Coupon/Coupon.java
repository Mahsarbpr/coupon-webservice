package Coupon;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Coupon {
public int CouponID;
public double Discount;
public int CouponType; //There should be better option for defining Coupon Type
public String Itemname;
public int ItemID;
Date ValidTime1;// = new Date();
Date ValidTime2;// = new Date();
public int getCouponID() {
	return CouponID;
}
public String getItemname() {
	return Itemname;
}
public void setItemname(String itemname) {
	Itemname = itemname;
}
public void setCouponID(int couponID) {
	CouponID = couponID;
}
public double getDiscount() {
	return Discount;
}
public void setDiscount(double discount) {
	Discount = discount;
}
public int getCouponType() {
	return CouponType;
}
public void setCouponType(int couponType) {
	CouponType = couponType;
}
public Date getValidTime1() {
	return ValidTime1;
}
public void setValidTime1(Date validTime1) {
	ValidTime1 = validTime1;
}
public Date getValidTime2() {
	return ValidTime2;
}
public void setValidTime2(Date validTime2) {
	ValidTime2 = validTime2;
}
public int getItemID() {
	return ItemID;
}
public void setItemID(int itemID) {
	ItemID = itemID;
}
@Override
public String toString() {
  return getClass().getSimpleName() + "CouponID=" + CouponID + ", Discount="+ Discount+",Coupon Tpye="+CouponType+", Item name="+Itemname+", Starting time"+ValidTime1+", Expiration Time="+ValidTime2;
}

}
