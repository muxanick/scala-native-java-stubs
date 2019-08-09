package javax.swing.text

import java.io.Serializable
import java.lang.Object

// This class encapsulates a single tab stop (basically as tab stops
// are thought of by RTF). A tab stop is at a specified distance from the
// left margin, aligns text in a specified way, and has a specified leader.
// TabStops are immutable, and usually contained in TabSets.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class TabStop extends Object with Serializable {

    @stub
    // Creates a tab at position pos with a default alignment
    // and default leader.
    def this(pos: float) = ???

    @stub
    // Returns true if the tabs are equal.
    def equals(other: Object): Boolean = ???

    @stub
    // Returns the alignment, as an integer, of the tab.
    def getAlignment(): Int = ???

    @stub
    // Returns the leader of the tab.
    def getLeader(): Int = ???

    @stub
    // Returns the position, as a float, of the tab.
    def getPosition(): float = ???

    @stub
    // Returns the hashCode for the object.
    def hashCode(): Int = ???
}

object TabStop {
    @stub
    // 
    def ALIGN_BAR: Int = ???

    @stub
    // Characters following tab are positioned such that all following
    // characters up to next tab/newline are centered around the tabs
    // location.
    def ALIGN_CENTER: Int = ???

    @stub
    // Characters following tab are aligned such that next
    // decimal/tab/newline is at the tab location, very similar to
    // RIGHT_TAB, just includes decimal as additional character to look for.
    def ALIGN_DECIMAL: Int = ???

    @stub
    // Character following tab is positioned at location.
    def ALIGN_LEFT: Int = ???

    @stub
    // Characters following tab are positioned such that all following
    // characters up to next tab/newline end at location.
    def ALIGN_RIGHT: Int = ???

    @stub
    // 
    def LEAD_DOTS: Int = ???

    @stub
    // 
    def LEAD_EQUALS: Int = ???

    @stub
    // 
    def LEAD_HYPHENS: Int = ???

    @stub
    // 
    def LEAD_NONE: Int = ???

    @stub
    // 
    def LEAD_THICKLINE: Int = ???
}
