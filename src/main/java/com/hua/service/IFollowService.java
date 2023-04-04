package com.hua.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hua.dto.Result;
import com.hua.entity.Follow;

public interface IFollowService extends IService<Follow> {
    Result follow(Long followUserId, Boolean isFollow);

    Result isFollow(Long followUserId);

    Result followCommons(Long id);
}
