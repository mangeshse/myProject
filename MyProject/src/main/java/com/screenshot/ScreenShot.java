package com.screenshot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import com.base.BaseClass;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenShot {
	public void takeScreenShot(String fileName) throws IOException {
		Date date = new Date();
		String systemDate = date.toString().replace(":", "_").replace(":", "_");
		AShot ashot = new AShot();
		BufferedImage img = ashot.shootingStrategy(ShootingStrategies.viewportPasting(3000))
				.takeScreenshot(BaseClass.driver).getImage();
	String baseDir=System.getProperty("user.dir");
		ImageIO.write(img, "png", new File(baseDir+"\\src\\test\\resources\\FailedTestCasesScreenShot"+ systemDate+fileName+".png"));
	}

}
