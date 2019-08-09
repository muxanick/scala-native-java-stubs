package java.lang.reflect

import java.lang.Object

// The Modifier class provides static methods and
// constants to decode class and member access modifiers.  The sets of
// modifiers are represented as integers with distinct bit positions
// representing different modifiers.  The values for the constants
// representing the modifiers are taken from the tables in sections 4.1, 4.4, 4.5, and 4.7 of
// The Java™ Virtual Machine Specification.
class Modifier extends Object {
}

object Modifier {
    @stub
    // The int value representing the abstract
    // modifier.
    def ABSTRACT: Int = ???

    @stub
    // The int value representing the final
    // modifier.
    def FINAL: Int = ???

    @stub
    // The int value representing the interface
    // modifier.
    def INTERFACE: Int = ???

    @stub
    // The int value representing the native
    // modifier.
    def NATIVE: Int = ???

    @stub
    // The int value representing the private
    // modifier.
    def PRIVATE: Int = ???

    @stub
    // The int value representing the protected
    // modifier.
    def PROTECTED: Int = ???

    @stub
    // The int value representing the public
    // modifier.
    def PUBLIC: Int = ???

    @stub
    // The int value representing the static
    // modifier.
    def STATIC: Int = ???

    @stub
    // The int value representing the strictfp
    // modifier.
    def STRICT: Int = ???

    @stub
    // The int value representing the synchronized
    // modifier.
    def SYNCHRONIZED: Int = ???

    @stub
    // The int value representing the transient
    // modifier.
    def TRANSIENT: Int = ???

    @stub
    // Return an int value OR-ing together the source language
    // modifiers that can be applied to a class.
    def classModifiers(): Int = ???

    @stub
    // Return an int value OR-ing together the source language
    // modifiers that can be applied to a constructor.
    def constructorModifiers(): Int = ???

    @stub
    // Return an int value OR-ing together the source language
    // modifiers that can be applied to a field.
    def fieldModifiers(): Int = ???

    @stub
    // Return an int value OR-ing together the source language
    // modifiers that can be applied to an interface.
    def interfaceModifiers(): Int = ???

    @stub
    // Return true if the integer argument includes the
    // abstract modifier, false otherwise.
    def isAbstract(mod: Int): Boolean = ???

    @stub
    // Return true if the integer argument includes the
    // final modifier, false otherwise.
    def isFinal(mod: Int): Boolean = ???

    @stub
    // Return true if the integer argument includes the
    // interface modifier, false otherwise.
    def isInterface(mod: Int): Boolean = ???

    @stub
    // Return true if the integer argument includes the
    // native modifier, false otherwise.
    def isNative(mod: Int): Boolean = ???

    @stub
    // Return true if the integer argument includes the
    // private modifier, false otherwise.
    def isPrivate(mod: Int): Boolean = ???

    @stub
    // Return true if the integer argument includes the
    // protected modifier, false otherwise.
    def isProtected(mod: Int): Boolean = ???

    @stub
    // Return true if the integer argument includes the
    // public modifier, false otherwise.
    def isPublic(mod: Int): Boolean = ???

    @stub
    // Return true if the integer argument includes the
    // static modifier, false otherwise.
    def isStatic(mod: Int): Boolean = ???

    @stub
    // Return true if the integer argument includes the
    // strictfp modifier, false otherwise.
    def isStrict(mod: Int): Boolean = ???

    @stub
    // Return true if the integer argument includes the
    // synchronized modifier, false otherwise.
    def isSynchronized(mod: Int): Boolean = ???

    @stub
    // Return true if the integer argument includes the
    // transient modifier, false otherwise.
    def isTransient(mod: Int): Boolean = ???

    @stub
    // Return true if the integer argument includes the
    // volatile modifier, false otherwise.
    def isVolatile(mod: Int): Boolean = ???

    @stub
    // Return an int value OR-ing together the source language
    // modifiers that can be applied to a method.
    def methodModifiers(): Int = ???

    @stub
    // Return an int value OR-ing together the source language
    // modifiers that can be applied to a parameter.
    def parameterModifiers(): Int = ???
}
