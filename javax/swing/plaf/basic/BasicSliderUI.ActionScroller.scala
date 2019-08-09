package javax.swing.plaf.basic

import java.awt.event.ActionEvent
import java.lang.Object
import javax.swing.AbstractAction

/** As of Java 2 platform v1.3 this undocumented class is no longer used.
 *  The recommended approach to creating bindings is to use a
 *  combination of an ActionMap, to contain the action,
 *  and an InputMap to contain the mapping from KeyStroke
 *  to action description. The InputMap is is usually described in the
 *  LookAndFeel tables.
 *  
 *  Please refer to the key bindings specification for further details.
 *  
 *  This class should be treated as a "protected" inner class.
 *  Instantiate it only within subclasses of Foo.
 */
class BasicSliderUI.ActionScroller extends AbstractAction {

    /** Invoked when an action occurs. */
    @stub
    def actionPerformed(e: ActionEvent): Unit = ???
}
