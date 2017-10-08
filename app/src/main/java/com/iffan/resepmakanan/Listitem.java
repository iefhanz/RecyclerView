package com.iffan.resepmakanan;

/**
 * Created by PC on 24/09/2017.
 */

public class Listitem {
    private String head;
    private String desc;
    private int image_id;
    /*public Listitem(String head, String desc) {
        this.head = head;
        this.desc = desc;
    }*/

    public Listitem(String head, String desc, int image_id) {
        this.head = head;
        this.desc = desc;
        this.image_id = image_id;
    }

    public int getImage_id() {
        return image_id;
    }

    public String getHead() {
        return head;
    }

    public String getDesc() {
        return desc;
    }
}
