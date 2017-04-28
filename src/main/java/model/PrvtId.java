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
@XmlType(name = "", propOrder = { "othr" })
public class PrvtId implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@XmlTransient
	private long id;

	@XmlElement(required = true)
	@OneToOne(cascade = { CascadeType.PERSIST })
	protected PrvtId.Othr othr;

	/**
	 * Obtient la valeur de la propriété othr.
	 * 
	 * @return possible object is {@link CmpsdIdt.PrvtId.Othr }
	 * 
	 */
	public PrvtId.Othr getOthr() {
		return othr;
	}

	/**
	 * Définit la valeur de la propriété othr.
	 * 
	 * @param value
	 *            allowed object is {@link CmpsdIdt.PrvtId.Othr }
	 * 
	 */
	public void setOthr(PrvtId.Othr value) {
		this.othr = value;
	}

	@Entity
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlRootElement
	@XmlType(name = "", propOrder = { "id", "schmeNm" })
	public static class Othr {

		@XmlElement(name = "Id", required = true)
		protected String id;
		@XmlElement(name = "SchmeNm", required = true)
		@OneToOne(cascade = { CascadeType.PERSIST })
		protected PrvtId.Othr.SchmeNm schmeNm;

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
		public PrvtId.Othr.SchmeNm getSchmeNm() {
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
		public void setSchmeNm(PrvtId.Othr.SchmeNm value) {
			this.schmeNm = value;
		}

		@Entity
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
