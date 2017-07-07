package cn.lanson.qiniu.common;

import java.nio.charset.Charset;

/**
 * Created by bailong on 16/9/14.
 */
public final class Constants {
    /**
     * 鐗堟湰鍙�
     */
    public static final String VERSION = "7.2.4";
    /**
     * 鍧楀ぇ灏忥紝涓嶈兘鏀瑰彉
     */
    public static final int BLOCK_SIZE = 4 * 1024 * 1024;
    /**
     * 鎵�鏈夐兘鏄疷TF-8缂栫爜
     */
    public static final Charset UTF_8 = Charset.forName("UTF-8");
    /**
     * 杩炴帴瓒呮椂鏃堕棿 鍗曚綅绉�(榛樿10s)
     */
    public static final int CONNECT_TIMEOUT = 10;
    /**
     * 鍐欒秴鏃舵椂闂� 鍗曚綅绉�(榛樿 0 , 涓嶈秴鏃�)
     */
    public static final int WRITE_TIMEOUT = 0;
    /**
     * 鍥炲瓒呮椂鏃堕棿 鍗曚綅绉�(榛樿30s)
     */
    public static final int READ_TIMEOUT = 30;

    private Constants() {
    }
}
