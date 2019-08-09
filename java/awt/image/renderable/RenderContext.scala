package java.awt.image.renderable

import java.awt.{RenderingHints, Shape}
import java.awt.geom.AffineTransform
import java.lang.{Cloneable, Object}

// A RenderContext encapsulates the information needed to produce a
// specific rendering from a RenderableImage.  It contains the area to
// be rendered specified in rendering-independent terms, the
// resolution at which the rendering is to be performed, and hints
// used to control the rendering process.
//
//  Users create RenderContexts and pass them to the
// RenderableImage via the createRendering method.  Most of the methods of
// RenderContexts are not meant to be used directly by applications,
// but by the RenderableImage and operator classes to which it is
// passed.
//
//  The AffineTransform parameter passed into and out of this class
// are cloned.  The RenderingHints and Shape parameters are not
// necessarily cloneable and are therefore only reference copied.
// Altering RenderingHints or Shape instances that are in use by
// instances of RenderContext may have undesired side effects.
class RenderContext extends Object with Cloneable {

    @stub
    // Constructs a RenderContext with a given transform.
    def this(usr2dev: AffineTransform) = ???

    @stub
    // Constructs a RenderContext with a given transform and rendering hints.
    def this(usr2dev: AffineTransform, hints: RenderingHints) = ???

    @stub
    // Constructs a RenderContext with a given transform and area of interest.
    def this(usr2dev: AffineTransform, aoi: Shape) = ???

    @stub
    // Makes a copy of a RenderContext.
    def clone(): Object = ???

    @stub
    // Modifies the current user-to-device transform by appending another
    // transform.
    def concatenateTransform(modTransform: AffineTransform): Unit = ???

    @stub
    // Deprecated. 
    //replaced by
    //                 concatenateTransform(AffineTransform).
    //
    def concetenateTransform(modTransform: AffineTransform): Unit = ???

    @stub
    // Gets the ares of interest currently contained in the
    // RenderContext.
    def getAreaOfInterest(): Shape = ???

    @stub
    // Gets the rendering hints of this RenderContext.
    def getRenderingHints(): RenderingHints = ???

    @stub
    // Gets the current user-to-device AffineTransform.
    def getTransform(): AffineTransform = ???

    @stub
    // Modifies the current user-to-device transform by prepending another
    // transform.
    def preConcatenateTransform(modTransform: AffineTransform): Unit = ???

    @stub
    // Deprecated. 
    //replaced by
    //                 preConcatenateTransform(AffineTransform).
    //
    def preConcetenateTransform(modTransform: AffineTransform): Unit = ???

    @stub
    // Sets the current area of interest.
    def setAreaOfInterest(newAoi: Shape): Unit = ???

    @stub
    // Sets the rendering hints of this RenderContext.
    def setRenderingHints(hints: RenderingHints): Unit = ???
}
