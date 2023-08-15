package web.dao;

import web.model.User;

import java.util.List;


public interface UserDao {
    public List<User> showAll();

    public void save(User user);

    public User getUser(int id);

    public void deleteUser(int id);


}