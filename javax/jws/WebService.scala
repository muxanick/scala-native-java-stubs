package javax.jws

import java.lang.String
import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}

// 
@Retention ( value = RUNTIME ) @Target ( value = TYPE ) @interface WebService {

    @stub
    // 
    def endpointInterface: String = ???

    @stub
    // 
    def name: String = ???

    @stub
    // 
    def portName: String = ???

    @stub
    // 
    def serviceName: String = ???

    @stub
    // 
    def targetNamespace: String = ???
}
