package cn.bdqn.service;

import cn.bdqn.entity.Players;

import java.util.List;

public interface PlayersService {
    List<Players> listPlayers(String pname,Integer cid);

    int addPlayers(Players players);

    int deletePlayers(Integer id);
}
