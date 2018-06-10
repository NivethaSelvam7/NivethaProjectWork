package reports;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnReports{
	public void reports() throws IOException {

	ExtentHtmlReporter html = new ExtentHtmlReporter("./report/result.html");
	html.setAppendExisting(true);
	ExtentReports extent = new  ExtentReports();
	extent.attachReporter(html);
	ExtentTest test = extent.createTest("TC_01", "Sample Test case report generation");
	test.assignCategory("Test Report Generation");
	test.assignAuthor("Nivetha");
	test.pass("Step 1 passed", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/snap1.jpg").build());
	extent.flush();


	}

}
