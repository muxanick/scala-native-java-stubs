package javax.swing.plaf.basic

import java.lang.Object
import javax.swing.event.{ListDataEvent, ListDataListener}
import scala.scalanative.annotation.stub

/** The ListDataListener that's added to the JLists model at
 *  installUI time, and whenever the JList.model property changes.
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
class BasicListUI_ListDataHandler extends Object with ListDataListener {

    /**  */
    @stub
    def ListDataHandler() = ???

    /** Sent when the contents of the list has changed in a way
     *  that's too complex to characterize with the previous
     *  methods.
     */
    @stub
    def contentsChanged(e: ListDataEvent): Unit = ???

    /** Sent after the indices in the index0,index1
     *  interval have been inserted in the data model.
     */
    @stub
    def intervalAdded(e: ListDataEvent): Unit = ???

    /** Sent after the indices in the index0,index1 interval
     *  have been removed from the data model.
     */
    @stub
    def intervalRemoved(e: ListDataEvent): Unit = ???
}
