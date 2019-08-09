package java.util

import java.lang.{CharSequence, Object}

/** StringJoiner is used to construct a sequence of characters separated
 *  by a delimiter and optionally starting with a supplied prefix
 *  and ending with a supplied suffix.
 *  
 *  Prior to adding something to the StringJoiner, its
 *  sj.toString() method will, by default, return prefix + suffix.
 *  However, if the setEmptyValue method is called, the emptyValue
 *  supplied will be returned instead. This can be used, for example, when
 *  creating a string using set notation to indicate an empty set, i.e.
 *  "{}", where the prefix is "{", the
 *  suffix is "}" and nothing has been added to the
 *  StringJoiner.
 */
final class StringJoiner extends Object {

    /** Constructs a StringJoiner with no characters in it, with no
     *  prefix or suffix, and a copy of the supplied
     *  delimiter.
     */
    @stub
    def this(delimiter: CharSequence) = ???

    /** Adds a copy of the given CharSequence value as the next
     *  element of the StringJoiner value.
     */
    @stub
    def add(newElement: CharSequence): StringJoiner = ???

    /** Returns the length of the String representation
     *  of this StringJoiner.
     */
    @stub
    def length(): Int = ???

    /** Adds the contents of the given StringJoiner without prefix and
     *  suffix as the next element if it is non-empty.
     */
    @stub
    def merge(other: StringJoiner): StringJoiner = ???

    /** Sets the sequence of characters to be used when determining the string
     *  representation of this StringJoiner and no elements have been
     *  added yet, that is, when it is empty.
     */
    @stub
    def setEmptyValue(emptyValue: CharSequence): StringJoiner = ???
}
