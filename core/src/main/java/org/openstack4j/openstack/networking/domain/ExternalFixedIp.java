package org.openstack4j.openstack.networking.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type External fixed ip.
 */
public class ExternalFixedIp {

    @JsonProperty("ip_address")
    private String ipAddress;

    @JsonProperty("subnet_id")
    private String subnetId;

    /**
     * Instantiates a new External fixed ip.
     */
    public ExternalFixedIp() {
    }

    /**
     * Instantiates a new External fixed ip.
     *
     * @param ipAddress the ip address
     */
    public ExternalFixedIp(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * Instantiates a new External fixed ip.
     *
     * @param ipAddress the ip address
     * @param subnetId  the subnet id
     */
    public ExternalFixedIp(String ipAddress, String subnetId) {
        this.ipAddress = ipAddress;
        this.subnetId = subnetId;
    }

    /**
     * Gets ip address.
     *
     * @return the ip address
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets ip address.
     *
     * @param ipAddress the ip address
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * Gets subnet id.
     *
     * @return the subnet id
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * Sets subnet id.
     *
     * @param subnetId the subnet id
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
}


