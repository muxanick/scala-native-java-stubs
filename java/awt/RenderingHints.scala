package java.awt

import java.lang.{Cloneable, Object, String}
import java.util.{Map, Map.Entry, Set}

// The RenderingHints class defines and manages collections of
// keys and associated values which allow an application to provide input
// into the choice of algorithms used by other classes which perform
// rendering and image manipulation services.
// The Graphics2D class, and classes that implement
// BufferedImageOp and
// RasterOp all provide methods to get and
// possibly to set individual or groups of RenderingHints
// keys and their associated values.
// When those implementations perform any rendering or image manipulation
// operations they should examine the values of any RenderingHints
// that were requested by the caller and tailor the algorithms used
// accordingly and to the best of their ability.
// 
// Note that since these keys and values are hints, there is
// no requirement that a given implementation supports all possible
// choices indicated below or that it can respond to requests to
// modify its choice of algorithm.
// The values of the various hint keys may also interact such that
// while all variants of a given key are supported in one situation,
// the implementation may be more restricted when the values associated
// with other keys are modified.
// For example, some implementations may be able to provide several
// types of dithering when the antialiasing hint is turned off, but
// have little control over dithering when antialiasing is on.
// The full set of supported keys and hints may also vary by destination
// since runtimes may use different underlying modules to render to
// the screen, or to BufferedImage objects,
// or while printing.
// 
// Implementations are free to ignore the hints completely, but should
// try to use an implementation algorithm that is as close as possible
// to the request.
// If an implementation supports a given algorithm when any value is used
// for an associated hint key, then minimally it must do so when the
// value for that key is the exact value that specifies the algorithm.
// 
// The keys used to control the hints are all special values that
// subclass the associated RenderingHints.Key class.
// Many common hints are expressed below as static constants in this
// class, but the list is not meant to be exhaustive.
// Other hints may be created by other packages by defining new objects
// which subclass the Key class and defining the associated values.
class RenderingHints extends Object with Map[Object, Object], with Cloneable {

    @stub
    // Constructs a new object with keys and values initialized
    // from the specified Map object which may be null.
    def this(init: Map[RenderingHints.Key, _]) = ???

    @stub
    // Adds all of the keys and corresponding values from the specified
    // RenderingHints object to this
    // RenderingHints object.
    def add(hints: RenderingHints): Unit = ???

    @stub
    // Clears this RenderingHints object of all key/value
    // pairs.
    def clear(): Unit = ???

    @stub
    // Creates a clone of this RenderingHints object
    // that has the same contents as this RenderingHints
    // object.
    def clone(): Object = ???

    @stub
    // Returns true if this RenderingHints
    //  contains a mapping for the specified key.
    def containsKey(key: Object): Boolean = ???

    @stub
    // Returns true if this RenderingHints maps one or more keys to the
    // specified value.
    def containsValue(value: Object): Boolean = ???

    @stub
    // Returns a Set view of the mappings contained
    // in this RenderingHints.
    def entrySet(): Set[Map.Entry[Object, Object]] = ???

    @stub
    // Compares the specified Object with this
    // RenderingHints for equality.
    def equals(o: Object): Boolean = ???

    @stub
    // Returns the value to which the specified key is mapped.
    def get(key: Object): Object = ???

    @stub
    // Returns the hash code value for this RenderingHints.
    def hashCode(): Int = ???

    @stub
    // Returns true if this
    // RenderingHints contains no key-value mappings.
    def isEmpty(): Boolean = ???

    @stub
    // Returns a Set view of the Keys contained in this
    // RenderingHints.
    def keySet(): Set[Object] = ???

    @stub
    // Maps the specified key to the specified
    // value in this RenderingHints object.
    def put(key: Object, value: Object): Object = ???

    @stub
    // Copies all of the mappings from the specified Map
    // to this RenderingHints.
    def putAll(m: Map[_, _]): Unit = ???

    @stub
    // Removes the key and its corresponding value from this
    // RenderingHints object.
    def remove(key: Object): Object = ???

    @stub
    // Returns the number of key-value mappings in this
    // RenderingHints.
    def size(): Int = ???

    @stub
    // Returns a rather long string representation of the hashmap
    // which contains the mappings of keys to values for this
    // RenderingHints object.
    def toString(): String = ???
}

object RenderingHints {
    @stub
    // Alpha interpolation hint key.
    def KEY_ALPHA_INTERPOLATION: RenderingHints.Key = ???

    @stub
    // Antialiasing hint key.
    def KEY_ANTIALIASING: RenderingHints.Key = ???

    @stub
    // Color rendering hint key.
    def KEY_COLOR_RENDERING: RenderingHints.Key = ???

    @stub
    // Dithering hint key.
    def KEY_DITHERING: RenderingHints.Key = ???

    @stub
    // Font fractional metrics hint key.
    def KEY_FRACTIONALMETRICS: RenderingHints.Key = ???

    @stub
    // Interpolation hint key.
    def KEY_INTERPOLATION: RenderingHints.Key = ???

    @stub
    // Rendering hint key.
    def KEY_RENDERING: RenderingHints.Key = ???

    @stub
    // Stroke normalization control hint key.
    def KEY_STROKE_CONTROL: RenderingHints.Key = ???

    @stub
    // Text antialiasing hint key.
    def KEY_TEXT_ANTIALIASING: RenderingHints.Key = ???

    @stub
    // LCD text contrast rendering hint key.
    def KEY_TEXT_LCD_CONTRAST: RenderingHints.Key = ???

    @stub
    // Alpha interpolation hint value -- alpha blending algorithms
    // are chosen by the implementation for a good tradeoff of
    // performance vs.
    def VALUE_ALPHA_INTERPOLATION_DEFAULT: Object = ???

    @stub
    // Alpha interpolation hint value -- alpha blending algorithms
    // are chosen with a preference for precision and visual quality.
    def VALUE_ALPHA_INTERPOLATION_QUALITY: Object = ???

    @stub
    // Alpha interpolation hint value -- alpha blending algorithms
    // are chosen with a preference for calculation speed.
    def VALUE_ALPHA_INTERPOLATION_SPEED: Object = ???

    @stub
    // Antialiasing hint value -- rendering is done with a default
    // antialiasing mode chosen by the implementation.
    def VALUE_ANTIALIAS_DEFAULT: Object = ???

    @stub
    // Antialiasing hint value -- rendering is done without antialiasing.
    def VALUE_ANTIALIAS_OFF: Object = ???

    @stub
    // Antialiasing hint value -- rendering is done with antialiasing.
    def VALUE_ANTIALIAS_ON: Object = ???

    @stub
    // Color rendering hint value -- perform color conversion
    // calculations as chosen by the implementation to represent
    // the best available tradeoff between performance and
    // accuracy.
    def VALUE_COLOR_RENDER_DEFAULT: Object = ???

    @stub
    // Color rendering hint value -- perform the color conversion
    // calculations with the highest accuracy and visual quality.
    def VALUE_COLOR_RENDER_QUALITY: Object = ???

    @stub
    // Color rendering hint value -- perform the fastest color
    // conversion to the format of the output device.
    def VALUE_COLOR_RENDER_SPEED: Object = ???

    @stub
    // Dithering hint value -- use a default for dithering chosen by
    // the implementation.
    def VALUE_DITHER_DEFAULT: Object = ???

    @stub
    // Dithering hint value -- do not dither when rendering geometry.
    def VALUE_DITHER_DISABLE: Object = ???

    @stub
    // Dithering hint value -- dither when rendering geometry, if needed.
    def VALUE_DITHER_ENABLE: Object = ???

    @stub
    // Font fractional metrics hint value -- character glyphs are
    // positioned with accuracy chosen by the implementation.
    def VALUE_FRACTIONALMETRICS_DEFAULT: Object = ???

    @stub
    // Font fractional metrics hint value -- character glyphs are
    // positioned with advance widths rounded to pixel boundaries.
    def VALUE_FRACTIONALMETRICS_OFF: Object = ???

    @stub
    // Font fractional metrics hint value -- character glyphs are
    // positioned with sub-pixel accuracy.
    def VALUE_FRACTIONALMETRICS_ON: Object = ???

    @stub
    // Interpolation hint value -- the color samples of 9 nearby
    // integer coordinate samples in the image are interpolated using
    // a cubic function in both X and Y to produce
    // a color sample.
    def VALUE_INTERPOLATION_BICUBIC: Object = ???

    @stub
    // Interpolation hint value -- the color samples of the 4 nearest
    // neighboring integer coordinate samples in the image are
    // interpolated linearly to produce a color sample.
    def VALUE_INTERPOLATION_BILINEAR: Object = ???

    @stub
    // Interpolation hint value -- the color sample of the nearest
    // neighboring integer coordinate sample in the image is used.
    def VALUE_INTERPOLATION_NEAREST_NEIGHBOR: Object = ???

    @stub
    // Rendering hint value -- rendering algorithms are chosen
    // by the implementation for a good tradeoff of performance
    // vs.
    def VALUE_RENDER_DEFAULT: Object = ???

    @stub
    // Rendering hint value -- rendering algorithms are chosen
    // with a preference for output quality.
    def VALUE_RENDER_QUALITY: Object = ???

    @stub
    // Rendering hint value -- rendering algorithms are chosen
    // with a preference for output speed.
    def VALUE_RENDER_SPEED: Object = ???

    @stub
    // Stroke normalization control hint value -- geometry may be
    // modified or left pure depending on the tradeoffs in a given
    // implementation.
    def VALUE_STROKE_DEFAULT: Object = ???

    @stub
    // Stroke normalization control hint value -- geometry should
    // be normalized to improve uniformity or spacing of lines and
    // overall aesthetics.
    def VALUE_STROKE_NORMALIZE: Object = ???

    @stub
    // Stroke normalization control hint value -- geometry should
    // be left unmodified and rendered with sub-pixel accuracy.
    def VALUE_STROKE_PURE: Object = ???

    @stub
    // Text antialiasing hint value -- text rendering is done according
    // to the KEY_ANTIALIASING hint or a default chosen by the
    // implementation.
    def VALUE_TEXT_ANTIALIAS_DEFAULT: Object = ???

    @stub
    // Text antialiasing hint value -- text rendering is requested to
    // use information in the font resource which specifies for each point
    // size whether to apply VALUE_TEXT_ANTIALIAS_ON or
    // VALUE_TEXT_ANTIALIAS_OFF.
    def VALUE_TEXT_ANTIALIAS_GASP: Object = ???

    @stub
    // Text antialiasing hint value -- request that text be displayed
    // optimised for an LCD display with subpixels in order from display
    // left to right of B,G,R such that the horizontal subpixel resolution
    // is three times that of the full pixel horizontal resolution (HBGR).
    def VALUE_TEXT_ANTIALIAS_LCD_HBGR: Object = ???

    @stub
    // Text antialiasing hint value -- request that text be displayed
    // optimised for an LCD display with subpixels in order from display
    // left to right of R,G,B such that the horizontal subpixel resolution
    // is three times that of the full pixel horizontal resolution (HRGB).
    def VALUE_TEXT_ANTIALIAS_LCD_HRGB: Object = ???

    @stub
    // Text antialiasing hint value -- request that text be displayed
    // optimised for an LCD display with subpixel organisation from display
    // top to bottom of B,G,R such that the vertical subpixel resolution is
    // three times that of the full pixel vertical resolution (VBGR).
    def VALUE_TEXT_ANTIALIAS_LCD_VBGR: Object = ???

    @stub
    // Text antialiasing hint value -- request that text be displayed
    // optimised for an LCD display with subpixel organisation from display
    // top to bottom of R,G,B such that the vertical subpixel resolution is
    // three times that of the full pixel vertical resolution (VRGB).
    def VALUE_TEXT_ANTIALIAS_LCD_VRGB: Object = ???

    @stub
    // Text antialiasing hint value -- text rendering is done without
    // any form of antialiasing.
    def VALUE_TEXT_ANTIALIAS_OFF: Object = ???
}
