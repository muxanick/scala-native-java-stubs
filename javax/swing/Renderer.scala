package javax.swing

import java.awt.Component

/** Defines the requirements for an object responsible for
 *  "rendering" (displaying) a value.
 */
trait Renderer {

    /** Returns the component used to render the value. */
    @stub
    def getComponent(): Component = ???
}
