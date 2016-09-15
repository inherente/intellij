package com.inherente.dummy.dto;

import javax.persistence.*;

/**
 * Created by luis.gutierrez.ext on 13/09/2016.
 */
@Entity
@Table(name = "GPON_SUBSCRIBER", schema = "DEV_GPON_ADM", catalog = "")
public class GponSubscriberEntity {
    private byte subscriberId;
    private String clientId;
    private String description;
    private String address;

    @Id
    @Column(name = "SUBSCRIBER_ID")
    public byte getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(byte subscriberId) {
        this.subscriberId = subscriberId;
    }

    @Basic
    @Column(name = "CLIENT_ID")
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
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
    @Column(name = "ADDRESS")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GponSubscriberEntity that = (GponSubscriberEntity) o;

        if (subscriberId != that.subscriberId) return false;
        if (clientId != null ? !clientId.equals(that.clientId) : that.clientId != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) subscriberId;
        result = 31 * result + (clientId != null ? clientId.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}
