package org.openstack4j.openstack.gnocchi.internal;

import org.openstack4j.api.gnocchi.ResourceService;
import org.openstack4j.core.transport.ClientConstants;
import org.openstack4j.model.gnocchi.Resource;
import org.openstack4j.openstack.gnocchi.domain.GnocchiResource;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * gnocchi resource Operation API implementation
 *
 * @author zhangliang
 */
public class ResourceServiceImpl extends BaseGnocchiServices implements ResourceService {

    @Override
    public Object[][] listMetric(String resourceType, String resourceId, String metricType, Date start) {
        checkNotNull(resourceId);
        checkNotNull(start);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
        LocalDateTime localDateTime = LocalDateTime.ofInstant(start.toInstant(), ZoneId.systemDefault());

        return get(Object[][].class,
                   uri("/v1/resource/%s/%s/metric/%s/measures?start=%s", resourceType, resourceId, metricType,
                       sdf.format(Date.from(localDateTime.toInstant(ZoneOffset.ofHours(16)))))).header(
                ClientConstants.HEADER_ACCEPT, "*/*").execute();
    }

    @Override
    public Object[][] listMetric(String resourceType, String resourceId, String metricType, Date start, Date end,
                                 Integer granularity) {
        checkNotNull(resourceId);
        checkNotNull(start);
        checkNotNull(end);
        checkNotNull(granularity);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
        LocalDateTime startInstant = LocalDateTime.ofInstant(start.toInstant(), ZoneId.systemDefault());
        LocalDateTime endInstant = LocalDateTime.ofInstant(end.toInstant(), ZoneId.systemDefault());

        String startStr = sdf.format(Date.from(startInstant.toInstant(ZoneOffset.ofHours(16))));
        String endStr = sdf.format(Date.from(endInstant.toInstant(ZoneOffset.ofHours(16))));

        return get(Object[][].class,
                   uri("/v1/resource/%s/%s/metric/%s/measures?start=%s&stop=%s&granularity=%s", resourceType,
                       resourceId, metricType,
                       startStr, endStr, granularity)).header(
                ClientConstants.HEADER_ACCEPT, "*/*").execute();
    }

    @Override
    public List<? extends Resource> listResource(String resourceType, String json) {
        checkNotNull(json);
        GnocchiResource[] resources = post(GnocchiResource[].class,
                                           uri("/v1/search/resource/%s", resourceType)).header(
                ClientConstants.HEADER_ACCEPT, "*/*").execute();
        return wrapList(resources);
    }
}
