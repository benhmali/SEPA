//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.03.21 à 02:24:27 PM CET 
//

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
@XmlType(name = "CmpsdIdt", propOrder = { "iban", "prvtId" })
public class CmpsdIdt {

	@XmlElement(name = "IBAN")
	protected String iban;
	@XmlElement(name = "PrvtId")
	@OneToOne(cascade = { CascadeType.PERSIST })
	protected CmpsdIdt.PrvtId prvtId;

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
	public CmpsdIdt.PrvtId getPrvtId() {
		return prvtId;
	}

	/**
	 * Définit la valeur de la propriété prvtId.
	 * 
	 * @param value
	 *            allowed object is {@link CmpsdIdt.PrvtId }
	 * 
	 */
	public void setPrvtId(CmpsdIdt.PrvtId value) {
		this.prvtId = value;
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlRootElement
	@XmlType(name = "", propOrder = { "othr" })
	public static class PrvtId {

		@XmlElement(required = true)
		@OneToOne(cascade = { CascadeType.PERSIST })
		protected CmpsdIdt.PrvtId.Othr othr;

		/**
		 * Obtient la valeur de la propriété othr.
		 * 
		 * @return possible object is {@link CmpsdIdt.PrvtId.Othr }
		 * 
		 */
		public CmpsdIdt.PrvtId.Othr getOthr() {
			return othr;
		}

		/**
		 * Définit la valeur de la propriété othr.
		 * 
		 * @param value
		 *            allowed object is {@link CmpsdIdt.PrvtId.Othr }
		 * 
		 */
		public void setOthr(CmpsdIdt.PrvtId.Othr value) {
			this.othr = value;
		}

		
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlRootElement
		@XmlType(name = "", propOrder = { "id", "schmeNm" })
		public static class Othr {

			@XmlElement(name = "Id", required = true)
			protected String id;
			@XmlElement(name = "SchmeNm", required = true)
			@OneToOne(cascade = { CascadeType.PERSIST })
			protected CmpsdIdt.PrvtId.Othr.SchmeNm schmeNm;

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

			/**
			 * Obtient la valeur de la propriété schmeNm.
			 * 
			 * @return possible object is {@link CmpsdIdt.PrvtId.Othr.SchmeNm }
			 * 
			 */
			public CmpsdIdt.PrvtId.Othr.SchmeNm getSchmeNm() {
				return schmeNm;
			}

			/**
			 * Définit la valeur de la propriété schmeNm.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link CmpsdIdt.PrvtId.Othr.SchmeNm }
			 * 
			 */
			public void setSchmeNm(CmpsdIdt.PrvtId.Othr.SchmeNm value) {
				this.schmeNm = value;
			}

			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlRootElement
			@XmlType(name = "", propOrder = { "prtry" })
			public static class SchmeNm {

				@XmlElement(name = "Prtry", required = true)
				protected Object prtry;

				/**
				 * Obtient la valeur de la propriété prtry.
				 * 
				 * @return possible object is {@link Object }
				 * 
				 */
				public Object getPrtry() {
					return prtry;
				}

				/**
				 * Définit la valeur de la propriété prtry.
				 * 
				 * @param value
				 *            allowed object is {@link Object }
				 * 
				 */
				public void setPrtry(Object value) {
					this.prtry = value;
				}

			}

		}

	}

}
