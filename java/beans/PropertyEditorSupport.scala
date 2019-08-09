package java.beans

import java.awt.{Component, Graphics, Rectangle}
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This is a support class to help build property editors.
 *  
 *  It can be used either as a base class or as a delegate.
 */
class PropertyEditorSupport extends Object with PropertyEditor {

    /** Constructs a PropertyEditorSupport object. */
    @stub
    def this() = ???

    /** Constructs a PropertyEditorSupport object. */
    @stub
    def this(source: Object) = ???

    /** Adds a listener for the value change. */
    @stub
    def addPropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    /** Report that we have been modified to any interested listeners. */
    @stub
    def firePropertyChange(): Unit = ???

    /** Gets the property value as a string suitable for presentation
     *  to a human to edit.
     */
    @stub
    def getAsText(): String = ???

    /** A PropertyEditor may chose to make available a full custom Component
     *  that edits its property value.
     */
    @stub
    def getCustomEditor(): Component = ???

    /** This method is intended for use when generating Java code to set
     *  the value of the property.
     */
    @stub
    def getJavaInitializationString(): String = ???

    /** Returns the bean that is used as the
     *  source of events.
     */
    @stub
    def getSource(): Object = ???

    /** If the property value must be one of a set of known tagged values,
     *  then this method should return an array of the tag values.
     */
    @stub
    def getTags(): Array[String] = ???

    /** Gets the value of the property. */
    @stub
    def getValue(): Object = ???

    /** Determines whether the class will honor the paintValue method. */
    @stub
    def isPaintable(): Boolean = ???

    /** Paint a representation of the value into a given area of screen
     *  real estate.
     */
    @stub
    def paintValue(gfx: Graphics, box: Rectangle): Unit = ???

    /** Removes a listener for the value change. */
    @stub
    def removePropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    /** Sets the property value by parsing a given String. */
    @stub
    def setAsText(text: String): Unit = ???

    /** Sets the source bean. */
    @stub
    def setSource(source: Object): Unit = ???

    /** Set (or change) the object that is to be edited. */
    @stub
    def setValue(value: Object): Unit = ???

    /** Determines whether the propertyEditor can provide a custom editor. */
    @stub
    def supportsCustomEditor(): Boolean = ???
}
