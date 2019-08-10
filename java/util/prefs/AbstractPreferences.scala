package java.util.prefs

import java.io.OutputStream
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This class provides a skeletal implementation of the Preferences
 *  class, greatly easing the task of implementing it.
 * 
 *  This class is for Preferences implementers only.
 *  Normal users of the Preferences facility should have no need to
 *  consult this documentation.  The Preferences documentation
 *  should suffice.
 * 
 *  Implementors must override the nine abstract service-provider interface
 *  (SPI) methods: getSpi(String), putSpi(String,String),
 *  removeSpi(String), childSpi(String), removeNodeSpi(), keysSpi(), childrenNamesSpi(), syncSpi() and flushSpi().  All of the concrete methods specify
 *  precisely how they are implemented atop these SPI methods.  The implementor
 *  may, at his discretion, override one or more of the concrete methods if the
 *  default implementation is unsatisfactory for any reason, such as
 *  performance.
 * 
 *  The SPI methods fall into three groups concerning exception
 *  behavior. The getSpi method should never throw exceptions, but it
 *  doesn't really matter, as any exception thrown by this method will be
 *  intercepted by get(String,String), which will return the specified
 *  default value to the caller.  The removeNodeSpi, keysSpi,
 *  childrenNamesSpi, syncSpi and flushSpi methods are specified
 *  to throw BackingStoreException, and the implementation is required
 *  to throw this checked exception if it is unable to perform the operation.
 *  The exception propagates outward, causing the corresponding API method
 *  to fail.
 * 
 *  The remaining SPI methods putSpi(String,String), removeSpi(String) and childSpi(String) have more complicated
 *  exception behavior.  They are not specified to throw
 *  BackingStoreException, as they can generally obey their contracts
 *  even if the backing store is unavailable.  This is true because they return
 *  no information and their effects are not required to become permanent until
 *  a subsequent call to Preferences.flush() or
 *  Preferences.sync(). Generally speaking, these SPI methods should not
 *  throw exceptions.  In some implementations, there may be circumstances
 *  under which these calls cannot even enqueue the requested operation for
 *  later processing.  Even under these circumstances it is generally better to
 *  simply ignore the invocation and return, rather than throwing an
 *  exception.  Under these circumstances, however, all subsequent invocations
 *  of flush() and sync should return false, as
 *  returning true would imply that all previous operations had
 *  successfully been made permanent.
 * 
 *  There is one circumstance under which putSpi, removeSpi and
 *  childSpi should throw an exception: if the caller lacks
 *  sufficient privileges on the underlying operating system to perform the
 *  requested operation.  This will, for instance, occur on most systems
 *  if a non-privileged user attempts to modify system preferences.
 *  (The required privileges will vary from implementation to
 *  implementation.  On some implementations, they are the right to modify the
 *  contents of some directory in the file system; on others they are the right
 *  to modify contents of some key in a registry.)  Under any of these
 *  circumstances, it would generally be undesirable to let the program
 *  continue executing as if these operations would become permanent at a later
 *  time.  While implementations are not required to throw an exception under
 *  these circumstances, they are encouraged to do so.  A SecurityException would be appropriate.
 * 
 *  Most of the SPI methods require the implementation to read or write
 *  information at a preferences node.  The implementor should beware of the
 *  fact that another VM may have concurrently deleted this node from the
 *  backing store.  It is the implementation's responsibility to recreate the
 *  node if it has been deleted.
 * 
 *  Implementation note: In Sun's default Preferences
 *  implementations, the user's identity is inherited from the underlying
 *  operating system and does not change for the lifetime of the virtual
 *  machine.  It is recognized that server-side Preferences
 *  implementations may have the user identity change from request to request,
 *  implicitly passed to Preferences methods via the use of a
 *  static ThreadLocal instance.  Authors of such implementations are
 *  strongly encouraged to determine the user at the time preferences
 *  are accessed (for example by the get(String,String) or put(String,String) method) rather than permanently associating a user
 *  with each Preferences instance.  The latter behavior conflicts
 *  with normal Preferences usage and would lead to great confusion.
 */
abstract class AbstractPreferences extends Preferences {

    /** Creates a preference node with the specified parent and the specified
     *  name relative to its parent.
     */
    @stub
    protected def this(parent: AbstractPreferences, name: String) = ???

    /** An object whose monitor is used to lock this node. */
    protected val lock: Any

    /** This field should be true if this node did not exist in the
     *  backing store prior to the creation of this object.
     */
    protected val newNode: Boolean

    /** Implements the absolutePath method as per the specification in
     *  Preferences.absolutePath().
     */
    def absolutePath(): String

    /** Registers the specified listener to receive node change events
     *  for this node.
     */
    def addNodeChangeListener(ncl: NodeChangeListener): Unit

    /** Registers the specified listener to receive preference change
     *  events for this preference node.
     */
    def addPreferenceChangeListener(pcl: PreferenceChangeListener): Unit

    /** Returns all known unremoved children of this node. */
    protected def cachedChildren(): Array[AbstractPreferences]

    /** Implements the children method as per the specification in
     *  Preferences.childrenNames().
     */
    def childrenNames(): Array[String]

    /** Returns the names of the children of this preference node. */
    protected def childrenNamesSpi(): Array[String]

    /** Returns the named child of this preference node, creating it if it does
     *  not already exist.
     */
    protected def childSpi(name: String): AbstractPreferences

    /** Implements the clear method as per the specification in
     *  Preferences.clear().
     */
    def clear(): Unit

    /** Implements the exportNode method as per the specification in
     *  Preferences.exportNode(OutputStream).
     */
    def exportNode(os: OutputStream): Unit

    /** Implements the exportSubtree method as per the specification in
     *  Preferences.exportSubtree(OutputStream).
     */
    def exportSubtree(os: OutputStream): Unit

    /** Implements the flush method as per the specification in
     *  Preferences.flush().
     */
    def flush(): Unit

    /** This method is invoked with this node locked. */
    protected def flushSpi(): Unit

    /** Implements the get method as per the specification in
     *  Preferences.get(String,String).
     */
    def get(key: String, def: String): String

    /** Implements the getBoolean method as per the specification in
     *  Preferences.getBoolean(String,boolean).
     */
    def getBoolean(key: String, def: Boolean): Boolean

    /** Implements the getByteArray method as per the specification in
     *  Preferences.getByteArray(String,byte[]).
     */
    def getByteArray(key: String, def: Array[Byte]): Array[Byte]

    /** Returns the named child if it exists, or null if it does not. */
    protected def getChild(nodeName: String): AbstractPreferences

    /** Implements the getDouble method as per the specification in
     *  Preferences.getDouble(String,double).
     */
    def getDouble(key: String, def: Double): Double

    /** Implements the getFloat method as per the specification in
     *  Preferences.getFloat(String,float).
     */
    def getFloat(key: String, def: Float): Float

    /** Implements the getInt method as per the specification in
     *  Preferences.getInt(String,int).
     */
    def getInt(key: String, def: Int): Int

    /** Implements the getLong method as per the specification in
     *  Preferences.getLong(String,long).
     */
    def getLong(key: String, def: Long): Long

    /** Return the value associated with the specified key at this preference
     *  node, or null if there is no association for this key, or the
     *  association cannot be determined at this time.
     */
    protected def getSpi(key: String): String

    /** Returns true iff this node (or an ancestor) has been
     *  removed with the removeNode() method.
     */
    protected def isRemoved(): Boolean

    /** Implements the isUserNode method as per the specification in
     *  Preferences.isUserNode().
     */
    def isUserNode(): Boolean

    /** Implements the keys method as per the specification in
     *  Preferences.keys().
     */
    def keys(): Array[String]

    /** Returns all of the keys that have an associated value in this
     *  preference node.
     */
    protected def keysSpi(): Array[String]

    /** Implements the name method as per the specification in
     *  Preferences.name().
     */
    def name(): String

    /** Implements the node method as per the specification in
     *  Preferences.node(String).
     */
    def node(path: String): Preferences

    /** Implements the nodeExists method as per the specification in
     *  Preferences.nodeExists(String).
     */
    def nodeExists(path: String): Boolean

    /** Implements the parent method as per the specification in
     *  Preferences.parent().
     */
    def parent(): Preferences

    /** Implements the put method as per the specification in
     *  Preferences.put(String,String).
     */
    def put(key: String, value: String): Unit

    /** Implements the putBoolean method as per the specification in
     *  Preferences.putBoolean(String,boolean).
     */
    def putBoolean(key: String, value: Boolean): Unit

    /** Implements the putByteArray method as per the specification in
     *  Preferences.putByteArray(String,byte[]).
     */
    def putByteArray(key: String, value: Array[Byte]): Unit

    /** Implements the putDouble method as per the specification in
     *  Preferences.putDouble(String,double).
     */
    def putDouble(key: String, value: Double): Unit

    /** Implements the putFloat method as per the specification in
     *  Preferences.putFloat(String,float).
     */
    def putFloat(key: String, value: Float): Unit

    /** Implements the putInt method as per the specification in
     *  Preferences.putInt(String,int).
     */
    def putInt(key: String, value: Int): Unit

    /** Implements the putLong method as per the specification in
     *  Preferences.putLong(String,long).
     */
    def putLong(key: String, value: Long): Unit

    /** Put the given key-value association into this preference node. */
    protected def putSpi(key: String, value: String): Unit

    /** Implements the remove(String) method as per the specification
     *  in Preferences.remove(String).
     */
    def remove(key: String): Unit

    /** Implements the removeNode() method as per the specification in
     *  Preferences.removeNode().
     */
    def removeNode(): Unit

    /** Removes the specified NodeChangeListener, so it no longer
     *  receives change events.
     */
    def removeNodeChangeListener(ncl: NodeChangeListener): Unit

    /** Removes this preference node, invalidating it and any preferences that
     *  it contains.
     */
    protected def removeNodeSpi(): Unit

    /** Removes the specified preference change listener, so it no longer
     *  receives preference change events.
     */
    def removePreferenceChangeListener(pcl: PreferenceChangeListener): Unit

    /** Remove the association (if any) for the specified key at this
     *  preference node.
     */
    protected def removeSpi(key: String): Unit

    /** Implements the sync method as per the specification in
     *  Preferences.sync().
     */
    def sync(): Unit

    /** This method is invoked with this node locked. */
    protected def syncSpi(): Unit

    /** Returns the absolute path name of this preferences node. */
    def toString(): String
}
