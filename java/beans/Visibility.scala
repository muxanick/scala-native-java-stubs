package java.beans

import scala.scalanative.annotation.stub

/** Under some circumstances a bean may be run on servers where a GUI
 *  is not available.  This interface can be used to query a bean to
 *  determine whether it absolutely needs a gui, and to advise the
 *  bean whether a GUI is available.
 *  
 *  This interface is for expert developers, and is not needed
 *  for normal simple beans.  To avoid confusing end-users we
 *  avoid using getXXX setXXX design patterns for these methods.
 */
trait Visibility {

    /** Determines whether this bean is avoiding using a GUI. */
    @stub
    def avoidingGui(): Boolean = ???

    /** This method instructs the bean that it should not use the Gui. */
    @stub
    def dontUseGui(): Unit = ???

    /** Determines whether this bean needs a GUI. */
    @stub
    def needsGui(): Boolean = ???

    /** This method instructs the bean that it is OK to use the Gui. */
    @stub
    def okToUseGui(): Unit = ???
}
