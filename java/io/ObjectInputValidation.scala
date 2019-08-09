package java.io

import scala.scalanative.annotation.stub

/** Callback interface to allow validation of objects within a graph.
 *  Allows an object to be called when a complete graph of objects has
 *  been deserialized.
 */
trait ObjectInputValidation {

    /** Validates the object. */
    @stub
    def validateObject(): Unit = ???
}
