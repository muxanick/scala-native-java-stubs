package javax.swing.text

import java.awt.{Component, Graphics, Shape}
import java.lang.Object

// Component decorator that implements the view interface.  The
// entire element is used to represent the component.  This acts
// as a gateway from the display-only View implementations to
// interactive lightweight components (ie it allows components
// to be embedded into the View hierarchy).
// 
// The component is placed relative to the text baseline
// according to the value returned by
// Component.getAlignmentY.  For Swing components
// this value can be conveniently set using the method
// JComponent.setAlignmentY.  For example, setting
// a value of 0.75 will cause 75 percent of the
// component to be above the baseline, and 25 percent of the
// component to be below the baseline.
// 
// This class is implemented to do the extra work necessary to
// work properly in the presence of multiple threads (i.e. from
// asynchronous notification of model changes for example) by
// ensuring that all component access is done on the event thread.
// 
// The component used is determined by the return value of the
// createComponent method.  The default implementation of this
// method is to return the component held as an attribute of
// the element (by calling StyleConstants.getComponent).  A
// limitation of this behavior is that the component cannot
// be used by more than one text component (i.e. with a shared
// model).  Subclasses can remove this constraint by implementing
// the createComponent to actually create a component based upon
// some kind of specification contained in the attributes.  The
// ObjectView class in the html package is an example of a
// ComponentView implementation that supports multiple component
// views of a shared model.
class ComponentView extends View {

    @stub
    // Create the component that is associated with
    // this view.
    protected def createComponent(): Component = ???

    @stub
    // Determines the desired alignment for this view along an
    // axis.
    def getAlignment(axis: Int): float = ???

    @stub
    // Fetch the component associated with the view.
    def getComponent(): Component = ???

    @stub
    // Determines the maximum span for this view along an
    // axis.
    def getMaximumSpan(axis: Int): float = ???

    @stub
    // Determines the minimum span for this view along an
    // axis.
    def getMinimumSpan(axis: Int): float = ???

    @stub
    // Determines the preferred span for this view along an
    // axis.
    def getPreferredSpan(axis: Int): float = ???

    @stub
    // Provides a mapping from the coordinate space of the model to
    // that of the view.
    def modelToView(pos: Int, a: Shape, b: Position.Bias): Shape = ???

    @stub
    // The real paint behavior occurs naturally from the association
    // that the component has with its parent container (the same
    // container hosting this view).
    def paint(g: Graphics, a: Shape): Unit = ???

    @stub
    // Sets the parent for a child view.
    def setParent(p: View): Unit = ???
}
