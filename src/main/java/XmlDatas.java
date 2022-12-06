
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;
@XmlRootElement(name="Characters")
public class XmlDatas {
        List<XmlData> xmlDatas = new ArrayList<>();

    public List<XmlData> getXmlDatas() {
        return xmlDatas;
    }

    @XmlElement(name="Character")
    public void setXmlDatas(List<XmlData> xmlDatas) {
        this.xmlDatas = xmlDatas;
    }

    public void addXmlDatas(XmlData xmldata){
        this.xmlDatas.add(xmldata);
    }
}
