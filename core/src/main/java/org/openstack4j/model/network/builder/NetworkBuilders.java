package org.openstack4j.model.network.builder;

import org.openstack4j.model.network.ext.builder.FirewallBuilder;
import org.openstack4j.model.network.ext.builder.FirewallPolicyBuilder;
import org.openstack4j.model.network.ext.builder.FirewallPolicyUpdateBuilder;
import org.openstack4j.model.network.ext.builder.FirewallRuleBuilder;
import org.openstack4j.model.network.ext.builder.FirewallRuleUpdateBuilder;
import org.openstack4j.model.network.ext.builder.FirewallUpdateBuilder;
import org.openstack4j.model.network.ext.builder.HealthMonitorAssociateBuilder;
import org.openstack4j.model.network.ext.builder.HealthMonitorBuilder;
import org.openstack4j.model.network.ext.builder.HealthMonitorUpdateBuilder;
import org.openstack4j.model.network.ext.builder.HealthMonitorV2Builder;
import org.openstack4j.model.network.ext.builder.HealthMonitorV2UpdateBuilder;
import org.openstack4j.model.network.ext.builder.LbPoolBuilder;
import org.openstack4j.model.network.ext.builder.LbPoolUpdateBuilder;
import org.openstack4j.model.network.ext.builder.LbPoolV2Builder;
import org.openstack4j.model.network.ext.builder.LbPoolV2UpdateBuilder;
import org.openstack4j.model.network.ext.builder.ListenerV2Builder;
import org.openstack4j.model.network.ext.builder.ListenerV2UpdateBuilder;
import org.openstack4j.model.network.ext.builder.LoadBalancerV2Builder;
import org.openstack4j.model.network.ext.builder.LoadBalancerV2UpdateBuilder;
import org.openstack4j.model.network.ext.builder.MemberBuilder;
import org.openstack4j.model.network.ext.builder.MemberUpdateBuilder;
import org.openstack4j.model.network.ext.builder.MemberV2Builder;
import org.openstack4j.model.network.ext.builder.MemberV2UpdateBuilder;
import org.openstack4j.model.network.ext.builder.NetworkIPAvailabilityBuilder;
import org.openstack4j.model.network.ext.builder.SessionPersistenceBuilder;
import org.openstack4j.model.network.ext.builder.VipBuilder;
import org.openstack4j.model.network.ext.builder.VipUpdateBuilder;
import org.openstack4j.model.network.qos.builder.NetQosBandwidthLimitRuleBuilder;
import org.openstack4j.model.network.qos.builder.NetQosDscpMarkingRuleBuilder;
import org.openstack4j.model.network.qos.builder.NetQosMinimumBandwidthRuleBuilder;
import org.openstack4j.model.network.qos.builder.NetQosPolicyBuilder;

/**
 * The Network builders
 */
public interface NetworkBuilders {

    /**
     * The builder to create a Network
     *
     * @return the network builder
     */
    public NetworkBuilder network();

    /**
     * The builder to update a network
     *
     * @return the NetworkUpdateBuilder
     */
    public NetworkUpdateBuilder networkUpdate();

    public ExtraDhcpOptBuilder extraDhcpOpt();

    /**
     * The builder to create a Subnet
     *
     * @return the subnet builder
     */
    public SubnetBuilder subnet();

    /**
     * The builder to create a Port
     *
     * @return the port builder
     */
    public PortBuilder port();

    /**
     * The builder to create a Router
     *
     * @return the router builder
     */
    public RouterBuilder router();

    /**
     * The builder to create a Neutron Security Group
     *
     * @return the security group builder
     */
    public NetSecurityGroupBuilder securityGroup();

    /**
     * The builder to create a Neutron Security Group Rule
     *
     * @return the security group builder
     */
    public NetSecurityGroupRuleBuilder securityGroupRule();

    /**
     * The builder to create a Neutron Floating IP Address
     *
     * @return the floating ip builder
     */
    public NetFloatingIPBuilder netFloatingIP();

    /**
     * The builder to create a Neutron QoS Policy
     *
     * @return the QoS Policy builder
     */
    public NetQosPolicyBuilder netQosPolicy();

    /**
     * The builder to create a Neutron QoS Bandwidth Limit Rule
     *
     * @return the QoS Policy builder
     */
    public NetQosBandwidthLimitRuleBuilder netQosBandwidthLimitRule();

    /**
     * The builder to create a Neutron QoS DSCP Marking Rule
     *
     * @return the QoS Policy builder
     */
    public NetQosDscpMarkingRuleBuilder netQosDscpMarkingRule();

    /**
     * The builder to create a Neutron QoS Minimum Bandwidth Rule
     *
     * @return the QoS Policy builder
     */
    public NetQosMinimumBandwidthRuleBuilder netQosMinimumBandwidthRule();

    /**
     * The builder to create NetQuota entities
     *
     * @return the NetQuota builder
     */
    public NetQuotaBuilder netQuota();

    /**
     * The builder to create a lb member
     *
     * @return the Member Builder
     */
    public MemberBuilder member();

    /**
     * The builder to update a lb member
     *
     * @return the MemberUpdate Builder
     */
    public MemberUpdateBuilder memberUpdate();

    /**
     * The builder to create and update a sessionPersistence
     *
     * @return SessionPersistenceBuilder
     */
    public SessionPersistenceBuilder sessionPersistence();

    /**
     * The builder to create a vip.
     *
     * @return VipBuilder the vip builder
     */
    public VipBuilder vip();

    /**
     * The builder to update a vip.
     *
     * @return VipUpdateBuilder
     */
    public VipUpdateBuilder vipUpdate();

    /**
     * The builder to create a healthMonitor
     *
     * @return HealthMonitorBuilder
     */
    public HealthMonitorBuilder healthMonitor();

    /**
     * The builder to update a healthMonitor
     *
     * @return HealthMonitorUpdateBuilder
     */
    public HealthMonitorUpdateBuilder healthMonitorUpdate();

    /**
     * The builder to create a firewall
     *
     * @return FirewallBuilder
     */
    public FirewallBuilder firewall();

    /**
     * The builder to update a healthMonitor
     *
     * @return FirewallUpdateBuilder
     */
    public FirewallUpdateBuilder firewallUpdate();

    /**
     * The builder to create a firewallRule
     *
     * @return FirewallRuleBuilder
     */
    public FirewallRuleBuilder firewallRule();

    /**
     * The builder to update a firewallRule
     *
     * @return FirewallUpdateBuilder
     */
    public FirewallRuleUpdateBuilder firewallRuleUpdate();

    /**
     * The builder to create a firewallPolicy
     *
     * @return FirewallPolicyBuilder
     */
    public FirewallPolicyBuilder firewallPolicy();

    /**
     * The builder to update a firewallPolicy
     *
     * @return FirewallPolicyUpdateBuilder
     */
    public FirewallPolicyUpdateBuilder firewallPolicyUpdate();

    /**
     * The builder to create a lbPool
     *
     * @return LbPoolBuilder
     */
    public LbPoolBuilder lbPool();

    /**
     * The builder to update a lbPool
     *
     * @return LbPoolUpdateBuilder
     */
    public LbPoolUpdateBuilder lbPoolUpdate();

    /**
     * The builder to create a lbPool
     *
     * @return HealthMonitorAssociateBuilder
     */
    public HealthMonitorAssociateBuilder lbPoolAssociateHealthMonitor();

    /**
     * The builder to create a lb v2 member
     *
     * @return the Member Builder v2
     */
    public MemberV2Builder memberV2();

    /**
     * The builder to update a lbaas v2 member
     *
     * @return MemberV2UpdateBuilder
     */
    public MemberV2UpdateBuilder memberV2Update();

    /**
     * The builder to create a v2 loadbalancer.
     *
     * @return LoadBalancerV2Builder the loadbalancer v2 builder
     */
    public LoadBalancerV2Builder lbV2();

    /**
     * The builder to update a lbaas v2 loadbalancer
     *
     * @return LoadBalancerV2UpdateBuilder
     */
    public LoadBalancerV2UpdateBuilder loadBalancerV2Update();

    /**
     * The builder to create a v2 lbPool
     *
     * @return LbPoolV2Builder
     */
    public LbPoolV2Builder lbPoolV2();

    /**
     * The builder to update a lbaas v2 lbPool
     *
     * @return LbPoolV2UpdateBuilder
     */
    public LbPoolV2UpdateBuilder lbPoolV2Update();

    /**
     * The builder to createa v2 lbaas listener
     * @return ListenerV2Builder
     */
    public ListenerV2Builder listenerV2();

    /**
     * The builder to update a lbaas v2 lbaas listener
     *
     * @return ListenerV2UpdateBuilder
     */
    public ListenerV2UpdateBuilder listenerV2Update();

    /**
     * The builder to create a v2 healthMonitor
     *
     * @return HealthMonitorV2Builder
     */
    public HealthMonitorV2Builder healthMonitorV2();

    /**
     * The builder to update a lbaas v2 health monitor
     *
     * @return HealthMonitorV2UpdateBuilder
     */
    public HealthMonitorV2UpdateBuilder healthMonitorV2Update();

    /**
     * The builder to create a network IP availability entity
     *
     * @return the NetworkIPAvailability builder
     */
    public NetworkIPAvailabilityBuilder networkIPAvailability();
}
