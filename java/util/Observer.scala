package java.util

import java.lang.Object
import scala.scalanative.annotation.stub

/** A class can implement the Observer interface when it
 *  wants to be informed of changes in observable objects.
 */
trait Observer {

    /** This method is called whenever the observed object is changed. */
    @stub
    def update(o: Observable, arg: Object): Unit = ???
}
