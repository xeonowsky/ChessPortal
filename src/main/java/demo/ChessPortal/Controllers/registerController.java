package demo.ChessPortal.Controllers;

import demo.ChessPortal.Model.User;
import demo.ChessPortal.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class registerController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/register")
    public String registerUser(Model model) {
        model.addAttribute("user", new User());
        return "register";

    }


    @PostMapping("/register")
    public String saveUser(@ModelAttribute User user) {
        userRepository.save(user);

        return "redirect:/";
    }
}
