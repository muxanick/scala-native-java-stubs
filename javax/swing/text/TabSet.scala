package javax.swing.text

import java.io.Serializable
import java.lang.Object

/** A TabSet is comprised of many TabStops. It offers methods for locating the
 *  closest TabStop to a given position and finding all the potential TabStops.
 *  It is also immutable.
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
class TabSet extends Object with Serializable {

    /** Indicates whether this TabSet is equal to another one. */
    @stub
    def equals(o: Object): Boolean = ???

    /** Returns the TabStop at index index. */
    @stub
    def getTab(index: Int): TabStop = ???

    /** Returns the Tab instance after location. */
    @stub
    def getTabAfter(location: Float): TabStop = ???

    /** Returns the number of Tab instances the receiver contains. */
    @stub
    def getTabCount(): Int = ???

    /**  */
    @stub
    def getTabIndex(tab: TabStop): Int = ???

    /** Returns the index of the Tab to be used after location. */
    @stub
    def getTabIndexAfter(location: Float): Int = ???

    /** Returns a hashcode for this set of TabStops. */
    @stub
    def hashCode(): Int = ???
}
