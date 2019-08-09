package javax.swing.plaf

import java.lang.Object
import javax.swing.ActionMap

/** A subclass of javax.swing.ActionMap that implements UIResource.
 *  UI classes which provide an ActionMap should use this class.
 */
class ActionMapUIResource extends ActionMap with UIResource {
}
