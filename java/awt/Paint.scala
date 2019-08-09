package java.awt

/** This Paint interface defines how color patterns
 *  can be generated for Graphics2D operations.  A class
 *  implementing the Paint interface is added to the
 *  Graphics2D context in order to define the color
 *  pattern used by the draw and fill methods.
 *  
 *  Instances of classes implementing Paint must be
 *  read-only because the Graphics2D does not clone
 *  these objects when they are set as an attribute with the
 *  setPaint method or when the Graphics2D
 *  object is itself cloned.
 */
trait Paint extends Transparency {
}
