package com.inherente.dummy.dto;

import com.inherente.dummy.dto.util.ElementListener;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by luis.gutierrez.ext on 14/09/2016.
 */
@EntityListeners(ElementListener.class)
@Entity
@Table(name = "NOTHING_ELEMENT", schema = "LOCAL_NOTHING_ADM", catalog = "")
public class NothingElementEntity {
    private byte elementId;
    private String description;
    private String lastUpdtBy;
    private Time lastUpdDt;

    @Id
    @Column(name = "ELEMENT_ID")
    public byte getElementId() {
        return elementId;
    }

    public void setElementId(byte elementId) {
        this.elementId = elementId;
    }

    @Basic
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "LAST_UPDT_BY")
    public String getLastUpdtBy() {
        return lastUpdtBy;
    }

    public void setLastUpdtBy(String lastUpdtBy) {
        this.lastUpdtBy = lastUpdtBy;
    }

    @Basic
    @Column(name = "LAST_UPD_DT")
    public Time getLastUpdDt() {
        return lastUpdDt;
    }

    public void setLastUpdDt(Time lastUpdDt) {
        this.lastUpdDt = lastUpdDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NothingElementEntity that = (NothingElementEntity) o;

        if (elementId != that.elementId) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (lastUpdtBy != null ? !lastUpdtBy.equals(that.lastUpdtBy) : that.lastUpdtBy != null) return false;
        if (lastUpdDt != null ? !lastUpdDt.equals(that.lastUpdDt) : that.lastUpdDt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) elementId;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (lastUpdtBy != null ? lastUpdtBy.hashCode() : 0);
        result = 31 * result + (lastUpdDt != null ? lastUpdDt.hashCode() : 0);
        return result;
    }

    public static NothingElementEntity getDummyElement(String description){
        NothingElementEntity nee= new NothingElementEntity();
        nee.setDescription(description);
        nee.setLastUpdDt(new Time(System.currentTimeMillis()));
        nee.setLastUpdtBy("me");
        return nee;
    }
}
