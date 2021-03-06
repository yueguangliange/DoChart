package com.dqqdo.dochart.resolver;

import com.dqqdo.dochart.resolver.draw.IDrawItem;

import java.util.List;

/**
 * 解析完成返回的结果对象
 * 时间：2017/11/29 14:07
 * @author duqingquan
 */
public class ResolverResult {

    private int resultCode;
    private List<IDrawItem> drawItems;

    public List<IDrawItem> getDrawItems() {
        return drawItems;
    }

    public void setDrawItems(List<IDrawItem> drawItems) {
        this.drawItems = drawItems;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    @Override
    public String toString() {
        return "ResolverResult{" +
                "resultCode=" + resultCode +
                ", drawItems=" + drawItems +
                '}';
    }
}
