package org.Java;

public class DataTypes {

//	Primitive dataTypes
	
	static byte b = 127;  //1 byte
	static short s = 32767; //2 byte
	static int i = 2147483647; //4 byte 
	static long l = 92233720;  //8 byte 
	static float f = 89.67f;  // 4 byte 
	static double d = 127.89765; // 8 byte 
	static char c = 'K';  // 2 byte
	static boolean bo = true; //1 bit
		
	
//	Non primitive dataTypes 
	
	static int[] a = {1,2,3,4,5};
	static String st = "Hello world"; 
	
	
	public static void main(String[] args) {
		
		System.out.println(a[1]+" "+st);
		
		System.out.println(b+" "+s+" "+i+" "+l+" "+f+" "+d+" "+c+" "+bo);

	}

}
 