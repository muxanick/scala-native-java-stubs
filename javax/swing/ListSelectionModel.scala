package javax.swing

import javax.swing.event.ListSelectionListener

// This interface represents the current state of the
// selection for any of the components that display a
// list of values with stable indices.  The selection is
// modeled as a set of intervals, each interval represents
// a contiguous range of selected list elements.
// The methods for modifying the set of selected intervals
// all take a pair of indices, index0 and index1, that represent
// a closed interval, i.e. the interval includes both index0 and
// index1.
trait ListSelectionModel {

    @stub
    // Add a listener to the list that's notified each time a change
    // to the selection occurs.
    def addListSelectionListener(x: ListSelectionListener): Unit = ???

    @stub
    // Changes the selection to be the set union of the current selection
    // and the indices between index0 and index1 inclusive.
    def addSelectionInterval(index0: Int, index1: Int): Unit = ???

    @stub
    // Change the selection to the empty set.
    def clearSelection(): Unit = ???

    @stub
    // Return the first index argument from the most recent call to
    // setSelectionInterval(), addSelectionInterval() or removeSelectionInterval().
    def getAnchorSelectionIndex(): Int = ???

    @stub
    // Return the second index argument from the most recent call to
    // setSelectionInterval(), addSelectionInterval() or removeSelectionInterval().
    def getLeadSelectionIndex(): Int = ???

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
    // Returns true if the specified index is selected.
    def isSelectedIndex(index: Int): Boolean = ???

    @stub
    // Returns true if no indices are selected.
    def isSelectionEmpty(): Boolean = ???

    @stub
    // Remove the indices in the interval index0,index1 (inclusive) from
    // the selection model.
    def removeIndexInterval(index0: Int, index1: Int): Unit = ???

    @stub
    // Remove a listener from the list that's notified each time a
    // change to the selection occurs.
    def removeListSelectionListener(x: ListSelectionListener): Unit = ???

    @stub
    // Changes the selection to be the set difference of the current selection
    // and the indices between index0 and index1 inclusive.
    def removeSelectionInterval(index0: Int, index1: Int): Unit = ???

    @stub
    // Set the anchor selection index.
    def setAnchorSelectionIndex(index: Int): Unit = ???

    @stub
    // Set the lead selection index.
    def setLeadSelectionIndex(index: Int): Unit = ???

    @stub
    // Changes the selection to be between index0 and index1
    // inclusive.
    def setSelectionInterval(index0: Int, index1: Int): Unit = ???

    @stub
    // Sets the selection mode.
    def setSelectionMode(selectionMode: Int): Unit = ???
}

object ListSelectionModel {
    @stub
    // A value for the selectionMode property: select one or more
    // contiguous ranges of indices at a time.
    def MULTIPLE_INTERVAL_SELECTION: Int = ???

    @stub
    // A value for the selectionMode property: select one contiguous
    // range of indices at a time.
    def SINGLE_INTERVAL_SELECTION: Int = ???
}
