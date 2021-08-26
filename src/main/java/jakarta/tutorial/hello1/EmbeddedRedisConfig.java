package jakarta.tutorial.hello1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.session.SaveMode;
import org.springframework.session.data.redis.config.annotation.web.http.RedisHttpSessionConfiguration;

@Configuration
public class EmbeddedRedisConfig {

	@Bean
	public RedisHttpSessionConfiguration redisHttpSessionConfigurationFactory() {
		RedisHttpSessionConfiguration redisHttpSessionConfiguration = new RedisHttpSessionConfiguration();
		GenericJackson2JsonRedisSerializer serializer = new GenericJackson2JsonRedisSerializer();
		redisHttpSessionConfiguration.setDefaultRedisSerializer(serializer);
		redisHttpSessionConfiguration.setSaveMode(SaveMode.ALWAYS);
		return redisHttpSessionConfiguration;
	}

}
//
//@EnableRedisHttpSession 
//public class Config {
//
//	@Bean
//	public LettuceConnectionFactory connectionFactory() {
//		return new LettuceConnectionFactory(); 
//	}
//
//}

//@EnableSpringHttpSession
//@Configuration
//public class EmbeddedRedisConfig {
//
//	@Bean
//	public RedisHttpSessionConfiguration redisHttpSessionConfigurationFactory() {
//		RedisHttpSessionConfiguration redisHttpSessionConfiguration = new RedisHttpSessionConfiguration();
//		GenericJackson2JsonRedisSerializer serializer = new GenericJackson2JsonRedisSerializer();
//		redisHttpSessionConfiguration.setDefaultRedisSerializer(serializer);
//		redisHttpSessionConfiguration.setSaveMode(SaveMode.ALWAYS);
//		return redisHttpSessionConfiguration;
//	}
//
//	@Bean
//	public MapSessionRepository sessionRepository() {
//		return new MapSessionRepository(new ConcurrentHashMap<>());
//	}
//
//}
