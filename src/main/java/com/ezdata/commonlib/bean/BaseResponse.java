package com.ezdata.commonlib.bean;


import com.ezdata.commonlib.Constants.Constant;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Description：网络返回数据基类,这个根据情况可以修改
 * Created by：Kyle
 * Date：2017/2/6
 */
public class BaseResponse<T> {

    /**
     *
     *
     *
     "data": true,
     "message": "",
     "status": 200
     "err": {
     "code": "U03",
     "msg": "密码有误",
     "path": "/sys/user/login"
     },
     *
     *
     */


//    @SerializedName("result")
    private int status;
    private String message;
    private T data;
    private ErrInfo err;

    public int getCode() {
        return status;
    }

    public void setCode(int code) {
        this.status = code;
    }

    public String getMsg() {
        return message;
    }

    public void setMsg(String msg) {
        this.message = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    public boolean isOk(){
        return status == Constant.CODE_OK;
    }

    /**
     * 返回错误信息
     * @return
     */
    public String getErrMsg() {
        return err.msg;
    }
    public String getErrCode() {
        return err.code;
    }

    private class ErrInfo{
//"code": "U03",
//        "msg": "密码有误",
//        "path": "/sys/user/login"
        public String code;//错误编码
        public String msg;//错误信息
        public String path;//错误接口信息
    }
}
