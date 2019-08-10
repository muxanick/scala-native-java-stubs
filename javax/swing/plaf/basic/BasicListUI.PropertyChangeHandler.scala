package javax.swing.plaf.basic

import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import scala.scalanative.annotation.stub

/** The PropertyChangeListener that's added to the JList at
 *  installUI time.  When the value of a JList property that
 *  affects layout changes, we set a bit in updateLayoutStateNeeded.
 *  If the JLists model changes we additionally remove our listeners
 *  from the old model.  Likewise for the JList selectionModel.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class BasicListUI_PropertyChangeHandler extends Object with PropertyChangeListener {

    /**  */
    @stub
    def PropertyChangeHandler() = ???

    /** This method gets called when a bound property is changed. */
    @stub
    def propertyChange(e: PropertyChangeEvent): Unit = ???
}
