package javax.swing.text

import java.lang.{Object, String}
import javax.swing.KeyStroke
import scala.scalanative.annotation.stub

/** Binding record for creating key bindings.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
object JTextComponent.KeyBinding extends Object {

    /** Creates a new key binding. */
    @stub
    def KeyBinding(key: KeyStroke, actionName: String) = ???

    /** The name of the action for the key. */
    @stub
    val actionName: String = ???

    /** The key. */
    @stub
    val key: KeyStroke = ???
}
