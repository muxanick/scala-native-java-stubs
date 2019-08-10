package javax.swing

import java.awt.{Component, Container, Dimension}
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A toolbar-specific separator. An object with dimension but
 *  no contents used to divide buttons on a tool bar into groups.
 */
object JToolBar_Separator extends JSeparator {

    /** Creates a new toolbar separator with the default size
     *  as defined by the current look and feel.
     */
    @stub
    def Separator() = ???

    /** Creates a new toolbar separator with the specified size. */
    @stub
    def Separator(size: Dimension) = ???

    /** Returns the maximum size for the separator. */
    @stub
    def getMaximumSize(): Dimension = ???

    /** Returns the minimum size for the separator. */
    @stub
    def getMinimumSize(): Dimension = ???

    /** Returns the preferred size for the separator. */
    @stub
    def getPreferredSize(): Dimension = ???

    /** Returns the size of the separator */
    @stub
    def getSeparatorSize(): Dimension = ???

    /** Returns the name of the L&F class that renders this component. */
    @stub
    def getUIClassID(): String = ???

    /** Sets the size of the separator. */
    @stub
    def setSeparatorSize(size: Dimension): Unit = ???
}
