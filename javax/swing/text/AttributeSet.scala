package javax.swing.text

import java.lang.Object
import java.util.Enumeration
import scala.scalanative.annotation.stub

/** A collection of unique attributes.  This is a read-only,
 *  immutable interface.  An attribute is basically a key and
 *  a value assigned to the key.  The collection may represent
 *  something like a style run, a logical style, etc.  These
 *  are generally used to describe features that will contribute
 *  to some graphical representation such as a font.  The
 *  set of possible keys is unbounded and can be anything.
 *  Typically View implementations will respond to attribute
 *  definitions and render something to represent the attributes.
 *  
 *  Attributes can potentially resolve in a hierarchy.  If a
 *  key doesn't resolve locally, and a resolving parent
 *  exists, the key will be resolved through the parent.
 */
trait AttributeSet {

    /** Returns true if this set defines an attribute with the same
     *  name and an equal value.
     */
    @stub
    def containsAttribute(name: Any, value: Any): Boolean = ???

    /** Returns true if this set defines all the attributes from the
     *  given set with equal values.
     */
    @stub
    def containsAttributes(attributes: AttributeSet): Boolean = ???

    /** Returns an attribute set that is guaranteed not
     *  to change over time.
     */
    @stub
    def copyAttributes(): AttributeSet = ???

    /** Fetches the value of the given attribute. */
    @stub
    def getAttribute(key: Any): Any = ???

    /** Returns the number of attributes that are defined locally in this set. */
    @stub
    def getAttributeCount(): Int = ???

    /** Returns an enumeration over the names of the attributes that are
     *  defined locally in the set.
     */
    @stub
    def getAttributeNames(): Enumeration[_] = ???

    /** Gets the resolving parent. */
    @stub
    def getResolveParent(): AttributeSet = ???

    /** Checks whether the named attribute has a value specified in
     *  the set without resolving through another attribute
     *  set.
     */
    @stub
    def isDefined(attrName: Any): Boolean = ???

    /** Determines if the two attribute sets are equivalent. */
    @stub
    def isEqual(attr: AttributeSet): Boolean = ???
}

object AttributeSet {
    /** This interface is the type signature that is expected
     *  to be present on any attribute key that contributes to
     *  character level presentation.  This would be any attribute
     *  that applies to a so-called run of
     *  style.
     */
    trait CharacterAttribute {


    /** This interface is the type signature that is expected
     *  to be present on any attribute key that contributes to
     *  presentation of color.
     */
    trait ColorAttribute {


    /** This interface is the type signature that is expected
     *  to be present on any attribute key that contributes to
     *  the determination of what font to use to render some
     *  text.  This is not considered to be a closed set, the
     *  definition can change across version of the platform and can
     *  be amended by additional user added entries that
     *  correspond to logical settings that are specific to
     *  some type of content.
     */
    trait FontAttribute {


    /** This interface is the type signature that is expected
     *  to be present on any attribute key that contributes to
     *  the paragraph level presentation.
     */
    trait ParagraphAttribute {


    /** Attribute name used to name the collection of
     *  attributes.
     */
    @stub
    val NameAttribute: Any = ???

    /** Attribute name used to identify the resolving parent
     *  set of attributes, if one is defined.
     */
    @stub
    val ResolveAttribute: Any = ???
}
