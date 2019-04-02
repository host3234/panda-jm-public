package jar;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.cognifide.qa.bb.junit.Modules;
import com.cognifide.qa.bb.junit.TestRunner;
import com.google.inject.Inject;
import jar.GuiceModule;
import jar.pageobjects.PandaPage;

@RunWith(TestRunner.class)
@Modules(GuiceModule.class)
public class PandaTest {

  @Inject
  private PandaPage homePage;

  @Test
  public void pandaLinkTest() {
    // The wait for video is addded for demonstration purpose only, as the test is too fast to be caught properly on video
    homePage.waitForVideo();
    homePage.open();
    homePage.findLink().click();
    assertThat(homePage.checkImage(), is(true));
    homePage.waitForVideo();
  }
}
