package javax.swing.text

import java.io.Serializable
import java.lang.Object

/** This class encapsulates a single tab stop (basically as tab stops
 *  are thought of by RTF). A tab stop is at a specified distance from the
 *  left margin, aligns text in a specified way, and has a specified leader.
 *  TabStops are immutable, and usually contained in TabSets.
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
class TabStop extends Object with Serializable {

    /** Creates a tab at position pos with a default alignment
     *  and default leader.
     */
    @stub
    def this(pos: Float) = ???

    /** Returns true if the tabs are equal. */
    @stub
    def equals(other: Object): Boolean = ???

    /** Returns the alignment, as an integer, of the tab. */
    @stub
    def getAlignment(): Int = ???

    /** Returns the leader of the tab. */
    @stub
    def getLeader(): Int = ???

    /** Returns the position, as a float, of the tab. */
    @stub
    def getPosition(): Float = ???

    /** Returns the hashCode for the object. */
    @stub
    def hashCode(): Int = ???
}

object TabStop {
    /**  */
    @stub
    val ALIGN_BAR: Int = ???

    /** Characters following tab are positioned such that all following
     *  characters up to next tab/newline are centered around the tabs
     *  location.
     */
    @stub
    val ALIGN_CENTER: Int = ???

    /** Characters following tab are aligned such that next
     *  decimal/tab/newline is at the tab location, very similar to
     *  RIGHT_TAB, just includes decimal as additional character to look for.
     */
    @stub
    val ALIGN_DECIMAL: Int = ???

    /** Character following tab is positioned at location. */
    @stub
    val ALIGN_LEFT: Int = ???

    /** Characters following tab are positioned such that all following
     *  characters up to next tab/newline end at location.
     */
    @stub
    val ALIGN_RIGHT: Int = ???

    /**  */
    @stub
    val LEAD_DOTS: Int = ???

    /**  */
    @stub
    val LEAD_EQUALS: Int = ???

    /**  */
    @stub
    val LEAD_HYPHENS: Int = ???

    /**  */
    @stub
    val LEAD_NONE: Int = ???

    /**  */
    @stub
    val LEAD_THICKLINE: Int = ???
}
