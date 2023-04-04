package com.hua.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.hua.dto.Result;
import com.hua.entity.VoucherOrder;

public interface IVoucherOrderService extends IService<VoucherOrder> {
    Result seckillVoucher(Long voucherId);

    void createVoucherOrder(VoucherOrder voucherOrder);
}
