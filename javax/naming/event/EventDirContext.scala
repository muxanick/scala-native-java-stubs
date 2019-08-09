package javax.naming.event

import java.lang.{Object, String}
import javax.naming.Name
import javax.naming.directory.{DirContext, SearchControls}

/** Contains methods for registering listeners to be notified
 *  of events fired when objects named in a directory context changes.
 * 
 *  The methods in this interface support identification of objects by
 *  RFC 2254
 *  search filters.
 * 
 * Using the search filter, it is possible to register interest in objects
 *  that do not exist at the time of registration but later come into existence and
 *  satisfy the filter.  However, there might be limitations in the extent
 *  to which this can be supported by the service provider and underlying
 *  protocol/service.  If the caller submits a filter that cannot be
 *  supported in this way, addNamingListener() throws an
 *  InvalidSearchFilterException.
 * 
 *  See EventContext for a description of event source
 *  and target, and information about listener registration/deregistration
 *  that are also applicable to methods in this interface.
 *  See the
 *  package description
 *  for information on threading issues.
 * 
 *  A SearchControls or array object
 *  passed as a parameter to any method is owned by the caller.
 *  The service provider will not modify the object or keep a reference to it.
 */
trait EventDirContext extends EventContext with DirContext {

    /** Adds a listener for receiving naming events fired
     *  when objects identified by the search filter filter and
     *  filter arguments at the object named by the target are modified.
     */
    @stub
    def addNamingListener(target: Name, filter: String, filterArgs: Array[Object], ctls: SearchControls, l: NamingListener): Unit = ???

    /** Adds a listener for receiving naming events fired
     *  when objects identified by the search filter filter at
     *  the object named by target are modified.
     */
    @stub
    def addNamingListener(target: Name, filter: String, ctls: SearchControls, l: NamingListener): Unit = ???

    /** Adds a listener for receiving naming events fired when
     *  objects identified by the search filter filter
     *  and filter arguments at the
     *  object named by the string target name are modified.
     */
    @stub
    def addNamingListener(target: String, filter: String, filterArgs: Array[Object], ctls: SearchControls, l: NamingListener): Unit = ???
}
