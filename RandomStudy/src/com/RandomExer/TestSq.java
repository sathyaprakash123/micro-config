package com.RandomExer;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestSq {
	
	public static void main(String args[])
	
	{
	
		Result result = JUnitCore.runClasses(SuperSuite.class);
		
		for(Failure fail : result.getFailures())
		{
			
			System.out.println(fail.toString());
			
		}
		
		
		System.out.println(result.wasSuccessful());
		
	}
	

}
