package java.awt.image.renderable

import java.awt.image.RenderedImage
import java.io.Serializable
import java.lang.{Class, Cloneable, Object}
import java.util.Vector

/** A ParameterBlock encapsulates all the information about sources and
 *  parameters (Objects) required by a RenderableImageOp, or other
 *  classes that process images.
 * 
 *   Although it is possible to place arbitrary objects in the
 *  source Vector, users of this class may impose semantic constraints
 *  such as requiring all sources to be RenderedImages or
 *  RenderableImage.  ParameterBlock itself is merely a container and
 *  performs no checking on source or parameter types.
 * 
 *   All parameters in a ParameterBlock are objects; convenience
 *  add and set methods are available that take arguments of base type and
 *  construct the appropriate subclass of Number (such as
 *  Integer or Float).  Corresponding get methods perform a
 *  downward cast and have return values of base type; an exception
 *  will be thrown if the stored values do not have the correct type.
 *  There is no way to distinguish between the results of
 *  "short s; add(s)" and "add(new Short(s))".
 * 
 *   Note that the get and set methods operate on references.
 *  Therefore, one must be careful not to share references between
 *  ParameterBlocks when this is inappropriate.  For example, to create
 *  a new ParameterBlock that is equal to an old one except for an
 *  added source, one might be tempted to write:
 * 
 *  
 *  ParameterBlock addSource(ParameterBlock pb, RenderableImage im) {
 *      ParameterBlock pb1 = new ParameterBlock(pb.getSources());
 *      pb1.addSource(im);
 *      return pb1;
 *  }
 *  
 * 
 *   This code will have the side effect of altering the original
 *  ParameterBlock, since the getSources operation returned a reference
 *  to its source Vector.  Both pb and pb1 share their source Vector,
 *  and a change in either is visible to both.
 * 
 *   A correct way to write the addSource function is to clone
 *  the source Vector:
 * 
 *  
 *  ParameterBlock addSource (ParameterBlock pb, RenderableImage im) {
 *      ParameterBlock pb1 = new ParameterBlock(pb.getSources().clone());
 *      pb1.addSource(im);
 *      return pb1;
 *  }
 *  
 * 
 *   The clone method of ParameterBlock has been defined to
 *  perform a clone of both the source and parameter Vectors for
 *  this reason.  A standard, shallow clone is available as
 *  shallowClone.
 * 
 *   The addSource, setSource, add, and set methods are
 *  defined to return 'this' after adding their argument.  This allows
 *  use of syntax like:
 * 
 *  
 *  ParameterBlock pb = new ParameterBlock();
 *  op = new RenderableImageOp("operation", pb.add(arg1).add(arg2));
 *  
 */
class ParameterBlock extends Object with Cloneable with Serializable {

    /** A dummy constructor. */
    @stub
    def this() = ???

    /** Constructs a ParameterBlock with a given Vector
     *  of sources.
     */
    @stub
    def this(sources: Vector[Object]) = ???

    /** A Vector of non-source parameters, stored as arbitrary Objects. */
    @stub
    protected val parameters: Vector[Object] = ???

    /** Adds a Byte to the list of parameters. */
    @stub
    def add(b: Byte): ParameterBlock = ???

    /** Adds a Character to the list of parameters. */
    @stub
    def add(c: Char): ParameterBlock = ???

    /** Adds a Double to the list of parameters. */
    @stub
    def add(d: Double): ParameterBlock = ???

    /** Adds a Float to the list of parameters. */
    @stub
    def add(f: Float): ParameterBlock = ???

    /** Adds a Integer to the list of parameters. */
    @stub
    def add(i: Int): ParameterBlock = ???

    /** Adds a Long to the list of parameters. */
    @stub
    def add(l: Long): ParameterBlock = ???

    /** Adds an object to the list of parameters. */
    @stub
    def add(obj: Object): ParameterBlock = ???

    /** Adds a Short to the list of parameters. */
    @stub
    def add(s: Short): ParameterBlock = ???

    /** Adds an image to end of the list of sources. */
    @stub
    def addSource(source: Object): ParameterBlock = ???

    /** Creates a copy of a ParameterBlock. */
    @stub
    def clone(): Object = ???

    /** A convenience method to return a parameter as a byte. */
    @stub
    def getByteParameter(index: Int): Byte = ???

    /** A convenience method to return a parameter as a char. */
    @stub
    def getCharParameter(index: Int): Char = ???

    /** A convenience method to return a parameter as a double. */
    @stub
    def getDoubleParameter(index: Int): Double = ???

    /** A convenience method to return a parameter as a float. */
    @stub
    def getFloatParameter(index: Int): Float = ???

    /** A convenience method to return a parameter as an int. */
    @stub
    def getIntParameter(index: Int): Int = ???

    /** A convenience method to return a parameter as a long. */
    @stub
    def getLongParameter(index: Int): Long = ???

    /** Returns the number of parameters (not including source images). */
    @stub
    def getNumParameters(): Int = ???

    /** Returns the number of source images. */
    @stub
    def getNumSources(): Int = ???

    /** Gets a parameter as an object. */
    @stub
    def getObjectParameter(index: Int): Object = ???

    /** Returns an array of Class objects describing the types
     *  of the parameters.
     */
    @stub
    def getParamClasses(): Array[Class] = ???

    /** Returns the entire Vector of parameters. */
    @stub
    def getParameters(): Vector[Object] = ???

    /** Returns a source as a RenderableImage. */
    @stub
    def getRenderableSource(index: Int): RenderableImage = ???

    /** Returns a source as a RenderedImage. */
    @stub
    def getRenderedSource(index: Int): RenderedImage = ???

    /** A convenience method to return a parameter as a short. */
    @stub
    def getShortParameter(index: Int): Short = ???

    /** Returns a source as a general Object. */
    @stub
    def getSource(index: Int): Object = ???

    /** Returns the entire Vector of sources. */
    @stub
    def getSources(): Vector[Object] = ???

    /** Clears the list of parameters. */
    @stub
    def removeParameters(): Unit = ???

    /** Clears the list of source images. */
    @stub
    def removeSources(): Unit = ???

    /** Replaces an Object in the list of parameters with a Byte. */
    @stub
    def set(b: Byte, index: Int): ParameterBlock = ???

    /** Replaces an Object in the list of parameters with a Character. */
    @stub
    def set(c: Char, index: Int): ParameterBlock = ???

    /** Replaces an Object in the list of parameters with a Double. */
    @stub
    def set(d: Double, index: Int): ParameterBlock = ???

    /** Replaces an Object in the list of parameters with a Float. */
    @stub
    def set(f: Float, index: Int): ParameterBlock = ???

    /** Replaces an Object in the list of parameters with an Integer. */
    @stub
    def set(i: Int, index: Int): ParameterBlock = ???

    /** Replaces an Object in the list of parameters with a Long. */
    @stub
    def set(l: Long, index: Int): ParameterBlock = ???

    /** Replaces an Object in the list of parameters. */
    @stub
    def set(obj: Object, index: Int): ParameterBlock = ???

    /** Replaces an Object in the list of parameters with a Short. */
    @stub
    def set(s: Short, index: Int): ParameterBlock = ???

    /** Sets the entire Vector of parameters to a given Vector. */
    @stub
    def setParameters(parameters: Vector[Object]): Unit = ???

    /** Replaces an entry in the list of source with a new source. */
    @stub
    def setSource(source: Object, index: Int): ParameterBlock = ???

    /** Sets the entire Vector of sources to a given Vector. */
    @stub
    def setSources(sources: Vector[Object]): Unit = ???
}
