/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package geoCaching;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Shimal
 */
@Entity
@Table(name = "CACHINGOBJECTTBL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cachingobjecttbl.findAll", query = "SELECT c FROM Cachingobjecttbl c"),
    @NamedQuery(name = "Cachingobjecttbl.findByObjid", query = "SELECT c FROM Cachingobjecttbl c WHERE c.objid = :objid"),
    @NamedQuery(name = "Cachingobjecttbl.findByObjlatitude", query = "SELECT c FROM Cachingobjecttbl c WHERE c.objlatitude = :objlatitude"),
    @NamedQuery(name = "Cachingobjecttbl.findByObjlongitude", query = "SELECT c FROM Cachingobjecttbl c WHERE c.objlongitude = :objlongitude"),
    @NamedQuery(name = "Cachingobjecttbl.findByObjcountry", query = "SELECT c FROM Cachingobjecttbl c WHERE c.objcountry = :objcountry"),
    @NamedQuery(name = "Cachingobjecttbl.findByObjcity", query = "SELECT c FROM Cachingobjecttbl c WHERE c.objcity = :objcity"),
    @NamedQuery(name = "Cachingobjecttbl.findByObjarea", query = "SELECT c FROM Cachingobjecttbl c WHERE c.objarea = :objarea"),
    @NamedQuery(name = "Cachingobjecttbl.findByObjdescription", query = "SELECT c FROM Cachingobjecttbl c WHERE c.objdescription = :objdescription")})
public class Cachingobjecttbl implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "OBJID")
    private String objid;
    @Column(name = "OBJLATITUDE")
    private String objlatitude;
    @Column(name = "OBJLONGITUDE")
    private String objlongitude;
    @Basic(optional = false)
    @Column(name = "OBJCOUNTRY")
    private String objcountry;
    @Basic(optional = false)
    @Column(name = "OBJCITY")
    private String objcity;
    @Basic(optional = false)
    @Column(name = "OBJAREA")
    private String objarea;
    @Basic(optional = false)
    @Column(name = "OBJDESCRIPTION")
    private String objdescription;

    public Cachingobjecttbl() {
    }

    public Cachingobjecttbl(String objid) {
        this.objid = objid;
    }

    public Cachingobjecttbl(String objid, String objcountry, String objcity, String objarea, String objdescription) {
        this.objid = objid;
        this.objcountry = objcountry;
        this.objcity = objcity;
        this.objarea = objarea;
        this.objdescription = objdescription;
    }

    public String getObjid() {
        return objid;
    }

    public void setObjid(String objid) {
        this.objid = objid;
    }

    public String getObjlatitude() {
        return objlatitude;
    }

    public void setObjlatitude(String objlatitude) {
        this.objlatitude = objlatitude;
    }

    public String getObjlongitude() {
        return objlongitude;
    }

    public void setObjlongitude(String objlongitude) {
        this.objlongitude = objlongitude;
    }

    public String getObjcountry() {
        return objcountry;
    }

    public void setObjcountry(String objcountry) {
        this.objcountry = objcountry;
    }

    public String getObjcity() {
        return objcity;
    }

    public void setObjcity(String objcity) {
        this.objcity = objcity;
    }

    public String getObjarea() {
        return objarea;
    }

    public void setObjarea(String objarea) {
        this.objarea = objarea;
    }

    public String getObjdescription() {
        return objdescription;
    }

    public void setObjdescription(String objdescription) {
        this.objdescription = objdescription;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (objid != null ? objid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cachingobjecttbl)) {
            return false;
        }
        Cachingobjecttbl other = (Cachingobjecttbl) object;
        if ((this.objid == null && other.objid != null) || (this.objid != null && !this.objid.equals(other.objid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "geoCaching.Cachingobjecttbl[ objid=" + objid + " ]";
    }
    
}
