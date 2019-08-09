package javax.tools

import java.lang.{Enum, Object, String}

// Locations specific to DocumentationTool.
class DocumentationTool.Location private (name: String, ordinal: Int) extends Enum[DocumentationTool.Location](name, ordinal) with JavaFileManager.Location {
}

object DocumentationTool.Location {
    // Location to search for doclets.
    final val DOCLET_PATH = new DocumentationTool.Location(DOCLET_PATH, 0)

    // Location of new documentation files.
    final val DOCUMENTATION_OUTPUT = new DocumentationTool.Location(DOCUMENTATION_OUTPUT, 1)

    @stub
    // Gets the name of this location.
    def getName(): String = ???

    @stub
    // Determines if this is an output location.
    def isOutputLocation(): Boolean = ???

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): DocumentationTool.Location = ???
}
