// John Hurst (john.b.hurst@gmail.com)
// 2014-12-06

package org.concordion.ext.inputstyle;

import org.concordion.api.Resource;
import org.concordion.api.extension.ConcordionExtender;
import org.concordion.api.extension.ConcordionExtension;

public class InputStyleExtension implements ConcordionExtension {

  private static final String INPUTSTYLE_CSS_SOURCE_PATH = "/org/concordion/ext/inputstyle/inputstyle.css";
  private static final Resource INPUTSTYLE_CSS_TARGET_RESOURCE = new Resource("/inputstyle.css");

  @Override
  public void addTo(ConcordionExtender extender) {
    InputStyleOutputter outputter = new InputStyleOutputter();
    extender
      .withSetListener(outputter)
      .withLinkedCSS(INPUTSTYLE_CSS_SOURCE_PATH, INPUTSTYLE_CSS_TARGET_RESOURCE);
  }
}
