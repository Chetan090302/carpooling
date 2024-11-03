package com.project.carpooling.Publish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/publish")
public class publishcontroller
{
    @Autowired
    PublishService repo;
    @GetMapping("/getAll")
    public String getAllRides(Model model)
    {
        model.addAttribute("publishList",repo.getAllrides());
        return "publish";
    }
    @GetMapping("/getrides")
    public String filterRidepage()
    {
        return "getrides";
    }
    @GetMapping("/get")
    public String FilterRides(@RequestParam("source") String source,@RequestParam("destination") String destination,Model model)
    {
        model.addAttribute("publishList",repo.getridebyfilter(source,destination));
        return "publish";
    }
    @GetMapping("/page")
    public String PublishRidePage(Model model)
    {
        model.addAttribute("publish",new publish());
        return "postride";
    }
    @PostMapping("/postride")
    public String PostRide(@ModelAttribute("publish") publish obj,Model model)
    {
        repo.saveride(obj);
        model.addAttribute("publishList",repo.getAllrides());
        return "publish";
    }
}
