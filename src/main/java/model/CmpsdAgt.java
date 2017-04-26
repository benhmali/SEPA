package model;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "CmpsdAgt", propOrder = { "bic", "othr" })
public class CmpsdAgt {

	@XmlElement(name = "BIC")
	protected String bic;
	@XmlElement(name = "Othr")
	@OneToOne(cascade = { CascadeType.PERSIST })
	protected CmpsdAgt.Othr othr;

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
	public CmpsdAgt.Othr getOthr() {
		return othr;
	}

	/**
	 * Définit la valeur de la propriété othr.
	 * 
	 * @param value
	 *            allowed object is {@link CmpsdAgt.Othr }
	 * 
	 */
	public void setOthr(CmpsdAgt.Othr value) {
		this.othr = value;
	}

	
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlRootElement
	@XmlType(name = "", propOrder = { "id" })
	public static class Othr {

		@XmlElement(name = "Id", required = true)
		protected String id;

		/**
		 * Obtient la valeur de la propriété id.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * Définit la valeur de la propriété id.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

	}

}
