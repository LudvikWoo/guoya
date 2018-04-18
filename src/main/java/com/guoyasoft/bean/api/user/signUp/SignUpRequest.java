/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.guoyasoft.bean.api.user.signUp;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.*;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * 
 * 
 * @version $Revision$ $Date$
**/
public class SignUpRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _userName;

    private java.lang.String _realName;

    private java.lang.String _password;

    private java.lang.String _password2;

    private java.lang.String _checkCode;

    private java.lang.String _weixin;

    private java.lang.String _address;

    private java.lang.String _phone;

    private java.lang.String _age;

    private java.lang.String _education;

    private java.lang.String _classType;


      //----------------/
     //- Constructors -/
    //----------------/

    public SignUpRequest() {
        super();
    } //-- com.guoyasoft.bean.api.user.signUp.SignUpRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'address'.
     * 
     * @return the value of field 'address'.
    **/
    public java.lang.String getAddress()
    {
        return this._address;
    } //-- java.lang.String getAddress() 

    /**
     * Returns the value of field 'age'.
     * 
     * @return the value of field 'age'.
    **/
    public java.lang.String getAge()
    {
        return this._age;
    } //-- java.lang.String getAge() 

    /**
     * Returns the value of field 'checkCode'.
     * 
     * @return the value of field 'checkCode'.
    **/
    public java.lang.String getCheckCode()
    {
        return this._checkCode;
    } //-- java.lang.String getCheckCode() 

    /**
     * Returns the value of field 'classType'.
     * 
     * @return the value of field 'classType'.
    **/
    public java.lang.String getClassType()
    {
        return this._classType;
    } //-- java.lang.String getClassType() 

    /**
     * Returns the value of field 'education'.
     * 
     * @return the value of field 'education'.
    **/
    public java.lang.String getEducation()
    {
        return this._education;
    } //-- java.lang.String getEducation() 

    /**
     * Returns the value of field 'password'.
     * 
     * @return the value of field 'password'.
    **/
    public java.lang.String getPassword()
    {
        return this._password;
    } //-- java.lang.String getPassword() 

    /**
     * Returns the value of field 'password2'.
     * 
     * @return the value of field 'password2'.
    **/
    public java.lang.String getPassword2()
    {
        return this._password2;
    } //-- java.lang.String getPassword2() 

    /**
     * Returns the value of field 'phone'.
     * 
     * @return the value of field 'phone'.
    **/
    public java.lang.String getPhone()
    {
        return this._phone;
    } //-- java.lang.String getPhone() 

    /**
     * Returns the value of field 'realName'.
     * 
     * @return the value of field 'realName'.
    **/
    public java.lang.String getRealName()
    {
        return this._realName;
    } //-- java.lang.String getRealName() 

    /**
     * Returns the value of field 'userName'.
     * 
     * @return the value of field 'userName'.
    **/
    public java.lang.String getUserName()
    {
        return this._userName;
    } //-- java.lang.String getUserName() 

    /**
     * Returns the value of field 'weixin'.
     * 
     * @return the value of field 'weixin'.
    **/
    public java.lang.String getWeixin()
    {
        return this._weixin;
    } //-- java.lang.String getWeixin() 

    /**
    **/
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
        	vex.printStackTrace();
            return false;
            
        }
        return true;
    } //-- boolean isValid() 

    /**
     * 
     * 
     * @param out
    **/
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * 
     * 
     * @param handler
    **/
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'address'.
     * 
     * @param address the value of field 'address'.
    **/
    public void setAddress(java.lang.String address)
    {
        this._address = address;
    } //-- void setAddress(java.lang.String) 

    /**
     * Sets the value of field 'age'.
     * 
     * @param age the value of field 'age'.
    **/
    public void setAge(java.lang.String age)
    {
        this._age = age;
    } //-- void setAge(java.lang.String) 

    /**
     * Sets the value of field 'checkCode'.
     * 
     * @param checkCode the value of field 'checkCode'.
    **/
    public void setCheckCode(java.lang.String checkCode)
    {
        this._checkCode = checkCode;
    } //-- void setCheckCode(java.lang.String) 

    /**
     * Sets the value of field 'classType'.
     * 
     * @param classType the value of field 'classType'.
    **/
    public void setClassType(java.lang.String classType)
    {
        this._classType = classType;
    } //-- void setClassType(java.lang.String) 

    /**
     * Sets the value of field 'education'.
     * 
     * @param education the value of field 'education'.
    **/
    public void setEducation(java.lang.String education)
    {
        this._education = education;
    } //-- void setEducation(java.lang.String) 

    /**
     * Sets the value of field 'password'.
     * 
     * @param password the value of field 'password'.
    **/
    public void setPassword(java.lang.String password)
    {
        this._password = password;
    } //-- void setPassword(java.lang.String) 

    /**
     * Sets the value of field 'password2'.
     * 
     * @param password2 the value of field 'password2'.
    **/
    public void setPassword2(java.lang.String password2)
    {
        this._password2 = password2;
    } //-- void setPassword2(java.lang.String) 

    /**
     * Sets the value of field 'phone'.
     * 
     * @param phone the value of field 'phone'.
    **/
    public void setPhone(java.lang.String phone)
    {
        this._phone = phone;
    } //-- void setPhone(java.lang.String) 

    /**
     * Sets the value of field 'realName'.
     * 
     * @param realName the value of field 'realName'.
    **/
    public void setRealName(java.lang.String realName)
    {
        this._realName = realName;
    } //-- void setRealName(java.lang.String) 

    /**
     * Sets the value of field 'userName'.
     * 
     * @param userName the value of field 'userName'.
    **/
    public void setUserName(java.lang.String userName)
    {
        this._userName = userName;
    } //-- void setUserName(java.lang.String) 

    /**
     * Sets the value of field 'weixin'.
     * 
     * @param weixin the value of field 'weixin'.
    **/
    public void setWeixin(java.lang.String weixin)
    {
        this._weixin = weixin;
    } //-- void setWeixin(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.guoyasoft.bean.api.user.signUp.SignUpRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.guoyasoft.bean.api.user.signUp.SignUpRequest) Unmarshaller.unmarshal(com.guoyasoft.bean.api.user.signUp.SignUpRequest.class, reader);
    } //-- com.guoyasoft.bean.api.user.signUp.SignUpRequest unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 


	@Override
	public String toString() {
		return "SignUpRequest [_userName=" + _userName + ", _realName="
				+ _realName + ", _password=" + _password + ", _password2="
				+ _password2 + ", _checkCode=" + _checkCode + ", _weixin="
				+ _weixin + ", _address=" + _address + ", _phone=" + _phone
				+ ", _age=" + _age + ", _education=" + _education
				+ ", _classType=" + _classType + "]";
	}

}
