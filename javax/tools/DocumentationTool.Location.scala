package javax.tools

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Locations specific to DocumentationTool. */
class DocumentationTool_Location private (name: String, ordinal: Int) extends Enum[DocumentationTool.Location](name, ordinal) with JavaFileManager.Location {
}

object DocumentationTool_Location {
    /** Location to search for doclets. */
    final val DOCLET_PATH = new DocumentationTool.Location(DOCLET_PATH, 0)

    /** Location of new documentation files. */
    final val DOCUMENTATION_OUTPUT = new DocumentationTool.Location(DOCUMENTATION_OUTPUT, 1)

    /** Location to search for taglets. */
    final val TAGLET_PATH = new DocumentationTool.Location(TAGLET_PATH, 2)

    /** Gets the name of this location. */
    @stub
    def getName(): String = ???

    /** Determines if this is an output location. */
    @stub
    def isOutputLocation(): Boolean = ???

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): DocumentationTool.Location = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[DocumentationTool.Location] = ???
}
