package com.portfolio.argentinaprograma.Interface;

import com.portfolio.argentinaprograma.Entity.Users;
import java.util.List;

public interface IUsersService {
    
    public List<Users> getUsers();
    
    public void saveUser(Users user);
    
    public void deleteUser(Long id);
    
    public Users findUser(Long id);
}
