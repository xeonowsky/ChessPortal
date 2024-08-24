package demo.ChessPortal.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class menuController {


    @GetMapping("/menu")
    public String menu() {
        return "menu";
    }


}
