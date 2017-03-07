package com.project.harsh.buttonlistview;


/**
 * Created by harsh on 7/3/17.
 * reference site : http://www.androidhub4you.com/2013/02/muftitouch-listview-multi-click.html
 */

class Post {
    String listitem;

    Post(String listitem){
        this.listitem = listitem;
    }

    public String getListitem() {
        return listitem;
    }

    public void setListitem(String listitem) {
        this.listitem = listitem;
    }
}
