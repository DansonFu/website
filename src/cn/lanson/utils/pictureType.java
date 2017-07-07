package cn.lanson.utils;

public enum pictureType {

    ACTIVITY("activity", "»î¶¯"), DELETE("delete", "É¾³ý");

    private String value;
    private String statusName;

    pictureType(String value, String statusName) {
        this.value = value;
        this.statusName = statusName;
    }

    public String getValue() {
        return this.value;
    }

    public String getStatusName() {
        return statusName;
    }

    public static pictureType getTypeByValue(String value) {
        for (pictureType status : values()) {
            if (status.getValue().equals(value)) {
                return status;
            }
        }
        return null;
    }

    public static String getTypeNameByValue(String value) {
        for (pictureType status : values()) {
            if (status.getValue().equals(value)) {
                return status.getStatusName();
            }
        }
        return null;
    }
}
