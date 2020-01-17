package org.openstack4j.openstack.networking.builder;

import org.openstack4j.model.network.builder.ExtraDhcpOptBuilder;
import org.openstack4j.model.network.builder.NetFloatingIPBuilder;
import org.openstack4j.model.network.builder.NetQuotaBuilder;
import org.openstack4j.model.network.builder.NetSecurityGroupBuilder;
import org.openstack4j.model.network.builder.NetSecurityGroupRuleBuilder;
import org.openstack4j.model.network.builder.NetworkBuilder;
import org.openstack4j.model.network.builder.NetworkBuilders;
import org.openstack4j.model.network.builder.NetworkUpdateBuilder;
import org.openstack4j.model.network.builder.PortBuilder;
import org.openstack4j.model.network.builder.RouterBuilder;
import org.openstack4j.model.network.builder.SubnetBuilder;
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
import org.openstack4j.model.network.ext.builder.SessionPersistenceBuilder;
import org.openstack4j.model.network.ext.builder.VipBuilder;
import org.openstack4j.model.network.ext.builder.VipUpdateBuilder;
import org.openstack4j.model.network.qos.builder.NetQosBandwidthLimitRuleBuilder;
import org.openstack4j.model.network.qos.builder.NetQosDscpMarkingRuleBuilder;
import org.openstack4j.model.network.qos.builder.NetQosMinimumBandwidthRuleBuilder;
import org.openstack4j.model.network.qos.builder.NetQosPolicyBuilder;
import org.openstack4j.openstack.networking.domain.NeutronExtraDhcpOptCreate;
import org.openstack4j.openstack.networking.domain.NeutronFloatingIP;
import org.openstack4j.openstack.networking.domain.NeutronNetQuota;
import org.openstack4j.openstack.networking.domain.NeutronNetwork;
import org.openstack4j.openstack.networking.domain.NeutronNetworkUpdate;
import org.openstack4j.openstack.networking.domain.NeutronPort;
import org.openstack4j.openstack.networking.domain.NeutronRouter;
import org.openstack4j.openstack.networking.domain.NeutronSecurityGroup;
import org.openstack4j.openstack.networking.domain.NeutronSecurityGroupRule;
import org.openstack4j.openstack.networking.domain.NeutronSubnet;
import org.openstack4j.openstack.networking.domain.ext.NeutronFirewall;
import org.openstack4j.openstack.networking.domain.ext.NeutronFirewallPolicy;
import org.openstack4j.openstack.networking.domain.ext.NeutronFirewallPolicyUpdate;
import org.openstack4j.openstack.networking.domain.ext.NeutronFirewallRule;
import org.openstack4j.openstack.networking.domain.ext.NeutronFirewallRuleUpdate;
import org.openstack4j.openstack.networking.domain.ext.NeutronFirewallUpdate;
import org.openstack4j.openstack.networking.domain.ext.NeutronHealthMonitor;
import org.openstack4j.openstack.networking.domain.ext.NeutronHealthMonitorAssociate;
import org.openstack4j.openstack.networking.domain.ext.NeutronHealthMonitorUpdate;
import org.openstack4j.openstack.networking.domain.ext.NeutronHealthMonitorV2;
import org.openstack4j.openstack.networking.domain.ext.NeutronHealthMonitorV2Update;
import org.openstack4j.openstack.networking.domain.ext.NeutronLbPool;
import org.openstack4j.openstack.networking.domain.ext.NeutronLbPoolUpdate;
import org.openstack4j.openstack.networking.domain.ext.NeutronLbPoolV2;
import org.openstack4j.openstack.networking.domain.ext.NeutronLbPoolV2Update;
import org.openstack4j.openstack.networking.domain.ext.NeutronListenerV2;
import org.openstack4j.openstack.networking.domain.ext.NeutronListenerV2Update;
import org.openstack4j.openstack.networking.domain.ext.NeutronLoadBalancerV2;
import org.openstack4j.openstack.networking.domain.ext.NeutronLoadBalancerV2Update;
import org.openstack4j.openstack.networking.domain.ext.NeutronMember;
import org.openstack4j.openstack.networking.domain.ext.NeutronMemberUpdate;
import org.openstack4j.openstack.networking.domain.ext.NeutronMemberV2;
import org.openstack4j.openstack.networking.domain.ext.NeutronMemberV2Update;
import org.openstack4j.openstack.networking.domain.ext.NeutronSessionPersistence;
import org.openstack4j.openstack.networking.domain.ext.NeutronVip;
import org.openstack4j.openstack.networking.domain.ext.NeutronVipUpdate;
import org.openstack4j.openstack.networking.domain.qos.NeutronQosBandwidthLimitRule;
import org.openstack4j.openstack.networking.domain.qos.NeutronQosDscpMarkingRule;
import org.openstack4j.openstack.networking.domain.qos.NeutronQosMinimumBandwidthRule;
import org.openstack4j.openstack.networking.domain.qos.NeutronQosPolicy;

/**
 * The Network V3 Builders
 */
public class NeutronBuilders implements NetworkBuilders {

    @Override
    public NetworkBuilder network() {
        return NeutronNetwork.builder();
    }

    @Override
    public NetworkUpdateBuilder networkUpdate() {
        return NeutronNetworkUpdate.builder();
    }

    @Override
    public ExtraDhcpOptBuilder extraDhcpOpt() {
        return NeutronExtraDhcpOptCreate.builder();
    }

    @Override
    public SubnetBuilder subnet() {
        return NeutronSubnet.builder();
    }

    @Override
    public PortBuilder port() {
        return NeutronPort.builder();
    }

    @Override
    public RouterBuilder router() {
        return NeutronRouter.builder();
    }

    @Override
    public NetSecurityGroupBuilder securityGroup() {
        return NeutronSecurityGroup.builder();
    }

    @Override
    public NetSecurityGroupRuleBuilder securityGroupRule() {
        return NeutronSecurityGroupRule.builder();
    }

    @Override
    public NetFloatingIPBuilder netFloatingIP() {
        return NeutronFloatingIP.builder();
    }

    @Override
    public NetQosPolicyBuilder netQosPolicy() {
        return NeutronQosPolicy.builder();
    }

    @Override
    public NetQosBandwidthLimitRuleBuilder netQosBandwidthLimitRule() {
        return NeutronQosBandwidthLimitRule.builder();
    }

    @Override
    public NetQosDscpMarkingRuleBuilder netQosDscpMarkingRule() {
        return NeutronQosDscpMarkingRule.builder();
    }

    @Override
    public NetQosMinimumBandwidthRuleBuilder netQosMinimumBandwidthRule() {
        return NeutronQosMinimumBandwidthRule.builder();
    }

    @Override
    public NetQuotaBuilder netQuota() {
        return NeutronNetQuota.builder();
    }

    @Override
    public MemberBuilder member() {
        return NeutronMember.builder();
    }

    @Override
    public MemberUpdateBuilder memberUpdate() {
        return NeutronMemberUpdate.builder();
    }

    @Override
    public SessionPersistenceBuilder sessionPersistence() {
        return NeutronSessionPersistence.builder();
    }

    @Override
    public VipBuilder vip() {
        return NeutronVip.builder();
    }

    @Override
    public VipUpdateBuilder vipUpdate() {
        return NeutronVipUpdate.builder();
    }

    @Override
    public HealthMonitorBuilder healthMonitor() {
        return NeutronHealthMonitor.builder();
    }

    @Override
    public HealthMonitorUpdateBuilder healthMonitorUpdate() {
        return NeutronHealthMonitorUpdate.builder();
    }

    @Override
    public FirewallBuilder firewall() {
        return NeutronFirewall.builder();
    }

    @Override
    public FirewallUpdateBuilder firewallUpdate() {
        return NeutronFirewallUpdate.builder();
    }

    @Override
    public FirewallRuleBuilder firewallRule() {
        return NeutronFirewallRule.builder();
    }

    @Override
    public FirewallRuleUpdateBuilder firewallRuleUpdate() {
        return NeutronFirewallRuleUpdate.builder();
    }

    @Override
    public FirewallPolicyBuilder firewallPolicy() {
        return NeutronFirewallPolicy.builder();
    }

    @Override
    public FirewallPolicyUpdateBuilder firewallPolicyUpdate() {
        return NeutronFirewallPolicyUpdate.builder();
    }

    @Override
    public LbPoolBuilder lbPool() {
        return NeutronLbPool.builder();
    }

    @Override
    public LbPoolUpdateBuilder lbPoolUpdate() {
        return NeutronLbPoolUpdate.builder();
    }

    @Override
    public HealthMonitorAssociateBuilder lbPoolAssociateHealthMonitor() {
        return NeutronHealthMonitorAssociate.builder();
    }

    @Override
    public MemberV2Builder memberV2(){
        return NeutronMemberV2.builder();
    }


    @Override
    public MemberV2UpdateBuilder memberV2Update(){
        return NeutronMemberV2Update.builder();
    }

    @Override
    public LoadBalancerV2Builder lbV2(){
        return NeutronLoadBalancerV2.builder();
    }

    @Override
    public LoadBalancerV2UpdateBuilder loadBalancerV2Update(){
        return NeutronLoadBalancerV2Update.builder();
    }

    @Override
    public HealthMonitorV2Builder healthMonitorV2(){
        return NeutronHealthMonitorV2.builder();
    }

    @Override
    public HealthMonitorV2UpdateBuilder healthMonitorV2Update(){
        return NeutronHealthMonitorV2Update.builder();
    }

    @Override
    public LbPoolV2Builder lbPoolV2(){
        return NeutronLbPoolV2.builder();
    }

    @Override
    public LbPoolV2UpdateBuilder lbPoolV2Update(){
        return NeutronLbPoolV2Update.builder();
    }

    @Override
    public ListenerV2Builder listenerV2(){
        return NeutronListenerV2.builder();
    }

    @Override
    public ListenerV2UpdateBuilder listenerV2Update(){
        return NeutronListenerV2Update.builder();
    }
}
