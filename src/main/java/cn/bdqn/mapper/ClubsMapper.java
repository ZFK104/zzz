package cn.bdqn.mapper;

import cn.bdqn.entity.Clubs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ClubsMapper {
    @Select("select * from clubs")
    List<Clubs> getAllClubs();
}
