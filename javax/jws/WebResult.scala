package javax.jws

import java.lang.String
import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}

// 
@Retention ( value = RUNTIME ) @Target ( value = METHOD ) @interface WebResult {

    @stub
    // 
    def header: Boolean = ???

    @stub
    // 
    def name: String = ???

    @stub
    // 
    def partName: String = ???
}
