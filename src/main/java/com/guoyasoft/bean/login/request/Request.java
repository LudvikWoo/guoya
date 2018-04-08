/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.guoyasoft.bean.login.request;

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
public class Request implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _userName;

    private java.lang.String _password;

    private java.lang.String _checkCode;


      //----------------/
     //- Constructors -/
    //----------------/

    public Request() {
        super();
    } //-- com.guoyasoft.bean.login.request.Request()


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'password'.
     * 
     * @return the value of field 'password'.
    **/
    public java.lang.String getPassword()
    {
        return this._password;
    } //-- java.lang.String getPassword() 

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
    **/
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
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
     * Sets the value of field 'checkCode'.
     * 
     * @param checkCode the value of field 'checkCode'.
    **/
    public void setCheckCode(java.lang.String checkCode)
    {
        this._checkCode = checkCode;
    } //-- void setCheckCode(java.lang.String) 

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
     * Sets the value of field 'userName'.
     * 
     * @param userName the value of field 'userName'.
    **/
    public void setUserName(java.lang.String userName)
    {
        this._userName = userName;
    } //-- void setUserName(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.guoyasoft.bean.login.request.Request unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.guoyasoft.bean.login.request.Request) Unmarshaller.unmarshal(com.guoyasoft.bean.login.request.Request.class, reader);
    } //-- com.guoyasoft.bean.login.request.Request unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
