package javax.swing

import java.awt.{Color, Font, FontMetrics, Graphics, Image, Rectangle, Shape}
import java.awt.image.ImageObserver
import java.io.PrintStream
import java.lang.{Object, String}
import java.text.AttributedCharacterIterator
import scala.scalanative.annotation.stub

/** Graphics subclass supporting graphics debugging. Overrides most methods
 *  from Graphics.  DebugGraphics objects are rarely created by hand.  They
 *  are most frequently created automatically when a JComponent's
 *  debugGraphicsOptions are changed using the setDebugGraphicsOptions()
 *  method.
 *  
 *  NOTE: You must turn off double buffering to use DebugGraphics:
 *        RepaintManager repaintManager = RepaintManager.currentManager(component);
 *        repaintManager.setDoubleBufferingEnabled(false);
 */
class DebugGraphics extends Graphics {

    /** Constructs a new debug graphics context that supports slowed
     *  down drawing.
     */
    @stub
    def this() = ???

    /** Constructs a debug graphics context from an existing graphics
     *  context that supports slowed down drawing.
     */
    @stub
    def this(graphics: Graphics) = ???

    /** Constructs a debug graphics context from an existing graphics
     *  context that slows down drawing for the specified component.
     */
    @stub
    def this(graphics: Graphics, component: JComponent) = ???

    /** Overrides Graphics.clearRect. */
    @stub
    def clearRect(x: Int, y: Int, width: Int, height: Int): Unit = ???

    /** Overrides Graphics.clipRect. */
    @stub
    def clipRect(x: Int, y: Int, width: Int, height: Int): Unit = ???

    /** Overrides Graphics.copyArea. */
    @stub
    def copyArea(x: Int, y: Int, width: Int, height: Int, destX: Int, destY: Int): Unit = ???

    /** Overrides Graphics.create to return a DebugGraphics object. */
    @stub
    def create(): Graphics = ???

    /** Overrides Graphics.create to return a DebugGraphics object. */
    @stub
    def create(x: Int, y: Int, width: Int, height: Int): Graphics = ???

    /** Overrides Graphics.dispose. */
    @stub
    def dispose(): Unit = ???

    /** Overrides Graphics.draw3DRect. */
    @stub
    def draw3DRect(x: Int, y: Int, width: Int, height: Int, raised: Boolean): Unit = ???

    /** Overrides Graphics.drawArc. */
    @stub
    def drawArc(x: Int, y: Int, width: Int, height: Int, startAngle: Int, arcAngle: Int): Unit = ???

    /** Overrides Graphics.drawBytes. */
    @stub
    def drawBytes(data: Array[Byte], offset: Int, length: Int, x: Int, y: Int): Unit = ???

    /** Overrides Graphics.drawChars. */
    @stub
    def drawChars(data: Array[Char], offset: Int, length: Int, x: Int, y: Int): Unit = ???

    /** Overrides Graphics.drawImage. */
    @stub
    def drawImage(img: Image, x: Int, y: Int, bgcolor: Color, observer: ImageObserver): Boolean = ???

    /** Overrides Graphics.drawImage. */
    @stub
    def drawImage(img: Image, x: Int, y: Int, observer: ImageObserver): Boolean = ???

    /** Overrides Graphics.drawImage. */
    @stub
    def drawImage(img: Image, x: Int, y: Int, width: Int, height: Int, bgcolor: Color, observer: ImageObserver): Boolean = ???

    /** Overrides Graphics.drawImage. */
    @stub
    def drawImage(img: Image, x: Int, y: Int, width: Int, height: Int, observer: ImageObserver): Boolean = ???

    /** Overrides Graphics.drawImage. */
    @stub
    def drawImage(img: Image, dx1: Int, dy1: Int, dx2: Int, dy2: Int, sx1: Int, sy1: Int, sx2: Int, sy2: Int, bgcolor: Color, observer: ImageObserver): Boolean = ???

    /** Overrides Graphics.drawImage. */
    @stub
    def drawImage(img: Image, dx1: Int, dy1: Int, dx2: Int, dy2: Int, sx1: Int, sy1: Int, sx2: Int, sy2: Int, observer: ImageObserver): Boolean = ???

    /** Overrides Graphics.drawLine. */
    @stub
    def drawLine(x1: Int, y1: Int, x2: Int, y2: Int): Unit = ???

    /** Overrides Graphics.drawOval. */
    @stub
    def drawOval(x: Int, y: Int, width: Int, height: Int): Unit = ???

    /** Overrides Graphics.drawPolygon. */
    @stub
    def drawPolygon(xPoints: Array[Int], yPoints: Array[Int], nPoints: Int): Unit = ???

    /** Overrides Graphics.drawPolyline. */
    @stub
    def drawPolyline(xPoints: Array[Int], yPoints: Array[Int], nPoints: Int): Unit = ???

    /** Overrides Graphics.drawRect. */
    @stub
    def drawRect(x: Int, y: Int, width: Int, height: Int): Unit = ???

    /** Overrides Graphics.drawRoundRect. */
    @stub
    def drawRoundRect(x: Int, y: Int, width: Int, height: Int, arcWidth: Int, arcHeight: Int): Unit = ???

    /** Overrides Graphics.drawString. */
    @stub
    def drawString(iterator: AttributedCharacterIterator, x: Int, y: Int): Unit = ???

    /** Overrides Graphics.drawString. */
    @stub
    def drawString(aString: String, x: Int, y: Int): Unit = ???

    /** Overrides Graphics.fill3DRect. */
    @stub
    def fill3DRect(x: Int, y: Int, width: Int, height: Int, raised: Boolean): Unit = ???

    /** Overrides Graphics.fillArc. */
    @stub
    def fillArc(x: Int, y: Int, width: Int, height: Int, startAngle: Int, arcAngle: Int): Unit = ???

    /** Overrides Graphics.fillOval. */
    @stub
    def fillOval(x: Int, y: Int, width: Int, height: Int): Unit = ???

    /** Overrides Graphics.fillPolygon. */
    @stub
    def fillPolygon(xPoints: Array[Int], yPoints: Array[Int], nPoints: Int): Unit = ???

    /** Overrides Graphics.fillRect. */
    @stub
    def fillRect(x: Int, y: Int, width: Int, height: Int): Unit = ???

    /** Overrides Graphics.fillRoundRect. */
    @stub
    def fillRoundRect(x: Int, y: Int, width: Int, height: Int, arcWidth: Int, arcHeight: Int): Unit = ???

    /** Overrides Graphics.getClip. */
    @stub
    def getClip(): Shape = ???

    /** Overrides Graphics.getClipBounds. */
    @stub
    def getClipBounds(): Rectangle = ???

    /** Returns the Color used for text drawing operations. */
    @stub
    def getColor(): Color = ???

    /** Returns the current debugging options for this DebugGraphics. */
    @stub
    def getDebugOptions(): Int = ???

    /** Returns the Font used for text drawing operations. */
    @stub
    def getFont(): Font = ???

    /** Overrides Graphics.getFontMetrics. */
    @stub
    def getFontMetrics(): FontMetrics = ???

    /** Overrides Graphics.getFontMetrics. */
    @stub
    def getFontMetrics(f: Font): FontMetrics = ???

    /** Returns the drawingBuffer value. */
    @stub
    def isDrawingBuffer(): Boolean = ???

    /** Overrides Graphics.setClip. */
    @stub
    def setClip(x: Int, y: Int, width: Int, height: Int): Unit = ???

    /** Overrides Graphics.setClip. */
    @stub
    def setClip(clip: Shape): Unit = ???

    /** Sets the color to be used for drawing and filling lines and shapes. */
    @stub
    def setColor(aColor: Color): Unit = ???

    /** Enables/disables diagnostic information about every graphics
     *  operation.
     */
    @stub
    def setDebugOptions(options: Int): Unit = ???

    /** Sets the Font used for text drawing operations. */
    @stub
    def setFont(aFont: Font): Unit = ???

    /** Overrides Graphics.setPaintMode. */
    @stub
    def setPaintMode(): Unit = ???

    /** Overrides Graphics.setXORMode. */
    @stub
    def setXORMode(aColor: Color): Unit = ???

    /** Overrides Graphics.translate. */
    @stub
    def translate(x: Int, y: Int): Unit = ???
}

object DebugGraphics {
    /** Show buffered operations in a separate Frame. */
    @stub
    val BUFFERED_OPTION: Int = ???

    /** Flash graphics operations. */
    @stub
    val FLASH_OPTION: Int = ???

    /** Log graphics operations. */
    @stub
    val LOG_OPTION: Int = ???

    /** Don't debug graphics operations. */
    @stub
    val NONE_OPTION: Int = ???

    /** Returns the Color used to flash drawing operations. */
    @stub
    def flashColor(): Color = ???

    /** Returns the number of times that drawing operations will flash. */
    @stub
    def flashCount(): Int = ???

    /** Returns the time delay of drawing operation flashing. */
    @stub
    def flashTime(): Int = ???

    /** Returns the stream to which the DebugGraphics logs drawing operations. */
    @stub
    def logStream(): PrintStream = ???

    /** Sets the Color used to flash drawing operations. */
    @stub
    def setFlashColor(flashColor: Color): Unit = ???

    /** Sets the number of times that drawing operations will flash. */
    @stub
    def setFlashCount(flashCount: Int): Unit = ???

    /** Sets the time delay of drawing operation flashing. */
    @stub
    def setFlashTime(flashTime: Int): Unit = ???

    /** Sets the stream to which the DebugGraphics logs drawing operations. */
    @stub
    def setLogStream(stream: PrintStream): Unit = ???
}
