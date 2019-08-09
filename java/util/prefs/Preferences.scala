package java.util.prefs

import java.io.{InputStream, OutputStream}
import java.lang.{Class, Object, String}
import scala.scalanative.annotation.stub

/** A node in a hierarchical collection of preference data.  This class
 *  allows applications to store and retrieve user and system
 *  preference and configuration data.  This data is stored
 *  persistently in an implementation-dependent backing store.  Typical
 *  implementations include flat files, OS-specific registries,
 *  directory servers and SQL databases.  The user of this class needn't
 *  be concerned with details of the backing store.
 * 
 *  There are two separate trees of preference nodes, one for user
 *  preferences and one for system preferences.  Each user has a separate user
 *  preference tree, and all users in a given system share the same system
 *  preference tree.  The precise description of "user" and "system" will vary
 *  from implementation to implementation.  Typical information stored in the
 *  user preference tree might include font choice, color choice, or preferred
 *  window location and size for a particular application.  Typical information
 *  stored in the system preference tree might include installation
 *  configuration data for an application.
 * 
 *  Nodes in a preference tree are named in a similar fashion to
 *  directories in a hierarchical file system.   Every node in a preference
 *  tree has a node name (which is not necessarily unique),
 *  a unique absolute path name, and a path name relative to each
 *  ancestor including itself.
 * 
 *  The root node has a node name of the empty string ("").  Every other
 *  node has an arbitrary node name, specified at the time it is created.  The
 *  only restrictions on this name are that it cannot be the empty string, and
 *  it cannot contain the slash character ('/').
 * 
 *  The root node has an absolute path name of "/".  Children of
 *  the root node have absolute path names of "/" + <node
 *  name>.  All other nodes have absolute path names of <parent's
 *  absolute path name> + "/" + <node name>.
 *  Note that all absolute path names begin with the slash character.
 * 
 *  A node n's path name relative to its ancestor a
 *  is simply the string that must be appended to a's absolute path name
 *  in order to form n's absolute path name, with the initial slash
 *  character (if present) removed.  Note that:
 *  
 *  No relative path names begin with the slash character.
 *  Every node's path name relative to itself is the empty string.
 *  Every node's path name relative to its parent is its node name (except
 *  for the root node, which does not have a parent).
 *  Every node's path name relative to the root is its absolute path name
 *  with the initial slash character removed.
 *  
 * 
 *  Note finally that:
 *  
 *  No path name contains multiple consecutive slash characters.
 *  No path name with the exception of the root's absolute path name
 *  ends in the slash character.
 *  Any string that conforms to these two rules is a valid path name.
 *  
 * 
 *  All of the methods that modify preferences data are permitted to operate
 *  asynchronously; they may return immediately, and changes will eventually
 *  propagate to the persistent backing store with an implementation-dependent
 *  delay.  The flush method may be used to synchronously force
 *  updates to the backing store.  Normal termination of the Java Virtual
 *  Machine will not result in the loss of pending updates -- an explicit
 *  flush invocation is not required upon termination to ensure
 *  that pending updates are made persistent.
 * 
 *  All of the methods that read preferences from a Preferences
 *  object require the invoker to provide a default value.  The default value is
 *  returned if no value has been previously set or if the backing store is
 *  unavailable.  The intent is to allow applications to operate, albeit
 *  with slightly degraded functionality, even if the backing store becomes
 *  unavailable.  Several methods, like flush, have semantics that
 *  prevent them from operating if the backing store is unavailable.  Ordinary
 *  applications should have no need to invoke any of these methods, which can
 *  be identified by the fact that they are declared to throw BackingStoreException.
 * 
 *  The methods in this class may be invoked concurrently by multiple threads
 *  in a single JVM without the need for external synchronization, and the
 *  results will be equivalent to some serial execution.  If this class is used
 *  concurrently by multiple JVMs that store their preference data in
 *  the same backing store, the data store will not be corrupted, but no
 *  other guarantees are made concerning the consistency of the preference
 *  data.
 * 
 *  This class contains an export/import facility, allowing preferences
 *  to be "exported" to an XML document, and XML documents representing
 *  preferences to be "imported" back into the system.  This facility
 *  may be used to back up all or part of a preference tree, and
 *  subsequently restore from the backup.
 * 
 *  The XML document has the following DOCTYPE declaration:
 *  
 *  <!DOCTYPE preferences SYSTEM "http://java.sun.com/dtd/preferences.dtd">
 *  
 *  Note that the system URI (http://java.sun.com/dtd/preferences.dtd) is
 *  not accessed when exporting or importing preferences; it merely
 *  serves as a string to uniquely identify the DTD, which is:
 *  
 *     <?xml version="1.0" encoding="UTF-8"?>
 * 
 *     <!-- DTD for a Preferences tree. -->
 * 
 *     <!-- The preferences element is at the root of an XML document
 *          representing a Preferences tree. -->
 *     <!ELEMENT preferences (root)>
 * 
 *     <!-- The preferences element contains an optional version attribute,
 *           which specifies version of DTD. -->
 *     <!ATTLIST preferences EXTERNAL_XML_VERSION CDATA "0.0" >
 * 
 *     <!-- The root element has a map representing the root's preferences
 *          (if any), and one node for each child of the root (if any). -->
 *     <!ELEMENT root (map, node*) >
 * 
 *     <!-- Additionally, the root contains a type attribute, which
 *          specifies whether it's the system or user root. -->
 *     <!ATTLIST root
 *               type (system|user) #REQUIRED >
 * 
 *     <!-- Each node has a map representing its preferences (if any),
 *          and one node for each child (if any). -->
 *     <!ELEMENT node (map, node*) >
 * 
 *     <!-- Additionally, each node has a name attribute -->
 *     <!ATTLIST node
 *               name CDATA #REQUIRED >
 * 
 *     <!-- A map represents the preferences stored at a node (if any). -->
 *     <!ELEMENT map (entry*) >
 * 
 *     <!-- An entry represents a single preference, which is simply
 *           a key-value pair. -->
 *     <!ELEMENT entry EMPTY >
 *     <!ATTLIST entry
 *               key   CDATA #REQUIRED
 *               value CDATA #REQUIRED >
 *  
 * 
 *  Every Preferences implementation must have an associated PreferencesFactory implementation.  Every Java(TM) SE implementation must provide
 *  some means of specifying which PreferencesFactory implementation
 *  is used to generate the root preferences nodes.  This allows the
 *  administrator to replace the default preferences implementation with an
 *  alternative implementation.
 * 
 *  Implementation note: In Sun's JRE, the PreferencesFactory
 *  implementation is located as follows:
 * 
 *  
 * 
 *  If the system property
 *  java.util.prefs.PreferencesFactory is defined, then it is
 *  taken to be the fully-qualified name of a class implementing the
 *  PreferencesFactory interface.  The class is loaded and
 *  instantiated; if this process fails then an unspecified error is
 *  thrown.
 * 
 *   If a PreferencesFactory implementation class file
 *  has been installed in a jar file that is visible to the
 *  system class loader,
 *  and that jar file contains a provider-configuration file named
 *  java.util.prefs.PreferencesFactory in the resource
 *  directory META-INF/services, then the first class name
 *  specified in that file is taken.  If more than one such jar file is
 *  provided, the first one found will be used.  The class is loaded
 *  and instantiated; if this process fails then an unspecified error
 *  is thrown.  
 * 
 *  Finally, if neither the above-mentioned system property nor
 *  an extension jar file is provided, then the system-wide default
 *  PreferencesFactory implementation for the underlying
 *  platform is loaded and instantiated.
 * 
 *  
 */
abstract class Preferences extends Object {

    /** Sole constructor. */
    @stub
    protected def this() = ???

    /** Returns this preference node's absolute path name. */
    def absolutePath(): String

    /** Registers the specified listener to receive node change events
     *  for this node.
     */
    def addNodeChangeListener(ncl: NodeChangeListener): Unit

    /** Registers the specified listener to receive preference change
     *  events for this preference node.
     */
    def addPreferenceChangeListener(pcl: PreferenceChangeListener): Unit

    /** Returns the names of the children of this preference node, relative to
     *  this node.
     */
    def childrenNames(): Array[String]

    /** Removes all of the preferences (key-value associations) in this
     *  preference node.
     */
    def clear(): Unit

    /** Emits on the specified output stream an XML document representing all
     *  of the preferences contained in this node (but not its descendants).
     */
    def exportNode(os: OutputStream): Unit

    /** Emits an XML document representing all of the preferences contained
     *  in this node and all of its descendants.
     */
    def exportSubtree(os: OutputStream): Unit

    /** Forces any changes in the contents of this preference node and its
     *  descendants to the persistent store.
     */
    def flush(): Unit

    /** Returns the value associated with the specified key in this preference
     *  node.
     */
    def get(key: String, def: String): String

    /** Returns the boolean value represented by the string associated with the
     *  specified key in this preference node.
     */
    def getBoolean(key: String, def: Boolean): Boolean

    /** Returns the byte array value represented by the string associated with
     *  the specified key in this preference node.
     */
    def getByteArray(key: String, def: Array[Byte]): Array[Byte]

    /** Returns the double value represented by the string associated with the
     *  specified key in this preference node.
     */
    def getDouble(key: String, def: Double): Double

    /** Returns the float value represented by the string associated with the
     *  specified key in this preference node.
     */
    def getFloat(key: String, def: Float): Float

    /** Returns the int value represented by the string associated with the
     *  specified key in this preference node.
     */
    def getInt(key: String, def: Int): Int

    /** Returns the long value represented by the string associated with the
     *  specified key in this preference node.
     */
    def getLong(key: String, def: Long): Long

    /** Returns true if this preference node is in the user
     *  preference tree, false if it's in the system preference tree.
     */
    def isUserNode(): Boolean

    /** Returns all of the keys that have an associated value in this
     *  preference node.
     */
    def keys(): Array[String]

    /** Returns this preference node's name, relative to its parent. */
    def name(): String

    /** Returns the named preference node in the same tree as this node,
     *  creating it and any of its ancestors if they do not already exist.
     */
    def node(pathName: String): Preferences

    /** Returns true if the named preference node exists in the same tree
     *  as this node.
     */
    def nodeExists(pathName: String): Boolean

    /** Returns the parent of this preference node, or null if this is
     *  the root.
     */
    def parent(): Preferences

    /** Associates the specified value with the specified key in this
     *  preference node.
     */
    def put(key: String, value: String): Unit

    /** Associates a string representing the specified boolean value with the
     *  specified key in this preference node.
     */
    def putBoolean(key: String, value: Boolean): Unit

    /** Associates a string representing the specified byte array with the
     *  specified key in this preference node.
     */
    def putByteArray(key: String, value: Array[Byte]): Unit

    /** Associates a string representing the specified double value with the
     *  specified key in this preference node.
     */
    def putDouble(key: String, value: Double): Unit

    /** Associates a string representing the specified float value with the
     *  specified key in this preference node.
     */
    def putFloat(key: String, value: Float): Unit

    /** Associates a string representing the specified int value with the
     *  specified key in this preference node.
     */
    def putInt(key: String, value: Int): Unit

    /** Associates a string representing the specified long value with the
     *  specified key in this preference node.
     */
    def putLong(key: String, value: Long): Unit

    /** Removes the value associated with the specified key in this preference
     *  node, if any.
     */
    def remove(key: String): Unit

    /** Removes this preference node and all of its descendants, invalidating
     *  any preferences contained in the removed nodes.
     */
    def removeNode(): Unit

    /** Removes the specified NodeChangeListener, so it no longer
     *  receives change events.
     */
    def removeNodeChangeListener(ncl: NodeChangeListener): Unit

    /** Removes the specified preference change listener, so it no longer
     *  receives preference change events.
     */
    def removePreferenceChangeListener(pcl: PreferenceChangeListener): Unit

    /** Ensures that future reads from this preference node and its
     *  descendants reflect any changes that were committed to the persistent
     *  store (from any VM) prior to the sync invocation.
     */
    def sync(): Unit

    /** Returns a string representation of this preferences node,
     *  as if computed by the expression:(this.isUserNode() ? "User" :
     *  "System") + " Preference Node: " + this.absolutePath().
     */
    def toString(): String
}

object Preferences {
    /** Maximum length of string allowed as a key (80 characters). */
    @stub
    val MAX_KEY_LENGTH: Int = ???

    /** Maximum length of a node name (80 characters). */
    @stub
    val MAX_NAME_LENGTH: Int = ???

    /** Maximum length of string allowed as a value (8192 characters). */
    @stub
    val MAX_VALUE_LENGTH: Int = ???

    /** Imports all of the preferences represented by the XML document on the
     *  specified input stream.
     */
    @stub
    def importPreferences(is: InputStream): Unit = ???

    /** Returns the preference node from the system preference tree that is
     *  associated (by convention) with the specified class's package.
     */
    @stub
    def systemNodeForPackage(c: Class[_]): Preferences = ???

    /** Returns the root preference node for the system. */
    @stub
    def systemRoot(): Preferences = ???

    /** Returns the preference node from the calling user's preference tree
     *  that is associated (by convention) with the specified class's package.
     */
    @stub
    def userNodeForPackage(c: Class[_]): Preferences = ???

    /** Returns the root preference node for the calling user. */
    @stub
    def userRoot(): Preferences = ???
}
