package java.lang.instrument

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
}
