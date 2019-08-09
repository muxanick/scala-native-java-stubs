package java.awt

import java.beans.PropertyChangeListener
import java.lang.Object
import javax.accessibility.{Accessible, AccessibleContext}

// Inner class of Container used to provide default support for
// accessibility.  This class is not meant to be used directly by
// application developers, but is instead meant only to be
// subclassed by container developers.
// 
// The class used to obtain the accessible role for this object,
// as well as implementing many of the methods in the
// AccessibleContainer interface.
protected class Container.AccessibleAWTContainer extends Component.AccessibleAWTComponent {

    @stub
    // Adds a PropertyChangeListener to the listener list.
    def addPropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    @stub
    // Returns the Accessible child, if one exists,
    // contained at the local coordinate Point.
    def getAccessibleAt(p: Point): Accessible = ???

    @stub
    // Returns the nth Accessible child of the object.
    def getAccessibleChild(i: Int): Accessible = ???

    @stub
    // Returns the number of accessible children in the object.
    def getAccessibleChildrenCount(): Int = ???
}
