package java.io

import java.lang.{Object, String}

/** Provide access to the persistent fields read from the input stream. */
object abstract ObjectInputStream.GetField extends Object {

    /** Return true if the named field is defaulted and has no value in this
     *  stream.
     */
    @stub
    def defaulted(name: String): Boolean

    /** Get the value of the named boolean field from the persistent field. */
    @stub
    def get(name: String, val: Boolean): Boolean

    /** Get the value of the named byte field from the persistent field. */
    @stub
    def get(name: String, val: Byte): Byte

    /** Get the value of the named char field from the persistent field. */
    @stub
    def get(name: String, val: Char): Char

    /** Get the value of the named double field from the persistent field. */
    @stub
    def get(name: String, val: Double): Double

    /** Get the value of the named float field from the persistent field. */
    @stub
    def get(name: String, val: Float): Float

    /** Get the value of the named int field from the persistent field. */
    @stub
    def get(name: String, val: Int): Int

    /** Get the value of the named long field from the persistent field. */
    @stub
    def get(name: String, val: Long): Long

    /** Get the value of the named Object field from the persistent field. */
    @stub
    def get(name: String, val: Object): Object

    /** Get the value of the named short field from the persistent field. */
    @stub
    def get(name: String, val: Short): Short
}
