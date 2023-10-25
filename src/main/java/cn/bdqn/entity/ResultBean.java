package cn.bdqn.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class ResultBean implements Serializable {

    private boolean flag;
    private Object data;
    private String errorMsg;

    public ResultBean() {
    }

    public ResultBean(Boolean flag, String errorMsg) {
        this.flag = flag;
        this.errorMsg = errorMsg;
    }

    public ResultBean(Boolean flag, Object data, String errorMsg) {
        this.flag = flag;
        this.data = data;
        this.errorMsg = errorMsg;
    }

    public ResultBean(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    public ResultBean(Boolean flag) {
        this.flag = flag;
    }

}
