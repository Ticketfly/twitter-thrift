package com.twitter.common.thrift.stats;

/**
 * Simple interface for recording stats.
 */
public interface ThriftStatsCollector {

    /**
     * Record new value for a statistics.
     *
     * @param name Statistics name
     * @param value Value
     */
    void add(String name, long value);

    /**
     * Increment a count for a statistics.
     *
     * @param name Statistics name
     */
    void increment(String name, long increment);

    /**
     * Do-nothing stats collector
     */
    public static final ThriftStatsCollector DUMMY = new ThriftStatsCollector() {
        @Override
        public void add(String name, long value) {
        }

        @Override
        public void increment(String name, long increment) {
        }
    };
}
