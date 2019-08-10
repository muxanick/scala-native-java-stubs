package javax.swing

import java.awt.Component
import java.lang.Object
import scala.scalanative.annotation.stub

/** Defines the requirements for an object responsible for
 *  "rendering" (displaying) a value.
 */
trait Renderer {

    /** Returns the component used to render the value. */
    @stub
    def getComponent(): Component = ???

    /** Specifies the value to display and whether or not the
     *  value should be portrayed as "currently selected".
     */
    @stub
    def setValue(aValue: Any, isSelected: Boolean): Unit = ???
}
