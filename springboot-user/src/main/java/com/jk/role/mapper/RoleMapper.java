package com.jk.role.mapper;

import com.jk.role.model.PowerInfo;
import com.jk.role.model.Role;
import com.jk.tree.model.RolePower;

import java.util.List;

/**
 * @ClassName RoleMapper
 * @Description: TODO
 * @Author duanwf
 * @Date 2019/11/4 19:08
 * @Version V1.0
 **/
public interface RoleMapper {
    List<Role> queryRole();

    void delRolePowerByRoleId(Integer roleId);

    void addRolePower(List<RolePower> rpList);

    List<PowerInfo> queryPowerInfo(Integer powerId);
}
