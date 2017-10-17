/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package com.example.demo;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.math.BigDecimal;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * This request returns the subscriber details for the specified
 * SUBSCRIPTIONNUMBER.
 * 
 * @version $Revision$ $Date$
 */
public class ISUBSCRIBER_GETBYSUBSCRIPTIONNUMBER implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Subscription number to use in the search. 
     */
    private java.math.BigDecimal _SUBSCRIPTIONNUMBER;


      //----------------/
     //- Constructors -/
    //----------------/

    public ISUBSCRIBER_GETBYSUBSCRIPTIONNUMBER() 
     {
        super();
    } //-- com.intuit.spc.subscription.data.ISUBSCRIBER_GETBYSUBSCRIPTIONNUMBER()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'SUBSCRIPTIONNUMBER'. The field
     * 'SUBSCRIPTIONNUMBER' has the following description:
     * Subscription number to use in the search. 
     * 
     * @return BigDecimal
     * @return the value of field 'SUBSCRIPTIONNUMBER'.
     */
    public java.math.BigDecimal getSUBSCRIPTIONNUMBER()
    {
        return this._SUBSCRIPTIONNUMBER;
    } //-- java.math.BigDecimal getSUBSCRIPTIONNUMBER() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
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
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'SUBSCRIPTIONNUMBER'. The field
     * 'SUBSCRIPTIONNUMBER' has the following description:
     * Subscription number to use in the search. 
     * 
     * @param SUBSCRIPTIONNUMBER the value of field
     * 'SUBSCRIPTIONNUMBER'.
     */
    public void setSUBSCRIPTIONNUMBER(java.math.BigDecimal SUBSCRIPTIONNUMBER)
    {
        this._SUBSCRIPTIONNUMBER = SUBSCRIPTIONNUMBER;
    } //-- void setSUBSCRIPTIONNUMBER(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ISUBSCRIBER_GETBYSUBSCRIPTIONNUMBER
     */
    public static ISUBSCRIBER_GETBYSUBSCRIPTIONNUMBER unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (ISUBSCRIBER_GETBYSUBSCRIPTIONNUMBER) Unmarshaller.unmarshal(ISUBSCRIBER_GETBYSUBSCRIPTIONNUMBER.class, reader);
    } //-- com.intuit.spc.subscription.data.ISUBSCRIBER_GETBYSUBSCRIPTIONNUMBER unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
