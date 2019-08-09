package javax.swing

import java.lang.Object

/** Popups are used to display a Component to the user, typically
 *  on top of all the other Components in a particular containment
 *  hierarchy. Popups have a very small life cycle. Once you
 *  have obtained a Popup, and hidden it (invoked the
 *  hide method), you should no longer
 *  invoke any methods on it. This allows the PopupFactory to cache
 *  Popups for later use.
 *  
 *  The general contract is that if you need to change the size of the
 *  Component, or location of the Popup, you should
 *  obtain a new Popup.
 *  
 *  Popup does not descend from Component, rather
 *  implementations of Popup are responsible for creating
 *  and maintaining their own Components to render the
 *  requested Component to the user.
 *  
 *  You typically do not explicitly create an instance of Popup,
 *  instead obtain one from a PopupFactory.
 */
class Popup extends Object {

    /** Creates a Popup. */
    @stub
    protected def this() = ???

    /** Hides and disposes of the Popup. */
    @stub
    def hide(): Unit = ???
}
