package user;

import permission.Permission;

public class UserPermission {
    private long id;
    private User user;
    private Permission permission;

    public UserPermission() {
    }

    public UserPermission(User user, Permission permission) {
        this.user = user;
        this.permission = permission;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        return "UserPermission{" +
                "user=" + user +
                ", permission=" + permission +
                '}';
    }
}
