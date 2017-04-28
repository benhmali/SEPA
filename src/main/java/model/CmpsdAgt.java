package model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@Entity
@XmlRootElement
@XmlType(name = "CmpsdAgt", propOrder = { "bic", "othr" })
@XmlAccessorType(XmlAccessType.FIELD)
public class CmpsdAgt implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@XmlTransient
	private long id;

	@XmlElement(name = "BIC")
	protected String bic;
	@XmlElement(name = "Othr")
	@OneToOne(cascade = { CascadeType.PERSIST })
	protected Othr othr;

	/**
	 * Obtient la valeur de la propriété bic.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBIC() {
		return bic;
	}

	/**
	 * Définit la valeur de la propriété bic.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBIC(String value) {
		this.bic = value;
	}

	/**
	 * Obtient la valeur de la propriété othr.
	 * 
	 * @return possible object is {@link CmpsdAgt.Othr }
	 * 
	 */
	public Othr getOthr() {
		return othr;
	}

	/**
	 * Définit la valeur de la propriété othr.
	 * 
	 * @param value
	 *            allowed object is {@link CmpsdAgt.Othr }
	 * 
	 */
	public void setOthr(Othr value) {
		this.othr = value;
	}

	
}
