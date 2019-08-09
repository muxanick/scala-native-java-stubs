package java.awt.im.spi

import java.awt.Window
import java.awt.font.TextHitInfo
import java.awt.im.InputMethodRequests
import java.lang.String
import java.text.AttributedCharacterIterator
import javax.swing.JFrame

// Provides methods that input methods
// can use to communicate with their client components or to request
// other services.  This interface is implemented by the input method
// framework, and input methods call its methods on the instance they
// receive through
// InputMethod.setInputMethodContext(java.awt.im.spi.InputMethodContext).
// There should be no other implementors or callers.
trait InputMethodContext extends InputMethodRequests {

    @stub
    // Creates a top-level Swing JFrame for use by the input method.
    def createInputMethodJFrame(title: String, attachToInputContext: Boolean): JFrame = ???

    @stub
    // Creates a top-level window for use by the input method.
    def createInputMethodWindow(title: String, attachToInputContext: Boolean): Window = ???

    @stub
    // Creates an input method event from the arguments given
    // and dispatches it to the client component.
    def dispatchInputMethodEvent(id: Int, text: AttributedCharacterIterator, committedCharacterCount: Int, caret: TextHitInfo, visiblePosition: TextHitInfo): Unit = ???
}
