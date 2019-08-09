package javax.swing.text

import java.awt.{Container, Graphics, Shape}
import java.lang.{Object, String}
import javax.swing.SwingConstants
import javax.swing.event.{DocumentEvent, DocumentEvent.ElementChange}

// 
// A very important part of the text package is the View class.
// As the name suggests it represents a view of the text model,
// or a piece of the text model.
// It is this class that is responsible for the look of the text component.
// The view is not intended to be some completely new thing that one must
// learn, but rather is much like a lightweight component.
// 
//By default, a view is very light.  It contains a reference to the parent
//view from which it can fetch many things without holding state, and it
//contains a reference to a portion of the model (Element).
//A view does not
//have to exactly represent an element in the model, that is simply a typical
//and therefore convenient mapping.  A view can alternatively maintain a couple
//of Position objects to maintain its location in the model (i.e. represent
//a fragment of an element).  This is typically the result of formatting where
//views have been broken down into pieces.  The convenience of a substantial
//relationship to the element makes it easier to build factories to produce the
//views, and makes it easier  to keep track of the view pieces as the model is
//changed and the view must be changed to reflect the model.  Simple views
//therefore represent an Element directly and complex views do not.
//
//A view has the following responsibilities:
//  
//
//    Participate in layout.
//    
//    The view has a setSize method which is like
//    doLayout and setSize in Component combined.
//    The view has a preferenceChanged method which is
//    like invalidate in Component except that one can
//    invalidate just one axis
//    and the child requesting the change is identified.
//    A View expresses the size that it would like to be in terms of three
//    values, a minimum, a preferred, and a maximum span.  Layout in a view is
//    can be done independently upon each axis.  For a properly functioning View
//    implementation, the minimum span will be <= the preferred span which in turn
//    will be <= the maximum span.
//    
//    
//    The minimum set of methods for layout are:
//    
//    getMinimumSpan
//    getPreferredSpan
//    getMaximumSpan
//    getAlignment
//    preferenceChanged
//    setSize
//    
//
//  The setSize method should be prepared to be called a number of times
//    (i.e. It may be called even if the size didn't change).
//    The setSize method
//    is generally called to make sure the View layout is complete prior to trying
//    to perform an operation on it that requires an up-to-date layout.  A view's
//    size should always be set to a value within the minimum and maximum
//    span specified by that view.  Additionally, the view must always call the
//    preferenceChanged method on the parent if it has changed the
//    values for the
//    layout it would like, and expects the parent to honor.  The parent View is
//    not required to recognize a change until the preferenceChanged
//    has been sent.
//    This allows parent View implementations to cache the child requirements if
//    desired.  The calling sequence looks something like the following:
//    
//    
//      
//    The exact calling sequence is up to the layout functionality of
//    the parent view (if the view has any children).  The view may collect
//    the preferences of the children prior to determining what it will give
//    each child, or it might iteratively update the children one at a time.
//    
//
//    Render a portion of the model.
//    
//    This is done in the paint method, which is pretty much like a component
//    paint method.  Views are expected to potentially populate a fairly large
//    tree.  A View has the following semantics for rendering:
//    
//    
//    The view gets its allocation from the parent at paint time, so it
//    must be prepared to redo layout if the allocated area is different from
//    what it is prepared to deal with.
//    The coordinate system is the same as the hosting Component
//    (i.e. the Component returned by the
//    getContainer method).
//    This means a child view lives in the same coordinate system as the parent
//    view unless the parent has explicitly changed the coordinate system.
//    To schedule itself to be repainted a view can call repaint on the hosting
//    Component.
//    The default is to not clip the children.  It is more efficient
//    to allow a view to clip only if it really feels it needs clipping.
//    The Graphics object given is not initialized in any way.
//    A view should set any settings needed.
//    A View is inherently transparent.  While a view may render into its
//    entire allocation, typically a view does not.  Rendering is performed by
//    traversing down the tree of View implementations.
//    Each View is responsible
//    for rendering its children.  This behavior is depended upon for thread
//    safety.  While view implementations do not necessarily have to be implemented
//    with thread safety in mind, other view implementations that do make use of
//    concurrency can depend upon a tree traversal to guarantee thread safety.
//    The order of views relative to the model is up to the implementation.
//    Although child views will typically be arranged in the same order that they
//    occur in the model, they may be visually arranged in an entirely different
//    order.  View implementations may have Z-Order associated with them if the
//    children are overlapping.
//    
//    The methods for rendering are:
//    
//    paint
//    
//
//    Translate between the model and view coordinate systems.
//    
//    Because the view objects are produced from a factory and therefore cannot
//    necessarily be counted upon to be in a particular pattern, one must be able
//    to perform translation to properly locate spatial representation of the model.
//    The methods for doing this are:
//    
//    modelToView
//    viewToModel
//    getDocument
//    getElement
//    getStartOffset
//    getEndOffset
//    
//    The layout must be valid prior to attempting to make the translation.
//    The translation is not valid, and must not be attempted while changes
//    are being broadcasted from the model via a DocumentEvent.
//    
//
//    Respond to changes from the model.
//    
//    If the overall view is represented by many pieces (which is the best situation
//    if one want to be able to change the view and write the least amount of new code),
//    it would be impractical to have a huge number of DocumentListeners.
//    If each
//    view listened to the model, only a few would actually be interested in the
//    changes broadcasted at any given time.   Since the model has no knowledge of
//    views, it has no way to filter the broadcast of change information.  The view
//    hierarchy itself is instead responsible for propagating the change information.
//    At any level in the view hierarchy, that view knows enough about its children to
//    best distribute the change information further.   Changes are therefore broadcasted
//    starting from the root of the view hierarchy.
//    The methods for doing this are:
//    
//    insertUpdate
//    removeUpdate
//    changedUpdate
//    
//    
//
abstract class View extends Object with SwingConstants {

    // Appends a single child view.
    def append(v: View): Unit

    // Tries to break this view on the given axis.
    def breakView(axis: Int, offset: Int, pos: float, len: float): View

    // Gives notification from the document that attributes were changed
    // in a location that this view is responsible for.
    def changedUpdate(e: DocumentEvent, a: Shape, f: ViewFactory): Unit

    // Creates a view that represents a portion of the element.
    def createFragment(p0: Int, p1: Int): View

    // Forwards the given DocumentEvent to the child views
    // that need to be notified of the change to the model.
    protected def forwardUpdate(ec: DocumentEvent.ElementChange, e: DocumentEvent, a: Shape, f: ViewFactory): Unit

    // Forwards the DocumentEvent to the give child view.
    protected def forwardUpdateToView(v: View, e: DocumentEvent, a: Shape, f: ViewFactory): Unit

    // Determines the desired alignment for this view along an
    // axis.
    def getAlignment(axis: Int): float

    // Fetches the attributes to use when rendering.
    def getAttributes(): AttributeSet

    // Determines how attractive a break opportunity in
    // this view is.
    def getBreakWeight(axis: Int, pos: float, len: float): Int

    // Fetches the allocation for the given child view.
    def getChildAllocation(index: Int, a: Shape): Shape

    // Fetches the container hosting the view.
    def getContainer(): Container

    // Fetches the model associated with the view.
    def getDocument(): Document

    // Fetches the structural portion of the subject that this
    // view is mapped to.
    def getElement(): Element

    // Fetches the portion of the model for which this view is
    // responsible.
    def getEndOffset(): Int

    // Fetch a Graphics for rendering.
    def getGraphics(): Graphics

    // Determines the maximum span for this view along an
    // axis.
    def getMaximumSpan(axis: Int): float

    // Determines the minimum span for this view along an
    // axis.
    def getMinimumSpan(axis: Int): float

    // Provides a way to determine the next visually represented model
    // location at which one might place a caret.
    def getNextVisualPositionFrom(pos: Int, b: Position.Bias, a: Shape, direction: Int, biasRet: Array[Position.Bias]): Int

    // Returns the parent of the view.
    def getParent(): View

    // Determines the preferred span for this view along an
    // axis.
    def getPreferredSpan(axis: Int): float

    // Determines the resizability of the view along the
    // given axis.
    def getResizeWeight(axis: Int): Int

    // Fetches the portion of the model for which this view is
    // responsible.
    def getStartOffset(): Int

    // Returns the tooltip text at the specified location.
    def getToolTipText(x: float, y: float, allocation: Shape): String

    // Gets the nth child view.
    def getView(n: Int): View

    // Returns the number of views in this view.
    def getViewCount(): Int

    // Fetches the ViewFactory implementation that is feeding
    // the view hierarchy.
    def getViewFactory(): ViewFactory

    // Returns the child view index representing the given position in
    // the view.
    def getViewIndex(x: float, y: float, allocation: Shape): Int

    // Returns the child view index representing the given position in
    // the model.
    def getViewIndex(pos: Int, b: Position.Bias): Int

    // Inserts a single child view.
    def insert(offs: Int, v: View): Unit

    // Gives notification that something was inserted into
    // the document in a location that this view is responsible for.
    def insertUpdate(e: DocumentEvent, a: Shape, f: ViewFactory): Unit

    // Returns a boolean that indicates whether
    //  the view is visible or not.
    def isVisible(): Boolean

    // Provides a mapping, for a given region,
    // from the document model coordinate space
    // to the view coordinate space.
    def modelToView(p0: Int, b0: Position.Bias, p1: Int, b1: Position.Bias, a: Shape): Shape

    // Deprecated.  
    def modelToView(pos: Int, a: Shape): Shape

    // Provides a mapping, for a given character,
    // from the document model coordinate space
    // to the view coordinate space.
    def modelToView(pos: Int, a: Shape, b: Position.Bias): Shape

    // Renders using the given rendering surface and area on that
    // surface.
    def paint(g: Graphics, allocation: Shape): Unit

    // Child views can call this on the parent to indicate that
    // the preference has changed and should be reconsidered
    // for layout.
    def preferenceChanged(child: View, width: Boolean, height: Boolean): Unit

    // Removes one of the children at the given position.
    def remove(i: Int): Unit

    // Removes all of the children.
    def removeAll(): Unit

    // Gives notification that something was removed from the document
    // in a location that this view is responsible for.
    def removeUpdate(e: DocumentEvent, a: Shape, f: ViewFactory): Unit

    // Replaces child views.
    def replace(offset: Int, length: Int, views: Array[View]): Unit

    // Establishes the parent view for this view.
    def setParent(parent: View): Unit

    // Sets the size of the view.
    def setSize(width: float, height: float): Unit

    // Updates the child views in response to receiving notification
    // that the model changed, and there is change record for the
    // element this view is responsible for.
    protected def updateChildren(ec: DocumentEvent.ElementChange, e: DocumentEvent, f: ViewFactory): Boolean

    // Updates the layout in response to receiving notification of
    // change from the model.
    protected def updateLayout(ec: DocumentEvent.ElementChange, e: DocumentEvent, a: Shape): Unit

    // Deprecated.  
    def viewToModel(x: float, y: float, a: Shape): Int
}

object View {
    @stub
    // The weight to indicate a view is a bad break
    // opportunity for the purpose of formatting.
    def BadBreakWeight: Int = ???

    @stub
    // The weight to indicate a view supports breaking,
    // and this represents a very attractive place to
    // break.
    def ExcellentBreakWeight: Int = ???

    @stub
    // The weight to indicate a view supports breaking,
    // and must be broken to be represented properly
    // when placed in a view that formats its children
    // by breaking them.
    def ForcedBreakWeight: Int = ???

    @stub
    // The weight to indicate a view supports breaking,
    // but better opportunities probably exist.
    def GoodBreakWeight: Int = ???

    @stub
    // Axis for format/break operations.
    def X_AXIS: Int = ???
}
