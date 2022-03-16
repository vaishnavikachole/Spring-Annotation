package com.web.SpringAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig 
{
@Bean
 public Student getStudent()
 {
	 return new Student();
 }
 
@Bean
@Primary
 public MobileProcessor getMobileProcessor()
 {
	 return new SnapDragonProcessor();
 }
 
@Bean
 public MobileProcessor getAppleA15MobileProcessor()
 {
	 return new AppleA15Processor();
 }
}
