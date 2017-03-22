import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;


import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.Protocol;
import redis.clients.jedis.exceptions.JedisConnectionException;
import redis.clients.jedis.exceptions.JedisDataException;
//import redis.clients.jedis.tests.commands.JedisCommandTestBase;
import redis.clients.util.SafeEncoder;

public class JeTest{
 public static void main(String[] args) {  
    Jedis jedis = new Jedis("172.16.0.8",6379);  
    //jedis.set("foo", "bar");  
    String value = jedis.lpop("ips");  
    System.out.println(value);  
 }
} 

