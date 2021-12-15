package com.cams.GenericLibrary;

import java.util.Random;

public class JavaUtility 
{
	public int getrandomNum() {
		Random ran=new Random();
		int randomNum=ran.nextInt(1000);
		return randomNum;
	}
	
	
	
}
