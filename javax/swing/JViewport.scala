package javax.swing

import java.awt.{Component, Container, Dimension, Graphics, Image, Insets, LayoutManager, Point, Rectangle}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.border.Border
import javax.swing.event.ChangeListener
import javax.swing.plaf.ViewportUI

/** The "viewport" or "porthole" through which you see the underlying
 *  information. When you scroll, what moves is the viewport. It is like
 *  peering through a camera's viewfinder. Moving the viewfinder upwards
 *  brings new things into view at the top of the picture and loses
 *  things that were at the bottom.
 *  
 *  By default, JViewport is opaque. To change this, use the
 *  setOpaque method.
 *  
 *  NOTE:We have implemented a faster scrolling algorithm that
 *  does not require a buffer to draw in. The algorithm works as follows:
 *  The view and parent view and checked to see if they are
 *  JComponents,
 *  if they aren't, stop and repaint the whole viewport.
 *  If the viewport is obscured by an ancestor, stop and repaint the whole
 *  viewport.
 *  Compute the region that will become visible, if it is as big as
 *  the viewport, stop and repaint the whole view region.
 *  Obtain the ancestor Window's graphics and
 *  do a copyArea on the scrolled region.
 *  Message the view to repaint the newly visible region.
 *  The next time paint is invoked on the viewport, if the clip region
 *  is smaller than the viewport size a timer is kicked off to repaint the
 *  whole region.
 *  
 *  In general this approach is much faster. Compared to the backing store
 *  approach this avoids the overhead of maintaining an offscreen buffer and
 *  having to do two copyAreas.
 *  Compared to the non backing store case this
 *  approach will greatly reduce the painted region.
 *  
 *  This approach can cause slower times than the backing store approach
 *  when the viewport is obscured by another window, or partially offscreen.
 *  When another window
 *  obscures the viewport the copyArea will copy garbage and a
 *  paint event will be generated by the system to inform us we need to
 *  paint the newly exposed region. The only way to handle this is to
 *  repaint the whole viewport, which can cause slower performance than the
 *  backing store case. In most applications very rarely will the user be
 *  scrolling while the viewport is obscured by another window or offscreen,
 *  so this optimization is usually worth the performance hit when obscured.
 *  
 *  Warning: Swing is not thread safe. For more
 *  information see Swing's Threading
 *  Policy.
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
class JViewport extends JComponent with Accessible {

    /** This class implements accessibility support for the
     *  JViewport class.
     */
    @stub
    protected object AccessibleJViewport extends JViewport.AccessibleJViewport

    /** Deprecated. 
     * As of Java 2 platform v1.3
     * 
     */
    @stub
    protected val backingStore: Boolean = ???

    /** The view image used for a backing store. */
    @stub
    protected val backingStoreImage: Image = ???

    /** True when the viewport dimensions have been determined. */
    @stub
    protected val isViewSizeSet: Boolean = ???

    /** The last viewPosition that we've painted, so we know how
     *  much of the backing store image is valid.
     */
    @stub
    protected val lastPaintPosition: Point = ???

    /** The scrollUnderway flag is used for components like
     *  JList.
     */
    @stub
    protected val scrollUnderway: Boolean = ???

    /** Adds a ChangeListener to the list that is
     *  notified each time the view's
     *  size, position, or the viewport's extent size has changed.
     */
    @stub
    def addChangeListener(l: ChangeListener): Unit = ???

    /** Sets the JViewport's one lightweight child,
     *  which can be null.
     */
    @stub
    protected def addImpl(child: Component, constraints: Object, index: Int): Unit = ???

    /** Computes the parameters for a blit where the backing store image
     *  currently contains oldLoc in the upper left hand corner
     *  and we're scrolling to newLoc.
     */
    @stub
    protected def computeBlit(dx: Int, dy: Int, blitFrom: Point, blitTo: Point, blitSize: Dimension, blitPaint: Rectangle): Boolean = ???

    /** Subclassers can override this to install a different
     *  layout manager (or null) in the constructor.
     */
    @stub
    protected def createLayoutManager(): LayoutManager = ???

    /** Creates a listener for the view. */
    @stub
    protected def createViewListener(): JViewport.ViewListener = ???

    /** Notifies listeners of a property change. */
    @stub
    protected def firePropertyChange(propertyName: String, oldValue: Object, newValue: Object): Unit = ???

    /** Notifies all ChangeListeners when the views
     *  size, position, or the viewports extent size has changed.
     */
    @stub
    protected def fireStateChanged(): Unit = ???

    /** Gets the AccessibleContext associated with this JViewport. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns an array of all the ChangeListeners added
     *  to this JViewport with addChangeListener().
     */
    @stub
    def getChangeListeners(): Array[ChangeListener] = ???

    /** Returns the size of the visible part of the view in view coordinates. */
    @stub
    def getExtentSize(): Dimension = ???

    /** Returns the insets (border) dimensions as (0,0,0,0), since borders
     *  are not supported on a JViewport.
     */
    @stub
    def getInsets(): Insets = ???

    /** Returns an Insets object containing this
     *  JViewports inset values.
     */
    @stub
    def getInsets(insets: Insets): Insets = ???

    /** Returns the current scrolling mode. */
    @stub
    def getScrollMode(): Int = ???

    /** Returns the L&F object that renders this component. */
    @stub
    def getUI(): ViewportUI = ???

    /** Returns a string that specifies the name of the L&F class
     *  that renders this component.
     */
    @stub
    def getUIClassID(): String = ???

    /** Returns the JViewport's one child or null. */
    @stub
    def getView(): Component = ???

    /** Returns the view coordinates that appear in the upper left
     *  hand corner of the viewport, or 0,0 if there's no view.
     */
    @stub
    def getViewPosition(): Point = ???

    /** Returns a rectangle whose origin is getViewPosition
     *  and size is getExtentSize.
     */
    @stub
    def getViewRect(): Rectangle = ???

    /** If the view's size hasn't been explicitly set, return the
     *  preferred size, otherwise return the view's current size.
     */
    @stub
    def getViewSize(): Dimension = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3, replaced by
     *              getScrollMode().
     * 
     */
    @stub
    def isBackingStoreEnabled(): Boolean = ???

    /** The JViewport overrides the default implementation of
     *  this method (in JComponent) to return false.
     */
    @stub
    def isOptimizedDrawingEnabled(): Boolean = ???

    /** Returns true if scroll mode is a BACKINGSTORE_SCROLL_MODE to cause
     *  painting to originate from JViewport, or one of its
     *  ancestors.
     */
    @stub
    protected def isPaintingOrigin(): Boolean = ???

    /** Depending on whether the backingStore is enabled,
     *  either paint the image through the backing store or paint
     *  just the recently exposed part, using the backing store
     *  to "blit" the remainder.
     */
    @stub
    def paint(g: Graphics): Unit = ???

    /** Returns a string representation of this JViewport. */
    @stub
    protected def paramString(): String = ???

    /** Removes the Viewports one lightweight child. */
    @stub
    def remove(child: Component): Unit = ???

    /** Removes a ChangeListener from the list that's notified each
     *  time the views size, position, or the viewports extent size
     *  has changed.
     */
    @stub
    def removeChangeListener(l: ChangeListener): Unit = ???

    /** Always repaint in the parents coordinate system to make sure
     *  only one paint is performed by the RepaintManager.
     */
    @stub
    def repaint(tm: Long, x: Int, y: Int, w: Int, h: Int): Unit = ???

    /** Sets the bounds of this viewport. */
    @stub
    def reshape(x: Int, y: Int, w: Int, h: Int): Unit = ???

    /** Scrolls the view so that Rectangle
     *  within the view becomes visible.
     */
    @stub
    def scrollRectToVisible(contentRect: Rectangle): Unit = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3, replaced by
     *              setScrollMode().
     * 
     */
    @stub
    def setBackingStoreEnabled(enabled: Boolean): Unit = ???

    /** The viewport "scrolls" its child (called the "view") by the
     *  normal parent/child clipping (typically the view is moved in
     *  the opposite direction of the scroll).
     */
    @stub
    def setBorder(border: Border): Unit = ???

    /** Sets the size of the visible part of the view using view coordinates. */
    @stub
    def setExtentSize(newExtent: Dimension): Unit = ???

    /** Used to control the method of scrolling the viewport contents. */
    @stub
    def setScrollMode(mode: Int): Unit = ???

    /** Sets the L&F object that renders this component. */
    @stub
    def setUI(ui: ViewportUI): Unit = ???

    /** Sets the JViewport's one lightweight child
     *  (view), which can be null.
     */
    @stub
    def setView(view: Component): Unit = ???

    /** Sets the view coordinates that appear in the upper left
     *  hand corner of the viewport, does nothing if there's no view.
     */
    @stub
    def setViewPosition(p: Point): Unit = ???

    /** Sets the size of the view. */
    @stub
    def setViewSize(newSize: Dimension): Unit = ???

    /** Converts a size in pixel coordinates to view coordinates. */
    @stub
    def toViewCoordinates(size: Dimension): Dimension = ???

    /** Converts a point in pixel coordinates to view coordinates. */
    @stub
    def toViewCoordinates(p: Point): Point = ???
}

object JViewport {
    /** Draws viewport contents into an offscreen image. */
    @stub
    val BACKINGSTORE_SCROLL_MODE: Int = ???

    /** Use graphics.copyArea to implement scrolling. */
    @stub
    val BLIT_SCROLL_MODE: Int = ???
}
