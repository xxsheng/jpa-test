/*
 * Alipay.com Inc.
 * Copyright (c) 2004-2007 All Rights Reserved.
 */
package jpa.test.model.enums;

/**
 * @description: 页面状态
 * @author: liuzhong
 * @date: 2021-03-25 12:02
 */
public enum ResourceStatusEnum {
    /**
     * 草稿
     */
    DRAFT("DRAFT", "草稿"),
    /**
     * 待发布
     */
    TO_PUBLISH("TO_PUBLISH", "待发布"),
    /**
     * 已发布
     */
    PUBLISH("PUBLISH", "已发布"),
    /**
     * 已发布有草稿
     */
    PUBLISH_AND_DRAFT("PUBLISH_AND_DRAFT", "已发布且有草稿"),
    /**
     * 已发布并且有待发布版本
     */
    PUBLISH_AND_TO_PUBLISH("PUBLISH_AND_TO_PUBLISH", "已发布且有待发布版本"),
    /**
     * 已下线
     */
    OFFLINE("OFFLINE", "已下线");

    private String desc;

    private String code;

    /**
     * @param code
     * @param desc
     */
    private ResourceStatusEnum(String code, String desc) {
        this.desc = desc;
        this.code = code;
    }

    /**
     * @return Returns the desc.
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @return Returns the code.
     */
    public String getCode() {
        return code;
    }

    /**
     *
     */
    public static ResourceStatusEnum getByCode(String code) {
        for (ResourceStatusEnum accountStatus : values()) {
            if (accountStatus.getCode().equals(code)) {
                return accountStatus;
            }
        }
        return null;
    }

}