package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@Entity
@XmlRootElement(name = "Document")
@XmlType(propOrder = { "drctDbtTxInf" })
@XmlAccessorType(XmlAccessType.FIELD)

public class Document implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@XmlTransient
	private long id;

	@XmlElement(name = "DrctDbtTxInf", required = true)
	@OneToMany(cascade = { CascadeType.PERSIST })
	protected List<DrctDbtTxInf> drctDbtTxInf;

	public Document( List<DrctDbtTxInf> drctDbtTxInf) {
		super();
		this.drctDbtTxInf = drctDbtTxInf;
	}

	
	

	public void setDrctDbtTxInf(List<DrctDbtTxInf> drctDbtTxInf) {
		this.drctDbtTxInf = drctDbtTxInf;
	}

	public List<DrctDbtTxInf> getDrctDbtTxInf() {
		if (drctDbtTxInf == null) {
			drctDbtTxInf = new ArrayList<DrctDbtTxInf>();
		}
		return this.drctDbtTxInf;
	}

	@Override
	public String toString() {
		return "Document [ drctDbtTxInf=" + drctDbtTxInf + "]";
	}

}
