package com.singuloid.idam.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
	
	public void takeSeats(){
		System.out.println("The Audience is taking their seats.");
	}
	
	public void turnOffCellPhones(){
		System.out.println("The Audience is turn off their cellphones.");
	}
	
	public void applaud(){
		System.out.println("CLAP CLAP CLAP CLAP CLAP CLAP CLAP ");
	}
	
	public void demandRefund(){
		System.out.println("Boo We want our money back ");		
	}
	
	public void watchPerformance(ProceedingJoinPoint joinPoint){
		
		try {
				System.out.println("The Audience don't speak ");
				long start = System.currentTimeMillis();
				
					joinPoint.proceed();
				
				long end = System.currentTimeMillis();
				
				System.out.println("perfomance times("+(end-start)+") milliseconds.");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
