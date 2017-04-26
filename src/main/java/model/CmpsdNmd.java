package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "CmpsdNmd", propOrder = { "nm" })
public class CmpsdNmd {

	@XmlElement(name = "NM", required = true)
	protected String nm;

	/**
	 * Obtient la valeur de la propriété nm.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNM() {
		return nm;
	}

	/**
	 * Définit la valeur de la propriété nm.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNM(String value) {
		this.nm = value;
	}

}
