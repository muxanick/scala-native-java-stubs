package java.awt.im

import java.awt.font.TextHitInfo
import java.text.{AttributedCharacterIterator, AttributedCharacterIterator.Attribute}

/** InputMethodRequests defines the requests that a text editing component
 *  has to handle in order to work with input methods. The component
 *  can implement this interface itself or use a separate object that
 *  implements it. The object implementing this interface must be returned
 *  from the component's getInputMethodRequests method.
 * 
 *  
 *  The text editing component also has to provide an input method event
 *  listener.
 * 
 *  
 *  The interface is designed to support one of two input user interfaces:
 *  
 *  on-the-spot input, where the composed text is displayed as part
 *      of the text component's text body.
 *  below-the-spot input, where the composed text is displayed in
 *      a separate composition window just below the insertion point where
 *      the text will be inserted when it is committed. Note that, if text is
 *      selected within the component's text body, this text will be replaced by
 *      the committed text upon commitment; therefore it is not considered part
 *      of the context that the text is input into.
 *  
 */
trait InputMethodRequests {

    /** Gets the latest committed text from the text editing component and
     *  removes it from the component's text body.
     */
    @stub
    def cancelLatestCommittedText(attributes: Array[AttributedCharacterIterator.Attribute]): AttributedCharacterIterator = ???

    /** Gets an iterator providing access to the entire text and attributes
     *  contained in the text editing component except for uncommitted
     *  text.
     */
    @stub
    def getCommittedText(beginIndex: Int, endIndex: Int, attributes: Array[AttributedCharacterIterator.Attribute]): AttributedCharacterIterator = ???

    /** Gets the length of the entire text contained in the text
     *  editing component except for uncommitted (composed) text.
     */
    @stub
    def getCommittedTextLength(): Int = ???

    /** Gets the offset of the insert position in the committed text contained
     *  in the text editing component.
     */
    @stub
    def getInsertPositionOffset(): Int = ???

    /** Gets the offset within the composed text for the specified absolute x
     *  and y coordinates on the screen.
     */
    @stub
    def getLocationOffset(x: Int, y: Int): TextHitInfo = ???

    /** Gets the currently selected text from the text editing component. */
    @stub
    def getSelectedText(attributes: Array[AttributedCharacterIterator.Attribute]): AttributedCharacterIterator = ???
}
