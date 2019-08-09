package java.beans

import java.util.EventListener
import scala.scalanative.annotation.stub

/** A "PropertyChange" event gets fired whenever a bean changes a "bound"
 *  property.  You can register a PropertyChangeListener with a source
 *  bean so as to be notified of any bound property updates.
 */
trait PropertyChangeListener extends EventListener {

    /** This method gets called when a bound property is changed. */
    @stub
    def propertyChange(evt: PropertyChangeEvent): Unit = ???
}
