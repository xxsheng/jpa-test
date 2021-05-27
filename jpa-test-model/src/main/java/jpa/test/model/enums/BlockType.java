package jpa.test.model.enums;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public enum BlockType {

    /**
     * 轮播图
     */
    @ApiModelProperty("轮播图")
    CAROUSEL_FIGURE,

    /**
     * 图片广告
     */
    @ApiModelProperty("图片广告")
    IMAGE,

    /**
     * 宫格列表
     */
    @ApiModelProperty("宫格列表")
    LIST,

    /**
     * 导航菜单
     */
    @ApiModelProperty("导航菜单")
    NAVIGATION_MENU

}
