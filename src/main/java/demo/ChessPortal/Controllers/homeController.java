package demo.ChessPortal.Controllers;

import demo.ChessPortal.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String home(Model model){

        model.addAttribute("username", userRepository.findAll());

        return "index";
    }



}
