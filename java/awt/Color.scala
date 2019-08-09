package java.awt

import java.awt.color.ColorSpace
import java.awt.geom.{AffineTransform, Rectangle2D}
import java.awt.image.ColorModel
import java.io.Serializable
import java.lang.{Object, String}

// The Color class is used to encapsulate colors in the default
// sRGB color space or colors in arbitrary color spaces identified by a
// ColorSpace.  Every color has an implicit alpha value of 1.0 or
// an explicit one provided in the constructor.  The alpha value
// defines the transparency of a color and can be represented by
// a float value in the range 0.0 - 1.0 or 0 - 255.
// An alpha value of 1.0 or 255 means that the color is completely
// opaque and an alpha value of 0 or 0.0 means that the color is
// completely transparent.
// When constructing a Color with an explicit alpha or
// getting the color/alpha components of a Color, the color
// components are never premultiplied by the alpha component.
// 
// The default color space for the Java 2D(tm) API is sRGB, a proposed
// standard RGB color space.  For further information on sRGB,
// see 
// http://www.w3.org/pub/WWW/Graphics/Color/sRGB.html
// .
// 
class Color extends Object with Paint, with Serializable {

    @stub
    // Creates a color in the specified ColorSpace
    // with the color components specified in the float
    // array and the specified alpha.
    def this(cspace: ColorSpace, components: Array[float], alpha: float) = ???

    @stub
    // Creates an opaque sRGB color with the specified red, green, and blue
    // values in the range (0.0 - 1.0).
    def this(r: float, g: float, b: float) = ???

    @stub
    // Creates an sRGB color with the specified red, green, blue, and
    // alpha values in the range (0.0 - 1.0).
    def this(r: float, g: float, b: float, a: float) = ???

    @stub
    // Creates an opaque sRGB color with the specified combined RGB value
    // consisting of the red component in bits 16-23, the green component
    // in bits 8-15, and the blue component in bits 0-7.
    def this(rgb: Int) = ???

    @stub
    // Creates an sRGB color with the specified combined RGBA value consisting
    // of the alpha component in bits 24-31, the red component in bits 16-23,
    // the green component in bits 8-15, and the blue component in bits 0-7.
    def this(rgba: Int, hasalpha: Boolean) = ???

    @stub
    // Creates an opaque sRGB color with the specified red, green,
    // and blue values in the range (0 - 255).
    def this(r: Int, g: Int, b: Int) = ???

    @stub
    // Creates a new Color that is a brighter version of this
    // Color.
    def brighter(): Color = ???

    @stub
    // Creates and returns a PaintContext used to
    // generate a solid color field pattern.
    def createContext(cm: ColorModel, r: Rectangle, r2d: Rectangle2D, xform: AffineTransform, hints: RenderingHints): PaintContext = ???

    @stub
    // Creates a new Color that is a darker version of this
    // Color.
    def darker(): Color = ???

    @stub
    // Determines whether another object is equal to this
    // Color.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the alpha component in the range 0-255.
    def getAlpha(): Int = ???

    @stub
    // Returns the blue component in the range 0-255 in the default sRGB
    // space.
    def getBlue(): Int = ???

    @stub
    // Returns a float array containing only the color
    // components of the Color in the
    // ColorSpace specified by the cspace
    // parameter.
    def getColorComponents(cspace: ColorSpace, compArray: Array[float]): Array[float] = ???

    @stub
    // Returns a float array containing only the color
    // components of the Color, in the
    // ColorSpace of the Color.
    def getColorComponents(compArray: Array[float]): Array[float] = ???

    @stub
    // Returns the ColorSpace of this Color.
    def getColorSpace(): ColorSpace = ???

    @stub
    // Returns a float array containing the color and alpha
    // components of the Color, in the
    // ColorSpace specified by the cspace
    // parameter.
    def getComponents(cspace: ColorSpace, compArray: Array[float]): Array[float] = ???

    @stub
    // Returns a float array containing the color and alpha
    // components of the Color, in the
    // ColorSpace of the Color.
    def getComponents(compArray: Array[float]): Array[float] = ???

    @stub
    // Returns the green component in the range 0-255 in the default sRGB
    // space.
    def getGreen(): Int = ???

    @stub
    // Returns the red component in the range 0-255 in the default sRGB
    // space.
    def getRed(): Int = ???

    @stub
    // Returns the RGB value representing the color in the default sRGB
    // ColorModel.
    def getRGB(): Int = ???

    @stub
    // Returns a float array containing only the color
    // components of the Color, in the default sRGB color
    // space.
    def getRGBColorComponents(compArray: Array[float]): Array[float] = ???

    @stub
    // Returns a float array containing the color and alpha
    // components of the Color, as represented in the default
    // sRGB color space.
    def getRGBComponents(compArray: Array[float]): Array[float] = ???

    @stub
    // Returns the transparency mode for this Color.
    def getTransparency(): Int = ???

    @stub
    // Computes the hash code for this Color.
    def hashCode(): Int = ???
}

object Color {
    @stub
    // The color black.
    def black: Color = ???

    @stub
    // The color black.
    def BLACK: Color = ???

    @stub
    // The color blue.
    def blue: Color = ???

    @stub
    // The color blue.
    def BLUE: Color = ???

    @stub
    // The color cyan.
    def cyan: Color = ???

    @stub
    // The color cyan.
    def CYAN: Color = ???

    @stub
    // The color dark gray.
    def DARK_GRAY: Color = ???

    @stub
    // The color dark gray.
    def darkGray: Color = ???

    @stub
    // The color gray.
    def gray: Color = ???

    @stub
    // The color gray.
    def GRAY: Color = ???

    @stub
    // The color green.
    def green: Color = ???

    @stub
    // The color green.
    def GREEN: Color = ???

    @stub
    // The color light gray.
    def LIGHT_GRAY: Color = ???

    @stub
    // The color light gray.
    def lightGray: Color = ???

    @stub
    // The color magenta.
    def magenta: Color = ???

    @stub
    // The color magenta.
    def MAGENTA: Color = ???

    @stub
    // The color orange.
    def orange: Color = ???

    @stub
    // The color orange.
    def ORANGE: Color = ???

    @stub
    // The color pink.
    def pink: Color = ???

    @stub
    // The color pink.
    def PINK: Color = ???

    @stub
    // The color red.
    def red: Color = ???

    @stub
    // The color red.
    def RED: Color = ???

    @stub
    // The color white.
    def white: Color = ???

    @stub
    // The color white.
    def WHITE: Color = ???

    @stub
    // The color yellow.
    def yellow: Color = ???

    @stub
    // Converts a String to an integer and returns the
    // specified opaque Color.
    def decode(nm: String): Color = ???

    @stub
    // Finds a color in the system properties.
    def getColor(nm: String): Color = ???

    @stub
    // Finds a color in the system properties.
    def getColor(nm: String, v: Color): Color = ???

    @stub
    // Finds a color in the system properties.
    def getColor(nm: String, v: Int): Color = ???

    @stub
    // Creates a Color object based on the specified values
    // for the HSB color model.
    def getHSBColor(h: float, s: float, b: float): Color = ???

    @stub
    // Converts the components of a color, as specified by the HSB
    // model, to an equivalent set of values for the default RGB model.
    def HSBtoRGB(hue: float, saturation: float, brightness: float): Int = ???

    @stub
    // Converts the components of a color, as specified by the default RGB
    // model, to an equivalent set of values for hue, saturation, and
    // brightness that are the three components of the HSB model.
    def RGBtoHSB(r: Int, g: Int, b: Int, hsbvals: Array[float]): Array[float] = ???
}
