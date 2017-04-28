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
@XmlType(name = "", propOrder = { "pmtId", "instdAmt", "drctDbtTx", "dbtrAgt", "dbtr", "dbtrAcct", "rmtInf" })
@XmlAccessorType(XmlAccessType.FIELD)
public class DrctDbtTxInf implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@XmlTransient
	private long id;

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
