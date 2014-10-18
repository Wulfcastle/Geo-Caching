/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package geoCaching;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Shimal
 */
@Entity
@Table(name = "GEOCACHERSTBL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Geocacherstbl.findAll", query = "SELECT g FROM Geocacherstbl g"),
    @NamedQuery(name = "Geocacherstbl.findByCacherid", query = "SELECT g FROM Geocacherstbl g WHERE g.cacherid = :cacherid"),
    @NamedQuery(name = "Geocacherstbl.findByCacherdob", query = "SELECT g FROM Geocacherstbl g WHERE g.cacherdob = :cacherdob"),
    @NamedQuery(name = "Geocacherstbl.findByCacherusername", query = "SELECT g FROM Geocacherstbl g WHERE g.cacherusername = :cacherusername"),
    @NamedQuery(name = "Geocacherstbl.findByCacherpassword", query = "SELECT g FROM Geocacherstbl g WHERE g.cacherpassword = :cacherpassword"),
    @NamedQuery(name = "Geocacherstbl.findByCachercountry", query = "SELECT g FROM Geocacherstbl g WHERE g.cachercountry = :cachercountry"),
    @NamedQuery(name = "Geocacherstbl.findByCachercity", query = "SELECT g FROM Geocacherstbl g WHERE g.cachercity = :cachercity"),
    @NamedQuery(name = "Geocacherstbl.findByCacherarea", query = "SELECT g FROM Geocacherstbl g WHERE g.cacherarea = :cacherarea"),
    @NamedQuery(name = "Geocacherstbl.findByCachergender", query = "SELECT g FROM Geocacherstbl g WHERE g.cachergender = :cachergender"),
    @NamedQuery(name = "Geocacherstbl.findByCacherrank", query = "SELECT g FROM Geocacherstbl g WHERE g.cacherrank = :cacherrank")})
public class Geocacherstbl implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CACHERID")
    private String cacherid;
    @Basic(optional = false)
    @Column(name = "CACHERDOB")
    @Temporal(TemporalType.DATE)
    private Date cacherdob;
    @Basic(optional = false)
    @Column(name = "CACHERUSERNAME")
    private String cacherusername;
    @Basic(optional = false)
    @Column(name = "CACHERPASSWORD")
    private String cacherpassword;
    @Basic(optional = false)
    @Column(name = "CACHERCOUNTRY")
    private String cachercountry;
    @Basic(optional = false)
    @Column(name = "CACHERCITY")
    private String cachercity;
    @Basic(optional = false)
    @Column(name = "CACHERAREA")
    private String cacherarea;
    @Basic(optional = false)
    @Column(name = "CACHERGENDER")
    private String cachergender;
    @Column(name = "CACHERRANK")
    private Integer cacherrank;

    public Geocacherstbl() {
    }

    public Geocacherstbl(String cacherid) {
        this.cacherid = cacherid;
    }

    public Geocacherstbl(String cacherid, Date cacherdob, String cacherusername, String cacherpassword, String cachercountry, String cachercity, String cacherarea, String cachergender) {
        this.cacherid = cacherid;
        this.cacherdob = cacherdob;
        this.cacherusername = cacherusername;
        this.cacherpassword = cacherpassword;
        this.cachercountry = cachercountry;
        this.cachercity = cachercity;
        this.cacherarea = cacherarea;
        this.cachergender = cachergender;
    }

    public String getCacherid() {
        return cacherid;
    }

    public void setCacherid(String cacherid) {
        this.cacherid = cacherid;
    }

    public Date getCacherdob() {
        return cacherdob;
    }

    public void setCacherdob(Date cacherdob) {
        this.cacherdob = cacherdob;
    }

    public String getCacherusername() {
        return cacherusername;
    }

    public void setCacherusername(String cacherusername) {
        this.cacherusername = cacherusername;
    }

    public String getCacherpassword() {
        return cacherpassword;
    }

    public void setCacherpassword(String cacherpassword) {
        this.cacherpassword = cacherpassword;
    }

    public String getCachercountry() {
        return cachercountry;
    }

    public void setCachercountry(String cachercountry) {
        this.cachercountry = cachercountry;
    }

    public String getCachercity() {
        return cachercity;
    }

    public void setCachercity(String cachercity) {
        this.cachercity = cachercity;
    }

    public String getCacherarea() {
        return cacherarea;
    }

    public void setCacherarea(String cacherarea) {
        this.cacherarea = cacherarea;
    }

    public String getCachergender() {
        return cachergender;
    }

    public void setCachergender(String cachergender) {
        this.cachergender = cachergender;
    }

    public Integer getCacherrank() {
        return cacherrank;
    }

    public void setCacherrank(Integer cacherrank) {
        this.cacherrank = cacherrank;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cacherid != null ? cacherid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Geocacherstbl)) {
            return false;
        }
        Geocacherstbl other = (Geocacherstbl) object;
        if ((this.cacherid == null && other.cacherid != null) || (this.cacherid != null && !this.cacherid.equals(other.cacherid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "geoCaching.Geocacherstbl[ cacherid=" + cacherid + " ]";
    }
    
}
