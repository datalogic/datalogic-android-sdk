package com.datalogic.device.configuration;

import java.time.LocalTime;
import java.util.List;

public class WorkSchedule extends SerializableBlob {

    /**
     * <code>WorkTimeInfo</code> implements the BlobProperty that allows to manage work time information.
     */
    public static class WorkTimeInfo {

        /**
         * This is a special value that can be used to indicate that no work time is defined
         * for a particular day.
         */
        public static final WorkTimeInfo NONE = new WorkTimeInfo.Builder().build();

        /**
         * Get the start time of the work time.
         *
         * @return LocalTime the start time of the work time.
         */
        public LocalTime getStart() {
            return null;
        }

        /**
         * Get the end time of the work time.
         *
         * @return LocalTime the end time of the work time.
         */
        public LocalTime getEnd() {
            return null;
        }

        /**
         * Check if the current work time is before the specified time.
         *
         * @param time the time to check against.
         * @return <code>true</code> if the work time is before the specified time, <code>false</code> otherwise.
         */
        public boolean isBefore(LocalTime time) {
            return false;
        }

        /**
         * Check if the current work time is before the specified time.
         *
         * @param time the time to check against.
         * @return <code>true</code> if the work time is before the specified time, <code>false</code> otherwise.
         */
        public boolean isAfter(LocalTime time) {
            return false;
        }

        /**
         * Check if the current work time is undefined.
         *
         * @return <code>boolean</code>.
         */
        public boolean isUndefined() {
            return false;
        }

        /**
         * Check if this work time overlaps with another work time.
         *
         * @param other the other work time to check against.
         * @return <code>true</code> if they overlap, <code>false</code> otherwise.
         */
        public boolean isOverlapping(WorkTimeInfo other) {
            return false;
        }

        /**
         * Builder for WorkTimeInfo.
         */
        public static class Builder {

            public Builder withStart(LocalTime start) {
                return null;
            }

            public Builder withEnd(LocalTime end) {
                return null;
            }

            public WorkTimeInfo build() {
                return null;
            }

        }

    }

    /**
     * Constants for the days of the week (ISO-8601).
     */
    public static final int WEEK_DAY_GENERIC = 0;
    public static final int WEEK_DAY_MONDAY = 1;
    public static final int WEEK_DAY_TUESDAY = 2;
    public static final int WEEK_DAY_WEDNESDAY = 3;
    public static final int WEEK_DAY_THURSDAY = 4;
    public static final int WEEK_DAY_FRIDAY = 5;
    public static final int WEEK_DAY_SATURDAY = 6;
    public static final int WEEK_DAY_SUNDAY = 7;

    /**
     * Get the smart charge schedule, generic for all days.
     *
     * @return List<WorkTimeInfo> the smart charge schedule for all days.
     */
    public List<WorkTimeInfo> getGeneric() {
        return null;
    }

    /**
     * Get the smart charge schedule for a specific day of the week.
     *
     * @param dayOfWeek the day of the week (1 = Monday, ..., 7 = Sunday)
     * @return List<WorkTimeInfo> the smart charge schedule for the specified day.
     * throws IllegalArgumentException if the day of the week is not between 1 and 7.
     */
    public List<WorkTimeInfo> getWeekly(int dayOfWeek) {
        return null;
    }

    /**
     * Builder for WorkSchedule.
     */
    public static class Builder {

        /**
         * Constructor for Builder.
         */
        public Builder() {
        }

        /**
         * Add a work time info for a specific day of the week.
         *
         * @param weekDay      the day of the week (0 = generic, 1 = Sunday, 2 = Monday, ..., 7 = Saturday)
         * @param workTimeInfo the work time info to add.
         * @return Builder the builder instance.
         * @throws IllegalArgumentException if the week day is not between 0 and 7, or if the
         *                                   work time info overlaps with an existing one.
         */
        public Builder addSchedule(int weekDay, WorkTimeInfo workTimeInfo) {
            return null;
        }

        /**
         * Add a generic work time info.
         *
         * @param workTimeInfo the work time info to add.
         * @return Builder the builder instance.
         * @throws IllegalArgumentException if the work time info overlaps with an existing one.
         */
        public Builder addGeneric(WorkTimeInfo workTimeInfo) {
            return null;
        }

        /**
         * Add a work time info for a specific day of the week.
         *
         * @param day          the day of the week (1 = Sunday, 2 = Monday, ..., 7 = Saturday)
         * @param workTimeInfo the work time info to add.
         * @return Builder the builder instance.
         * @throws IllegalArgumentException if the week day is not between 1 and 7, or if the
         *                                   work time info overlaps with an existing one.
         */
        public Builder addWeekly(int day, WorkTimeInfo workTimeInfo) {
            return null;
        }

        /**
         * Build the WorkSchedule instance.
         *
         * @return WorkSchedule the built instance.
         */
        public WorkSchedule build() {
            return null;
        }
    }

}
