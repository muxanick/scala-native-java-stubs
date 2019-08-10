package java.awt

import java.lang.Object
import javax.accessibility.{Accessible, AccessibleContext}
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
     *  Panel class.
     */
    protected type AccessibleAWTPanel = Panel_AccessibleAWTPanel

    /** Creates the Panel's peer. */
    @stub
    def addNotify(): Unit = ???

    /** Gets the AccessibleContext associated with this Panel. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???
}
