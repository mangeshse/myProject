package com.listeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.screenshot.ScreenShot;

public class MyListener implements ITestListener {
	ScreenShot shot = new ScreenShot();

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			shot.takeScreenShot(result.getMethod().getMethodName());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

}
