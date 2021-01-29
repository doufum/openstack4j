package org.openstack4j.model.compute.actions;

/**
 * Options to live-migrate a server to a new host without rebooting
 *
 * @author Jeremy Unruh
 */
public class MigrateOptions extends BaseActionOptions {

    private enum Option implements OptionEnum {
        HOST("host"),
        ;
        private final String param;
        private Option(String param) { this.param = param; }

        @Override
        public String getParam() {
            return param;
        }
    }

    private MigrateOptions() {
        super();
        add(Option.HOST, null);
    }

    public static MigrateOptions create() {
        return new MigrateOptions();
    }

    /**
     * Name of the new host (Optional)
     *
     * @param host the name of the new host
     * @return LiveMigrateOptions
     */
    public MigrateOptions host(String host) {
        add(Option.HOST, host);
        return this;
    }

    public String getHost() {
        return get(MigrateOptions.Option.HOST);
    }
}
