package javax.swing

import java.awt.Point
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Represents a location where dropped data should be inserted.
 *  This is a base class that only encapsulates a point.
 *  Components supporting drop may provide subclasses of this
 *  containing more information.
 *  
 *  Developers typically shouldn't create instances of, or extend, this
 *  class. Instead, these are something provided by the DnD
 *  implementation by TransferSupport instances and by
 *  components with a getDropLocation() method.
 */
object TransferHandler_DropLocation extends Object {

    /** Constructs a drop location for the given point. */
    @stub
    protected def DropLocation(dropPoint: Point) = ???

    /** Returns the drop point, representing the mouse's
     *  current location within the component.
     */
    @stub
    def getDropPoint(): Point = ???

    /** Returns a string representation of this drop location. */
    @stub
    def toString(): String = ???
}
