//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.29 at 02:58:40 PM UTC 
//


package se.trixon.trv_ti.road.weatherstation.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Wind complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Wind"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Direction" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="DirectionIconId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DirectionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Force" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="ForceMax" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Wind", propOrder = {
    "direction",
    "directionIconId",
    "directionText",
    "force",
    "forceMax"
})
public class Wind {

    @XmlElement(name = "Direction")
    protected Float direction;
    @XmlElement(name = "DirectionIconId")
    protected String directionIconId;
    @XmlElement(name = "DirectionText")
    protected String directionText;
    @XmlElement(name = "Force")
    protected Float force;
    @XmlElement(name = "ForceMax")
    protected Float forceMax;

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDirection(Float value) {
        this.direction = value;
    }

    /**
     * Gets the value of the directionIconId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectionIconId() {
        return directionIconId;
    }

    /**
     * Sets the value of the directionIconId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectionIconId(String value) {
        this.directionIconId = value;
    }

    /**
     * Gets the value of the directionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectionText() {
        return directionText;
    }

    /**
     * Sets the value of the directionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectionText(String value) {
        this.directionText = value;
    }

    /**
     * Gets the value of the force property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getForce() {
        return force;
    }

    /**
     * Sets the value of the force property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setForce(Float value) {
        this.force = value;
    }

    /**
     * Gets the value of the forceMax property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getForceMax() {
        return forceMax;
    }

    /**
     * Sets the value of the forceMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setForceMax(Float value) {
        this.forceMax = value;
    }

}