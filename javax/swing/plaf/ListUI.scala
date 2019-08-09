package javax.swing.plaf

import java.awt.{Point, Rectangle}
import java.lang.Object
import javax.swing.JList
import scala.scalanative.annotation.stub

/** The JList pluggable look and feel delegate. */
abstract class ListUI extends ComponentUI {

    /**  */
    @stub
    def this() = ???

    /** Returns the bounding rectangle, in the given list's coordinate system,
     *  for the range of cells specified by the two indices.
     */
    def getCellBounds(list: JList, index1: Int, index2: Int): Rectangle

    /** Returns the origin in the given JList, of the specified item,
     *  in the list's coordinate system.
     */
    def indexToLocation(list: JList, index: Int): Point

    /** Returns the cell index in the specified JList closest to the
     *  given location in the list's coordinate system.
     */
    def locationToIndex(list: JList, location: Point): Int
}
