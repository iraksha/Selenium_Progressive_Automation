package GoogleTest;

import org.testng.annotations.Test;

import testBase.GoogleTestBase;

public class GooglePageTest extends GoogleTestBase{

	@Test
	public void testGooglePage() {
		ghp.enterSearchInput(null);
		ghp.showSearchText();
	}
}
