package cn.bdqn.contrller;

import cn.bdqn.entity.Clubs;
import cn.bdqn.entity.Players;
import cn.bdqn.service.ClubsService;
import cn.bdqn.service.PlayersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("players")
public class PlayersController {

    @Resource
    private PlayersService playersService;

    @Resource
    private ClubsService clubsService;

    @RequestMapping("select")
    public String select(Model model, @RequestParam(value = "pname",required = false) String pname, @RequestParam(value = "cid",required = false)Integer cid){
        List<Players> playersList = playersService.listPlayers(pname,cid);
        model.addAttribute("playersList",playersList);
        List<Clubs> clubsList = clubsService.getAllClubs();
        model.addAttribute("clubsList",clubsList);
        return "list";
    }

    @RequestMapping("toAdd")
    public String toAdd(Model model){
        List<Clubs> clubsList = clubsService.getAllClubs();
        model.addAttribute("clubsList",clubsList);
        return "add";
    }

    @RequestMapping("add")
    @ResponseBody
    public String add(Players players){
        int count = playersService.addPlayers(players);
        if(count == 0){
            return "false";
        }else{
            return "true";
        }
    }

    @RequestMapping("delete")
    @ResponseBody
    public String doDelete(Integer id){
        int count = playersService.deletePlayers(id);
        if (count==0){
            return "false";
        }else {
            return "true";
        }

    }
}
