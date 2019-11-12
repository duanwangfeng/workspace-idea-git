package com.jk.role.service;

import com.jk.role.mapper.RoleMapper;
import com.jk.role.model.PowerInfo;
import com.jk.role.model.Role;
import com.jk.tree.model.RolePower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @ClassName RoleServiceImpl
 * @Description: TODO
 * @Author duanwf
 * @Date 2019/11/4 19:08
 * @Version V1.0
 **/
@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> queryRole() {
        return roleMapper.queryRole();
    }

    @Override
    public void saveRolePower(Integer roleId, Integer[] powerIds) {
        //删除此角色原有的权限管理数据  删除 t_role_power 数据
        roleMapper.delRolePowerByRoleId(roleId);
        //再讲当前传过来的power数据进行新增 中间表

        List<RolePower> rpList = new ArrayList<RolePower>();
        for (Integer powerId : powerIds) {
            RolePower rp = new RolePower();
            rp.setRpid(UUID.randomUUID().toString().replace("-", ""));
            rp.setRoleId(roleId);
            rp.setPowerId(powerId);
            rpList.add(rp);
        }
        roleMapper.addRolePower(rpList);
    }

    @Override
    public List<PowerInfo> queryPowerInfo(Integer powerId) {

        return roleMapper.queryPowerInfo(powerId);
    }
}
