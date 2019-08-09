package java.awt.im.spi

import java.awt.Window
import java.awt.font.TextHitInfo
import java.awt.im.InputMethodRequests
import java.lang.String
import java.text.AttributedCharacterIterator
import javax.swing.JFrame
import scala.scalanative.annotation.stub

/** Provides methods that input methods
 *  can use to communicate with their client components or to request
 *  other services.  This interface is implemented by the input method
 *  framework, and input methods call its methods on the instance they
 *  receive through
 *  InputMethod.setInputMethodContext(java.awt.im.spi.InputMethodContext).
 *  There should be no other implementors or callers.
 */
trait InputMethodContext extends InputMethodRequests {

    /** Creates a top-level Swing JFrame for use by the input method. */
    @stub
    def createInputMethodJFrame(title: String, attachToInputContext: Boolean): JFrame = ???

    /** Creates a top-level window for use by the input method. */
    @stub
    def createInputMethodWindow(title: String, attachToInputContext: Boolean): Window = ???

    /** Creates an input method event from the arguments given
     *  and dispatches it to the client component.
     */
    @stub
    def dispatchInputMethodEvent(id: Int, text: AttributedCharacterIterator, committedCharacterCount: Int, caret: TextHitInfo, visiblePosition: TextHitInfo): Unit = ???

    /** Enables or disables notification of the current client window's
     *  location and state for the specified input method.
     */
    @stub
    def enableClientWindowNotification(inputMethod: InputMethod, enable: Boolean): Unit = ???
}
