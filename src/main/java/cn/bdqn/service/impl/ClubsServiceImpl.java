package cn.bdqn.service.impl;

import cn.bdqn.entity.Clubs;
import cn.bdqn.mapper.ClubsMapper;
import cn.bdqn.service.ClubsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClubsServiceImpl implements ClubsService {

    @Resource
    private ClubsMapper clubsMapper;
    @Override
    public List<Clubs> getAllClubs() {
        return clubsMapper.getAllClubs();
    }
}
