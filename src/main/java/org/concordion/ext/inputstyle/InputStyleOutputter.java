// John Hurst (john.b.hurst@gmail.com)
// 2014-12-06

package org.concordion.ext.inputstyle;

import org.concordion.api.listener.SetEvent;
import org.concordion.api.listener.SetListener;

public class InputStyleOutputter implements SetListener {

    @Override
    public void setCompleted(SetEvent event) {
        event.getElement()
            .addStyleClass("inputvalue");
    }
}
