package reports;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    static ExtentReports extent;

    public static ExtentReports getReportObject() {

        String path = "test-output/ExtentReport.html";

        ExtentSparkReporter reporter =
                new ExtentSparkReporter(path);

        reporter.config().setReportName("OrangeHRM Automation Report");

        reporter.config().setDocumentTitle("Test Results");

        extent = new ExtentReports();

        extent.attachReporter(reporter);

        return extent;
    }
}