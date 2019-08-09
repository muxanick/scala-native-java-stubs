package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, DocAttribute, EnumSyntax, PrintJobAttribute, PrintRequestAttribute}

/** Class Finishings is a printing attribute class, an enumeration, that
 *  identifies whether the printer applies a finishing operation of some kind
 *  of binding to each copy of each printed document in the job. For multidoc
 *  print jobs (jobs with multiple documents), the
 *  MultipleDocumentHandling attribute determines what constitutes a "copy"
 *  for purposes of finishing.
 *  
 *  Standard Finishings values are:
 *  
 *  
 *  
 *   
 *  
 *  
 *  NONE
 *  
 *  
 *  STAPLE
 *  
 *  
 *  EDGE_STITCH
 *  
 *  
 *  
 *  
 *   
 *  
 *  
 *  BIND
 *  
 *  
 *  SADDLE_STITCH
 *  
 *  
 *  COVER
 *  
 *  
 *   
 *  
 *  
 *  
 *  
 *  The following Finishings values are more specific; they indicate a
 *  corner or an edge as if the document were a portrait document:
 *  
 *  
 *  
 *   
 *  
 *  
 *  STAPLE_TOP_LEFT
 *  
 *  
 *  EDGE_STITCH_LEFT
 *  
 *  
 *  STAPLE_DUAL_LEFT
 *  
 *  
 *   
 *  
 *  
 *  
 *  
 *   
 *  
 *  
 *  STAPLE_BOTTOM_LEFT
 *  
 *  
 *  EDGE_STITCH_TOP
 *  
 *  
 *  STAPLE_DUAL_TOP
 *  
 *  
 *   
 *  
 *  
 *  
 *  
 *   
 *  
 *  
 *  STAPLE_TOP_RIGHT
 *  
 *  
 *  EDGE_STITCH_RIGHT
 *  
 *  
 *  STAPLE_DUAL_RIGHT
 *  
 *  
 *   
 *  
 *  
 *  
 *  
 *   
 *  
 *  
 *  STAPLE_BOTTOM_RIGHT
 *  
 *  
 *  EDGE_STITCH_BOTTOM
 *  
 *  
 *  STAPLE_DUAL_BOTTOM
 *  
 *  
 *   
 *  
 *  
 *  
 *  
 *  The STAPLE_XXX values are specified with respect to the
 *  document as if the document were a portrait document. If the document is
 *  actually a landscape or a reverse-landscape document, the client supplies the
 *  appropriate transformed value. For example, to position a staple in the upper
 *  left hand corner of a landscape document when held for reading, the client
 *  supplies the STAPLE_BOTTOM_LEFT value (since landscape is
 *  defined as a +90 degree rotation from portrait, i.e., anti-clockwise). On the
 *  other hand, to position a staple in the upper left hand corner of a
 *  reverse-landscape document when held for reading, the client supplies the
 *  STAPLE_TOP_RIGHT value (since reverse-landscape is defined as a
 *  -90 degree rotation from portrait, i.e., clockwise).
 *  
 *  The angle (vertical, horizontal, angled) of each staple with respect to the
 *  document depends on the implementation which may in turn depend on the value
 *  of the attribute.
 *  
 *  The effect of a Finishings attribute on a multidoc print job (a job
 *  with multiple documents) depends on whether all the docs have the same
 *  binding specified or whether different docs have different bindings
 *  specified, and on the (perhaps defaulted) value of the MultipleDocumentHandling attribute.
 *  
 *  
 *  If all the docs have the same binding specified, then any value of MultipleDocumentHandling makes sense, and the
 *  printer's processing depends on the MultipleDocumentHandling value:
 *  
 *  
 *  SINGLE_DOCUMENT -- All the input docs will be bound together as one output
 *  document with the specified binding.
 *  
 *  
 *  SINGLE_DOCUMENT_NEW_SHEET -- All the input docs will be bound together as one
 *  output document with the specified binding, and the first impression of each
 *  input doc will always start on a new media sheet.
 *  
 *  
 *  SEPARATE_DOCUMENTS_UNCOLLATED_COPIES -- Each input doc will be bound
 *  separately with the specified binding.
 *  
 *  
 *  SEPARATE_DOCUMENTS_COLLATED_COPIES -- Each input doc will be bound separately
 *  with the specified binding.
 *  
 *  
 *  
 *  If different docs have different bindings specified, then only two values of
 *  MultipleDocumentHandling make sense, and the
 *  printer reports an error when the job is submitted if any other value is
 *  specified:
 *  
 *  
 *  SEPARATE_DOCUMENTS_UNCOLLATED_COPIES -- Each input doc will be bound
 *  separately with its own specified binding.
 *  
 *  
 *  SEPARATE_DOCUMENTS_COLLATED_COPIES -- Each input doc will be bound separately
 *  with its own specified binding.
 *  
 *  
 *  
 *  IPP Compatibility: Class Finishings encapsulates some of the
 *  IPP enum values that can be included in an IPP "finishings" attribute, which
 *  is a set of enums. The category name returned by
 *  getName() is the IPP attribute name.  The enumeration's
 *  integer value is the IPP enum value.  The toString() method
 *  returns the IPP string representation of the attribute value.
 *  In IPP Finishings is a multi-value attribute, this API currently allows
 *  only one binding to be specified.
 */
class Finishings extends EnumSyntax with DocAttribute with PrintRequestAttribute with PrintJobAttribute {

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???

    /** Returns the enumeration value table for class Finishings. */
    @stub
    protected def getEnumValueTable(): Array[EnumSyntax] = ???

    /** Get the name of the category of which this attribute value is an
     *  instance.
     */
    @stub
    def getName(): String = ???

    /** Returns the lowest integer value used by class Finishings. */
    @stub
    protected def getOffset(): Int = ???
}

object Finishings {
    /** This value indicates that a binding is to be applied to the document;
     *  the type and placement of the binding is site-defined.
     */
    @stub
    val BIND: Finishings = ???

    /** This value is specified when it is desired to select a non-printed (or
     *  pre-printed) cover for the document.
     */
    @stub
    val COVER: Finishings = ???

    /** Bind the document(s) with one or more staples (wire stitches) along one
     *  edge.
     */
    @stub
    val EDGE_STITCH: Finishings = ???

    /** Bind the document(s) with one or more staples (wire stitches) along the
     *  bottom edge.
     */
    @stub
    val EDGE_STITCH_BOTTOM: Finishings = ???

    /** Bind the document(s) with one or more staples (wire stitches) along the
     *  left edge.
     */
    @stub
    val EDGE_STITCH_LEFT: Finishings = ???

    /** Bind the document(s) with one or more staples (wire stitches) along the
     *  right edge.
     */
    @stub
    val EDGE_STITCH_RIGHT: Finishings = ???

    /** Bind the document(s) with one or more staples (wire stitches) along the
     *  top edge.
     */
    @stub
    val EDGE_STITCH_TOP: Finishings = ???

    /** Perform no binding. */
    @stub
    val NONE: Finishings = ???

    /** Bind the document(s) with one or more staples (wire stitches) along the
     *  middle fold.
     */
    @stub
    val SADDLE_STITCH: Finishings = ???

    /** Bind the document(s) with one or more staples. */
    @stub
    val STAPLE: Finishings = ???

    /** Bind the document(s) with one or more staples in the bottom left
     *  corner.
     */
    @stub
    val STAPLE_BOTTOM_LEFT: Finishings = ???

    /** Bind the document(s) with one or more staples in the bottom right
     *  corner.
     */
    @stub
    val STAPLE_BOTTOM_RIGHT: Finishings = ???

    /** Bind the document(s) with two staples (wire stitches) along the bottom
     *  edge assuming a portrait document (see above).
     */
    @stub
    val STAPLE_DUAL_BOTTOM: Finishings = ???

    /** Bind the document(s) with two staples (wire stitches) along the left
     *  edge assuming a portrait document (see above).
     */
    @stub
    val STAPLE_DUAL_LEFT: Finishings = ???

    /** Bind the document(s) with two staples (wire stitches) along the right
     *  edge assuming a portrait document (see above).
     */
    @stub
    val STAPLE_DUAL_RIGHT: Finishings = ???

    /** Bind the document(s) with two staples (wire stitches) along the top
     *  edge assuming a portrait document (see above).
     */
    @stub
    val STAPLE_DUAL_TOP: Finishings = ???

    /** Bind the document(s) with one or more staples in the top left corner. */
    @stub
    val STAPLE_TOP_LEFT: Finishings = ???
}
