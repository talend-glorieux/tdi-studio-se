package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public interface ISearchSnippet  {

      /**
       * element : text of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String
       */

      public java.lang.String getText();

      public void setText(java.lang.String text);

      /**
       * element : wholeFields of type {urn:partner.soap.sforce.com}NameValuePair
       * java type: com.sforce.soap.partner.NameValuePair[]
       */

      public com.sforce.soap.partner.INameValuePair[] getWholeFields();

      public void setWholeFields(com.sforce.soap.partner.INameValuePair[] wholeFields);


}
