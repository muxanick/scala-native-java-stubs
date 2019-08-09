package java.applet

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer, Panel.AccessibleAWTPanel}
import java.lang.Object
import javax.accessibility.{AccessibleContext, AccessibleRole, AccessibleStateSet}
import scala.scalanative.annotation.stub

/** This class implements accessibility support for the
 *  Applet class.  It provides an implementation of the
 *  Java Accessibility API appropriate to applet user-interface elements.
 */
protected class Applet.AccessibleApplet extends Panel.AccessibleAWTPanel {

    /**  */
    @stub
    protected def AccessibleApplet() = ???

    /** Get the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???

    /** Get the state of this object. */
    @stub
    def getAccessibleStateSet(): AccessibleStateSet = ???
}
