package javax.swing.event

import java.util.EventListener

/** AncestorListener
 * 
 *  Interface to support notification when changes occur to a JComponent or one
 *  of its ancestors.  These include movement and when the component becomes
 *  visible or invisible, either by the setVisible() method or by being added
 *  or removed from the component hierarchy.
 */
trait AncestorListener extends EventListener {

    /** Called when the source or one of its ancestors is made visible
     *  either by setVisible(true) being called or by its being
     *  added to the component hierarchy.
     */
    @stub
    def ancestorAdded(event: AncestorEvent): Unit = ???

    /** Called when either the source or one of its ancestors is moved. */
    @stub
    def ancestorMoved(event: AncestorEvent): Unit = ???
}
