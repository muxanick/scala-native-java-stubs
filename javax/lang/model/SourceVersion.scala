package javax.lang.model

import java.lang.{CharSequence, Enum, Object, String}
import scala.scalanative.annotation.stub

/** Source versions of the Java™ programming language.
 * 
 *  See the appropriate edition of
 *  The Java™ Language Specification
 *  for information about a particular source version.
 * 
 *  Note that additional source version constants will be added to
 *  model future releases of the language.
 */
class SourceVersion private (name: String, ordinal: Int) extends Enum[SourceVersion](name, ordinal) {
}

object SourceVersion {
    /** The original version. */
    final val RELEASE_0: SourceVersion = new SourceVersion("RELEASE_0", 0)

    /** The version recognized by the Java Platform 1.1. */
    final val RELEASE_1: SourceVersion = new SourceVersion("RELEASE_1", 1)

    /** The version recognized by the Java 2 Platform, Standard Edition,
     *  v 1.2.
     */
    final val RELEASE_2: SourceVersion = new SourceVersion("RELEASE_2", 2)

    /** The version recognized by the Java 2 Platform, Standard Edition,
     *  v 1.3.
     */
    final val RELEASE_3: SourceVersion = new SourceVersion("RELEASE_3", 3)

    /** The version recognized by the Java 2 Platform, Standard Edition,
     *  v 1.4.
     */
    final val RELEASE_4: SourceVersion = new SourceVersion("RELEASE_4", 4)

    /** The version recognized by the Java 2 Platform, Standard
     *  Edition 5.0.
     */
    final val RELEASE_5: SourceVersion = new SourceVersion("RELEASE_5", 5)

    /** The version recognized by the Java Platform, Standard Edition
     *  6.
     */
    final val RELEASE_6: SourceVersion = new SourceVersion("RELEASE_6", 6)

    /** The version recognized by the Java Platform, Standard Edition
     *  7.
     */
    final val RELEASE_7: SourceVersion = new SourceVersion("RELEASE_7", 7)

    /** The version recognized by the Java Platform, Standard Edition
     *  8.
     */
    final val RELEASE_8: SourceVersion = new SourceVersion("RELEASE_8", 8)

    /** Returns whether or not name is a syntactically valid
     *  identifier (simple name) or keyword in the latest source
     *  version.
     */
    @stub
    def isIdentifier(name: CharSequence): Boolean = ???

    /** Returns whether or not s is a keyword or literal in the
     *   latest source version.
     */
    @stub
    def isKeyword(s: CharSequence): Boolean = ???

    /** Returns whether or not name is a syntactically valid
     *   qualified name in the latest source version.
     */
    @stub
    def isName(name: CharSequence): Boolean = ???

    /** Returns the latest source version that can be modeled. */
    @stub
    def latest(): SourceVersion = ???

    /** Returns the latest source version fully supported by the
     *  current execution environment.
     */
    @stub
    def latestSupported(): SourceVersion = ???

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): SourceVersion = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[SourceVersion] = ???
}
