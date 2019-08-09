package java.lang.annotation

import java.lang.{Enum, Object, String}

// Annotation retention policy.  The constants of this enumerated type
// describe the various policies for retaining annotations.  They are used
// in conjunction with the Retention meta-annotation type to specify
// how long annotations are to be retained.
class RetentionPolicy private (name: String, ordinal: Int) extends Enum[RetentionPolicy](name, ordinal) {
}

object RetentionPolicy {
    // Annotations are to be recorded in the class file by the compiler
    // but need not be retained by the VM at run time.
    final val CLASS = new RetentionPolicy(CLASS, 0)

    // Annotations are to be recorded in the class file by the compiler and
    // retained by the VM at run time, so they may be read reflectively.
    final val RUNTIME = new RetentionPolicy(RUNTIME, 1)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): RetentionPolicy = ???
}
