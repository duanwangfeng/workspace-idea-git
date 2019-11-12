package com.jk.tree.controller;

import com.jk.tree.model.Power;
import com.jk.tree.model.Tree;
import com.jk.tree.service.TreeService;
import com.jk.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("tree")
public class TreeController {

        @Autowired
        private TreeService treeService;

        @RequestMapping("queryTreeByUser")
        @ResponseBody
        public List<Tree> queryTreeByUser(HttpServletRequest request){
                User user = (User) request.getSession().getAttribute("user");

                return treeService.queryTreeByUser(user.getUserId());
        }

        @RequestMapping("queryPowerTree")
        @ResponseBody
        public List<Power> queryPowerTree(Integer id){

            return treeService.queryPowerTree(id);
        }

}
