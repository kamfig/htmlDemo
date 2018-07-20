package pl.kamilF.htmlDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {


@GetMapping("/")
    public String getIndex(){
    return"piewszy";
}
@GetMapping("/about")
    public String getAbout(){
    return "drugiBoxModel";
}
@GetMapping("/formularz")
    public String getForm(){
    return "formularzKontaktowy";
}

}
