
package com.anneke.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "test", namespace = "http://anneke.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "test", namespace = "http://anneke.com/", propOrder = {
    "name1",
    "name2"
})
public class Test {

    @XmlElement(name = "name1", namespace = "")
    private String name1;
    @XmlElement(name = "name2", namespace = "")
    private String name2;

    /**
     * 
     * @return
     *     returns String
     */
    public String getName1() {
        return this.name1;
    }

    /**
     * 
     * @param name1
     *     the value for the name1 property
     */
    public void setName1(String name1) {
        this.name1 = name1;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getName2() {
        return this.name2;
    }

    /**
     * 
     * @param name2
     *     the value for the name2 property
     */
    public void setName2(String name2) {
        this.name2 = name2;
    }

}
