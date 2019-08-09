package javax.swing

import java.lang.{Object, String}

// Provides a little information about an installed
// LookAndFeel for the sake of configuring a menu or
// for initial application set up.
object UIManager.LookAndFeelInfo extends Object {

    @stub
    // Returns the name of the class that implements this look and feel.
    def getClassName(): String = ???

    @stub
    // Returns the name of the look and feel in a form suitable
    // for a menu or other presentation
    def getName(): String = ???
}
