package java.awt

import java.beans.PropertyChangeListener
import java.lang.Object
import javax.accessibility.{Accessible, AccessibleContext}

/** Inner class of Container used to provide default support for
 *  accessibility.  This class is not meant to be used directly by
 *  application developers, but is instead meant only to be
 *  subclassed by container developers.
 *  
 *  The class used to obtain the accessible role for this object,
 *  as well as implementing many of the methods in the
 *  AccessibleContainer interface.
 */
protected class Container.AccessibleAWTContainer extends Component.AccessibleAWTComponent {

    /** Adds a PropertyChangeListener to the listener list. */
    @stub
    def addPropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    /** Returns the Accessible child, if one exists,
     *  contained at the local coordinate Point.
     */
    @stub
    def getAccessibleAt(p: Point): Accessible = ???

    /** Returns the nth Accessible child of the object. */
    @stub
    def getAccessibleChild(i: Int): Accessible = ???

    /** Returns the number of accessible children in the object. */
    @stub
    def getAccessibleChildrenCount(): Int = ???
}
