package jar;

import com.cognifide.qa.bb.modules.CoreModule;
import com.cognifide.qa.bb.logging.ReporterModule;
import com.google.inject.AbstractModule;

public class GuiceModule extends AbstractModule {
  @Override
  protected void configure() {
    install(new CoreModule());
    install(new ReporterModule());
  }
}
