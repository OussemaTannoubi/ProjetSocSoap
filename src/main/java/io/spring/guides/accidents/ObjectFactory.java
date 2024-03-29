//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.12.11 at 12:50:24 PM PST 
//


package io.spring.guides.accidents;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.spring.guides.accidents package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.spring.guides.accidents
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Accident }
     * 
     */
    public Accident createAccident() {
        return new Accident();
    }

    /**
     * Create an instance of {@link Accidents }
     * 
     */
    public Accidents createAccidents() {
        return new Accidents();
    }

    /**
     * Create an instance of {@link AddAccidentRequest }
     * 
     */
    public AddAccidentRequest createAddAccidentRequest() {
        return new AddAccidentRequest();
    }

    /**
     * Create an instance of {@link AddAccidentResponse }
     * 
     */
    public AddAccidentResponse createAddAccidentResponse() {
        return new AddAccidentResponse();
    }

    /**
     * Create an instance of {@link GetAllAccidentsRequest }
     * 
     */
    public GetAllAccidentsRequest createGetAllAccidentsRequest() {
        return new GetAllAccidentsRequest();
    }

    /**
     * Create an instance of {@link GetAllAccidentsResponse }
     * 
     */
    public GetAllAccidentsResponse createGetAllAccidentsResponse() {
        return new GetAllAccidentsResponse();
    }

    /**
     * Create an instance of {@link GetAccidentByLocationRequest }
     * 
     */
    public GetAccidentByLocationRequest createGetAccidentByLocationRequest() {
        return new GetAccidentByLocationRequest();
    }

    /**
     * Create an instance of {@link GetAccidentByLocationResponse }
     * 
     */
    public GetAccidentByLocationResponse createGetAccidentByLocationResponse() {
        return new GetAccidentByLocationResponse();
    }

}
