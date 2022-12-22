package com.enums;

enum Result {
	// static and final
	PASS, FAIL, NR;
}

enum Compass {
	NORTH, SOUTH, EAST, WEST;
}

public class LaunchEnums {
	enum Gender {
		FEMALE, MALE, OTHERS;
	}

	public static void main(String[] args) {
		Result res = Result.PASS;
		System.out.println(res);
		
		Result[] r1 = Result.PASS.values();
		//System.out.println(r1);
		for(Result x:r1) {
			System.out.println(x.ordinal()+" "+x);
		}
	}

}
