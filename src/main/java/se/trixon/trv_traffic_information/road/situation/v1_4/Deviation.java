//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.29 at 02:53:12 PM UTC 
//


package se.trixon.trv_traffic_information.road.situation.v1_4;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Deviation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Deviation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AffectedDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AffectedDirectionValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountyNo" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Creator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Geometry" type="{}Geometry" minOccurs="0"/&gt;
 *         &lt;element name="Header" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IconId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Image" type="{}Image" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="JourneyReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ManagedCause" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MessageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MessageCodeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MessageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MessageTypeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfLanesRestricted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PositionalDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoadNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoadNumberNumeric" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SafetyRelatedMessage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Schedule" type="{}Schedule" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SeverityCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SeverityText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LocationDescriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TemporaryLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrafficRestrictionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValidUntilFurtherNotice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WebLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VersionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Deviation", propOrder = {
    "affectedDirection",
    "affectedDirectionValue",
    "countyNo",
    "creator",
    "creationTime",
    "endTime",
    "geometry",
    "header",
    "iconId",
    "id",
    "image",
    "journeyReference",
    "managedCause",
    "message",
    "messageCode",
    "messageCodeValue",
    "messageType",
    "messageTypeValue",
    "numberOfLanesRestricted",
    "positionalDescription",
    "roadNumber",
    "roadNumberNumeric",
    "safetyRelatedMessage",
    "schedule",
    "severityCode",
    "severityText",
    "startTime",
    "locationDescriptor",
    "temporaryLimit",
    "trafficRestrictionType",
    "validUntilFurtherNotice",
    "webLink",
    "versionTime"
})
public class Deviation {

    @XmlElement(name = "AffectedDirection")
    protected String affectedDirection;
    @XmlElement(name = "AffectedDirectionValue")
    protected String affectedDirectionValue;
    @XmlElement(name = "CountyNo", type = Integer.class)
    protected List<Integer> countyNo;
    @XmlElement(name = "Creator")
    protected String creator;
    @XmlElement(name = "CreationTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTime;
    @XmlElement(name = "EndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "Geometry")
    protected Geometry geometry;
    @XmlElement(name = "Header")
    protected String header;
    @XmlElement(name = "IconId")
    protected String iconId;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Image")
    protected List<Image> image;
    @XmlElement(name = "JourneyReference")
    protected String journeyReference;
    @XmlElement(name = "ManagedCause")
    protected Boolean managedCause;
    @XmlElement(name = "Message")
    protected String message;
    @XmlElement(name = "MessageCode")
    protected String messageCode;
    @XmlElement(name = "MessageCodeValue")
    protected String messageCodeValue;
    @XmlElement(name = "MessageType")
    protected String messageType;
    @XmlElement(name = "MessageTypeValue")
    protected String messageTypeValue;
    @XmlElement(name = "NumberOfLanesRestricted")
    protected Integer numberOfLanesRestricted;
    @XmlElement(name = "PositionalDescription")
    protected String positionalDescription;
    @XmlElement(name = "RoadNumber")
    protected String roadNumber;
    @XmlElement(name = "RoadNumberNumeric")
    protected Integer roadNumberNumeric;
    @XmlElement(name = "SafetyRelatedMessage")
    protected Boolean safetyRelatedMessage;
    @XmlElement(name = "Schedule")
    protected List<Schedule> schedule;
    @XmlElement(name = "SeverityCode")
    protected Integer severityCode;
    @XmlElement(name = "SeverityText")
    protected String severityText;
    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "LocationDescriptor")
    protected String locationDescriptor;
    @XmlElement(name = "TemporaryLimit")
    protected String temporaryLimit;
    @XmlElement(name = "TrafficRestrictionType")
    protected String trafficRestrictionType;
    @XmlElement(name = "ValidUntilFurtherNotice")
    protected Boolean validUntilFurtherNotice;
    @XmlElement(name = "WebLink")
    protected String webLink;
    @XmlElement(name = "VersionTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar versionTime;

    /**
     * Gets the value of the affectedDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffectedDirection() {
        return affectedDirection;
    }

    /**
     * Sets the value of the affectedDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffectedDirection(String value) {
        this.affectedDirection = value;
    }

    /**
     * Gets the value of the affectedDirectionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffectedDirectionValue() {
        return affectedDirectionValue;
    }

    /**
     * Sets the value of the affectedDirectionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffectedDirectionValue(String value) {
        this.affectedDirectionValue = value;
    }

    /**
     * Gets the value of the countyNo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countyNo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountyNo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getCountyNo() {
        if (countyNo == null) {
            countyNo = new ArrayList<Integer>();
        }
        return this.countyNo;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * Gets the value of the creationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTime(XMLGregorianCalendar value) {
        this.creationTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the geometry property.
     * 
     * @return
     *     possible object is
     *     {@link Geometry }
     *     
     */
    public Geometry getGeometry() {
        return geometry;
    }

    /**
     * Sets the value of the geometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geometry }
     *     
     */
    public void setGeometry(Geometry value) {
        this.geometry = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader(String value) {
        this.header = value;
    }

    /**
     * Gets the value of the iconId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconId() {
        return iconId;
    }

    /**
     * Sets the value of the iconId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconId(String value) {
        this.iconId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the image property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Image }
     * 
     * 
     */
    public List<Image> getImage() {
        if (image == null) {
            image = new ArrayList<Image>();
        }
        return this.image;
    }

    /**
     * Gets the value of the journeyReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJourneyReference() {
        return journeyReference;
    }

    /**
     * Sets the value of the journeyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJourneyReference(String value) {
        this.journeyReference = value;
    }

    /**
     * Gets the value of the managedCause property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManagedCause() {
        return managedCause;
    }

    /**
     * Sets the value of the managedCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManagedCause(Boolean value) {
        this.managedCause = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the messageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageCode() {
        return messageCode;
    }

    /**
     * Sets the value of the messageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageCode(String value) {
        this.messageCode = value;
    }

    /**
     * Gets the value of the messageCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageCodeValue() {
        return messageCodeValue;
    }

    /**
     * Sets the value of the messageCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageCodeValue(String value) {
        this.messageCodeValue = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the messageTypeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageTypeValue() {
        return messageTypeValue;
    }

    /**
     * Sets the value of the messageTypeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageTypeValue(String value) {
        this.messageTypeValue = value;
    }

    /**
     * Gets the value of the numberOfLanesRestricted property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfLanesRestricted() {
        return numberOfLanesRestricted;
    }

    /**
     * Sets the value of the numberOfLanesRestricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfLanesRestricted(Integer value) {
        this.numberOfLanesRestricted = value;
    }

    /**
     * Gets the value of the positionalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionalDescription() {
        return positionalDescription;
    }

    /**
     * Sets the value of the positionalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionalDescription(String value) {
        this.positionalDescription = value;
    }

    /**
     * Gets the value of the roadNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadNumber() {
        return roadNumber;
    }

    /**
     * Sets the value of the roadNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadNumber(String value) {
        this.roadNumber = value;
    }

    /**
     * Gets the value of the roadNumberNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoadNumberNumeric() {
        return roadNumberNumeric;
    }

    /**
     * Sets the value of the roadNumberNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoadNumberNumeric(Integer value) {
        this.roadNumberNumeric = value;
    }

    /**
     * Gets the value of the safetyRelatedMessage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSafetyRelatedMessage() {
        return safetyRelatedMessage;
    }

    /**
     * Sets the value of the safetyRelatedMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSafetyRelatedMessage(Boolean value) {
        this.safetyRelatedMessage = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Schedule }
     * 
     * 
     */
    public List<Schedule> getSchedule() {
        if (schedule == null) {
            schedule = new ArrayList<Schedule>();
        }
        return this.schedule;
    }

    /**
     * Gets the value of the severityCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeverityCode() {
        return severityCode;
    }

    /**
     * Sets the value of the severityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeverityCode(Integer value) {
        this.severityCode = value;
    }

    /**
     * Gets the value of the severityText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverityText() {
        return severityText;
    }

    /**
     * Sets the value of the severityText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverityText(String value) {
        this.severityText = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the locationDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationDescriptor() {
        return locationDescriptor;
    }

    /**
     * Sets the value of the locationDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationDescriptor(String value) {
        this.locationDescriptor = value;
    }

    /**
     * Gets the value of the temporaryLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemporaryLimit() {
        return temporaryLimit;
    }

    /**
     * Sets the value of the temporaryLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemporaryLimit(String value) {
        this.temporaryLimit = value;
    }

    /**
     * Gets the value of the trafficRestrictionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrafficRestrictionType() {
        return trafficRestrictionType;
    }

    /**
     * Sets the value of the trafficRestrictionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrafficRestrictionType(String value) {
        this.trafficRestrictionType = value;
    }

    /**
     * Gets the value of the validUntilFurtherNotice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidUntilFurtherNotice() {
        return validUntilFurtherNotice;
    }

    /**
     * Sets the value of the validUntilFurtherNotice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidUntilFurtherNotice(Boolean value) {
        this.validUntilFurtherNotice = value;
    }

    /**
     * Gets the value of the webLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebLink() {
        return webLink;
    }

    /**
     * Sets the value of the webLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebLink(String value) {
        this.webLink = value;
    }

    /**
     * Gets the value of the versionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersionTime() {
        return versionTime;
    }

    /**
     * Sets the value of the versionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVersionTime(XMLGregorianCalendar value) {
        this.versionTime = value;
    }

}
