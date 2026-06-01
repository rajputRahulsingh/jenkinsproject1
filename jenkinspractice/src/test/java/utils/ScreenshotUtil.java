package utils;

import java.io.File;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

public class ScreenshotUtil {

    public static void captureScreenshot(String fileName) {

        try {

            File src = ((TakesScreenshot) DriverFactory.driver)
                    .getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(src,
                    new File("./Screenshots/" + fileName + ".png"));

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}