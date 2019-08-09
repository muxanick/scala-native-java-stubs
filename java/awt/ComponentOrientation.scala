package java.awt

import java.io.Serializable
import java.lang.Object
import java.util.{Locale, ResourceBundle}

// The ComponentOrientation class encapsulates the language-sensitive
// orientation that is to be used to order the elements of a component
// or of text. It is used to reflect the differences in this ordering
// between Western alphabets, Middle Eastern (such as Hebrew), and Far
// Eastern (such as Japanese).
// 
// Fundamentally, this governs items (such as characters) which are laid out
// in lines, with the lines then laid out in a block. This also applies
// to items in a widget: for example, in a check box where the box is
// positioned relative to the text.
// 
// There are four different orientations used in modern languages
// as in the following table.
// 
// LT          RT          TL          TR
// A B C       C B A       A D G       G D A
// D E F       F E D       B E H       H E B
// G H I       I H G       C F I       I F C
// 
// (In the header, the two-letter abbreviation represents the item direction
// in the first letter, and the line direction in the second. For example,
// LT means "items left-to-right, lines top-to-bottom",
// TL means "items top-to-bottom, lines left-to-right", and so on.)
// 
// The orientations are:
// 
// LT - Western Europe (optional for Japanese, Chinese, Korean)
// RT - Middle East (Arabic, Hebrew)
// TR - Japanese, Chinese, Korean
// TL - Mongolian
// 
// Components whose view and controller code depends on orientation
// should use the isLeftToRight() and
// isHorizontal() methods to
// determine their behavior. They should not include switch-like
// code that keys off of the constants, such as:
// 
// if (orientation == LEFT_TO_RIGHT) {
//   ...
// } else if (orientation == RIGHT_TO_LEFT) {
//   ...
// } else {
//   // Oops
// }
// 
// This is unsafe, since more constants may be added in the future and
// since it is not guaranteed that orientation objects will be unique.
final class ComponentOrientation extends Object with Serializable {

    @stub
    // Are lines horizontal?
    // This will return true for horizontal, left-to-right writing
    // systems such as Roman.
    def isHorizontal(): Boolean = ???
}

object ComponentOrientation {
    @stub
    // Items run left to right and lines flow top to bottom
    // Examples: English, French.
    def LEFT_TO_RIGHT: ComponentOrientation = ???

    @stub
    // Items run right to left and lines flow top to bottom
    // Examples: Arabic, Hebrew.
    def RIGHT_TO_LEFT: ComponentOrientation = ???

    @stub
    // Returns the orientation that is appropriate for the given locale.
    def getOrientation(locale: Locale): ComponentOrientation = ???

    @stub
    // Deprecated. 
    //As of J2SE 1.4, use getOrientation(java.util.Locale).
    //
    def getOrientation(bdl: ResourceBundle): ComponentOrientation = ???
}
