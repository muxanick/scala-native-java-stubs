package javax.swing.text.html

import java.lang.Object
import javax.swing.text.{Element, View, ViewFactory}
import scala.scalanative.annotation.stub

/** A factory to build views for HTML.  The following
 *  table describes what this factory will build by
 *  default.
 * 
 *  
 *  
 *  TagView created
 *  
 *  HTML.Tag.CONTENTInlineView
 *  
 *  HTML.Tag.IMPLIEDjavax.swing.text.html.ParagraphView
 *  
 *  HTML.Tag.Pjavax.swing.text.html.ParagraphView
 *  
 *  HTML.Tag.H1javax.swing.text.html.ParagraphView
 *  
 *  HTML.Tag.H2javax.swing.text.html.ParagraphView
 *  
 *  HTML.Tag.H3javax.swing.text.html.ParagraphView
 *  
 *  HTML.Tag.H4javax.swing.text.html.ParagraphView
 *  
 *  HTML.Tag.H5javax.swing.text.html.ParagraphView
 *  
 *  HTML.Tag.H6javax.swing.text.html.ParagraphView
 *  
 *  HTML.Tag.DTjavax.swing.text.html.ParagraphView
 *  
 *  HTML.Tag.MENUListView
 *  
 *  HTML.Tag.DIRListView
 *  
 *  HTML.Tag.ULListView
 *  
 *  HTML.Tag.OLListView
 *  
 *  HTML.Tag.LIBlockView
 *  
 *  HTML.Tag.DLBlockView
 *  
 *  HTML.Tag.DDBlockView
 *  
 *  HTML.Tag.BODYBlockView
 *  
 *  HTML.Tag.HTMLBlockView
 *  
 *  HTML.Tag.CENTERBlockView
 *  
 *  HTML.Tag.DIVBlockView
 *  
 *  HTML.Tag.BLOCKQUOTEBlockView
 *  
 *  HTML.Tag.PREBlockView
 *  
 *  HTML.Tag.BLOCKQUOTEBlockView
 *  
 *  HTML.Tag.PREBlockView
 *  
 *  HTML.Tag.IMGImageView
 *  
 *  HTML.Tag.HRHRuleView
 *  
 *  HTML.Tag.BRBRView
 *  
 *  HTML.Tag.TABLEjavax.swing.text.html.TableView
 *  
 *  HTML.Tag.INPUTFormView
 *  
 *  HTML.Tag.SELECTFormView
 *  
 *  HTML.Tag.TEXTAREAFormView
 *  
 *  HTML.Tag.OBJECTObjectView
 *  
 *  HTML.Tag.FRAMESETFrameSetView
 *  
 *  HTML.Tag.FRAMEFrameView
 *  
 *  
 */
object HTMLEditorKit_HTMLFactory extends Object with ViewFactory {

    /**  */
    @stub
    def HTMLFactory() = ???

    /** Creates a view from an element. */
    @stub
    def create(elem: Element): View = ???
}
