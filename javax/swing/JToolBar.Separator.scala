package javax.swing

import java.awt.{Component, Container, Dimension}
import java.lang.{Object, String}

// A toolbar-specific separator. An object with dimension but
// no contents used to divide buttons on a tool bar into groups.
object JToolBar.Separator extends JSeparator {

    @stub
    // Creates a new toolbar separator with the default size
    // as defined by the current look and feel.
    def Separator() = ???

    @stub
    // Returns the maximum size for the separator.
    def getMaximumSize(): Dimension = ???

    @stub
    // Returns the minimum size for the separator.
    def getMinimumSize(): Dimension = ???

    @stub
    // Returns the preferred size for the separator.
    def getPreferredSize(): Dimension = ???

    @stub
    // Returns the size of the separator
    def getSeparatorSize(): Dimension = ???

    @stub
    // Returns the name of the L&F class that renders this component.
    def getUIClassID(): String = ???
}
