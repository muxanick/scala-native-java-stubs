package javax.swing

import javax.swing.event.ListSelectionListener

/** This interface represents the current state of the
 *  selection for any of the components that display a
 *  list of values with stable indices.  The selection is
 *  modeled as a set of intervals, each interval represents
 *  a contiguous range of selected list elements.
 *  The methods for modifying the set of selected intervals
 *  all take a pair of indices, index0 and index1, that represent
 *  a closed interval, i.e. the interval includes both index0 and
 *  index1.
 */
trait ListSelectionModel {

    /** Add a listener to the list that's notified each time a change
     *  to the selection occurs.
     */
    @stub
    def addListSelectionListener(x: ListSelectionListener): Unit = ???

    /** Changes the selection to be the set union of the current selection
     *  and the indices between index0 and index1 inclusive.
     */
    @stub
    def addSelectionInterval(index0: Int, index1: Int): Unit = ???

    /** Change the selection to the empty set. */
    @stub
    def clearSelection(): Unit = ???

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

    /** Returns true if the specified index is selected. */
    @stub
    def isSelectedIndex(index: Int): Boolean = ???

    /** Returns true if no indices are selected. */
    @stub
    def isSelectionEmpty(): Boolean = ???

    /** Remove the indices in the interval index0,index1 (inclusive) from
     *  the selection model.
     */
    @stub
    def removeIndexInterval(index0: Int, index1: Int): Unit = ???

    /** Remove a listener from the list that's notified each time a
     *  change to the selection occurs.
     */
    @stub
    def removeListSelectionListener(x: ListSelectionListener): Unit = ???

    /** Changes the selection to be the set difference of the current selection
     *  and the indices between index0 and index1 inclusive.
     */
    @stub
    def removeSelectionInterval(index0: Int, index1: Int): Unit = ???

    /** Set the anchor selection index. */
    @stub
    def setAnchorSelectionIndex(index: Int): Unit = ???

    /** Set the lead selection index. */
    @stub
    def setLeadSelectionIndex(index: Int): Unit = ???

    /** Changes the selection to be between index0 and index1
     *  inclusive.
     */
    @stub
    def setSelectionInterval(index0: Int, index1: Int): Unit = ???

    /** Sets the selection mode. */
    @stub
    def setSelectionMode(selectionMode: Int): Unit = ???
}

object ListSelectionModel {
    /** A value for the selectionMode property: select one or more
     *  contiguous ranges of indices at a time.
     */
    @stub
    val MULTIPLE_INTERVAL_SELECTION: Int = ???

    /** A value for the selectionMode property: select one contiguous
     *  range of indices at a time.
     */
    @stub
    val SINGLE_INTERVAL_SELECTION: Int = ???
}
