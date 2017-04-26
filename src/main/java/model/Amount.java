package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "Amount", propOrder = { "instdAmt" })
public class Amount {

	@XmlElement(name = "InstdAmt")
	protected float instdAmt;
	@XmlAttribute(name = "Ccy", required = true)
	protected String ccy;

	/**
	 * Obtient la valeur de la propriété instdAmt.
	 * 
	 */
	public float getInstdAmt() {
		return instdAmt;
	}

	/**
	 * Définit la valeur de la propriété instdAmt.
	 * 
	 */
	public void setInstdAmt(float value) {
		this.instdAmt = value;
	}

	/**
	 * Obtient la valeur de la propriété ccy.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCcy() {
		return ccy;
	}

	/**
	 * Définit la valeur de la propriété ccy.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCcy(String value) {
		this.ccy = value;
	}

}
