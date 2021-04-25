package com.bridgelabz.sturcturalpattern;

public class ShopKepper {
private MobileShop moto;
private MobileShop micro;
public ShopKepper() {
	moto=new MotoGSeries();
	micro=new Micromax();
}
void motoSale() {
moto.modelNo();
moto.price();
}
void microSale() {
	micro.modelNo();
	micro.price();
}
}
