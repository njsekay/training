package jp.co.training.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;
import org.springframework.transaction.annotation.Transactional;

import jp.co.training.config.MainConfig;
import jp.co.training.entity.User;

/**
 */
@ConfigAutowireable
@Dao(config = MainConfig.class)
public interface UserDao {

	/**
	 * @param id
	 * @return the UserMaster entity
	 */
	@Select
	User selectById(Integer id);

	/**
	 * @return the UserMaster entity
	 */
	@Select
	List<User> selectAll();

	/**
	 * @param entity
	 * @return affected rows
	 */
	@Insert(excludeNull = true)
	@Transactional
	int insert(User entity);

	/**
	 * @param entity
	 * @return affected rows
	 */
	@Update(excludeNull = true)
	@Transactional
	int update(User entity);

	/**
	 * @param entity
	 * @return affected rows
	 */
	@Delete
	@Transactional
	int delete(User entity);
}