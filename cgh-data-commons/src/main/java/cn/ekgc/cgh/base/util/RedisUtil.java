package cn.ekgc.cgh.base.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * <b>Redis 操作工具类</b>
 * @author Arthur
 * @version 1.0.0
 * @since 1.0.0
 */
@Component("redisUtil")
public class RedisUtil {
	@Autowired
	private StringRedisTemplate redisTemplate;

	/**
	 * <b>根据 key 将对应的 value 存储到 Redis 中</b>
	 * @param key
	 * @param value
	 * @return
	 * @throws Exception
	 */
	public boolean saveToRedis(String key, Object value) throws Exception {
		// 将 Object 类型的 value 变为 String 类型的 JSON
		String valueJSON = JsonUtil.parseToJSON(value);
		// 根据 key 将变换后的 value 存储到 Redis 中
		redisTemplate.opsForValue().set(key, valueJSON);
		// 为存入的信息设定过期时间
		redisTemplate.expire(key, BaseConstantUtil.EXPIRE_MINUTE, TimeUnit.MINUTES);

		return true;
	}

	/**
	 * <b>根据 key 从 Redis 中获取数据对象</b>
	 * @param key
	 * @param argClass
	 * @return
	 * @throws Exception
	 */
	public Object getFromRedis(String key, Class argClass) throws Exception {
		// 根据 key 获得存储在 Redis 中 JSON
		String valueJSON = redisTemplate.opsForValue().get(key);
		// 判断所获取的值是否存在
		if (valueJSON != null) {
			// 根据 key 获得了存储在 Redis 中的值，那么将该 JSON 变为对象
			return JsonUtil.parseToObject(valueJSON, argClass);
		}
		return null;
	}
}
