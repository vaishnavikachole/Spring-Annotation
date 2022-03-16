package com.web.SpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student 
{
	@Autowired
	@Qualifier("getAppleA15MobileProcessor")
	MobileProcessor mobileProcessor;
	
	
	public MobileProcessor getMobileProcessor()
	{
		return mobileProcessor;
	}
	public void setMobileProcessor(MobileProcessor mobileProcessor)
	{
		this.mobileProcessor = mobileProcessor;
	}
	public void information()
	{
		System.out.println("Student information printed !");
		mobileProcessor.process();
	}
}

