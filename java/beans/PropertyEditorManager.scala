package java.beans

import java.lang.{Class, Object, String}

/** The PropertyEditorManager can be used to locate a property editor for
 *  any given type name.  This property editor must support the
 *  java.beans.PropertyEditor interface for editing a given object.
 *  
 *  The PropertyEditorManager uses three techniques for locating an editor
 *  for a given type.  First, it provides a registerEditor method to allow
 *  an editor to be specifically registered for a given type.  Second it
 *  tries to locate a suitable class by adding "Editor" to the full
 *  qualified classname of the given type (e.g. "foo.bah.FozEditor").
 *  Finally it takes the simple classname (without the package name) adds
 *  "Editor" to it and looks in a search-path of packages for a matching
 *  class.
 *  
 *  So for an input class foo.bah.Fred, the PropertyEditorManager would
 *  first look in its tables to see if an editor had been registered for
 *  foo.bah.Fred and if so use that.  Then it will look for a
 *  foo.bah.FredEditor class.  Then it will look for (say)
 *  standardEditorsPackage.FredEditor class.
 *  
 *  Default PropertyEditors will be provided for the Java primitive types
 *  "boolean", "byte", "short", "int", "long", "float", and "double"; and
 *  for the classes java.lang.String. java.awt.Color, and java.awt.Font.
 */
class PropertyEditorManager extends Object {
}

object PropertyEditorManager {
    /** Locate a value editor for a given target type. */
    @stub
    def findEditor(targetType: Class[_]): PropertyEditor = ???

    /** Gets the package names that will be searched for property editors. */
    @stub
    def getEditorSearchPath(): Array[String] = ???

    /** Registers an editor class to edit values of the given target class. */
    @stub
    def registerEditor(targetType: Class[_], editorClass: Class[_]): Unit = ???
}
