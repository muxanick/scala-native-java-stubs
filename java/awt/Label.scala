package java.awt

import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import scala.scalanative.annotation.stub

/** A Label object is a component for placing text in a
 *  container. A label displays a single line of read-only text.
 *  The text can be changed by the application, but a user cannot edit it
 *  directly.
 *  
 *  For example, the code . . .
 * 
 *  
 *  setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
 *  add(new Label("Hi There!"));
 *  add(new Label("Another Label"));
 *  
 *  
 *  produces the following labels:
 *  
 *  
 */
class Label extends Component with Accessible {

    /** Constructs an empty label. */
    @stub
    def this() = ???

    /** Constructs a new label with the specified string of text,
     *  left justified.
     */
    @stub
    def this(text: String) = ???

    /** Constructs a new label that presents the specified string of
     *  text with the specified alignment.
     */
    @stub
    def this(text: String, alignment: Int) = ???

    /** This class implements accessibility support for the
     *  Label class.
     */
    @stub
    protected object AccessibleAWTLabel extends Label.AccessibleAWTLabel

    /** Creates the peer for this label. */
    @stub
    def addNotify(): Unit = ???

    /** Gets the AccessibleContext associated with this Label. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Gets the current alignment of this label. */
    @stub
    def getAlignment(): Int = ???

    /** Gets the text of this label. */
    @stub
    def getText(): String = ???

    /** Returns a string representing the state of this Label. */
    @stub
    protected def paramString(): String = ???

    /** Sets the alignment for this label to the specified alignment. */
    @stub
    def setAlignment(alignment: Int): Unit = ???

    /** Sets the text for this label to the specified text. */
    @stub
    def setText(text: String): Unit = ???
}

object Label {
    /** Indicates that the label should be centered. */
    @stub
    val CENTER: Int = ???

    /** Indicates that the label should be left justified. */
    @stub
    val LEFT: Int = ???

    /** Indicates that the label should be right justified. */
    @stub
    val RIGHT: Int = ???
}
