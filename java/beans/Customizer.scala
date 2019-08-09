package java.beans

/** A customizer class provides a complete custom GUI for customizing
 *  a target Java Bean.
 *  
 *  Each customizer should inherit from the java.awt.Component class so
 *  it can be instantiated inside an AWT dialog or panel.
 *  
 *  Each customizer should have a null constructor.
 */
trait Customizer {

    /** Register a listener for the PropertyChange event. */
    @stub
    def addPropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    /** Remove a listener for the PropertyChange event. */
    @stub
    def removePropertyChangeListener(listener: PropertyChangeListener): Unit = ???
}
