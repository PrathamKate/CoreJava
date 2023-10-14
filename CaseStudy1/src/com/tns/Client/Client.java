package com.tns.Client;


import com.tns.Application.GSNormalAcc;
import com.tns.Application.GSPrimeAcc;
import com.tns.Application.GSShopFactory;
import com.tns.FrameWork.NormalAcc;
import com.tns.FrameWork.PrimeAcc;
import com.tns.FrameWork.ShopFactory;

public class Client {

	public static void main(String[] args) {
ShopFactory sf = new GSShopFactory();
		
		
		PrimeAcc pa = new GSPrimeAcc(321,"Faiz",1000, true);
		pa.bookProduct(pa.getCharges());
		pa.toString();
		
		NormalAcc na = new GSNormalAcc(100,"Pradhnya",2000,100);
		na.bookProduct(na.getDeliveryCharge());
		na.toString();
		
	}

}
