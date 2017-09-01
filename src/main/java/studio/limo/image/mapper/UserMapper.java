package studio.limo.image.mapper;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import studio.limo.image.entity.User;

@Repository
@Transactional
public interface UserMapper {
    User getUserById(int id);
}
