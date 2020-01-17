package org.openstack4j.model.network.qos;

import org.openstack4j.model.ModelEntity;

import java.util.List;

/**
 * A Network (Neutron) QoS Rule Drivers
 *
 * @author Guoshuai Li
 */
public interface NetQosRuleDrivers extends ModelEntity {

    /**
     * @return The type of QoS rule.
     */
    String getType();

    /**
     * @return List of loaded QoS drivers with supported rule type parameters with possible values for each.
     */
    List<? extends NetQosRuleDriver> getDrivers();
}
