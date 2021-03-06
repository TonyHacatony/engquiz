package rest.api.entity;

public class Word {

    private long id;
    private String name;
    private String translate;

    public Word(long id, String name, String translate) {
        this.id = id;
        this.name = name;
        this.translate = translate;
    }

    public Word(long id, String name) {
        this.id = id;
        this.name = name;
        this.translate = "";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }
}