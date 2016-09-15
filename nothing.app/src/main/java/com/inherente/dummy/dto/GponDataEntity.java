package com.inherente.dummy.dto;

import javax.persistence.*;

/**
 * Created by luis.gutierrez.ext on 13/09/2016.
 */
@Entity
@Table(name = "GPON_DATA", schema = "DEV_GPON_ADM", catalog = "")
public class GponDataEntity {
    private byte dataId;
    private Byte upstreamBandwidth;
    private byte downstreamBandwidth;
    private Byte wifiActivated;
    private Byte ethActivated;
    private byte active;
    private GponOntEntity gponOntByOntId;

    @Id
    @Column(name = "DATA_ID")
    public byte getDataId() {
        return dataId;
    }

    public void setDataId(byte dataId) {
        this.dataId = dataId;
    }

    @Basic
    @Column(name = "UPSTREAM_BANDWIDTH")
    public Byte getUpstreamBandwidth() {
        return upstreamBandwidth;
    }

    public void setUpstreamBandwidth(Byte upstreamBandwidth) {
        this.upstreamBandwidth = upstreamBandwidth;
    }

    @Basic
    @Column(name = "DOWNSTREAM_BANDWIDTH")
    public byte getDownstreamBandwidth() {
        return downstreamBandwidth;
    }

    public void setDownstreamBandwidth(byte downstreamBandwidth) {
        this.downstreamBandwidth = downstreamBandwidth;
    }

    @Basic
    @Column(name = "WIFI_ACTIVATED")
    public Byte getWifiActivated() {
        return wifiActivated;
    }

    public void setWifiActivated(Byte wifiActivated) {
        this.wifiActivated = wifiActivated;
    }

    @Basic
    @Column(name = "ETH_ACTIVATED")
    public Byte getEthActivated() {
        return ethActivated;
    }

    public void setEthActivated(Byte ethActivated) {
        this.ethActivated = ethActivated;
    }

    @Basic
    @Column(name = "ACTIVE")
    public byte getActive() {
        return active;
    }

    public void setActive(byte active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GponDataEntity that = (GponDataEntity) o;

        if (dataId != that.dataId) return false;
        if (downstreamBandwidth != that.downstreamBandwidth) return false;
        if (active != that.active) return false;
        if (upstreamBandwidth != null ? !upstreamBandwidth.equals(that.upstreamBandwidth) : that.upstreamBandwidth != null)
            return false;
        if (wifiActivated != null ? !wifiActivated.equals(that.wifiActivated) : that.wifiActivated != null)
            return false;
        if (ethActivated != null ? !ethActivated.equals(that.ethActivated) : that.ethActivated != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) dataId;
        result = 31 * result + (upstreamBandwidth != null ? upstreamBandwidth.hashCode() : 0);
        result = 31 * result + (int) downstreamBandwidth;
        result = 31 * result + (wifiActivated != null ? wifiActivated.hashCode() : 0);
        result = 31 * result + (ethActivated != null ? ethActivated.hashCode() : 0);
        result = 31 * result + (int) active;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ONT_ID", referencedColumnName = "ONT_ID", nullable = false)
    public GponOntEntity getGponOntByOntId() {
        return gponOntByOntId;
    }

    public void setGponOntByOntId(GponOntEntity gponOntByOntId) {
        this.gponOntByOntId = gponOntByOntId;
    }
}
