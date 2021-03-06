package hr.udruga01.arhixml.datamodel;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stvaratelj", propOrder = { "makerNote" })
public class Maker implements Serializable {
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "NapomenaOStvaratelju")
    protected String makerNote;
    @XmlAttribute(name = "StvarateljId", required = true)
    protected int makerId;
    @XmlAttribute(name = "UlogaId")
    protected Integer roleId;
    @XmlAttribute(name = "Razdoblje")
    protected String period;
    
    @XmlTransient
    protected String label;

    /**
     * Gets the value of the makerNote property.
     * 
     * @return possible object is {@link String }
     */
    public String getMakerNote() {
        return makerNote;
    }

    /**
     * Sets the value of the makerNote property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setMakerNote(String value) {
        this.makerNote = value;
    }

    /**
     * Gets the value of the makerId property.
     */
    public int getMakerId() {
        return makerId;
    }

    /**
     * Sets the value of the makerId property.
     */
    public void setMakerId(int value) {
        this.makerId = value;
    }

    /**
     * Gets the value of the roleId property.
     * 
     * @return possible object is {@link Integer }
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * Sets the value of the roleId property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     */
    public void setRoleId(Integer value) {
        this.roleId = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return possible object is {@link String }
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setPeriod(String value) {
        this.period = value;
    }
    
    /**
     * Gets the value of <code>label</code> property.
     */
    public String getLabel() {
        return label;
    }
    
    /**
     * Sets the value of the <code>label</code> property.
     */
    public void setLabel(String label) {
        this.label = label;
    }
}
