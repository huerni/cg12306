

package org.huerni.cg12306.biz.userservice.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.huerni.cg12306.framework.starter.database.base.BaseDO;

/**
 * 用户名复用表实体
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_user_reuse")
public final class UserReuseDO extends BaseDO {

    /**
     * 用户名
     */
    private String username;
}
