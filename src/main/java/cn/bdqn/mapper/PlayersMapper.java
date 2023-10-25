package cn.bdqn.mapper;

import cn.bdqn.entity.Players;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PlayersMapper {
    List<Players> listPlayers(@Param("pname")String pname,@Param("cid") Integer cid);


    @Insert("insert into players(pname,birthday,height,weight,position,cid) values (#{pname},#{birthday},#{height},#{weight},#{position},#{cid})")
    int addPlayers(Players players);

    @Delete("delete from players where pid=#{pid}")
    int deletePlayers(@Param("pid") Integer pid);
}
