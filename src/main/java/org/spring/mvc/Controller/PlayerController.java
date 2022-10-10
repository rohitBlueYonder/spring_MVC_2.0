package org.spring.mvc.Controller;

import org.spring.mvc.Model.Player;
import org.spring.mvc.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlayerController {

    @Autowired
    PlayerService service;

    @RequestMapping(value="/searchPlayerForm")
    public String searchPlayerForm(){

        return "search-player-form";
    }

    //USING HttpServlet

//    @RequestMapping(value ="/showPlayerDetail" )
//    public String showPlayerDetail(HttpServletRequest request, Model model){
//        String pName=request.getParameter("playerName");
//        Player player=service.getPlayerByName(pName);
//        System.out.println(player);
//        model.addAttribute("pName",player.getName());
//        model.addAttribute("pId",player.getId());
//        model.addAttribute("pAge",player.getAge());
//        model.addAttribute("pNationality",player.getNationality());
//        return "show-player-detail";
//    }


    //USING STRING ANNOTATION
    @RequestMapping(value ="/showPlayerDetail" )

    //without HttpServletRequest -> using Spring Annotation @RequestParam
    public String showPlayerDetail(@RequestParam(value = "PlayerName", defaultValue = "Rahul") String playerName, Model model){

        Player player=service.getPlayerByName(playerName);
        System.out.println(player);
        model.addAttribute("pName",player.getName());
        model.addAttribute("pId",player.getId());
        model.addAttribute("pAge",player.getAge());
        model.addAttribute("pNationality",player.getNationality());
        return "show-player-detail";
    }


}