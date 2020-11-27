package org.openstack4j.model.identity.v3.options;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Provides server-side filtering options for listing users
 * 
 * @author ChaoHong.Mao
 *
 */
public class UserListOptions {

    private Map<String,String> queryParams = Maps.newHashMap();

    private UserListOptions() { }
    
    public static UserListOptions create() {
        return new UserListOptions();
    }
    
    /**
     * Filters the response by a domain ID.
     * 
     * @param domainId domain id
     * @return options
     */
    public UserListOptions domainId(String domainId) {
        return add("domain_id", domainId);
    }
    
    /**
     * Filters the response by either enabled (true) or disabled (false) users.
     * 
     * @param enabled enabled
     * @return options
     */
    public UserListOptions enabled(boolean enabled) {
        return add("enabled", String.valueOf(enabled));
    }
    
    /**
     * Filters the response by a user name.
     * 
     * @param name the user name
     * @return options
     */
    public UserListOptions name(String name) {
        return add("name", name);
    }
    

    private UserListOptions add(String param, String value) {
        if (value != null) {
            this.queryParams.put(param, value);
        }
        return this;
    }
    
    public Map<String, String> getOptions() {
        return queryParams;
    }
}
