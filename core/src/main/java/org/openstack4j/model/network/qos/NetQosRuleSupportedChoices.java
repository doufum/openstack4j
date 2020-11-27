package org.openstack4j.model.network.qos;

import org.openstack4j.model.ModelEntity;

import java.util.List;

/**
 * A Network (Neutron) QoS Rule Driver Supported for Choices
 *
 * @author Guoshuai Li
 */
public interface NetQosRuleSupportedChoices extends ModelEntity, NetQosRuleSupported {

    /**
     * @return The valid values for parameter values.
     */
    List<String> getParameterValues();

    /**
     * @return The valid values for parameter type.
     */
    String getParameterType();
}
