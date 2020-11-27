package org.openstack4j.openstack.networking.domain;

import com.google.common.base.MoreObjects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.openstack4j.model.network.ExternalGateway;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Neutron external gateway.
 */
public class NeutronExternalGateway implements ExternalGateway {

	private static final long serialVersionUID = 1L;

	@JsonProperty("network_id")
	private String networkId;

	@JsonProperty("enable_snat")
	private Boolean enableSnat;

    @JsonProperty("external_fixed_ips")
    private List<ExternalFixedIp> externalFixedIps;

    /**
     * Instantiates a new Neutron external gateway.
     */
    public NeutronExternalGateway() {
    }

    /**
     * Instantiates a new Neutron external gateway.
     *
     * @param networkId the network id
     */
    public NeutronExternalGateway(String networkId) {
        this(networkId, Boolean.TRUE, new ArrayList<ExternalFixedIp>());
    }

    /**
     * Instantiates a new Neutron external gateway.
     *
     * @param networkId        the network id
     * @param enableSnat       the enable snat
     * @param externalFixedIps the external fixed ips
     */
    public NeutronExternalGateway(String networkId, Boolean enableSnat, List<ExternalFixedIp> externalFixedIps) {
        this.networkId = networkId;
        this.enableSnat = enableSnat;
        this.externalFixedIps = externalFixedIps;
    }

    /**
     * Instantiates a new Neutron external gateway.
     *
     * @param networkId  the network id
     * @param enableSnat the enable snat
     */
    public NeutronExternalGateway(String networkId, Boolean enableSnat) {
        this(networkId, enableSnat, new ArrayList<ExternalFixedIp>());
    }

    /**
     * Instantiates a new Neutron external gateway.
     *
     * @param networkId        the network id
     * @param externalFixedIps the external fixed ips
     */
    public NeutronExternalGateway(String networkId, List<ExternalFixedIp> externalFixedIps) {
        this(networkId, Boolean.TRUE, externalFixedIps);
    }

    @Override
    public String getNetworkId() {
        return this.networkId;
    }

    @Override
    @JsonIgnore
    public boolean isEnableSnat() {
        return this.enableSnat != null && this.enableSnat;
    }

    /**
     * Gets external fixed ips.
     *
     * @return the external fixed ips
     */
    public List<ExternalFixedIp> getExternalFixedIps() {
        return this.externalFixedIps;
    }

    /**
     * Sets external fixed ips.
     *
     * @param externalFixedIps the external fixed ips
     */
    public void setExternalFixedIps(List<ExternalFixedIp> externalFixedIps) {
        this.externalFixedIps = externalFixedIps;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).omitNullValues().add("networkId", this.networkId)
                .add("enable_snat", this.enableSnat).toString();
    }
}
