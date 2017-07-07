package cn.lanson.qiniu.common;

/**
 * 多区域上传域各1�7
 */
public class Zone {
    /**
     * 上传，备用上传，备用上传IP和源站资源域名使用各个机房对应的域名
     */
    private String upHttp;
    private String upHttps;
    private String upBackupHttp;
    private String upBackupHttps;
    private String upIpHttp;
    private String upIpHttps;
    private String iovipHttp;
    private String iovipHttps;

    /**
     * 资源管理，资源列表，资源处理类域各1�7 默认的这组域名是国内国外共用域名，无论海外国内都可以访问 只有在无法自动查询到机房对应具体域名情况下，使用这组域名
     */
    private String rsHttp = "http://rs.qiniu.com";
    private String rsHttps = "https://rs.qbox.me";
    private String rsfHttp = "http://rsf.qiniu.com";
    private String rsfHttps = "https://rsf.qbox.me";
    private String apiHttp = "http://api.qiniu.com";
    private String apiHttps = "https://api.qiniu.com";

    /**
     * 域名构�1�7�器
     */
    static class Builder {
        private Zone zone;

        public Builder() {
            zone = new Zone();
        }

        public Builder upHttp(String upHttp) {
            zone.upHttp = upHttp;
            return this;
        }

        public Builder upBackupHttp(String upBackupHttp) {
            zone.upBackupHttp = upBackupHttp;
            return this;
        }

        public Builder upHttps(String upHttps) {
            zone.upHttps = upHttps;
            return this;
        }

        public Builder upBackupHttps(String upBackupHttps) {
            zone.upBackupHttps = upBackupHttps;
            return this;
        }

        public Builder upIpHttp(String upIpHttp) {
            zone.upIpHttp = upIpHttp;
            return this;
        }

        public Builder upIpHttps(String upIpHttps) {
            zone.upIpHttps = upIpHttps;
            return this;
        }

        public Builder iovipHttp(String iovipHttp) {
            zone.iovipHttp = iovipHttp;
            return this;
        }

        public Builder iovipHttps(String iovipHttps) {
            zone.iovipHttps = iovipHttps;
            return this;
        }

        public Builder rsHttp(String rsHttp) {
            zone.rsHttp = rsHttp;
            return this;
        }

        public Builder rsHttps(String rsHttps) {
            zone.rsHttps = rsHttps;
            return this;
        }

        public Builder rsfHttp(String rsfHttp) {
            zone.rsfHttp = rsfHttp;
            return this;
        }

        public Builder rsfHttps(String rsfHttps) {
            zone.rsfHttps = rsfHttps;
            return this;
        }

        public Builder apiHttp(String apiHttp) {
            zone.apiHttp = apiHttp;
            return this;
        }

        public Builder apiHttps(String apiHttps) {
            zone.apiHttps = apiHttps;
            return this;
        }

        /**
         * 自动选择,其它参数设置无效
         */
        public Zone autoZone() {
            zone = AutoZone.instance;
            return zone;
        }

        /**
         * 返回构建好的Zone对象
         */
        public Zone build() {
            return zone;
        }
    }

    /**
     * 华东机房相关域名
     */
    public static Zone zone0() {
        return new Builder().upHttp("http://up.qiniu.com").upHttps("https://up.qbox.me").upBackupHttp("http://upload.qiniu.com")
                .upBackupHttps("https://upload.qbox.me").iovipHttp("http://iovip.qbox.me").iovipHttps("https://iovip.qbox.me").rsHttp("http://rs.qiniu.com")
                .rsHttps("https://rs.qbox.me").rsfHttp("http://rsf.qiniu.com").rsfHttps("https://rsf.qbox.me").apiHttp("http://api.qiniu.com")
                .apiHttps("https://api.qiniu.com").build();
    }

    /**
     * 华北机房相关域名
     */
    public static Zone zone1() {
        return new Builder().upHttp("http://up-z1.qiniu.com").upHttps("https://up-z1.qbox.me").upBackupHttp("http://upload-z1.qiniu.com")
                .upBackupHttps("https://upload-z1.qbox.me").iovipHttp("http://iovip-z1.qbox.me").iovipHttps("https://iovip-z1.qbox.me")
                .rsHttp("http://rs-z1.qiniu.com").rsHttps("https://rs-z1.qbox.me").rsfHttp("http://rsf-z1.qiniu.com").rsfHttps("https://rsf-z1.qbox.me")
                .apiHttp("http://api-z1.qiniu.com").apiHttps("https://api-z1.qiniu.com").build();
    }

    /**
     * 华南机房相关域名
     */
    public static Zone zone2() {
        return new Builder().upHttp("http://up-z2.qiniu.com").upHttps("https://up-z2.qbox.me").upBackupHttp("http://upload-z2.qiniu.com")
                .upBackupHttps("https://upload-z2.qbox.me").iovipHttp("http://iovip-z2.qbox.me").iovipHttps("https://iovip-z2.qbox.me")
                .rsHttp("http://rs-z2.qiniu.com").rsHttps("https://rs-z2.qbox.me").rsfHttp("http://rsf-z2.qiniu.com").rsfHttps("https://rsf-z2.qbox.me")
                .apiHttp("http://api-z2.qiniu.com").apiHttps("https://api-z2.qiniu.com").build();
    }

    /**
     * 北美机房相关域名
     */
    public static Zone zoneNa0() {
        return new Builder().upHttp("http://up-na0.qiniu.com").upHttps("https://up-na0.qbox.me").upBackupHttp("http://upload-na0.qiniu.com")
                .upBackupHttps("https://upload-na0.qbox.me").iovipHttp("http://iovip-na0.qbox.me").iovipHttps("https://iovip-na0.qbox.me")
                .rsHttp("http://rs-na0.qiniu.com").rsHttps("https://rs-na0.qbox.me").rsfHttp("http://rsf-na0.qiniu.com").rsfHttps("https://rsf-na0.qbox.me")
                .apiHttp("http://api-na0.qiniu.com").apiHttps("https://api-na0.qiniu.com").build();
    }

    /**
     * 自动根据AccessKey和Bucket来判断所在机房，并获取相关的域名 空间扄1�7在的对应机房可以在空间创建的时�1�7��1�7�择，或者创建完毕之后，从后台查眄1�7
     */
    public static Zone autoZone() {
        return new Builder().autoZone();
    }

    /**
     * 保留自动获取上传和资源抓取，更新相关域名接口
     */

    public String getUpHttp(ZoneReqInfo zoneReqInfo) {
        return this.upHttp;
    }

    public String getUpHttps(ZoneReqInfo zoneReqInfo) {
        return this.upHttps;
    }

    public String getUpBackupHttp(ZoneReqInfo zoneReqInfo) {
        return this.upBackupHttp;
    }

    public String getUpBackupHttps(ZoneReqInfo zoneReqInfo) {
        return this.upBackupHttps;
    }

    public String getUpIpHttp(ZoneReqInfo zoneReqInfo) {
        return this.upIpHttp;
    }

    public String getUpIpHttps(ZoneReqInfo zoneReqInfo) {
        return this.upIpHttps;
    }

    public String getIovipHttp(ZoneReqInfo zoneReqInfo) {
        return this.iovipHttp;
    }

    public String getIovipHttps(ZoneReqInfo zoneReqInfo) {
        return this.iovipHttps;
    }

    /**
     * 保留自动获取资源管理，资源列表，资源处理相关域名接口
     */
    public String getRsHttp(ZoneReqInfo zoneReqInfo) {
        return rsHttp;
    }

    public String getRsHttps(ZoneReqInfo zoneReqInfo) {
        return rsHttps;
    }

    public String getRsfHttp(ZoneReqInfo zoneReqInfo) {
        return rsfHttp;
    }

    public String getRsfHttps(ZoneReqInfo zoneReqInfo) {
        return rsfHttps;
    }

    public String getApiHttp(ZoneReqInfo zoneReqInfo) {
        return apiHttp;
    }

    public String getApiHttps(ZoneReqInfo zoneReqInfo) {
        return apiHttps;
    }

    /**
     * 获取资源管理，资源列表，资源处理相关域名
     */
    public String getRsHttp() {
        return rsHttp;
    }

    public String getRsHttps() {
        return rsHttps;
    }

    public String getRsfHttp() {
        return rsfHttp;
    }

    public String getRsfHttps() {
        return rsfHttps;
    }

    public String getApiHttp() {
        return apiHttp;
    }

    public String getApiHttps() {
        return apiHttps;
    }
}
