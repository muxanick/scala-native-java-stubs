package javax.swing

import java.lang.Object

// A SizeSequence object
// efficiently maintains an ordered list
// of sizes and corresponding positions.
// One situation for which SizeSequence
// might be appropriate is in a component
// that displays multiple rows of unequal size.
// In this case, a single SizeSequence
// object could be used to track the heights
// and Y positions of all rows.
// 
// Another example would be a multi-column component,
// such as a JTable,
// in which the column sizes are not all equal.
// The JTable might use a single
// SizeSequence object
// to store the widths and X positions of all the columns.
// The JTable could then use the
// SizeSequence object
// to find the column corresponding to a certain position.
// The JTable could update the
// SizeSequence object
// whenever one or more column sizes changed.
//
// 
// The following figure shows the relationship between size and position data
// for a multi-column component.
//
// 
// 
// 
// 
// In the figure, the first index (0) corresponds to the first column,
// the second index (1) to the second column, and so on.
// The first column's position starts at 0,
// and the column occupies size0 pixels,
// where size0 is the value returned by
// getSize(0).
// Thus, the first column ends at size0 - 1.
// The second column then begins at
// the position size0
// and occupies size1 (getSize(1)) pixels.
// 
// Note that a SizeSequence object simply represents intervals
// along an axis.
// In our examples, the intervals represent height or width in pixels.
// However, any other unit of measure (for example, time in days)
// could be just as valid.
//
//
// Implementation Notes
//
// Normally when storing the size and position of entries,
// one would choose between
// storing the sizes or storing their positions
// instead. The two common operations that are needed during
// rendering are: getIndex(position)
// and setSize(index, size).
// Whichever choice of internal format is made one of these
// operations is costly when the number of entries becomes large.
// If sizes are stored, finding the index of the entry
// that encloses a particular position is linear in the
// number of entries. If positions are stored instead, setting
// the size of an entry at a particular index requires updating
// the positions of the affected entries, which is also a linear
// calculation.
// 
// Like the above techniques this class holds an array of N integers
// internally but uses a hybrid encoding, which is halfway
// between the size-based and positional-based approaches.
// The result is a data structure that takes the same space to store
// the information but can perform most operations in Log(N) time
// instead of O(N), where N is the number of entries in the list.
// 
// Two operations that remain O(N) in the number of entries are
// the insertEntries
// and removeEntries methods, both
// of which are implemented by converting the internal array to
// a set of integer sizes, copying it into the new array, and then
// reforming the hybrid representation in place.
class SizeSequence extends Object {

    @stub
    // Creates a new SizeSequence object
    // that contains no entries.
    def this() = ???

    @stub
    // Creates a new SizeSequence object
    // that contains the specified number of entries,
    // all initialized to have size 0.
    def this(numEntries: Int) = ???

    @stub
    // Creates a new SizeSequence object
    // that contains the specified sizes.
    def this(sizes: Array[Int]) = ???

    @stub
    // Returns the index of the entry
    // that corresponds to the specified position.
    def getIndex(position: Int): Int = ???

    @stub
    // Returns the start position for the specified entry.
    def getPosition(index: Int): Int = ???

    @stub
    // Returns the size of the specified entry.
    def getSize(index: Int): Int = ???

    @stub
    // Returns the size of all entries.
    def getSizes(): Array[Int] = ???

    @stub
    // Adds a contiguous group of entries to this SizeSequence.
    def insertEntries(start: Int, length: Int, value: Int): Unit = ???

    @stub
    // Removes a contiguous group of entries
    // from this SizeSequence.
    def removeEntries(start: Int, length: Int): Unit = ???

    @stub
    // Sets the size of the specified entry.
    def setSize(index: Int, size: Int): Unit = ???
}
