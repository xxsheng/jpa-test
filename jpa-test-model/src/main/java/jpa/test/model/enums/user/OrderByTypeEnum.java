/*
 * Alipay.com Inc.
 * Copyright (c) 2004-2007 All Rights Reserved.
 */
package jpa.test.model.enums.user;

/**
 * @description: 排序方式
 * @author: liuzhong
 * @date: 2021-04-06 21:28
 */
public enum OrderByTypeEnum {
    // 发布时间倒序 deploy_date_desc
    // 发布时间倒序正序 deploy_date_asc
    // 发布时间倒序(忽略置顶)deploy_date_desc_ignore_top
    // 发布时间倒序正序(忽略置顶)deploy_date_asc_ignore_top

    /**
     *默认排序sort
     */
    DEFAULT_SORT_DESC("sort倒序", "default_sort_desc"),
    /**
     *默认排序sort
     */
    DEFAULT_SORT_ASC("sort正序", "default_sort_asc"),
    /**
     * 发布时间倒序
     */
    DEPLOY_DATE_DESC("发布时间倒序", "deploy_date_desc"),
    /**
     * 发布时间倒序正序
     */
    DEPLOY_DATE_ASC("发布时间倒序正序", "deploy_date_asc"),
    /**
     * 发布时间倒序(忽略置顶)
     */
    DEPLOY_DATE_DESC_IGNORE_TOP("发布时间倒序(忽略置顶)", "deploy_date_desc_ignore_top"),
    /**
     * 发布时间倒序正序(忽略置顶)
     */
    DEPLOY_DATE_ASC_IGNORE_TOP("发布时间倒序正序(忽略置顶)", "deploy_date_asc_ignore_top");

    private String desc;

    private String code;

    /**
     * @param desc
     * @param code
     */
    private OrderByTypeEnum(String desc, String code) {
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
     */
    public static OrderByTypeEnum getByCode(String code) {
        for (OrderByTypeEnum accountStatus : values()) {
            if (accountStatus.getCode().equals(code)) {
                return accountStatus;
            }
        }
        return null;
    }

}