package com.du.lease.web.admin.mapper;

import com.du.lease.model.entity.AttrKey;
import com.du.lease.web.admin.vo.attr.AttrKeyVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author weicheng
* @description 针对表【attr_key(房间基本属性表)】的数据库操作Mapper

* @Entity com.du.lease.model.AttrKey
*/
public interface AttrKeyMapper extends BaseMapper<AttrKey> {

    List<AttrKeyVo> listAttrInfo();
}




