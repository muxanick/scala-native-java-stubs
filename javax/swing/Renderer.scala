package javax.swing

import java.awt.Component

// Defines the requirements for an object responsible for
// "rendering" (displaying) a value.
trait Renderer {

    @stub
    // Returns the component used to render the value.
    def getComponent(): Component = ???
}
