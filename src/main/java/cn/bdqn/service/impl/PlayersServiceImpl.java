package cn.bdqn.service.impl;

import cn.bdqn.entity.Players;
import cn.bdqn.mapper.PlayersMapper;
import cn.bdqn.service.PlayersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("playersService")
public class PlayersServiceImpl implements PlayersService {

    @Resource
    private PlayersMapper playersMapper;


    @Override
    public List<Players> listPlayers(String pname, Integer cid) {
        return playersMapper.listPlayers(pname,cid);
    }

    @Override
    public int addPlayers(Players players) {
        return playersMapper.addPlayers(players);
    }

    @Override
    public int deletePlayers(Integer id) {
        return playersMapper.deletePlayers(id);
    }
}
