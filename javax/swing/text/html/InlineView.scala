package javax.swing.text.html

import java.awt.Shape
import java.lang.Object
import javax.swing.event.DocumentEvent
import javax.swing.text.{AttributeSet, Element, GlyphView, LabelView, View, ViewFactory}
import scala.scalanative.annotation.stub

/** Displays the inline element styles
 *  based upon css attributes.
 */
class InlineView extends LabelView {

    /** Constructs a new view wrapped on an element. */
    @stub
    def this(elem: Element) = ???

    /** Tries to break this view on the given axis. */
    @stub
    def breakView(axis: Int, offset: Int, pos: Float, len: Float): View = ???

    /** Gives notification from the document that attributes were changed
     *  in a location that this view is responsible for.
     */
    @stub
    def changedUpdate(e: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    /** Fetches the attributes to use when rendering. */
    @stub
    def getAttributes(): AttributeSet = ???

    /** Determines how attractive a break opportunity in
     *  this view is.
     */
    @stub
    def getBreakWeight(axis: Int, pos: Float, len: Float): Int = ???

    /**  */
    @stub
    protected def getStyleSheet(): StyleSheet = ???

    /** Gives notification that something was inserted into
     *  the document in a location that this view is responsible for.
     */
    @stub
    def insertUpdate(e: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    /** Gives notification that something was removed from the document
     *  in a location that this view is responsible for.
     */
    @stub
    def removeUpdate(e: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    /** Set the cached properties from the attributes. */
    @stub
    protected def setPropertiesFromAttributes(): Unit = ???
}
