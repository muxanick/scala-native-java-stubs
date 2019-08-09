package javax.jws.soap

import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}

// 
@Retention ( value = RUNTIME ) @Target ( value ={ TYPE , METHOD } ) @interface SOAPBinding {

    @stub
    // 
    def parameterStyle: SOAPBinding.ParameterStyle = ???

    @stub
    // 
    def style: SOAPBinding.Style = ???
}
