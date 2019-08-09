package javax.swing.event

import java.util.EventListener
import scala.scalanative.annotation.stub

/** HyperlinkListener */
trait HyperlinkListener extends EventListener {

    /** Called when a hypertext link is updated. */
    @stub
    def hyperlinkUpdate(e: HyperlinkEvent): Unit = ???
}
