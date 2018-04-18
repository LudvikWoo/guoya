
package com.guoyasoft.webservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "signUp", namespace = "http://webservice.guoyasoft.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "signUp", namespace = "http://webservice.guoyasoft.com/")
public class SignUp {

    @XmlElement(name = "arg0", namespace = "")
    private com.guoyasoft.bean.api.user.signUp.SignUpRequest arg0;

    /**
     * 
     * @return
     *     returns SignUpRequest
     */
    public com.guoyasoft.bean.api.user.signUp.SignUpRequest getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(com.guoyasoft.bean.api.user.signUp.SignUpRequest arg0) {
        this.arg0 = arg0;
    }

}
