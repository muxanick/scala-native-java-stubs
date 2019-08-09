package javax.imageio

import java.awt.color.ColorSpace
import java.awt.image.{BufferedImage, ColorModel, RenderedImage, SampleModel}
import java.lang.Object

// A class that allows the format of an image (in particular, its
// SampleModel and ColorModel) to be
// specified in a convenient manner.
class ImageTypeSpecifier extends Object {

    @stub
    // Constructs an ImageTypeSpecifier directly
    // from a ColorModel and a SampleModel.
    def this(colorModel: ColorModel, sampleModel: SampleModel) = ???

    @stub
    // The ColorModel to be used as a prototype.
    protected def colorModel: ColorModel = ???

    @stub
    // Creates a BufferedImage with a given width and
    // height according to the specification embodied in this object.
    def createBufferedImage(width: Int, height: Int): BufferedImage = ???

    @stub
    // Returns true if the given Object is
    // an ImageTypeSpecifier and has a
    // SampleModel and ColorModel that are
    // equal to those of this object.
    def equals(o: Object): Boolean = ???

    @stub
    // Return the number of bits used to represent samples of the given band.
    def getBitsPerBand(band: Int): Int = ???

    @stub
    // Returns an int containing one of the enumerated constant values
    // describing image formats from BufferedImage.
    def getBufferedImageType(): Int = ???

    @stub
    // Returns the ColorModel specified by this object.
    def getColorModel(): ColorModel = ???

    @stub
    // Return the number of bands
    // specified by this object.
    def getNumBands(): Int = ???

    @stub
    // Return the number of color components
    // specified by this object.
    def getNumComponents(): Int = ???

    @stub
    // Returns a SampleModel based on the settings
    // encapsulated within this object.
    def getSampleModel(): SampleModel = ???

    @stub
    // Returns a SampleModel based on the settings
    // encapsulated within this object.
    def getSampleModel(width: Int, height: Int): SampleModel = ???
}

object ImageTypeSpecifier {
    @stub
    // Returns a specifier for a banded image format that will use a
    // ComponentColorModel and a
    // BandedSampleModel to store each channel in a
    // separate array.
    def createBanded(colorSpace: ColorSpace, bankIndices: Array[Int], bandOffsets: Array[Int], dataType: Int, hasAlpha: Boolean, isAlphaPremultiplied: Boolean): ImageTypeSpecifier = ???

    @stub
    // Returns an ImageTypeSpecifier that encodes
    // one of the standard BufferedImage types
    // (other than TYPE_CUSTOM).
    def createFromBufferedImageType(bufferedImageType: Int): ImageTypeSpecifier = ???

    @stub
    // Returns an ImageTypeSpecifier that encodes the
    // layout of a RenderedImage (which may be a
    // BufferedImage).
    def createFromRenderedImage(image: RenderedImage): ImageTypeSpecifier = ???

    @stub
    // Returns a specifier for a grayscale image format that will pack
    // pixels of the given bit depth into array elements of
    // the specified data type.
    def createGrayscale(bits: Int, dataType: Int, isSigned: Boolean): ImageTypeSpecifier = ???

    @stub
    // Returns a specifier for a grayscale plus alpha image format
    // that will pack pixels of the given bit depth into array
    // elements of the specified data type.
    def createGrayscale(bits: Int, dataType: Int, isSigned: Boolean, isAlphaPremultiplied: Boolean): ImageTypeSpecifier = ???

    @stub
    // Returns a specifier for an indexed-color image format that will pack
    // index values of the given bit depth into array elements of
    // the specified data type.
    def createIndexed(redLUT: Array[Byte], greenLUT: Array[Byte], blueLUT: Array[Byte], alphaLUT: Array[Byte], bits: Int, dataType: Int): ImageTypeSpecifier = ???

    @stub
    // Returns a specifier for an interleaved image format that will
    // use a ComponentColorModel and a
    // PixelInterleavedSampleModel to store each pixel
    // component in a separate byte, short, or int.
    def createInterleaved(colorSpace: ColorSpace, bandOffsets: Array[Int], dataType: Int, hasAlpha: Boolean, isAlphaPremultiplied: Boolean): ImageTypeSpecifier = ???

    @stub
    // Returns a specifier for a packed image format that will use a
    // DirectColorModel and a packed
    // SampleModel to store each pixel packed into in a
    // single byte, short, or int.
    def createPacked(colorSpace: ColorSpace, redMask: Int, greenMask: Int, blueMask: Int, alphaMask: Int, transferType: Int, isAlphaPremultiplied: Boolean): ImageTypeSpecifier = ???
}
