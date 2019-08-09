package javax.swing

import java.awt.{Color, Font, FontMetrics, Graphics, Image, Rectangle, Shape}
import java.awt.image.ImageObserver
import java.io.PrintStream
import java.lang.{Object, String}
import java.text.AttributedCharacterIterator

// Graphics subclass supporting graphics debugging. Overrides most methods
// from Graphics.  DebugGraphics objects are rarely created by hand.  They
// are most frequently created automatically when a JComponent's
// debugGraphicsOptions are changed using the setDebugGraphicsOptions()
// method.
// 
// NOTE: You must turn off double buffering to use DebugGraphics:
//       RepaintManager repaintManager = RepaintManager.currentManager(component);
//       repaintManager.setDoubleBufferingEnabled(false);
class DebugGraphics extends Graphics {

    @stub
    // Constructs a new debug graphics context that supports slowed
    // down drawing.
    def this() = ???

    @stub
    // Constructs a debug graphics context from an existing graphics
    // context that supports slowed down drawing.
    def this(graphics: Graphics) = ???

    @stub
    // Overrides Graphics.clearRect.
    def clearRect(x: Int, y: Int, width: Int, height: Int): Unit = ???

    @stub
    // Overrides Graphics.clipRect.
    def clipRect(x: Int, y: Int, width: Int, height: Int): Unit = ???

    @stub
    // Overrides Graphics.copyArea.
    def copyArea(x: Int, y: Int, width: Int, height: Int, destX: Int, destY: Int): Unit = ???

    @stub
    // Overrides Graphics.create to return a DebugGraphics object.
    def create(): Graphics = ???

    @stub
    // Overrides Graphics.create to return a DebugGraphics object.
    def create(x: Int, y: Int, width: Int, height: Int): Graphics = ???

    @stub
    // Overrides Graphics.dispose.
    def dispose(): Unit = ???

    @stub
    // Overrides Graphics.draw3DRect.
    def draw3DRect(x: Int, y: Int, width: Int, height: Int, raised: Boolean): Unit = ???

    @stub
    // Overrides Graphics.drawArc.
    def drawArc(x: Int, y: Int, width: Int, height: Int, startAngle: Int, arcAngle: Int): Unit = ???

    @stub
    // Overrides Graphics.drawBytes.
    def drawBytes(data: Array[Byte], offset: Int, length: Int, x: Int, y: Int): Unit = ???

    @stub
    // Overrides Graphics.drawChars.
    def drawChars(data: Array[Char], offset: Int, length: Int, x: Int, y: Int): Unit = ???

    @stub
    // Overrides Graphics.drawImage.
    def drawImage(img: Image, x: Int, y: Int, bgcolor: Color, observer: ImageObserver): Boolean = ???

    @stub
    // Overrides Graphics.drawImage.
    def drawImage(img: Image, x: Int, y: Int, observer: ImageObserver): Boolean = ???

    @stub
    // Overrides Graphics.drawImage.
    def drawImage(img: Image, x: Int, y: Int, width: Int, height: Int, bgcolor: Color, observer: ImageObserver): Boolean = ???

    @stub
    // Overrides Graphics.drawImage.
    def drawImage(img: Image, x: Int, y: Int, width: Int, height: Int, observer: ImageObserver): Boolean = ???

    @stub
    // Overrides Graphics.drawImage.
    def drawImage(img: Image, dx1: Int, dy1: Int, dx2: Int, dy2: Int, sx1: Int, sy1: Int, sx2: Int, sy2: Int, bgcolor: Color, observer: ImageObserver): Boolean = ???

    @stub
    // Overrides Graphics.drawImage.
    def drawImage(img: Image, dx1: Int, dy1: Int, dx2: Int, dy2: Int, sx1: Int, sy1: Int, sx2: Int, sy2: Int, observer: ImageObserver): Boolean = ???

    @stub
    // Overrides Graphics.drawLine.
    def drawLine(x1: Int, y1: Int, x2: Int, y2: Int): Unit = ???

    @stub
    // Overrides Graphics.drawOval.
    def drawOval(x: Int, y: Int, width: Int, height: Int): Unit = ???

    @stub
    // Overrides Graphics.drawPolygon.
    def drawPolygon(xPoints: Array[Int], yPoints: Array[Int], nPoints: Int): Unit = ???

    @stub
    // Overrides Graphics.drawPolyline.
    def drawPolyline(xPoints: Array[Int], yPoints: Array[Int], nPoints: Int): Unit = ???

    @stub
    // Overrides Graphics.drawRect.
    def drawRect(x: Int, y: Int, width: Int, height: Int): Unit = ???

    @stub
    // Overrides Graphics.drawRoundRect.
    def drawRoundRect(x: Int, y: Int, width: Int, height: Int, arcWidth: Int, arcHeight: Int): Unit = ???

    @stub
    // Overrides Graphics.drawString.
    def drawString(iterator: AttributedCharacterIterator, x: Int, y: Int): Unit = ???

    @stub
    // Overrides Graphics.drawString.
    def drawString(aString: String, x: Int, y: Int): Unit = ???

    @stub
    // Overrides Graphics.fill3DRect.
    def fill3DRect(x: Int, y: Int, width: Int, height: Int, raised: Boolean): Unit = ???

    @stub
    // Overrides Graphics.fillArc.
    def fillArc(x: Int, y: Int, width: Int, height: Int, startAngle: Int, arcAngle: Int): Unit = ???

    @stub
    // Overrides Graphics.fillOval.
    def fillOval(x: Int, y: Int, width: Int, height: Int): Unit = ???

    @stub
    // Overrides Graphics.fillPolygon.
    def fillPolygon(xPoints: Array[Int], yPoints: Array[Int], nPoints: Int): Unit = ???

    @stub
    // Overrides Graphics.fillRect.
    def fillRect(x: Int, y: Int, width: Int, height: Int): Unit = ???

    @stub
    // Overrides Graphics.fillRoundRect.
    def fillRoundRect(x: Int, y: Int, width: Int, height: Int, arcWidth: Int, arcHeight: Int): Unit = ???

    @stub
    // Overrides Graphics.getClip.
    def getClip(): Shape = ???

    @stub
    // Overrides Graphics.getClipBounds.
    def getClipBounds(): Rectangle = ???

    @stub
    // Returns the Color used for text drawing operations.
    def getColor(): Color = ???

    @stub
    // Returns the current debugging options for this DebugGraphics.
    def getDebugOptions(): Int = ???

    @stub
    // Returns the Font used for text drawing operations.
    def getFont(): Font = ???

    @stub
    // Overrides Graphics.getFontMetrics.
    def getFontMetrics(): FontMetrics = ???

    @stub
    // Overrides Graphics.getFontMetrics.
    def getFontMetrics(f: Font): FontMetrics = ???

    @stub
    // Returns the drawingBuffer value.
    def isDrawingBuffer(): Boolean = ???

    @stub
    // Overrides Graphics.setClip.
    def setClip(x: Int, y: Int, width: Int, height: Int): Unit = ???

    @stub
    // Overrides Graphics.setClip.
    def setClip(clip: Shape): Unit = ???

    @stub
    // Sets the color to be used for drawing and filling lines and shapes.
    def setColor(aColor: Color): Unit = ???

    @stub
    // Enables/disables diagnostic information about every graphics
    // operation.
    def setDebugOptions(options: Int): Unit = ???

    @stub
    // Sets the Font used for text drawing operations.
    def setFont(aFont: Font): Unit = ???

    @stub
    // Overrides Graphics.setPaintMode.
    def setPaintMode(): Unit = ???

    @stub
    // Overrides Graphics.setXORMode.
    def setXORMode(aColor: Color): Unit = ???
}

object DebugGraphics {
    @stub
    // Show buffered operations in a separate Frame.
    def BUFFERED_OPTION: Int = ???

    @stub
    // Flash graphics operations.
    def FLASH_OPTION: Int = ???

    @stub
    // Log graphics operations.
    def LOG_OPTION: Int = ???

    @stub
    // Returns the Color used to flash drawing operations.
    def flashColor(): Color = ???

    @stub
    // Returns the number of times that drawing operations will flash.
    def flashCount(): Int = ???

    @stub
    // Returns the time delay of drawing operation flashing.
    def flashTime(): Int = ???

    @stub
    // Returns the stream to which the DebugGraphics logs drawing operations.
    def logStream(): PrintStream = ???

    @stub
    // Sets the Color used to flash drawing operations.
    def setFlashColor(flashColor: Color): Unit = ???

    @stub
    // Sets the number of times that drawing operations will flash.
    def setFlashCount(flashCount: Int): Unit = ???

    @stub
    // Sets the time delay of drawing operation flashing.
    def setFlashTime(flashTime: Int): Unit = ???

    @stub
    // Sets the stream to which the DebugGraphics logs drawing operations.
    def setLogStream(stream: PrintStream): Unit = ???
}
