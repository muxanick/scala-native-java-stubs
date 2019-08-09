package javax.swing.text

import java.lang.{Object, String}
import javax.swing.{JFormattedTextField, JFormattedTextField.AbstractFormatter}
import scala.scalanative.annotation.stub

/** MaskFormatter is used to format and edit strings. The behavior
 *  of a MaskFormatter is controlled by way of a String mask
 *  that specifies the valid characters that can be contained at a particular
 *  location in the Document model. The following characters can
 *  be specified:
 * 
 *  
 *  
 *     Character 
 *     Description
 *  
 *  
 *     #
 *     Any valid number, uses Character.isDigit.
 *  
 *  
 *     '
 *     Escape character, used to escape any of the
 *        special formatting characters.
 *  
 *  
 *     UAny character (Character.isLetter). All
 *         lowercase letters are mapped to upper case.
 *  
 *  LAny character (Character.isLetter). All
 *         upper case letters are mapped to lower case.
 *  
 *  AAny character or number (Character.isLetter
 *        or Character.isDigit)
 *  
 *  ?Any character
 *         (Character.isLetter).
 *  
 *  *Anything.
 *  HAny hex character (0-9, a-f or A-F).
 *  
 * 
 *  
 *  Typically characters correspond to one char, but in certain languages this
 *  is not the case. The mask is on a per character basis, and will thus
 *  adjust to fit as many chars as are needed.
 *  
 *  You can further restrict the characters that can be input by the
 *  setInvalidCharacters and setValidCharacters
 *  methods. setInvalidCharacters allows you to specify
 *  which characters are not legal. setValidCharacters allows
 *  you to specify which characters are valid. For example, the following
 *  code block is equivalent to a mask of '0xHHH' with no invalid/valid
 *  characters:
 *  
 *  MaskFormatter formatter = new MaskFormatter("0x***");
 *  formatter.setValidCharacters("0123456789abcdefABCDEF");
 *  
 *  
 *  When initially formatting a value if the length of the string is
 *  less than the length of the mask, two things can happen. Either
 *  the placeholder string will be used, or the placeholder character will
 *  be used. Precedence is given to the placeholder string. For example:
 *  
 *    MaskFormatter formatter = new MaskFormatter("###-####");
 *    formatter.setPlaceholderCharacter('_');
 *    formatter.getDisplayValue(tf, "123");
 *  
 *  
 *  Would result in the string '123-____'. If
 *  setPlaceholder("555-1212") was invoked '123-1212' would
 *  result. The placeholder String is only used on the initial format,
 *  on subsequent formats only the placeholder character will be used.
 *  
 *  If a MaskFormatter is configured to only allow valid characters
 *  (setAllowsInvalid(false)) literal characters will be skipped as
 *  necessary when editing. Consider a MaskFormatter with
 *  the mask "###-####" and current value "555-1212". Using the right
 *  arrow key to navigate through the field will result in (| indicates the
 *  position of the caret):
 *  
 *    |555-1212
 *    5|55-1212
 *    55|5-1212
 *    555-|1212
 *    555-1|212
 *  
 *  The '-' is a literal (non-editable) character, and is skipped.
 *  
 *  Similar behavior will result when editing. Consider inserting the string
 *  '123-45' and '12345' into the MaskFormatter in the
 *  previous example. Both inserts will result in the same String,
 *  '123-45__'. When MaskFormatter
 *  is processing the insert at character position 3 (the '-'), two things can
 *  happen:
 *  
 *    If the inserted character is '-', it is accepted.
 *    If the inserted character matches the mask for the next non-literal
 *        character, it is accepted at the new location.
 *    Anything else results in an invalid edit
 *  
 *  
 *  By default MaskFormatter will not allow invalid edits, you can
 *  change this with the setAllowsInvalid method, and will
 *  commit edits on valid edits (use the setCommitsOnValidEdit to
 *  change this).
 *  
 *  By default, MaskFormatter is in overwrite mode. That is as
 *  characters are typed a new character is not inserted, rather the character
 *  at the current location is replaced with the newly typed character. You
 *  can change this behavior by way of the method setOverwriteMode.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class MaskFormatter extends DefaultFormatter {

    /** Creates a MaskFormatter with no mask. */
    @stub
    def this() = ???

    /** Creates a MaskFormatter with the specified mask. */
    @stub
    def this(mask: String) = ???

    /** Returns the characters that are not valid for input. */
    @stub
    def getInvalidCharacters(): String = ???

    /** Returns the formatting mask. */
    @stub
    def getMask(): String = ???

    /** Returns the String to use if the value does not completely fill
     *  in the mask.
     */
    @stub
    def getPlaceholder(): String = ???

    /** Returns the character to use in place of characters that are not present
     *  in the value, ie the user must fill them in.
     */
    @stub
    def getPlaceholderCharacter(): Char = ???

    /** Returns the valid characters that can be input. */
    @stub
    def getValidCharacters(): String = ???

    /** Returns true if stringToValue should return literal
     *  characters in the mask.
     */
    @stub
    def getValueContainsLiteralCharacters(): Boolean = ???

    /** Installs the DefaultFormatter onto a particular
     *  JFormattedTextField.
     */
    @stub
    def install(ftf: JFormattedTextField): Unit = ???

    /** Allows for further restricting of the characters that can be input. */
    @stub
    def setInvalidCharacters(invalidCharacters: String): Unit = ???

    /** Sets the mask dictating the legal characters. */
    @stub
    def setMask(mask: String): Unit = ???

    /** Sets the string to use if the value does not completely fill in
     *  the mask.
     */
    @stub
    def setPlaceholder(placeholder: String): Unit = ???

    /** Sets the character to use in place of characters that are not present
     *  in the value, ie the user must fill them in.
     */
    @stub
    def setPlaceholderCharacter(placeholder: Char): Unit = ???

    /** Allows for further restricting of the characters that can be input. */
    @stub
    def setValidCharacters(validCharacters: String): Unit = ???

    /** If true, the returned value and set value will also contain the literal
     *  characters in mask.
     */
    @stub
    def setValueContainsLiteralCharacters(containsLiteralChars: Boolean): Unit = ???

    /** Parses the text, returning the appropriate Object representation of
     *  the String value.
     */
    @stub
    def stringToValue(value: String): Object = ???

    /** Returns a String representation of the Object value
     *  based on the mask.
     */
    @stub
    def valueToString(value: Object): String = ???
}
