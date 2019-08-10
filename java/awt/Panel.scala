package java.awt

import java.lang.Object
import javax.accessibility.{Accessible, AccessibleContext, AccessibleRole}
import scala.scalanative.annotation.stub

/** Panel is the simplest container class. A panel
 *  provides space in which an application can attach any other
 *  component, including other panels.
 *  
 *  The default layout manager for a panel is the
 *  FlowLayout layout manager.
 */
class Panel extends Container with Accessible {

    /** Creates a new panel using the default layout manager. */
    @stub
    def this() = ???

    /** Creates a new panel with the specified layout manager. */
    @stub
    def this(layout: LayoutManager) = ???

    /** This class implements accessibility support for the
     *  Panel class.  It provides an implementation of the
     *  Java Accessibility API appropriate to panel user-interface elements.
     */
    protected class AccessibleAWTPanel extends Container.AccessibleAWTContainer {

        /**  */
        @stub
        protected def this() = ???

        /** Get the role of this object. */
        @stub
        def getAccessibleRole(): AccessibleRole = ???
    }


    /** Creates the Panel's peer. */
    @stub
    def addNotify(): Unit = ???

    /** Gets the AccessibleContext associated with this Panel. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???
}
