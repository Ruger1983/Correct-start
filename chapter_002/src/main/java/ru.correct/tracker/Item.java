package ru.correct.tracker;

/**
 * Класс для хранения одной заявки
 */

public class Item {

    private String id;
    private String name;
    private String desc;
    private String[] comments;

    Item(String id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setComments(String[] comments) {
        this.comments = comments;
    }

    public String[] getComments() {
        return comments;
    }
}
