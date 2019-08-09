package javax.jws.soap

import java.lang.{Deprecated, String}

// 
@Deprecated @interface SOAPMessageHandler {

    @stub
    // Deprecated. 
    def headers: Array[String] = ???

    @stub
    // Deprecated. 
    def initParams: Array[InitParam] = ???

    @stub
    // Deprecated. 
    def name: String = ???
}
