package java.lang

import scala.scalanative.annotation.stub

/** The Compiler class is provided to support Java-to-native-code
 *  compilers and related services. By design, the Compiler class does
 *  nothing; it serves as a placeholder for a JIT compiler implementation.
 * 
 *   When the Java Virtual Machine first starts, it determines if the system
 *  property java.compiler exists. (System properties are accessible
 *  through System.getProperty(String) and System.getProperty(String, String).  If so, it is assumed to be the name of
 *  a library (with a platform-dependent exact location and type); System.loadLibrary(java.lang.String) is called to load that library. If this loading
 *  succeeds, the function named java_lang_Compiler_start() in that
 *  library is called.
 * 
 *   If no compiler is available, these methods do nothing.
 */
final class Compiler extends Object {
}

object Compiler {
    /** Examines the argument type and its fields and perform some documented
     *  operation.
     */
    @stub
    def command(any: Any): Any = ???

    /** Compiles the specified class. */
    @stub
    def compileClass(clazz: Class[_]): Boolean = ???

    /** Compiles all classes whose name matches the specified string. */
    @stub
    def compileClasses(string: String): Boolean = ???

    /** Cause the Compiler to cease operation. */
    @stub
    def disable(): Unit = ???

    /** Cause the Compiler to resume operation. */
    @stub
    def enable(): Unit = ???
}
