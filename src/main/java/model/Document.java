package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@Entity
@XmlRootElement(name = "Document")
@XmlType(propOrder = { "drctDbtTxInf" })
@XmlAccessorType(XmlAccessType.FIELD)

public class Document {

	@XmlElement(name = "DrctDbtTxInf", required = true)
	@OneToMany(cascade = {CascadeType.PERSIST})
	protected List<Document.DrctDbtTxInf> drctDbtTxInf;


	public List<Document.DrctDbtTxInf> getDrctDbtTxInf() {
		if (drctDbtTxInf == null) {
			drctDbtTxInf = new ArrayList<Document.DrctDbtTxInf>();
		}
		return this.drctDbtTxInf;
	}

	@XmlRootElement
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "pmtId", "instdAmt", "drctDbtTx", "dbtrAgt", "dbtr", "dbtrAcct", "rmtInf" })
	public static class DrctDbtTxInf {

		@XmlElement(name = "PmtId", required = true)
		protected String pmtId;
		@XmlElement(name = "InstdAmt", required = true)
		@OneToOne(cascade = { CascadeType.PERSIST })
		protected Amount instdAmt;
		@XmlElement(name = "DrctDbtTx", required = true)
		@OneToOne(cascade = { CascadeType.PERSIST })
		protected CmpsdTx drctDbtTx;
		@XmlElement(name = "DbtrAgt", required = true)
		@OneToOne(cascade = { CascadeType.PERSIST })
		protected CmpsdAgt dbtrAgt;
		@XmlElement(name = "Dbtr", required = true)
		@OneToOne(cascade = { CascadeType.PERSIST })
		protected CmpsdNmd dbtr;
		@XmlElement(name = "DbtrAcct", required = true)
		@OneToOne(cascade = { CascadeType.PERSIST })
		protected CmpsdIdt dbtrAcct;
		@XmlElement(name = "RmtInf")
		protected String rmtInf;

		/**
		 * Obtient la valeur de la propriété pmtId.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPmtId() {
			return pmtId;
		}

		/**
		 * Définit la valeur de la propriété pmtId.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setPmtId(String value) {
			this.pmtId = value;
		}

		/**
		 * Obtient la valeur de la propriété instdAmt.
		 * 
		 * @return possible object is {@link Amount }
		 * 
		 */
		public Amount getInstdAmt() {
			return instdAmt;
		}

		/**
		 * Définit la valeur de la propriété instdAmt.
		 * 
		 * @param value
		 *            allowed object is {@link Amount }
		 * 
		 */
		public void setInstdAmt(Amount value) {
			this.instdAmt = value;
		}

		/**
		 * Obtient la valeur de la propriété drctDbtTx.
		 * 
		 * @return possible object is {@link CmpsdTx }
		 * 
		 */
		public CmpsdTx getDrctDbtTx() {
			return drctDbtTx;
		}

		/**
		 * Définit la valeur de la propriété drctDbtTx.
		 * 
		 * @param value
		 *            allowed object is {@link CmpsdTx }
		 * 
		 */
		public void setDrctDbtTx(CmpsdTx value) {
			this.drctDbtTx = value;
		}

		/**
		 * Obtient la valeur de la propriété dbtrAgt.
		 * 
		 * @return possible object is {@link CmpsdAgt }
		 * 
		 */
		public CmpsdAgt getDbtrAgt() {
			return dbtrAgt;
		}

		/**
		 * Définit la valeur de la propriété dbtrAgt.
		 * 
		 * @param value
		 *            allowed object is {@link CmpsdAgt }
		 * 
		 */
		public void setDbtrAgt(CmpsdAgt value) {
			this.dbtrAgt = value;
		}

		/**
		 * Obtient la valeur de la propriété dbtr.
		 * 
		 * @return possible object is {@link CmpsdNmd }
		 * 
		 */
		public CmpsdNmd getDbtr() {
			return dbtr;
		}

		/**
		 * Définit la valeur de la propriété dbtr.
		 * 
		 * @param value
		 *            allowed object is {@link CmpsdNmd }
		 * 
		 */
		public void setDbtr(CmpsdNmd value) {
			this.dbtr = value;
		}

		/**
		 * Obtient la valeur de la propriété dbtrAcct.
		 * 
		 * @return possible object is {@link CmpsdIdt }
		 * 
		 */
		public CmpsdIdt getDbtrAcct() {
			return dbtrAcct;
		}

		/**
		 * Définit la valeur de la propriété dbtrAcct.
		 * 
		 * @param value
		 *            allowed object is {@link CmpsdIdt }
		 * 
		 */
		public void setDbtrAcct(CmpsdIdt value) {
			this.dbtrAcct = value;
		}

		/**
		 * Obtient la valeur de la propriété rmtInf.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRmtInf() {
			return rmtInf;
		}

		/**
		 * Définit la valeur de la propriété rmtInf.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRmtInf(String value) {
			this.rmtInf = value;
		}

	}

}
