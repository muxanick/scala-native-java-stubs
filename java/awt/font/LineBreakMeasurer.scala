package java.awt.font

import java.lang.Object
import java.text.{AttributedCharacterIterator, BreakIterator}
import scala.scalanative.annotation.stub

/** The LineBreakMeasurer class allows styled text to be
 *  broken into lines (or segments) that fit within a particular visual
 *  advance.  This is useful for clients who wish to display a paragraph of
 *  text that fits within a specific width, called the wrapping
 *  width.
 *  
 *  LineBreakMeasurer is constructed with an iterator over
 *  styled text.  The iterator's range should be a single paragraph in the
 *  text.
 *  LineBreakMeasurer maintains a position in the text for the
 *  start of the next text segment.  Initially, this position is the
 *  start of text.  Paragraphs are assigned an overall direction (either
 *  left-to-right or right-to-left) according to the bidirectional
 *  formatting rules.  All segments obtained from a paragraph have the
 *  same direction as the paragraph.
 *  
 *  Segments of text are obtained by calling the method
 *  nextLayout, which returns a TextLayout
 *  representing the text that fits within the wrapping width.
 *  The nextLayout method moves the current position
 *  to the end of the layout returned from nextLayout.
 *  
 *  LineBreakMeasurer implements the most commonly used
 *  line-breaking policy: Every word that fits within the wrapping
 *  width is placed on the line. If the first word does not fit, then all
 *  of the characters that fit within the wrapping width are placed on the
 *  line.  At least one character is placed on each line.
 *  
 *  The TextLayout instances returned by
 *  LineBreakMeasurer treat tabs like 0-width spaces.  Clients
 *  who wish to obtain tab-delimited segments for positioning should use
 *  the overload of nextLayout which takes a limiting offset
 *  in the text.
 *  The limiting offset should be the first character after the tab.
 *  The TextLayout objects returned from this method end
 *  at the limit provided (or before, if the text between the current
 *  position and the limit won't fit entirely within the  wrapping
 *  width).
 *  
 *  Clients who are laying out tab-delimited text need a slightly
 *  different line-breaking policy after the first segment has been
 *  placed on a line.  Instead of fitting partial words in the
 *  remaining space, they should place words which don't fit in the
 *  remaining space entirely on the next line.  This change of policy
 *  can be requested in the overload of nextLayout which
 *  takes a boolean parameter.  If this parameter is
 *  true, nextLayout returns
 *  null if the first word won't fit in
 *  the given space.  See the tab sample below.
 *  
 *  In general, if the text used to construct the
 *  LineBreakMeasurer changes, a new
 *  LineBreakMeasurer must be constructed to reflect
 *  the change.  (The old LineBreakMeasurer continues to
 *  function properly, but it won't be aware of the text change.)
 *  Nevertheless, if the text change is the insertion or deletion of a
 *  single character, an existing LineBreakMeasurer can be
 *  'updated' by calling insertChar or
 *  deleteChar. Updating an existing
 *  LineBreakMeasurer is much faster than creating a new one.
 *  Clients who modify text based on user typing should take advantage
 *  of these methods.
 *  
 *  Examples:
 *  Rendering a paragraph in a component
 *  
 *  
 *  public void paint(Graphics graphics) {
 * 
 *      Point2D pen = new Point2D(10, 20);
 *      Graphics2D g2d = (Graphics2D)graphics;
 *      FontRenderContext frc = g2d.getFontRenderContext();
 * 
 *      // let styledText be an AttributedCharacterIterator containing at least
 *      // one character
 * 
 *      LineBreakMeasurer measurer = new LineBreakMeasurer(styledText, frc);
 *      float wrappingWidth = getSize().width - 15;
 * 
 *      while (measurer.getPosition() < fStyledText.length()) {
 * 
 *          TextLayout layout = measurer.nextLayout(wrappingWidth);
 * 
 *          pen.y += (layout.getAscent());
 *          float dx = layout.isLeftToRight() ?
 *              0 : (wrappingWidth - layout.getAdvance());
 * 
 *          layout.draw(graphics, pen.x + dx, pen.y);
 *          pen.y += layout.getDescent() + layout.getLeading();
 *      }
 *  }
 *  
 *  
 *  
 *  Rendering text with tabs.  For simplicity, the overall text
 *  direction is assumed to be left-to-right
 *  
 *  
 *  public void paint(Graphics graphics) {
 * 
 *      float leftMargin = 10, rightMargin = 310;
 *      float[] tabStops = { 100, 250 };
 * 
 *      // assume styledText is an AttributedCharacterIterator, and the number
 *      // of tabs in styledText is tabCount
 * 
 *      int[] tabLocations = new int[tabCount+1];
 * 
 *      int i = 0;
 *      for (char c = styledText.first(); c != styledText.DONE; c = styledText.next()) {
 *          if (c == '\t') {
 *              tabLocations[i++] = styledText.getIndex();
 *          }
 *      }
 *      tabLocations[tabCount] = styledText.getEndIndex() - 1;
 * 
 *      // Now tabLocations has an entry for every tab's offset in
 *      // the text.  For convenience, the last entry is tabLocations
 *      // is the offset of the last character in the text.
 * 
 *      LineBreakMeasurer measurer = new LineBreakMeasurer(styledText);
 *      int currentTab = 0;
 *      float verticalPos = 20;
 * 
 *      while (measurer.getPosition() < styledText.getEndIndex()) {
 * 
 *          // Lay out and draw each line.  All segments on a line
 *          // must be computed before any drawing can occur, since
 *          // we must know the largest ascent on the line.
 *          // TextLayouts are computed and stored in a Vector;
 *          // their horizontal positions are stored in a parallel
 *          // Vector.
 * 
 *          // lineContainsText is true after first segment is drawn
 *          boolean lineContainsText = false;
 *          boolean lineComplete = false;
 *          float maxAscent = 0, maxDescent = 0;
 *          float horizontalPos = leftMargin;
 *          Vector layouts = new Vector(1);
 *          Vector penPositions = new Vector(1);
 * 
 *          while (!lineComplete) {
 *              float wrappingWidth = rightMargin - horizontalPos;
 *              TextLayout layout =
 *                      measurer.nextLayout(wrappingWidth,
 *                                          tabLocations[currentTab]+1,
 *                                          lineContainsText);
 * 
 *              // layout can be null if lineContainsText is true
 *              if (layout != null) {
 *                  layouts.addElement(layout);
 *                  penPositions.addElement(new Float(horizontalPos));
 *                  horizontalPos += layout.getAdvance();
 *                  maxAscent = Math.max(maxAscent, layout.getAscent());
 *                  maxDescent = Math.max(maxDescent,
 *                      layout.getDescent() + layout.getLeading());
 *              } else {
 *                  lineComplete = true;
 *              }
 * 
 *              lineContainsText = true;
 * 
 *              if (measurer.getPosition() == tabLocations[currentTab]+1) {
 *                  currentTab++;
 *              }
 * 
 *              if (measurer.getPosition() == styledText.getEndIndex())
 *                  lineComplete = true;
 *              else if (horizontalPos >= tabStops[tabStops.length-1])
 *                  lineComplete = true;
 * 
 *              if (!lineComplete) {
 *                  // move to next tab stop
 *                  int j;
 *                  for (j=0; horizontalPos >= tabStops[j]; j++) {}
 *                  horizontalPos = tabStops[j];
 *              }
 *          }
 * 
 *          verticalPos += maxAscent;
 * 
 *          Enumeration layoutEnum = layouts.elements();
 *          Enumeration positionEnum = penPositions.elements();
 * 
 *          // now iterate through layouts and draw them
 *          while (layoutEnum.hasMoreElements()) {
 *              TextLayout nextLayout = (TextLayout) layoutEnum.nextElement();
 *              Float nextPosition = (Float) positionEnum.nextElement();
 *              nextLayout.draw(graphics, nextPosition.floatValue(), verticalPos);
 *          }
 * 
 *          verticalPos += maxDescent;
 *      }
 *  }
 *  
 *  
 */
final class LineBreakMeasurer extends Object {

    /** Constructs a LineBreakMeasurer for the specified text. */
    @stub
    def this(text: AttributedCharacterIterator, breakIter: BreakIterator, frc: FontRenderContext) = ???

    /** Constructs a LineBreakMeasurer for the specified text. */
    @stub
    def this(text: AttributedCharacterIterator, frc: FontRenderContext) = ???

    /** Updates this LineBreakMeasurer after a single
     *  character is deleted from the text, and sets the current
     *  position to the beginning of the paragraph.
     */
    @stub
    def deleteChar(newParagraph: AttributedCharacterIterator, deletePos: Int): Unit = ???

    /** Returns the current position of this LineBreakMeasurer. */
    @stub
    def getPosition(): Int = ???

    /** Updates this LineBreakMeasurer after a single
     *  character is inserted into the text, and sets the current
     *  position to the beginning of the paragraph.
     */
    @stub
    def insertChar(newParagraph: AttributedCharacterIterator, insertPos: Int): Unit = ???

    /** Returns the next layout, and updates the current position. */
    @stub
    def nextLayout(wrappingWidth: Float): TextLayout = ???

    /** Returns the next layout, and updates the current position. */
    @stub
    def nextLayout(wrappingWidth: Float, offsetLimit: Int, requireNextWord: Boolean): TextLayout = ???

    /** Returns the position at the end of the next layout. */
    @stub
    def nextOffset(wrappingWidth: Float): Int = ???

    /** Returns the position at the end of the next layout. */
    @stub
    def nextOffset(wrappingWidth: Float, offsetLimit: Int, requireNextWord: Boolean): Int = ???

    /** Sets the current position of this LineBreakMeasurer. */
    @stub
    def setPosition(newPosition: Int): Unit = ???
}
