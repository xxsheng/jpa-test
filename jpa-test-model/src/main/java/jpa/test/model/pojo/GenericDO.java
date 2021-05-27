package jpa.test.model.pojo;

import java.io.Serializable;
import java.util.Date;

public class GenericDO implements Serializable {

    private static final long serialVersionUID = 7798753682985231122L;

    // 创建时间
    protected Date createTime;

    // 修改时间
    protected Date updateTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}
