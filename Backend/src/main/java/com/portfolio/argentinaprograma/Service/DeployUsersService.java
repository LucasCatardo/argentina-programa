package com.portfolio.argentinaprograma.Service;

import com.portfolio.argentinaprograma.Entity.Users;
import com.portfolio.argentinaprograma.Interface.IUsersService;
import com.portfolio.argentinaprograma.Repository.IUsersRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeployUsersService implements IUsersService {

    @Autowired IUsersRepository iUsersRepository;
    
    @Override
    public List<Users> getUsers() {
        List<Users> users = iUsersRepository.findAll();
        return users;
    }

    @Override
    public void saveUser(Users user) {
        iUsersRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        iUsersRepository.deleteById(id);
    }

    @Override
    public Users findUser(Long id) {
        Users user = iUsersRepository.findById(id).orElse(null);
        return user;
    }
}
