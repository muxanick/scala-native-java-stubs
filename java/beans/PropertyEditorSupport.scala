package java.beans

import java.awt.{Component, Graphics, Rectangle}
import java.lang.{Object, String}

// This is a support class to help build property editors.
// 
// It can be used either as a base class or as a delegate.
class PropertyEditorSupport extends Object with PropertyEditor {

    @stub
    // Constructs a PropertyEditorSupport object.
    def this() = ???

    @stub
    // Adds a listener for the value change.
    def addPropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    @stub
    // Report that we have been modified to any interested listeners.
    def firePropertyChange(): Unit = ???

    @stub
    // Gets the property value as a string suitable for presentation
    // to a human to edit.
    def getAsText(): String = ???

    @stub
    // A PropertyEditor may chose to make available a full custom Component
    // that edits its property value.
    def getCustomEditor(): Component = ???

    @stub
    // This method is intended for use when generating Java code to set
    // the value of the property.
    def getJavaInitializationString(): String = ???

    @stub
    // Returns the bean that is used as the
    // source of events.
    def getSource(): Object = ???

    @stub
    // If the property value must be one of a set of known tagged values,
    // then this method should return an array of the tag values.
    def getTags(): Array[String] = ???

    @stub
    // Gets the value of the property.
    def getValue(): Object = ???

    @stub
    // Determines whether the class will honor the paintValue method.
    def isPaintable(): Boolean = ???

    @stub
    // Paint a representation of the value into a given area of screen
    // real estate.
    def paintValue(gfx: Graphics, box: Rectangle): Unit = ???

    @stub
    // Removes a listener for the value change.
    def removePropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    @stub
    // Sets the property value by parsing a given String.
    def setAsText(text: String): Unit = ???

    @stub
    // Sets the source bean.
    def setSource(source: Object): Unit = ???

    @stub
    // Set (or change) the object that is to be edited.
    def setValue(value: Object): Unit = ???
}
