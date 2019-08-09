package java.awt

import java.awt.color.ColorSpace
import java.awt.geom.{AffineTransform, Rectangle2D}
import java.awt.image.ColorModel
import java.io.Serializable
import java.lang.{Object, String}

/** The Color class is used to encapsulate colors in the default
 *  sRGB color space or colors in arbitrary color spaces identified by a
 *  ColorSpace.  Every color has an implicit alpha value of 1.0 or
 *  an explicit one provided in the constructor.  The alpha value
 *  defines the transparency of a color and can be represented by
 *  a float value in the range 0.0 - 1.0 or 0 - 255.
 *  An alpha value of 1.0 or 255 means that the color is completely
 *  opaque and an alpha value of 0 or 0.0 means that the color is
 *  completely transparent.
 *  When constructing a Color with an explicit alpha or
 *  getting the color/alpha components of a Color, the color
 *  components are never premultiplied by the alpha component.
 *  
 *  The default color space for the Java 2D(tm) API is sRGB, a proposed
 *  standard RGB color space.  For further information on sRGB,
 *  see 
 *  http://www.w3.org/pub/WWW/Graphics/Color/sRGB.html
 *  .
 *  
 */
class Color extends Object with Paint with Serializable {

    /** Creates a color in the specified ColorSpace
     *  with the color components specified in the float
     *  array and the specified alpha.
     */
    @stub
    def this(cspace: ColorSpace, components: Array[Float], alpha: Float) = ???

    /** Creates an opaque sRGB color with the specified red, green, and blue
     *  values in the range (0.0 - 1.0).
     */
    @stub
    def this(r: Float, g: Float, b: Float) = ???

    /** Creates an sRGB color with the specified red, green, blue, and
     *  alpha values in the range (0.0 - 1.0).
     */
    @stub
    def this(r: Float, g: Float, b: Float, a: Float) = ???

    /** Creates an opaque sRGB color with the specified combined RGB value
     *  consisting of the red component in bits 16-23, the green component
     *  in bits 8-15, and the blue component in bits 0-7.
     */
    @stub
    def this(rgb: Int) = ???

    /** Creates an sRGB color with the specified combined RGBA value consisting
     *  of the alpha component in bits 24-31, the red component in bits 16-23,
     *  the green component in bits 8-15, and the blue component in bits 0-7.
     */
    @stub
    def this(rgba: Int, hasalpha: Boolean) = ???

    /** Creates an opaque sRGB color with the specified red, green,
     *  and blue values in the range (0 - 255).
     */
    @stub
    def this(r: Int, g: Int, b: Int) = ???

    /** Creates a new Color that is a brighter version of this
     *  Color.
     */
    @stub
    def brighter(): Color = ???

    /** Creates and returns a PaintContext used to
     *  generate a solid color field pattern.
     */
    @stub
    def createContext(cm: ColorModel, r: Rectangle, r2d: Rectangle2D, xform: AffineTransform, hints: RenderingHints): PaintContext = ???

    /** Creates a new Color that is a darker version of this
     *  Color.
     */
    @stub
    def darker(): Color = ???

    /** Determines whether another object is equal to this
     *  Color.
     */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the alpha component in the range 0-255. */
    @stub
    def getAlpha(): Int = ???

    /** Returns the blue component in the range 0-255 in the default sRGB
     *  space.
     */
    @stub
    def getBlue(): Int = ???

    /** Returns a float array containing only the color
     *  components of the Color in the
     *  ColorSpace specified by the cspace
     *  parameter.
     */
    @stub
    def getColorComponents(cspace: ColorSpace, compArray: Array[Float]): Array[Float] = ???

    /** Returns a float array containing only the color
     *  components of the Color, in the
     *  ColorSpace of the Color.
     */
    @stub
    def getColorComponents(compArray: Array[Float]): Array[Float] = ???

    /** Returns the ColorSpace of this Color. */
    @stub
    def getColorSpace(): ColorSpace = ???

    /** Returns a float array containing the color and alpha
     *  components of the Color, in the
     *  ColorSpace specified by the cspace
     *  parameter.
     */
    @stub
    def getComponents(cspace: ColorSpace, compArray: Array[Float]): Array[Float] = ???

    /** Returns a float array containing the color and alpha
     *  components of the Color, in the
     *  ColorSpace of the Color.
     */
    @stub
    def getComponents(compArray: Array[Float]): Array[Float] = ???

    /** Returns the green component in the range 0-255 in the default sRGB
     *  space.
     */
    @stub
    def getGreen(): Int = ???

    /** Returns the red component in the range 0-255 in the default sRGB
     *  space.
     */
    @stub
    def getRed(): Int = ???

    /** Returns the RGB value representing the color in the default sRGB
     *  ColorModel.
     */
    @stub
    def getRGB(): Int = ???

    /** Returns a float array containing only the color
     *  components of the Color, in the default sRGB color
     *  space.
     */
    @stub
    def getRGBColorComponents(compArray: Array[Float]): Array[Float] = ???

    /** Returns a float array containing the color and alpha
     *  components of the Color, as represented in the default
     *  sRGB color space.
     */
    @stub
    def getRGBComponents(compArray: Array[Float]): Array[Float] = ???

    /** Returns the transparency mode for this Color. */
    @stub
    def getTransparency(): Int = ???

    /** Computes the hash code for this Color. */
    @stub
    def hashCode(): Int = ???
}

object Color {
    /** The color black. */
    @stub
    val black: Color = ???

    /** The color black. */
    @stub
    val BLACK: Color = ???

    /** The color blue. */
    @stub
    val blue: Color = ???

    /** The color blue. */
    @stub
    val BLUE: Color = ???

    /** The color cyan. */
    @stub
    val cyan: Color = ???

    /** The color cyan. */
    @stub
    val CYAN: Color = ???

    /** The color dark gray. */
    @stub
    val DARK_GRAY: Color = ???

    /** The color dark gray. */
    @stub
    val darkGray: Color = ???

    /** The color gray. */
    @stub
    val gray: Color = ???

    /** The color gray. */
    @stub
    val GRAY: Color = ???

    /** The color green. */
    @stub
    val green: Color = ???

    /** The color green. */
    @stub
    val GREEN: Color = ???

    /** The color light gray. */
    @stub
    val LIGHT_GRAY: Color = ???

    /** The color light gray. */
    @stub
    val lightGray: Color = ???

    /** The color magenta. */
    @stub
    val magenta: Color = ???

    /** The color magenta. */
    @stub
    val MAGENTA: Color = ???

    /** The color orange. */
    @stub
    val orange: Color = ???

    /** The color orange. */
    @stub
    val ORANGE: Color = ???

    /** The color pink. */
    @stub
    val pink: Color = ???

    /** The color pink. */
    @stub
    val PINK: Color = ???

    /** The color red. */
    @stub
    val red: Color = ???

    /** The color red. */
    @stub
    val RED: Color = ???

    /** The color white. */
    @stub
    val white: Color = ???

    /** The color white. */
    @stub
    val WHITE: Color = ???

    /** The color yellow. */
    @stub
    val yellow: Color = ???

    /** Converts a String to an integer and returns the
     *  specified opaque Color.
     */
    @stub
    def decode(nm: String): Color = ???

    /** Finds a color in the system properties. */
    @stub
    def getColor(nm: String): Color = ???

    /** Finds a color in the system properties. */
    @stub
    def getColor(nm: String, v: Color): Color = ???

    /** Finds a color in the system properties. */
    @stub
    def getColor(nm: String, v: Int): Color = ???

    /** Creates a Color object based on the specified values
     *  for the HSB color model.
     */
    @stub
    def getHSBColor(h: Float, s: Float, b: Float): Color = ???

    /** Converts the components of a color, as specified by the HSB
     *  model, to an equivalent set of values for the default RGB model.
     */
    @stub
    def HSBtoRGB(hue: Float, saturation: Float, brightness: Float): Int = ???

    /** Converts the components of a color, as specified by the default RGB
     *  model, to an equivalent set of values for hue, saturation, and
     *  brightness that are the three components of the HSB model.
     */
    @stub
    def RGBtoHSB(r: Int, g: Int, b: Int, hsbvals: Array[Float]): Array[Float] = ???
}
