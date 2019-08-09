package java.awt

import java.lang.Object

/** A class that describes the pointer position.
 *  It provides the GraphicsDevice where the pointer is and
 *  the Point that represents the coordinates of the pointer.
 *  
 *  Instances of this class should be obtained via
 *  MouseInfo.getPointerInfo().
 *  The PointerInfo instance is not updated dynamically as the mouse
 *  moves. To get the updated location, you must call
 *  MouseInfo.getPointerInfo() again.
 */
class PointerInfo extends Object {

    /** Returns the GraphicsDevice where the mouse pointer was at the
     *  moment this PointerInfo was created.
     */
    @stub
    def getDevice(): GraphicsDevice = ???
}
