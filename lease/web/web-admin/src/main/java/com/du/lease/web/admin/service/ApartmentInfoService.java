package com.du.lease.web.admin.service;

import com.du.lease.model.entity.ApartmentInfo;
import com.du.lease.web.admin.vo.apartment.ApartmentDetailVo;
import com.du.lease.web.admin.vo.apartment.ApartmentItemVo;
import com.du.lease.web.admin.vo.apartment.ApartmentQueryVo;
import com.du.lease.web.admin.vo.apartment.ApartmentSubmitVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author weicheng
* @description 针对表【apartment_info(公寓信息表)】的数据库操作Service

*/
public interface ApartmentInfoService extends IService<ApartmentInfo> {

}
