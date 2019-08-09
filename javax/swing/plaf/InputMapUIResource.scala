package javax.swing.plaf

import java.lang.Object
import javax.swing.InputMap

/** A subclass of javax.swing.InputMap that implements UIResource.
 *  UI classes which provide a InputMap should use this class.
 */
class InputMapUIResource extends InputMap with UIResource {
}
