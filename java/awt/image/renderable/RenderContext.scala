package java.awt.image.renderable

import java.awt.{RenderingHints, Shape}
import java.awt.geom.AffineTransform
import java.lang.{Cloneable, Object}
import scala.scalanative.annotation.stub

/** A RenderContext encapsulates the information needed to produce a
 *  specific rendering from a RenderableImage.  It contains the area to
 *  be rendered specified in rendering-independent terms, the
 *  resolution at which the rendering is to be performed, and hints
 *  used to control the rendering process.
 * 
 *   Users create RenderContexts and pass them to the
 *  RenderableImage via the createRendering method.  Most of the methods of
 *  RenderContexts are not meant to be used directly by applications,
 *  but by the RenderableImage and operator classes to which it is
 *  passed.
 * 
 *   The AffineTransform parameter passed into and out of this class
 *  are cloned.  The RenderingHints and Shape parameters are not
 *  necessarily cloneable and are therefore only reference copied.
 *  Altering RenderingHints or Shape instances that are in use by
 *  instances of RenderContext may have undesired side effects.
 */
class RenderContext extends Object with Cloneable {

    /** Constructs a RenderContext with a given transform. */
    @stub
    def this(usr2dev: AffineTransform) = ???

    /** Constructs a RenderContext with a given transform and rendering hints. */
    @stub
    def this(usr2dev: AffineTransform, hints: RenderingHints) = ???

    /** Constructs a RenderContext with a given transform and area of interest. */
    @stub
    def this(usr2dev: AffineTransform, aoi: Shape) = ???

    /** Constructs a RenderContext with a given transform. */
    @stub
    def this(usr2dev: AffineTransform, aoi: Shape, hints: RenderingHints) = ???

    /** Makes a copy of a RenderContext. */
    @stub
    def clone(): Any = ???

    /** Modifies the current user-to-device transform by appending another
     *  transform.
     */
    @stub
    def concatenateTransform(modTransform: AffineTransform): Unit = ???

    /** Deprecated. 
     * replaced by
     *                  concatenateTransform(AffineTransform).
     * 
     */
    @stub
    def concetenateTransform(modTransform: AffineTransform): Unit = ???

    /** Gets the ares of interest currently contained in the
     *  RenderContext.
     */
    @stub
    def getAreaOfInterest(): Shape = ???

    /** Gets the rendering hints of this RenderContext. */
    @stub
    def getRenderingHints(): RenderingHints = ???

    /** Gets the current user-to-device AffineTransform. */
    @stub
    def getTransform(): AffineTransform = ???

    /** Modifies the current user-to-device transform by prepending another
     *  transform.
     */
    @stub
    def preConcatenateTransform(modTransform: AffineTransform): Unit = ???

    /** Deprecated. 
     * replaced by
     *                  preConcatenateTransform(AffineTransform).
     * 
     */
    @stub
    def preConcetenateTransform(modTransform: AffineTransform): Unit = ???

    /** Sets the current area of interest. */
    @stub
    def setAreaOfInterest(newAoi: Shape): Unit = ???

    /** Sets the rendering hints of this RenderContext. */
    @stub
    def setRenderingHints(hints: RenderingHints): Unit = ???

    /** Sets the current user-to-device AffineTransform contained
     *  in the RenderContext to a given transform.
     */
    @stub
    def setTransform(newTransform: AffineTransform): Unit = ???
}
