package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CmpsdTx", propOrder = { "mndtId", "dtOfSgntr" })
public class CmpsdTx {

	@XmlElement(name = "MndtId", required = true)
	protected String mndtId;
	@XmlElement(name = "DtOfSgntr", required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar dtOfSgntr;

	/**
	 * Obtient la valeur de la propriété mndtId.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMndtId() {
		return mndtId;
	}

	/**
	 * Définit la valeur de la propriété mndtId.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMndtId(String value) {
		this.mndtId = value;
	}

	/**
	 * Obtient la valeur de la propriété dtOfSgntr.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getDtOfSgntr() {
		return dtOfSgntr;
	}

	/**
	 * Définit la valeur de la propriété dtOfSgntr.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setDtOfSgntr(XMLGregorianCalendar value) {
		this.dtOfSgntr = value;
	}

}
