package org.sample;

import java.io.IOException;


public class Launch extends BaseClass {
	public static void main(String[] args) throws InterruptedException, IOException {
	LaunchBrouser("https://adactin.com/HotelApp/index.php");
	AdactinLocator a=new AdactinLocator();
	SendKeys(a.getTxtuser(), "jayprakash");
	SendKeys(a.getTxtpass(), "8807879064");
	click(a.getBtlogin());
	Thread.sleep(4000);
	SelectByText(a.getTxtlocat(), "Adelaide");
	SelectByText(a.getTxthotel(), "Hotel Hervey");
	SelectByText(a.getTxtroom(), "Super Deluxe");
	SelectBy(a.getTxttype(), "4");
	SelectBy(a.getTxtadult(), "2");
	SelectBy(a.getTxtchild(), "1");
	click(a.getBtsub());
	click(a.getBtradio());
	click(a.getBtcont());
	SendKeys(a.getTxtfirst(), "Jay");
	SendKeys(a.getTxtlast(), "Prakash");
	SendKeys(a.getTxtadrs(), "Erode");
	SendKeys(a.getTxtccnum(), "6666565577764567");
	SelectByText(a.getTxtcctyp(), "Master Card");
	SelectBy(a.getTxtmnth(), "2");
	SelectBy(a.getTxtyear(), "2021");
	SendKeys(a.getTxtccv(), "567");
	click(a.getBtbooknow());
	Thread.sleep(10000);
	scrollDown(a.getBtlogout());
	screenshot("F:\\Screenshot.png");
	click(a.getBtiti());
	click(a.getBtradio1());
	click(a.getBtcancel());
	alert();
	Thread.sleep(2000);
	click(a.getBtlogout1());
	
	

	
	
	
}
}

