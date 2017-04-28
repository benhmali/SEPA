package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@Entity
@XmlRootElement
@XmlType(name = "Amount", propOrder = { "instdAmt" })
@XmlAccessorType(XmlAccessType.FIELD)

public class Amount implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@XmlTransient
	private long id;

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
