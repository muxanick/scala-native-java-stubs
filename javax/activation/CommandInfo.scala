package javax.activation

import java.lang.{ClassLoader, Object, String}
import scala.scalanative.annotation.stub

/** The CommandInfo class is used by CommandMap implementations to
 *  describe the results of command requests. It provides the requestor
 *  with both the verb requested, as well as an instance of the
 *  bean. There is also a method that will return the name of the
 *  class that implements the command but it is not guaranteed to
 *  return a valid value. The reason for this is to allow CommandMap
 *  implmentations that subclass CommandInfo to provide special
 *  behavior. For example a CommandMap could dynamically generate
 *  JavaBeans. In this case, it might not be possible to create an
 *  object with all the correct state information solely from the class
 *  name.
 */
class CommandInfo extends Object {

    /** The Constructor for CommandInfo. */
    @stub
    def this(verb: String, className: String) = ???

    /** Return the command's class name. */
    @stub
    def getCommandClass(): String = ???

    /** Return the command verb. */
    @stub
    def getCommandName(): String = ???

    /** Return the instantiated JavaBean component. */
    @stub
    def getCommandObject(dh: DataHandler, loader: ClassLoader): Object = ???
}
