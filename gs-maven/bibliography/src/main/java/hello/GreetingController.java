package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    
    @RequestMapping("/submitted")
    public String submitted(@RequestParam(value="author") String author,
                            @RequestParam(value="title", required=true) String title,
                            @RequestParam(value="year", required=true) String year,
                            @RequestParam(value="journal", required=true) String journal, Model model) {

        model.addAttribute("author", author);
        model.addAttribute("title", title);
        model.addAttribute("year", year);
        model.addAttribute("journal", journal);
        return "submitted";
    }
    

}
