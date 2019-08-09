package javax.print.attribute.standard

import java.lang.{Class, Object}
import java.util.{AbstractCollection, AbstractSet, Collection, HashSet}
import javax.print.attribute.{Attribute, PrintJobAttribute}

/** Class JobStateReasons is a printing attribute class, a set of enumeration
 *  values, that provides additional information about the job's current state,
 *  i.e., information that augments the value of the job's JobState attribute.
 *  
 *  Instances of JobStateReason do not appear in a Print
 *  Job's attribute set directly. Rather, a JobStateReasons attribute appears in
 *  the Print Job's attribute set. The JobStateReasons attribute contains zero,
 *  one, or more than one JobStateReason objects which
 *  pertain to the Print Job's status. The printer adds a JobStateReason object to the Print Job's JobStateReasons attribute when the
 *  corresponding condition becomes true of the Print Job, and the printer
 *  removes the JobStateReason object again when the
 *  corresponding condition becomes false, regardless of whether the Print Job's
 *  overall JobState also changed.
 *  
 *  Class JobStateReasons inherits its implementation from class java.util.HashSet. Unlike most printing attributes which
 *  are immutable once constructed, class JobStateReasons is designed to be
 *  mutable; you can add JobStateReason objects to an
 *  existing JobStateReasons object and remove them again. However, like class
 *  java.util.HashSet, class JobStateReasons is not
 *  multiple thread safe. If a JobStateReasons object will be used by multiple
 *  threads, be sure to synchronize its operations (e.g., using a synchronized
 *  set view obtained from class java.util.Collections).
 *  
 *  IPP Compatibility: The string value returned by each individual JobStateReason object's toString() method gives
 *  the IPP keyword value. The category name returned by getName()
 *  gives the IPP attribute name.
 *  
 */
final class JobStateReasons extends HashSet[JobStateReason] with PrintJobAttribute {

    /** Construct a new, empty job state reasons attribute; the underlying hash
     *  set has the default initial capacity and load factor.
     */
    @stub
    def this() = ???

    /** Construct a new job state reasons attribute that contains the same
     *  JobStateReason objects as the given collection.
     */
    @stub
    def this(collection: Collection[JobStateReason]) = ???

    /** Construct a new, empty job state reasons attribute; the underlying hash
     *  set has the given initial capacity and the default load factor.
     */
    @stub
    def this(initialCapacity: Int) = ???

    /** Adds the specified element to this job state reasons attribute if it is
     *  not already present.
     */
    @stub
    def add(o: JobStateReason): Boolean = ???

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???
}
