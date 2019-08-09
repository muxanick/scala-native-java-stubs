package javax.swing

import java.io.Serializable
import java.lang.{Class, Cloneable, Object, String}
import java.util.EventListener
import javax.swing.event.{EventListenerList, ListSelectionListener}
import scala.scalanative.annotation.stub

/** Default data model for list selections.
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
class DefaultListSelectionModel extends Object with ListSelectionModel with Cloneable with Serializable {

    /**  */
    @stub
    def this() = ???

    /**  */
    @stub
    protected val leadAnchorNotificationEnabled: Boolean = ???

    /**  */
    @stub
    protected val listenerList: EventListenerList = ???

    /** Add a listener to the list that's notified each time a change
     *  to the selection occurs.
     */
    @stub
    def addListSelectionListener(l: ListSelectionListener): Unit = ???

    /** Changes the selection to be the set union of the current selection
     *  and the indices between index0 and index1 inclusive.
     */
    @stub
    def addSelectionInterval(index0: Int, index1: Int): Unit = ???

    /** Change the selection to the empty set. */
    @stub
    def clearSelection(): Unit = ???

    /** Returns a clone of this selection model with the same selection. */
    @stub
    def clone(): Object = ???

    /** Notifies listeners that we have ended a series of adjustments. */
    @stub
    protected def fireValueChanged(isAdjusting: Boolean): Unit = ???

    /** Notifies ListSelectionListeners that the value
     *  of the selection, in the closed interval firstIndex,
     *  lastIndex, has changed.
     */
    @stub
    protected def fireValueChanged(firstIndex: Int, lastIndex: Int): Unit = ???

    /**  */
    @stub
    protected def fireValueChanged(firstIndex: Int, lastIndex: Int, isAdjusting: Boolean): Unit = ???

    /** Return the first index argument from the most recent call to
     *  setSelectionInterval(), addSelectionInterval() or removeSelectionInterval().
     */
    @stub
    def getAnchorSelectionIndex(): Int = ???

    /** Return the second index argument from the most recent call to
     *  setSelectionInterval(), addSelectionInterval() or removeSelectionInterval().
     */
    @stub
    def getLeadSelectionIndex(): Int = ???

    /** Returns an array of all the objects currently registered as
     *  FooListeners
     *  upon this model.
     */
    @stub
    def getListeners[T <: EventListener](listenerType: Class[T]): Array[T] = ???

    /** Returns an array of all the list selection listeners
     *  registered on this DefaultListSelectionModel.
     */
    @stub
    def getListSelectionListeners(): Array[ListSelectionListener] = ???

    /** Returns the last selected index or -1 if the selection is empty. */
    @stub
    def getMaxSelectionIndex(): Int = ???

    /** Returns the first selected index or -1 if the selection is empty. */
    @stub
    def getMinSelectionIndex(): Int = ???

    /** Returns the current selection mode. */
    @stub
    def getSelectionMode(): Int = ???

    /** Returns true if the selection is undergoing a series of changes. */
    @stub
    def getValueIsAdjusting(): Boolean = ???

    /** Insert length indices beginning before/after index. */
    @stub
    def insertIndexInterval(index: Int, length: Int, before: Boolean): Unit = ???

    /** Returns the value of the leadAnchorNotificationEnabled flag. */
    @stub
    def isLeadAnchorNotificationEnabled(): Boolean = ???

    /** Returns true if the specified index is selected. */
    @stub
    def isSelectedIndex(index: Int): Boolean = ???

    /** Returns true if no indices are selected. */
    @stub
    def isSelectionEmpty(): Boolean = ???

    /** Set the lead selection index, leaving all selection values unchanged. */
    @stub
    def moveLeadSelectionIndex(leadIndex: Int): Unit = ???

    /** Remove the indices in the interval index0,index1 (inclusive) from
     *  the selection model.
     */
    @stub
    def removeIndexInterval(index0: Int, index1: Int): Unit = ???

    /** Remove a listener from the list that's notified each time a
     *  change to the selection occurs.
     */
    @stub
    def removeListSelectionListener(l: ListSelectionListener): Unit = ???

    /** Changes the selection to be the set difference of the current selection
     *  and the indices between index0 and index1 inclusive.
     */
    @stub
    def removeSelectionInterval(index0: Int, index1: Int): Unit = ???

    /** Set the anchor selection index, leaving all selection values unchanged. */
    @stub
    def setAnchorSelectionIndex(anchorIndex: Int): Unit = ???

    /** Sets the value of the leadAnchorNotificationEnabled flag. */
    @stub
    def setLeadAnchorNotificationEnabled(flag: Boolean): Unit = ???

    /** Sets the lead selection index, ensuring that values between the
     *  anchor and the new lead are either all selected or all deselected.
     */
    @stub
    def setLeadSelectionIndex(leadIndex: Int): Unit = ???

    /** Changes the selection to be between index0 and index1
     *  inclusive.
     */
    @stub
    def setSelectionInterval(index0: Int, index1: Int): Unit = ???

    /** Sets the selection mode. */
    @stub
    def setSelectionMode(selectionMode: Int): Unit = ???

    /** Sets the valueIsAdjusting property, which indicates whether
     *  or not upcoming selection changes should be considered part of a single
     *  change.
     */
    @stub
    def setValueIsAdjusting(isAdjusting: Boolean): Unit = ???

    /** Returns a string that displays and identifies this
     *  object's properties.
     */
    @stub
    def toString(): String = ???
}
