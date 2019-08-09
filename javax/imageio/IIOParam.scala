package javax.imageio

import java.awt.{Point, Rectangle}
import java.lang.Object

/** A superclass of all classes describing how streams should be
 *  decoded or encoded.  This class contains all the variables and
 *  methods that are shared by ImageReadParam and
 *  ImageWriteParam.
 * 
 *   This class provides mechanisms to specify a source region and a
 *  destination region.  When reading, the source is the stream and
 *  the in-memory image is the destination.  When writing, these are
 *  reversed.  In the case of writing, destination regions may be used
 *  only with a writer that supports pixel replacement.
 *  
 *  Decimation subsampling may be specified for both readers
 *  and writers, using a movable subsampling grid.
 *  
 *  Subsets of the source and destination bands may be selected.
 */
abstract class IIOParam extends Object {

    /** The IIOParamController that will be
     *  used to provide settings for this IIOParam
     *  object when the activateController method
     *  is called.
     */
    protected val controller: IIOParamController

    /** The default IIOParamController that will be
     *  used to provide settings for this IIOParam
     *  object when the activateController method
     *  is called.
     */
    protected val defaultController: IIOParamController

    /** The offset in the destination where the upper-left decoded
     *  pixel should be placed.
     */
    protected val destinationOffset: Point

    /** An ImageTypeSpecifier to be used to generate a
     *  destination image when reading, or to set the output color type
     *  when writing.
     */
    protected val destinationType: ImageTypeSpecifier

    /** An array of ints indicating which source bands
     *  will be used, or null.
     */
    protected val sourceBands: Array[Int]

    /** The source region, on null if none is set. */
    protected val sourceRegion: Rectangle

    /** The decimation subsampling to be applied in the horizontal
     *  direction.
     */
    protected val sourceXSubsampling: Int

    /** The decimation subsampling to be applied in the vertical
     *  direction.
     */
    protected val sourceYSubsampling: Int

    /** A horizontal offset to be applied to the subsampling grid before
     *  subsampling.
     */
    protected val subsamplingXOffset: Int

    /** Activates the installed IIOParamController for
     *  this IIOParam object and returns the resulting
     *  value.
     */
    def activateController(): Boolean

    /** Returns whatever IIOParamController is currently
     *  installed.
     */
    def getController(): IIOParamController

    /** Returns the default IIOParamController, if there
     *  is one, regardless of the currently installed controller.
     */
    def getDefaultController(): IIOParamController

    /** Returns the offset in the destination image at which pixels are
     *  to be placed.
     */
    def getDestinationOffset(): Point

    /** Returns the type of image to be returned by the read, if one
     *  was set by a call to
     *  setDestination(ImageTypeSpecifier), as an
     *  ImageTypeSpecifier.
     */
    def getDestinationType(): ImageTypeSpecifier

    /** Returns the set of of source bands to be used. */
    def getSourceBands(): Array[Int]

    /** Returns the source region to be used. */
    def getSourceRegion(): Rectangle

    /** Returns the number of source columns to advance for each pixel. */
    def getSourceXSubsampling(): Int

    /** Returns the number of rows to advance for each pixel. */
    def getSourceYSubsampling(): Int

    /** Returns the horizontal offset of the subsampling grid. */
    def getSubsamplingXOffset(): Int

    /** Returns the vertical offset of the subsampling grid. */
    def getSubsamplingYOffset(): Int

    /** Returns true if there is a controller installed
     *  for this IIOParam object.
     */
    def hasController(): Boolean

    /** Sets the IIOParamController to be used
     *  to provide settings for this IIOParam
     *  object when the activateController method
     *  is called, overriding any default controller.
     */
    def setController(controller: IIOParamController): Unit

    /** Specifies the offset in the destination image at which future
     *  decoded pixels are to be placed, when reading, or where a
     *  region will be written, when writing.
     */
    def setDestinationOffset(destinationOffset: Point): Unit

    /** Sets the desired image type for the destination image, using an
     *  ImageTypeSpecifier.
     */
    def setDestinationType(destinationType: ImageTypeSpecifier): Unit

    /** Sets the indices of the source bands to be used. */
    def setSourceBands(sourceBands: Array[Int]): Unit

    /** Sets the source region of interest. */
    def setSourceRegion(sourceRegion: Rectangle): Unit
}
