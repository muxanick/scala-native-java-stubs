package javax.lang.model

import java.lang.{CharSequence, Enum, Object, String}

// Source versions of the Java™ programming language.
//
// See the appropriate edition of
// The Java™ Language Specification
// for information about a particular source version.
//
// Note that additional source version constants will be added to
// model future releases of the language.
class SourceVersion private (name: String, ordinal: Int) extends Enum[SourceVersion](name, ordinal) {
}

object SourceVersion {
    // The original version.
    final val RELEASE_0 = new SourceVersion(RELEASE_0, 0)

    // The version recognized by the Java Platform 1.1.
    final val RELEASE_1 = new SourceVersion(RELEASE_1, 1)

    // The version recognized by the Java 2 Platform, Standard Edition,
    // v 1.2.
    final val RELEASE_2 = new SourceVersion(RELEASE_2, 2)

    // The version recognized by the Java 2 Platform, Standard Edition,
    // v 1.3.
    final val RELEASE_3 = new SourceVersion(RELEASE_3, 3)

    // The version recognized by the Java 2 Platform, Standard Edition,
    // v 1.4.
    final val RELEASE_4 = new SourceVersion(RELEASE_4, 4)

    // The version recognized by the Java 2 Platform, Standard
    // Edition 5.0.
    final val RELEASE_5 = new SourceVersion(RELEASE_5, 5)

    // The version recognized by the Java Platform, Standard Edition
    // 6.
    final val RELEASE_6 = new SourceVersion(RELEASE_6, 6)

    // The version recognized by the Java Platform, Standard Edition
    // 7.
    final val RELEASE_7 = new SourceVersion(RELEASE_7, 7)

    @stub
    // Returns whether or not name is a syntactically valid
    // identifier (simple name) or keyword in the latest source
    // version.
    def isIdentifier(name: CharSequence): Boolean = ???

    @stub
    // Returns whether or not s is a keyword or literal in the
    //  latest source version.
    def isKeyword(s: CharSequence): Boolean = ???

    @stub
    // Returns whether or not name is a syntactically valid
    //  qualified name in the latest source version.
    def isName(name: CharSequence): Boolean = ???

    @stub
    // Returns the latest source version that can be modeled.
    def latest(): SourceVersion = ???

    @stub
    // Returns the latest source version fully supported by the
    // current execution environment.
    def latestSupported(): SourceVersion = ???

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): SourceVersion = ???
}
