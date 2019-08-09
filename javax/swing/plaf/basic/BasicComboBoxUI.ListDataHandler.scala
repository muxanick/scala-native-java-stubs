package javax.swing.plaf.basic

import java.lang.Object
import javax.swing.event.{ListDataEvent, ListDataListener}
import scala.scalanative.annotation.stub

/** This listener watches for changes in the
 *  ComboBoxModel.
 *  
 *  This public inner class should be treated as protected.
 *  Instantiate it only within subclasses of
 *  BasicComboBoxUI.
 */
class BasicComboBoxUI.ListDataHandler extends Object with ListDataListener {

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
