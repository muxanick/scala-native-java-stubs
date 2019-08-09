package javax.swing.text.html

import java.io.Serializable
import java.lang.Object

// Defines a set of
// CSS attributes
// as a typesafe enumeration.  The HTML View implementations use
// CSS attributes to determine how they will render. This also defines
// methods to map between CSS/HTML/StyleConstants. Any shorthand
// properties, such as font, are mapped to the intrinsic properties.
// The following describes the CSS properties that are supported by the
// rendering engine:
// font-family
//   font-style
//   font-size (supports relative units)
//   font-weight
//   font
//   color
//   background-color (with the exception of transparent)
//   background-image
//   background-repeat
//   background-position
//   background
//   text-decoration (with the exception of blink and overline)
//   vertical-align (only sup and super)
//   text-align (justify is treated as center)
//   margin-top
//   margin-right
//   margin-bottom
//   margin-left
//   margin
//   padding-top
//   padding-right
//   padding-bottom
//   padding-left
//   padding
//   border-top-style
//   border-right-style
//   border-bottom-style
//   border-left-style
//   border-style (only supports inset, outset and none)
//   border-top-color
//   border-right-color
//   border-bottom-color
//   border-left-color
//   border-color
//   list-style-image
//   list-style-type
//   list-style-position
// 
// The following are modeled, but currently not rendered.
// font-variant
//   background-attachment (background always treated as scroll)
//   word-spacing
//   letter-spacing
//   text-indent
//   text-transform
//   line-height
//   border-top-width (this is used to indicate if a border should be used)
//   border-right-width
//   border-bottom-width
//   border-left-width
//   border-width
//   border-top
//   border-right
//   border-bottom
//   border-left
//   border
//   width
//   height
//   float
//   clear
//   display
//   white-space
//   list-style
// 
// Note: for the time being we do not fully support relative units,
// unless noted, so that
// p { margin-top: 10% } will be treated as if no margin-top was specified.
class CSS extends Object with Serializable {
}

object CSS {
    @stub
    // Return the set of all possible CSS attribute keys.
    def getAllAttributeKeys(): Array[CSS.Attribute] = ???
}
