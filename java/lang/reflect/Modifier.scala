package java.lang.reflect

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** The Modifier class provides static methods and
 *  constants to decode class and member access modifiers.  The sets of
 *  modifiers are represented as integers with distinct bit positions
 *  representing different modifiers.  The values for the constants
 *  representing the modifiers are taken from the tables in sections 4.1, 4.4, 4.5, and 4.7 of
 *  The Java™ Virtual Machine Specification.
 */
class Modifier extends Object {

    /**  */
    @stub
    def this() = ???
}

object Modifier {
    /** The int value representing the abstract
     *  modifier.
     */
    @stub
    val ABSTRACT: Int = ???

    /** The int value representing the final
     *  modifier.
     */
    @stub
    val FINAL: Int = ???

    /** The int value representing the interface
     *  modifier.
     */
    @stub
    val INTERFACE: Int = ???

    /** The int value representing the native
     *  modifier.
     */
    @stub
    val NATIVE: Int = ???

    /** The int value representing the private
     *  modifier.
     */
    @stub
    val PRIVATE: Int = ???

    /** The int value representing the protected
     *  modifier.
     */
    @stub
    val PROTECTED: Int = ???

    /** The int value representing the public
     *  modifier.
     */
    @stub
    val PUBLIC: Int = ???

    /** The int value representing the static
     *  modifier.
     */
    @stub
    val STATIC: Int = ???

    /** The int value representing the strictfp
     *  modifier.
     */
    @stub
    val STRICT: Int = ???

    /** The int value representing the synchronized
     *  modifier.
     */
    @stub
    val SYNCHRONIZED: Int = ???

    /** The int value representing the transient
     *  modifier.
     */
    @stub
    val TRANSIENT: Int = ???

    /** The int value representing the volatile
     *  modifier.
     */
    @stub
    val VOLATILE: Int = ???

    /** Return an int value OR-ing together the source language
     *  modifiers that can be applied to a class.
     */
    @stub
    def classModifiers(): Int = ???

    /** Return an int value OR-ing together the source language
     *  modifiers that can be applied to a constructor.
     */
    @stub
    def constructorModifiers(): Int = ???

    /** Return an int value OR-ing together the source language
     *  modifiers that can be applied to a field.
     */
    @stub
    def fieldModifiers(): Int = ???

    /** Return an int value OR-ing together the source language
     *  modifiers that can be applied to an interface.
     */
    @stub
    def interfaceModifiers(): Int = ???

    /** Return true if the integer argument includes the
     *  abstract modifier, false otherwise.
     */
    @stub
    def isAbstract(mod: Int): Boolean = ???

    /** Return true if the integer argument includes the
     *  final modifier, false otherwise.
     */
    @stub
    def isFinal(mod: Int): Boolean = ???

    /** Return true if the integer argument includes the
     *  interface modifier, false otherwise.
     */
    @stub
    def isInterface(mod: Int): Boolean = ???

    /** Return true if the integer argument includes the
     *  native modifier, false otherwise.
     */
    @stub
    def isNative(mod: Int): Boolean = ???

    /** Return true if the integer argument includes the
     *  private modifier, false otherwise.
     */
    @stub
    def isPrivate(mod: Int): Boolean = ???

    /** Return true if the integer argument includes the
     *  protected modifier, false otherwise.
     */
    @stub
    def isProtected(mod: Int): Boolean = ???

    /** Return true if the integer argument includes the
     *  public modifier, false otherwise.
     */
    @stub
    def isPublic(mod: Int): Boolean = ???

    /** Return true if the integer argument includes the
     *  static modifier, false otherwise.
     */
    @stub
    def isStatic(mod: Int): Boolean = ???

    /** Return true if the integer argument includes the
     *  strictfp modifier, false otherwise.
     */
    @stub
    def isStrict(mod: Int): Boolean = ???

    /** Return true if the integer argument includes the
     *  synchronized modifier, false otherwise.
     */
    @stub
    def isSynchronized(mod: Int): Boolean = ???

    /** Return true if the integer argument includes the
     *  transient modifier, false otherwise.
     */
    @stub
    def isTransient(mod: Int): Boolean = ???

    /** Return true if the integer argument includes the
     *  volatile modifier, false otherwise.
     */
    @stub
    def isVolatile(mod: Int): Boolean = ???

    /** Return an int value OR-ing together the source language
     *  modifiers that can be applied to a method.
     */
    @stub
    def methodModifiers(): Int = ???

    /** Return an int value OR-ing together the source language
     *  modifiers that can be applied to a parameter.
     */
    @stub
    def parameterModifiers(): Int = ???

    /** Return a string describing the access modifier flags in
     *  the specified modifier.
     */
    @stub
    def toString(mod: Int): String = ???
}
