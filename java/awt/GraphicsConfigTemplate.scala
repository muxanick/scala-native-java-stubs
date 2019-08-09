package java.awt

import java.io.Serializable
import java.lang.Object

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

    /** Returns the "best" configuration possible that passes the
     *  criteria defined in the GraphicsConfigTemplate.
     */
    def getBestConfiguration(gc: Array[GraphicsConfiguration]): GraphicsConfiguration
}

object GraphicsConfigTemplate {
    /** Value used for "Enum" (Integer) type. */
    @stub
    val PREFERRED: Int = ???

    /** Value used for "Enum" (Integer) type. */
    @stub
    val REQUIRED: Int = ???
}
