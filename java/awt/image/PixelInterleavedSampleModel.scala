package java.awt.image

import java.lang.Object

/** This class represents image data which is stored in a pixel interleaved
 *   fashion and for
 *   which each sample of a pixel occupies one data element of the DataBuffer.
 *   It subclasses ComponentSampleModel but provides a more efficient
 *   implementation for accessing pixel interleaved image data than is provided
 *   by ComponentSampleModel.  This class
 *   stores sample data for all bands in a single bank of the
 *   DataBuffer. Accessor methods are provided so that image data can be
 *   manipulated directly. Pixel stride is the number of
 *   data array elements between two samples for the same band on the same
 *   scanline. Scanline stride is the number of data array elements between
 *   a given sample and the corresponding sample in the same column of the next
 *   scanline.  Band offsets denote the number
 *   of data array elements from the first data array element of the bank
 *   of the DataBuffer holding each band to the first sample of the band.
 *   The bands are numbered from 0 to N-1.
 *   Bank indices denote the correspondence between a bank of the data buffer
 *   and a band of image data.
 *   This class supports
 *   TYPE_BYTE,
 *   TYPE_USHORT,
 *   TYPE_SHORT,
 *   TYPE_INT,
 *   TYPE_FLOAT and
 *   TYPE_DOUBLE datatypes.
 */
class PixelInterleavedSampleModel extends ComponentSampleModel {

    /** Creates a new PixelInterleavedSampleModel with the specified
     *  width and height.
     */
    @stub
    def createCompatibleSampleModel(w: Int, h: Int): SampleModel = ???

    /** Creates a new PixelInterleavedSampleModel with a subset of the
     *  bands of this PixelInterleavedSampleModel.
     */
    @stub
    def createSubsetSampleModel(bands: Array[Int]): SampleModel = ???
}
