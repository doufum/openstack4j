package org.openstack4j.openstack.networking.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;

import org.openstack4j.model.network.IP;

import java.util.Objects;

/**
 * A Fixed IP Address
 *
 * @author Jeremy Unruh
 */
public class NeutronIP implements IP {

    private static final long serialVersionUID = 1L;

    @JsonProperty("ip_address")
    private String ipAddress;

    @JsonProperty("subnet_id")
    private String subnetId;

    public NeutronIP() {
    }

    public NeutronIP(String address, String subnetId) {
        this.ipAddress = address;
        this.subnetId = subnetId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .omitNullValues()
                          .add("ipAddress", ipAddress)
                          .add("subnetId", subnetId)
                          .toString();
    }

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		NeutronIP neutronIP = (NeutronIP) o;
		return Objects.equals(ipAddress, neutronIP.ipAddress) &&
				Objects.equals(subnetId, neutronIP.subnetId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ipAddress, subnetId);
	}
}
