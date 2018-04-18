/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.guoyasoft.bean.api.user.queryUser;

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
public class QryUserReq implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _realName;

    private java.lang.String _userName;

    private java.lang.String _education;

    private java.lang.String _classType;

    private java.lang.String _startTime;

    private java.lang.String _endTime;

    private java.lang.String _minAge;

    private java.lang.String _maxAge;


      //----------------/
     //- Constructors -/
    //----------------/

    public QryUserReq() {
        super();
    } //-- com.guoyasoft.bean.api.user.queryUser.QryUserReq()


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'endTime'.
     * 
     * @return the value of field 'endTime'.
    **/
    public java.lang.String getEndTime()
    {
        return this._endTime;
    } //-- java.lang.String getEndTime() 

    /**
     * Returns the value of field 'maxAge'.
     * 
     * @return the value of field 'maxAge'.
    **/
    public java.lang.String getMaxAge()
    {
        return this._maxAge;
    } //-- java.lang.String getMaxAge() 

    /**
     * Returns the value of field 'minAge'.
     * 
     * @return the value of field 'minAge'.
    **/
    public java.lang.String getMinAge()
    {
        return this._minAge;
    } //-- java.lang.String getMinAge() 

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
     * Returns the value of field 'startTime'.
     * 
     * @return the value of field 'startTime'.
    **/
    public java.lang.String getStartTime()
    {
        return this._startTime;
    } //-- java.lang.String getStartTime() 

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
     * Sets the value of field 'endTime'.
     * 
     * @param endTime the value of field 'endTime'.
    **/
    public void setEndTime(java.lang.String endTime)
    {
        this._endTime = endTime;
    } //-- void setEndTime(java.lang.String) 

    /**
     * Sets the value of field 'maxAge'.
     * 
     * @param maxAge the value of field 'maxAge'.
    **/
    public void setMaxAge(java.lang.String maxAge)
    {
        this._maxAge = maxAge;
    } //-- void setMaxAge(java.lang.String) 

    /**
     * Sets the value of field 'minAge'.
     * 
     * @param minAge the value of field 'minAge'.
    **/
    public void setMinAge(java.lang.String minAge)
    {
        this._minAge = minAge;
    } //-- void setMinAge(java.lang.String) 

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
     * Sets the value of field 'startTime'.
     * 
     * @param startTime the value of field 'startTime'.
    **/
    public void setStartTime(java.lang.String startTime)
    {
        this._startTime = startTime;
    } //-- void setStartTime(java.lang.String) 

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
    public static com.guoyasoft.bean.api.user.queryUser.QryUserReq unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.guoyasoft.bean.api.user.queryUser.QryUserReq) Unmarshaller.unmarshal(com.guoyasoft.bean.api.user.queryUser.QryUserReq.class, reader);
    } //-- com.guoyasoft.bean.api.user.queryUser.QryUserReq unmarshal(java.io.Reader) 

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
		return "QryUserReq [_realName=" + _realName + ", _userName="
				+ _userName + ", _education=" + _education + ", _classType="
				+ _classType + ", _startTime=" + _startTime + ", _endTime="
				+ _endTime + ", _minAge=" + _minAge + ", _maxAge=" + _maxAge
				+ "]";
	}

}
