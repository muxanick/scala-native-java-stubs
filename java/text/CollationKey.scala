package java.text

import java.lang.{Comparable, Object, String}

// A CollationKey represents a String under the
// rules of a specific Collator object. Comparing two
// CollationKeys returns the relative order of the
// Strings they represent. Using CollationKeys
// to compare Strings is generally faster than using
// Collator.compare. Thus, when the Strings
// must be compared multiple times, for example when sorting a list
// of Strings. It's more efficient to use CollationKeys.
//
// 
// You can not create CollationKeys directly. Rather,
// generate them by calling Collator.getCollationKey.
// You can only compare CollationKeys generated from
// the same Collator object.
//
// 
// Generating a CollationKey for a String
// involves examining the entire String
// and converting it to series of bits that can be compared bitwise. This
// allows fast comparisons once the keys are generated. The cost of generating
// keys is recouped in faster comparisons when Strings need
// to be compared many times. On the other hand, the result of a comparison
// is often determined by the first couple of characters of each String.
// Collator.compare examines only as many characters as it needs which
// allows it to be faster when doing single comparisons.
// 
// The following example shows how CollationKeys might be used
// to sort a list of Strings.
// 
// 
// // Create an array of CollationKeys for the Strings to be sorted.
// Collator myCollator = Collator.getInstance();
// CollationKey[] keys = new CollationKey[3];
// keys[0] = myCollator.getCollationKey("Tom");
// keys[1] = myCollator.getCollationKey("Dick");
// keys[2] = myCollator.getCollationKey("Harry");
// sort(keys);
//
// //...
//
// // Inside body of sort routine, compare keys this way
// if (keys[i].compareTo(keys[j]) > 0)
//    // swap keys[i] and keys[j]
//
// //...
//
// // Finally, when we've returned from sort.
// System.out.println(keys[0].getSourceString());
// System.out.println(keys[1].getSourceString());
// System.out.println(keys[2].getSourceString());
// 
// 
abstract class CollationKey extends Object with Comparable[CollationKey] {

    // Compare this CollationKey to the target CollationKey.
    def compareTo(target: CollationKey): Int

    // Returns the String that this CollationKey represents.
    def getSourceString(): String
}
