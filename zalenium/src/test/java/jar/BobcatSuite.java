package jar;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.cognifide.qa.bb.junit.Modules;
import com.cognifide.qa.bb.junit.concurrent.ConcurrentSuite;

import jar.GuiceModule;

@Modules(GuiceModule.class)
@RunWith(ConcurrentSuite.class)
@Suite.SuiteClasses({PandaTest.class})
public class BobcatSuite {
}
