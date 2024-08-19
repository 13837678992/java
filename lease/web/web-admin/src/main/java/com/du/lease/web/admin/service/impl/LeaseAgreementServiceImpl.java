package com.du.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.du.lease.model.entity.LeaseAgreement;
import com.du.lease.web.admin.mapper.LeaseAgreementMapper;
import com.du.lease.web.admin.service.LeaseAgreementService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.du.lease.web.admin.vo.agreement.AgreementQueryVo;
import com.du.lease.web.admin.vo.agreement.AgreementVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author weicheng
 * @description 针对表【lease_agreement(租约信息表)】的数据库操作Service实现
 
 */
@Service
public class LeaseAgreementServiceImpl extends ServiceImpl<LeaseAgreementMapper, LeaseAgreement>
        implements LeaseAgreementService {
    @Autowired
    private LeaseAgreementMapper leaseAgreementMapper;

    @Override
    public IPage<AgreementVo> pageAgreement(Page<AgreementVo> agreementVoPage, AgreementQueryVo queryVo) {
        return leaseAgreementMapper.pageAgreement(agreementVoPage,queryVo);
    }
}




