package com.jk.tree.service;

import com.jk.tree.mapper.TreeMapper;
import com.jk.tree.model.Power;
import com.jk.tree.model.RolePower;
import com.jk.tree.model.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeServiceImpl implements TreeService {
    @Autowired
    private TreeMapper treeMapper;

    @Override
    public List<Power> queryPowerTree(Integer id) {
        List<Power> plistAll = treeMapper.queryPowerTree();

        List<RolePower> rplist = treeMapper.queryRolePowerTree(id);
        for (Power power : plistAll) {
            for (RolePower rolePower : rplist) {
                if(power.getId()==rolePower.getPowerId()) {
                    power.setChecked("true");
                }
            }
        }
        return plistAll;
    }

    @Override
    public List<Tree> queryTreeByUser(Integer userId) {
        List<Tree> list = this.queryTreeNodes(0,userId);

        return list;
    }

    //递归方法
    public List<Tree> queryTreeNodes(int id,Integer userId){
        List<Tree> list = treeMapper.queryTreeByUser(id,userId);
        //通过根节点查询子节点
        for (Tree t : list) {
            //查询每一个跟节点的子节点
            List<Tree> zlist = this.queryTreeNodes(t.getId(),userId);
            if(zlist.size()>0){
                t.setState("closed");
                t.setChildren(zlist);
            }
        }
        return list;
    }
}
