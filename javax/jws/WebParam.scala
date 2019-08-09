package javax.jws

import java.lang.String
import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}

// 
@Retention ( value = RUNTIME ) @Target ( value = PARAMETER ) @interface WebParam {

    @stub
    // 
    def header: Boolean = ???

    @stub
    // 
    def mode: WebParam.Mode = ???

    @stub
    // 
    def name: String = ???

    @stub
    // 
    def partName: String = ???
}
