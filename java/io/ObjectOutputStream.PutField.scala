package java.io

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Provide programmatic access to the persistent fields to be written
 *  to ObjectOutput.
 */
object abstract ObjectOutputStream_PutField extends Object {

    /**  */
    @stub
    def PutField() = ???

    /** Put the value of the named boolean field into the persistent field. */
    def put(name: String, val: Boolean): Unit

    /** Put the value of the named byte field into the persistent field. */
    def put(name: String, val: Byte): Unit

    /** Put the value of the named char field into the persistent field. */
    def put(name: String, val: Char): Unit

    /** Put the value of the named double field into the persistent field. */
    def put(name: String, val: Double): Unit

    /** Put the value of the named float field into the persistent field. */
    def put(name: String, val: Float): Unit

    /** Put the value of the named int field into the persistent field. */
    def put(name: String, val: Int): Unit

    /** Put the value of the named long field into the persistent field. */
    def put(name: String, val: Long): Unit

    /** Put the value of the named Object field into the persistent field. */
    def put(name: String, val: Any): Unit

    /** Put the value of the named short field into the persistent field. */
    def put(name: String, val: Short): Unit

    /** Deprecated. 
     * This method does not write the values contained by this
     *          PutField object in a proper format, and may
     *          result in corruption of the serialization stream.  The
     *          correct way to write PutField data is by
     *          calling the ObjectOutputStream.writeFields()
     *          method.
     * 
     */
    def write(out: ObjectOutput): Unit
}
