package javax.accessibility

/** The AccessibleHypertext class is the base class for all
 *  classes that present hypertext information on the display.  This class
 *  provides the standard mechanism for an assistive technology to access
 *  that text via its content, attributes, and spatial location.
 *  It also provides standard mechanisms for manipulating hyperlinks.
 *  Applications can determine if an object supports the AccessibleHypertext
 *  interface by first obtaining its AccessibleContext (see Accessible)
 *  and then calling the AccessibleContext.getAccessibleText()
 *  method of AccessibleContext.  If the return value is a class which extends
 *  AccessibleHypertext, then that object supports AccessibleHypertext.
 */
trait AccessibleHypertext extends AccessibleText {

    /** Returns the nth Link of this Hypertext document. */
    @stub
    def getLink(linkIndex: Int): AccessibleHyperlink = ???

    /** Returns the number of links within this hypertext document. */
    @stub
    def getLinkCount(): Int = ???
}
