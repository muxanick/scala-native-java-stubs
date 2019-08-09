package java.lang.instrument

import java.lang.{Class, Object}
import scala.scalanative.annotation.stub

/** This class serves as a parameter block to the Instrumentation.redefineClasses method.
 *  Serves to bind the Class that needs redefining together with the new class file bytes.
 */
final class ClassDefinition extends Object {

    /** Creates a new ClassDefinition binding using the supplied
     *   class and class file bytes.
     */
    @stub
    def this(theClass: Class[_], theClassFile: Array[Byte]) = ???

    /** Returns the class. */
    @stub
    def getDefinitionClass(): Class[_] = ???

    /** Returns the array of bytes that contains the new class file. */
    @stub
    def getDefinitionClassFile(): Array[Byte] = ???
}
