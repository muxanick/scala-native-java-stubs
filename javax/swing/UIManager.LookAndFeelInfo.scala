package javax.swing

import java.lang.{Object, String}

/** Provides a little information about an installed
 *  LookAndFeel for the sake of configuring a menu or
 *  for initial application set up.
 */
object UIManager.LookAndFeelInfo extends Object {

    /** Returns the name of the class that implements this look and feel. */
    @stub
    def getClassName(): String = ???

    /** Returns the name of the look and feel in a form suitable
     *  for a menu or other presentation
     */
    @stub
    def getName(): String = ???
}
