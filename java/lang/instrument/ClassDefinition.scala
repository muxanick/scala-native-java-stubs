package java.lang.instrument

import java.lang.{Class, Object}

/** This class serves as a parameter block to the Instrumentation.redefineClasses method.
 *  Serves to bind the Class that needs redefining together with the new class file bytes.
 */
final class ClassDefinition extends Object {

    /** Returns the class. */
    @stub
    def getDefinitionClass(): Class[_] = ???
}
