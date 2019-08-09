package java.lang.reflect

import java.lang.{Class, String}

// Member is an interface that reflects identifying information about
// a single member (a field or a method) or a constructor.
trait Member {

    @stub
    // Returns the Class object representing the class or interface
    // that declares the member or constructor represented by this Member.
    def getDeclaringClass(): Class[_] = ???

    @stub
    // Returns the Java language modifiers for the member or
    // constructor represented by this Member, as an integer.
    def getModifiers(): Int = ???

    @stub
    // Returns the simple name of the underlying member or constructor
    // represented by this Member.
    def getName(): String = ???
}

object Member {
    @stub
    // Identifies the set of declared members of a class or interface.
    def DECLARED: Int = ???
}
