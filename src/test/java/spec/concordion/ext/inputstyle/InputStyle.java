// John Hurst (john.b.hurst@gmail.com)
// 2014-12-06

package spec.concordion.ext.inputstyle;

import org.concordion.ext.inputstyle.InputStyleExtension;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.Before;
import org.junit.runner.RunWith;
import test.concordion.TestRig;

@RunWith(ConcordionRunner.class)
public class InputStyle {

  @Before
  public void installExtension() {
    System.setProperty("concordion.extensions", InputStyleExtension.class.getName());
  }

  public String render(String fragment) throws Exception {
    String outputFragment = new TestRig()
      .withFixture(this)
      .withSourceFilter("/org/concordion/ext/inputstyle")
      .processFragment(fragment)
      .getOutputFragmentXML();
    return outputFragment;
  }

}
