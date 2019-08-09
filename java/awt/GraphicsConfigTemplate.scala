package java.awt

import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** The GraphicsConfigTemplate class is used to obtain a valid
 *  GraphicsConfiguration.  A user instantiates one of these
 *  objects and then sets all non-default attributes as desired.  The
 *  GraphicsDevice.getBestConfiguration(java.awt.GraphicsConfigTemplate) method found in the
 *  GraphicsDevice class is then called with this
 *  GraphicsConfigTemplate.  A valid
 *  GraphicsConfiguration is returned that meets or exceeds
 *  what was requested in the GraphicsConfigTemplate.
 */
abstract class GraphicsConfigTemplate extends Object with Serializable {

    /** This class is an abstract class so only subclasses can be
     *  instantiated.
     */
    @stub
    def this() = ???

    /** Returns the "best" configuration possible that passes the
     *  criteria defined in the GraphicsConfigTemplate.
     */
    def getBestConfiguration(gc: Array[GraphicsConfiguration]): GraphicsConfiguration

    /** Returns a boolean indicating whether or
     *  not the specified GraphicsConfiguration can be
     *  used to create a drawing surface that supports the indicated
     *  features.
     */
    def isGraphicsConfigSupported(gc: GraphicsConfiguration): Boolean
}

object GraphicsConfigTemplate {
    /** Value used for "Enum" (Integer) type. */
    @stub
    val PREFERRED: Int = ???

    /** Value used for "Enum" (Integer) type. */
    @stub
    val REQUIRED: Int = ???

    /** Value used for "Enum" (Integer) type. */
    @stub
    val UNNECESSARY: Int = ???
}
