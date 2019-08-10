package javax.swing.plaf.basic

import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import scala.scalanative.annotation.stub

/** Implementation of the PropertyChangeListener
 *  that the JSplitPane UI uses.
 *  
 *  This class should be treated as a "protected" inner class.
 *  Instantiate it only within subclasses of BasicSplitPaneUI.
 */
class BasicSplitPaneUI_PropertyHandler extends Object with PropertyChangeListener {

    /**  */
    @stub
    def PropertyHandler() = ???

    /** Messaged from the JSplitPane the receiver is
     *  contained in.
     */
    @stub
    def propertyChange(e: PropertyChangeEvent): Unit = ???
}
