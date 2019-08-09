package javax.accessibility

import java.lang.Object
import scala.scalanative.annotation.stub

/** The AccessibleKeyBinding interface should be supported by any object
 *  that has a keyboard bindings such as a keyboard mnemonic and/or keyboard
 *  shortcut which can be used to select the object.  This interface provides
 *  the standard mechanism for an assistive technology to determine the
 *  key bindings which exist for this object.
 *  Any object that has such key bindings should support this
 *  interface.
 */
trait AccessibleKeyBinding {

    /** Returns a key binding for this object. */
    @stub
    def getAccessibleKeyBinding(i: Int): Object = ???

    /** Returns the number of key bindings for this object */
    @stub
    def getAccessibleKeyBindingCount(): Int = ???
}
