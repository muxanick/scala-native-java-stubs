package java.awt

import java.lang.Object
import java.net.URL

// The splash screen can be displayed at application startup, before the
// Java Virtual Machine (JVM) starts. The splash screen is displayed as an
// undecorated window containing an image. You can use GIF, JPEG, or PNG files
// for the image. Animation is supported for the GIF format, while transparency
// is supported both for GIF and PNG.  The window is positioned at the center
// of the screen. The position on multi-monitor systems is not specified. It is
// platform and implementation dependent.  The splash screen window is closed
// automatically as soon as the first window is displayed by Swing/AWT (may be
// also closed manually using the Java API, see below).
// 
// If your application is packaged in a jar file, you can use the
// "SplashScreen-Image" option in a manifest file to show a splash screen.
// Place the image in the jar archive and specify the path in the option.
// The path should not have a leading slash.
// 
// For example, in the manifest.mf file:
// 
// Manifest-Version: 1.0
// Main-Class: Test
// SplashScreen-Image: filename.gif
// 
// 
// If the Java implementation provides the command-line interface and you run
// your application by using the command line or a shortcut, use the Java
// application launcher option to show a splash screen. The Oracle reference
// implementation allows you to specify the splash screen image location with
// the -splash: option.
// 
// For example:
// 
// java -splash:filename.gif Test
// 
// The command line interface has higher precedence over the manifest
// setting.
// 
// The splash screen will be displayed as faithfully as possible to present the
// whole splash screen image given the limitations of the target platform and
// display.
// 
// It is implied that the specified image is presented on the screen "as is",
// i.e. preserving the exact color values as specified in the image file. Under
// certain circumstances, though, the presented image may differ, e.g. when
// applying color dithering to present a 32 bits per pixel (bpp) image on a 16
// or 8 bpp screen. The native platform display configuration may also affect
// the colors of the displayed image (e.g.  color profiles, etc.)
// 
// The SplashScreen class provides the API for controlling the splash
// screen. This class may be used to close the splash screen, change the splash
// screen image, get the splash screen native window position/size, and paint
// in the splash screen. It cannot be used to create the splash screen. You
// should use the options provided by the Java implementation for that.
// 
// This class cannot be instantiated. Only a single instance of this class
// can exist, and it may be obtained by using the getSplashScreen()
// static method. In case the splash screen has not been created at
// application startup via the command line or manifest file option,
// the getSplashScreen method returns null.
final class SplashScreen extends Object {

    @stub
    // Hides the splash screen, closes the window, and releases all associated
    // resources.
    def close(): Unit = ???

    @stub
    // Creates a graphics context (as a Graphics2D object) for the splash
    // screen overlay image, which allows you to draw over the splash screen.
    def createGraphics(): Graphics2D = ???

    @stub
    // Returns the bounds of the splash screen window as a Rectangle.
    def getBounds(): Rectangle = ???

    @stub
    // Returns the current splash screen image.
    def getImageURL(): URL = ???

    @stub
    // Returns the size of the splash screen window as a Dimension.
    def getSize(): Dimension = ???

    @stub
    // Determines whether the splash screen is visible.
    def isVisible(): Boolean = ???

    @stub
    // Changes the splash screen image.
    def setImageURL(imageURL: URL): Unit = ???
}

object SplashScreen {
    @stub
    // Returns the SplashScreen object used for
    // Java startup splash screen control on systems that support display.
    def getSplashScreen(): SplashScreen = ???
}
