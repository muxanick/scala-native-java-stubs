package javax.swing.plaf.basic

import java.awt.{Component, Container, Dimension, LayoutManager}
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This layout manager handles the 'standard' layout of combo boxes.  It puts
 *  the arrow button to the right and the editor to the left.  If there is no
 *  editor it still keeps the arrow button to the right.
 * 
 *  This public inner class should be treated as protected.
 *  Instantiate it only within subclasses of
 *  BasicComboBoxUI.
 */
class BasicComboBoxUI_ComboBoxLayoutManager extends Object with LayoutManager {

    /**  */
    @stub
    def ComboBoxLayoutManager() = ???

    /** If the layout manager uses a per-component string,
     *  adds the component comp to the layout,
     *  associating it
     *  with the string specified by name.
     */
    @stub
    def addLayoutComponent(name: String, comp: Component): Unit = ???

    /** Lays out the specified container. */
    @stub
    def layoutContainer(parent: Container): Unit = ???

    /** Calculates the minimum size dimensions for the specified
     *  container, given the components it contains.
     */
    @stub
    def minimumLayoutSize(parent: Container): Dimension = ???

    /** Calculates the preferred size dimensions for the specified
     *  container, given the components it contains.
     */
    @stub
    def preferredLayoutSize(parent: Container): Dimension = ???

    /** Removes the specified component from the layout. */
    @stub
    def removeLayoutComponent(comp: Component): Unit = ???
}
