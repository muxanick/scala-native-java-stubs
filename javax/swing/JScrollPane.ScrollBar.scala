package javax.swing

import java.awt.{Component, Container}
import java.lang.Object
import javax.swing.plaf.UIResource
import scala.scalanative.annotation.stub

/** By default JScrollPane creates scrollbars
 *  that are instances
 *  of this class.  Scrollbar overrides the
 *  getUnitIncrement and getBlockIncrement
 *  methods so that, if the viewport's view is a Scrollable,
 *  the view is asked to compute these values. Unless
 *  the unit/block increment have been explicitly set.
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
protected class JScrollPane_ScrollBar extends JScrollBar with UIResource {

    /** Creates a scrollbar with the specified orientation. */
    @stub
    def ScrollBar(orientation: Int) = ???

    /** Computes the block increment for scrolling if the viewport's
     *  view is a Scrollable object.
     */
    @stub
    def getBlockIncrement(direction: Int): Int = ???

    /** Computes the unit increment for scrolling if the viewport's
     *  view is a Scrollable object.
     */
    @stub
    def getUnitIncrement(direction: Int): Int = ???

    /** Messages super to set the value, and resets the
     *  blockIncrementSet instance variable to true.
     */
    @stub
    def setBlockIncrement(blockIncrement: Int): Unit = ???

    /** Messages super to set the value, and resets the
     *  unitIncrementSet instance variable to true.
     */
    @stub
    def setUnitIncrement(unitIncrement: Int): Unit = ???
}
