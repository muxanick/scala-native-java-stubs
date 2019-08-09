package javax.tools

import java.lang.{Enum, Object, String}

// Standard locations of file objects.
class StandardLocation private (name: String, ordinal: Int) extends Enum[StandardLocation](name, ordinal) with JavaFileManager.Location {
}

object StandardLocation {
    // Location to search for annotation processors.
    final val ANNOTATION_PROCESSOR_PATH = new StandardLocation(ANNOTATION_PROCESSOR_PATH, 0)

    // Location of new class files.
    final val CLASS_OUTPUT = new StandardLocation(CLASS_OUTPUT, 1)

    // Location to search for user class files.
    final val CLASS_PATH = new StandardLocation(CLASS_PATH, 2)

    // Location of new native header files.
    final val NATIVE_HEADER_OUTPUT = new StandardLocation(NATIVE_HEADER_OUTPUT, 3)

    // Location to search for platform classes.
    final val PLATFORM_CLASS_PATH = new StandardLocation(PLATFORM_CLASS_PATH, 4)

    // Location of new source files.
    final val SOURCE_OUTPUT = new StandardLocation(SOURCE_OUTPUT, 5)

    @stub
    // Gets the name of this location.
    def getName(): String = ???

    @stub
    // Determines if this is an output location.
    def isOutputLocation(): Boolean = ???

    @stub
    // Gets a location object with the given name.
    def locationFor(name: String): JavaFileManager.Location = ???

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): StandardLocation = ???
}
