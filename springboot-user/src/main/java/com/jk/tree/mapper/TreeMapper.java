package com.jk.tree.mapper;

import com.jk.tree.model.Power;
import com.jk.tree.model.RolePower;
import com.jk.tree.model.Tree;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TreeMapper {

    List<Power> queryPowerTree();

    List<RolePower> queryRolePowerTree(Integer id);

    List<Tree> queryTreeByUser(@Param("id") int id, @Param("userId") Integer userId);
}
