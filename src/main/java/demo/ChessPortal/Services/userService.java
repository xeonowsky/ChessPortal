package demo.ChessPortal.Services;

import demo.ChessPortal.Model.User;
import demo.ChessPortal.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


    @Service
    public class userService {

        @Autowired
        private UserRepository userRepository;

        public User findByUsername(String username) {
            return userRepository.findByUsername(username);
        }

        public boolean checkPassword(User user, String rawPassword) {
            return user != null && user.getPassword().equals(rawPassword);
        }
    }

