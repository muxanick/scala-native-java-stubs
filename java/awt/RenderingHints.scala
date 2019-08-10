package java.awt

import java.lang.{Cloneable, Object, String}
import java.util.{Collection, Map, Map.Entry, Set}
import scala.scalanative.annotation.stub

/** The RenderingHints class defines and manages collections of
 *  keys and associated values which allow an application to provide input
 *  into the choice of algorithms used by other classes which perform
 *  rendering and image manipulation services.
 *  The Graphics2D class, and classes that implement
 *  BufferedImageOp and
 *  RasterOp all provide methods to get and
 *  possibly to set individual or groups of RenderingHints
 *  keys and their associated values.
 *  When those implementations perform any rendering or image manipulation
 *  operations they should examine the values of any RenderingHints
 *  that were requested by the caller and tailor the algorithms used
 *  accordingly and to the best of their ability.
 *  
 *  Note that since these keys and values are hints, there is
 *  no requirement that a given implementation supports all possible
 *  choices indicated below or that it can respond to requests to
 *  modify its choice of algorithm.
 *  The values of the various hint keys may also interact such that
 *  while all variants of a given key are supported in one situation,
 *  the implementation may be more restricted when the values associated
 *  with other keys are modified.
 *  For example, some implementations may be able to provide several
 *  types of dithering when the antialiasing hint is turned off, but
 *  have little control over dithering when antialiasing is on.
 *  The full set of supported keys and hints may also vary by destination
 *  since runtimes may use different underlying modules to render to
 *  the screen, or to BufferedImage objects,
 *  or while printing.
 *  
 *  Implementations are free to ignore the hints completely, but should
 *  try to use an implementation algorithm that is as close as possible
 *  to the request.
 *  If an implementation supports a given algorithm when any value is used
 *  for an associated hint key, then minimally it must do so when the
 *  value for that key is the exact value that specifies the algorithm.
 *  
 *  The keys used to control the hints are all special values that
 *  subclass the associated RenderingHints.Key class.
 *  Many common hints are expressed below as static constants in this
 *  class, but the list is not meant to be exhaustive.
 *  Other hints may be created by other packages by defining new objects
 *  which subclass the Key class and defining the associated values.
 */
class RenderingHints extends Object with Map[Object, Object] with Cloneable {

    /** Constructs a new object with keys and values initialized
     *  from the specified Map object which may be null.
     */
    @stub
    def this(init: Map[RenderingHints.Key, _]) = ???

    /** Constructs a new object with the specified key/value pair. */
    @stub
    def this(key: RenderingHints.Key, value: Any) = ???

    /** Adds all of the keys and corresponding values from the specified
     *  RenderingHints object to this
     *  RenderingHints object.
     */
    @stub
    def add(hints: RenderingHints): Unit = ???

    /** Clears this RenderingHints object of all key/value
     *  pairs.
     */
    @stub
    def clear(): Unit = ???

    /** Creates a clone of this RenderingHints object
     *  that has the same contents as this RenderingHints
     *  object.
     */
    @stub
    def clone(): Any = ???

    /** Returns true if this RenderingHints
     *   contains a mapping for the specified key.
     */
    @stub
    def containsKey(key: Any): Boolean = ???

    /** Returns true if this RenderingHints maps one or more keys to the
     *  specified value.
     */
    @stub
    def containsValue(value: Any): Boolean = ???

    /** Returns a Set view of the mappings contained
     *  in this RenderingHints.
     */
    @stub
    def entrySet(): Set[Map.Entry[Object, Object]] = ???

    /** Compares the specified Object with this
     *  RenderingHints for equality.
     */
    @stub
    def equals(o: Any): Boolean = ???

    /** Returns the value to which the specified key is mapped. */
    @stub
    def get(key: Any): Any = ???

    /** Returns the hash code value for this RenderingHints. */
    @stub
    def hashCode(): Int = ???

    /** Returns true if this
     *  RenderingHints contains no key-value mappings.
     */
    @stub
    def isEmpty(): Boolean = ???

    /** Returns a Set view of the Keys contained in this
     *  RenderingHints.
     */
    @stub
    def keySet(): Set[Object] = ???

    /** Maps the specified key to the specified
     *  value in this RenderingHints object.
     */
    @stub
    def put(key: Any, value: Any): Any = ???

    /** Copies all of the mappings from the specified Map
     *  to this RenderingHints.
     */
    @stub
    def putAll(m: Map[_, _]): Unit = ???

    /** Removes the key and its corresponding value from this
     *  RenderingHints object.
     */
    @stub
    def remove(key: Any): Any = ???

    /** Returns the number of key-value mappings in this
     *  RenderingHints.
     */
    @stub
    def size(): Int = ???

    /** Returns a rather long string representation of the hashmap
     *  which contains the mappings of keys to values for this
     *  RenderingHints object.
     */
    @stub
    def toString(): String = ???

    /** Returns a Collection view of the values
     *  contained in this RenderinHints.
     */
    @stub
    def values(): Collection[Object] = ???
}

object RenderingHints {
    /** Defines the base type of all keys used along with the
     *  RenderingHints class to control various
     *  algorithm choices in the rendering and imaging pipelines.
     *  Instances of this class are immutable and unique which
     *  means that tests for matches can be made using the
     *  == operator instead of the more expensive
     *  equals() method.
     */
    abstract object Key extends Object {

        /** Construct a key using the indicated private key. */
        @stub
        protected def apply(privatekey: Int) = ???

        /** The equals method for all Key objects will return the same
         *  result as the equality operator '=='.
         */
        @stub
        def equals(o: Any): Boolean = ???

        /** The hash code for all Key objects will be the same as the
         *  system identity code of the object as defined by the
         *  System.identityHashCode() method.
         */
        @stub
        def hashCode(): Int = ???

        /** Returns the private integer key that the subclass
         *  instantiated this Key with.
         */
        @stub
        protected def intKey(): Int = ???

        /** Returns true if the specified object is a valid value
         *  for this Key.
         */
        def isCompatibleValue(val: Any): Boolean
    }


    /** Alpha interpolation hint key. */
    @stub
    val KEY_ALPHA_INTERPOLATION: RenderingHints.Key = ???

    /** Antialiasing hint key. */
    @stub
    val KEY_ANTIALIASING: RenderingHints.Key = ???

    /** Color rendering hint key. */
    @stub
    val KEY_COLOR_RENDERING: RenderingHints.Key = ???

    /** Dithering hint key. */
    @stub
    val KEY_DITHERING: RenderingHints.Key = ???

    /** Font fractional metrics hint key. */
    @stub
    val KEY_FRACTIONALMETRICS: RenderingHints.Key = ???

    /** Interpolation hint key. */
    @stub
    val KEY_INTERPOLATION: RenderingHints.Key = ???

    /** Rendering hint key. */
    @stub
    val KEY_RENDERING: RenderingHints.Key = ???

    /** Stroke normalization control hint key. */
    @stub
    val KEY_STROKE_CONTROL: RenderingHints.Key = ???

    /** Text antialiasing hint key. */
    @stub
    val KEY_TEXT_ANTIALIASING: RenderingHints.Key = ???

    /** LCD text contrast rendering hint key. */
    @stub
    val KEY_TEXT_LCD_CONTRAST: RenderingHints.Key = ???

    /** Alpha interpolation hint value -- alpha blending algorithms
     *  are chosen by the implementation for a good tradeoff of
     *  performance vs.
     */
    @stub
    val VALUE_ALPHA_INTERPOLATION_DEFAULT: Any = ???

    /** Alpha interpolation hint value -- alpha blending algorithms
     *  are chosen with a preference for precision and visual quality.
     */
    @stub
    val VALUE_ALPHA_INTERPOLATION_QUALITY: Any = ???

    /** Alpha interpolation hint value -- alpha blending algorithms
     *  are chosen with a preference for calculation speed.
     */
    @stub
    val VALUE_ALPHA_INTERPOLATION_SPEED: Any = ???

    /** Antialiasing hint value -- rendering is done with a default
     *  antialiasing mode chosen by the implementation.
     */
    @stub
    val VALUE_ANTIALIAS_DEFAULT: Any = ???

    /** Antialiasing hint value -- rendering is done without antialiasing. */
    @stub
    val VALUE_ANTIALIAS_OFF: Any = ???

    /** Antialiasing hint value -- rendering is done with antialiasing. */
    @stub
    val VALUE_ANTIALIAS_ON: Any = ???

    /** Color rendering hint value -- perform color conversion
     *  calculations as chosen by the implementation to represent
     *  the best available tradeoff between performance and
     *  accuracy.
     */
    @stub
    val VALUE_COLOR_RENDER_DEFAULT: Any = ???

    /** Color rendering hint value -- perform the color conversion
     *  calculations with the highest accuracy and visual quality.
     */
    @stub
    val VALUE_COLOR_RENDER_QUALITY: Any = ???

    /** Color rendering hint value -- perform the fastest color
     *  conversion to the format of the output device.
     */
    @stub
    val VALUE_COLOR_RENDER_SPEED: Any = ???

    /** Dithering hint value -- use a default for dithering chosen by
     *  the implementation.
     */
    @stub
    val VALUE_DITHER_DEFAULT: Any = ???

    /** Dithering hint value -- do not dither when rendering geometry. */
    @stub
    val VALUE_DITHER_DISABLE: Any = ???

    /** Dithering hint value -- dither when rendering geometry, if needed. */
    @stub
    val VALUE_DITHER_ENABLE: Any = ???

    /** Font fractional metrics hint value -- character glyphs are
     *  positioned with accuracy chosen by the implementation.
     */
    @stub
    val VALUE_FRACTIONALMETRICS_DEFAULT: Any = ???

    /** Font fractional metrics hint value -- character glyphs are
     *  positioned with advance widths rounded to pixel boundaries.
     */
    @stub
    val VALUE_FRACTIONALMETRICS_OFF: Any = ???

    /** Font fractional metrics hint value -- character glyphs are
     *  positioned with sub-pixel accuracy.
     */
    @stub
    val VALUE_FRACTIONALMETRICS_ON: Any = ???

    /** Interpolation hint value -- the color samples of 9 nearby
     *  integer coordinate samples in the image are interpolated using
     *  a cubic function in both X and Y to produce
     *  a color sample.
     */
    @stub
    val VALUE_INTERPOLATION_BICUBIC: Any = ???

    /** Interpolation hint value -- the color samples of the 4 nearest
     *  neighboring integer coordinate samples in the image are
     *  interpolated linearly to produce a color sample.
     */
    @stub
    val VALUE_INTERPOLATION_BILINEAR: Any = ???

    /** Interpolation hint value -- the color sample of the nearest
     *  neighboring integer coordinate sample in the image is used.
     */
    @stub
    val VALUE_INTERPOLATION_NEAREST_NEIGHBOR: Any = ???

    /** Rendering hint value -- rendering algorithms are chosen
     *  by the implementation for a good tradeoff of performance
     *  vs.
     */
    @stub
    val VALUE_RENDER_DEFAULT: Any = ???

    /** Rendering hint value -- rendering algorithms are chosen
     *  with a preference for output quality.
     */
    @stub
    val VALUE_RENDER_QUALITY: Any = ???

    /** Rendering hint value -- rendering algorithms are chosen
     *  with a preference for output speed.
     */
    @stub
    val VALUE_RENDER_SPEED: Any = ???

    /** Stroke normalization control hint value -- geometry may be
     *  modified or left pure depending on the tradeoffs in a given
     *  implementation.
     */
    @stub
    val VALUE_STROKE_DEFAULT: Any = ???

    /** Stroke normalization control hint value -- geometry should
     *  be normalized to improve uniformity or spacing of lines and
     *  overall aesthetics.
     */
    @stub
    val VALUE_STROKE_NORMALIZE: Any = ???

    /** Stroke normalization control hint value -- geometry should
     *  be left unmodified and rendered with sub-pixel accuracy.
     */
    @stub
    val VALUE_STROKE_PURE: Any = ???

    /** Text antialiasing hint value -- text rendering is done according
     *  to the KEY_ANTIALIASING hint or a default chosen by the
     *  implementation.
     */
    @stub
    val VALUE_TEXT_ANTIALIAS_DEFAULT: Any = ???

    /** Text antialiasing hint value -- text rendering is requested to
     *  use information in the font resource which specifies for each point
     *  size whether to apply VALUE_TEXT_ANTIALIAS_ON or
     *  VALUE_TEXT_ANTIALIAS_OFF.
     */
    @stub
    val VALUE_TEXT_ANTIALIAS_GASP: Any = ???

    /** Text antialiasing hint value -- request that text be displayed
     *  optimised for an LCD display with subpixels in order from display
     *  left to right of B,G,R such that the horizontal subpixel resolution
     *  is three times that of the full pixel horizontal resolution (HBGR).
     */
    @stub
    val VALUE_TEXT_ANTIALIAS_LCD_HBGR: Any = ???

    /** Text antialiasing hint value -- request that text be displayed
     *  optimised for an LCD display with subpixels in order from display
     *  left to right of R,G,B such that the horizontal subpixel resolution
     *  is three times that of the full pixel horizontal resolution (HRGB).
     */
    @stub
    val VALUE_TEXT_ANTIALIAS_LCD_HRGB: Any = ???

    /** Text antialiasing hint value -- request that text be displayed
     *  optimised for an LCD display with subpixel organisation from display
     *  top to bottom of B,G,R such that the vertical subpixel resolution is
     *  three times that of the full pixel vertical resolution (VBGR).
     */
    @stub
    val VALUE_TEXT_ANTIALIAS_LCD_VBGR: Any = ???

    /** Text antialiasing hint value -- request that text be displayed
     *  optimised for an LCD display with subpixel organisation from display
     *  top to bottom of R,G,B such that the vertical subpixel resolution is
     *  three times that of the full pixel vertical resolution (VRGB).
     */
    @stub
    val VALUE_TEXT_ANTIALIAS_LCD_VRGB: Any = ???

    /** Text antialiasing hint value -- text rendering is done without
     *  any form of antialiasing.
     */
    @stub
    val VALUE_TEXT_ANTIALIAS_OFF: Any = ???

    /** Text antialiasing hint value -- text rendering is done with
     *  some form of antialiasing.
     */
    @stub
    val VALUE_TEXT_ANTIALIAS_ON: Any = ???
}
