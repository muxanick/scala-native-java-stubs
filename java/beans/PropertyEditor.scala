package java.beans

import java.awt.{Component, Graphics, Rectangle}
import java.lang.{Object, String}

/** A PropertyEditor class provides support for GUIs that want to
 *  allow users to edit a property value of a given type.
 *  
 *  PropertyEditor supports a variety of different kinds of ways of
 *  displaying and updating property values.  Most PropertyEditors will
 *  only need to support a subset of the different options available in
 *  this API.
 *  
 *  Simple PropertyEditors may only support the getAsText and setAsText
 *  methods and need not support (say) paintValue or getCustomEditor.  More
 *  complex types may be unable to support getAsText and setAsText but will
 *  instead support paintValue and getCustomEditor.
 *  
 *  Every propertyEditor must support one or more of the three simple
 *  display styles.  Thus it can either (1) support isPaintable or (2)
 *  both return a non-null String[] from getTags() and return a non-null
 *  value from getAsText or (3) simply return a non-null String from
 *  getAsText().
 *  
 *  Every property editor must support a call on setValue when the argument
 *  object is of the type for which this is the corresponding propertyEditor.
 *  In addition, each property editor must either support a custom editor,
 *  or support setAsText.
 *  
 *  Each PropertyEditor should have a null constructor.
 */
trait PropertyEditor {

    /** Adds a listener for the value change. */
    @stub
    def addPropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    /** Gets the property value as text. */
    @stub
    def getAsText(): String = ???

    /** A PropertyEditor may choose to make available a full custom Component
     *  that edits its property value.
     */
    @stub
    def getCustomEditor(): Component = ???

    /** Returns a fragment of Java code that can be used to set a property
     *  to match the editors current state.
     */
    @stub
    def getJavaInitializationString(): String = ???

    /** If the property value must be one of a set of known tagged values,
     *  then this method should return an array of the tags.
     */
    @stub
    def getTags(): Array[String] = ???

    /** Gets the property value. */
    @stub
    def getValue(): Object = ???

    /** Determines whether this property editor is paintable. */
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

    /** Set the property value by parsing a given String. */
    @stub
    def setAsText(text: String): Unit = ???

    /** Set (or change) the object that is to be edited. */
    @stub
    def setValue(value: Object): Unit = ???
}
