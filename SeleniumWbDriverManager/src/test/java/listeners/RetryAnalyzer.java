package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	
	private int retrycount=0;
	public static final int maxRetryCount=5;
	public boolean retry(ITestResult result)
	{
		if(retrycount<maxRetryCount)
		{
			retrycount++;
			return true;
		}
		return false;
	}
	

}
