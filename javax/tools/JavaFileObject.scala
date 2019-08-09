package javax.tools

import java.lang.String
import javax.lang.model.element.{Modifier, NestingKind}
import scala.scalanative.annotation.stub

/** File abstraction for tools operating on Java™ programming language
 *  source and class files.
 * 
 *  All methods in this interface might throw a SecurityException if
 *  a security exception occurs.
 * 
 *  Unless explicitly allowed, all methods in this interface might
 *  throw a NullPointerException if given a null argument.
 */
trait JavaFileObject extends FileObject {

    /** Provides a hint about the access level of the class represented
     *  by this file object.
     */
    @stub
    def getAccessLevel(): Modifier = ???

    /** Gets the kind of this file object. */
    @stub
    def getKind(): JavaFileObject.Kind = ???

    /** Provides a hint about the nesting level of the class
     *  represented by this file object.
     */
    @stub
    def getNestingKind(): NestingKind = ???

    /** Checks if this file object is compatible with the specified
     *  simple name and kind.
     */
    @stub
    def isNameCompatible(simpleName: String, kind: JavaFileObject.Kind): Boolean = ???
}

object JavaFileObject {
    /** Kinds of JavaFileObjects. */
    @stub
    object Kind extends JavaFileObject.Kind
}
