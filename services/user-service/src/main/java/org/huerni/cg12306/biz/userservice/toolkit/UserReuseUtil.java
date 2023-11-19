package org.huerni.cg12306.biz.userservice.toolkit;

import static org.huerni.cg12306.biz.userservice.common.constant.cg12306Constant.USER_REGISTER_REUSE_SHARDING_COUNT;

public final class UserReuseUtil {

    /**
     * 计算分片位置
     */
    public static int hashShardingIdx(String username) {
        return Math.abs(username.hashCode() % USER_REGISTER_REUSE_SHARDING_COUNT);
    }
}