package javax.swing

import java.io.Serializable
import java.lang.{Class, Cloneable, Object}
import java.util.EventListener
import javax.swing.event.ListSelectionListener

// Default data model for list selections.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class DefaultListSelectionModel extends Object with ListSelectionModel, with Cloneable, with Serializable {

    @stub
    // 
    protected def leadAnchorNotificationEnabled: Boolean = ???

    @stub
    // Add a listener to the list that's notified each time a change
    // to the selection occurs.
    def addListSelectionListener(l: ListSelectionListener): Unit = ???

    @stub
    // Changes the selection to be the set union of the current selection
    // and the indices between index0 and index1 inclusive.
    def addSelectionInterval(index0: Int, index1: Int): Unit = ???

    @stub
    // Change the selection to the empty set.
    def clearSelection(): Unit = ???

    @stub
    // Returns a clone of this selection model with the same selection.
    def clone(): Object = ???

    @stub
    // Notifies listeners that we have ended a series of adjustments.
    protected def fireValueChanged(isAdjusting: Boolean): Unit = ???

    @stub
    // Notifies ListSelectionListeners that the value
    // of the selection, in the closed interval firstIndex,
    // lastIndex, has changed.
    protected def fireValueChanged(firstIndex: Int, lastIndex: Int): Unit = ???

    @stub
    // 
    protected def fireValueChanged(firstIndex: Int, lastIndex: Int, isAdjusting: Boolean): Unit = ???

    @stub
    // Return the first index argument from the most recent call to
    // setSelectionInterval(), addSelectionInterval() or removeSelectionInterval().
    def getAnchorSelectionIndex(): Int = ???

    @stub
    // Return the second index argument from the most recent call to
    // setSelectionInterval(), addSelectionInterval() or removeSelectionInterval().
    def getLeadSelectionIndex(): Int = ???

    @stub
    // Returns an array of all the objects currently registered as
    // FooListeners
    // upon this model.
    def Array[T]: [T <: EventListener] = ???

    @stub
    // Returns an array of all the list selection listeners
    // registered on this DefaultListSelectionModel.
    def getListSelectionListeners(): Array[ListSelectionListener] = ???

    @stub
    // Returns the last selected index or -1 if the selection is empty.
    def getMaxSelectionIndex(): Int = ???

    @stub
    // Returns the first selected index or -1 if the selection is empty.
    def getMinSelectionIndex(): Int = ???

    @stub
    // Returns the current selection mode.
    def getSelectionMode(): Int = ???

    @stub
    // Returns true if the selection is undergoing a series of changes.
    def getValueIsAdjusting(): Boolean = ???

    @stub
    // Insert length indices beginning before/after index.
    def insertIndexInterval(index: Int, length: Int, before: Boolean): Unit = ???

    @stub
    // Returns the value of the leadAnchorNotificationEnabled flag.
    def isLeadAnchorNotificationEnabled(): Boolean = ???

    @stub
    // Returns true if the specified index is selected.
    def isSelectedIndex(index: Int): Boolean = ???

    @stub
    // Returns true if no indices are selected.
    def isSelectionEmpty(): Boolean = ???

    @stub
    // Set the lead selection index, leaving all selection values unchanged.
    def moveLeadSelectionIndex(leadIndex: Int): Unit = ???

    @stub
    // Remove the indices in the interval index0,index1 (inclusive) from
    // the selection model.
    def removeIndexInterval(index0: Int, index1: Int): Unit = ???

    @stub
    // Remove a listener from the list that's notified each time a
    // change to the selection occurs.
    def removeListSelectionListener(l: ListSelectionListener): Unit = ???

    @stub
    // Changes the selection to be the set difference of the current selection
    // and the indices between index0 and index1 inclusive.
    def removeSelectionInterval(index0: Int, index1: Int): Unit = ???

    @stub
    // Set the anchor selection index, leaving all selection values unchanged.
    def setAnchorSelectionIndex(anchorIndex: Int): Unit = ???

    @stub
    // Sets the value of the leadAnchorNotificationEnabled flag.
    def setLeadAnchorNotificationEnabled(flag: Boolean): Unit = ???

    @stub
    // Sets the lead selection index, ensuring that values between the
    // anchor and the new lead are either all selected or all deselected.
    def setLeadSelectionIndex(leadIndex: Int): Unit = ???

    @stub
    // Changes the selection to be between index0 and index1
    // inclusive.
    def setSelectionInterval(index0: Int, index1: Int): Unit = ???

    @stub
    // Sets the selection mode.
    def setSelectionMode(selectionMode: Int): Unit = ???

    @stub
    // Sets the valueIsAdjusting property, which indicates whether
    // or not upcoming selection changes should be considered part of a single
    // change.
    def setValueIsAdjusting(isAdjusting: Boolean): Unit = ???
}
