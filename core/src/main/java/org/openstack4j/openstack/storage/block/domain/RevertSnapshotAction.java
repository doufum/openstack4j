package org.openstack4j.openstack.storage.block.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import org.openstack4j.model.ModelEntity;

/**
 * The type RevertSnapshotAction.
 *
 * @Description
 * @Author ChaoHong.Mao
 * @Date 2020/11/18
 */
@JsonRootName("revert")
public class RevertSnapshotAction implements ModelEntity {

    @JsonProperty("snapshot_id")
    private String snapshotId;

    public RevertSnapshotAction(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
}
