//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.03.21 à 02:24:27 PM CET 
//

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
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "CmpsdIdt", propOrder = { "iban", "prvtId" })
public class CmpsdIdt implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@XmlTransient
	private long id;

	@XmlElement(name = "IBAN")
	protected String iban;
	@XmlElement(name = "PrvtId")
	@OneToOne(cascade = { CascadeType.PERSIST })
	protected PrvtId prvtId;

	/**
	 * Obtient la valeur de la propriété iban.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIBAN() {
		return iban;
	}

	/**
	 * Définit la valeur de la propriété iban.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIBAN(String value) {
		this.iban = value;
	}

	/**
	 * Obtient la valeur de la propriété prvtId.
	 * 
	 * @return possible object is {@link CmpsdIdt.PrvtId }
	 * 
	 */
	public PrvtId getPrvtId() {
		return prvtId;
	}

	/**
	 * Définit la valeur de la propriété prvtId.
	 * 
	 * @param value
	 *            allowed object is {@link CmpsdIdt.PrvtId }
	 * 
	 */
	public void setPrvtId(PrvtId value) {
		this.prvtId = value;
	}

	
}
