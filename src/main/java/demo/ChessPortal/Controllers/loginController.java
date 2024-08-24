package demo.ChessPortal.Controllers;

import demo.ChessPortal.Model.User;

import demo.ChessPortal.Services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {
    @Autowired
    userService UserService;




    @GetMapping("/login")
    public String loginsite(){
        return "login";
    }





    @PostMapping
    public String login(@RequestParam("username") String username, @RequestParam ("password") String password , Model model){
        User User = UserService.findByUsername(username);

        if(User != null && UserService.checkPassword(User, password)){
            return "redirect:/menu";
        }else {
            return "redirect:/login";
        }



    }
}
