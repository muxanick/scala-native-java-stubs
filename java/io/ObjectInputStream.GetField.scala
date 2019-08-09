package java.io

import java.lang.{Object, String}

// Provide access to the persistent fields read from the input stream.
object abstract ObjectInputStream.GetField extends Object {

    @stub
    // Return true if the named field is defaulted and has no value in this
    // stream.
    def defaulted(name: String): Boolean

    @stub
    // Get the value of the named boolean field from the persistent field.
    def get(name: String, val: Boolean): Boolean

    @stub
    // Get the value of the named byte field from the persistent field.
    def get(name: String, val: Byte): Byte

    @stub
    // Get the value of the named char field from the persistent field.
    def get(name: String, val: Char): Char

    @stub
    // Get the value of the named double field from the persistent field.
    def get(name: String, val: double): double

    @stub
    // Get the value of the named float field from the persistent field.
    def get(name: String, val: float): float

    @stub
    // Get the value of the named int field from the persistent field.
    def get(name: String, val: Int): Int

    @stub
    // Get the value of the named long field from the persistent field.
    def get(name: String, val: Long): Long

    @stub
    // Get the value of the named Object field from the persistent field.
    def get(name: String, val: Object): Object

    @stub
    // Get the value of the named short field from the persistent field.
    def get(name: String, val: Short): Short
}
