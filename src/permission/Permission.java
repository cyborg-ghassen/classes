package permission;

public class Permission {
    private long id;
    private String name;
    private String codename;

    public Permission() {
    }

    public Permission(String name, String codename) {
        this.name = name;
        this.codename = codename;
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

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    @Override
    public String toString() {
        return "permission.Permission{" +
                "name='" + name + '\'' +
                ", codename='" + codename + '\'' +
                '}';
    }
}
