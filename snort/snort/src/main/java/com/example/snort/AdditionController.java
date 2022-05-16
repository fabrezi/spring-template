package com.example.snort;

@Controller
public class AdditionController {

    @GetMapping("/index")
    public String ViewForm(Model model){
        model.addAttribute("Add", new Addition());
        return "index";
    }

    @PostMapping("/addition")
    public String addForm(@ModelAttribute Addition addition, BindingResult result, Model model)
    {
        model.addAttribute("addition", addition);
        return "calculate";
    }
}
