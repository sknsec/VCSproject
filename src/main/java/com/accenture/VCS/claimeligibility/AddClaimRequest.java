//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.15 at 03:04:01 PM IST 
//


package com.accenture.VCS.claimeligibility;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="claimId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="dateOfloss" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeOfloss" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="losslocationAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pincode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lossLocationStateCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="injuryDetail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="policyNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="descriptionOfLos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "claimId",
    "dateOfloss",
    "timeOfloss",
    "losslocationAddress",
    "pincode",
    "lossLocationStateCode",
    "injuryDetail",
    "policyNumber",
    "descriptionOfLos"
})
@XmlRootElement(name = "addClaimRequest")
public class AddClaimRequest {

    @XmlElement(required = true)
    protected BigInteger claimId;
    @XmlElement(required = true)
    protected String dateOfloss;
    @XmlElement(required = true)
    protected String timeOfloss;
    @XmlElement(required = true)
    protected String losslocationAddress;
    @XmlElement(required = true)
    protected String pincode;
    @XmlElement(required = true)
    protected String lossLocationStateCode;
    @XmlElement(required = true)
    protected String injuryDetail;
    @XmlElement(required = true)
    protected BigInteger policyNumber;
    @XmlElement(required = true)
    protected String descriptionOfLos;

    /**
     * Gets the value of the claimId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClaimId() {
        return claimId;
    }

    /**
     * Sets the value of the claimId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClaimId(BigInteger value) {
        this.claimId = value;
    }

    /**
     * Gets the value of the dateOfloss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfloss() {
        return dateOfloss;
    }

    /**
     * Sets the value of the dateOfloss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfloss(String value) {
        this.dateOfloss = value;
    }

    /**
     * Gets the value of the timeOfloss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeOfloss() {
        return timeOfloss;
    }

    /**
     * Sets the value of the timeOfloss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeOfloss(String value) {
        this.timeOfloss = value;
    }

    /**
     * Gets the value of the losslocationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLosslocationAddress() {
        return losslocationAddress;
    }

    /**
     * Sets the value of the losslocationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLosslocationAddress(String value) {
        this.losslocationAddress = value;
    }

    /**
     * Gets the value of the pincode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPincode() {
        return pincode;
    }

    /**
     * Sets the value of the pincode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPincode(String value) {
        this.pincode = value;
    }

    /**
     * Gets the value of the lossLocationStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLossLocationStateCode() {
        return lossLocationStateCode;
    }

    /**
     * Sets the value of the lossLocationStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLossLocationStateCode(String value) {
        this.lossLocationStateCode = value;
    }

    /**
     * Gets the value of the injuryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInjuryDetail() {
        return injuryDetail;
    }

    /**
     * Sets the value of the injuryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInjuryDetail(String value) {
        this.injuryDetail = value;
    }

    /**
     * Gets the value of the policyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the value of the policyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPolicyNumber(BigInteger value) {
        this.policyNumber = value;
    }

    /**
     * Gets the value of the descriptionOfLos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionOfLos() {
        return descriptionOfLos;
    }

    /**
     * Sets the value of the descriptionOfLos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionOfLos(String value) {
        this.descriptionOfLos = value;
    }

}
