package com.example.listview;

/**
 * Created by 郝俊谦 on 2016/5/13.
 */
public class ItemBean {
    public int ItemInageResid;
    public String Itemtitle;
    public String ItemContent;

    public ItemBean(int itemInageResid, String itemtitle, String itemContent) {
        this.ItemInageResid = itemInageResid;
        this.Itemtitle = itemtitle;
        this.ItemContent = itemContent;
    }
}
