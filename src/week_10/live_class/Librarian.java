package week_10.live_class;

public class Librarian {
    private String name;
    private String surName;
    private String id = "00";

    public Librarian(String name, String surName, String id) {
        this.name = name;
        this.surName = surName;
        this.id += id;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
