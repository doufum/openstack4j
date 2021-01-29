package org.openstack4j.openstack.compute.domain.actions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import org.openstack4j.model.compute.actions.MigrateOptions;

/**
 * Live Migration Action for a Server
 *
 * @author Jeremy Unruh
 */
@JsonRootName("migrate")
public class MigrationAction implements ServerAction {

    private static final long serialVersionUID = 1L;

    @JsonProperty
    private String host;

    public static MigrationAction create(MigrateOptions options) {
        MigrationAction action = new MigrationAction();
        action.host = options.getHost();
        return action;
    }

    public String getHost() {
        return host;
    }

    @Override
    public String toString() {
        return "migrate";
    }

}
