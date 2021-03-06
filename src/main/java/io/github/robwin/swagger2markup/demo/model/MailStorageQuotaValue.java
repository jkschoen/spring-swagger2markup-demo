package io.github.robwin.swagger2markup.demo.model;

/**
 * @author Robert Winkler
 */
public enum MailStorageQuotaValue {
    THREEDAYS(3),
    FOURTEENDAYS(14),
    THIRTYDAYS(30),
    NINETYDAYS(90),
    INFINITE(-1);

    private final int quotaValue;

    private MailStorageQuotaValue(int quotaValue) {
        this.quotaValue = quotaValue;
    }

    public int getQuotaValue() {
        return quotaValue;
    }

    @Override
    public String toString() {
        return Integer.toString(quotaValue);
    }

    public static MailStorageQuotaValue valueOf(int quotaValue) {
        for (MailStorageQuotaValue mailStorageQuotaValue : MailStorageQuotaValue.values()) {
            if (mailStorageQuotaValue.getQuotaValue() == quotaValue) return mailStorageQuotaValue;
        }
        throw new IllegalArgumentException("MailStorageQuotaValue not found.");
    }
}
