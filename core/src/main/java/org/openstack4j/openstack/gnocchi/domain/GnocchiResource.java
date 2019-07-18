package org.openstack4j.openstack.gnocchi.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openstack4j.model.gnocchi.Resource;
import org.openstack4j.model.gnocchi.builder.ResourceBuilder;
import org.openstack4j.openstack.common.ListResult;

import java.util.List;

/**
 * gnocchi resource
 *
 * @author zhangliang
 */
public class GnocchiResource implements Resource {

    @JsonProperty
    private String id;
    @JsonProperty
    private String type;
    @JsonProperty
    private String original_resource_id;
    @JsonProperty
    private String created_by_user_id;
    @JsonProperty
    private String started_at;
    @JsonProperty
    private String revision_start;
    @JsonProperty
    private String creator;
    @JsonProperty
    private String created_by_project_id;

    @Override
    public ResourceBuilder toBuilder() {
        return null;
    }

    @Override
    public String getTenantId() {
        return null;
    }

    @Override
    public void setTenantId(String tenantId) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public static class Resources extends ListResult<GnocchiResource> {

        private List<GnocchiResource> resources;

        @Override
        protected List<GnocchiResource> value() {
            return resources;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOriginal_resource_id() {
        return original_resource_id;
    }

    public void setOriginal_resource_id(String original_resource_id) {
        this.original_resource_id = original_resource_id;
    }

    public String getCreated_by_user_id() {
        return created_by_user_id;
    }

    public void setCreated_by_user_id(String created_by_user_id) {
        this.created_by_user_id = created_by_user_id;
    }

    public String getStarted_at() {
        return started_at;
    }

    public void setStarted_at(String started_at) {
        this.started_at = started_at;
    }

    public String getRevision_start() {
        return revision_start;
    }

    public void setRevision_start(String revision_start) {
        this.revision_start = revision_start;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreated_by_project_id() {
        return created_by_project_id;
    }

    public void setCreated_by_project_id(String created_by_project_id) {
        this.created_by_project_id = created_by_project_id;
    }
}
