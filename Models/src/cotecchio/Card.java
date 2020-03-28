package cotecchio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Card implements Serializable {
	public float x;
	public float y;
	public float k;
	public float c;
	public float pn;

	public Card(float x, float y, float k, float c, float pn) {
		this.x = x;
		this.y = y;
		this.k = k;
		this.c = c;
		this.pn = pn;
	}
}
