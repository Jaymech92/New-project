package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLocator extends BaseClass {
	public AdactinLocator() {
		PageFactory.initElements(driver, this);
	}
@FindBy(name="username")
private WebElement Txtuser;
@FindBy(name="password")
private WebElement Txtpass;
@FindBy(name="login")
private WebElement btlogin;
@FindBy(name="location")
private WebElement Txtlocat;
@FindBy(name="hotels")
private WebElement Txthotel;
@FindBy(name="room_type")
private WebElement Txtroom;
@FindBy(name="room_nos")
private WebElement Txttype;
@FindBy(name="adult_room")
private WebElement Txtadult;
@FindBy(name="child_room")
private WebElement Txtchild;
@FindBy(id="Submit")
private WebElement btsub;
@FindBy(name="radiobutton_0")
private WebElement btradio;
@FindBy(name="continue")
private WebElement btcont;
@FindBy(id="first_name")
private WebElement Txtfirst;
@FindBy(id="last_name")
private WebElement Txtlast;
@FindBy(name="address")
private WebElement Txtadrs;
@FindBy(name="cc_num")
private WebElement Txtccnum;
@FindBy(name="cc_type")
private WebElement Txtcctyp;
@FindBy(name="cc_exp_month")
private WebElement Txtmnth;
@FindBy(name="cc_exp_year")
private WebElement Txtyear;
@FindBy(name="cc_cvv")
private WebElement Txtccv;
@FindBy(name="book_now")
private WebElement btbooknow;
@FindBy(name="my_itinerary")
private WebElement btiti;
@FindBy(name="ids[]")
private WebElement btradio1;
@FindBy(name="cancelall")
private WebElement btcancel;
@FindBy(name="logout")
private WebElement btlogout;
@FindBy(name="logout")
private WebElement btlogout1;

public WebElement getTxtuser() {
	return Txtuser;
}
public WebElement getTxtpass() {
	return Txtpass;
}
public WebElement getBtlogin() {
	return btlogin;
}
public WebElement getTxtlocat() {
	return Txtlocat;
}
public WebElement getTxthotel() {
	return Txthotel;
}
public WebElement getTxtroom() {
	return Txtroom;
}
public WebElement getTxttype() {
	return Txttype;
}
public WebElement getTxtadult() {
	return Txtadult;
}
public WebElement getTxtchild() {
	return Txtchild;
}
public WebElement getBtsub() {
	return btsub;
}
public WebElement getBtradio() {
	return btradio;
}
public WebElement getBtcont() {
	return btcont;
}
public WebElement getTxtfirst() {
	return Txtfirst;
}
public WebElement getTxtlast() {
	return Txtlast;
}
public WebElement getTxtadrs() {
	return Txtadrs;
}
public WebElement getTxtccnum() {
	return Txtccnum;
}
public WebElement getTxtcctyp() {
	return Txtcctyp;
}
public WebElement getTxtmnth() {
	return Txtmnth;
}
public WebElement getTxtyear() {
	return Txtyear;
}
public WebElement getTxtccv() {
	return Txtccv;
}
public WebElement getBtbooknow() {
	return btbooknow;
}
public WebElement getBtiti() {
	return btiti;
}
public WebElement getBtradio1() {
	return btradio1;
}
public WebElement getBtcancel() {
	return btcancel;
}
public WebElement getBtlogout() {
	return btlogout;
}
public WebElement getBtlogout1() {
	return btlogout1;
}
}
