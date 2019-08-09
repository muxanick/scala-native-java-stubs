package javax.swing.text

import java.awt.{Component, Graphics, Shape}
import java.lang.Object
import scala.scalanative.annotation.stub

/** Component decorator that implements the view interface.  The
 *  entire element is used to represent the component.  This acts
 *  as a gateway from the display-only View implementations to
 *  interactive lightweight components (ie it allows components
 *  to be embedded into the View hierarchy).
 *  
 *  The component is placed relative to the text baseline
 *  according to the value returned by
 *  Component.getAlignmentY.  For Swing components
 *  this value can be conveniently set using the method
 *  JComponent.setAlignmentY.  For example, setting
 *  a value of 0.75 will cause 75 percent of the
 *  component to be above the baseline, and 25 percent of the
 *  component to be below the baseline.
 *  
 *  This class is implemented to do the extra work necessary to
 *  work properly in the presence of multiple threads (i.e. from
 *  asynchronous notification of model changes for example) by
 *  ensuring that all component access is done on the event thread.
 *  
 *  The component used is determined by the return value of the
 *  createComponent method.  The default implementation of this
 *  method is to return the component held as an attribute of
 *  the element (by calling StyleConstants.getComponent).  A
 *  limitation of this behavior is that the component cannot
 *  be used by more than one text component (i.e. with a shared
 *  model).  Subclasses can remove this constraint by implementing
 *  the createComponent to actually create a component based upon
 *  some kind of specification contained in the attributes.  The
 *  ObjectView class in the html package is an example of a
 *  ComponentView implementation that supports multiple component
 *  views of a shared model.
 */
class ComponentView extends View {

    /** Creates a new ComponentView object. */
    @stub
    def this(elem: Element) = ???

    /** Create the component that is associated with
     *  this view.
     */
    @stub
    protected def createComponent(): Component = ???

    /** Determines the desired alignment for this view along an
     *  axis.
     */
    @stub
    def getAlignment(axis: Int): Float = ???

    /** Fetch the component associated with the view. */
    @stub
    def getComponent(): Component = ???

    /** Determines the maximum span for this view along an
     *  axis.
     */
    @stub
    def getMaximumSpan(axis: Int): Float = ???

    /** Determines the minimum span for this view along an
     *  axis.
     */
    @stub
    def getMinimumSpan(axis: Int): Float = ???

    /** Determines the preferred span for this view along an
     *  axis.
     */
    @stub
    def getPreferredSpan(axis: Int): Float = ???

    /** Provides a mapping from the coordinate space of the model to
     *  that of the view.
     */
    @stub
    def modelToView(pos: Int, a: Shape, b: Position.Bias): Shape = ???

    /** The real paint behavior occurs naturally from the association
     *  that the component has with its parent container (the same
     *  container hosting this view).
     */
    @stub
    def paint(g: Graphics, a: Shape): Unit = ???

    /** Sets the parent for a child view. */
    @stub
    def setParent(p: View): Unit = ???

    /** Provides a mapping from the view coordinate space to the logical
     *  coordinate space of the model.
     */
    @stub
    def viewToModel(x: Float, y: Float, a: Shape, bias: Array[Position.Bias]): Int = ???
}
