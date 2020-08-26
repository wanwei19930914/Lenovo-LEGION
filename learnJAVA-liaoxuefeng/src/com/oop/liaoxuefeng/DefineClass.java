package com.oop.liaoxuefeng;

public class DefineClass {
	public static void main(String[] args) {
		City bj = new City();
		bj.name = "Beijing";
		bj.latitude = 39.903;
		bj.longtitude = 116.401;
		
		System.out.println(bj.name);
		System.out.println("location:"+ bj.latitude +","+ bj.longtitude);
	}

}

class City{
	public String name;
	public double latitude;
	public double longtitude;
	
}
