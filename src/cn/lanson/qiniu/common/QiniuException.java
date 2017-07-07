package cn.lanson.qiniu.common;

import java.io.IOException;

import com.qiniu.http.Error;
import com.qiniu.http.Response;

/**
 * 异常，封装了http响应数据
 */
public final class QiniuException extends IOException {
    public final Response response;
    private String error;

    public QiniuException(Response response) {
        this.response = response;
    }

    public QiniuException(Exception e) {
        this(e, null);
    }

    public QiniuException(Exception e, String msg) {
        super(e);
        this.response = null;
        this.error = msg;
    }

    public String url() {
        return response.url();
    }

    public int code() {
        return response == null ? -1 : response.statusCode;
    }

    public String error() {
        if (error != null) {
            return error;
        }
        if (response == null || response.statusCode / 100 == 2 || !response.isJson()) {
            return null;
        }
        Error e = null;
        try {
            e = response.jsonToObject(Error.class);
        } catch (com.qiniu.common.QiniuException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        error = e == null ? "" : e.error;
        return error;
    }
}
