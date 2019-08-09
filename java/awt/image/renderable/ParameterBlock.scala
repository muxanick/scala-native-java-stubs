package java.awt.image.renderable

import java.awt.image.RenderedImage
import java.io.Serializable
import java.lang.{Class, Cloneable, Object}
import java.util.Vector

// A ParameterBlock encapsulates all the information about sources and
// parameters (Objects) required by a RenderableImageOp, or other
// classes that process images.
//
//  Although it is possible to place arbitrary objects in the
// source Vector, users of this class may impose semantic constraints
// such as requiring all sources to be RenderedImages or
// RenderableImage.  ParameterBlock itself is merely a container and
// performs no checking on source or parameter types.
//
//  All parameters in a ParameterBlock are objects; convenience
// add and set methods are available that take arguments of base type and
// construct the appropriate subclass of Number (such as
// Integer or Float).  Corresponding get methods perform a
// downward cast and have return values of base type; an exception
// will be thrown if the stored values do not have the correct type.
// There is no way to distinguish between the results of
// "short s; add(s)" and "add(new Short(s))".
//
//  Note that the get and set methods operate on references.
// Therefore, one must be careful not to share references between
// ParameterBlocks when this is inappropriate.  For example, to create
// a new ParameterBlock that is equal to an old one except for an
// added source, one might be tempted to write:
//
// 
// ParameterBlock addSource(ParameterBlock pb, RenderableImage im) {
//     ParameterBlock pb1 = new ParameterBlock(pb.getSources());
//     pb1.addSource(im);
//     return pb1;
// }
// 
//
//  This code will have the side effect of altering the original
// ParameterBlock, since the getSources operation returned a reference
// to its source Vector.  Both pb and pb1 share their source Vector,
// and a change in either is visible to both.
//
//  A correct way to write the addSource function is to clone
// the source Vector:
//
// 
// ParameterBlock addSource (ParameterBlock pb, RenderableImage im) {
//     ParameterBlock pb1 = new ParameterBlock(pb.getSources().clone());
//     pb1.addSource(im);
//     return pb1;
// }
// 
//
//  The clone method of ParameterBlock has been defined to
// perform a clone of both the source and parameter Vectors for
// this reason.  A standard, shallow clone is available as
// shallowClone.
//
//  The addSource, setSource, add, and set methods are
// defined to return 'this' after adding their argument.  This allows
// use of syntax like:
//
// 
// ParameterBlock pb = new ParameterBlock();
// op = new RenderableImageOp("operation", pb.add(arg1).add(arg2));
// 
class ParameterBlock extends Object with Cloneable, with Serializable {

    @stub
    // A dummy constructor.
    def this() = ???

    @stub
    // Constructs a ParameterBlock with a given Vector
    // of sources.
    def this(sources: Vector[Object]) = ???

    @stub
    // A Vector of non-source parameters, stored as arbitrary Objects.
    protected def parameters: Vector[Object] = ???

    @stub
    // Adds a Byte to the list of parameters.
    def add(b: Byte): ParameterBlock = ???

    @stub
    // Adds a Character to the list of parameters.
    def add(c: Char): ParameterBlock = ???

    @stub
    // Adds a Double to the list of parameters.
    def add(d: double): ParameterBlock = ???

    @stub
    // Adds a Float to the list of parameters.
    def add(f: float): ParameterBlock = ???

    @stub
    // Adds a Integer to the list of parameters.
    def add(i: Int): ParameterBlock = ???

    @stub
    // Adds a Long to the list of parameters.
    def add(l: Long): ParameterBlock = ???

    @stub
    // Adds an object to the list of parameters.
    def add(obj: Object): ParameterBlock = ???

    @stub
    // Adds a Short to the list of parameters.
    def add(s: Short): ParameterBlock = ???

    @stub
    // Adds an image to end of the list of sources.
    def addSource(source: Object): ParameterBlock = ???

    @stub
    // Creates a copy of a ParameterBlock.
    def clone(): Object = ???

    @stub
    // A convenience method to return a parameter as a byte.
    def getByteParameter(index: Int): Byte = ???

    @stub
    // A convenience method to return a parameter as a char.
    def getCharParameter(index: Int): Char = ???

    @stub
    // A convenience method to return a parameter as a double.
    def getDoubleParameter(index: Int): double = ???

    @stub
    // A convenience method to return a parameter as a float.
    def getFloatParameter(index: Int): float = ???

    @stub
    // A convenience method to return a parameter as an int.
    def getIntParameter(index: Int): Int = ???

    @stub
    // A convenience method to return a parameter as a long.
    def getLongParameter(index: Int): Long = ???

    @stub
    // Returns the number of parameters (not including source images).
    def getNumParameters(): Int = ???

    @stub
    // Returns the number of source images.
    def getNumSources(): Int = ???

    @stub
    // Gets a parameter as an object.
    def getObjectParameter(index: Int): Object = ???

    @stub
    // Returns an array of Class objects describing the types
    // of the parameters.
    def getParamClasses(): Array[Class] = ???

    @stub
    // Returns the entire Vector of parameters.
    def getParameters(): Vector[Object] = ???

    @stub
    // Returns a source as a RenderableImage.
    def getRenderableSource(index: Int): RenderableImage = ???

    @stub
    // Returns a source as a RenderedImage.
    def getRenderedSource(index: Int): RenderedImage = ???

    @stub
    // A convenience method to return a parameter as a short.
    def getShortParameter(index: Int): Short = ???

    @stub
    // Returns a source as a general Object.
    def getSource(index: Int): Object = ???

    @stub
    // Returns the entire Vector of sources.
    def getSources(): Vector[Object] = ???

    @stub
    // Clears the list of parameters.
    def removeParameters(): Unit = ???

    @stub
    // Clears the list of source images.
    def removeSources(): Unit = ???

    @stub
    // Replaces an Object in the list of parameters with a Byte.
    def set(b: Byte, index: Int): ParameterBlock = ???

    @stub
    // Replaces an Object in the list of parameters with a Character.
    def set(c: Char, index: Int): ParameterBlock = ???

    @stub
    // Replaces an Object in the list of parameters with a Double.
    def set(d: double, index: Int): ParameterBlock = ???

    @stub
    // Replaces an Object in the list of parameters with a Float.
    def set(f: float, index: Int): ParameterBlock = ???

    @stub
    // Replaces an Object in the list of parameters with an Integer.
    def set(i: Int, index: Int): ParameterBlock = ???

    @stub
    // Replaces an Object in the list of parameters with a Long.
    def set(l: Long, index: Int): ParameterBlock = ???

    @stub
    // Replaces an Object in the list of parameters.
    def set(obj: Object, index: Int): ParameterBlock = ???

    @stub
    // Replaces an Object in the list of parameters with a Short.
    def set(s: Short, index: Int): ParameterBlock = ???

    @stub
    // Sets the entire Vector of parameters to a given Vector.
    def setParameters(parameters: Vector[Object]): Unit = ???

    @stub
    // Replaces an entry in the list of source with a new source.
    def setSource(source: Object, index: Int): ParameterBlock = ???

    @stub
    // Sets the entire Vector of sources to a given Vector.
    def setSources(sources: Vector[Object]): Unit = ???
}
