package javax.imageio

import java.awt.color.ColorSpace
import java.awt.image.{BufferedImage, ColorModel, RenderedImage, SampleModel}
import java.lang.Object
import scala.scalanative.annotation.stub

/** A class that allows the format of an image (in particular, its
 *  SampleModel and ColorModel) to be
 *  specified in a convenient manner.
 */
class ImageTypeSpecifier extends Object {

    /** Constructs an ImageTypeSpecifier directly
     *  from a ColorModel and a SampleModel.
     */
    @stub
    def this(colorModel: ColorModel, sampleModel: SampleModel) = ???

    /** Constructs an ImageTypeSpecifier from a
     *  RenderedImage.
     */
    @stub
    def this(image: RenderedImage) = ???

    /** The ColorModel to be used as a prototype. */
    @stub
    protected val colorModel: ColorModel = ???

    /** A SampleModel to be used as a prototype. */
    @stub
    protected val sampleModel: SampleModel = ???

    /** Creates a BufferedImage with a given width and
     *  height according to the specification embodied in this object.
     */
    @stub
    def createBufferedImage(width: Int, height: Int): BufferedImage = ???

    /** Returns true if the given Object is
     *  an ImageTypeSpecifier and has a
     *  SampleModel and ColorModel that are
     *  equal to those of this object.
     */
    @stub
    def equals(o: Object): Boolean = ???

    /** Return the number of bits used to represent samples of the given band. */
    @stub
    def getBitsPerBand(band: Int): Int = ???

    /** Returns an int containing one of the enumerated constant values
     *  describing image formats from BufferedImage.
     */
    @stub
    def getBufferedImageType(): Int = ???

    /** Returns the ColorModel specified by this object. */
    @stub
    def getColorModel(): ColorModel = ???

    /** Return the number of bands
     *  specified by this object.
     */
    @stub
    def getNumBands(): Int = ???

    /** Return the number of color components
     *  specified by this object.
     */
    @stub
    def getNumComponents(): Int = ???

    /** Returns a SampleModel based on the settings
     *  encapsulated within this object.
     */
    @stub
    def getSampleModel(): SampleModel = ???

    /** Returns a SampleModel based on the settings
     *  encapsulated within this object.
     */
    @stub
    def getSampleModel(width: Int, height: Int): SampleModel = ???

    /** Returns the hash code for this ImageTypeSpecifier. */
    @stub
    def hashCode(): Int = ???
}

object ImageTypeSpecifier {
    /** Returns a specifier for a banded image format that will use a
     *  ComponentColorModel and a
     *  BandedSampleModel to store each channel in a
     *  separate array.
     */
    @stub
    def createBanded(colorSpace: ColorSpace, bankIndices: Array[Int], bandOffsets: Array[Int], dataType: Int, hasAlpha: Boolean, isAlphaPremultiplied: Boolean): ImageTypeSpecifier = ???

    /** Returns an ImageTypeSpecifier that encodes
     *  one of the standard BufferedImage types
     *  (other than TYPE_CUSTOM).
     */
    @stub
    def createFromBufferedImageType(bufferedImageType: Int): ImageTypeSpecifier = ???

    /** Returns an ImageTypeSpecifier that encodes the
     *  layout of a RenderedImage (which may be a
     *  BufferedImage).
     */
    @stub
    def createFromRenderedImage(image: RenderedImage): ImageTypeSpecifier = ???

    /** Returns a specifier for a grayscale image format that will pack
     *  pixels of the given bit depth into array elements of
     *  the specified data type.
     */
    @stub
    def createGrayscale(bits: Int, dataType: Int, isSigned: Boolean): ImageTypeSpecifier = ???

    /** Returns a specifier for a grayscale plus alpha image format
     *  that will pack pixels of the given bit depth into array
     *  elements of the specified data type.
     */
    @stub
    def createGrayscale(bits: Int, dataType: Int, isSigned: Boolean, isAlphaPremultiplied: Boolean): ImageTypeSpecifier = ???

    /** Returns a specifier for an indexed-color image format that will pack
     *  index values of the given bit depth into array elements of
     *  the specified data type.
     */
    @stub
    def createIndexed(redLUT: Array[Byte], greenLUT: Array[Byte], blueLUT: Array[Byte], alphaLUT: Array[Byte], bits: Int, dataType: Int): ImageTypeSpecifier = ???

    /** Returns a specifier for an interleaved image format that will
     *  use a ComponentColorModel and a
     *  PixelInterleavedSampleModel to store each pixel
     *  component in a separate byte, short, or int.
     */
    @stub
    def createInterleaved(colorSpace: ColorSpace, bandOffsets: Array[Int], dataType: Int, hasAlpha: Boolean, isAlphaPremultiplied: Boolean): ImageTypeSpecifier = ???

    /** Returns a specifier for a packed image format that will use a
     *  DirectColorModel and a packed
     *  SampleModel to store each pixel packed into in a
     *  single byte, short, or int.
     */
    @stub
    def createPacked(colorSpace: ColorSpace, redMask: Int, greenMask: Int, blueMask: Int, alphaMask: Int, transferType: Int, isAlphaPremultiplied: Boolean): ImageTypeSpecifier = ???
}
