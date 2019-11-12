package com.jk.tree.service;

import com.jk.tree.model.Power;
import com.jk.tree.model.Tree;

import java.util.List;

public interface TreeService {

    List<Power> queryPowerTree(Integer id);

    List<Tree> queryTreeByUser(Integer userId);
}
