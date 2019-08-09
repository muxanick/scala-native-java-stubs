package java.lang.instrument

import java.lang.{Class, ClassLoader, String}
import java.security.ProtectionDomain
import scala.scalanative.annotation.stub

/** An agent provides an implementation of this interface in order
 *  to transform class files.
 *  The transformation occurs before the class is defined by the JVM.
 *  
 *  Note the term class file is used as defined in section 3.1 of
 *  The Java™ Virtual Machine Specification,
 *  to mean a sequence
 *  of bytes in class file format, whether or not they reside in a file.
 */
trait ClassFileTransformer {

    /** The implementation of this method may transform the supplied class file and
     *  return a new replacement class file.
     */
    @stub
    def transform(loader: ClassLoader, className: String, classBeingRedefined: Class[_], protectionDomain: ProtectionDomain, classfileBuffer: Array[Byte]): Array[Byte] = ???
}
