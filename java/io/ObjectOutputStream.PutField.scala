package java.io

import java.lang.{Object, String}

/** Provide programmatic access to the persistent fields to be written
 *  to ObjectOutput.
 */
object abstract ObjectOutputStream.PutField extends Object {

    /** Put the value of the named boolean field into the persistent field. */
    @stub
    def put(name: String, val: Boolean): Unit

    /** Put the value of the named byte field into the persistent field. */
    @stub
    def put(name: String, val: Byte): Unit

    /** Put the value of the named char field into the persistent field. */
    @stub
    def put(name: String, val: Char): Unit

    /** Put the value of the named double field into the persistent field. */
    @stub
    def put(name: String, val: Double): Unit

    /** Put the value of the named float field into the persistent field. */
    @stub
    def put(name: String, val: Float): Unit

    /** Put the value of the named int field into the persistent field. */
    @stub
    def put(name: String, val: Int): Unit

    /** Put the value of the named long field into the persistent field. */
    @stub
    def put(name: String, val: Long): Unit

    /** Put the value of the named Object field into the persistent field. */
    @stub
    def put(name: String, val: Object): Unit

    /** Put the value of the named short field into the persistent field. */
    @stub
    def put(name: String, val: Short): Unit
}
